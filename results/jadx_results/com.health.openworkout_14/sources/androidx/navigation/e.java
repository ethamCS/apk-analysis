package androidx.navigation;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final s f1289a;

    /* renamed from: b */
    private final boolean f1290b;

    /* renamed from: c */
    private final boolean f1291c;

    /* renamed from: d */
    private final Object f1292d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private s<?> f1293a;

        /* renamed from: c */
        private Object f1295c;

        /* renamed from: b */
        private boolean f1294b = false;

        /* renamed from: d */
        private boolean f1296d = false;

        public e a() {
            if (this.f1293a == null) {
                this.f1293a = s.e(this.f1295c);
            }
            return new e(this.f1293a, this.f1294b, this.f1295c, this.f1296d);
        }

        public a b(Object obj) {
            this.f1295c = obj;
            this.f1296d = true;
            return this;
        }

        public a c(boolean z) {
            this.f1294b = z;
            return this;
        }

        public a d(s<?> sVar) {
            this.f1293a = sVar;
            return this;
        }
    }

    e(s<?> sVar, boolean z, Object obj, boolean z2) {
        if (!sVar.f() && z) {
            throw new IllegalArgumentException(sVar.c() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.f1289a = sVar;
            this.f1290b = z;
            this.f1292d = obj;
            this.f1291c = z2;
        } else {
            throw new IllegalArgumentException("Argument with type " + sVar.c() + " has null value but is not nullable.");
        }
    }

    public Object a() {
        return this.f1292d;
    }

    public s<?> b() {
        return this.f1289a;
    }

    public boolean c() {
        return this.f1291c;
    }

    public boolean d() {
        return this.f1290b;
    }

    public void e(String str, Bundle bundle) {
        if (this.f1291c) {
            this.f1289a.i(bundle, str, this.f1292d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1290b != eVar.f1290b || this.f1291c != eVar.f1291c || !this.f1289a.equals(eVar.f1289a)) {
            return false;
        }
        Object obj2 = this.f1292d;
        Object obj3 = eVar.f1292d;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public boolean f(String str, Bundle bundle) {
        if (this.f1290b || !bundle.containsKey(str) || bundle.get(str) != null) {
            try {
                this.f1289a.b(bundle, str);
                return true;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f1289a.hashCode() * 31) + (this.f1290b ? 1 : 0)) * 31) + (this.f1291c ? 1 : 0)) * 31;
        Object obj = this.f1292d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
