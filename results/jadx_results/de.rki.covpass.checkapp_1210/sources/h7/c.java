package h7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c extends Enum<c> {
    public static final c U3;
    public static final c V3;
    public static final c W3;
    private static final /* synthetic */ c[] X3;

    /* renamed from: c */
    public static final c f11381c;

    /* renamed from: d */
    public static final c f11382d;

    /* renamed from: q */
    public static final c f11383q;

    /* renamed from: x */
    public static final c f11384x;

    /* renamed from: y */
    public static final c f11385y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // h7.c
        boolean b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f11381c = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: h7.c.b
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f11382d = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: h7.c.c
            @Override // h7.c
            boolean b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f11383q = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: h7.c.d
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f11384x = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: h7.c.e
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f11385y = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: h7.c.f
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        U3 = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: h7.c.g
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        V3 = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: h7.c.h
            @Override // h7.c
            boolean b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        W3 = cVar7;
        X3 = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) X3.clone();
    }

    abstract boolean b(int i10, int i11);

    public final void g(o6.b bVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i11, i12)) {
                    bVar.e(i12, i11);
                }
            }
        }
    }
}
