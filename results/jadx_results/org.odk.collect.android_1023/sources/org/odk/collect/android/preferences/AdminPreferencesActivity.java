package org.odk.collect.android.preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class AdminPreferencesActivity extends PreferenceActivity {
    public static String ADMIN_PREFERENCES = "admin_prefs";
    public static String KEY_ADMIN_PW = "admin_pw";
    public static String KEY_EDIT_SAVED = "edit_saved";
    public static String KEY_SEND_FINALIZED = "send_finalized";
    public static String KEY_GET_BLANK = "get_blank";
    public static String KEY_DELETE_SAVED = "delete_saved";
    public static String KEY_CHANGE_SERVER = "change_server";
    public static String KEY_CHANGE_USERNAME = "change_username";
    public static String KEY_CHANGE_PASSWORD = "change_password";
    public static String KEY_CHANGE_GOOGLE_ACCOUNT = "change_google_account";
    public static String KEY_CHANGE_FONT_SIZE = "change_font_size";
    public static String KEY_DEFAULT_TO_FINALIZED = "default_to_finalized";
    public static String KEY_SHOW_SPLASH_SCREEN = "show_splash_screen";
    public static String KEY_SELECT_SPLASH_SCREEN = "select_splash_screen";
    public static String KEY_SAVE_MID = "save_mid";
    public static String KEY_JUMP_TO = "jump_to";
    public static String KEY_CHANGE_LANGUAGE = "change_language";
    public static String KEY_ACCESS_SETTINGS = "access_settings";
    public static String KEY_SAVE_AS = "save_as";
    public static String KEY_MARK_AS_FINALIZED = "mark_as_finalized";

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.admin_preferences));
        PreferenceManager prefMgr = getPreferenceManager();
        prefMgr.setSharedPreferencesName(ADMIN_PREFERENCES);
        prefMgr.setSharedPreferencesMode(1);
        addPreferencesFromResource(R.xml.admin_preferences);
    }
}
