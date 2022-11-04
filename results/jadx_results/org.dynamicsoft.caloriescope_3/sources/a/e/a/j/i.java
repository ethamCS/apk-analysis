package a.e.a.j;

import a.e.a.j.e;
import a.e.a.j.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i extends f {
    protected float k0 = -1.0f;
    protected int l0 = -1;
    protected int m0 = -1;
    private e n0 = this.t;
    private int o0 = 0;
    private boolean p0 = false;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f144a;

        static {
            int[] iArr = new int[e.d.values().length];
            f144a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f144a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f144a[e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f144a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f144a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f144a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f144a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f144a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f144a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public i() {
        new l();
        this.B.clear();
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.n0;
        }
    }

    public int J() {
        return this.o0;
    }

    @Override // a.e.a.j.f
    public e a(e.d dVar) {
        switch (a.f144a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 3:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // a.e.a.j.f
    public void a(int i) {
        e eVar;
        m mVar;
        int i2;
        e eVar2;
        m mVar2;
        m d;
        int i3;
        e eVar3;
        f k = k();
        if (k == null) {
            return;
        }
        if (J() == 1) {
            this.t.d().a(1, k.t.d(), 0);
            this.v.d().a(1, k.t.d(), 0);
            if (this.l0 != -1) {
                this.s.d().a(1, k.s.d(), this.l0);
                mVar2 = this.u.d();
                eVar3 = k.s;
                d = eVar3.d();
                i3 = this.l0;
            } else if (this.m0 == -1) {
                if (this.k0 == -1.0f || k.j() != f.b.FIXED) {
                    return;
                }
                i2 = (int) (k.E * this.k0);
                this.s.d().a(1, k.s.d(), i2);
                mVar = this.u.d();
                eVar = k.s;
                mVar.a(1, eVar.d(), i2);
                return;
            } else {
                this.s.d().a(1, k.u.d(), -this.m0);
                mVar2 = this.u.d();
                eVar2 = k.u;
                d = eVar2.d();
                i3 = -this.m0;
            }
        } else {
            this.s.d().a(1, k.s.d(), 0);
            this.u.d().a(1, k.s.d(), 0);
            if (this.l0 != -1) {
                this.t.d().a(1, k.t.d(), this.l0);
                mVar2 = this.v.d();
                eVar3 = k.t;
                d = eVar3.d();
                i3 = this.l0;
            } else if (this.m0 == -1) {
                if (this.k0 == -1.0f || k.q() != f.b.FIXED) {
                    return;
                }
                i2 = (int) (k.F * this.k0);
                this.t.d().a(1, k.t.d(), i2);
                mVar = this.v.d();
                eVar = k.t;
                mVar.a(1, eVar.d(), i2);
                return;
            } else {
                this.t.d().a(1, k.v.d(), -this.m0);
                mVar2 = this.v.d();
                eVar2 = k.v;
                d = eVar2.d();
                i3 = -this.m0;
            }
        }
        mVar2.a(1, d, i3);
    }

    @Override // a.e.a.j.f
    public void a(a.e.a.e eVar) {
        g gVar = (g) k();
        if (gVar == null) {
            return;
        }
        e a2 = gVar.a(e.d.LEFT);
        e a3 = gVar.a(e.d.RIGHT);
        f fVar = this.D;
        boolean z = true;
        boolean z2 = fVar != null && fVar.C[0] == f.b.WRAP_CONTENT;
        if (this.o0 == 0) {
            a2 = gVar.a(e.d.TOP);
            a3 = gVar.a(e.d.BOTTOM);
            f fVar2 = this.D;
            if (fVar2 == null || fVar2.C[1] != f.b.WRAP_CONTENT) {
                z = false;
            }
            z2 = z;
        }
        if (this.l0 != -1) {
            a.e.a.i a4 = eVar.a(this.n0);
            eVar.a(a4, eVar.a(a2), this.l0, 6);
            if (!z2) {
                return;
            }
            eVar.b(eVar.a(a3), a4, 0, 5);
        } else if (this.m0 == -1) {
            if (this.k0 == -1.0f) {
                return;
            }
            eVar.a(a.e.a.e.a(eVar, eVar.a(this.n0), eVar.a(a2), eVar.a(a3), this.k0, this.p0));
        } else {
            a.e.a.i a5 = eVar.a(this.n0);
            a.e.a.i a6 = eVar.a(a3);
            eVar.a(a5, a6, -this.m0, 6);
            if (!z2) {
                return;
            }
            eVar.b(a5, eVar.a(a2), 0, 5);
            eVar.b(a6, a5, 0, 5);
        }
    }

    @Override // a.e.a.j.f
    public boolean a() {
        return true;
    }

    @Override // a.e.a.j.f
    public ArrayList<e> b() {
        return this.B;
    }

    @Override // a.e.a.j.f
    public void c(a.e.a.e eVar) {
        if (k() == null) {
            return;
        }
        int b2 = eVar.b(this.n0);
        if (this.o0 == 1) {
            r(b2);
            s(0);
            g(k().i());
            o(0);
            return;
        }
        r(0);
        s(b2);
        o(k().s());
        g(0);
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.k0 = f;
            this.l0 = -1;
            this.m0 = -1;
        }
    }

    public void t(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = i;
            this.m0 = -1;
        }
    }

    public void u(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = -1;
            this.m0 = i;
        }
    }

    public void v(int i) {
        if (this.o0 == i) {
            return;
        }
        this.o0 = i;
        this.B.clear();
        this.n0 = this.o0 == 1 ? this.s : this.t;
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A[i2] = this.n0;
        }
    }
}
