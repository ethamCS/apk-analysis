package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.kxml2.wap.Wbxml;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.AdminPreferencesActivity;
import org.odk.collect.android.preferences.PreferencesActivity;
/* loaded from: classes.dex */
public class MainMenuActivity extends Activity {
    private static boolean EXIT = true;
    private static final int MENU_ADMIN = 2;
    private static final int MENU_PREFERENCES = 1;
    private static final int PASSWORD_DIALOG = 1;
    private static final String t = "MainMenuActivity";
    private SharedPreferences mAdminPreferences;
    private AlertDialog mAlertDialog;
    private Button mEnterDataButton;
    private Button mGetFormsButton;
    private View mGetFormsSpacer;
    private Button mManageFilesButton;
    private Button mReviewDataButton;
    private View mReviewSpacer;
    private Button mSendDataButton;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(t, "Starting up, creating directories");
        try {
            Collect.createODKDirs();
            setContentView(R.layout.main_menu);
            TextView mainMenuMessageLabel = (TextView) findViewById(R.id.main_menu_header);
            mainMenuMessageLabel.setText(Collect.getInstance().getVersionedAppName());
            setTitle(getString(R.string.app_name) + " > " + getString(R.string.main_menu));
            this.mReviewSpacer = findViewById(R.id.review_spacer);
            this.mGetFormsSpacer = findViewById(R.id.get_forms_spacer);
            this.mAdminPreferences = getSharedPreferences(AdminPreferencesActivity.ADMIN_PREFERENCES, 0);
            this.mEnterDataButton = (Button) findViewById(R.id.enter_data);
            this.mEnterDataButton.setText(getString(R.string.enter_data_button));
            this.mEnterDataButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logAction(this, "fillBlankForm", "click");
                    Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), FormChooserList.class);
                    MainMenuActivity.this.startActivity(i);
                }
            });
            this.mReviewDataButton = (Button) findViewById(R.id.review_data);
            this.mReviewDataButton.setText(getString(R.string.review_data_button));
            this.mReviewDataButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logAction(this, "editSavedForm", "click");
                    Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), InstanceChooserList.class);
                    MainMenuActivity.this.startActivity(i);
                }
            });
            this.mSendDataButton = (Button) findViewById(R.id.send_data);
            this.mSendDataButton.setText(getString(R.string.send_data_button));
            this.mSendDataButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logAction(this, "uploadForms", "click");
                    Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), InstanceUploaderList.class);
                    MainMenuActivity.this.startActivity(i);
                }
            });
            this.mGetFormsButton = (Button) findViewById(R.id.get_forms);
            this.mGetFormsButton.setText(getString(R.string.get_forms));
            this.mGetFormsButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logAction(this, "downloadBlankForms", "click");
                    Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), FormDownloadList.class);
                    MainMenuActivity.this.startActivity(i);
                }
            });
            this.mManageFilesButton = (Button) findViewById(R.id.manage_forms);
            this.mManageFilesButton.setText(getString(R.string.manage_files));
            this.mManageFilesButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logAction(this, "deleteSavedForms", "click");
                    Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), FileManagerTabs.class);
                    MainMenuActivity.this.startActivity(i);
                }
            });
        } catch (RuntimeException e) {
            createErrorDialog(e.getMessage(), EXIT);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences(AdminPreferencesActivity.ADMIN_PREFERENCES, 0);
        boolean edit = sharedPreferences.getBoolean(AdminPreferencesActivity.KEY_EDIT_SAVED, true);
        if (!edit) {
            this.mReviewDataButton.setVisibility(8);
            this.mReviewSpacer.setVisibility(8);
        } else {
            this.mReviewDataButton.setVisibility(0);
            this.mReviewSpacer.setVisibility(0);
        }
        boolean send = sharedPreferences.getBoolean(AdminPreferencesActivity.KEY_SEND_FINALIZED, true);
        if (!send) {
            this.mSendDataButton.setVisibility(8);
        } else {
            this.mSendDataButton.setVisibility(0);
        }
        boolean get_blank = sharedPreferences.getBoolean(AdminPreferencesActivity.KEY_GET_BLANK, true);
        if (!get_blank) {
            this.mGetFormsButton.setVisibility(8);
            this.mGetFormsSpacer.setVisibility(8);
        } else {
            this.mGetFormsButton.setVisibility(0);
            this.mGetFormsSpacer.setVisibility(0);
        }
        boolean delete_saved = sharedPreferences.getBoolean(AdminPreferencesActivity.KEY_DELETE_SAVED, true);
        if (!delete_saved) {
            this.mManageFilesButton.setVisibility(8);
        } else {
            this.mManageFilesButton.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Collect.getInstance().getActivityLogger().logAction(this, "onCreateOptionsMenu", "show");
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getString(R.string.general_preferences)).setIcon(17301577);
        menu.add(0, 2, 0, getString(R.string.admin_preferences)).setIcon(R.drawable.ic_menu_login);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onOptionsItemSelected", "MENU_PREFERENCES");
                Intent ig = new Intent(this, PreferencesActivity.class);
                startActivity(ig);
                return true;
            case 2:
                Collect.getInstance().getActivityLogger().logAction(this, "onOptionsItemSelected", "MENU_ADMIN");
                String pw = this.mAdminPreferences.getString(AdminPreferencesActivity.KEY_ADMIN_PW, "");
                if ("".equalsIgnoreCase(pw)) {
                    Intent i = new Intent(getApplicationContext(), AdminPreferencesActivity.class);
                    startActivity(i);
                    return true;
                }
                showDialog(1);
                Collect.getInstance().getActivityLogger().logAction(this, "createAdminPasswordDialog", "show");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void createErrorDialog(String errorMsg, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setMessage(errorMsg);
        DialogInterface.OnClickListener errorListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", shouldExit ? "exitApplication" : "OK");
                        if (shouldExit) {
                            MainMenuActivity.this.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.ok), errorListener);
        this.mAlertDialog.show();
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 1:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                final AlertDialog passwordDialog = builder.create();
                passwordDialog.setTitle(getString(R.string.enter_admin_password));
                final EditText input = new EditText(this);
                input.setInputType(Wbxml.EXT_T_0);
                input.setTransformationMethod(PasswordTransformationMethod.getInstance());
                passwordDialog.setView(input, 20, 10, 20, 10);
                passwordDialog.setButton(-1, getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.7
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String value = input.getText().toString();
                        String pw = MainMenuActivity.this.mAdminPreferences.getString(AdminPreferencesActivity.KEY_ADMIN_PW, "");
                        if (pw.compareTo(value) == 0) {
                            Intent i = new Intent(MainMenuActivity.this.getApplicationContext(), AdminPreferencesActivity.class);
                            MainMenuActivity.this.startActivity(i);
                            input.setText("");
                            passwordDialog.dismiss();
                            return;
                        }
                        Toast.makeText(MainMenuActivity.this, MainMenuActivity.this.getString(R.string.admin_password_incorrect), 0).show();
                        Collect.getInstance().getActivityLogger().logAction(this, "adminPasswordDialog", "PASSWORD_INCORRECT");
                    }
                });
                passwordDialog.setButton(-2, getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.MainMenuActivity.8
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "adminPasswordDialog", "cancel");
                        input.setText("");
                    }
                });
                passwordDialog.getWindow().setSoftInputMode(5);
                return passwordDialog;
            default:
                return null;
        }
    }
}
