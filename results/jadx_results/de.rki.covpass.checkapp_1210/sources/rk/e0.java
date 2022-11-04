package rk;
/* loaded from: classes3.dex */
public enum e0 {
    DDRM(true, true, 64, n.class),
    FDRM(true, true, 32, y.class),
    ZDRM(false, true, 64, i0.class),
    CDRM(false, true, 32, d.class),
    DSCC(true, false, 64, o.class),
    FSCC(true, false, 32, z.class),
    ZSCC(false, false, 64, Object.class),
    CSCC(false, false, 32, Object.class),
    DTRIPLET(false, false, 64, p.class),
    FTRIPLET(false, false, 64, a0.class),
    UNSPECIFIED(false, false, 0, Object.class);
    

    /* renamed from: c */
    final boolean f21278c;

    /* renamed from: d */
    final boolean f21279d;

    /* renamed from: q */
    final boolean f21280q;

    /* renamed from: x */
    final int f21281x;

    /* renamed from: y */
    final Class<?> f21282y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21283a;

        static {
            int[] iArr = new int[e0.values().length];
            f21283a = iArr;
            try {
                iArr[e0.DDRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21283a[e0.FDRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21283a[e0.ZDRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21283a[e0.CDRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21283a[e0.DSCC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21283a[e0.FSCC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    e0(boolean z10, boolean z11, int i10, Class cls) {
        this(false, z10, z11, i10, cls);
    }

    e0(boolean z10, boolean z11, boolean z12, int i10, Class cls) {
        this.f21280q = z11;
        this.f21278c = z10;
        this.f21279d = z12;
        this.f21281x = i10;
        this.f21282y = cls;
    }

    public static e0 r(boolean z10, boolean z11, int i10) {
        if (z10) {
            return z11 ? i10 == 64 ? DDRM : FDRM : i10 == 64 ? ZDRM : CDRM;
        } else if (!z11) {
            throw new IllegalArgumentException("Complex sparse not yet supported");
        } else {
            return i10 == 64 ? DSCC : FSCC;
        }
    }

    public c0 T(int i10, int i11) {
        switch (a.f21283a[ordinal()]) {
            case 1:
                return new n(i10, i11);
            case 2:
                return new y(i10, i11);
            case 3:
                return new i0(i10, i11);
            case 4:
                return new d(i10, i11);
            case 5:
                return new o(i10, i11);
            case 6:
                return new z(i10, i11);
            default:
                throw new RuntimeException("Unknown Matrix Type " + this);
        }
    }

    public int g() {
        return this.f21281x;
    }

    public Class h() {
        return this.f21282y;
    }

    public boolean j() {
        return this.f21279d;
    }

    public boolean p() {
        return this.f21280q;
    }
}
