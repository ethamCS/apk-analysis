package a.e.a.j;

import a.e.a.i;
/* loaded from: classes.dex */
public class e {

    /* renamed from: b */
    final f f125b;

    /* renamed from: c */
    final d f126c;
    e d;
    a.e.a.i i;

    /* renamed from: a */
    private m f124a = new m(this);
    public int e = 0;
    int f = -1;
    private c g = c.NONE;
    private int h = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f127a;

        static {
            int[] iArr = new int[d.values().length];
            f127a = iArr;
            try {
                iArr[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f127a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f127a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f127a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f127a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f127a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f127a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        RELAXED,
        STRICT
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* loaded from: classes.dex */
    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(f fVar, d dVar) {
        b bVar = b.RELAXED;
        this.f125b = fVar;
        this.f126c = dVar;
    }

    public int a() {
        return this.h;
    }

    public void a(a.e.a.c cVar) {
        a.e.a.i iVar = this.i;
        if (iVar == null) {
            this.i = new a.e.a.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.a();
        }
    }

    public boolean a(e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        d h = eVar.h();
        d dVar = this.f126c;
        if (h == dVar) {
            return dVar != d.BASELINE || (eVar.c().x() && c().x());
        }
        switch (a.f127a[dVar.ordinal()]) {
            case 1:
                return (h == d.BASELINE || h == d.CENTER_X || h == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = h == d.LEFT || h == d.RIGHT;
                if (!(eVar.c() instanceof i)) {
                    return z2;
                }
                if (z2 || h == d.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = h == d.TOP || h == d.BOTTOM;
                if (!(eVar.c() instanceof i)) {
                    return z3;
                }
                if (z3 || h == d.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f126c.name());
        }
    }

    public boolean a(e eVar, int i, int i2, c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = c.NONE;
            this.h = 2;
            return true;
        } else if (!z && !a(eVar)) {
            return false;
        } else {
            this.d = eVar;
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.f = i2;
            this.g = cVar;
            this.h = i3;
            return true;
        }
    }

    public boolean a(e eVar, int i, c cVar, int i2) {
        return a(eVar, i, -1, cVar, i2, false);
    }

    public int b() {
        e eVar;
        if (this.f125b.r() == 8) {
            return 0;
        }
        return (this.f <= -1 || (eVar = this.d) == null || eVar.f125b.r() != 8) ? this.e : this.f;
    }

    public f c() {
        return this.f125b;
    }

    public m d() {
        return this.f124a;
    }

    public a.e.a.i e() {
        return this.i;
    }

    public c f() {
        return this.g;
    }

    public e g() {
        return this.d;
    }

    public d h() {
        return this.f126c;
    }

    public boolean i() {
        return this.d != null;
    }

    public void j() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = c.STRONG;
        this.h = 0;
        b bVar = b.RELAXED;
        this.f124a.d();
    }

    public String toString() {
        return this.f125b.f() + ":" + this.f126c.toString();
    }
}
