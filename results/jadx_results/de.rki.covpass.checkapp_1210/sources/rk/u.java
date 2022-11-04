package rk;
/* loaded from: classes3.dex */
public class u implements v {
    public float U3;
    public float V3;
    public float W3;
    public float X3;

    /* renamed from: c */
    public float f21312c;

    /* renamed from: d */
    public float f21313d;

    /* renamed from: q */
    public float f21314q;

    /* renamed from: x */
    public float f21315x;

    /* renamed from: y */
    public float f21316y;

    @Override // rk.v
    public void K(int i10, int i11, float f10) {
        if (i10 == 0) {
            if (i11 == 0) {
                this.f21312c = f10;
                return;
            } else if (i11 == 1) {
                this.f21313d = f10;
                return;
            } else if (i11 == 2) {
                this.f21314q = f10;
                return;
            }
        } else if (i10 == 1) {
            if (i11 == 0) {
                this.f21315x = f10;
                return;
            } else if (i11 == 1) {
                this.f21316y = f10;
                return;
            } else if (i11 == 2) {
                this.U3 = f10;
                return;
            }
        } else if (i10 == 2) {
            if (i11 == 0) {
                this.V3 = f10;
                return;
            } else if (i11 == 1) {
                this.W3 = f10;
                return;
            } else if (i11 == 2) {
                this.X3 = f10;
                return;
            }
        }
        throw new IllegalArgumentException("Row and/or column out of range. " + i10 + " " + i11);
    }

    @Override // rk.c0
    public int Z() {
        return 3;
    }

    @Override // rk.v
    public float d(int i10, int i11) {
        return l(i10, i11);
    }

    @Override // rk.c0
    public e0 getType() {
        return e0.UNSPECIFIED;
    }

    @Override // rk.v
    public float l(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return this.f21312c;
            }
            if (i11 == 1) {
                return this.f21313d;
            }
            if (i11 == 2) {
                return this.f21314q;
            }
        } else if (i10 == 1) {
            if (i11 == 0) {
                return this.f21315x;
            }
            if (i11 == 1) {
                return this.f21316y;
            }
            if (i11 == 2) {
                return this.U3;
            }
        } else if (i10 == 2) {
            if (i11 == 0) {
                return this.V3;
            }
            if (i11 == 1) {
                return this.W3;
            }
            if (i11 == 2) {
                return this.X3;
            }
        }
        throw new IllegalArgumentException("Row and/or column out of range. " + i10 + " " + i11);
    }

    @Override // rk.c0
    public int w() {
        return 3;
    }
}
