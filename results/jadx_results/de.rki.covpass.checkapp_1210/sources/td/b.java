package td;

import rd.c;
import rd.j;
import rd.k;
import rd.x;
import yd.j;
/* loaded from: classes.dex */
public class b {
    public static final C0392b A;
    public static final C0392b B;
    public static final C0392b C;
    public static final C0392b D;
    public static final C0392b E;
    public static final C0392b F;
    public static final C0392b G;
    public static final C0392b H;
    public static final C0392b I;
    public static final C0392b J;
    public static final C0392b K;
    public static final C0392b L;
    public static final C0392b M;
    public static final C0392b N;
    public static final C0392b O = d.c();

    /* renamed from: a */
    public static final C0392b f22192a;

    /* renamed from: b */
    public static final C0392b f22193b;

    /* renamed from: c */
    public static final C0392b f22194c;

    /* renamed from: d */
    public static final d<x> f22195d;

    /* renamed from: e */
    public static final d<k> f22196e;

    /* renamed from: f */
    public static final d<c.EnumC0343c> f22197f;

    /* renamed from: g */
    public static final C0392b f22198g;

    /* renamed from: h */
    public static final C0392b f22199h;

    /* renamed from: i */
    public static final C0392b f22200i;

    /* renamed from: j */
    public static final C0392b f22201j;

    /* renamed from: k */
    public static final C0392b f22202k;

    /* renamed from: l */
    public static final C0392b f22203l;

    /* renamed from: m */
    public static final C0392b f22204m;

    /* renamed from: n */
    public static final C0392b f22205n;

    /* renamed from: o */
    public static final d<j> f22206o;

    /* renamed from: p */
    public static final C0392b f22207p;

    /* renamed from: q */
    public static final C0392b f22208q;

    /* renamed from: r */
    public static final C0392b f22209r;

    /* renamed from: s */
    public static final C0392b f22210s;

    /* renamed from: t */
    public static final C0392b f22211t;

    /* renamed from: u */
    public static final C0392b f22212u;

    /* renamed from: v */
    public static final C0392b f22213v;

    /* renamed from: w */
    public static final C0392b f22214w;

    /* renamed from: x */
    public static final C0392b f22215x;

    /* renamed from: y */
    public static final C0392b f22216y;

    /* renamed from: z */
    public static final C0392b f22217z;

    /* renamed from: td.b$b */
    /* loaded from: classes.dex */
    public static class C0392b extends d<Boolean> {
        public C0392b(int i10) {
            super(i10, 1);
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        /* renamed from: g */
        public Boolean d(int i10) {
            boolean z10 = true;
            if ((i10 & (1 << this.f22219a)) == 0) {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            if (valueOf == null) {
                f(0);
            }
            return valueOf;
        }

        /* renamed from: h */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f22219a;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c<E extends j.a> extends d<E> {

        /* renamed from: c */
        private final E[] f22218c;

        public c(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f22218c = eArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* renamed from: h */
        public E d(int i10) {
            E[] eArr;
            int i11 = this.f22219a;
            int i12 = (i10 & (((1 << this.f22220b) - 1) << i11)) >> i11;
            for (E e10 : this.f22218c) {
                if (e10.c() == i12) {
                    return e10;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int e(E e10) {
            return e10.c() << this.f22219a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<E> {

        /* renamed from: a */
        public final int f22219a;

        /* renamed from: b */
        public final int f22220b;

        private d(int i10, int i11) {
            this.f22219a = i10;
            this.f22220b = i11;
        }

        public static d a(d dVar, j.a[] aVarArr) {
            return new c(dVar.f22219a + dVar.f22220b, aVarArr);
        }

        public static C0392b b(d<?> dVar) {
            return new C0392b(dVar.f22219a + dVar.f22220b);
        }

        public static C0392b c() {
            return new C0392b(0);
        }

        public abstract E d(int i10);

        public abstract int e(E e10);
    }

    static {
        C0392b c10 = d.c();
        f22192a = c10;
        f22193b = d.b(c10);
        C0392b c11 = d.c();
        f22194c = c11;
        d<x> a10 = d.a(c11, x.values());
        f22195d = a10;
        d<k> a11 = d.a(a10, k.values());
        f22196e = a11;
        d<c.EnumC0343c> a12 = d.a(a11, c.EnumC0343c.values());
        f22197f = a12;
        C0392b b10 = d.b(a12);
        f22198g = b10;
        C0392b b11 = d.b(b10);
        f22199h = b11;
        C0392b b12 = d.b(b11);
        f22200i = b12;
        C0392b b13 = d.b(b12);
        f22201j = b13;
        C0392b b14 = d.b(b13);
        f22202k = b14;
        f22203l = d.b(b14);
        C0392b b15 = d.b(a10);
        f22204m = b15;
        f22205n = d.b(b15);
        d<rd.j> a13 = d.a(a11, rd.j.values());
        f22206o = a13;
        C0392b b16 = d.b(a13);
        f22207p = b16;
        C0392b b17 = d.b(b16);
        f22208q = b17;
        C0392b b18 = d.b(b17);
        f22209r = b18;
        C0392b b19 = d.b(b18);
        f22210s = b19;
        C0392b b20 = d.b(b19);
        f22211t = b20;
        C0392b b21 = d.b(b20);
        f22212u = b21;
        C0392b b22 = d.b(b21);
        f22213v = b22;
        f22214w = d.b(b22);
        C0392b b23 = d.b(a13);
        f22215x = b23;
        C0392b b24 = d.b(b23);
        f22216y = b24;
        C0392b b25 = d.b(b24);
        f22217z = b25;
        C0392b b26 = d.b(b25);
        A = b26;
        C0392b b27 = d.b(b26);
        B = b27;
        C0392b b28 = d.b(b27);
        C = b28;
        C0392b b29 = d.b(b28);
        D = b29;
        C0392b b30 = d.b(b29);
        E = b30;
        F = d.b(b30);
        C0392b b31 = d.b(c11);
        G = b31;
        C0392b b32 = d.b(b31);
        H = b32;
        I = d.b(b32);
        C0392b b33 = d.b(a11);
        J = b33;
        C0392b b34 = d.b(b33);
        K = b34;
        L = d.b(b34);
        C0392b c12 = d.c();
        M = c12;
        N = d.b(c12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td.b.a(int):void");
    }

    public static int b(boolean z10, x xVar, k kVar, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (kVar == null) {
            a(11);
        }
        return f22194c.e(Boolean.valueOf(z10)) | f22196e.e(kVar) | f22195d.e(xVar) | J.e(Boolean.valueOf(z11)) | K.e(Boolean.valueOf(z12)) | L.e(Boolean.valueOf(z13));
    }
}
