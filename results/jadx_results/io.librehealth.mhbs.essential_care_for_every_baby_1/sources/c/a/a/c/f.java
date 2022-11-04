package c.a.a.c;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: classes.dex */
class f extends a {

    /* renamed from: b */
    private static final Uri f376b = Uri.parse("content://com.sec.badge/apps");

    public f(Context context) {
        super(context);
    }

    @Override // c.a.a.c.a
    public void c(int i) {
        try {
            ContentResolver contentResolver = this.f373a.getContentResolver();
            Uri uri = f376b;
            Cursor query = contentResolver.query(uri, new String[]{"_id"}, "package=?", new String[]{b()}, null);
            if (query != null && query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("_id");
                ContentValues contentValues = new ContentValues();
                contentValues.put("badgeCount", Integer.valueOf(i));
                contentResolver.update(uri, contentValues, "_id=?", new String[]{String.valueOf(query.getInt(columnIndex))});
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("package", b());
            contentValues2.put("class", a());
            contentValues2.put("badgeCount", Integer.valueOf(i));
            contentResolver.insert(uri, contentValues2);
        } catch (Exception unused) {
            throw new UnsupportedOperationException();
        }
    }
}
