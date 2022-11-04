package org.odk.collect.android.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import org.odk.collect.android.R;
import org.odk.collect.android.provider.FormsProviderAPI;
/* loaded from: classes.dex */
public class AndroidShortcuts extends Activity {
    private Uri[] mCommands;
    private String[] mNames;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("android.intent.action.CREATE_SHORTCUT".equals(action)) {
            buildMenuList();
        }
    }

    private void buildMenuList() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Uri> commands = new ArrayList<>();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select ODK Shortcut");
        Cursor c = null;
        try {
            c = getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, null, null, null, null);
            if (c.getCount() > 0) {
                c.moveToPosition(-1);
                while (c.moveToNext()) {
                    String formName = c.getString(c.getColumnIndex("displayName"));
                    names.add(formName);
                    Uri uri = Uri.withAppendedPath(FormsProviderAPI.FormsColumns.CONTENT_URI, c.getString(c.getColumnIndex("_id")));
                    commands.add(uri);
                }
            }
            this.mNames = (String[]) names.toArray(new String[0]);
            this.mCommands = (Uri[]) commands.toArray(new Uri[0]);
            builder.setItems(this.mNames, new DialogInterface.OnClickListener() { // from class: org.odk.collect.android.activities.AndroidShortcuts.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int item) {
                    AndroidShortcuts.this.returnShortcut(AndroidShortcuts.this.mNames[item], AndroidShortcuts.this.mCommands[item]);
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.odk.collect.android.activities.AndroidShortcuts.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialog) {
                    AndroidShortcuts sc = AndroidShortcuts.this;
                    sc.setResult(0);
                    sc.finish();
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public void returnShortcut(String name, Uri command) {
        Intent shortcutIntent = new Intent("android.intent.action.VIEW");
        shortcutIntent.setData(command);
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.INTENT", shortcutIntent);
        intent.putExtra("android.intent.extra.shortcut.NAME", name);
        Parcelable iconResource = Intent.ShortcutIconResource.fromContext(this, R.drawable.notes);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", iconResource);
        setResult(-1, intent);
        finish();
    }
}
