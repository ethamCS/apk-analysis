package b.e.b.k;

import b.e.b.k.d;
import b.e.b.k.m.n;
import b.e.b.k.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {
    public static float o0 = 0.5f;
    private boolean B;
    public d F;
    public d G;
    public d H;
    public d I;
    public d J;
    public d M;
    public d[] N;
    public b[] Q;
    protected int Z;
    protected int a0;

    /* renamed from: b */
    public b.e.b.k.m.c f2260b;
    float b0;

    /* renamed from: c */
    public b.e.b.k.m.c f2261c;
    float c0;
    private Object d0;

    /* renamed from: a */
    public boolean f2259a = false;

    /* renamed from: d */
    public b.e.b.k.m.l f2262d = null;

    /* renamed from: e */
    public n f2263e = null;

    /* renamed from: f */
    public boolean[] f2264f = {true, true};

    /* renamed from: g */
    private boolean f2265g = true;

    /* renamed from: h */
    private boolean f2266h = false;
    private boolean i = true;
    private boolean j = false;
    private boolean k = false;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public int o = 0;
    public int[] p = new int[2];
    public int q = 0;
    public int r = 0;
    public float s = 1.0f;
    public int t = 0;
    public int u = 0;
    public float v = 1.0f;
    int w = -1;
    float x = 1.0f;
    private int[] y = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float z = 0.0f;
    private boolean A = false;
    private boolean C = false;
    private int D = 0;
    private int E = 0;
    d K = new d(this, d.b.CENTER_X);
    d L = new d(this, d.b.CENTER_Y);
    protected ArrayList<d> O = new ArrayList<>();
    private boolean[] P = new boolean[2];
    public e R = null;
    int S = 0;
    int T = 0;
    public float U = 0.0f;
    protected int V = -1;
    protected int W = 0;
    protected int X = 0;
    int Y = 0;
    private int e0 = 0;
    private String f0 = null;
    private String g0 = null;
    int h0 = 0;
    int i0 = 0;
    public float[] j0 = {-1.0f, -1.0f};
    protected e[] k0 = {null, null};
    protected e[] l0 = {null, null};
    public int m0 = -1;
    public int n0 = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2267a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2268b;

        static {
            int[] iArr = new int[b.values().length];
            f2268b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2268b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2268b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2268b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f2267a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2267a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2267a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2267a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2267a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2267a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2267a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2267a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2267a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.LEFT);
        this.F = dVar;
        d dVar2 = new d(this, d.b.TOP);
        this.G = dVar2;
        d dVar3 = new d(this, d.b.RIGHT);
        this.H = dVar3;
        d dVar4 = new d(this, d.b.BOTTOM);
        this.I = dVar4;
        d dVar5 = new d(this, d.b.BASELINE);
        this.J = dVar5;
        d dVar6 = new d(this, d.b.CENTER);
        this.M = dVar6;
        this.N = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        b bVar = b.FIXED;
        this.Q = new b[]{bVar, bVar};
        float f2 = o0;
        this.b0 = f2;
        this.c0 = f2;
        d();
    }

    private boolean Y(int i) {
        int i2 = i * 2;
        d[] dVarArr = this.N;
        if (dVarArr[i2].f2248f != null && dVarArr[i2].f2248f.f2248f != dVarArr[i2]) {
            int i3 = i2 + 1;
            if (dVarArr[i3].f2248f != null && dVarArr[i3].f2248f.f2248f == dVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        this.O.add(this.F);
        this.O.add(this.G);
        this.O.add(this.H);
        this.O.add(this.I);
        this.O.add(this.K);
        this.O.add(this.L);
        this.O.add(this.M);
        this.O.add(this.J);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(b.e.b.d r31, boolean r32, boolean r33, boolean r34, boolean r35, b.e.b.i r36, b.e.b.i r37, b.e.b.k.e.b r38, boolean r39, b.e.b.k.d r40, b.e.b.k.d r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.e.i(b.e.b.d, boolean, boolean, boolean, boolean, b.e.b.i, b.e.b.i, b.e.b.k.e$b, boolean, b.e.b.k.d, b.e.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A() {
        return this.D;
    }

    public void A0(int i, int i2, int i3, float f2) {
        this.n = i;
        this.q = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.r = i3;
        this.s = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i != 0) {
            return;
        }
        this.n = 2;
    }

    public int B() {
        return this.E;
    }

    public void B0(float f2) {
        this.j0[0] = f2;
    }

    public int C(int i) {
        if (i == 0) {
            return R();
        }
        if (i != 1) {
            return 0;
        }
        return v();
    }

    public void C0(int i, boolean z) {
        this.P[i] = z;
    }

    public int D() {
        return this.y[1];
    }

    public void D0(boolean z) {
        this.B = z;
    }

    public int E() {
        return this.y[0];
    }

    public void E0(boolean z) {
        this.C = z;
    }

    public int F() {
        return this.a0;
    }

    public void F0(int i, int i2) {
        this.D = i;
        this.E = i2;
        I0(false);
    }

    public int G() {
        return this.Z;
    }

    public void G0(int i) {
        this.y[1] = i;
    }

    public e H(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i != 1 || (dVar2 = (dVar = this.I).f2248f) == null || dVar2.f2248f != dVar) {
                return null;
            }
            return dVar2.f2246d;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f2248f;
        if (dVar4 != null && dVar4.f2248f == dVar3) {
            return dVar4.f2246d;
        }
        return null;
    }

    public void H0(int i) {
        this.y[0] = i;
    }

    public e I() {
        return this.R;
    }

    public void I0(boolean z) {
        this.f2265g = z;
    }

    public e J(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i != 1 || (dVar2 = (dVar = this.G).f2248f) == null || dVar2.f2248f != dVar) {
                return null;
            }
            return dVar2.f2246d;
        }
        d dVar3 = this.F;
        d dVar4 = dVar3.f2248f;
        if (dVar4 != null && dVar4.f2248f == dVar3) {
            return dVar4.f2246d;
        }
        return null;
    }

    public void J0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a0 = i;
    }

    public int K() {
        return S() + this.S;
    }

    public void K0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.Z = i;
    }

    public p L(int i) {
        if (i == 0) {
            return this.f2262d;
        }
        if (i != 1) {
            return null;
        }
        return this.f2263e;
    }

    public void L0(int i, int i2) {
        this.W = i;
        this.X = i2;
    }

    public float M() {
        return this.c0;
    }

    public void M0(e eVar) {
        this.R = eVar;
    }

    public int N() {
        return this.i0;
    }

    public void N0(float f2) {
        this.c0 = f2;
    }

    public b O() {
        return this.Q[1];
    }

    public void O0(int i) {
        this.i0 = i;
    }

    public int P() {
        int i = 0;
        if (this.F != null) {
            i = 0 + this.G.f2249g;
        }
        return this.H != null ? i + this.I.f2249g : i;
    }

    public void P0(int i, int i2) {
        this.X = i;
        int i3 = i2 - i;
        this.T = i3;
        int i4 = this.a0;
        if (i3 < i4) {
            this.T = i4;
        }
    }

    public int Q() {
        return this.e0;
    }

    public void Q0(b bVar) {
        this.Q[1] = bVar;
    }

    public int R() {
        if (this.e0 == 8) {
            return 0;
        }
        return this.S;
    }

    public void R0(int i, int i2, int i3, float f2) {
        this.o = i;
        this.t = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.u = i3;
        this.v = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i != 0) {
            return;
        }
        this.o = 2;
    }

    public int S() {
        e eVar = this.R;
        return (eVar == null || !(eVar instanceof f)) ? this.W : ((f) eVar).w0 + this.W;
    }

    public void S0(float f2) {
        this.j0[1] = f2;
    }

    public int T() {
        e eVar = this.R;
        return (eVar == null || !(eVar instanceof f)) ? this.X : ((f) eVar).x0 + this.X;
    }

    public void T0(int i) {
        this.e0 = i;
    }

    public boolean U() {
        return this.A;
    }

    public void U0(int i) {
        this.S = i;
        int i2 = this.Z;
        if (i < i2) {
            this.S = i2;
        }
    }

    public boolean V(int i) {
        if (i == 0) {
            return (this.F.f2248f != null ? 1 : 0) + (this.H.f2248f != null ? 1 : 0) < 2;
        }
        return ((this.G.f2248f != null ? 1 : 0) + (this.I.f2248f != null ? 1 : 0)) + (this.J.f2248f != null ? 1 : 0) < 2;
    }

    public void V0(int i) {
        this.W = i;
    }

    public boolean W() {
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            if (this.O.get(i).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i) {
        this.X = i;
    }

    public void X(d.b bVar, e eVar, d.b bVar2, int i, int i2) {
        m(bVar).a(eVar.m(bVar2), i, i2, true);
    }

    public void X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.w == -1) {
            if (z3 && !z4) {
                this.w = 0;
            } else if (!z3 && z4) {
                this.w = 1;
                if (this.V == -1) {
                    this.x = 1.0f / this.x;
                }
            }
        }
        if (this.w == 0 && (!this.G.n() || !this.I.n())) {
            this.w = 1;
        } else if (this.w == 1 && (!this.F.n() || !this.H.n())) {
            this.w = 0;
        }
        if (this.w == -1 && (!this.G.n() || !this.I.n() || !this.F.n() || !this.H.n())) {
            if (this.G.n() && this.I.n()) {
                this.w = 0;
            } else if (this.F.n() && this.H.n()) {
                this.x = 1.0f / this.x;
                this.w = 1;
            }
        }
        if (this.w == -1) {
            int i = this.q;
            if (i > 0 && this.t == 0) {
                this.w = 0;
            } else if (i != 0 || this.t <= 0) {
            } else {
                this.x = 1.0f / this.x;
                this.w = 1;
            }
        }
    }

    public void Y0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.f2262d.k();
        boolean k2 = z2 & this.f2263e.k();
        b.e.b.k.m.l lVar = this.f2262d;
        int i3 = lVar.f2330h.f2301g;
        n nVar = this.f2263e;
        int i4 = nVar.f2330h.f2301g;
        int i5 = lVar.i.f2301g;
        int i6 = nVar.i.f2301g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.W = i3;
        }
        if (k2) {
            this.X = i4;
        }
        if (this.e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        if (k) {
            if (this.Q[0] == b.FIXED && i8 < (i2 = this.S)) {
                i8 = i2;
            }
            this.S = i8;
            int i10 = this.Z;
            if (i8 < i10) {
                this.S = i10;
            }
        }
        if (!k2) {
            return;
        }
        if (this.Q[1] == b.FIXED && i9 < (i = this.T)) {
            i9 = i;
        }
        this.T = i9;
        int i11 = this.a0;
        if (i9 >= i11) {
            return;
        }
        this.T = i11;
    }

    public boolean Z() {
        d dVar = this.F;
        d dVar2 = dVar.f2248f;
        if (dVar2 == null || dVar2.f2248f != dVar) {
            d dVar3 = this.H;
            d dVar4 = dVar3.f2248f;
            return dVar4 != null && dVar4.f2248f == dVar3;
        }
        return true;
    }

    public void Z0(b.e.b.d dVar, boolean z) {
        n nVar;
        b.e.b.k.m.l lVar;
        int x = dVar.x(this.F);
        int x2 = dVar.x(this.G);
        int x3 = dVar.x(this.H);
        int x4 = dVar.x(this.I);
        if (z && (lVar = this.f2262d) != null) {
            b.e.b.k.m.f fVar = lVar.f2330h;
            if (fVar.j) {
                b.e.b.k.m.f fVar2 = lVar.i;
                if (fVar2.j) {
                    x = fVar.f2301g;
                    x3 = fVar2.f2301g;
                }
            }
        }
        if (z && (nVar = this.f2263e) != null) {
            b.e.b.k.m.f fVar3 = nVar.f2330h;
            if (fVar3.j) {
                b.e.b.k.m.f fVar4 = nVar.i;
                if (fVar4.j) {
                    x2 = fVar3.f2301g;
                    x4 = fVar4.f2301g;
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        t0(x, x2, x3, x4);
    }

    public boolean a0() {
        return this.B;
    }

    public boolean b0() {
        d dVar = this.G;
        d dVar2 = dVar.f2248f;
        if (dVar2 == null || dVar2.f2248f != dVar) {
            d dVar3 = this.I;
            d dVar4 = dVar3.f2248f;
            return dVar4 != null && dVar4.f2248f == dVar3;
        }
        return true;
    }

    public boolean c0() {
        return this.C;
    }

    public boolean d0() {
        return this.f2265g && this.e0 != 8;
    }

    public void e(f fVar, b.e.b.d dVar, HashSet<e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.B1(64));
        }
        if (i == 0) {
            HashSet<d> c2 = this.F.c();
            if (c2 != null) {
                Iterator<d> it = c2.iterator();
                while (it.hasNext()) {
                    it.next().f2246d.e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<d> c3 = this.H.c();
            if (c3 == null) {
                return;
            }
            Iterator<d> it2 = c3.iterator();
            while (it2.hasNext()) {
                it2.next().f2246d.e(fVar, dVar, hashSet, i, true);
            }
            return;
        }
        HashSet<d> c4 = this.G.c();
        if (c4 != null) {
            Iterator<d> it3 = c4.iterator();
            while (it3.hasNext()) {
                it3.next().f2246d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> c5 = this.I.c();
        if (c5 != null) {
            Iterator<d> it4 = c5.iterator();
            while (it4.hasNext()) {
                it4.next().f2246d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> c6 = this.J.c();
        if (c6 == null) {
            return;
        }
        Iterator<d> it5 = c6.iterator();
        while (it5.hasNext()) {
            it5.next().f2246d.e(fVar, dVar, hashSet, i, true);
        }
    }

    public boolean e0() {
        return this.j || (this.F.m() && this.H.m());
    }

    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        return this.k || (this.G.m() && this.I.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(b.e.b.d r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.e.g(b.e.b.d, boolean):void");
    }

    public boolean g0() {
        b[] bVarArr = this.Q;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public boolean h() {
        return this.e0 != 8;
    }

    public void h0() {
        this.F.p();
        this.G.p();
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.R = null;
        this.z = 0.0f;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        float f2 = o0;
        this.b0 = f2;
        this.c0 = f2;
        b[] bVarArr = this.Q;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.d0 = null;
        this.e0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.l = -1;
        this.m = -1;
        int[] iArr = this.y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.n = 0;
        this.o = 0;
        this.s = 1.0f;
        this.v = 1.0f;
        this.r = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.q = 0;
        this.t = 0;
        this.w = -1;
        this.x = 1.0f;
        boolean[] zArr = this.f2264f;
        zArr[0] = true;
        zArr[1] = true;
        this.C = false;
        boolean[] zArr2 = this.P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2265g = true;
    }

    public void i0() {
        this.j = false;
        this.k = false;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).q();
        }
    }

    public void j(e eVar, float f2, int i) {
        d.b bVar = d.b.CENTER;
        X(bVar, eVar, bVar, i, 0);
        this.z = f2;
    }

    public void j0(b.e.b.c cVar) {
        this.F.r(cVar);
        this.G.r(cVar);
        this.H.r(cVar);
        this.I.r(cVar);
        this.J.r(cVar);
        this.M.r(cVar);
        this.K.r(cVar);
        this.L.r(cVar);
    }

    public void k(b.e.b.d dVar) {
        dVar.q(this.F);
        dVar.q(this.G);
        dVar.q(this.H);
        dVar.q(this.I);
        if (this.Y > 0) {
            dVar.q(this.J);
        }
    }

    public void k0(int i) {
        this.Y = i;
        this.A = i > 0;
    }

    public void l() {
        if (this.f2262d == null) {
            this.f2262d = new b.e.b.k.m.l(this);
        }
        if (this.f2263e == null) {
            this.f2263e = new n(this);
        }
    }

    public void l0(Object obj) {
        this.d0 = obj;
    }

    public d m(d.b bVar) {
        switch (a.f2267a[bVar.ordinal()]) {
            case 1:
                return this.F;
            case 2:
                return this.G;
            case 3:
                return this.H;
            case 4:
                return this.I;
            case 5:
                return this.J;
            case 6:
                return this.M;
            case 7:
                return this.K;
            case 8:
                return this.L;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(String str) {
        this.f0 = str;
    }

    public int n() {
        return this.Y;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0084 -> B:36:0x0085). Please submit an issue!!! */
    public void n0(String str) {
        float f2;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.U = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f2 = Float.parseFloat(substring2);
            }
            f2 = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f2 = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f2 = 0.0f;
        }
        i = (f2 > i ? 1 : (f2 == i ? 0 : -1));
        if (i <= 0) {
            return;
        }
        this.U = f2;
        this.V = i2;
    }

    public float o(int i) {
        if (i == 0) {
            return this.b0;
        }
        if (i != 1) {
            return -1.0f;
        }
        return this.c0;
    }

    public void o0(int i) {
        if (!this.A) {
            return;
        }
        int i2 = i - this.Y;
        int i3 = this.T + i2;
        this.X = i2;
        this.G.s(i2);
        this.I.s(i3);
        this.J.s(i);
        this.k = true;
    }

    public int p() {
        return T() + this.T;
    }

    public void p0(int i, int i2) {
        this.F.s(i);
        this.H.s(i2);
        this.W = i;
        this.S = i2 - i;
        this.j = true;
    }

    public Object q() {
        return this.d0;
    }

    public void q0(int i) {
        this.F.s(i);
        this.W = i;
    }

    public String r() {
        return this.f0;
    }

    public void r0(int i) {
        this.G.s(i);
        this.X = i;
    }

    public b s(int i) {
        if (i == 0) {
            return y();
        }
        if (i != 1) {
            return null;
        }
        return O();
    }

    public void s0(int i, int i2) {
        this.G.s(i);
        this.I.s(i2);
        this.X = i;
        this.T = i2 - i;
        if (this.A) {
            this.J.s(i + this.Y);
        }
        this.k = true;
    }

    public float t() {
        return this.U;
    }

    public void t0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.W = i;
        this.X = i2;
        if (this.e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        b[] bVarArr = this.Q;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.S)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.T)) {
            i8 = i5;
        }
        this.S = i7;
        this.T = i8;
        int i9 = this.a0;
        if (i8 < i9) {
            this.T = i9;
        }
        int i10 = this.Z;
        if (i7 >= i10) {
            return;
        }
        this.S = i10;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.g0 != null) {
            str = "type: " + this.g0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f0 != null) {
            str2 = "id: " + this.f0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.W);
        sb.append(", ");
        sb.append(this.X);
        sb.append(") - (");
        sb.append(this.S);
        sb.append(" x ");
        sb.append(this.T);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.V;
    }

    public void u0(boolean z) {
        this.A = z;
    }

    public int v() {
        if (this.e0 == 8) {
            return 0;
        }
        return this.T;
    }

    public void v0(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public float w() {
        return this.b0;
    }

    public void w0(float f2) {
        this.b0 = f2;
    }

    public int x() {
        return this.h0;
    }

    public void x0(int i) {
        this.h0 = i;
    }

    public b y() {
        return this.Q[0];
    }

    public void y0(int i, int i2) {
        this.W = i;
        int i3 = i2 - i;
        this.S = i3;
        int i4 = this.Z;
        if (i3 < i4) {
            this.S = i4;
        }
    }

    public int z() {
        d dVar = this.F;
        int i = 0;
        if (dVar != null) {
            i = 0 + dVar.f2249g;
        }
        d dVar2 = this.H;
        return dVar2 != null ? i + dVar2.f2249g : i;
    }

    public void z0(b bVar) {
        this.Q[0] = bVar;
    }
}
