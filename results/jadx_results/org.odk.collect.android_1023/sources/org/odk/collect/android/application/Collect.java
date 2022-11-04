package org.odk.collect.android.application;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.File;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.FormEntryActivity;
import org.odk.collect.android.database.ActivityLogger;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.utilities.AgingCredentialsProvider;
import org.opendatakit.httpclientandroidlib.client.CookieStore;
import org.opendatakit.httpclientandroidlib.client.CredentialsProvider;
import org.opendatakit.httpclientandroidlib.client.protocol.ClientContext;
import org.opendatakit.httpclientandroidlib.impl.client.BasicCookieStore;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public class Collect extends Application {
    public static final String DEFAULT_FONTSIZE = "21";
    private ActivityLogger mActivityLogger;
    public static final String ODK_ROOT = Environment.getExternalStorageDirectory() + File.separator + "odk";
    public static final String FORMS_PATH = ODK_ROOT + File.separator + "forms";
    public static final String INSTANCES_PATH = ODK_ROOT + File.separator + FormEntryActivity.KEY_INSTANCES;
    public static final String CACHE_PATH = ODK_ROOT + File.separator + ".cache";
    public static final String METADATA_PATH = ODK_ROOT + File.separator + "metadata";
    public static final String TMPFILE_PATH = CACHE_PATH + File.separator + "tmp.jpg";
    public static final String TMPDRAWFILE_PATH = CACHE_PATH + File.separator + "tmpDraw.jpg";
    public static final String TMPXML_PATH = CACHE_PATH + File.separator + "tmp.xml";
    public static final String LOG_PATH = ODK_ROOT + File.separator + "log";
    private static Collect singleton = null;
    private CookieStore cookieStore = new BasicCookieStore();
    private CredentialsProvider credsProvider = new AgingCredentialsProvider(420000);
    private FormController mFormController = null;

    public static Collect getInstance() {
        return singleton;
    }

    public ActivityLogger getActivityLogger() {
        return this.mActivityLogger;
    }

    public FormController getFormController() {
        return this.mFormController;
    }

    public void setFormController(FormController controller) {
        this.mFormController = controller;
    }

    public static int getQuestionFontsize() {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getInstance());
        String question_font = settings.getString(PreferencesActivity.KEY_FONT_SIZE, DEFAULT_FONTSIZE);
        int questionFontsize = Integer.valueOf(question_font).intValue();
        return questionFontsize;
    }

    public String getVersionedAppName() {
        String versionDetail = "";
        try {
            PackageInfo pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            int versionNumber = pinfo.versionCode;
            String versionName = pinfo.versionName;
            versionDetail = XFormAnswerDataSerializer.DELIMITER + versionName + " (" + versionNumber + ")";
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return getString(R.string.app_name) + versionDetail;
    }

    public static void createODKDirs() throws RuntimeException {
        String cardstatus = Environment.getExternalStorageState();
        if (!cardstatus.equals("mounted")) {
            RuntimeException e = new RuntimeException("ODK reports :: SDCard error: " + Environment.getExternalStorageState());
            throw e;
        }
        String[] dirs = {ODK_ROOT, FORMS_PATH, INSTANCES_PATH, CACHE_PATH, METADATA_PATH};
        for (String dirName : dirs) {
            File dir = new File(dirName);
            if (!dir.exists()) {
                if (!dir.mkdirs()) {
                    RuntimeException e2 = new RuntimeException("ODK reports :: Cannot create directory: " + dirName);
                    throw e2;
                }
            } else if (!dir.isDirectory()) {
                RuntimeException e3 = new RuntimeException("ODK reports :: " + dirName + " exists, but is not a directory");
                throw e3;
            }
        }
    }

    public synchronized HttpContext getHttpContext() {
        HttpContext localContext;
        localContext = new BasicHttpContext();
        localContext.setAttribute(ClientContext.COOKIE_STORE, this.cookieStore);
        localContext.setAttribute(ClientContext.CREDS_PROVIDER, this.credsProvider);
        return localContext;
    }

    public CredentialsProvider getCredentialsProvider() {
        return this.credsProvider;
    }

    public CookieStore getCookieStore() {
        return this.cookieStore;
    }

    @Override // android.app.Application
    public void onCreate() {
        singleton = this;
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        super.onCreate();
        PropertyManager mgr = new PropertyManager(this);
        this.mActivityLogger = new ActivityLogger(mgr.getSingularProperty(PropertyManager.DEVICE_ID_PROPERTY));
    }
}
