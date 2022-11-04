package f;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class r extends f {

    /* renamed from: g */
    final transient byte[][] f4479g;

    /* renamed from: h */
    final transient int[] f4480h;

    public r(c cVar, int i) {
        super(null);
        v.b(cVar.f4436c, 0L, i);
        p pVar = cVar.f4435b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = pVar.f4472c;
            int i6 = pVar.f4471b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            pVar = pVar.f4475f;
        }
        this.f4479g = new byte[i4];
        this.f4480h = new int[i4 * 2];
        p pVar2 = cVar.f4435b;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f4479g;
            bArr[i7] = pVar2.f4470a;
            int i8 = pVar2.f4472c;
            int i9 = pVar2.f4471b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f4480h;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            pVar2.f4473d = true;
            i7++;
            pVar2 = pVar2.f4475f;
        }
    }

    private int y(int i) {
        int binarySearch = Arrays.binarySearch(this.f4480h, 0, this.f4479g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f z() {
        return new f(v());
    }

    @Override // f.f
    public String a() {
        return z().a();
    }

    @Override // f.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.r() == r() && n(0, fVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override // f.f
    public int hashCode() {
        int i = this.f4442c;
        if (i != 0) {
            return i;
        }
        int length = this.f4479g.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f4479g[i2];
            int[] iArr = this.f4480h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f4442c = i4;
        return i4;
    }

    @Override // f.f
    public byte k(int i) {
        v.b(this.f4480h[this.f4479g.length - 1], i, 1L);
        int y = y(i);
        int i2 = y == 0 ? 0 : this.f4480h[y - 1];
        int[] iArr = this.f4480h;
        byte[][] bArr = this.f4479g;
        return bArr[y][(i - i2) + iArr[bArr.length + y]];
    }

    @Override // f.f
    public String l() {
        return z().l();
    }

    @Override // f.f
    public boolean n(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > r() - i3) {
            return false;
        }
        int y = y(i);
        while (i3 > 0) {
            int i4 = y == 0 ? 0 : this.f4480h[y - 1];
            int min = Math.min(i3, ((this.f4480h[y] - i4) + i4) - i);
            int[] iArr = this.f4480h;
            byte[][] bArr = this.f4479g;
            if (!fVar.o(i2, bArr[y], (i - i4) + iArr[bArr.length + y], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            y++;
        }
        return true;
    }

    @Override // f.f
    public boolean o(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > r() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int y = y(i);
        while (i3 > 0) {
            int i4 = y == 0 ? 0 : this.f4480h[y - 1];
            int min = Math.min(i3, ((this.f4480h[y] - i4) + i4) - i);
            int[] iArr = this.f4480h;
            byte[][] bArr2 = this.f4479g;
            if (!v.a(bArr2[y], (i - i4) + iArr[bArr2.length + y], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            y++;
        }
        return true;
    }

    @Override // f.f
    public f p() {
        return z().p();
    }

    @Override // f.f
    public f q() {
        return z().q();
    }

    @Override // f.f
    public int r() {
        return this.f4480h[this.f4479g.length - 1];
    }

    @Override // f.f
    public f t(int i, int i2) {
        return z().t(i, i2);
    }

    @Override // f.f
    public String toString() {
        return z().toString();
    }

    @Override // f.f
    public f u() {
        return z().u();
    }

    @Override // f.f
    public byte[] v() {
        int[] iArr = this.f4480h;
        byte[][] bArr = this.f4479g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f4480h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f4479g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // f.f
    public String w() {
        return z().w();
    }

    @Override // f.f
    public void x(c cVar) {
        int length = this.f4479g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f4480h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            p pVar = new p(this.f4479g[i], i3, (i3 + i4) - i2, true, false);
            p pVar2 = cVar.f4435b;
            if (pVar2 == null) {
                pVar.f4476g = pVar;
                pVar.f4475f = pVar;
                cVar.f4435b = pVar;
            } else {
                pVar2.f4476g.c(pVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f4436c += i2;
    }
}
