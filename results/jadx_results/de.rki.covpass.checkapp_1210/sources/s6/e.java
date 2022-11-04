package s6;

import h6.h;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: h */
    private static final e[] f21490h = a();

    /* renamed from: a */
    private final int f21491a;

    /* renamed from: b */
    private final int f21492b;

    /* renamed from: c */
    private final int f21493c;

    /* renamed from: d */
    private final int f21494d;

    /* renamed from: e */
    private final int f21495e;

    /* renamed from: f */
    private final c f21496f;

    /* renamed from: g */
    private final int f21497g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f21498a;

        /* renamed from: b */
        private final int f21499b;

        private b(int i10, int i11) {
            this.f21498a = i10;
            this.f21499b = i11;
        }

        public int a() {
            return this.f21498a;
        }

        public int b() {
            return this.f21499b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final int f21500a;

        /* renamed from: b */
        private final b[] f21501b;

        private c(int i10, b bVar) {
            this.f21500a = i10;
            this.f21501b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f21500a = i10;
            this.f21501b = new b[]{bVar, bVar2};
        }

        public b[] a() {
            return this.f21501b;
        }

        public int b() {
            return this.f21500a;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        b[] a10;
        this.f21491a = i10;
        this.f21492b = i11;
        this.f21493c = i12;
        this.f21494d = i13;
        this.f21495e = i14;
        this.f21496f = cVar;
        int b10 = cVar.b();
        int i15 = 0;
        for (b bVar : cVar.a()) {
            i15 += bVar.a() * (bVar.b() + b10);
        }
        this.f21497g = i15;
    }

    private static e[] a() {
        return new e[]{new e(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new e(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(1, 174))), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new e(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new e(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i10, int i11) {
        e[] eVarArr;
        if ((i10 & 1) == 0 && (i11 & 1) == 0) {
            for (e eVar : f21490h) {
                if (eVar.f21492b == i10 && eVar.f21493c == i11) {
                    return eVar;
                }
            }
            throw h.b();
        }
        throw h.b();
    }

    public int b() {
        return this.f21495e;
    }

    public int c() {
        return this.f21494d;
    }

    public c d() {
        return this.f21496f;
    }

    public int e() {
        return this.f21493c;
    }

    public int f() {
        return this.f21492b;
    }

    public int g() {
        return this.f21497g;
    }

    public int i() {
        return this.f21491a;
    }

    public String toString() {
        return String.valueOf(this.f21491a);
    }
}
