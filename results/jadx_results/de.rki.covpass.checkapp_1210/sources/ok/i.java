package ok;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a */
    public byte[] f18613a;

    /* renamed from: b */
    public int f18614b;

    public i() {
        this(10);
    }

    public i(int i10) {
        this.f18613a = new byte[i10];
        this.f18614b = 0;
    }

    public void a(byte b10) {
        Arrays.fill(this.f18613a, 0, this.f18614b, b10);
    }

    public void b(int i10, int i11, byte b10) {
        Arrays.fill(this.f18613a, i10, i11, b10);
    }

    public void c(int i10) {
        byte[] bArr = this.f18613a;
        if (bArr.length >= i10) {
            return;
        }
        int i11 = this.f18614b;
        if (i11 == 0) {
            this.f18613a = null;
            this.f18613a = new byte[i10];
            return;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        this.f18613a = bArr2;
    }

    public void d() {
        this.f18614b = 0;
    }

    public void e(int i10, byte b10) {
        d();
        g(i10, b10);
    }

    public void f(int i10) {
        c(i10);
        this.f18614b = i10;
    }

    public void g(int i10, byte b10) {
        int i11 = this.f18614b;
        f(i10);
        if (i11 >= i10) {
            return;
        }
        b(i11, i10, b10);
    }

    public void h(i iVar) {
        f(iVar.f18614b);
        System.arraycopy(iVar.f18613a, 0, this.f18613a, 0, i());
    }

    public int i() {
        return this.f18614b;
    }

    public void j() {
        Arrays.fill(this.f18613a, 0, this.f18614b, (byte) 0);
    }
}
