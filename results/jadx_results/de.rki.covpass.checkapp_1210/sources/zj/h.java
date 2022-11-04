package zj;
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private int[] f27093a;

    public h(byte[] bArr) {
        if (bArr.length > 4) {
            int e10 = f.e(bArr, 0);
            int a10 = e.a(e10 - 1);
            if (bArr.length != (e10 * a10) + 4) {
                throw new IllegalArgumentException("invalid encoding");
            }
            this.f27093a = new int[e10];
            for (int i10 = 0; i10 < e10; i10++) {
                this.f27093a[i10] = f.f(bArr, (i10 * a10) + 4, a10);
            }
            if (!b(this.f27093a)) {
                throw new IllegalArgumentException("invalid encoding");
            }
            return;
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] < 0 || iArr[i10] >= length || zArr[iArr[i10]]) {
                return false;
            }
            zArr[iArr[i10]] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.f27093a.length;
        int a10 = e.a(length - 1);
        byte[] bArr = new byte[(length * a10) + 4];
        f.a(length, bArr, 0);
        for (int i10 = 0; i10 < length; i10++) {
            f.b(this.f27093a[i10], bArr, (i10 * a10) + 4, a10);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return d.b(this.f27093a, ((h) obj).f27093a);
    }

    public int hashCode() {
        return ak.a.I(this.f27093a);
    }

    public String toString() {
        String str = "[" + this.f27093a[0];
        for (int i10 = 1; i10 < this.f27093a.length; i10++) {
            str = str + ", " + this.f27093a[i10];
        }
        return str + "]";
    }
}
