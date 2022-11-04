package org.odk.collect.android.tasks;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.services.PrototypeManager;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.form.api.FormEntryController;
import org.javarosa.model.xform.XFormsModule;
import org.javarosa.xform.parse.XFormParser;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormLoaderListener;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.utilities.FileUtils;
/* loaded from: classes.dex */
public class FormLoaderTask extends AsyncTask<String, String, FECWrapper> {
    public static final String[] SERIALIABLE_CLASSES = {"org.javarosa.core.services.locale.ResourceFileDataSource", "org.javarosa.core.services.locale.TableLocaleSource", "org.javarosa.core.model.FormDef", "org.javarosa.core.model.SubmissionProfile", "org.javarosa.core.model.QuestionDef", "org.javarosa.core.model.GroupDef", "org.javarosa.core.model.instance.FormInstance", "org.javarosa.core.model.data.BooleanData", "org.javarosa.core.model.data.DateData", "org.javarosa.core.model.data.DateTimeData", "org.javarosa.core.model.data.DecimalData", "org.javarosa.core.model.data.GeoPointData", "org.javarosa.core.model.data.IntegerData", "org.javarosa.core.model.data.LongData", "org.javarosa.core.model.data.MultiPointerAnswerData", "org.javarosa.core.model.data.PointerAnswerData", "org.javarosa.core.model.data.SelectMultiData", "org.javarosa.core.model.data.SelectOneData", "org.javarosa.core.model.data.StringData", "org.javarosa.core.model.data.TimeData", "org.javarosa.core.model.data.UncastData", "org.javarosa.core.model.data.helper.BasicDataPointer"};
    private static final String t = "FormLoaderTask";
    FECWrapper data;
    private String mErrorMsg;
    private final String mInstancePath;
    private FormLoaderListener mStateListener;
    private final String mWaitingXPath;
    private final String mXPath;
    private boolean pendingActivityResult = false;
    private int requestCode = 0;
    private int resultCode = 0;
    private Intent intent = null;

    /* loaded from: classes.dex */
    public class FECWrapper {
        FormController controller;
        boolean usedSavepoint;

        protected FECWrapper(FormController controller, boolean usedSavepoint) {
            FormLoaderTask.this = r1;
            this.controller = controller;
            this.usedSavepoint = usedSavepoint;
        }

        protected FormController getController() {
            return this.controller;
        }

        protected boolean hasUsedSavepoint() {
            return this.usedSavepoint;
        }

        protected void free() {
            this.controller = null;
        }
    }

    public FormLoaderTask(String instancePath, String XPath, String waitingXPath) {
        this.mInstancePath = instancePath;
        this.mXPath = XPath;
        this.mWaitingXPath = waitingXPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.odk.collect.android.tasks.FormLoaderTask.FECWrapper doInBackground(java.lang.String... r26) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.tasks.FormLoaderTask.doInBackground(java.lang.String[]):org.odk.collect.android.tasks.FormLoaderTask$FECWrapper");
    }

    public boolean importData(File instanceFile, FormEntryController fec) {
        byte[] fileBytes = FileUtils.getFileAsBytes(instanceFile);
        TreeElement savedRoot = XFormParser.restoreDataModel(fileBytes, (Class) null).getRoot();
        TreeElement templateRoot = fec.getModel().getForm().getInstance().getRoot().deepCopy(true);
        if (!savedRoot.getName().equals(templateRoot.getName()) || savedRoot.getMult() != 0) {
            Log.e(t, "Saved form instance does not match template form definition");
            return false;
        }
        TreeReference tr = TreeReference.rootRef();
        tr.add(templateRoot.getName(), -1);
        templateRoot.populate(savedRoot, fec.getModel().getForm());
        fec.getModel().getForm().getInstance().setRoot(templateRoot);
        if (fec.getModel().getLanguages() == null) {
            return true;
        }
        fec.getModel().getForm().localeChanged(fec.getModel().getLanguage(), fec.getModel().getForm().getLocalizer());
        return true;
    }

    public FormDef deserializeFormDef(File formDef) {
        Exception e;
        DeserializationException e2;
        IOException e3;
        FileNotFoundException e4;
        FileInputStream fis;
        PrototypeManager.registerPrototypes(SERIALIABLE_CLASSES);
        new XFormsModule().registerModule();
        try {
            FormDef fd = new FormDef();
            try {
                fis = new FileInputStream(formDef);
            } catch (FileNotFoundException e5) {
                e4 = e5;
            } catch (IOException e6) {
                e3 = e6;
            } catch (DeserializationException e7) {
                e2 = e7;
            } catch (Exception e8) {
                e = e8;
            }
            try {
                DataInputStream dis = new DataInputStream(fis);
                fd.readExternal(dis, ExtUtil.defaultPrototypes());
                dis.close();
                return fd;
            } catch (FileNotFoundException e9) {
                e4 = e9;
                e4.printStackTrace();
                return null;
            } catch (IOException e10) {
                e3 = e10;
                e3.printStackTrace();
                return null;
            } catch (DeserializationException e11) {
                e2 = e11;
                e2.printStackTrace();
                return null;
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
                return null;
            }
        } catch (FileNotFoundException e13) {
            e4 = e13;
        } catch (IOException e14) {
            e3 = e14;
        } catch (DeserializationException e15) {
            e2 = e15;
        } catch (Exception e16) {
            e = e16;
        }
    }

    public void serializeFormDef(FormDef fd, String filepath) {
        String hash = FileUtils.getMd5Hash(new File(filepath));
        File formDef = new File(Collect.CACHE_PATH + File.separator + hash + ".formdef");
        if (!formDef.exists()) {
            try {
                FileOutputStream fos = new FileOutputStream(formDef);
                DataOutputStream dos = new DataOutputStream(fos);
                fd.writeExternal(dos);
                dos.flush();
                dos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onPostExecute(FECWrapper wrapper) {
        synchronized (this) {
            if (this.mStateListener != null) {
                if (wrapper == null) {
                    this.mStateListener.loadingError(this.mErrorMsg);
                } else {
                    this.mStateListener.loadingComplete(this);
                }
            }
        }
    }

    public void setFormLoaderListener(FormLoaderListener sl) {
        synchronized (this) {
            this.mStateListener = sl;
        }
    }

    public FormController getFormController() {
        if (this.data != null) {
            return this.data.getController();
        }
        return null;
    }

    public boolean hasUsedSavepoint() {
        if (this.data != null) {
            return this.data.hasUsedSavepoint();
        }
        return false;
    }

    public void destroy() {
        if (this.data != null) {
            this.data.free();
            this.data = null;
        }
    }

    public boolean hasPendingActivityResult() {
        return this.pendingActivityResult;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public Intent getIntent() {
        return this.intent;
    }

    public void setActivityResult(int requestCode, int resultCode, Intent intent) {
        this.pendingActivityResult = true;
        this.requestCode = requestCode;
        this.resultCode = resultCode;
        this.intent = intent;
    }
}
