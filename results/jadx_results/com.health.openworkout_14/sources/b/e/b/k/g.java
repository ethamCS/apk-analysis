package b.e.b.k;

import b.e.b.k.d;
import b.e.b.k.e;
/* loaded from: classes.dex */
public class g extends e {
    protected float p0 = -1.0f;
    protected int q0 = -1;
    protected int r0 = -1;
    private d s0 = this.G;
    private int t0 = 0;
    private boolean u0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2274a;

        static {
            int[] iArr = new int[d.b.values().length];
            f2274a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2274a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2274a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2274a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2274a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2274a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2274a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2274a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2274a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.O.clear();
        this.O.add(this.s0);
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            this.N[i] = this.s0;
        }
    }

    @Override // b.e.b.k.e
    public void Z0(b.e.b.d dVar, boolean z) {
        if (I() == null) {
            return;
        }
        int x = dVar.x(this.s0);
        if (this.t0 == 1) {
            V0(x);
            W0(0);
            v0(I().v());
            U0(0);
            return;
        }
        V0(0);
        W0(x);
        U0(I().R());
        v0(0);
    }

    public d a1() {
        return this.s0;
    }

    public int b1() {
        return this.t0;
    }

    public int c1() {
        return this.q0;
    }

    public int d1() {
        return this.r0;
    }

    @Override // b.e.b.k.e
    public boolean e0() {
        return this.u0;
    }

    public float e1() {
        return this.p0;
    }

    @Override // b.e.b.k.e
    public boolean f0() {
        return this.u0;
    }

    public void f1(int i) {
        this.s0.s(i);
        this.u0 = true;
    }

    @Override // b.e.b.k.e
    public void g(b.e.b.d dVar, boolean z) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m = fVar.m(d.b.LEFT);
        d m2 = fVar.m(d.b.RIGHT);
        e eVar = this.R;
        boolean z2 = true;
        boolean z3 = eVar != null && eVar.Q[0] == e.b.WRAP_CONTENT;
        if (this.t0 == 0) {
            m = fVar.m(d.b.TOP);
            m2 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.R;
            if (eVar2 == null || eVar2.Q[1] != e.b.WRAP_CONTENT) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.u0 && this.s0.m()) {
            b.e.b.i q = dVar.q(this.s0);
            dVar.f(q, this.s0.d());
            if (this.q0 != -1) {
                if (z3) {
                    dVar.h(dVar.q(m2), q, 0, 5);
                }
            } else if (this.r0 != -1 && z3) {
                b.e.b.i q2 = dVar.q(m2);
                dVar.h(q, dVar.q(m), 0, 5);
                dVar.h(q2, q, 0, 5);
            }
            this.u0 = false;
        } else if (this.q0 != -1) {
            b.e.b.i q3 = dVar.q(this.s0);
            dVar.e(q3, dVar.q(m), this.q0, 8);
            if (!z3) {
                return;
            }
            dVar.h(dVar.q(m2), q3, 0, 5);
        } else if (this.r0 == -1) {
            if (this.p0 == -1.0f) {
                return;
            }
            dVar.d(b.e.b.d.s(dVar, dVar.q(this.s0), dVar.q(m2), this.p0));
        } else {
            b.e.b.i q4 = dVar.q(this.s0);
            b.e.b.i q5 = dVar.q(m2);
            dVar.e(q4, q5, -this.r0, 8);
            if (!z3) {
                return;
            }
            dVar.h(q4, dVar.q(m), 0, 5);
            dVar.h(q5, q4, 0, 5);
        }
    }

    public void g1(int i) {
        if (i > -1) {
            this.p0 = -1.0f;
            this.q0 = i;
            this.r0 = -1;
        }
    }

    @Override // b.e.b.k.e
    public boolean h() {
        return true;
    }

    public void h1(int i) {
        if (i > -1) {
            this.p0 = -1.0f;
            this.q0 = -1;
            this.r0 = i;
        }
    }

    public void i1(float f2) {
        if (f2 > -1.0f) {
            this.p0 = f2;
            this.q0 = -1;
            this.r0 = -1;
        }
    }

    public void j1(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        this.O.clear();
        this.s0 = this.t0 == 1 ? this.F : this.G;
        this.O.add(this.s0);
        int length = this.N.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.N[i2] = this.s0;
        }
    }

    @Override // b.e.b.k.e
    public d m(d.b bVar) {
        switch (a.f2274a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.t0 == 1) {
                    return this.s0;
                }
                break;
            case 3:
            case 4:
                if (this.t0 == 0) {
                    return this.s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
