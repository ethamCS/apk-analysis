package u7;

import java.util.Objects;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: m */
    public static final c f23180m;

    /* renamed from: n */
    public static final c f23181n;

    /* renamed from: o */
    public static final c f23182o;

    /* renamed from: p */
    public static final c f23183p;

    /* renamed from: q */
    public static final c f23184q;

    /* renamed from: r */
    public static final c f23185r;

    /* renamed from: s */
    public static final c f23186s;

    /* renamed from: t */
    public static final c f23187t;

    /* renamed from: u */
    public static final c f23188u;

    /* renamed from: v */
    public static final c f23189v;

    /* renamed from: x */
    public static final c f23191x;

    /* renamed from: y */
    private static final c f23192y;

    /* renamed from: a */
    private final boolean f23194a;

    /* renamed from: b */
    private final f f23195b;

    /* renamed from: c */
    private final boolean f23196c;

    /* renamed from: d */
    private final f f23197d;

    /* renamed from: e */
    private final f f23198e;

    /* renamed from: f */
    private final boolean f23199f;

    /* renamed from: g */
    private final boolean f23200g;

    /* renamed from: h */
    private final boolean f23201h;

    /* renamed from: i */
    private final i f23202i;

    /* renamed from: j */
    private final boolean f23203j;

    /* renamed from: k */
    private final int f23204k;

    /* renamed from: l */
    private int f23205l;

    /* renamed from: w */
    public static final c f23190w = c(0);

    /* renamed from: z */
    private static final c f23193z = new c(0, i.Down, 0, 0, false).r();

    static {
        i iVar = i.HalfUp;
        f23180m = d(9, iVar);
        f23181n = new c(0, iVar, 0, 0, true).l(true).h(false).i(f.Y(0).n1(f.Z(2147483647L)), f.Y(1).d(f.Z(2147483647L)));
        i iVar2 = i.HalfEven;
        f23182o = d(113, iVar2).l(true).m(-16382, 16383);
        f23183p = d(11, iVar2).l(true).m(-14, 15);
        f23184q = d(24, iVar2).l(true).m(-126, 127);
        f23185r = d(53, iVar2).l(true).m(-1022, 1023);
        f23186s = new c(96, iVar2, 0, 28, true).o(true);
        f23187t = new c(34, iVar2, -6143, 6144, true);
        f23188u = new c(7, iVar2, -95, 96, true);
        f23189v = new c(16, iVar2, -383, 384, true);
        f23191x = c(0).p(iVar2);
        f23192y = new c(0, iVar2, 0, 0, false).r();
    }

    public c(int i10, i iVar, int i11, int i12, boolean z10) {
        this(true, f.Y(i10), z10, f.Y(i12), f.Y(i11), 0, true, false, false, iVar, false, 0);
    }

    private c(boolean z10, f fVar, boolean z11, f fVar2, f fVar3, int i10, boolean z12, boolean z13, boolean z14, i iVar, boolean z15, int i11) {
        Objects.requireNonNull(fVar, "bigintPrecision");
        Objects.requireNonNull(fVar3, "exponentMin");
        Objects.requireNonNull(fVar2, "exponentMax");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("precision(" + fVar + ") is less than 0");
        } else if (fVar3.compareTo(fVar2) > 0) {
            throw new IllegalArgumentException("exponentMinSmall(" + fVar3 + ") is more than " + fVar2);
        } else {
            this.f23194a = z10;
            this.f23195b = fVar;
            this.f23196c = z11;
            this.f23197d = fVar2;
            this.f23198e = fVar3;
            this.f23205l = i10;
            this.f23199f = z12;
            this.f23200g = z13;
            this.f23201h = z14;
            this.f23202i = iVar;
            this.f23203j = z15;
            this.f23204k = i11;
        }
    }

    public static c c(int i10) {
        return new c(i10, i.HalfUp, 0, 0, false).r();
    }

    public static c d(int i10, i iVar) {
        return new c(i10, iVar, 0, 0, false).r();
    }

    public static c e(i iVar) {
        return iVar == i.HalfEven ? f23192y : iVar == i.Down ? f23193z : new c(0, iVar, 0, 0, false).r();
    }

    public final boolean A() {
        return !this.f23195b.H1();
    }

    public final f B() {
        return this.f23195b;
    }

    public final i C() {
        return this.f23202i;
    }

    public final int D() {
        return this.f23204k;
    }

    public final boolean E() {
        return this.f23201h;
    }

    public final boolean F() {
        return this.f23203j;
    }

    public final void G(int i10) {
        if (y()) {
            this.f23205l = i10;
            return;
        }
        throw new IllegalStateException("Can't set flags");
    }

    public c a() {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public boolean b(f fVar) {
        Objects.requireNonNull(fVar, "exponent");
        if (!x()) {
            return true;
        }
        if (this.f23195b.H1()) {
            return fVar.compareTo(u()) <= 0;
        }
        return (this.f23194a ? fVar.d(this.f23195b).l1(1) : fVar).compareTo(v()) >= 0 && fVar.compareTo(u()) <= 0;
    }

    public c f() {
        return D() == 0 ? this : q(0).k();
    }

    public <T> T g(T t10, c cVar) {
        if (cVar == null || cVar.w() == 0) {
            return t10;
        }
        if (y()) {
            this.f23205l |= cVar.w();
        }
        int w9 = cVar.w() & D();
        if (w9 == 0) {
            return t10;
        }
        int i10 = w9 & (-40);
        if (i10 != 0) {
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = (1 << i11) & i10;
                if (i12 != 0) {
                    throw new j(w9, i12, this, t10);
                }
            }
        }
        int i13 = w9 & 4;
        if (i13 != 0) {
            throw new j(w9, i13, this, t10);
        }
        int i14 = w9 & 1;
        if (i14 != 0) {
            throw new j(w9, i14, this, t10);
        }
        int i15 = w9 & 2;
        if (i15 != 0) {
            throw new j(w9, i15, this, t10);
        }
        int i16 = w9 & 32;
        if (i16 != 0) {
            throw new j(w9, i16, this, t10);
        }
        return t10;
    }

    public c h(boolean z10) {
        return new c(z10, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c i(f fVar, f fVar2) {
        return new c(this.f23194a, this.f23195b, this.f23196c, fVar2, fVar, this.f23205l, true, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c j(f fVar) {
        return new c(this.f23194a, fVar, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c k() {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, 0, this.f23199f, true, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c l(boolean z10) {
        return new c(this.f23194a, this.f23195b, z10, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c m(int i10, int i11) {
        return i(f.Y(i10), f.Y(i11));
    }

    public c n() {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, 0, this.f23199f, false, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public c o(boolean z10) {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, z10, this.f23202i, this.f23203j, this.f23204k);
    }

    public c p(i iVar) {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, this.f23200g, this.f23201h, iVar, this.f23203j, this.f23204k);
    }

    public c q(int i10) {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, this.f23199f, true, this.f23201h, this.f23202i, this.f23203j, i10);
    }

    public c r() {
        return new c(this.f23194a, this.f23195b, this.f23196c, this.f23197d, this.f23198e, this.f23205l, false, this.f23200g, this.f23201h, this.f23202i, this.f23203j, this.f23204k);
    }

    public final boolean s() {
        return this.f23194a;
    }

    public final boolean t() {
        return this.f23199f && this.f23196c;
    }

    public String toString() {
        return "[PrecisionContext ExponentMax=" + this.f23197d + ", Traps=" + this.f23204k + ", ExponentMin=" + this.f23198e + ", HasExponentRange=" + this.f23199f + ", BigintPrecision=" + this.f23195b + ", Rounding=" + this.f23202i + ", ClampNormalExponents=" + this.f23196c + ", AdjustExponent=" + this.f23194a + ", Flags=" + this.f23205l + ", HasFlags=" + this.f23200g + ", IsSimplified=" + this.f23203j + "]";
    }

    public final f u() {
        return this.f23199f ? this.f23197d : f.Y(0);
    }

    public final f v() {
        return this.f23199f ? this.f23198e : f.Y(0);
    }

    public final int w() {
        return this.f23205l;
    }

    public final boolean x() {
        return this.f23199f;
    }

    public final boolean y() {
        return this.f23200g;
    }

    public final boolean z() {
        return y() || D() != 0;
    }
}
