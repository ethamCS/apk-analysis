package rd;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import rd.q;
import rd.t;
import rd.w;
import yd.a;
import yd.d;
import yd.i;
import yd.j;
/* loaded from: classes.dex */
public final class c extends i.d<c> {
    public static yd.s<c> A4 = new a();

    /* renamed from: z4 */
    private static final c f20820z4;
    private int U3;
    private int V3;
    private List<s> W3;
    private List<q> X3;
    private List<Integer> Y3;
    private int Z3;

    /* renamed from: a4 */
    private List<Integer> f20821a4;

    /* renamed from: b4 */
    private int f20822b4;

    /* renamed from: c4 */
    private List<q> f20823c4;

    /* renamed from: d4 */
    private List<Integer> f20824d4;

    /* renamed from: e4 */
    private int f20825e4;

    /* renamed from: f4 */
    private List<d> f20826f4;

    /* renamed from: g4 */
    private List<i> f20827g4;

    /* renamed from: h4 */
    private List<n> f20828h4;

    /* renamed from: i4 */
    private List<r> f20829i4;

    /* renamed from: j4 */
    private List<g> f20830j4;

    /* renamed from: k4 */
    private List<Integer> f20831k4;

    /* renamed from: l4 */
    private int f20832l4;

    /* renamed from: m4 */
    private int f20833m4;

    /* renamed from: n4 */
    private q f20834n4;

    /* renamed from: o4 */
    private int f20835o4;

    /* renamed from: p4 */
    private List<Integer> f20836p4;

    /* renamed from: q */
    private final yd.d f20837q;

    /* renamed from: q4 */
    private int f20838q4;

    /* renamed from: r4 */
    private List<q> f20839r4;

    /* renamed from: s4 */
    private List<Integer> f20840s4;

    /* renamed from: t4 */
    private int f20841t4;

    /* renamed from: u4 */
    private t f20842u4;

    /* renamed from: v4 */
    private List<Integer> f20843v4;

    /* renamed from: w4 */
    private w f20844w4;

    /* renamed from: x */
    private int f20845x;

    /* renamed from: x4 */
    private byte f20846x4;

    /* renamed from: y */
    private int f20847y;

    /* renamed from: y4 */
    private int f20848y4;

    /* loaded from: classes.dex */
    static class a extends yd.b<c> {
        a() {
        }

        /* renamed from: m */
        public c d(yd.e eVar, yd.g gVar) {
            return new c(eVar, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i.c<c, b> {
        private int U3;
        private int V3;

        /* renamed from: i4 */
        private int f20857i4;

        /* renamed from: k4 */
        private int f20859k4;

        /* renamed from: x */
        private int f20866x;

        /* renamed from: y */
        private int f20867y = 6;
        private List<s> W3 = Collections.emptyList();
        private List<q> X3 = Collections.emptyList();
        private List<Integer> Y3 = Collections.emptyList();
        private List<Integer> Z3 = Collections.emptyList();

        /* renamed from: a4 */
        private List<q> f20849a4 = Collections.emptyList();

        /* renamed from: b4 */
        private List<Integer> f20850b4 = Collections.emptyList();

        /* renamed from: c4 */
        private List<d> f20851c4 = Collections.emptyList();

        /* renamed from: d4 */
        private List<i> f20852d4 = Collections.emptyList();

        /* renamed from: e4 */
        private List<n> f20853e4 = Collections.emptyList();

        /* renamed from: f4 */
        private List<r> f20854f4 = Collections.emptyList();

        /* renamed from: g4 */
        private List<g> f20855g4 = Collections.emptyList();

        /* renamed from: h4 */
        private List<Integer> f20856h4 = Collections.emptyList();

        /* renamed from: j4 */
        private q f20858j4 = q.z0();

        /* renamed from: l4 */
        private List<Integer> f20860l4 = Collections.emptyList();

        /* renamed from: m4 */
        private List<q> f20861m4 = Collections.emptyList();

        /* renamed from: n4 */
        private List<Integer> f20862n4 = Collections.emptyList();

        /* renamed from: o4 */
        private t f20863o4 = t.N();

        /* renamed from: p4 */
        private List<Integer> f20864p4 = Collections.emptyList();

        /* renamed from: q4 */
        private w f20865q4 = w.I();

        private b() {
            T();
        }

        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f20866x & 512) != 512) {
                this.f20851c4 = new ArrayList(this.f20851c4);
                this.f20866x |= 512;
            }
        }

        private void D() {
            if ((this.f20866x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f20850b4 = new ArrayList(this.f20850b4);
                this.f20866x |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void E() {
            if ((this.f20866x & 128) != 128) {
                this.f20849a4 = new ArrayList(this.f20849a4);
                this.f20866x |= 128;
            }
        }

        private void F() {
            if ((this.f20866x & 8192) != 8192) {
                this.f20855g4 = new ArrayList(this.f20855g4);
                this.f20866x |= 8192;
            }
        }

        private void H() {
            if ((this.f20866x & 1024) != 1024) {
                this.f20852d4 = new ArrayList(this.f20852d4);
                this.f20866x |= 1024;
            }
        }

        private void I() {
            if ((this.f20866x & 262144) != 262144) {
                this.f20860l4 = new ArrayList(this.f20860l4);
                this.f20866x |= 262144;
            }
        }

        private void J() {
            if ((this.f20866x & 1048576) != 1048576) {
                this.f20862n4 = new ArrayList(this.f20862n4);
                this.f20866x |= 1048576;
            }
        }

        private void K() {
            if ((this.f20866x & 524288) != 524288) {
                this.f20861m4 = new ArrayList(this.f20861m4);
                this.f20866x |= 524288;
            }
        }

        private void L() {
            if ((this.f20866x & 64) != 64) {
                this.Z3 = new ArrayList(this.Z3);
                this.f20866x |= 64;
            }
        }

        private void M() {
            if ((this.f20866x & 2048) != 2048) {
                this.f20853e4 = new ArrayList(this.f20853e4);
                this.f20866x |= 2048;
            }
        }

        private void N() {
            if ((this.f20866x & 16384) != 16384) {
                this.f20856h4 = new ArrayList(this.f20856h4);
                this.f20866x |= 16384;
            }
        }

        private void O() {
            if ((this.f20866x & 32) != 32) {
                this.Y3 = new ArrayList(this.Y3);
                this.f20866x |= 32;
            }
        }

        private void P() {
            if ((this.f20866x & 16) != 16) {
                this.X3 = new ArrayList(this.X3);
                this.f20866x |= 16;
            }
        }

        private void Q() {
            if ((this.f20866x & 4096) != 4096) {
                this.f20854f4 = new ArrayList(this.f20854f4);
                this.f20866x |= 4096;
            }
        }

        private void R() {
            if ((this.f20866x & 8) != 8) {
                this.W3 = new ArrayList(this.W3);
                this.f20866x |= 8;
            }
        }

        private void S() {
            if ((this.f20866x & 4194304) != 4194304) {
                this.f20864p4 = new ArrayList(this.f20864p4);
                this.f20866x |= 4194304;
            }
        }

        private void T() {
        }

        /* renamed from: A */
        public b k() {
            return B().m(y());
        }

        /* renamed from: U */
        public b m(c cVar) {
            if (cVar == c.a1()) {
                return this;
            }
            if (cVar.N1()) {
                a0(cVar.f1());
            }
            if (cVar.O1()) {
                b0(cVar.g1());
            }
            if (cVar.M1()) {
                Z(cVar.S0());
            }
            if (!cVar.W3.isEmpty()) {
                if (this.W3.isEmpty()) {
                    this.W3 = cVar.W3;
                    this.f20866x &= -9;
                } else {
                    R();
                    this.W3.addAll(cVar.W3);
                }
            }
            if (!cVar.X3.isEmpty()) {
                if (this.X3.isEmpty()) {
                    this.X3 = cVar.X3;
                    this.f20866x &= -17;
                } else {
                    P();
                    this.X3.addAll(cVar.X3);
                }
            }
            if (!cVar.Y3.isEmpty()) {
                if (this.Y3.isEmpty()) {
                    this.Y3 = cVar.Y3;
                    this.f20866x &= -33;
                } else {
                    O();
                    this.Y3.addAll(cVar.Y3);
                }
            }
            if (!cVar.f20821a4.isEmpty()) {
                if (this.Z3.isEmpty()) {
                    this.Z3 = cVar.f20821a4;
                    this.f20866x &= -65;
                } else {
                    L();
                    this.Z3.addAll(cVar.f20821a4);
                }
            }
            if (!cVar.f20823c4.isEmpty()) {
                if (this.f20849a4.isEmpty()) {
                    this.f20849a4 = cVar.f20823c4;
                    this.f20866x &= -129;
                } else {
                    E();
                    this.f20849a4.addAll(cVar.f20823c4);
                }
            }
            if (!cVar.f20824d4.isEmpty()) {
                if (this.f20850b4.isEmpty()) {
                    this.f20850b4 = cVar.f20824d4;
                    this.f20866x &= -257;
                } else {
                    D();
                    this.f20850b4.addAll(cVar.f20824d4);
                }
            }
            if (!cVar.f20826f4.isEmpty()) {
                if (this.f20851c4.isEmpty()) {
                    this.f20851c4 = cVar.f20826f4;
                    this.f20866x &= -513;
                } else {
                    C();
                    this.f20851c4.addAll(cVar.f20826f4);
                }
            }
            if (!cVar.f20827g4.isEmpty()) {
                if (this.f20852d4.isEmpty()) {
                    this.f20852d4 = cVar.f20827g4;
                    this.f20866x &= -1025;
                } else {
                    H();
                    this.f20852d4.addAll(cVar.f20827g4);
                }
            }
            if (!cVar.f20828h4.isEmpty()) {
                if (this.f20853e4.isEmpty()) {
                    this.f20853e4 = cVar.f20828h4;
                    this.f20866x &= -2049;
                } else {
                    M();
                    this.f20853e4.addAll(cVar.f20828h4);
                }
            }
            if (!cVar.f20829i4.isEmpty()) {
                if (this.f20854f4.isEmpty()) {
                    this.f20854f4 = cVar.f20829i4;
                    this.f20866x &= -4097;
                } else {
                    Q();
                    this.f20854f4.addAll(cVar.f20829i4);
                }
            }
            if (!cVar.f20830j4.isEmpty()) {
                if (this.f20855g4.isEmpty()) {
                    this.f20855g4 = cVar.f20830j4;
                    this.f20866x &= -8193;
                } else {
                    F();
                    this.f20855g4.addAll(cVar.f20830j4);
                }
            }
            if (!cVar.f20831k4.isEmpty()) {
                if (this.f20856h4.isEmpty()) {
                    this.f20856h4 = cVar.f20831k4;
                    this.f20866x &= -16385;
                } else {
                    N();
                    this.f20856h4.addAll(cVar.f20831k4);
                }
            }
            if (cVar.P1()) {
                c0(cVar.k1());
            }
            if (cVar.Q1()) {
                W(cVar.l1());
            }
            if (cVar.R1()) {
                d0(cVar.m1());
            }
            if (!cVar.f20836p4.isEmpty()) {
                if (this.f20860l4.isEmpty()) {
                    this.f20860l4 = cVar.f20836p4;
                    this.f20866x &= -262145;
                } else {
                    I();
                    this.f20860l4.addAll(cVar.f20836p4);
                }
            }
            if (!cVar.f20839r4.isEmpty()) {
                if (this.f20861m4.isEmpty()) {
                    this.f20861m4 = cVar.f20839r4;
                    this.f20866x &= -524289;
                } else {
                    K();
                    this.f20861m4.addAll(cVar.f20839r4);
                }
            }
            if (!cVar.f20840s4.isEmpty()) {
                if (this.f20862n4.isEmpty()) {
                    this.f20862n4 = cVar.f20840s4;
                    this.f20866x &= -1048577;
                } else {
                    J();
                    this.f20862n4.addAll(cVar.f20840s4);
                }
            }
            if (cVar.S1()) {
                X(cVar.J1());
            }
            if (!cVar.f20843v4.isEmpty()) {
                if (this.f20864p4.isEmpty()) {
                    this.f20864p4 = cVar.f20843v4;
                    this.f20866x &= -4194305;
                } else {
                    S();
                    this.f20864p4.addAll(cVar.f20843v4);
                }
            }
            if (cVar.T1()) {
                Y(cVar.L1());
            }
            v(cVar);
            o(l().b(cVar.f20837q));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public rd.c.b s(yd.e r3, yd.g r4) {
            /*
                r2 = this;
                r0 = 0
                yd.s<rd.c> r1 = rd.c.A4     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                rd.c r3 = (rd.c) r3     // Catch: java.lang.Throwable -> Lf yd.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                yd.q r4 = r3.b()     // Catch: java.lang.Throwable -> Lf
                rd.c r4 = (rd.c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: rd.c.b.s(yd.e, yd.g):rd.c$b");
        }

        public b W(q qVar) {
            if ((this.f20866x & 65536) == 65536 && this.f20858j4 != q.z0()) {
                qVar = q.a1(this.f20858j4).m(qVar).y();
            }
            this.f20858j4 = qVar;
            this.f20866x |= 65536;
            return this;
        }

        public b X(t tVar) {
            if ((this.f20866x & 2097152) == 2097152 && this.f20863o4 != t.N()) {
                tVar = t.g0(this.f20863o4).m(tVar).t();
            }
            this.f20863o4 = tVar;
            this.f20866x |= 2097152;
            return this;
        }

        public b Y(w wVar) {
            if ((this.f20866x & 8388608) == 8388608 && this.f20865q4 != w.I()) {
                wVar = w.b0(this.f20865q4).m(wVar).t();
            }
            this.f20865q4 = wVar;
            this.f20866x |= 8388608;
            return this;
        }

        public b Z(int i10) {
            this.f20866x |= 4;
            this.V3 = i10;
            return this;
        }

        public b a0(int i10) {
            this.f20866x |= 1;
            this.f20867y = i10;
            return this;
        }

        public b b0(int i10) {
            this.f20866x |= 2;
            this.U3 = i10;
            return this;
        }

        public b c0(int i10) {
            this.f20866x |= 32768;
            this.f20857i4 = i10;
            return this;
        }

        public b d0(int i10) {
            this.f20866x |= 131072;
            this.f20859k4 = i10;
            return this;
        }

        /* renamed from: x */
        public c b() {
            c y10 = y();
            if (y10.c()) {
                return y10;
            }
            throw a.AbstractC0456a.d(y10);
        }

        public c y() {
            c cVar = new c(this);
            int i10 = this.f20866x;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            cVar.f20847y = this.f20867y;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.U3 = this.U3;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.V3 = this.V3;
            if ((this.f20866x & 8) == 8) {
                this.W3 = Collections.unmodifiableList(this.W3);
                this.f20866x &= -9;
            }
            cVar.W3 = this.W3;
            if ((this.f20866x & 16) == 16) {
                this.X3 = Collections.unmodifiableList(this.X3);
                this.f20866x &= -17;
            }
            cVar.X3 = this.X3;
            if ((this.f20866x & 32) == 32) {
                this.Y3 = Collections.unmodifiableList(this.Y3);
                this.f20866x &= -33;
            }
            cVar.Y3 = this.Y3;
            if ((this.f20866x & 64) == 64) {
                this.Z3 = Collections.unmodifiableList(this.Z3);
                this.f20866x &= -65;
            }
            cVar.f20821a4 = this.Z3;
            if ((this.f20866x & 128) == 128) {
                this.f20849a4 = Collections.unmodifiableList(this.f20849a4);
                this.f20866x &= -129;
            }
            cVar.f20823c4 = this.f20849a4;
            if ((this.f20866x & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f20850b4 = Collections.unmodifiableList(this.f20850b4);
                this.f20866x &= -257;
            }
            cVar.f20824d4 = this.f20850b4;
            if ((this.f20866x & 512) == 512) {
                this.f20851c4 = Collections.unmodifiableList(this.f20851c4);
                this.f20866x &= -513;
            }
            cVar.f20826f4 = this.f20851c4;
            if ((this.f20866x & 1024) == 1024) {
                this.f20852d4 = Collections.unmodifiableList(this.f20852d4);
                this.f20866x &= -1025;
            }
            cVar.f20827g4 = this.f20852d4;
            if ((this.f20866x & 2048) == 2048) {
                this.f20853e4 = Collections.unmodifiableList(this.f20853e4);
                this.f20866x &= -2049;
            }
            cVar.f20828h4 = this.f20853e4;
            if ((this.f20866x & 4096) == 4096) {
                this.f20854f4 = Collections.unmodifiableList(this.f20854f4);
                this.f20866x &= -4097;
            }
            cVar.f20829i4 = this.f20854f4;
            if ((this.f20866x & 8192) == 8192) {
                this.f20855g4 = Collections.unmodifiableList(this.f20855g4);
                this.f20866x &= -8193;
            }
            cVar.f20830j4 = this.f20855g4;
            if ((this.f20866x & 16384) == 16384) {
                this.f20856h4 = Collections.unmodifiableList(this.f20856h4);
                this.f20866x &= -16385;
            }
            cVar.f20831k4 = this.f20856h4;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.f20833m4 = this.f20857i4;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            cVar.f20834n4 = this.f20858j4;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            cVar.f20835o4 = this.f20859k4;
            if ((this.f20866x & 262144) == 262144) {
                this.f20860l4 = Collections.unmodifiableList(this.f20860l4);
                this.f20866x &= -262145;
            }
            cVar.f20836p4 = this.f20860l4;
            if ((this.f20866x & 524288) == 524288) {
                this.f20861m4 = Collections.unmodifiableList(this.f20861m4);
                this.f20866x &= -524289;
            }
            cVar.f20839r4 = this.f20861m4;
            if ((this.f20866x & 1048576) == 1048576) {
                this.f20862n4 = Collections.unmodifiableList(this.f20862n4);
                this.f20866x &= -1048577;
            }
            cVar.f20840s4 = this.f20862n4;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            cVar.f20842u4 = this.f20863o4;
            if ((this.f20866x & 4194304) == 4194304) {
                this.f20864p4 = Collections.unmodifiableList(this.f20864p4);
                this.f20866x &= -4194305;
            }
            cVar.f20843v4 = this.f20864p4;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            cVar.f20844w4 = this.f20865q4;
            cVar.f20845x = i11;
            return cVar;
        }
    }

    /* renamed from: rd.c$c */
    /* loaded from: classes.dex */
    public enum EnumC0343c implements j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static j.b<EnumC0343c> X3 = new a();

        /* renamed from: c */
        private final int f20872c;

        /* renamed from: rd.c$c$a */
        /* loaded from: classes.dex */
        static class a implements j.b<EnumC0343c> {
            a() {
            }

            /* renamed from: b */
            public EnumC0343c a(int i10) {
                return EnumC0343c.b(i10);
            }
        }

        EnumC0343c(int i10, int i11) {
            this.f20872c = i11;
        }

        public static EnumC0343c b(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // yd.j.a
        public final int c() {
            return this.f20872c;
        }
    }

    static {
        c cVar = new c(true);
        f20820z4 = cVar;
        cVar.U1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v18, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v28, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v31, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v34, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v37, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v40, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v58, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r12v76, types: [yd.q] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private c(yd.e eVar, yd.g gVar) {
        boolean z10;
        List list;
        int j10;
        char c10;
        Integer num;
        char c11;
        this.Z3 = -1;
        this.f20822b4 = -1;
        this.f20825e4 = -1;
        this.f20832l4 = -1;
        this.f20838q4 = -1;
        this.f20841t4 = -1;
        this.f20846x4 = (byte) -1;
        this.f20848y4 = -1;
        U1();
        d.b r10 = yd.d.r();
        yd.f J = yd.f.J(r10, 1);
        boolean z11 = false;
        char c12 = 0;
        while (true) {
            ?? r52 = 4194304;
            if (z11) {
                boolean z12 = c12 == 1 ? 1 : 0;
                boolean z13 = c12 == 1 ? 1 : 0;
                boolean z14 = c12 == 1 ? 1 : 0;
                boolean z15 = c12 == 1 ? 1 : 0;
                boolean z16 = c12 == 1 ? 1 : 0;
                boolean z17 = c12 == 1 ? 1 : 0;
                boolean z18 = c12 == 1 ? 1 : 0;
                boolean z19 = c12 == 1 ? 1 : 0;
                boolean z20 = c12 == 1 ? 1 : 0;
                boolean z21 = c12 == 1 ? 1 : 0;
                boolean z22 = c12 == 1 ? 1 : 0;
                boolean z23 = c12 == 1 ? 1 : 0;
                boolean z24 = c12 == 1 ? 1 : 0;
                boolean z25 = c12 == 1 ? 1 : 0;
                boolean z26 = c12 == 1 ? 1 : 0;
                boolean z27 = c12 == 1 ? 1 : 0;
                boolean z28 = c12 == 1 ? 1 : 0;
                boolean z29 = c12 == 1 ? 1 : 0;
                boolean z30 = c12 == 1 ? 1 : 0;
                boolean z31 = c12 == 1 ? 1 : 0;
                boolean z32 = c12 == 1 ? 1 : 0;
                boolean z33 = c12 == 1 ? 1 : 0;
                boolean z34 = c12 == 1 ? 1 : 0;
                boolean z35 = c12 == 1 ? 1 : 0;
                boolean z36 = c12 == 1 ? 1 : 0;
                boolean z37 = c12 == 1 ? 1 : 0;
                boolean z38 = c12 == 1 ? 1 : 0;
                boolean z39 = c12 == 1 ? 1 : 0;
                boolean z40 = c12 == 1 ? 1 : 0;
                boolean z41 = c12 == 1 ? 1 : 0;
                boolean z42 = c12 == 1 ? 1 : 0;
                boolean z43 = c12 == 1 ? 1 : 0;
                boolean z44 = c12 == 1 ? 1 : 0;
                boolean z45 = c12 == 1 ? 1 : 0;
                if (z12 & true) {
                    this.Y3 = Collections.unmodifiableList(this.Y3);
                }
                if ((c12 & '\b') == 8) {
                    this.W3 = Collections.unmodifiableList(this.W3);
                }
                if ((c12 & 16) == 16) {
                    this.X3 = Collections.unmodifiableList(this.X3);
                }
                if ((c12 & '@') == 64) {
                    this.f20821a4 = Collections.unmodifiableList(this.f20821a4);
                }
                if ((c12 & 512) == 512) {
                    this.f20826f4 = Collections.unmodifiableList(this.f20826f4);
                }
                if ((c12 & 1024) == 1024) {
                    this.f20827g4 = Collections.unmodifiableList(this.f20827g4);
                }
                if ((c12 & 2048) == 2048) {
                    this.f20828h4 = Collections.unmodifiableList(this.f20828h4);
                }
                if ((c12 & 4096) == 4096) {
                    this.f20829i4 = Collections.unmodifiableList(this.f20829i4);
                }
                if ((c12 & 8192) == 8192) {
                    this.f20830j4 = Collections.unmodifiableList(this.f20830j4);
                }
                if ((c12 & 16384) == 16384) {
                    this.f20831k4 = Collections.unmodifiableList(this.f20831k4);
                }
                if ((c12 & 128) == 128) {
                    this.f20823c4 = Collections.unmodifiableList(this.f20823c4);
                }
                if ((c12 & 256) == 256) {
                    this.f20824d4 = Collections.unmodifiableList(this.f20824d4);
                }
                if ((c12 & 0) == 262144) {
                    this.f20836p4 = Collections.unmodifiableList(this.f20836p4);
                }
                if ((c12 & 0) == 524288) {
                    this.f20839r4 = Collections.unmodifiableList(this.f20839r4);
                }
                if ((c12 & 0) == 1048576) {
                    this.f20840s4 = Collections.unmodifiableList(this.f20840s4);
                }
                if ((c12 & 0) == 4194304) {
                    this.f20843v4 = Collections.unmodifiableList(this.f20843v4);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20837q = r10.i();
                    throw th2;
                }
                this.f20837q = r10.i();
                u();
                return;
            }
            try {
                try {
                    int K = eVar.K();
                    q.c cVar = null;
                    w.b bVar = null;
                    t.b bVar2 = null;
                    switch (K) {
                        case 0:
                            z10 = true;
                            z11 = z10;
                            break;
                        case 8:
                            z10 = true;
                            this.f20845x |= 1;
                            this.f20847y = eVar.s();
                            break;
                        case 16:
                            int i10 = c12 & ' ';
                            char c13 = c12;
                            if (i10 != 32) {
                                this.Y3 = new ArrayList();
                                c13 = c12 | ' ';
                            }
                            list = this.Y3;
                            c11 = c13;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 18:
                            j10 = eVar.j(eVar.A());
                            int i11 = c12 & ' ';
                            c10 = c12;
                            if (i11 != 32) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.Y3 = new ArrayList();
                                    c10 = c12 | ' ';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.Y3.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 24:
                            this.f20845x |= 2;
                            this.U3 = eVar.s();
                            c12 = c12;
                            z10 = true;
                            break;
                        case 32:
                            this.f20845x |= 4;
                            this.V3 = eVar.s();
                            c12 = c12;
                            z10 = true;
                            break;
                        case 42:
                            int i12 = c12 & '\b';
                            char c14 = c12;
                            if (i12 != 8) {
                                this.W3 = new ArrayList();
                                c14 = c12 | '\b';
                            }
                            list = this.W3;
                            c11 = c14;
                            num = eVar.u(s.f21069d4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 50:
                            int i13 = c12 & 16;
                            char c15 = c12;
                            if (i13 != 16) {
                                this.X3 = new ArrayList();
                                c15 = c12 | 16;
                            }
                            list = this.X3;
                            c11 = c15;
                            num = eVar.u(q.f21020k4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 56:
                            int i14 = c12 & '@';
                            char c16 = c12;
                            if (i14 != 64) {
                                this.f20821a4 = new ArrayList();
                                c16 = c12 | '@';
                            }
                            list = this.f20821a4;
                            c11 = c16;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 58:
                            j10 = eVar.j(eVar.A());
                            int i15 = c12 & '@';
                            c10 = c12;
                            if (i15 != 64) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.f20821a4 = new ArrayList();
                                    c10 = c12 | '@';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20821a4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 66:
                            int i16 = c12 & 512;
                            char c17 = c12;
                            if (i16 != 512) {
                                this.f20826f4 = new ArrayList();
                                c17 = c12 | 512;
                            }
                            list = this.f20826f4;
                            c11 = c17;
                            num = eVar.u(d.Z3, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 74:
                            int i17 = c12 & 1024;
                            char c18 = c12;
                            if (i17 != 1024) {
                                this.f20827g4 = new ArrayList();
                                c18 = c12 | 1024;
                            }
                            list = this.f20827g4;
                            c11 = c18;
                            num = eVar.u(i.f20924l4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 82:
                            int i18 = c12 & 2048;
                            char c19 = c12;
                            if (i18 != 2048) {
                                this.f20828h4 = new ArrayList();
                                c19 = c12 | 2048;
                            }
                            list = this.f20828h4;
                            c11 = c19;
                            num = eVar.u(n.f20971l4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 90:
                            int i19 = c12 & 4096;
                            char c20 = c12;
                            if (i19 != 4096) {
                                this.f20829i4 = new ArrayList();
                                c20 = c12 | 4096;
                            }
                            list = this.f20829i4;
                            c11 = c20;
                            num = eVar.u(r.f21056f4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 106:
                            int i20 = c12 & 8192;
                            char c21 = c12;
                            if (i20 != 8192) {
                                this.f20830j4 = new ArrayList();
                                c21 = c12 | 8192;
                            }
                            list = this.f20830j4;
                            c11 = c21;
                            num = eVar.u(g.X3, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 128:
                            int i21 = c12 & 16384;
                            char c22 = c12;
                            if (i21 != 16384) {
                                this.f20831k4 = new ArrayList();
                                c22 = c12 | 16384;
                            }
                            list = this.f20831k4;
                            c11 = c22;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 130:
                            j10 = eVar.j(eVar.A());
                            int i22 = c12 & 16384;
                            c10 = c12;
                            if (i22 != 16384) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.f20831k4 = new ArrayList();
                                    c10 = c12 | 16384;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20831k4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 136:
                            this.f20845x |= 8;
                            this.f20833m4 = eVar.s();
                            c12 = c12;
                            z10 = true;
                            break;
                        case 146:
                            q.c g10 = (this.f20845x & 16) == 16 ? this.f20834n4.g() : cVar;
                            q qVar = (q) eVar.u(q.f21020k4, gVar);
                            this.f20834n4 = qVar;
                            if (g10 != null) {
                                g10.m(qVar);
                                this.f20834n4 = g10.y();
                            }
                            this.f20845x |= 16;
                            c12 = c12;
                            z10 = true;
                            break;
                        case 152:
                            this.f20845x |= 32;
                            this.f20835o4 = eVar.s();
                            c12 = c12;
                            z10 = true;
                            break;
                        case 162:
                            int i23 = c12 & 128;
                            char c23 = c12;
                            if (i23 != 128) {
                                this.f20823c4 = new ArrayList();
                                c23 = c12 | 128;
                            }
                            list = this.f20823c4;
                            c11 = c23;
                            num = eVar.u(q.f21020k4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 168:
                            int i24 = c12 & 256;
                            char c24 = c12;
                            if (i24 != 256) {
                                this.f20824d4 = new ArrayList();
                                c24 = c12 | 256;
                            }
                            list = this.f20824d4;
                            c11 = c24;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 170:
                            j10 = eVar.j(eVar.A());
                            int i25 = c12 & 256;
                            c10 = c12;
                            if (i25 != 256) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.f20824d4 = new ArrayList();
                                    c10 = c12 | 256;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20824d4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 176:
                            int i26 = c12 & 0;
                            char c25 = c12;
                            if (i26 != 262144) {
                                this.f20836p4 = new ArrayList();
                                c25 = c12 | 0;
                            }
                            list = this.f20836p4;
                            c11 = c25;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 178:
                            j10 = eVar.j(eVar.A());
                            int i27 = c12 & 0;
                            c10 = c12;
                            if (i27 != 262144) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.f20836p4 = new ArrayList();
                                    c10 = c12 | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20836p4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 186:
                            int i28 = c12 & 0;
                            char c26 = c12;
                            if (i28 != 524288) {
                                this.f20839r4 = new ArrayList();
                                c26 = c12 | 0;
                            }
                            list = this.f20839r4;
                            c11 = c26;
                            num = eVar.u(q.f21020k4, gVar);
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 192:
                            int i29 = c12 & 0;
                            char c27 = c12;
                            if (i29 != 1048576) {
                                this.f20840s4 = new ArrayList();
                                c27 = c12 | 0;
                            }
                            list = this.f20840s4;
                            c11 = c27;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 194:
                            j10 = eVar.j(eVar.A());
                            int i30 = c12 & 0;
                            c10 = c12;
                            if (i30 != 1048576) {
                                c10 = c12;
                                if (eVar.e() > 0) {
                                    this.f20840s4 = new ArrayList();
                                    c10 = c12 | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20840s4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j10);
                            c12 = c10;
                            z10 = true;
                            break;
                        case 242:
                            t.b g11 = (this.f20845x & 64) == 64 ? this.f20842u4.g() : bVar2;
                            t tVar = (t) eVar.u(t.X3, gVar);
                            this.f20842u4 = tVar;
                            if (g11 != null) {
                                g11.m(tVar);
                                this.f20842u4 = g11.t();
                            }
                            this.f20845x |= 64;
                            c12 = c12;
                            z10 = true;
                            break;
                        case 248:
                            int i31 = c12 & 0;
                            char c28 = c12;
                            if (i31 != 4194304) {
                                this.f20843v4 = new ArrayList();
                                c28 = c12 | 0;
                            }
                            list = this.f20843v4;
                            c11 = c28;
                            num = Integer.valueOf(eVar.s());
                            list.add(num);
                            c12 = c11;
                            z10 = true;
                            break;
                        case 250:
                            int j11 = eVar.j(eVar.A());
                            int i32 = c12 & 0;
                            char c29 = c12;
                            if (i32 != 4194304) {
                                c29 = c12;
                                if (eVar.e() > 0) {
                                    this.f20843v4 = new ArrayList();
                                    c29 = c12 | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f20843v4.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(j11);
                            c12 = c29;
                            z10 = true;
                            break;
                        case 258:
                            w.b g12 = (this.f20845x & 128) == 128 ? this.f20844w4.g() : bVar;
                            w wVar = (w) eVar.u(w.V3, gVar);
                            this.f20844w4 = wVar;
                            if (g12 != null) {
                                g12.m(wVar);
                                this.f20844w4 = g12.t();
                            }
                            this.f20845x |= 128;
                            c12 = c12;
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            r52 = y(eVar, J, gVar, K);
                            if (r52 != 0) {
                                break;
                            }
                            z11 = z10;
                            break;
                    }
                    c12 = c12;
                } catch (Throwable th3) {
                    if ((c12 & ' ') == 32) {
                        this.Y3 = Collections.unmodifiableList(this.Y3);
                    }
                    if ((c12 & '\b') == 8) {
                        this.W3 = Collections.unmodifiableList(this.W3);
                    }
                    if ((c12 & 16) == 16) {
                        this.X3 = Collections.unmodifiableList(this.X3);
                    }
                    if ((c12 & '@') == 64) {
                        this.f20821a4 = Collections.unmodifiableList(this.f20821a4);
                    }
                    if ((c12 & 512) == 512) {
                        this.f20826f4 = Collections.unmodifiableList(this.f20826f4);
                    }
                    if ((c12 & 1024) == 1024) {
                        this.f20827g4 = Collections.unmodifiableList(this.f20827g4);
                    }
                    if ((c12 & 2048) == 2048) {
                        this.f20828h4 = Collections.unmodifiableList(this.f20828h4);
                    }
                    if ((c12 & 4096) == 4096) {
                        this.f20829i4 = Collections.unmodifiableList(this.f20829i4);
                    }
                    if ((c12 & 8192) == 8192) {
                        this.f20830j4 = Collections.unmodifiableList(this.f20830j4);
                    }
                    if ((c12 & 16384) == 16384) {
                        this.f20831k4 = Collections.unmodifiableList(this.f20831k4);
                    }
                    if ((c12 & 128) == 128) {
                        this.f20823c4 = Collections.unmodifiableList(this.f20823c4);
                    }
                    if ((c12 & 256) == 256) {
                        this.f20824d4 = Collections.unmodifiableList(this.f20824d4);
                    }
                    if ((c12 & 0) == 262144) {
                        this.f20836p4 = Collections.unmodifiableList(this.f20836p4);
                    }
                    if ((c12 & 0) == 524288) {
                        this.f20839r4 = Collections.unmodifiableList(this.f20839r4);
                    }
                    if ((c12 & 0) == 1048576) {
                        this.f20840s4 = Collections.unmodifiableList(this.f20840s4);
                    }
                    if ((c12 & r52) == r52) {
                        this.f20843v4 = Collections.unmodifiableList(this.f20843v4);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f20837q = r10.i();
                        throw th4;
                    }
                    this.f20837q = r10.i();
                    u();
                    throw th3;
                }
            } catch (yd.k e10) {
                throw e10.k(this);
            } catch (IOException e11) {
                throw new yd.k(e11.getMessage()).k(this);
            }
        }
    }

    private c(i.c<c, ?> cVar) {
        super(cVar);
        this.Z3 = -1;
        this.f20822b4 = -1;
        this.f20825e4 = -1;
        this.f20832l4 = -1;
        this.f20838q4 = -1;
        this.f20841t4 = -1;
        this.f20846x4 = (byte) -1;
        this.f20848y4 = -1;
        this.f20837q = cVar.l();
    }

    private c(boolean z10) {
        this.Z3 = -1;
        this.f20822b4 = -1;
        this.f20825e4 = -1;
        this.f20832l4 = -1;
        this.f20838q4 = -1;
        this.f20841t4 = -1;
        this.f20846x4 = (byte) -1;
        this.f20848y4 = -1;
        this.f20837q = yd.d.f26096c;
    }

    private void U1() {
        this.f20847y = 6;
        this.U3 = 0;
        this.V3 = 0;
        this.W3 = Collections.emptyList();
        this.X3 = Collections.emptyList();
        this.Y3 = Collections.emptyList();
        this.f20821a4 = Collections.emptyList();
        this.f20823c4 = Collections.emptyList();
        this.f20824d4 = Collections.emptyList();
        this.f20826f4 = Collections.emptyList();
        this.f20827g4 = Collections.emptyList();
        this.f20828h4 = Collections.emptyList();
        this.f20829i4 = Collections.emptyList();
        this.f20830j4 = Collections.emptyList();
        this.f20831k4 = Collections.emptyList();
        this.f20833m4 = 0;
        this.f20834n4 = q.z0();
        this.f20835o4 = 0;
        this.f20836p4 = Collections.emptyList();
        this.f20839r4 = Collections.emptyList();
        this.f20840s4 = Collections.emptyList();
        this.f20842u4 = t.N();
        this.f20843v4 = Collections.emptyList();
        this.f20844w4 = w.I();
    }

    public static b V1() {
        return b.B();
    }

    public static b W1(c cVar) {
        return V1().m(cVar);
    }

    public static c Y1(InputStream inputStream, yd.g gVar) {
        return A4.c(inputStream, gVar);
    }

    public static c a1() {
        return f20820z4;
    }

    public int A1() {
        return this.X3.size();
    }

    public List<Integer> B1() {
        return this.Y3;
    }

    public List<q> C1() {
        return this.X3;
    }

    public r D1(int i10) {
        return this.f20829i4.get(i10);
    }

    public int E1() {
        return this.f20829i4.size();
    }

    public List<r> F1() {
        return this.f20829i4;
    }

    public s G1(int i10) {
        return this.W3.get(i10);
    }

    public int H1() {
        return this.W3.size();
    }

    public List<s> I1() {
        return this.W3;
    }

    public t J1() {
        return this.f20842u4;
    }

    public List<Integer> K1() {
        return this.f20843v4;
    }

    public w L1() {
        return this.f20844w4;
    }

    public boolean M1() {
        return (this.f20845x & 4) == 4;
    }

    public boolean N1() {
        return (this.f20845x & 1) == 1;
    }

    public boolean O1() {
        return (this.f20845x & 2) == 2;
    }

    public boolean P1() {
        return (this.f20845x & 8) == 8;
    }

    public boolean Q1() {
        return (this.f20845x & 16) == 16;
    }

    public boolean R1() {
        return (this.f20845x & 32) == 32;
    }

    public int S0() {
        return this.V3;
    }

    public boolean S1() {
        return (this.f20845x & 64) == 64;
    }

    public d T0(int i10) {
        return this.f20826f4.get(i10);
    }

    public boolean T1() {
        return (this.f20845x & 128) == 128;
    }

    public int U0() {
        return this.f20826f4.size();
    }

    public List<d> V0() {
        return this.f20826f4;
    }

    public q W0(int i10) {
        return this.f20823c4.get(i10);
    }

    public int X0() {
        return this.f20823c4.size();
    }

    /* renamed from: X1 */
    public b h() {
        return V1();
    }

    public List<Integer> Y0() {
        return this.f20824d4;
    }

    public List<q> Z0() {
        return this.f20823c4;
    }

    /* renamed from: Z1 */
    public b g() {
        return W1(this);
    }

    /* renamed from: b1 */
    public c f() {
        return f20820z4;
    }

    @Override // yd.r
    public final boolean c() {
        byte b10 = this.f20846x4;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!O1()) {
            this.f20846x4 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < H1(); i10++) {
            if (!G1(i10).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < A1(); i11++) {
            if (!z1(i11).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < X0(); i12++) {
            if (!W0(i12).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < U0(); i13++) {
            if (!T0(i13).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < i1(); i14++) {
            if (!h1(i14).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < w1(); i15++) {
            if (!v1(i15).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < E1(); i16++) {
            if (!D1(i16).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < d1(); i17++) {
            if (!c1(i17).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        if (Q1() && !l1().c()) {
            this.f20846x4 = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < q1(); i18++) {
            if (!p1(i18).c()) {
                this.f20846x4 = (byte) 0;
                return false;
            }
        }
        if (S1() && !J1().c()) {
            this.f20846x4 = (byte) 0;
            return false;
        } else if (!B()) {
            this.f20846x4 = (byte) 0;
            return false;
        } else {
            this.f20846x4 = (byte) 1;
            return true;
        }
    }

    public g c1(int i10) {
        return this.f20830j4.get(i10);
    }

    public int d1() {
        return this.f20830j4.size();
    }

    @Override // yd.q
    public int e() {
        int i10 = this.f20848y4;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f20845x & 1) == 1 ? yd.f.o(1, this.f20847y) + 0 : 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.Y3.size(); i12++) {
            i11 += yd.f.p(this.Y3.get(i12).intValue());
        }
        int i13 = o10 + i11;
        if (!B1().isEmpty()) {
            i13 = i13 + 1 + yd.f.p(i11);
        }
        this.Z3 = i11;
        if ((this.f20845x & 2) == 2) {
            i13 += yd.f.o(3, this.U3);
        }
        if ((this.f20845x & 4) == 4) {
            i13 += yd.f.o(4, this.V3);
        }
        for (int i14 = 0; i14 < this.W3.size(); i14++) {
            i13 += yd.f.s(5, this.W3.get(i14));
        }
        for (int i15 = 0; i15 < this.X3.size(); i15++) {
            i13 += yd.f.s(6, this.X3.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f20821a4.size(); i17++) {
            i16 += yd.f.p(this.f20821a4.get(i17).intValue());
        }
        int i18 = i13 + i16;
        if (!u1().isEmpty()) {
            i18 = i18 + 1 + yd.f.p(i16);
        }
        this.f20822b4 = i16;
        for (int i19 = 0; i19 < this.f20826f4.size(); i19++) {
            i18 += yd.f.s(8, this.f20826f4.get(i19));
        }
        for (int i20 = 0; i20 < this.f20827g4.size(); i20++) {
            i18 += yd.f.s(9, this.f20827g4.get(i20));
        }
        for (int i21 = 0; i21 < this.f20828h4.size(); i21++) {
            i18 += yd.f.s(10, this.f20828h4.get(i21));
        }
        for (int i22 = 0; i22 < this.f20829i4.size(); i22++) {
            i18 += yd.f.s(11, this.f20829i4.get(i22));
        }
        for (int i23 = 0; i23 < this.f20830j4.size(); i23++) {
            i18 += yd.f.s(13, this.f20830j4.get(i23));
        }
        int i24 = 0;
        for (int i25 = 0; i25 < this.f20831k4.size(); i25++) {
            i24 += yd.f.p(this.f20831k4.get(i25).intValue());
        }
        int i26 = i18 + i24;
        if (!y1().isEmpty()) {
            i26 = i26 + 2 + yd.f.p(i24);
        }
        this.f20832l4 = i24;
        if ((this.f20845x & 8) == 8) {
            i26 += yd.f.o(17, this.f20833m4);
        }
        if ((this.f20845x & 16) == 16) {
            i26 += yd.f.s(18, this.f20834n4);
        }
        if ((this.f20845x & 32) == 32) {
            i26 += yd.f.o(19, this.f20835o4);
        }
        for (int i27 = 0; i27 < this.f20823c4.size(); i27++) {
            i26 += yd.f.s(20, this.f20823c4.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.f20824d4.size(); i29++) {
            i28 += yd.f.p(this.f20824d4.get(i29).intValue());
        }
        int i30 = i26 + i28;
        if (!Y0().isEmpty()) {
            i30 = i30 + 2 + yd.f.p(i28);
        }
        this.f20825e4 = i28;
        int i31 = 0;
        for (int i32 = 0; i32 < this.f20836p4.size(); i32++) {
            i31 += yd.f.p(this.f20836p4.get(i32).intValue());
        }
        int i33 = i30 + i31;
        if (!o1().isEmpty()) {
            i33 = i33 + 2 + yd.f.p(i31);
        }
        this.f20838q4 = i31;
        for (int i34 = 0; i34 < this.f20839r4.size(); i34++) {
            i33 += yd.f.s(23, this.f20839r4.get(i34));
        }
        int i35 = 0;
        for (int i36 = 0; i36 < this.f20840s4.size(); i36++) {
            i35 += yd.f.p(this.f20840s4.get(i36).intValue());
        }
        int i37 = i33 + i35;
        if (!s1().isEmpty()) {
            i37 = i37 + 2 + yd.f.p(i35);
        }
        this.f20841t4 = i35;
        if ((this.f20845x & 64) == 64) {
            i37 += yd.f.s(30, this.f20842u4);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f20843v4.size(); i39++) {
            i38 += yd.f.p(this.f20843v4.get(i39).intValue());
        }
        int size = i37 + i38 + (K1().size() * 2);
        if ((this.f20845x & 128) == 128) {
            size += yd.f.s(32, this.f20844w4);
        }
        int G = size + G() + this.f20837q.size();
        this.f20848y4 = G;
        return G;
    }

    public List<g> e1() {
        return this.f20830j4;
    }

    public int f1() {
        return this.f20847y;
    }

    public int g1() {
        return this.U3;
    }

    public i h1(int i10) {
        return this.f20827g4.get(i10);
    }

    @Override // yd.i, yd.q
    public yd.s<c> i() {
        return A4;
    }

    public int i1() {
        return this.f20827g4.size();
    }

    @Override // yd.q
    public void j(yd.f fVar) {
        e();
        i.d<MessageType>.a W = W();
        if ((this.f20845x & 1) == 1) {
            fVar.a0(1, this.f20847y);
        }
        if (B1().size() > 0) {
            fVar.o0(18);
            fVar.o0(this.Z3);
        }
        for (int i10 = 0; i10 < this.Y3.size(); i10++) {
            fVar.b0(this.Y3.get(i10).intValue());
        }
        if ((this.f20845x & 2) == 2) {
            fVar.a0(3, this.U3);
        }
        if ((this.f20845x & 4) == 4) {
            fVar.a0(4, this.V3);
        }
        for (int i11 = 0; i11 < this.W3.size(); i11++) {
            fVar.d0(5, this.W3.get(i11));
        }
        for (int i12 = 0; i12 < this.X3.size(); i12++) {
            fVar.d0(6, this.X3.get(i12));
        }
        if (u1().size() > 0) {
            fVar.o0(58);
            fVar.o0(this.f20822b4);
        }
        for (int i13 = 0; i13 < this.f20821a4.size(); i13++) {
            fVar.b0(this.f20821a4.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f20826f4.size(); i14++) {
            fVar.d0(8, this.f20826f4.get(i14));
        }
        for (int i15 = 0; i15 < this.f20827g4.size(); i15++) {
            fVar.d0(9, this.f20827g4.get(i15));
        }
        for (int i16 = 0; i16 < this.f20828h4.size(); i16++) {
            fVar.d0(10, this.f20828h4.get(i16));
        }
        for (int i17 = 0; i17 < this.f20829i4.size(); i17++) {
            fVar.d0(11, this.f20829i4.get(i17));
        }
        for (int i18 = 0; i18 < this.f20830j4.size(); i18++) {
            fVar.d0(13, this.f20830j4.get(i18));
        }
        if (y1().size() > 0) {
            fVar.o0(130);
            fVar.o0(this.f20832l4);
        }
        for (int i19 = 0; i19 < this.f20831k4.size(); i19++) {
            fVar.b0(this.f20831k4.get(i19).intValue());
        }
        if ((this.f20845x & 8) == 8) {
            fVar.a0(17, this.f20833m4);
        }
        if ((this.f20845x & 16) == 16) {
            fVar.d0(18, this.f20834n4);
        }
        if ((this.f20845x & 32) == 32) {
            fVar.a0(19, this.f20835o4);
        }
        for (int i20 = 0; i20 < this.f20823c4.size(); i20++) {
            fVar.d0(20, this.f20823c4.get(i20));
        }
        if (Y0().size() > 0) {
            fVar.o0(170);
            fVar.o0(this.f20825e4);
        }
        for (int i21 = 0; i21 < this.f20824d4.size(); i21++) {
            fVar.b0(this.f20824d4.get(i21).intValue());
        }
        if (o1().size() > 0) {
            fVar.o0(178);
            fVar.o0(this.f20838q4);
        }
        for (int i22 = 0; i22 < this.f20836p4.size(); i22++) {
            fVar.b0(this.f20836p4.get(i22).intValue());
        }
        for (int i23 = 0; i23 < this.f20839r4.size(); i23++) {
            fVar.d0(23, this.f20839r4.get(i23));
        }
        if (s1().size() > 0) {
            fVar.o0(194);
            fVar.o0(this.f20841t4);
        }
        for (int i24 = 0; i24 < this.f20840s4.size(); i24++) {
            fVar.b0(this.f20840s4.get(i24).intValue());
        }
        if ((this.f20845x & 64) == 64) {
            fVar.d0(30, this.f20842u4);
        }
        for (int i25 = 0; i25 < this.f20843v4.size(); i25++) {
            fVar.a0(31, this.f20843v4.get(i25).intValue());
        }
        if ((this.f20845x & 128) == 128) {
            fVar.d0(32, this.f20844w4);
        }
        W.a(19000, fVar);
        fVar.i0(this.f20837q);
    }

    public List<i> j1() {
        return this.f20827g4;
    }

    public int k1() {
        return this.f20833m4;
    }

    public q l1() {
        return this.f20834n4;
    }

    public int m1() {
        return this.f20835o4;
    }

    public int n1() {
        return this.f20836p4.size();
    }

    public List<Integer> o1() {
        return this.f20836p4;
    }

    public q p1(int i10) {
        return this.f20839r4.get(i10);
    }

    public int q1() {
        return this.f20839r4.size();
    }

    public int r1() {
        return this.f20840s4.size();
    }

    public List<Integer> s1() {
        return this.f20840s4;
    }

    public List<q> t1() {
        return this.f20839r4;
    }

    public List<Integer> u1() {
        return this.f20821a4;
    }

    public n v1(int i10) {
        return this.f20828h4.get(i10);
    }

    public int w1() {
        return this.f20828h4.size();
    }

    public List<n> x1() {
        return this.f20828h4;
    }

    public List<Integer> y1() {
        return this.f20831k4;
    }

    public q z1(int i10) {
        return this.X3.get(i10);
    }
}
