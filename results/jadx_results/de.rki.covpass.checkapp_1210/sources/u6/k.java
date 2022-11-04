package u6;
/* loaded from: classes.dex */
public class k {

    /* renamed from: i */
    static final k[] f23149i;

    /* renamed from: j */
    private static k[] f23150j;

    /* renamed from: a */
    private final boolean f23151a;

    /* renamed from: b */
    private final int f23152b;

    /* renamed from: c */
    private final int f23153c;

    /* renamed from: d */
    public final int f23154d;

    /* renamed from: e */
    public final int f23155e;

    /* renamed from: f */
    private final int f23156f;

    /* renamed from: g */
    private final int f23157g;

    /* renamed from: h */
    private final int f23158h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f23149i = kVarArr;
        f23150j = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f23151a = z10;
        this.f23152b = i10;
        this.f23153c = i11;
        this.f23154d = i12;
        this.f23155e = i13;
        this.f23156f = i14;
        this.f23157g = i15;
        this.f23158h = i16;
    }

    private int e() {
        int i10 = this.f23156f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 != 36) {
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 6;
            }
        }
        return i11;
    }

    private int k() {
        int i10 = this.f23156f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 36) {
            throw new IllegalStateException("Cannot handle this number of data regions");
        }
        return 6;
    }

    public static k l(int i10, l lVar, h6.f fVar, h6.f fVar2, boolean z10) {
        k[] kVarArr;
        for (k kVar : f23150j) {
            if ((lVar != l.FORCE_SQUARE || !kVar.f23151a) && ((lVar != l.FORCE_RECTANGLE || kVar.f23151a) && ((fVar == null || (kVar.j() >= fVar.b() && kVar.i() >= fVar.a())) && ((fVar2 == null || (kVar.j() <= fVar2.b() && kVar.i() <= fVar2.a())) && i10 <= kVar.f23152b)))) {
                return kVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public final int a() {
        return this.f23152b;
    }

    public int b(int i10) {
        return this.f23157g;
    }

    public final int c() {
        return this.f23153c;
    }

    public final int d(int i10) {
        return this.f23158h;
    }

    public int f() {
        return this.f23152b / this.f23157g;
    }

    public final int g() {
        return k() * this.f23155e;
    }

    public final int h() {
        return e() * this.f23154d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23151a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f23154d);
        sb2.append('x');
        sb2.append(this.f23155e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f23152b);
        sb2.append('+');
        sb2.append(this.f23153c);
        return sb2.toString();
    }
}
