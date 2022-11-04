package org.odk.collect.android.preferences;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.Toast;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.AccountList;
import org.odk.collect.android.utilities.UrlUtils;
/* loaded from: classes.dex */
public class PreferencesActivity extends PreferenceActivity implements Preference.OnPreferenceChangeListener {
    protected static final int IMAGE_CHOOSER = 0;
    public static final String KEY_ACCOUNT = "account";
    public static final String KEY_AUTH = "auth";
    public static final String KEY_COMPLETED_DEFAULT = "default_completed";
    public static final String KEY_FIRST_RUN = "firstRun";
    public static final String KEY_FONT_SIZE = "font_size";
    public static final String KEY_FORMLIST_URL = "formlist_url";
    public static final String KEY_GOOGLE_SUBMISSION = "google_submission_id";
    public static final String KEY_INFO = "info";
    public static final String KEY_LAST_VERSION = "lastVersion";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PROTOCOL = "protocol";
    public static final String KEY_SELECTED_GOOGLE_ACCOUNT = "selected_google_account";
    public static final String KEY_SERVER_URL = "server_url";
    public static final String KEY_SHOW_SPLASH = "showSplash";
    public static final String KEY_SPLASH_PATH = "splashPath";
    public static final String KEY_SUBMISSION_URL = "submission_url";
    public static final String KEY_USERNAME = "username";
    public static final String PROTOCOL_GOOGLE = "google";
    public static final String PROTOCOL_ODK_DEFAULT = "odk_default";
    public static final String PROTOCOL_OTHER = "";
    public static final String googleServerBaseUrl = "https://gather.apis.google.com/odk/n/";
    private ListPreference mFontSizePreference;
    private EditTextPreference mFormListUrlPreference;
    private EditTextPreference mPasswordPreference;
    private PreferenceScreen mSelectedGoogleAccountPreference;
    private EditTextPreference mServerUrlPreference;
    private PreferenceScreen mSplashPathPreference;
    private EditTextPreference mSubmissionUrlPreference;
    private EditTextPreference mUsernamePreference;

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.general_preferences));
        boolean adminMode = getIntent().getBooleanExtra("adminMode", false);
        SharedPreferences adminPreferences = getSharedPreferences(AdminPreferencesActivity.ADMIN_PREFERENCES, 0);
        boolean serverAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_SERVER, true);
        PreferenceCategory serverCategory = (PreferenceCategory) findPreference(getString(R.string.server_preferences));
        this.mServerUrlPreference = (EditTextPreference) findPreference(KEY_SERVER_URL);
        this.mServerUrlPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.1
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                String url = newValue.toString();
                while (url.endsWith("/")) {
                    url = url.substring(0, url.length() - 1);
                }
                if (UrlUtils.isValidUrl(url)) {
                    preference.setSummary(newValue.toString());
                    return true;
                }
                Toast.makeText(PreferencesActivity.this.getApplicationContext(), (int) R.string.url_error, 0).show();
                return false;
            }
        });
        this.mServerUrlPreference.setSummary(this.mServerUrlPreference.getText());
        this.mServerUrlPreference.getEditText().setFilters(new InputFilter[]{getReturnFilter()});
        if (!serverAvailable && !adminMode) {
            Preference protocol = findPreference(KEY_PROTOCOL);
            serverCategory.removePreference(protocol);
            serverCategory.removePreference(this.mServerUrlPreference);
        } else {
            disableFeaturesInDevelopment();
        }
        this.mUsernamePreference = (EditTextPreference) findPreference("username");
        this.mUsernamePreference.setOnPreferenceChangeListener(this);
        this.mUsernamePreference.setSummary(this.mUsernamePreference.getText());
        this.mUsernamePreference.getEditText().setFilters(new InputFilter[]{getReturnFilter()});
        boolean usernameAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_USERNAME, true);
        if (!usernameAvailable && !adminMode) {
            serverCategory.removePreference(this.mUsernamePreference);
        }
        this.mPasswordPreference = (EditTextPreference) findPreference(KEY_PASSWORD);
        this.mPasswordPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.2
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                String pw = newValue.toString();
                if (pw.length() > 0) {
                    PreferencesActivity.this.mPasswordPreference.setSummary("********");
                    return true;
                }
                PreferencesActivity.this.mPasswordPreference.setSummary("");
                return true;
            }
        });
        if (this.mPasswordPreference.getText() != null && this.mPasswordPreference.getText().length() > 0) {
            this.mPasswordPreference.setSummary("********");
        }
        this.mUsernamePreference.getEditText().setFilters(new InputFilter[]{getReturnFilter()});
        boolean passwordAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_PASSWORD, true);
        if (!passwordAvailable && !adminMode) {
            serverCategory.removePreference(this.mPasswordPreference);
        }
        this.mSelectedGoogleAccountPreference = (PreferenceScreen) findPreference(KEY_SELECTED_GOOGLE_ACCOUNT);
        this.mSelectedGoogleAccountPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.3
            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                Intent i = new Intent(PreferencesActivity.this.getApplicationContext(), AccountList.class);
                PreferencesActivity.this.startActivity(i);
                return true;
            }
        });
        this.mSelectedGoogleAccountPreference.setSummary(this.mSelectedGoogleAccountPreference.getSharedPreferences().getString(KEY_ACCOUNT, ""));
        boolean googleAccounAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_GOOGLE_ACCOUNT, true);
        if (!googleAccounAvailable && !adminMode) {
            serverCategory.removePreference(this.mSelectedGoogleAccountPreference);
        }
        this.mFormListUrlPreference = (EditTextPreference) findPreference(KEY_FORMLIST_URL);
        this.mFormListUrlPreference.setOnPreferenceChangeListener(this);
        this.mFormListUrlPreference.setSummary(this.mFormListUrlPreference.getText());
        this.mServerUrlPreference.getEditText().setFilters(new InputFilter[]{getReturnFilter(), getWhitespaceFilter()});
        if (!serverAvailable && !adminMode) {
            serverCategory.removePreference(this.mFormListUrlPreference);
        }
        this.mSubmissionUrlPreference = (EditTextPreference) findPreference(KEY_SUBMISSION_URL);
        this.mSubmissionUrlPreference.setOnPreferenceChangeListener(this);
        this.mSubmissionUrlPreference.setSummary(this.mSubmissionUrlPreference.getText());
        this.mServerUrlPreference.getEditText().setFilters(new InputFilter[]{getReturnFilter(), getWhitespaceFilter()});
        if (!serverAvailable && !adminMode) {
            serverCategory.removePreference(this.mSubmissionUrlPreference);
        }
        if (!serverAvailable && !usernameAvailable && !passwordAvailable && !googleAccounAvailable && !adminMode) {
            getPreferenceScreen().removePreference(serverCategory);
        }
        PreferenceCategory clientCategory = (PreferenceCategory) findPreference(getString(R.string.client));
        boolean fontAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_CHANGE_FONT_SIZE, true);
        this.mFontSizePreference = (ListPreference) findPreference(KEY_FONT_SIZE);
        this.mFontSizePreference.setSummary(this.mFontSizePreference.getEntry());
        this.mFontSizePreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.4
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                int index = ((ListPreference) preference).findIndexOfValue(newValue.toString());
                String entry = (String) ((ListPreference) preference).getEntries()[index];
                ((ListPreference) preference).setSummary(entry);
                return true;
            }
        });
        if (!fontAvailable && !adminMode) {
            clientCategory.removePreference(this.mFontSizePreference);
        }
        boolean defaultAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_DEFAULT_TO_FINALIZED, true);
        Preference defaultFinalized = findPreference(KEY_COMPLETED_DEFAULT);
        if (!defaultAvailable && !adminMode) {
            clientCategory.removePreference(defaultFinalized);
        }
        boolean splashAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_SELECT_SPLASH_SCREEN, true);
        this.mSplashPathPreference = (PreferenceScreen) findPreference(KEY_SPLASH_PATH);
        this.mSplashPathPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.5
            public void launchImageChooser() {
                Intent i = new Intent("android.intent.action.GET_CONTENT");
                i.setType("image/*");
                PreferencesActivity.this.startActivityForResult(i, 0);
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                CharSequence cs = PreferencesActivity.this.mSplashPathPreference.getSummary();
                if (cs != null && cs.toString().contains("/")) {
                    final CharSequence[] items = {PreferencesActivity.this.getString(R.string.select_another_image), PreferencesActivity.this.getString(R.string.use_odk_default)};
                    AlertDialog.Builder builder = new AlertDialog.Builder(PreferencesActivity.this);
                    builder.setTitle(PreferencesActivity.this.getString(R.string.change_splash_path));
                    builder.setNeutralButton(PreferencesActivity.this.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.5.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });
                    builder.setItems(items, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.preferences.PreferencesActivity.5.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialog, int item) {
                            if (!items[item].equals(PreferencesActivity.this.getString(R.string.select_another_image))) {
                                PreferencesActivity.this.setSplashPath(PreferencesActivity.this.getString(R.string.default_splash_path));
                            } else {
                                launchImageChooser();
                            }
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                } else {
                    launchImageChooser();
                }
                return true;
            }
        });
        if (!splashAvailable && !adminMode) {
            clientCategory.removePreference(this.mSplashPathPreference);
        }
        boolean showSplashAvailable = adminPreferences.getBoolean(AdminPreferencesActivity.KEY_SHOW_SPLASH_SCREEN, true);
        CheckBoxPreference showSplashPreference = (CheckBoxPreference) findPreference(KEY_SHOW_SPLASH);
        if (!showSplashAvailable && !adminMode) {
            clientCategory.removePreference(showSplashPreference);
        }
        if (!fontAvailable && !defaultAvailable && !splashAvailable && !showSplashAvailable && !adminMode) {
            getPreferenceScreen().removePreference(clientCategory);
        }
    }

    private void disableFeaturesInDevelopment() {
        ListPreference protocols = (ListPreference) findPreference(KEY_PROTOCOL);
        int i = protocols.findIndexOfValue(PROTOCOL_GOOGLE);
        if (i != -1) {
            CharSequence[] entries = protocols.getEntries();
            CharSequence[] entryValues = protocols.getEntryValues();
            CharSequence[] newEntries = new CharSequence[entryValues.length - 1];
            CharSequence[] newEntryValues = new CharSequence[entryValues.length - 1];
            int k = 0;
            for (int j = 0; j < entryValues.length; j++) {
                if (j != i) {
                    newEntries[k] = entries[j];
                    newEntryValues[k] = entries[j];
                    k++;
                }
            }
            protocols.setEntries(newEntries);
            protocols.setEntryValues(newEntryValues);
        }
    }

    public void setSplashPath(String path) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_SPLASH_PATH, path);
        editor.commit();
        this.mSplashPathPreference = (PreferenceScreen) findPreference(KEY_SPLASH_PATH);
        this.mSplashPathPreference.setSummary(this.mSplashPathPreference.getSharedPreferences().getString(KEY_SPLASH_PATH, getString(R.string.default_splash_path)));
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        String sourceImagePath;
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode != 0) {
            switch (requestCode) {
                case 0:
                    Uri uri = intent.getData();
                    if (uri.toString().startsWith("file")) {
                        sourceImagePath = uri.toString().substring(6);
                    } else {
                        String[] projection = {"_data"};
                        Cursor c = null;
                        try {
                            c = getContentResolver().query(uri, projection, null, null, null);
                            int i = c.getColumnIndexOrThrow("_data");
                            c.moveToFirst();
                            sourceImagePath = c.getString(i);
                            if (c != null) {
                                c.close();
                            }
                        } catch (Throwable th) {
                            if (c != null) {
                                c.close();
                            }
                            throw th;
                        }
                    }
                    setSplashPath(sourceImagePath);
                    return;
                default:
                    return;
            }
        }
    }

    private InputFilter getWhitespaceFilter() {
        InputFilter whitespaceFilter = new InputFilter() { // from class: org.odk.collect.android.preferences.PreferencesActivity.6
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) {
                    if (Character.isWhitespace(source.charAt(i))) {
                        return "";
                    }
                }
                return null;
            }
        };
        return whitespaceFilter;
    }

    private InputFilter getReturnFilter() {
        InputFilter returnFilter = new InputFilter() { // from class: org.odk.collect.android.preferences.PreferencesActivity.7
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) {
                    if (Character.getType(source.charAt(i)) == 15) {
                        return "";
                    }
                }
                return null;
            }
        };
        return returnFilter;
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        preference.setSummary((CharSequence) newValue);
        return true;
    }
}
