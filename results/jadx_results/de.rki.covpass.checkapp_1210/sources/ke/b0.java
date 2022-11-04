package ke;

import xc.b;
/* loaded from: classes3.dex */
public final class b0 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15023a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15024b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f15025c;

        static {
            int[] iArr = new int[rd.j.values().length];
            iArr[rd.j.DECLARATION.ordinal()] = 1;
            iArr[rd.j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[rd.j.DELEGATION.ordinal()] = 3;
            iArr[rd.j.SYNTHESIZED.ordinal()] = 4;
            f15023a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            iArr2[b.a.DECLARATION.ordinal()] = 1;
            iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[b.a.DELEGATION.ordinal()] = 3;
            iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            f15024b = iArr2;
            int[] iArr3 = new int[rd.x.values().length];
            iArr3[rd.x.INTERNAL.ordinal()] = 1;
            iArr3[rd.x.PRIVATE.ordinal()] = 2;
            iArr3[rd.x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[rd.x.PROTECTED.ordinal()] = 4;
            iArr3[rd.x.PUBLIC.ordinal()] = 5;
            iArr3[rd.x.LOCAL.ordinal()] = 6;
            f15025c = iArr3;
        }
    }

    public static final xc.u a(a0 a0Var, rd.x xVar) {
        xc.u uVar;
        hc.t.e(a0Var, "<this>");
        int i10 = xVar == null ? -1 : a.f15025c[xVar.ordinal()];
        String str = "PRIVATE";
        switch (i10) {
            case 1:
                uVar = xc.t.f25580d;
                str = "INTERNAL";
                break;
            case 2:
            default:
                uVar = xc.t.f25577a;
                break;
            case 3:
                uVar = xc.t.f25578b;
                str = "PRIVATE_TO_THIS";
                break;
            case 4:
                uVar = xc.t.f25579c;
                str = "PROTECTED";
                break;
            case 5:
                uVar = xc.t.f25581e;
                str = "PUBLIC";
                break;
            case 6:
                uVar = xc.t.f25582f;
                str = "LOCAL";
                break;
        }
        hc.t.d(uVar, str);
        return uVar;
    }

    public static final b.a b(a0 a0Var, rd.j jVar) {
        hc.t.e(a0Var, "<this>");
        int i10 = jVar == null ? -1 : a.f15023a[jVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return b.a.FAKE_OVERRIDE;
            }
            if (i10 == 3) {
                return b.a.DELEGATION;
            }
            if (i10 == 4) {
                return b.a.SYNTHESIZED;
            }
        }
        return b.a.DECLARATION;
    }
}
