package org.odk.collect.android.utilities;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class VersionHidingCursorAdapter extends SimpleCursorAdapter {
    private final Context ctxt;
    private final SimpleCursorAdapter.ViewBinder originalBinder = getViewBinder();
    private final String versionColumnName;

    public VersionHidingCursorAdapter(String versionColumnName, Context context, int layout, Cursor c, String[] from, int[] to) {
        super(context, layout, c, from, to);
        this.versionColumnName = versionColumnName;
        this.ctxt = context;
        setViewBinder(new SimpleCursorAdapter.ViewBinder() { // from class: org.odk.collect.android.utilities.VersionHidingCursorAdapter.1
            @Override // android.widget.SimpleCursorAdapter.ViewBinder
            public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
                String columnName = cursor.getColumnName(columnIndex);
                if (!columnName.equals(VersionHidingCursorAdapter.this.versionColumnName)) {
                    if (VersionHidingCursorAdapter.this.originalBinder == null) {
                        return false;
                    }
                    return VersionHidingCursorAdapter.this.originalBinder.setViewValue(view, cursor, columnIndex);
                }
                String version = cursor.getString(columnIndex);
                TextView v = (TextView) view;
                if (version != null) {
                    v.setText(VersionHidingCursorAdapter.this.ctxt.getString(R.string.version) + XFormAnswerDataSerializer.DELIMITER + version);
                    v.setVisibility(0);
                } else {
                    v.setText((CharSequence) null);
                    v.setVisibility(8);
                }
                return true;
            }
        });
    }
}
