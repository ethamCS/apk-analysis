package e.m0.k;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private int f4335a;

    /* renamed from: b */
    private final int[] f4336b = new int[10];

    public void a() {
        this.f4335a = 0;
        Arrays.fill(this.f4336b, 0);
    }

    public int b(int i) {
        return this.f4336b[i];
    }

    public int c() {
        if ((this.f4335a & 2) != 0) {
            return this.f4336b[1];
        }
        return -1;
    }

    public int d() {
        if ((this.f4335a & 128) != 0) {
            return this.f4336b[7];
        }
        return 65535;
    }

    public int e(int i) {
        return (this.f4335a & 16) != 0 ? this.f4336b[4] : i;
    }

    public int f(int i) {
        return (this.f4335a & 32) != 0 ? this.f4336b[5] : i;
    }

    public boolean g(int i) {
        return ((1 << i) & this.f4335a) != 0;
    }

    public void h(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.g(i)) {
                i(i, mVar.b(i));
            }
        }
    }

    public m i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4336b;
            if (i < iArr.length) {
                this.f4335a = (1 << i) | this.f4335a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public int j() {
        return Integer.bitCount(this.f4335a);
    }
}
