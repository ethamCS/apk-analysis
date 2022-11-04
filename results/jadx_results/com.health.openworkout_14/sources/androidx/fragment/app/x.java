package androidx.fragment.app;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class x implements androidx.lifecycle.i {

    /* renamed from: b */
    private androidx.lifecycle.j f1195b = null;

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        e();
        return this.f1195b;
    }

    public void b(e.a aVar) {
        this.f1195b.i(aVar);
    }

    public void e() {
        if (this.f1195b == null) {
            this.f1195b = new androidx.lifecycle.j(this);
        }
    }

    public boolean f() {
        return this.f1195b != null;
    }
}
