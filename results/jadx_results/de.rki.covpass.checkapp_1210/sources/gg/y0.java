package gg;
/* loaded from: classes3.dex */
public class y0 extends w {

    /* renamed from: x */
    private final int f10920x;

    /* renamed from: y */
    private final w[] f10921y;

    public y0(byte[] bArr) {
        this(bArr, 1000);
    }

    public y0(byte[] bArr, int i10) {
        this(bArr, null, i10);
    }

    private y0(byte[] bArr, w[] wVarArr, int i10) {
        super(bArr);
        this.f10921y = wVarArr;
        this.f10920x = i10;
    }

    public y0(w[] wVarArr) {
        this(wVarArr, 1000);
    }

    public y0(w[] wVarArr, int i10) {
        this(G(wVarArr), wVarArr, i10);
    }

    public static byte[] G(w[] wVarArr) {
        int length = wVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return wVarArr[0].f10910c;
            }
            int i10 = 0;
            for (w wVar : wVarArr) {
                i10 += wVar.f10910c.length;
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            for (w wVar2 : wVarArr) {
                byte[] bArr2 = wVar2.f10910c;
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return bArr;
        }
        return w.f10909q;
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        if (!n()) {
            byte[] bArr = this.f10910c;
            t1.G(yVar, z10, bArr, 0, bArr.length);
            return;
        }
        yVar.s(z10, 36);
        yVar.i(128);
        w[] wVarArr = this.f10921y;
        if (wVarArr == null) {
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.f10910c;
                if (i10 >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i10, this.f10920x);
                t1.G(yVar, true, this.f10910c, i10, min);
                i10 += min;
            }
        } else {
            yVar.x(wVarArr);
        }
        yVar.i(0);
        yVar.i(0);
    }

    @Override // gg.a0
    public boolean n() {
        return this.f10921y != null || this.f10910c.length > this.f10920x;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        if (!n()) {
            return t1.H(z10, this.f10910c.length);
        }
        int i10 = z10 ? 4 : 3;
        if (this.f10921y == null) {
            int length = this.f10910c.length;
            int i11 = this.f10920x;
            int i12 = length / i11;
            int H = i10 + (t1.H(true, i11) * i12);
            int length2 = this.f10910c.length - (i12 * this.f10920x);
            return length2 > 0 ? H + t1.H(true, length2) : H;
        }
        int i13 = 0;
        while (true) {
            w[] wVarArr = this.f10921y;
            if (i13 >= wVarArr.length) {
                return i10;
            }
            i10 += wVarArr[i13].q(true);
            i13++;
        }
    }
}
