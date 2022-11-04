package pd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.r1;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: k */
    public static final a0 f19047k;

    /* renamed from: l */
    public static final a0 f19048l;

    /* renamed from: n */
    public static final a0 f19050n;

    /* renamed from: o */
    public static final a0 f19051o;

    /* renamed from: p */
    public static final a0 f19052p;

    /* renamed from: q */
    public static final a0 f19053q;

    /* renamed from: r */
    public static final a0 f19054r;

    /* renamed from: s */
    public static final a0 f19055s;

    /* renamed from: a */
    private final boolean f19056a;

    /* renamed from: b */
    private final boolean f19057b;

    /* renamed from: c */
    private final boolean f19058c;

    /* renamed from: d */
    private final boolean f19059d;

    /* renamed from: e */
    private final boolean f19060e;

    /* renamed from: f */
    private final a0 f19061f;

    /* renamed from: g */
    private final boolean f19062g;

    /* renamed from: h */
    private final a0 f19063h;

    /* renamed from: i */
    private final a0 f19064i;

    /* renamed from: j */
    private final boolean f19065j;
    public static final a Companion = new a(null);

    /* renamed from: m */
    public static final a0 f19049m = new a0(false, true, false, false, false, null, false, null, null, false, 1021, null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19066a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.IN_VARIANCE.ordinal()] = 1;
            iArr[r1.INVARIANT.ordinal()] = 2;
            f19066a = iArr;
        }
    }

    static {
        a0 a0Var = new a0(false, false, false, false, false, null, false, null, null, false, 1023, null);
        f19047k = a0Var;
        a0 a0Var2 = new a0(false, false, false, false, false, null, false, null, null, true, 511, null);
        f19048l = a0Var2;
        f19050n = new a0(false, false, false, false, false, a0Var, false, null, null, false, 988, null);
        f19051o = new a0(false, false, false, false, false, a0Var2, false, null, null, true, 476, null);
        f19052p = new a0(false, true, false, false, false, a0Var, false, null, null, false, 988, null);
        f19053q = new a0(false, false, false, true, false, a0Var, false, null, null, false, 983, null);
        f19054r = new a0(false, false, false, true, false, a0Var, false, null, null, false, 919, null);
        f19055s = new a0(false, false, true, false, false, a0Var, false, null, null, false, 984, null);
    }

    public a0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, a0 a0Var, boolean z15, a0 a0Var2, a0 a0Var3, boolean z16) {
        this.f19056a = z10;
        this.f19057b = z11;
        this.f19058c = z12;
        this.f19059d = z13;
        this.f19060e = z14;
        this.f19061f = a0Var;
        this.f19062g = z15;
        this.f19063h = a0Var2;
        this.f19064i = a0Var3;
        this.f19065j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, pd.a0 r17, boolean r18, pd.a0 r19, pd.a0 r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = r5
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = r5
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.a0.<init>(boolean, boolean, boolean, boolean, boolean, pd.a0, boolean, pd.a0, pd.a0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean a() {
        return this.f19062g;
    }

    public final boolean b() {
        return this.f19065j;
    }

    public final boolean c() {
        return this.f19057b;
    }

    public final boolean d() {
        return this.f19056a;
    }

    public final boolean e() {
        return this.f19058c;
    }

    public final a0 f(r1 r1Var, boolean z10) {
        hc.t.e(r1Var, "effectiveVariance");
        if (!z10 || !this.f19058c) {
            int i10 = b.f19066a[r1Var.ordinal()];
            if (i10 == 1) {
                a0 a0Var = this.f19063h;
                if (a0Var != null) {
                    return a0Var;
                }
            } else if (i10 != 2) {
                a0 a0Var2 = this.f19061f;
                if (a0Var2 != null) {
                    return a0Var2;
                }
            } else {
                a0 a0Var3 = this.f19064i;
                if (a0Var3 != null) {
                    return a0Var3;
                }
            }
        }
        return this;
    }

    public final a0 g() {
        return new a0(this.f19056a, true, this.f19058c, this.f19059d, this.f19060e, this.f19061f, this.f19062g, this.f19063h, this.f19064i, false, 512, null);
    }
}
