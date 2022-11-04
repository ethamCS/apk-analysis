package b.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b.c.a.s;
import b.c.a.x;
/* loaded from: classes.dex */
public class y extends x {

    /* renamed from: a */
    private final Context f1347a;

    public y(Context context) {
        this.f1347a = context;
    }

    private static Bitmap a(Resources resources, int i, v vVar) {
        BitmapFactory.Options b2 = x.b(vVar);
        if (x.a(b2)) {
            BitmapFactory.decodeResource(resources, i, b2);
            x.a(vVar.h, vVar.i, b2, vVar);
        }
        return BitmapFactory.decodeResource(resources, i, b2);
    }

    @Override // b.c.a.x
    public x.a a(v vVar, int i) {
        Resources a2 = d0.a(this.f1347a, vVar);
        return new x.a(a(a2, d0.a(a2, vVar), vVar), s.e.DISK);
    }

    @Override // b.c.a.x
    public boolean a(v vVar) {
        if (vVar.e != 0) {
            return true;
        }
        return "android.resource".equals(vVar.d.getScheme());
    }
}
