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
import android.widget.Toast;
import java.util.ArrayList;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.DeleteInstancesListener;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.tasks.DeleteInstancesTask;
/* loaded from: classes.dex */
public class DataManagerList extends ListActivity implements DeleteInstancesListener {
    private static final String SELECTED = "selected";
    private static final String t = "DataManagerList";
    private AlertDialog mAlertDialog;
    private Button mDeleteButton;
    private SimpleCursorAdapter mInstances;
    private ArrayList<Long> mSelected = new ArrayList<>();
    DeleteInstancesTask mDeleteInstancesTask = null;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_manage_list);
        this.mDeleteButton = (Button) findViewById(R.id.delete_button);
        this.mDeleteButton.setText(getString(R.string.delete_file));
        this.mDeleteButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.DataManagerList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Collect.getInstance().getActivityLogger().logAction(this, "deleteButton", Integer.toString(DataManagerList.this.mSelected.size()));
                if (DataManagerList.this.mSelected.size() > 0) {
                    DataManagerList.this.createDeleteInstancesDialog();
                } else {
                    Toast.makeText(DataManagerList.this.getApplicationContext(), (int) R.string.noselect_error, 0).show();
                }
            }
        });
        Cursor c = managedQuery(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, null, null, "displayName ASC");
        String[] data = {"displayName", "displaySubtext"};
        int[] view = {R.id.text1, R.id.text2};
        this.mInstances = new SimpleCursorAdapter(this, R.layout.two_item_multiple_choice, c, data, view);
        setListAdapter(this.mInstances);
        getListView().setChoiceMode(2);
        getListView().setItemsCanFocus(false);
        this.mDeleteButton.setEnabled(false);
        this.mDeleteInstancesTask = (DeleteInstancesTask) getLastNonConfigurationInstance();
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
        return this.mDeleteInstancesTask;
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
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (this.mDeleteInstancesTask != null) {
            this.mDeleteInstancesTask.setDeleteListener(this);
        }
        super.onResume();
        if (this.mDeleteInstancesTask != null && this.mDeleteInstancesTask.getStatus() == AsyncTask.Status.FINISHED) {
            deleteComplete(this.mDeleteInstancesTask.getDeleteCount());
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mDeleteInstancesTask != null) {
            this.mDeleteInstancesTask.setDeleteListener(null);
        }
        if (this.mAlertDialog != null && this.mAlertDialog.isShowing()) {
            this.mAlertDialog.dismiss();
        }
        super.onPause();
    }

    public void createDeleteInstancesDialog() {
        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteInstancesDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setTitle(getString(R.string.delete_file));
        this.mAlertDialog.setMessage(getString(R.string.delete_confirm, new Object[]{Integer.valueOf(this.mSelected.size())}));
        DialogInterface.OnClickListener dialogYesNoListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.DataManagerList.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -2:
                        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteInstancesDialog", "cancel");
                        return;
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createDeleteInstancesDialog", "delete");
                        DataManagerList.this.deleteSelectedInstances();
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

    public void deleteSelectedInstances() {
        if (this.mDeleteInstancesTask == null) {
            this.mDeleteInstancesTask = new DeleteInstancesTask();
            this.mDeleteInstancesTask.setContentResolver(getContentResolver());
            this.mDeleteInstancesTask.setDeleteListener(this);
            this.mDeleteInstancesTask.execute(this.mSelected.toArray(new Long[this.mSelected.size()]));
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

    @Override // org.odk.collect.android.listeners.DeleteInstancesListener
    public void deleteComplete(int deletedInstances) {
        Log.i(t, "Delete instances complete");
        Collect.getInstance().getActivityLogger().logAction(this, "deleteComplete", Integer.toString(deletedInstances));
        if (deletedInstances == this.mSelected.size()) {
            Toast.makeText(this, getString(R.string.file_deleted_ok, new Object[]{Integer.valueOf(deletedInstances)}), 0).show();
        } else {
            Log.e(t, "Failed to delete " + (this.mSelected.size() - deletedInstances) + " instances");
            Toast.makeText(this, getString(R.string.file_deleted_error, new Object[]{Integer.valueOf(this.mSelected.size() - deletedInstances), Integer.valueOf(this.mSelected.size())}), 1).show();
        }
        this.mDeleteInstancesTask = null;
        this.mSelected.clear();
        getListView().clearChoices();
        for (int i = 0; i < getListView().getCount(); i++) {
            getListView().setItemChecked(i, false);
        }
        this.mDeleteButton.setEnabled(false);
    }
}
