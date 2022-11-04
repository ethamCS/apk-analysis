package org.odk.collect.android.tasks;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.services.transport.payload.ByteArrayPayload;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormSavedListener;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.utilities.EncryptionUtils;
/* loaded from: classes.dex */
public class SaveToDiskTask extends AsyncTask<Void, String, Integer> {
    public static final int SAVED = 500;
    public static final int SAVED_AND_EXIT = 504;
    public static final int SAVE_ERROR = 501;
    public static final int VALIDATED = 503;
    public static final int VALIDATE_ERROR = 502;
    private static final String t = "SaveToDiskTask";
    private String mInstanceName;
    private Boolean mMarkCompleted;
    private Boolean mSave;
    private FormSavedListener mSavedListener;
    private Uri mUri;

    public SaveToDiskTask(Uri uri, Boolean saveAndExit, Boolean markCompleted, String updatedName) {
        this.mUri = uri;
        this.mSave = saveAndExit;
        this.mMarkCompleted = markCompleted;
        this.mInstanceName = updatedName;
    }

    public Integer doInBackground(Void... nothing) {
        FormController formController = Collect.getInstance().getFormController();
        int validateStatus = formController.validateAnswers(this.mMarkCompleted);
        if (validateStatus != 0) {
            return Integer.valueOf(validateStatus);
        }
        if (this.mMarkCompleted.booleanValue()) {
            formController.postProcessInstance();
        }
        Collect.getInstance().getActivityLogger().logInstanceAction(this, "save", Boolean.toString(this.mMarkCompleted.booleanValue()));
        boolean saveOutcome = exportData(this.mMarkCompleted.booleanValue());
        File shadowInstance = savepointFile(formController.getInstancePath());
        if (shadowInstance.exists()) {
            shadowInstance.delete();
        }
        if (!saveOutcome) {
            return 501;
        }
        return Integer.valueOf(this.mSave.booleanValue() ? 504 : 500);
    }

    private void updateInstanceDatabase(boolean incomplete, boolean canEditAfterCompleted) {
        FormController formController = Collect.getInstance().getFormController();
        ContentValues values = new ContentValues();
        if (this.mInstanceName != null) {
            values.put("displayName", this.mInstanceName);
        }
        if (incomplete || !this.mMarkCompleted.booleanValue()) {
            values.put(InstanceProviderAPI.InstanceColumns.STATUS, InstanceProviderAPI.STATUS_INCOMPLETE);
        } else {
            values.put(InstanceProviderAPI.InstanceColumns.STATUS, InstanceProviderAPI.STATUS_COMPLETE);
        }
        values.put(InstanceProviderAPI.InstanceColumns.CAN_EDIT_WHEN_COMPLETE, Boolean.toString(canEditAfterCompleted));
        if (Collect.getInstance().getContentResolver().getType(this.mUri) == InstanceProviderAPI.InstanceColumns.CONTENT_ITEM_TYPE) {
            int updated = Collect.getInstance().getContentResolver().update(this.mUri, values, null, null);
            if (updated > 1) {
                Log.w(t, "Updated more than one entry, that's not good: " + this.mUri.toString());
            } else if (updated == 1) {
                Log.i(t, "Instance successfully updated");
            } else {
                Log.e(t, "Instance doesn't exist but we have its Uri!! " + this.mUri.toString());
            }
        } else if (Collect.getInstance().getContentResolver().getType(this.mUri) == FormsProviderAPI.FormsColumns.CONTENT_ITEM_TYPE) {
            String instancePath = formController.getInstancePath().getAbsolutePath();
            String[] whereArgs = {instancePath};
            int updated2 = Collect.getInstance().getContentResolver().update(InstanceProviderAPI.InstanceColumns.CONTENT_URI, values, "instanceFilePath=?", whereArgs);
            if (updated2 > 1) {
                Log.w(t, "Updated more than one entry, that's not good: " + instancePath);
            } else if (updated2 == 1) {
                Log.i(t, "Instance found and successfully updated: " + instancePath);
            } else {
                Log.i(t, "No instance found, creating");
                Cursor c = null;
                try {
                    c = Collect.getInstance().getContentResolver().query(this.mUri, null, null, null, null);
                    c.moveToFirst();
                    String jrformid = c.getString(c.getColumnIndex("jrFormId"));
                    String jrversion = c.getString(c.getColumnIndex("jrVersion"));
                    String formname = c.getString(c.getColumnIndex("displayName"));
                    String submissionUri = null;
                    if (!c.isNull(c.getColumnIndex("submissionUri"))) {
                        submissionUri = c.getString(c.getColumnIndex("submissionUri"));
                    }
                    values.put(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH, instancePath);
                    values.put("submissionUri", submissionUri);
                    if (this.mInstanceName != null) {
                        values.put("displayName", this.mInstanceName);
                    } else {
                        values.put("displayName", formname);
                    }
                    values.put("jrFormId", jrformid);
                    values.put("jrVersion", jrversion);
                    this.mUri = Collect.getInstance().getContentResolver().insert(InstanceProviderAPI.InstanceColumns.CONTENT_URI, values);
                } finally {
                    if (c != null) {
                        c.close();
                    }
                }
            }
        }
    }

    public static File savepointFile(File instancePath) {
        File tempDir = new File(Collect.CACHE_PATH);
        File temp = new File(tempDir, instancePath.getName() + ".save");
        return temp;
    }

    public static String blockingExportTempData() {
        String str = null;
        FormController formController = Collect.getInstance().getFormController();
        long start = System.currentTimeMillis();
        File temp = savepointFile(formController.getInstancePath());
        try {
            ByteArrayPayload payload = formController.getFilledInFormXml();
            if (exportXmlFile(payload, temp.getAbsolutePath())) {
                str = temp.getAbsolutePath();
            }
        } catch (IOException e) {
            Log.e(t, "Error creating serialized payload");
            e.printStackTrace();
        } finally {
            long end = System.currentTimeMillis();
            Log.i(t, "Savepoint ms: " + Long.toString(end - start));
        }
        return str;
    }

    private boolean exportData(boolean markCompleted) {
        FormController formController = Collect.getInstance().getFormController();
        try {
            ByteArrayPayload payload = formController.getFilledInFormXml();
            String instancePath = formController.getInstancePath().getAbsolutePath();
            exportXmlFile(payload, instancePath);
            updateInstanceDatabase(true, true);
            if (markCompleted) {
                boolean canEditAfterCompleted = formController.isSubmissionEntireForm();
                boolean isEncrypted = false;
                try {
                    ByteArrayPayload payload2 = formController.getSubmissionXml();
                    File instanceXml = formController.getInstancePath();
                    File submissionXml = new File(instanceXml.getParentFile(), "submission.xml");
                    exportXmlFile(payload2, submissionXml.getAbsolutePath());
                    EncryptionUtils.EncryptedFormInformation formInfo = EncryptionUtils.getEncryptedFormInformation(this.mUri, formController.getSubmissionMetadata());
                    if (formInfo != null) {
                        canEditAfterCompleted = false;
                        if (!EncryptionUtils.generateEncryptedSubmission(instanceXml, submissionXml, formInfo)) {
                            return false;
                        }
                        isEncrypted = true;
                    }
                    updateInstanceDatabase(false, canEditAfterCompleted);
                    if (!canEditAfterCompleted) {
                        if (!instanceXml.delete()) {
                            Log.e(t, "Error deleting " + instanceXml.getAbsolutePath() + " prior to renaming submission.xml");
                            return true;
                        } else if (!submissionXml.renameTo(instanceXml)) {
                            Log.e(t, "Error renaming submission.xml to " + instanceXml.getAbsolutePath());
                            return true;
                        }
                    } else if (!submissionXml.delete()) {
                        Log.w(t, "Error deleting " + submissionXml.getAbsolutePath() + " (instance is re-openable)");
                    }
                    if (isEncrypted && !EncryptionUtils.deletePlaintextFiles(instanceXml)) {
                        Log.e(t, "Error deleting plaintext files for " + instanceXml.getAbsolutePath());
                    }
                } catch (IOException e) {
                    Log.e(t, "Error creating serialized payload");
                    e.printStackTrace();
                    return false;
                }
            }
            return true;
        } catch (IOException e2) {
            Log.e(t, "Error creating serialized payload");
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean exportXmlFile(ByteArrayPayload payload, String path) {
        InputStream is = payload.getPayloadStream();
        int len = (int) payload.getLength();
        byte[] data = new byte[len];
        try {
            int read = is.read(data, 0, len);
            if (read <= 0) {
                return false;
            }
            try {
                FileWriter fw = new FileWriter(path);
                fw.write(new String(data, "UTF-8"));
                fw.flush();
                fw.close();
                return true;
            } catch (IOException e) {
                Log.e(t, "Error writing XML file");
                e.printStackTrace();
                return false;
            }
        } catch (IOException e2) {
            Log.e(t, "Error reading from payload data stream");
            e2.printStackTrace();
            return false;
        }
    }

    public void onPostExecute(Integer result) {
        synchronized (this) {
            if (this.mSavedListener != null) {
                this.mSavedListener.savingComplete(result.intValue());
            }
        }
    }

    public void setFormSavedListener(FormSavedListener fsl) {
        synchronized (this) {
            this.mSavedListener = fsl;
        }
    }
}
