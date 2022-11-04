package hc;

import java.io.Serializable;
/* loaded from: classes.dex */
public class a implements o, Serializable {
    private final int U3;
    private final int V3;

    /* renamed from: c */
    protected final Object f11741c;

    /* renamed from: d */
    private final Class f11742d;

    /* renamed from: q */
    private final String f11743q;

    /* renamed from: x */
    private final String f11744x;

    /* renamed from: y */
    private final boolean f11745y;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f11741c = obj;
        this.f11742d = cls;
        this.f11743q = str;
        this.f11744x = str2;
        this.f11745y = (i11 & 1) == 1;
        this.U3 = i10;
        this.V3 = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11745y == aVar.f11745y && this.U3 == aVar.U3 && this.V3 == aVar.V3 && t.a(this.f11741c, aVar.f11741c) && t.a(this.f11742d, aVar.f11742d) && this.f11743q.equals(aVar.f11743q) && this.f11744x.equals(aVar.f11744x);
    }

    @Override // hc.o
    public int getArity() {
        return this.U3;
    }

    public int hashCode() {
        Object obj = this.f11741c;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f11742d;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        return ((((((((((hashCode + i10) * 31) + this.f11743q.hashCode()) * 31) + this.f11744x.hashCode()) * 31) + (this.f11745y ? 1231 : 1237)) * 31) + this.U3) * 31) + this.V3;
    }

    public String toString() {
        return k0.h(this);
    }
}
