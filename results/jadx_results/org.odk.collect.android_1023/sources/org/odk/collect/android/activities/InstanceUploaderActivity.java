package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.InstanceUploaderListener;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.tasks.InstanceUploaderTask;
import org.odk.collect.android.utilities.WebUtils;
/* loaded from: classes.dex */
public class InstanceUploaderActivity extends Activity implements InstanceUploaderListener {
    private static final String ALERT_MSG = "alertmsg";
    private static final String ALERT_SHOWING = "alertshowing";
    private static final int AUTH_DIALOG = 2;
    private static final String AUTH_URI = "auth";
    private static final int PROGRESS_DIALOG = 1;
    private static final String TO_SEND = "tosend";
    private static final String t = "InstanceUploaderActivity";
    private AlertDialog mAlertDialog;
    private String mAlertMsg;
    private boolean mAlertShowing;
    private InstanceUploaderTask mInstanceUploaderTask;
    private ArrayList<Long> mInstancesToSend;
    private ProgressDialog mProgressDialog;
    private HashMap<String, String> mUploadedInstances;
    private String mUrl;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        long[] selectedInstanceIDs;
        super.onCreate(savedInstanceState);
        Log.i(t, "onCreate: " + (savedInstanceState == null ? "creating" : "re-initializing"));
        this.mAlertMsg = getString(R.string.please_wait);
        this.mAlertShowing = false;
        this.mUploadedInstances = new HashMap<>();
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.send_data));
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(ALERT_MSG)) {
                this.mAlertMsg = savedInstanceState.getString(ALERT_MSG);
            }
            if (savedInstanceState.containsKey(ALERT_SHOWING)) {
                this.mAlertShowing = savedInstanceState.getBoolean(ALERT_SHOWING, false);
            }
            this.mUrl = savedInstanceState.getString("auth");
        }
        if (savedInstanceState != null && savedInstanceState.containsKey(TO_SEND)) {
            selectedInstanceIDs = savedInstanceState.getLongArray(TO_SEND);
        } else {
            Intent intent = getIntent();
            selectedInstanceIDs = intent.getLongArrayExtra(FormEntryActivity.KEY_INSTANCES);
        }
        this.mInstancesToSend = new ArrayList<>();
        for (long j : selectedInstanceIDs) {
            this.mInstancesToSend.add(Long.valueOf(j));
        }
        if (this.mInstancesToSend.size() == 0) {
            Log.e(t, "onCreate: No instances to upload!");
        } else {
            Log.i(t, "onCreate: Beginning upload of " + this.mInstancesToSend.size() + " instances!");
        }
        this.mInstanceUploaderTask = (InstanceUploaderTask) getLastNonConfigurationInstance();
        if (this.mInstanceUploaderTask == null) {
            showDialog(1);
            this.mInstanceUploaderTask = new InstanceUploaderTask();
            this.mInstanceUploaderTask.setUploaderListener(this);
            Long[] toSendArray = new Long[this.mInstancesToSend.size()];
            this.mInstanceUploaderTask.execute((Long[]) this.mInstancesToSend.toArray(toSendArray));
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.Activity
    protected void onResume() {
        Log.i(t, "onResume: Resuming upload of " + this.mInstancesToSend.size() + " instances!");
        if (this.mInstanceUploaderTask != null) {
            this.mInstanceUploaderTask.setUploaderListener(this);
        }
        if (this.mAlertShowing) {
            createAlertDialog(this.mAlertMsg);
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(ALERT_MSG, this.mAlertMsg);
        outState.putBoolean(ALERT_SHOWING, this.mAlertShowing);
        outState.putString("auth", this.mUrl);
        long[] toSend = new long[this.mInstancesToSend.size()];
        for (int i = 0; i < this.mInstancesToSend.size(); i++) {
            toSend[i] = this.mInstancesToSend.get(i).longValue();
        }
        outState.putLongArray(TO_SEND, toSend);
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        return this.mInstanceUploaderTask;
    }

    @Override // android.app.Activity
    protected void onPause() {
        Log.i(t, "onPause: Pausing upload of " + this.mInstancesToSend.size() + " instances!");
        super.onPause();
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.mInstanceUploaderTask != null) {
            this.mInstanceUploaderTask.setUploaderListener(null);
        }
        super.onDestroy();
    }

    @Override // org.odk.collect.android.listeners.InstanceUploaderListener
    public void uploadingComplete(HashMap<String, String> result) {
        Log.i(t, "uploadingComplete: Processing results (" + result.size() + ") from upload of " + this.mInstancesToSend.size() + " instances!");
        try {
            dismissDialog(1);
        } catch (Exception e) {
        }
        StringBuilder selection = new StringBuilder();
        Set<String> keys = result.keySet();
        String[] selectionArgs = new String[keys.size()];
        int i = 0;
        for (String id : keys) {
            selection.append("_id=?");
            int i2 = i + 1;
            selectionArgs[i] = id;
            if (i2 != keys.size()) {
                selection.append(" or ");
            }
            i = i2;
        }
        StringBuilder message = new StringBuilder();
        Cursor results = null;
        try {
            results = getContentResolver().query(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, selection.toString(), selectionArgs, null);
            if (results.getCount() > 0) {
                results.moveToPosition(-1);
                while (results.moveToNext()) {
                    String name = results.getString(results.getColumnIndex("displayName"));
                    String id2 = results.getString(results.getColumnIndex("_id"));
                    message.append(name + " - " + result.get(id2) + "\n\n");
                }
            } else {
                message.append(getString(R.string.no_forms_uploaded));
            }
            createAlertDialog(message.toString().trim());
        } finally {
            if (results != null) {
                results.close();
            }
        }
    }

    @Override // org.odk.collect.android.listeners.InstanceUploaderListener
    public void progressUpdate(int progress, int total) {
        this.mAlertMsg = getString(R.string.sending_items, new Object[]{Integer.valueOf(progress), Integer.valueOf(total)});
        this.mProgressDialog.setMessage(this.mAlertMsg);
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.PROGRESS_DIALOG", "show");
                this.mProgressDialog = new ProgressDialog(this);
                DialogInterface.OnClickListener loadingButtonListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.PROGRESS_DIALOG", "cancel");
                        dialog.dismiss();
                        InstanceUploaderActivity.this.mInstanceUploaderTask.cancel(true);
                        InstanceUploaderActivity.this.mInstanceUploaderTask.setUploaderListener(null);
                        InstanceUploaderActivity.this.finish();
                    }
                };
                this.mProgressDialog.setTitle(getString(R.string.uploading_data));
                this.mProgressDialog.setMessage(this.mAlertMsg);
                this.mProgressDialog.setIndeterminate(true);
                this.mProgressDialog.setProgressStyle(0);
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setButton(getString(R.string.cancel), loadingButtonListener);
                return this.mProgressDialog;
            case 2:
                Log.i(t, "onCreateDialog(AUTH_DIALOG): for upload of " + this.mInstancesToSend.size() + " instances!");
                Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "show");
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                LayoutInflater factory = LayoutInflater.from(this);
                final View dialogView = factory.inflate(R.layout.server_auth_dialog, (ViewGroup) null);
                SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                String server = this.mUrl;
                if (server == null) {
                    Log.e(t, "onCreateDialog(AUTH_DIALOG): No failing mUrl specified for upload of " + this.mInstancesToSend.size() + " instances!");
                    server = settings.getString(PreferencesActivity.KEY_SERVER_URL, getString(R.string.default_server_url)) + settings.getString(PreferencesActivity.KEY_FORMLIST_URL, "/formList");
                }
                final String url = server;
                Log.i(t, "Trying connecting to: " + url);
                EditText username = (EditText) dialogView.findViewById(R.id.username_edit);
                String storedUsername = settings.getString("username", null);
                username.setText(storedUsername);
                EditText password = (EditText) dialogView.findViewById(R.id.password_edit);
                String storedPassword = settings.getString(PreferencesActivity.KEY_PASSWORD, null);
                password.setText(storedPassword);
                b.setTitle(getString(R.string.server_requires_auth));
                b.setMessage(getString(R.string.server_auth_credentials, new Object[]{url}));
                b.setView(dialogView);
                b.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "OK");
                        EditText username2 = (EditText) dialogView.findViewById(R.id.username_edit);
                        EditText password2 = (EditText) dialogView.findViewById(R.id.password_edit);
                        Uri u = Uri.parse(url);
                        WebUtils.addCredentials(username2.getText().toString(), password2.getText().toString(), u.getHost());
                        InstanceUploaderActivity.this.mInstanceUploaderTask = new InstanceUploaderTask();
                        InstanceUploaderActivity.this.mInstanceUploaderTask.setUploaderListener(InstanceUploaderActivity.this);
                        Long[] toSendArray = new Long[InstanceUploaderActivity.this.mInstancesToSend.size()];
                        InstanceUploaderActivity.this.mInstanceUploaderTask.execute((Long[]) InstanceUploaderActivity.this.mInstancesToSend.toArray(toSendArray));
                        InstanceUploaderActivity.this.showDialog(1);
                    }
                });
                b.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        Collect.getInstance().getActivityLogger().logAction(this, "onCreateDialog.AUTH_DIALOG", "cancel");
                        InstanceUploaderActivity.this.finish();
                    }
                });
                b.setCancelable(false);
                return b.create();
            default:
                return null;
        }
    }

    @Override // org.odk.collect.android.listeners.InstanceUploaderListener
    public void authRequest(Uri url, HashMap<String, String> doneSoFar) {
        if (this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
        if (doneSoFar != null) {
            Set<String> uploadedInstances = doneSoFar.keySet();
            for (String str : uploadedInstances) {
                Long removeMe = Long.valueOf(str);
                boolean removed = this.mInstancesToSend.remove(removeMe);
                if (removed) {
                    Log.i(t, removeMe + " was already sent, removing from queue before restarting task");
                }
            }
            this.mUploadedInstances.putAll(doneSoFar);
        }
        this.mUrl = url.toString();
        showDialog(2);
    }

    private void createAlertDialog(String message) {
        Collect.getInstance().getActivityLogger().logAction(this, "createAlertDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setTitle(getString(R.string.upload_results));
        this.mAlertDialog.setMessage(message);
        DialogInterface.OnClickListener quitListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createAlertDialog", "OK");
                        InstanceUploaderActivity.this.mAlertShowing = false;
                        InstanceUploaderActivity.this.finish();
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.ok), quitListener);
        this.mAlertDialog.setIcon(17301659);
        this.mAlertShowing = true;
        this.mAlertMsg = message;
        this.mAlertDialog.show();
    }
}
