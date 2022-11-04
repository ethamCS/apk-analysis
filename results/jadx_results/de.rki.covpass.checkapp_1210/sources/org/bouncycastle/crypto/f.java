package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    protected byte[] f18642a;

    /* renamed from: b */
    protected int f18643b;

    /* renamed from: c */
    protected boolean f18644c;

    /* renamed from: d */
    protected e f18645d;

    /* renamed from: e */
    protected boolean f18646e;

    /* renamed from: f */
    protected boolean f18647f;

    public f() {
    }

    public f(e eVar) {
        this.f18645d = eVar;
        this.f18642a = new byte[eVar.b()];
        boolean z10 = false;
        this.f18643b = 0;
        String algorithmName = eVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z11 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.f18647f = z11;
        if (z11 || (eVar instanceof h0)) {
            this.f18646e = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z10 = true;
        }
        this.f18646e = z10;
    }

    public int a(byte[] bArr, int i10) {
        try {
            int i11 = this.f18643b;
            if (i10 + i11 > bArr.length) {
                throw new a0("output buffer too short for doFinal()");
            }
            int i12 = 0;
            if (i11 != 0) {
                if (!this.f18646e) {
                    throw new o("data not block size aligned");
                }
                e eVar = this.f18645d;
                byte[] bArr2 = this.f18642a;
                eVar.a(bArr2, 0, bArr2, 0);
                int i13 = this.f18643b;
                this.f18643b = 0;
                System.arraycopy(this.f18642a, 0, bArr, i10, i13);
                i12 = i13;
            }
            return i12;
        } finally {
            i();
        }
    }

    public int b() {
        return this.f18645d.b();
    }

    public int c(int i10) {
        return i10 + this.f18643b;
    }

    public e d() {
        return this.f18645d;
    }

    public int e(int i10) {
        int i11;
        int i12;
        int i13 = i10 + this.f18643b;
        if (!this.f18647f) {
            i12 = this.f18642a.length;
        } else if (this.f18644c) {
            i11 = (i13 % this.f18642a.length) - (this.f18645d.b() + 2);
            return i13 - i11;
        } else {
            i12 = this.f18642a.length;
        }
        i11 = i13 % i12;
        return i13 - i11;
    }

    public void f(boolean z10, i iVar) {
        this.f18644c = z10;
        i();
        this.f18645d.init(z10, iVar);
    }

    public int g(byte b10, byte[] bArr, int i10) {
        byte[] bArr2 = this.f18642a;
        int i11 = this.f18643b;
        int i12 = i11 + 1;
        this.f18643b = i12;
        bArr2[i11] = b10;
        if (i12 == bArr2.length) {
            int a10 = this.f18645d.a(bArr2, 0, bArr, i10);
            this.f18643b = 0;
            return a10;
        }
        return 0;
    }

    public int h(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (i11 >= 0) {
            int b10 = b();
            int e10 = e(i11);
            if (e10 > 0 && e10 + i12 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            byte[] bArr3 = this.f18642a;
            int length = bArr3.length;
            int i14 = this.f18643b;
            int i15 = length - i14;
            if (i11 > i15) {
                System.arraycopy(bArr, i10, bArr3, i14, i15);
                i13 = this.f18645d.a(this.f18642a, 0, bArr2, i12) + 0;
                this.f18643b = 0;
                i11 -= i15;
                i10 += i15;
                while (i11 > this.f18642a.length) {
                    i13 += this.f18645d.a(bArr, i10, bArr2, i12 + i13);
                    i11 -= b10;
                    i10 += b10;
                }
            } else {
                i13 = 0;
            }
            System.arraycopy(bArr, i10, this.f18642a, this.f18643b, i11);
            int i16 = this.f18643b + i11;
            this.f18643b = i16;
            byte[] bArr4 = this.f18642a;
            if (i16 != bArr4.length) {
                return i13;
            }
            int a10 = i13 + this.f18645d.a(bArr4, 0, bArr2, i12 + i13);
            this.f18643b = 0;
            return a10;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public void i() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f18642a;
            if (i10 >= bArr.length) {
                this.f18643b = 0;
                this.f18645d.reset();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }
}
