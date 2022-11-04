package b.c.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import b.c.a.s;
import b.c.a.x;
/* loaded from: classes.dex */
public class o extends g {

    /* renamed from: b */
    private static final String[] f1308b = {"orientation"};

    /* loaded from: classes.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: b */
        final int f1309b;

        /* renamed from: c */
        final int f1310c;
        final int d;

        a(int i, int i2, int i3) {
            this.f1309b = i;
            this.f1310c = i2;
            this.d = i3;
        }
    }

    public o(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = b.c.a.o.f1308b     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L26 java.lang.RuntimeException -> L2d
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            return r8
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            r8 = move-exception
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            throw r8
        L2d:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.o.a(android.content.ContentResolver, android.net.Uri):int");
    }

    static a a(int i, int i2) {
        a aVar = a.MICRO;
        if (i > aVar.f1310c || i2 > aVar.d) {
            a aVar2 = a.MINI;
            return (i > aVar2.f1310c || i2 > aVar2.d) ? a.FULL : aVar2;
        }
        return aVar;
    }

    @Override // b.c.a.g, b.c.a.x
    public x.a a(v vVar, int i) {
        Bitmap bitmap;
        ContentResolver contentResolver = this.f1289a.getContentResolver();
        int a2 = a(contentResolver, vVar.d);
        String type = contentResolver.getType(vVar.d);
        boolean z = type != null && type.startsWith("video/");
        if (vVar.c()) {
            a a3 = a(vVar.h, vVar.i);
            if (!z && a3 == a.FULL) {
                return new x.a(null, c(vVar), s.e.DISK, a2);
            }
            long parseId = ContentUris.parseId(vVar.d);
            BitmapFactory.Options b2 = x.b(vVar);
            b2.inJustDecodeBounds = true;
            x.a(vVar.h, vVar.i, a3.f1310c, a3.d, b2, vVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, a3 == a.FULL ? 1 : a3.f1309b, b2);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, a3.f1309b, b2);
            }
            if (bitmap != null) {
                return new x.a(bitmap, null, s.e.DISK, a2);
            }
        }
        return new x.a(null, c(vVar), s.e.DISK, a2);
    }

    @Override // b.c.a.g, b.c.a.x
    public boolean a(v vVar) {
        Uri uri = vVar.d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
