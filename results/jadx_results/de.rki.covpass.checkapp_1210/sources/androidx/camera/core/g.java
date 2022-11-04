package androidx.camera.core;

import androidx.camera.core.t;
/* loaded from: classes.dex */
public final class g extends t.a {

    /* renamed from: a */
    private final int f2177a;

    /* renamed from: b */
    private final Throwable f2178b;

    public g(int i10, Throwable th2) {
        this.f2177a = i10;
        this.f2178b = th2;
    }

    @Override // androidx.camera.core.t.a
    public Throwable c() {
        return this.f2178b;
    }

    @Override // androidx.camera.core.t.a
    public int d() {
        return this.f2177a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        if (this.f2177a == aVar.d()) {
            Throwable th2 = this.f2178b;
            Throwable c10 = aVar.c();
            if (th2 == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (th2.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f2177a ^ 1000003) * 1000003;
        Throwable th2 = this.f2178b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f2177a + ", cause=" + this.f2178b + "}";
    }
}
