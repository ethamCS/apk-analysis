package ok;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    public int[] f18609a;

    /* renamed from: b */
    public int f18610b;

    public g() {
        this(10);
    }

    public g(int i10) {
        this.f18609a = new int[i10];
        this.f18610b = 0;
    }

    public void a(int i10) {
        e(i10);
    }

    public void b(g gVar) {
        int i10 = this.f18610b;
        int i11 = gVar.f18610b;
        int i12 = i10 + i11;
        int[] iArr = this.f18609a;
        if (i12 > iArr.length) {
            int[] iArr2 = new int[(i11 + i10) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f18609a = iArr2;
        }
        System.arraycopy(gVar.f18609a, 0, this.f18609a, this.f18610b, gVar.f18610b);
        this.f18610b += gVar.f18610b;
    }

    public void c(int i10) {
        Arrays.fill(this.f18609a, 0, this.f18610b, i10);
    }

    public int d(int i10) {
        if (i10 < 0 || i10 >= this.f18610b) {
            throw new IndexOutOfBoundsException("index = " + i10 + "  size = " + this.f18610b);
        }
        return this.f18609a[i10];
    }

    public void e(int i10) {
        int[] iArr;
        int i11 = this.f18610b;
        if (i11 == this.f18609a.length) {
            try {
                iArr = new int[(i11 * 2) + 5];
            } catch (OutOfMemoryError unused) {
                System.gc();
                iArr = new int[(this.f18610b * 3) / 2];
            }
            System.arraycopy(this.f18609a, 0, iArr, 0, this.f18610b);
            this.f18609a = iArr;
        }
        int[] iArr2 = this.f18609a;
        int i12 = this.f18610b;
        this.f18610b = i12 + 1;
        iArr2[i12] = i10;
    }

    public void f(int i10) {
        while (true) {
            i10++;
            int i11 = this.f18610b;
            if (i10 >= i11) {
                this.f18610b = i11 - 1;
                return;
            } else {
                int[] iArr = this.f18609a;
                iArr[i10 - 1] = iArr[i10];
            }
        }
    }

    public void g(int i10) {
        int[] iArr = this.f18609a;
        if (iArr.length >= i10) {
            return;
        }
        int i11 = this.f18610b;
        if (i11 == 0) {
            this.f18609a = null;
            this.f18609a = new int[i10];
            return;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        this.f18609a = iArr2;
    }

    public void h() {
        this.f18610b = 0;
    }

    public void i(int i10) {
        g(i10);
        this.f18610b = i10;
    }

    public void j(int i10, int i11) {
        this.f18609a[i10] = i11;
    }

    public void k(g gVar) {
        i(gVar.f18610b);
        System.arraycopy(gVar.f18609a, 0, this.f18609a, 0, l());
    }

    public int l() {
        return this.f18610b;
    }
}
