package b.c.a;

import android.content.Context;
import b.c.a.s;
import b.c.a.x;
import java.io.InputStream;
/* loaded from: classes.dex */
public class g extends x {

    /* renamed from: a */
    final Context f1289a;

    public g(Context context) {
        this.f1289a = context;
    }

    @Override // b.c.a.x
    public x.a a(v vVar, int i) {
        return new x.a(c(vVar), s.e.DISK);
    }

    @Override // b.c.a.x
    public boolean a(v vVar) {
        return "content".equals(vVar.d.getScheme());
    }

    public InputStream c(v vVar) {
        return this.f1289a.getContentResolver().openInputStream(vVar.d);
    }
}
