package h6;

import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final b f11324a;

    /* renamed from: b */
    private o6.b f11325b;

    public c(b bVar) {
        if (bVar != null) {
            this.f11324a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public o6.b a() {
        if (this.f11325b == null) {
            this.f11325b = this.f11324a.b();
        }
        return this.f11325b;
    }

    public o6.a b(int i10, o6.a aVar) {
        return this.f11324a.c(i10, aVar);
    }

    public int c() {
        return this.f11324a.d();
    }

    public int d() {
        return this.f11324a.f();
    }

    public boolean e() {
        return this.f11324a.e().f();
    }

    public c f() {
        return new c(this.f11324a.a(this.f11324a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (m unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
