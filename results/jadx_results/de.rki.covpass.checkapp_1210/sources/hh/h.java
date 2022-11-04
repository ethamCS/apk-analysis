package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class h extends gg.t {

    /* renamed from: c */
    private a[] f11966c;

    private h(gg.d0 d0Var) {
        if (d0Var.size() >= 1) {
            this.f11966c = new a[d0Var.size()];
            for (int i10 = 0; i10 != d0Var.size(); i10++) {
                this.f11966c[i10] = a.n(d0Var.G(i10));
            }
            return;
        }
        throw new IllegalArgumentException("sequence may not be empty");
    }

    private static a[] l(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        return aVarArr2;
    }

    public static h n(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj == null) {
            return null;
        }
        return new h(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return new x1(this.f11966c);
    }

    public a[] m() {
        return l(this.f11966c);
    }

    public String toString() {
        return "AuthorityInformationAccess: Oid(" + this.f11966c[0].m().H() + ")";
    }
}
