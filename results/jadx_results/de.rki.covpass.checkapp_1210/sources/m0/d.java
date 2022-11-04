package m0;

import j0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n0.o;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b */
    private int f16155b;

    /* renamed from: c */
    private boolean f16156c;

    /* renamed from: d */
    public final e f16157d;

    /* renamed from: e */
    public final b f16158e;

    /* renamed from: f */
    public d f16159f;

    /* renamed from: i */
    j0.i f16162i;

    /* renamed from: a */
    private HashSet<d> f16154a = null;

    /* renamed from: g */
    public int f16160g = 0;

    /* renamed from: h */
    int f16161h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16163a;

        static {
            int[] iArr = new int[b.values().length];
            f16163a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16163a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16163a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16163a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16163a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16163a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16163a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16163a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16163a[b.NONE.ordinal()] = 9;
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
        this.f16157d = eVar;
        this.f16158e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        } else if (!z10 && !o(dVar)) {
            return false;
        } else {
            this.f16159f = dVar;
            if (dVar.f16154a == null) {
                dVar.f16154a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f16159f.f16154a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f16160g = i10;
            this.f16161h = i11;
            return true;
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f16154a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                n0.i.a(it.next().f16157d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f16154a;
    }

    public int d() {
        if (!this.f16156c) {
            return 0;
        }
        return this.f16155b;
    }

    public int e() {
        d dVar;
        if (this.f16157d.T() == 8) {
            return 0;
        }
        return (this.f16161h == Integer.MIN_VALUE || (dVar = this.f16159f) == null || dVar.f16157d.T() != 8) ? this.f16160g : this.f16161h;
    }

    public final d f() {
        switch (a.f16163a[this.f16158e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f16157d.Q;
            case 3:
                return this.f16157d.O;
            case 4:
                return this.f16157d.R;
            case 5:
                return this.f16157d.P;
            default:
                throw new AssertionError(this.f16158e.name());
        }
    }

    public e g() {
        return this.f16157d;
    }

    public j0.i h() {
        return this.f16162i;
    }

    public d i() {
        return this.f16159f;
    }

    public b j() {
        return this.f16158e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f16154a;
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
        HashSet<d> hashSet = this.f16154a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f16156c;
    }

    public boolean n() {
        return this.f16159f != null;
    }

    public boolean o(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f16158e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f16163a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = j10 == b.LEFT || j10 == b.RIGHT;
                if (!(dVar.g() instanceof g)) {
                    return z11;
                }
                if (z11 || j10 == b.CENTER_X) {
                    z10 = true;
                }
                return z10;
            case 4:
            case 5:
                boolean z12 = j10 == b.TOP || j10 == b.BOTTOM;
                if (!(dVar.g() instanceof g)) {
                    return z12;
                }
                if (z12 || j10 == b.CENTER_Y) {
                    z10 = true;
                }
                return z10;
            case 6:
                return (j10 == b.LEFT || j10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f16158e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f16159f;
        if (dVar != null && (hashSet = dVar.f16154a) != null) {
            hashSet.remove(this);
            if (this.f16159f.f16154a.size() == 0) {
                this.f16159f.f16154a = null;
            }
        }
        this.f16154a = null;
        this.f16159f = null;
        this.f16160g = 0;
        this.f16161h = Integer.MIN_VALUE;
        this.f16156c = false;
        this.f16155b = 0;
    }

    public void q() {
        this.f16156c = false;
        this.f16155b = 0;
    }

    public void r(j0.c cVar) {
        j0.i iVar = this.f16162i;
        if (iVar == null) {
            this.f16162i = new j0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.h();
        }
    }

    public void s(int i10) {
        this.f16155b = i10;
        this.f16156c = true;
    }

    public String toString() {
        return this.f16157d.r() + ":" + this.f16158e.toString();
    }
}
