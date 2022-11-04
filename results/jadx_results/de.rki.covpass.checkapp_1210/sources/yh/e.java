package yh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.o;
import zh.g1;
/* loaded from: classes3.dex */
public class e extends org.bouncycastle.crypto.f {

    /* renamed from: g */
    a f26299g;

    public e(org.bouncycastle.crypto.e eVar) {
        this(eVar, new d());
    }

    public e(org.bouncycastle.crypto.e eVar, a aVar) {
        this.f18645d = eVar;
        this.f26299g = aVar;
        this.f18642a = new byte[eVar.b()];
        this.f18643b = 0;
    }

    @Override // org.bouncycastle.crypto.f
    public int a(byte[] bArr, int i10) {
        int a10;
        int i11;
        int b10 = this.f18645d.b();
        if (this.f18644c) {
            if (this.f18643b != b10) {
                i11 = 0;
            } else if ((b10 * 2) + i10 > bArr.length) {
                i();
                throw new a0("output buffer too short");
            } else {
                i11 = this.f18645d.a(this.f18642a, 0, bArr, i10);
                this.f18643b = 0;
            }
            this.f26299g.b(this.f18642a, this.f18643b);
            a10 = i11 + this.f18645d.a(this.f18642a, 0, bArr, i10 + i11);
        } else if (this.f18643b != b10) {
            i();
            throw new o("last block incomplete in decryption");
        } else {
            org.bouncycastle.crypto.e eVar = this.f18645d;
            byte[] bArr2 = this.f18642a;
            int a11 = eVar.a(bArr2, 0, bArr2, 0);
            this.f18643b = 0;
            try {
                a10 = a11 - this.f26299g.a(this.f18642a);
                System.arraycopy(this.f18642a, 0, bArr, i10, a10);
            } finally {
                i();
            }
        }
        return a10;
    }

    @Override // org.bouncycastle.crypto.f
    public int c(int i10) {
        int i11 = i10 + this.f18643b;
        byte[] bArr = this.f18642a;
        int length = i11 % bArr.length;
        if (length != 0) {
            i11 -= length;
        } else if (!this.f18644c) {
            return i11;
        }
        return i11 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.f
    public int e(int i10) {
        int i11 = i10 + this.f18643b;
        byte[] bArr = this.f18642a;
        int length = i11 % bArr.length;
        return length == 0 ? Math.max(0, i11 - bArr.length) : i11 - length;
    }

    @Override // org.bouncycastle.crypto.f
    public void f(boolean z10, i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f18644c = z10;
        i();
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f26299g.c(g1Var.b());
            eVar = this.f18645d;
            iVar = g1Var.a();
        } else {
            this.f26299g.c(null);
            eVar = this.f18645d;
        }
        eVar.init(z10, iVar);
    }

    @Override // org.bouncycastle.crypto.f
    public int g(byte b10, byte[] bArr, int i10) {
        int i11 = this.f18643b;
        byte[] bArr2 = this.f18642a;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int a10 = this.f18645d.a(bArr2, 0, bArr, i10);
            this.f18643b = 0;
            i12 = a10;
        }
        byte[] bArr3 = this.f18642a;
        int i13 = this.f18643b;
        this.f18643b = i13 + 1;
        bArr3[i13] = b10;
        return i12;
    }

    @Override // org.bouncycastle.crypto.f
    public int h(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 >= 0) {
            int b10 = b();
            int e10 = e(i11);
            if (e10 > 0 && e10 + i12 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            byte[] bArr3 = this.f18642a;
            int length = bArr3.length;
            int i13 = this.f18643b;
            int i14 = length - i13;
            int i15 = 0;
            if (i11 > i14) {
                System.arraycopy(bArr, i10, bArr3, i13, i14);
                this.f18643b = 0;
                i11 -= i14;
                i10 += i14;
                i15 = this.f18645d.a(this.f18642a, 0, bArr2, i12) + 0;
                while (i11 > this.f18642a.length) {
                    i15 += this.f18645d.a(bArr, i10, bArr2, i12 + i15);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.f18642a, this.f18643b, i11);
            this.f18643b += i11;
            return i15;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
