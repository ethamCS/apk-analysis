package org.odk.collect.android.activities;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.DeleteFormsListener;
import org.odk.collect.android.listeners.DiskSyncListener;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.tasks.DeleteFormsTask;
import org.odk.collect.android.tasks.DiskSyncTask;
import org.odk.collect.android.utilities.VersionHidingCursorAdapter;
/* loaded from: classes.dex */
public class FormManagerList extends ListActivity implements DiskSyncListener, DeleteFormsListener {
    private static final String SELECTED = "selected";
    private static final String syncMsgKey = "syncmsgkey";
    private static String t = "FormManagerList";
    private AlertDialog mAlertDialog;
    BackgroundTasks mBackgroundTasks;
    private Button mDeleteButton;
    private SimpleCursorAdapter mInstances;
    private ArrayList<Long> mSelected = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class BackgroundTasks {
        DiskSyncTask mDiskSyncTask = null;
        DeleteFormsTask mDeleteFormsTask = null;

        BackgroundTasks() {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_manage_list);
        this.mDeleteButton = (Button) findViewById(R.id.delete_button);
        this.mDeleteButton.setText(getString(R.string.delete_file));
        this.mDeleteButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.FormManagerList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logAction(this, "deleteButton", Integer.toString(FormManagerList.this.mSelected.size()));
                if (FormManagerList.this.mSelected.size() > 0) {
                    FormManagerList.this.createDeleteFormsDialog();
                } else {
                    Toast.makeText(FormManagerList.this.getApplicationContext(), (int) R.string.noselect_error, 0).show();
                }
            }
        });
        Cursor c = managedQuery(FormsProviderAPI.FormsColumns.CONTENT_URI, null, null, null, "displayName ASC, jrVersion DESC");
        String[] data = {"displayName", "displaySubtext", "jrVersion"};
        int[] view = {R.id.text1, R.id.text2, R.id.text3};
        this.mInstances = new VersionHidingCursorAdapter("jrVersion", this, R.layout.two_item_multiple_choice, c, data, view);
        setListAdapter(this.mInstances);
        getListView().setChoiceMode(2);
        getListView().setItemsCanFocus(false);
        this.mDeleteButton.setEnabled(this.mSelected.size() != 0);
        if (savedInstanceState != null && savedInstanceState.containsKey(syncMsgKey)) {
            TextView tv = (TextView) findViewById(R.id.status_text);
            tv.setText(savedInstanceState.getString(syncMsgKey));
        }
        this.mBackgroundTasks = (BackgroundTasks) getLastNonConfigurationInstance();
        if (this.mBackgroundTasks == null) {
            this.mBackgroundTasks = new BackgroundTasks();
            this.mBackgroundTasks.mDiskSyncTask = new DiskSyncTask();
            this.mBackgroundTasks.mDiskSyncTask.setDiskSyncListener(this);
            this.mBackgroundTasks.mDiskSyncTask.execute((Object[]) null);
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
    public Object onRetainNonConfigurationInstance() {
        return this.mBackgroundTasks;
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        long[] selectedArray = savedInstanceState.getLongArray(SELECTED);
        for (long j : selectedArray) {
            this.mSelected.add(Long.valueOf(j));
        }
        this.mDeleteButton.setEnabled(selectedArray.length > 0);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        long[] selectedArray = new long[this.mSelected.size()];
        for (int i = 0; i < this.mSelected.size(); i++) {
            selectedArray[i] = this.mSelected.get(i).longValue();
        }
        outState.putLongArray(SELECTED, selectedArray);
        TextView tv = (TextView) findViewById(R.id.status_text);
        outState.putString(syncMsgKey, tv.getText().toString());
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mBackgroundTasks.mDiskSyncTask.setDiskSyncListener(this);
        if (this.mBackgroundTasks.mDeleteFormsTask != null) {
            this.mBackgroundTasks.mDeleteFormsTask.setDeleteListener(this);
        }
        super.onResume();
        if (this.mBackgroundTasks.mDiskSyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            SyncComplete(this.mBackgroundTasks.mDiskSyncTask.getStatusMessage());
        }
        if (this.mBackgroundTasks.mDeleteFormsTask != null && this.mBackgroundTasks.mDeleteFormsTask.getStatus() == AsyncTask.Status.FINISHED) {
            deleteComplete(this.mBackgroundTasks.mDeleteFormsTask.getDeleteCount());
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.mBackgroundTasks.mDiskSyncTask.setDiskSyncListener(null);
        if (this.mBackgroundTasks.mDeleteFormsTask != null) {
            this.mBackgroundTasks.mDeleteFormsTask.setDeleteListener(null);
        }
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
        super.onPause();
    }

    public void createDeleteFormsDialog() {
        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteFormsDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setTitle(getString(R.string.delete_file));
        this.mAlertDialog.setMessage(getString(R.string.delete_confirm, new Object[]{Integer.valueOf(this.mSelected.size())}));
        DialogInterface.OnClickListener dialogYesNoListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.FormManagerList.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteFormsDialog", "cancel");
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteFormsDialog", "delete");
                        FormManagerList.this.deleteSelectedForms();
                        return;
                    default:
                        return;
                }
            }
        };
        this.mAlertDialog.setCancelable(false);
        this.mAlertDialog.setButton(getString(R.string.delete_yes), dialogYesNoListener);
        this.mAlertDialog.setButton2(getString(R.string.delete_no), dialogYesNoListener);
        this.mAlertDialog.show();
    }

    public void deleteSelectedForms() {
        if (this.mBackgroundTasks.mDeleteFormsTask == null) {
            this.mBackgroundTasks.mDeleteFormsTask = new DeleteFormsTask();
            this.mBackgroundTasks.mDeleteFormsTask.setContentResolver(getContentResolver());
            this.mBackgroundTasks.mDeleteFormsTask.setDeleteListener(this);
            this.mBackgroundTasks.mDeleteFormsTask.execute(this.mSelected.toArray(new Long[this.mSelected.size()]));
            return;
        }
        Toast.makeText(this, getString(R.string.file_delete_in_progress), 1).show();
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Cursor c = (Cursor) getListAdapter().getItem(position);
        long k = c.getLong(c.getColumnIndex("_id"));
        if (this.mSelected.contains(Long.valueOf(k))) {
            this.mSelected.remove(Long.valueOf(k));
        } else {
            this.mSelected.add(Long.valueOf(k));
        }
        Collect.getInstance().getActivityLogger().logAction(this, "onListItemClick", Long.toString(k));
        this.mDeleteButton.setEnabled(this.mSelected.size() != 0);
    }

    @Override // org.odk.collect.android.listeners.DiskSyncListener
    public void SyncComplete(String result) {
        Log.i(t, "Disk scan complete");
        TextView tv = (TextView) findViewById(R.id.status_text);
        tv.setText(result);
    }

    @Override // org.odk.collect.android.listeners.DeleteFormsListener
    public void deleteComplete(int deletedForms) {
        Log.i(t, "Delete forms complete");
        Collect.getInstance().getActivityLogger().logAction(this, "deleteComplete", Integer.toString(deletedForms));
        if (deletedForms == this.mSelected.size()) {
            Toast.makeText(getApplicationContext(), getString(R.string.file_deleted_ok, new Object[]{Integer.valueOf(deletedForms)}), 0).show();
        } else {
            Log.e(t, "Failed to delete " + (this.mSelected.size() - deletedForms) + " forms");
            Toast.makeText(getApplicationContext(), getString(R.string.file_deleted_error, new Object[]{Integer.valueOf(this.mSelected.size() - deletedForms), Integer.valueOf(this.mSelected.size())}), 1).show();
        }
        this.mBackgroundTasks.mDeleteFormsTask = null;
        this.mSelected.clear();
        getListView().clearChoices();
        for (int i = 0; i < getListView().getCount(); i++) {
            getListView().setItemChecked(i, false);
        }
        this.mDeleteButton.setEnabled(false);
    }
}
