package fh;

import gg.a0;
import gg.d0;
import gg.f;
import gg.g;
import gg.j0;
import gg.t;
import gg.v;
import gg.x1;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class c extends t implements f {
    private static e U3 = gh.c.Q;

    /* renamed from: c */
    private boolean f10203c;

    /* renamed from: d */
    private int f10204d;

    /* renamed from: q */
    private e f10205q;

    /* renamed from: x */
    private b[] f10206x;

    /* renamed from: y */
    private x1 f10207y;

    public c(e eVar, c cVar) {
        this.f10205q = eVar;
        this.f10206x = cVar.f10206x;
        this.f10207y = cVar.f10207y;
    }

    private c(e eVar, d0 d0Var) {
        this.f10205q = eVar;
        this.f10206x = new b[d0Var.size()];
        Enumeration H = d0Var.H();
        int i10 = 0;
        boolean z10 = true;
        while (H.hasMoreElements()) {
            Object nextElement = H.nextElement();
            b n10 = b.n(nextElement);
            z10 &= n10 == nextElement;
            this.f10206x[i10] = n10;
            i10++;
        }
        this.f10207y = z10 ? x1.O(d0Var) : new x1(this.f10206x);
    }

    public c(e eVar, String str) {
        this(eVar.c(str));
        this.f10205q = eVar;
    }

    public c(e eVar, b[] bVarArr) {
        this.f10205q = eVar;
        this.f10206x = (b[]) bVarArr.clone();
        this.f10207y = new x1(this.f10206x);
    }

    private c(d0 d0Var) {
        this(U3, d0Var);
    }

    public c(String str) {
        this(U3, str);
    }

    public c(b[] bVarArr) {
        this(U3, bVarArr);
    }

    public static c l(e eVar, Object obj) {
        if (obj instanceof c) {
            return new c(eVar, (c) obj);
        }
        if (obj == null) {
            return null;
        }
        return new c(eVar, d0.F(obj));
    }

    public static c m(j0 j0Var, boolean z10) {
        return n(d0.E(j0Var, true));
    }

    public static c n(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f10207y;
    }

    @Override // gg.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) && !(obj instanceof d0)) {
            return false;
        }
        if (b().s(((g) obj).b())) {
            return true;
        }
        try {
            return this.f10205q.b(this, new c(d0.F(((g) obj).b())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // gg.t
    public int hashCode() {
        if (this.f10203c) {
            return this.f10204d;
        }
        this.f10203c = true;
        int f10 = this.f10205q.f(this);
        this.f10204d = f10;
        return f10;
    }

    public b[] o() {
        return (b[]) this.f10206x.clone();
    }

    public b[] q(v vVar) {
        int length = this.f10206x.length;
        b[] bVarArr = new b[length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            b[] bVarArr2 = this.f10206x;
            if (i10 == bVarArr2.length) {
                break;
            }
            b bVar = bVarArr2[i10];
            if (bVar.l(vVar)) {
                bVarArr[i11] = bVar;
                i11++;
            }
            i10++;
        }
        if (i11 < length) {
            b[] bVarArr3 = new b[i11];
            System.arraycopy(bVarArr, 0, bVarArr3, 0, i11);
            return bVarArr3;
        }
        return bVarArr;
    }

    public String toString() {
        return this.f10205q.e(this);
    }
}
