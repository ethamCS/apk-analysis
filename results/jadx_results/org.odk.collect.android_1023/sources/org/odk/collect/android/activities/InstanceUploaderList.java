package org.odk.collect.android.activities;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.provider.InstanceProviderAPI;
/* loaded from: classes.dex */
public class InstanceUploaderList extends ListActivity implements View.OnLongClickListener {
    private static final String BUNDLE_SELECTED_ITEMS_KEY = "selected_items";
    private static final String BUNDLE_TOGGLED_KEY = "toggled";
    private static final int INSTANCE_UPLOADER = 0;
    private static final int MENU_PREFERENCES = 1;
    private static final int MENU_SHOW_UNSENT = 2;
    private SimpleCursorAdapter mInstances;
    private Button mToggleButton;
    private Button mUploadButton;
    private boolean mShowUnsent = true;
    private ArrayList<Long> mSelected = new ArrayList<>();
    private boolean mRestored = false;
    private boolean mToggled = false;

    public Cursor getUnsentCursor() {
        String[] selectionArgs = {InstanceProviderAPI.STATUS_COMPLETE, InstanceProviderAPI.STATUS_SUBMISSION_FAILED};
        Cursor c = managedQuery(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "status=? or status=?", selectionArgs, "displayName ASC");
        return c;
    }

    public Cursor getAllCursor() {
        String[] selectionArgs = {InstanceProviderAPI.STATUS_COMPLETE, InstanceProviderAPI.STATUS_SUBMISSION_FAILED, InstanceProviderAPI.STATUS_SUBMITTED};
        Cursor c = managedQuery(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, "status=? or status=? or status=?", selectionArgs, "displayName ASC");
        return c;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instance_uploader_list);
        this.mUploadButton = (Button) findViewById(R.id.upload_button);
        this.mUploadButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderList.1
            @Override // android.view.View.OnClickListener
            public void onClick(View arg0) {
                ConnectivityManager connectivityManager = (ConnectivityManager) InstanceUploaderList.this.getSystemService("connectivity");
                NetworkInfo ni = connectivityManager.getActiveNetworkInfo();
                if (ni != null && ni.isConnected()) {
                    Collect.getInstance().getActivityLogger().logAction(this, "uploadButton", Integer.toString(InstanceUploaderList.this.mSelected.size()));
                    if (InstanceUploaderList.this.mSelected.size() > 0) {
                        InstanceUploaderList.this.uploadSelectedFiles();
                        InstanceUploaderList.this.mToggled = false;
                        InstanceUploaderList.this.mSelected.clear();
                        InstanceUploaderList.this.getListView().clearChoices();
                        InstanceUploaderList.this.mUploadButton.setEnabled(false);
                        return;
                    }
                    Toast.makeText(InstanceUploaderList.this.getApplicationContext(), InstanceUploaderList.this.getString(R.string.noselect_error), 0).show();
                    return;
                }
                Collect.getInstance().getActivityLogger().logAction(this, "uploadButton", "noConnection");
                Toast.makeText(InstanceUploaderList.this, (int) R.string.no_connection, 0).show();
            }
        });
        this.mToggleButton = (Button) findViewById(R.id.toggle_button);
        this.mToggleButton.setLongClickable(true);
        this.mToggleButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderList.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                boolean z = true;
                ListView ls = InstanceUploaderList.this.getListView();
                InstanceUploaderList.this.mToggled = !InstanceUploaderList.this.mToggled;
                Collect.getInstance().getActivityLogger().logAction(this, "toggleButton", Boolean.toString(InstanceUploaderList.this.mToggled));
                InstanceUploaderList.this.mSelected.clear();
                for (int pos = 0; pos < ls.getCount(); pos++) {
                    ls.setItemChecked(pos, InstanceUploaderList.this.mToggled);
                    if (InstanceUploaderList.this.mToggled) {
                        InstanceUploaderList.this.mSelected.add(Long.valueOf(ls.getItemIdAtPosition(pos)));
                    }
                }
                Button button = InstanceUploaderList.this.mUploadButton;
                if (InstanceUploaderList.this.mSelected.size() == 0) {
                    z = false;
                }
                button.setEnabled(z);
            }
        });
        this.mToggleButton.setOnLongClickListener(this);
        Cursor c = this.mShowUnsent ? getUnsentCursor() : getAllCursor();
        String[] data = {"displayName", "displaySubtext"};
        int[] view = {R.id.text1, R.id.text2};
        this.mInstances = new SimpleCursorAdapter(this, R.layout.two_item_multiple_choice, c, data, view);
        setListAdapter(this.mInstances);
        getListView().setChoiceMode(2);
        getListView().setItemsCanFocus(false);
        this.mUploadButton.setEnabled(this.mSelected.size() != 0);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.send_data));
        if (this.mRestored) {
            ListView ls = getListView();
            Iterator i$ = this.mSelected.iterator();
            while (i$.hasNext()) {
                long id = i$.next().longValue();
                int pos = 0;
                while (true) {
                    if (pos >= ls.getCount()) {
                        break;
                    } else if (id != ls.getItemIdAtPosition(pos)) {
                        pos++;
                    } else {
                        ls.setItemChecked(pos, true);
                        break;
                    }
                }
            }
            this.mRestored = false;
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

    public void uploadSelectedFiles() {
        long[] instanceIDs = new long[this.mSelected.size()];
        for (int i = 0; i < this.mSelected.size(); i++) {
            instanceIDs[i] = this.mSelected.get(i).longValue();
        }
        Intent i2 = new Intent(this, InstanceUploaderActivity.class);
        i2.putExtra(FormEntryActivity.KEY_INSTANCES, instanceIDs);
        startActivityForResult(i2, 0);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Collect.getInstance().getActivityLogger().logAction(this, "onCreateOptionsMenu", "show");
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getString(R.string.general_preferences)).setIcon(17301577);
        menu.add(0, 2, 1, getString(R.string.change_view)).setIcon(17301577);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Collect.getInstance().getActivityLogger().logAction(this, "onMenuItemSelected", "MENU_PREFERENCES");
                createPreferencesMenu();
                return true;
            case 2:
                Collect.getInstance().getActivityLogger().logAction(this, "onMenuItemSelected", "MENU_SHOW_UNSENT");
                showSentAndUnsentChoices();
                return true;
            default:
                return super.onMenuItemSelected(featureId, item);
        }
    }

    private void createPreferencesMenu() {
        Intent i = new Intent(this, PreferencesActivity.class);
        startActivity(i);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Cursor c = (Cursor) getListAdapter().getItem(position);
        long k = c.getLong(c.getColumnIndex("_id"));
        Collect.getInstance().getActivityLogger().logAction(this, "onListItemClick", Long.toString(k));
        if (this.mSelected.contains(Long.valueOf(k))) {
            this.mSelected.remove(Long.valueOf(k));
        } else {
            this.mSelected.add(Long.valueOf(k));
        }
        this.mUploadButton.setEnabled(this.mSelected.size() != 0);
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        boolean z = true;
        super.onRestoreInstanceState(savedInstanceState);
        long[] selectedArray = savedInstanceState.getLongArray(BUNDLE_SELECTED_ITEMS_KEY);
        for (long j : selectedArray) {
            this.mSelected.add(Long.valueOf(j));
        }
        this.mToggled = savedInstanceState.getBoolean(BUNDLE_TOGGLED_KEY);
        this.mRestored = true;
        Button button = this.mUploadButton;
        if (selectedArray.length <= 0) {
            z = false;
        }
        button.setEnabled(z);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        long[] selectedArray = new long[this.mSelected.size()];
        for (int i = 0; i < this.mSelected.size(); i++) {
            selectedArray[i] = this.mSelected.get(i).longValue();
        }
        outState.putLongArray(BUNDLE_SELECTED_ITEMS_KEY, selectedArray);
        outState.putBoolean(BUNDLE_TOGGLED_KEY, this.mToggled);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (resultCode != 0) {
            switch (requestCode) {
                case 0:
                    if (intent.getBooleanExtra(FormEntryActivity.KEY_SUCCESS, false)) {
                        this.mSelected.clear();
                        getListView().clearChoices();
                        if (this.mInstances.isEmpty()) {
                            finish();
                            break;
                        }
                    }
                    break;
            }
            super.onActivityResult(requestCode, resultCode, intent);
        }
    }

    public void showUnsent() {
        this.mShowUnsent = true;
        Cursor c = this.mShowUnsent ? getUnsentCursor() : getAllCursor();
        Cursor old = this.mInstances.getCursor();
        try {
            this.mInstances.changeCursor(c);
            getListView().invalidate();
        } finally {
            if (old != null) {
                old.close();
                stopManagingCursor(old);
            }
        }
    }

    public void showAll() {
        this.mShowUnsent = false;
        Cursor c = this.mShowUnsent ? getUnsentCursor() : getAllCursor();
        Cursor old = this.mInstances.getCursor();
        try {
            this.mInstances.changeCursor(c);
            getListView().invalidate();
        } finally {
            if (old != null) {
                old.close();
                stopManagingCursor(old);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        Collect.getInstance().getActivityLogger().logAction(this, "toggleButton.longClick", Boolean.toString(this.mToggled));
        return showSentAndUnsentChoices();
    }

    private boolean showSentAndUnsentChoices() {
        String[] items = {getString(R.string.show_unsent_forms), getString(R.string.show_sent_and_unsent_forms)};
        Collect.getInstance().getActivityLogger().logAction(this, "changeView", "show");
        AlertDialog alertDialog = new AlertDialog.Builder(this).setIcon(17301659).setTitle(getString(R.string.change_view)).setNeutralButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderList.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int id) {
                Collect.getInstance().getActivityLogger().logAction(this, "changeView", "cancel");
                dialog.cancel();
            }
        }).setItems(items, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.InstanceUploaderList.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Collect.getInstance().getActivityLogger().logAction(this, "changeView", "showUnsent");
                        InstanceUploaderList.this.showUnsent();
                        return;
                    case 1:
                        Collect.getInstance().getActivityLogger().logAction(this, "changeView", "showAll");
                        InstanceUploaderList.this.showAll();
                        return;
                    default:
                        return;
                }
            }
        }).create();
        alertDialog.show();
        return true;
    }
}
