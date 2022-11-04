package b.e.b.k;

import b.e.b.i;
import b.e.b.k.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b */
    private int f2244b;

    /* renamed from: c */
    private boolean f2245c;

    /* renamed from: d */
    public final e f2246d;

    /* renamed from: e */
    public final b f2247e;

    /* renamed from: f */
    public d f2248f;
    b.e.b.i i;

    /* renamed from: a */
    private HashSet<d> f2243a = null;

    /* renamed from: g */
    public int f2249g = 0;

    /* renamed from: h */
    int f2250h = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2251a;

        static {
            int[] iArr = new int[b.values().length];
            f2251a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2251a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2251a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2251a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2251a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2251a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2251a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2251a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2251a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
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

    public d(e eVar, b bVar) {
        this.f2246d = eVar;
        this.f2247e = bVar;
    }

    public boolean a(d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            p();
            return true;
        } else if (!z && !o(dVar)) {
            return false;
        } else {
            this.f2248f = dVar;
            if (dVar.f2243a == null) {
                dVar.f2243a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f2248f.f2243a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f2249g = i;
            } else {
                this.f2249g = 0;
            }
            this.f2250h = i2;
            return true;
        }
    }

    public void b(int i, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f2243a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                b.e.b.k.m.i.a(it.next().f2246d, i, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f2243a;
    }

    public int d() {
        if (!this.f2245c) {
            return 0;
        }
        return this.f2244b;
    }

    public int e() {
        d dVar;
        if (this.f2246d.Q() == 8) {
            return 0;
        }
        return (this.f2250h <= -1 || (dVar = this.f2248f) == null || dVar.f2246d.Q() != 8) ? this.f2249g : this.f2250h;
    }

    public final d f() {
        switch (a.f2251a[this.f2247e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2246d.H;
            case 3:
                return this.f2246d.F;
            case 4:
                return this.f2246d.I;
            case 5:
                return this.f2246d.G;
            default:
                throw new AssertionError(this.f2247e.name());
        }
    }

    public e g() {
        return this.f2246d;
    }

    public b.e.b.i h() {
        return this.i;
    }

    public d i() {
        return this.f2248f;
    }

    public b j() {
        return this.f2247e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f2243a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f2243a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f2245c;
    }

    public boolean n() {
        return this.f2248f != null;
    }

    public boolean o(d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        b j = dVar.j();
        b bVar = this.f2247e;
        if (j == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.f2251a[bVar.ordinal()]) {
            case 1:
                return (j == b.BASELINE || j == b.CENTER_X || j == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = j == b.LEFT || j == b.RIGHT;
                if (!(dVar.g() instanceof g)) {
                    return z2;
                }
                if (z2 || j == b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = j == b.TOP || j == b.BOTTOM;
                if (!(dVar.g() instanceof g)) {
                    return z3;
                }
                if (z3 || j == b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2247e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f2248f;
        if (dVar != null && (hashSet = dVar.f2243a) != null) {
            hashSet.remove(this);
            if (this.f2248f.f2243a.size() == 0) {
                this.f2248f.f2243a = null;
            }
        }
        this.f2243a = null;
        this.f2248f = null;
        this.f2249g = 0;
        this.f2250h = -1;
        this.f2245c = false;
        this.f2244b = 0;
    }

    public void q() {
        this.f2245c = false;
        this.f2244b = 0;
    }

    public void r(b.e.b.c cVar) {
        b.e.b.i iVar = this.i;
        if (iVar == null) {
            this.i = new b.e.b.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void s(int i) {
        this.f2244b = i;
        this.f2245c = true;
    }

    public String toString() {
        return this.f2246d.r() + ":" + this.f2247e.toString();
    }
}
