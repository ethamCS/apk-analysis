package org.odk.collect.android.activities;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.provider.InstanceProviderAPI;
/* loaded from: classes.dex */
public class InstanceChooserList extends ListActivity {
    private static final boolean DO_NOT_EXIT = false;
    private static final boolean EXIT = true;
    private AlertDialog mAlertDialog;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Collect.createODKDirs();
            setContentView(R.layout.chooser_list_layout);
            setTitle(getString(R.string.app_name) + " > " + getString(R.string.review_data));
            TextView tv = (TextView) findViewById(R.id.status_text);
            tv.setVisibility(8);
            String[] selectionArgs = {InstanceProviderAPI.STATUS_SUBMITTED};
            Cursor c = managedQuery(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "status != ?", selectionArgs, "status DESC, displayName ASC");
            String[] data = {"displayName", "displaySubtext"};
            int[] view = {R.id.text1, R.id.text2};
            SimpleCursorAdapter instances = new SimpleCursorAdapter(this, R.layout.two_item, c, data, view);
            setListAdapter(instances);
        } catch (RuntimeException e) {
            createErrorDialog(e.getMessage(), true);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        Cursor c = (Cursor) getListAdapter().getItem(position);
        startManagingCursor(c);
        Uri instanceUri = ContentUris.withAppendedId(InstanceProviderAPI.InstanceColumns.CONTENT_URI, c.getLong(c.getColumnIndex("_id")));
        Collect.getInstance().getActivityLogger().logAction(this, "onListItemClick", instanceUri.toString());
        String action = getIntent().getAction();
        if ("android.intent.action.PICK".equals(action)) {
            setResult(-1, new Intent().setData(instanceUri));
        } else {
            String status = c.getString(c.getColumnIndex(InstanceProviderAPI.InstanceColumns.STATUS));
            String strCanEditWhenComplete = c.getString(c.getColumnIndex(InstanceProviderAPI.InstanceColumns.CAN_EDIT_WHEN_COMPLETE));
            boolean canEdit = status.equals(InstanceProviderAPI.STATUS_INCOMPLETE) || Boolean.parseBoolean(strCanEditWhenComplete);
            if (!canEdit) {
                createErrorDialog(getString(R.string.cannot_edit_completed_form), false);
                return;
            }
            startActivity(new Intent("android.intent.action.EDIT", instanceUri));
        }
        finish();
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

    private void createErrorDialog(String errorMsg, final boolean shouldExit) {
        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", "show");
        this.mAlertDialog = new AlertDialog.Builder(this).create();
        this.mAlertDialog.setIcon(17301659);
        this.mAlertDialog.setMessage(errorMsg);
        DialogInterface.OnClickListener errorListener = new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceChooserList.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int i) {
                switch (i) {
                    case -1:
                        Collect.getInstance().getActivityLogger().logAction(this, "createErrorDialog", shouldExit ? "exitApplication" : "OK");
                        if (shouldExit) {
                            InstanceChooserList.this.finish();
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
