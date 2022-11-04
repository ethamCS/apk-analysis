package org.odk.collect.android.activities;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.DiskSyncListener;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.tasks.DiskSyncTask;
import org.odk.collect.android.utilities.VersionHidingCursorAdapter;
/* loaded from: classes.dex */
public class FormChooserList extends ListActivity implements DiskSyncListener {
    private static final boolean EXIT = true;
    private static final String syncMsgKey = "syncmsgkey";
    private static final String t = "FormChooserList";
    private AlertDialog mAlertDialog;
    private DiskSyncTask mDiskSyncTask;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Collect.createODKDirs();
            setContentView(R.layout.chooser_list_layout);
            setTitle(getString(R.string.app_name) + " > " + getString(R.string.enter_data));
            Cursor c = managedQuery(FormsProviderAPI.FormsColumns.CONTENT_URI, null, null, null, "displayName ASC, jrVersion DESC");
            String[] data = {"displayName", "displaySubtext", "jrVersion"};
            int[] view = {R.id.text1, R.id.text2, R.id.text3};
            SimpleCursorAdapter instances = new VersionHidingCursorAdapter("jrVersion", this, R.layout.two_item, c, data, view);
            setListAdapter(instances);
            if (savedInstanceState != null && savedInstanceState.containsKey(syncMsgKey)) {
                TextView tv = (TextView) findViewById(R.id.status_text);
                tv.setText(savedInstanceState.getString(syncMsgKey));
            }
            this.mDiskSyncTask = (DiskSyncTask) getLastNonConfigurationInstance();
            if (this.mDiskSyncTask == null) {
                Log.i(t, "Starting new disk sync task");
                this.mDiskSyncTask = new DiskSyncTask();
                this.mDiskSyncTask.setDiskSyncListener(this);
                this.mDiskSyncTask.execute((Object[]) null);
            }
        } catch (RuntimeException e) {
            createErrorDialog(e.getMessage(), true);
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        return this.mDiskSyncTask;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView tv = (TextView) findViewById(R.id.status_text);
        outState.putString(syncMsgKey, tv.getText().toString());
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        long idFormsTable = ((SimpleCursorAdapter) getListAdapter()).getItemId(position);
        Uri formUri = ContentUris.withAppendedId(FormsProviderAPI.FormsColumns.CONTENT_URI, idFormsTable);
        Collect.getInstance().getActivityLogger().logAction(this, "onListItemClick", formUri.toString());
        String action = getIntent().getAction();
        if ("android.intent.action.PICK".equals(action)) {
            setResult(-1, new Intent().setData(formUri));
        } else {
            startActivity(new Intent("android.intent.action.EDIT", formUri));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mDiskSyncTask.setDiskSyncListener(this);
        super.onResume();
        if (this.mDiskSyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            SyncComplete(this.mDiskSyncTask.getStatusMessage());
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.mDiskSyncTask.setDiskSyncListener(null);
        super.onPause();
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

    @Override // org.odk.collect.android.listeners.DiskSyncListener
    public void SyncComplete(String result) {
        Log.i(t, "disk sync task complete");
        TextView tv = (TextView) findViewById(R.id.status_text);
        tv.setText(result);
    }

    private void createErrorDialog(String errorMsg, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setMessage(errorMsg);
        DialogInterface.OnClickListener errorListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormChooserList.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", shouldExit ? "exitApplication" : "OK");
                        if (shouldExit) {
                            FormChooserList.this.finish();
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
}
