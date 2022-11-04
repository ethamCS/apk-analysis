package org.odk.collect.android.tasks;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.james.mime4j.util.CharsetUtil;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.DiskSyncListener;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.utilities.FileUtils;
/* loaded from: classes.dex */
public class DiskSyncTask extends AsyncTask<Void, String, String> {
    private static int counter = 0;
    private static final String t = "DiskSyncTask";
    int instance;
    DiskSyncListener mListener;
    String statusMessage;

    /* loaded from: classes.dex */
    public static class UriFile {
        public final File file;
        public final Uri uri;

        UriFile(Uri uri, File file) {
            this.uri = uri;
            this.file = file;
        }
    }

    public String doInBackground(Void... params) {
        String str;
        int i = counter + 1;
        counter = i;
        this.instance = i;
        Log.i(t, "[" + this.instance + "] doInBackground begins!");
        try {
            StringBuffer errors = new StringBuffer();
            File formDir = new File(Collect.FORMS_PATH);
            if (formDir.exists() && formDir.isDirectory()) {
                List<File> xFormsToAdd = new LinkedList<>();
                File[] formDefs = formDir.listFiles();
                for (File addMe : formDefs) {
                    if (!addMe.getName().startsWith(".") && (addMe.getName().endsWith(".xml") || addMe.getName().endsWith(".xhtml"))) {
                        xFormsToAdd.add(addMe);
                    } else {
                        Log.i(t, "[" + this.instance + "] Ignoring: " + addMe.getAbsolutePath());
                    }
                }
                List<UriFile> uriToUpdate = new ArrayList<>();
                Cursor mCursor = Collect.getInstance().getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, null, null, null, null);
                if (mCursor == null) {
                    Log.e(t, "[" + this.instance + "] Forms Content Provider returned NULL");
                    errors.append("Internal Error: Unable to access Forms content provider").append(CharsetUtil.CRLF);
                    str = errors.toString();
                    if (mCursor != null) {
                        mCursor.close();
                    }
                    return str;
                }
                mCursor.moveToPosition(-1);
                while (mCursor.moveToNext()) {
                    String sqlFilename = mCursor.getString(mCursor.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                    String md5 = mCursor.getString(mCursor.getColumnIndex(FormsProviderAPI.FormsColumns.MD5_HASH));
                    File sqlFile = new File(sqlFilename);
                    if (sqlFile.exists()) {
                        xFormsToAdd.remove(sqlFile);
                        if (!FileUtils.getMd5Hash(sqlFile).contentEquals(md5)) {
                            String id = mCursor.getString(mCursor.getColumnIndex("_id"));
                            Uri updateUri = Uri.withAppendedPath(FormsProviderAPI.FormsColumns.CONTENT_URI, id);
                            uriToUpdate.add(new UriFile(updateUri, sqlFile));
                        }
                    } else {
                        Log.w(t, "[" + this.instance + "] file referenced by content provider does not exist " + sqlFile);
                    }
                }
                if (mCursor != null) {
                    mCursor.close();
                }
                Collections.shuffle(uriToUpdate);
                for (UriFile entry : uriToUpdate) {
                    Uri updateUri2 = entry.uri;
                    File formDefFile = entry.file;
                    try {
                        ContentValues values = buildContentValues(formDefFile);
                        int count = Collect.getInstance().getContentResolver().update(updateUri2, values, null, null);
                        Log.i(t, "[" + this.instance + "] " + count + " records successfully updated");
                    } catch (IllegalArgumentException e) {
                        errors.append(e.getMessage()).append(CharsetUtil.CRLF);
                        File badFile = new File(formDefFile.getParentFile(), formDefFile.getName() + ".bad");
                        badFile.delete();
                        formDefFile.renameTo(badFile);
                    }
                }
                uriToUpdate.clear();
                Collections.shuffle(xFormsToAdd);
                while (!xFormsToAdd.isEmpty()) {
                    File formDefFile2 = xFormsToAdd.remove(0);
                    if (isAlreadyDefined(formDefFile2)) {
                        Log.i(t, "[" + this.instance + "] skipping -- definition already recorded: " + formDefFile2.getAbsolutePath());
                    } else {
                        try {
                            ContentValues values2 = buildContentValues(formDefFile2);
                            try {
                                Collect.getInstance().getContentResolver().insert(FormsProviderAPI.FormsColumns.CONTENT_URI, values2);
                            } catch (SQLException e2) {
                                Log.i(t, "[" + this.instance + "] " + e2.toString());
                            }
                        } catch (IllegalArgumentException e3) {
                            errors.append(e3.getMessage()).append(CharsetUtil.CRLF);
                            File badFile2 = new File(formDefFile2.getParentFile(), formDefFile2.getName() + ".bad");
                            badFile2.delete();
                            formDefFile2.renameTo(badFile2);
                        }
                    }
                }
            }
            if (errors.length() != 0) {
                this.statusMessage = errors.toString();
            } else {
                this.statusMessage = Collect.getInstance().getString(R.string.finished_disk_scan);
            }
            str = this.statusMessage;
            return str;
        } finally {
            Log.i(t, "[" + this.instance + "] doInBackground ends!");
        }
    }

    private boolean isAlreadyDefined(File formDefFile) {
        String[] projection = {"_id", FormsProviderAPI.FormsColumns.FORM_FILE_PATH};
        String[] selectionArgs = {formDefFile.getAbsolutePath()};
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, projection, "formFilePath=?", selectionArgs, null);
            return c.getCount() > 0;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public ContentValues buildContentValues(File formDefFile) throws IllegalArgumentException {
        ContentValues updateValues = new ContentValues();
        try {
            HashMap<String, String> fields = FileUtils.parseXML(formDefFile);
            String title = fields.get(FileUtils.TITLE);
            String version = fields.get("version");
            String formid = fields.get(FileUtils.FORMID);
            String submission = fields.get(FileUtils.SUBMISSIONURI);
            String base64RsaPublicKey = fields.get("base64RsaPublicKey");
            Long now = Long.valueOf(System.currentTimeMillis());
            updateValues.put("date", now);
            if (title != null) {
                updateValues.put("displayName", title);
                if (formid != null) {
                    updateValues.put("jrFormId", formid);
                    if (version != null) {
                        updateValues.put("jrVersion", version);
                    }
                    if (submission != null) {
                        updateValues.put("submissionUri", submission);
                    }
                    if (base64RsaPublicKey != null) {
                        updateValues.put("base64RsaPublicKey", base64RsaPublicKey);
                    }
                    updateValues.put(FormsProviderAPI.FormsColumns.FORM_FILE_PATH, formDefFile.getAbsolutePath());
                    return updateValues;
                }
                throw new IllegalArgumentException(Collect.getInstance().getString(R.string.xform_parse_error, new Object[]{formDefFile.getName(), "id"}));
            }
            throw new IllegalArgumentException(Collect.getInstance().getString(R.string.xform_parse_error, new Object[]{formDefFile.getName(), FileUtils.TITLE}));
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(formDefFile.getName() + " :: " + e.toString());
        }
    }

    public void setDiskSyncListener(DiskSyncListener l) {
        this.mListener = l;
    }

    public void onPostExecute(String result) {
        super.onPostExecute((DiskSyncTask) result);
        if (this.mListener != null) {
            this.mListener.SyncComplete(result);
        }
    }
}
