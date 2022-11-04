package org.odk.collect.android.activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormDownloaderListener;
import org.odk.collect.android.listeners.FormListDownloaderListener;
import org.odk.collect.android.logic.FormDetails;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.tasks.DownloadFormListTask;
import org.odk.collect.android.tasks.DownloadFormsTask;
import org.odk.collect.android.utilities.WebUtils;
/* loaded from: classes.dex */
public class FormDownloadList extends ListActivity implements FormListDownloaderListener, FormDownloaderListener {
    private static final int AUTH_DIALOG = 2;
    private static final String BUNDLE_FORM_MAP = "formmap";
    private static final String BUNDLE_SELECTED_COUNT = "selectedcount";
    private static final String BUNDLE_TOGGLED_KEY = "toggled";
    private static final String DIALOG_MSG = "dialogmsg";
    private static final String DIALOG_SHOWING = "dialogshowing";
    private static final String DIALOG_TITLE = "dialogtitle";
    private static final boolean DO_NOT_EXIT = false;
    private static final boolean EXIT = true;
    private static final String FORMDETAIL_KEY = "formdetailkey";
    private static final String FORMID_DISPLAY = "formiddisplay";
    private static final String FORMLIST = "formlist";
    private static final String FORMNAME = "formname";
    public static final String LIST_URL = "listurl";
    private static final int MENU_PREFERENCES = 1;
    private static final int PROGRESS_DIALOG = 1;
    private static final String SHOULD_EXIT = "shouldexit";
    private static final String t = "RemoveFileManageList";
    private AlertDialog mAlertDialog;
    private String mAlertMsg;
    private String mAlertTitle;
    private Button mDownloadButton;
    private DownloadFormListTask mDownloadFormListTask;
    private DownloadFormsTask mDownloadFormsTask;
    private ArrayList<HashMap<String, String>> mFormList;
    private SimpleAdapter mFormListAdapter;
    private HashMap<String, FormDetails> mFormNamesAndURLs;
    private ProgressDialog mProgressDialog;
    private Button mRefreshButton;
    private boolean mShouldExit;
    private Button mToggleButton;
    private boolean mAlertShowing = false;
    private boolean mToggled = false;
    private int mSelectedCount = 0;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remote_file_manage_list);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.get_forms));
        this.mAlertMsg = getString(R.string.please_wait);
        getListView().setBackgroundColor(-1);
        this.mDownloadButton = (Button) findViewById(R.id.add_button);
        this.mDownloadButton.setEnabled(selectedItemCount() > 0);
        this.mDownloadButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                FormDownloadList.this.downloadSelectedFiles();
                FormDownloadList.this.mToggled = false;
                FormDownloadList.this.clearChoices();
            }
        });
        this.mToggleButton = (Button) findViewById(R.id.toggle_button);
        this.mToggleButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                boolean z = true;
                ListView ls = FormDownloadList.this.getListView();
                FormDownloadList.this.mToggled = !FormDownloadList.this.mToggled;
                Collect.getInstance().getActivityLogger().logAction(this, "toggleFormCheckbox", Boolean.toString(FormDownloadList.this.mToggled));
                for (int pos = 0; pos < ls.getCount(); pos++) {
                    ls.setItemChecked(pos, FormDownloadList.this.mToggled);
                }
                Button button = FormDownloadList.this.mDownloadButton;
                if (FormDownloadList.this.selectedItemCount() == 0) {
                    z = false;
                }
                button.setEnabled(z);
            }
        });
        this.mRefreshButton = (Button) findViewById(R.id.refresh_button);
        this.mRefreshButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logAction(this, "refreshForms", "");
                FormDownloadList.this.mToggled = false;
                FormDownloadList.this.downloadFormList();
                FormDownloadList.this.getListView().clearChoices();
                FormDownloadList.this.clearChoices();
            }
        });
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(BUNDLE_FORM_MAP)) {
                this.mFormNamesAndURLs = (HashMap) savedInstanceState.getSerializable(BUNDLE_FORM_MAP);
            }
            if (savedInstanceState.containsKey(BUNDLE_TOGGLED_KEY)) {
                this.mToggled = savedInstanceState.getBoolean(BUNDLE_TOGGLED_KEY);
            }
            if (savedInstanceState.containsKey(BUNDLE_SELECTED_COUNT)) {
                this.mSelectedCount = savedInstanceState.getInt(BUNDLE_SELECTED_COUNT);
                this.mDownloadButton.setEnabled(this.mSelectedCount != 0);
            }
            if (savedInstanceState.containsKey(DIALOG_TITLE)) {
                this.mAlertTitle = savedInstanceState.getString(DIALOG_TITLE);
            }
            if (savedInstanceState.containsKey(DIALOG_MSG)) {
                this.mAlertMsg = savedInstanceState.getString(DIALOG_MSG);
            }
            if (savedInstanceState.containsKey(DIALOG_SHOWING)) {
                this.mAlertShowing = savedInstanceState.getBoolean(DIALOG_SHOWING);
            }
            if (savedInstanceState.containsKey(SHOULD_EXIT)) {
                this.mShouldExit = savedInstanceState.getBoolean(SHOULD_EXIT);
            }
        }
        if (savedInstanceState != null && savedInstanceState.containsKey(FORMLIST)) {
            this.mFormList = (ArrayList) savedInstanceState.getSerializable(FORMLIST);
        } else {
            this.mFormList = new ArrayList<>();
        }
        if (getLastNonConfigurationInstance() instanceof DownloadFormListTask) {
            this.mDownloadFormListTask = (DownloadFormListTask) getLastNonConfigurationInstance();
            if (this.mDownloadFormListTask.getStatus() == AsyncTask.Status.FINISHED) {
                try {
                    dismissDialog(1);
                } catch (IllegalArgumentException e) {
                    Log.i(t, "Attempting to close a dialog that was not previously opened");
                }
                this.mDownloadFormsTask = null;
            }
        } else if (getLastNonConfigurationInstance() instanceof DownloadFormsTask) {
            this.mDownloadFormsTask = (DownloadFormsTask) getLastNonConfigurationInstance();
            if (this.mDownloadFormsTask.getStatus() == AsyncTask.Status.FINISHED) {
                try {
                    dismissDialog(1);
                } catch (IllegalArgumentException e2) {
                    Log.i(t, "Attempting to close a dialog that was not previously opened");
                }
                this.mDownloadFormsTask = null;
            }
        } else if (getLastNonConfigurationInstance() == null) {
            downloadFormList();
        }
        String[] data = {FORMNAME, FORMID_DISPLAY, FORMDETAIL_KEY};
        int[] view = {R.id.text1, R.id.text2};
        this.mFormListAdapter = new SimpleAdapter(this, this.mFormList, R.layout.two_item_multiple_choice, data, view);
        getListView().setChoiceMode(2);
        getListView().setItemsCanFocus(false);
        setListAdapter(this.mFormListAdapter);
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

    public void clearChoices() {
        getListView().clearChoices();
        this.mDownloadButton.setEnabled(false);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        this.mDownloadButton.setEnabled(selectedItemCount() != 0);
        Object o = getListAdapter().getItem(position);
        HashMap<String, String> item = (HashMap) o;
        FormDetails detail = this.mFormNamesAndURLs.get(item.get(FORMDETAIL_KEY));
        Collect.getInstance().getActivityLogger().logAction(this, "onListItemClick", detail.downloadUrl);
    }

    public void downloadFormList() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        NetworkInfo ni = connectivityManager.getActiveNetworkInfo();
        if (ni == null || !ni.isConnected()) {
            Toast.makeText(this, (int) R.string.no_connection, 0).show();
            return;
        }
        this.mFormNamesAndURLs = new HashMap<>();
        if (this.mProgressDialog != null) {
            this.mProgressDialog.setMessage(getString(R.string.please_wait));
        }
        showDialog(1);
        if (this.mDownloadFormListTask == null || this.mDownloadFormListTask.getStatus() == AsyncTask.Status.FINISHED) {
            if (this.mDownloadFormListTask != null) {
                this.mDownloadFormListTask.setDownloaderListener(null);
                this.mDownloadFormListTask.cancel(true);
                this.mDownloadFormListTask = null;
            }
            this.mDownloadFormListTask = new DownloadFormListTask();
            this.mDownloadFormListTask.setDownloaderListener(this);
            this.mDownloadFormListTask.execute(new Void[0]);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(BUNDLE_TOGGLED_KEY, this.mToggled);
        outState.putInt(BUNDLE_SELECTED_COUNT, selectedItemCount());
        outState.putSerializable(BUNDLE_FORM_MAP, this.mFormNamesAndURLs);
        outState.putString(DIALOG_TITLE, this.mAlertTitle);
        outState.putString(DIALOG_MSG, this.mAlertMsg);
        outState.putBoolean(DIALOG_SHOWING, this.mAlertShowing);
        outState.putBoolean(SHOULD_EXIT, this.mShouldExit);
        outState.putSerializable(FORMLIST, this.mFormList);
    }

    public int selectedItemCount() {
        int count = 0;
        SparseBooleanArray sba = getListView().getCheckedItemPositions();
        for (int i = 0; i < getListView().getCount(); i++) {
            if (sba.get(i, false)) {
                count++;
            }
        }
        return count;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Collect.getInstance().getActivityLogger().logAction(this, "onCreateOptionsMenu", "show");
        menu.add(0, 1, 0, getString(R.string.general_preferences)).setIcon(17301577);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onMenuItemSelected", "MENU_PREFERENCES");
                Intent i = new Intent(this, PreferencesActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onMenuItemSelected(featureId, item);
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.PROGRESS_DIALOG", "show");
                this.mProgressDialog = new ProgressDialog(this);
                DialogInterface.OnClickListener loadingButtonListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.PROGRESS_DIALOG", "OK");
                        dialog.dismiss();
                        if (FormDownloadList.this.mDownloadFormListTask != null) {
                            FormDownloadList.this.mDownloadFormListTask.setDownloaderListener(null);
                            FormDownloadList.this.mDownloadFormListTask.cancel(true);
                            FormDownloadList.this.mDownloadFormListTask = null;
                        }
                        if (FormDownloadList.this.mDownloadFormsTask != null) {
                            FormDownloadList.this.mDownloadFormsTask.setDownloaderListener(null);
                            FormDownloadList.this.mDownloadFormsTask.cancel(true);
                            FormDownloadList.this.mDownloadFormsTask = null;
                        }
                    }
                };
                this.mProgressDialog.setTitle(getString(R.string.downloading_data));
                this.mProgressDialog.setMessage(this.mAlertMsg);
                this.mProgressDialog.setIcon(17301659);
                this.mProgressDialog.setIndeterminate(true);
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setButton(getString(R.string.cancel), loadingButtonListener);
                return this.mProgressDialog;
            case 2:
                Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "show");
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                LayoutInflater factory = LayoutInflater.from(this);
                final View dialogView = factory.inflate(R.layout.server_auth_dialog, (ViewGroup) null);
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                String server = settings.getString(PreferencesActivity.KEY_SERVER_URL, getString(R.string.default_server_url));
                final String url = server + settings.getString(PreferencesActivity.KEY_FORMLIST_URL, "/formList");
                Log.i(t, "Trying to get formList from: " + url);
                EditText username = (EditText) dialogView.findViewById(R.id.username_edit);
                String storedUsername = settings.getString("username", null);
                username.setText(storedUsername);
                EditText password = (EditText) dialogView.findViewById(R.id.password_edit);
                String storedPassword = settings.getString(PreferencesActivity.KEY_PASSWORD, null);
                password.setText(storedPassword);
                b.setTitle(getString(R.string.server_requires_auth));
                b.setMessage(getString(R.string.server_auth_credentials, new Object[]{url}));
                b.setView(dialogView);
                b.setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.5
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "OK");
                        EditText username2 = (EditText) dialogView.findViewById(R.id.username_edit);
                        EditText password2 = (EditText) dialogView.findViewById(R.id.password_edit);
                        Uri u = Uri.parse(url);
                        WebUtils.addCredentials(username2.getText().toString(), password2.getText().toString(), u.getHost());
                        FormDownloadList.this.downloadFormList();
                    }
                });
                b.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "Cancel");
                        FormDownloadList.this.finish();
                    }
                });
                b.setCancelable(false);
                this.mAlertShowing = false;
                return b.create();
            default:
                return null;
        }
    }

    public void downloadSelectedFiles() {
        ArrayList<FormDetails> filesToDownload = new ArrayList<>();
        SparseBooleanArray sba = getListView().getCheckedItemPositions();
        for (int i = 0; i < getListView().getCount(); i++) {
            if (sba.get(i, false)) {
                HashMap<String, String> item = (HashMap) getListAdapter().getItem(i);
                filesToDownload.add(this.mFormNamesAndURLs.get(item.get(FORMDETAIL_KEY)));
            }
        }
        int totalCount = filesToDownload.size();
        Collect.getInstance().getActivityLogger().logAction(this, "downloadSelectedFiles", Integer.toString(totalCount));
        if (totalCount > 0) {
            showDialog(1);
            this.mDownloadFormsTask = new DownloadFormsTask();
            this.mDownloadFormsTask.setDownloaderListener(this);
            this.mDownloadFormsTask.execute(filesToDownload);
            return;
        }
        Toast.makeText(getApplicationContext(), (int) R.string.noselect_error, 0).show();
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        return this.mDownloadFormsTask != null ? this.mDownloadFormsTask : this.mDownloadFormListTask;
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        if (this.mDownloadFormListTask != null) {
            this.mDownloadFormListTask.setDownloaderListener(null);
        }
        if (this.mDownloadFormsTask != null) {
            this.mDownloadFormsTask.setDownloaderListener(null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (this.mDownloadFormListTask != null) {
            this.mDownloadFormListTask.setDownloaderListener(this);
        }
        if (this.mDownloadFormsTask != null) {
            this.mDownloadFormsTask.setDownloaderListener(this);
        }
        if (this.mAlertShowing) {
            createAlertDialog(this.mAlertTitle, this.mAlertMsg, this.mShouldExit);
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
        super.onPause();
    }

    @Override // org.odk.collect.android.listeners.FormListDownloaderListener
    public void formListDownloadingComplete(HashMap<String, FormDetails> result) {
        dismissDialog(1);
        this.mDownloadFormListTask.setDownloaderListener(null);
        this.mDownloadFormListTask = null;
        if (result == null) {
            Log.e(t, "Formlist Downloading returned null.  That shouldn't happen");
            createAlertDialog(getString(R.string.load_remote_form_error), getString(R.string.error_occured), true);
        } else if (result.containsKey(DownloadFormListTask.DL_AUTH_REQUIRED)) {
            showDialog(2);
        } else if (result.containsKey(DownloadFormListTask.DL_ERROR_MSG)) {
            String dialogMessage = getString(R.string.list_failed_with_error, new Object[]{result.get(DownloadFormListTask.DL_ERROR_MSG).errorStr});
            String dialogTitle = getString(R.string.load_remote_form_error);
            createAlertDialog(dialogTitle, dialogMessage, false);
        } else {
            this.mFormNamesAndURLs = result;
            this.mFormList.clear();
            ArrayList<String> ids = new ArrayList<>(this.mFormNamesAndURLs.keySet());
            for (int i = 0; i < result.size(); i++) {
                String formDetailsKey = ids.get(i);
                FormDetails details = this.mFormNamesAndURLs.get(formDetailsKey);
                HashMap<String, String> item = new HashMap<>();
                item.put(FORMNAME, details.formName);
                item.put(FORMID_DISPLAY, (details.formVersion == null ? "" : getString(R.string.version) + XFormAnswerDataSerializer.DELIMITER + details.formVersion + XFormAnswerDataSerializer.DELIMITER) + "ID: " + details.formID);
                item.put(FORMDETAIL_KEY, formDetailsKey);
                if (this.mFormList.size() == 0) {
                    this.mFormList.add(item);
                } else {
                    int j = 0;
                    while (j < this.mFormList.size()) {
                        HashMap<String, String> compareMe = this.mFormList.get(j);
                        String name = compareMe.get(FORMNAME);
                        if (name.compareTo(this.mFormNamesAndURLs.get(ids.get(i)).formName) > 0) {
                            break;
                        }
                        j++;
                    }
                    this.mFormList.add(j, item);
                }
            }
            this.mFormListAdapter.notifyDataSetChanged();
        }
    }

    private void createAlertDialog(String title, String message, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logAction(this, "createAlertDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setTitle(title);
        this.mAlertDialog.setMessage(message);
        DialogInterface.OnClickListener quitListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormDownloadList.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createAlertDialog", "OK");
                        FormDownloadList.this.mAlertShowing = false;
                        if (shouldExit) {
                            FormDownloadList.this.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.ok), quitListener);
        this.mAlertDialog.setIcon(17301659);
        this.mAlertMsg = message;
        this.mAlertTitle = title;
        this.mAlertShowing = true;
        this.mShouldExit = shouldExit;
        this.mAlertDialog.show();
    }

    @Override // org.odk.collect.android.listeners.FormDownloaderListener
    public void progressUpdate(String currentFile, int progress, int total) {
        this.mAlertMsg = getString(R.string.fetching_file, new Object[]{currentFile, Integer.valueOf(progress), Integer.valueOf(total)});
        this.mProgressDialog.setMessage(this.mAlertMsg);
    }

    @Override // org.odk.collect.android.listeners.FormDownloaderListener
    public void formsDownloadingComplete(HashMap<FormDetails, String> result) {
        if (this.mDownloadFormsTask != null) {
            this.mDownloadFormsTask.setDownloaderListener(null);
        }
        if (this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
        Set<FormDetails> keys = result.keySet();
        StringBuilder b = new StringBuilder();
        for (FormDetails k : keys) {
            b.append(k.formName + " (" + (k.formVersion != null ? getString(R.string.version) + ": " + k.formVersion + XFormAnswerDataSerializer.DELIMITER : "") + "ID: " + k.formID + ") - " + result.get(k));
            b.append("\n\n");
        }
        createAlertDialog(getString(R.string.download_forms_result), b.toString().trim(), true);
    }
}
