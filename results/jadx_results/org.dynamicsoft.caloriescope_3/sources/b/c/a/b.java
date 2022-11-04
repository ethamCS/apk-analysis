package b.c.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import b.c.a.s;
import b.c.a.x;
/* loaded from: classes.dex */
public class b extends x {

    /* renamed from: b */
    private static final int f1274b = 22;

    /* renamed from: a */
    private final AssetManager f1275a;

    public b(Context context) {
        this.f1275a = context.getAssets();
    }

    static String c(v vVar) {
        return vVar.d.toString().substring(f1274b);
    }

    @Override // b.c.a.x
    public x.a a(v vVar, int i) {
        return new x.a(this.f1275a.open(c(vVar)), s.e.DISK);
    }

    @Override // b.c.a.x
    public boolean a(v vVar) {
        Uri uri = vVar.d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
