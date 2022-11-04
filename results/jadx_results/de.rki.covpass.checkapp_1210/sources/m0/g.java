package m0;

import m0.d;
import m0.e;
/* loaded from: classes.dex */
public class g extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16244a;

        static {
            int[] iArr = new int[d.b.values().length];
            f16244a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16244a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16244a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16244a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16244a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16244a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16244a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16244a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16244a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.W[i10] = this.P0;
        }
    }

    @Override // m0.e
    public void g(j0.d dVar, boolean z10) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m10 = fVar.m(d.b.LEFT);
        d m11 = fVar.m(d.b.RIGHT);
        e eVar = this.f16170a0;
        boolean z11 = true;
        boolean z12 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            m10 = fVar.m(d.b.TOP);
            m11 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f16170a0;
            if (eVar2 == null || eVar2.Z[1] != e.b.WRAP_CONTENT) {
                z11 = false;
            }
            z12 = z11;
        }
        if (this.S0 && this.P0.m()) {
            j0.i q10 = dVar.q(this.P0);
            dVar.f(q10, this.P0.d());
            if (this.M0 != -1) {
                if (z12) {
                    dVar.h(dVar.q(m11), q10, 0, 5);
                }
            } else if (this.N0 != -1 && z12) {
                j0.i q11 = dVar.q(m11);
                dVar.h(q10, dVar.q(m10), 0, 5);
                dVar.h(q11, q10, 0, 5);
            }
            this.S0 = false;
        } else if (this.M0 != -1) {
            j0.i q12 = dVar.q(this.P0);
            dVar.e(q12, dVar.q(m10), this.M0, 8);
            if (!z12) {
                return;
            }
            dVar.h(dVar.q(m11), q12, 0, 5);
        } else if (this.N0 == -1) {
            if (this.L0 == -1.0f) {
                return;
            }
            dVar.d(j0.d.s(dVar, dVar.q(this.P0), dVar.q(m11), this.L0));
        } else {
            j0.i q13 = dVar.q(this.P0);
            j0.i q14 = dVar.q(m11);
            dVar.e(q13, q14, -this.N0, 8);
            if (!z12) {
                return;
            }
            dVar.h(q13, dVar.q(m10), 0, 5);
            dVar.h(q14, q13, 0, 5);
        }
    }

    @Override // m0.e
    public boolean h() {
        return true;
    }

    @Override // m0.e
    public boolean l0() {
        return this.S0;
    }

    @Override // m0.e
    public d m(d.b bVar) {
        int i10 = a.f16244a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.Q0 != 1) {
                return null;
            }
            return this.P0;
        } else if ((i10 != 3 && i10 != 4) || this.Q0 != 0) {
            return null;
        } else {
            return this.P0;
        }
    }

    @Override // m0.e
    public boolean m0() {
        return this.S0;
    }

    @Override // m0.e
    public void n1(j0.d dVar, boolean z10) {
        if (I() == null) {
            return;
        }
        int x10 = dVar.x(this.P0);
        if (this.Q0 == 1) {
            j1(x10);
            k1(0);
            I0(I().v());
            h1(0);
            return;
        }
        j1(0);
        k1(x10);
        h1(I().U());
        I0(0);
    }

    public d o1() {
        return this.P0;
    }

    public int p1() {
        return this.Q0;
    }

    public int q1() {
        return this.M0;
    }

    public int r1() {
        return this.N0;
    }

    public float s1() {
        return this.L0;
    }

    public void t1(int i10) {
        this.P0.s(i10);
        this.S0 = true;
    }

    public void u1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = i10;
            this.N0 = -1;
        }
    }

    public void v1(int i10) {
        if (i10 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i10;
        }
    }

    public void w1(float f10) {
        if (f10 > -1.0f) {
            this.L0 = f10;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void x1(int i10) {
        if (this.Q0 == i10) {
            return;
        }
        this.Q0 = i10;
        this.X.clear();
        this.P0 = this.Q0 == 1 ? this.O : this.P;
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.W[i11] = this.P0;
        }
    }
}
