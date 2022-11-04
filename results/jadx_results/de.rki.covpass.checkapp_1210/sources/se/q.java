package se;

import oe.r1;
/* loaded from: classes3.dex */
public final class q {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21674a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            f21674a = iArr;
        }
    }

    public static final u a(r1 r1Var) {
        hc.t.e(r1Var, "<this>");
        int i10 = a.f21674a[r1Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return u.IN;
            }
            if (i10 != 3) {
                throw new tb.p();
            }
            return u.OUT;
        }
        return u.INV;
    }
}
