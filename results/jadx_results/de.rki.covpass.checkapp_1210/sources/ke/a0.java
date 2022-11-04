package ke;

import oe.r1;
import rd.c;
import rd.q;
import rd.s;
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a */
    public static final a0 f15009a = new a0();

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15010a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15011b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f15012c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f15013d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f15014e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f15015f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f15016g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f15017h;

        static {
            int[] iArr = new int[rd.k.values().length];
            iArr[rd.k.FINAL.ordinal()] = 1;
            iArr[rd.k.OPEN.ordinal()] = 2;
            iArr[rd.k.ABSTRACT.ordinal()] = 3;
            iArr[rd.k.SEALED.ordinal()] = 4;
            f15010a = iArr;
            int[] iArr2 = new int[xc.e0.values().length];
            iArr2[xc.e0.FINAL.ordinal()] = 1;
            iArr2[xc.e0.OPEN.ordinal()] = 2;
            iArr2[xc.e0.ABSTRACT.ordinal()] = 3;
            iArr2[xc.e0.SEALED.ordinal()] = 4;
            f15011b = iArr2;
            int[] iArr3 = new int[rd.x.values().length];
            iArr3[rd.x.INTERNAL.ordinal()] = 1;
            iArr3[rd.x.PRIVATE.ordinal()] = 2;
            iArr3[rd.x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[rd.x.PROTECTED.ordinal()] = 4;
            iArr3[rd.x.PUBLIC.ordinal()] = 5;
            iArr3[rd.x.LOCAL.ordinal()] = 6;
            f15012c = iArr3;
            int[] iArr4 = new int[c.EnumC0343c.values().length];
            iArr4[c.EnumC0343c.CLASS.ordinal()] = 1;
            iArr4[c.EnumC0343c.INTERFACE.ordinal()] = 2;
            iArr4[c.EnumC0343c.ENUM_CLASS.ordinal()] = 3;
            iArr4[c.EnumC0343c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[c.EnumC0343c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[c.EnumC0343c.OBJECT.ordinal()] = 6;
            iArr4[c.EnumC0343c.COMPANION_OBJECT.ordinal()] = 7;
            f15013d = iArr4;
            int[] iArr5 = new int[xc.f.values().length];
            iArr5[xc.f.CLASS.ordinal()] = 1;
            iArr5[xc.f.INTERFACE.ordinal()] = 2;
            iArr5[xc.f.ENUM_CLASS.ordinal()] = 3;
            iArr5[xc.f.ENUM_ENTRY.ordinal()] = 4;
            iArr5[xc.f.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[xc.f.OBJECT.ordinal()] = 6;
            f15014e = iArr5;
            int[] iArr6 = new int[s.c.values().length];
            iArr6[s.c.IN.ordinal()] = 1;
            iArr6[s.c.OUT.ordinal()] = 2;
            iArr6[s.c.INV.ordinal()] = 3;
            f15015f = iArr6;
            int[] iArr7 = new int[q.b.c.values().length];
            iArr7[q.b.c.IN.ordinal()] = 1;
            iArr7[q.b.c.OUT.ordinal()] = 2;
            iArr7[q.b.c.INV.ordinal()] = 3;
            iArr7[q.b.c.STAR.ordinal()] = 4;
            f15016g = iArr7;
            int[] iArr8 = new int[r1.values().length];
            iArr8[r1.IN_VARIANCE.ordinal()] = 1;
            iArr8[r1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[r1.INVARIANT.ordinal()] = 3;
            f15017h = iArr8;
        }
    }

    private a0() {
    }

    public final xc.f a(c.EnumC0343c enumC0343c) {
        switch (enumC0343c == null ? -1 : a.f15013d[enumC0343c.ordinal()]) {
            case 1:
            default:
                return xc.f.CLASS;
            case 2:
                return xc.f.INTERFACE;
            case 3:
                return xc.f.ENUM_CLASS;
            case 4:
                return xc.f.ENUM_ENTRY;
            case 5:
                return xc.f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return xc.f.OBJECT;
        }
    }

    public final xc.e0 b(rd.k kVar) {
        int i10 = kVar == null ? -1 : a.f15010a[kVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return xc.e0.OPEN;
            }
            if (i10 == 3) {
                return xc.e0.ABSTRACT;
            }
            if (i10 == 4) {
                return xc.e0.SEALED;
            }
        }
        return xc.e0.FINAL;
    }

    public final r1 c(q.b.c cVar) {
        hc.t.e(cVar, "projection");
        int i10 = a.f15016g[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return r1.OUT_VARIANCE;
            }
            if (i10 == 3) {
                return r1.INVARIANT;
            }
            if (i10 != 4) {
                throw new tb.p();
            }
            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
        }
        return r1.IN_VARIANCE;
    }

    public final r1 d(s.c cVar) {
        hc.t.e(cVar, "variance");
        int i10 = a.f15015f[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return r1.OUT_VARIANCE;
            }
            if (i10 != 3) {
                throw new tb.p();
            }
            return r1.INVARIANT;
        }
        return r1.IN_VARIANCE;
    }
}
