package b.c.a;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import b.c.a.s;
import b.c.a.x;
/* loaded from: classes.dex */
public class k extends g {
    public k(Context context) {
        super(context);
    }

    static int a(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt != 3) {
            if (attributeInt == 6) {
                return 90;
            }
            return attributeInt != 8 ? 0 : 270;
        }
        return 180;
    }

    @Override // b.c.a.g, b.c.a.x
    public x.a a(v vVar, int i) {
        return new x.a(null, c(vVar), s.e.DISK, a(vVar.d));
    }

    @Override // b.c.a.g, b.c.a.x
    public boolean a(v vVar) {
        return "file".equals(vVar.d.getScheme());
    }
}
