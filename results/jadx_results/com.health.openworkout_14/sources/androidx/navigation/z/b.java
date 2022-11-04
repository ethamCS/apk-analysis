package androidx.navigation.z;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: f */
    private final androidx.appcompat.app.d f1412f;

    public b(androidx.appcompat.app.d dVar, c cVar) {
        super(dVar.z().b(), cVar);
        this.f1412f = dVar;
    }

    @Override // androidx.navigation.z.a
    protected void c(Drawable drawable, int i) {
        androidx.appcompat.app.a A = this.f1412f.A();
        if (drawable == null) {
            A.s(false);
            return;
        }
        A.s(true);
        this.f1412f.z().a(drawable, i);
    }

    @Override // androidx.navigation.z.a
    protected void d(CharSequence charSequence) {
        this.f1412f.A().w(charSequence);
    }
}
