package androidx.fragment.app;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class r implements androidx.lifecycle.h {

    /* renamed from: b */
    private androidx.lifecycle.i f961b = null;

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.e a() {
        d();
        return this.f961b;
    }

    public void a(e.a aVar) {
        this.f961b.a(aVar);
    }

    public void d() {
        if (this.f961b == null) {
            this.f961b = new androidx.lifecycle.i(this);
        }
    }

    public boolean e() {
        return this.f961b != null;
    }
}
