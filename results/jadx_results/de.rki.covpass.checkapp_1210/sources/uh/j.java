package uh;

import org.bouncycastle.crypto.a0;
import zh.f1;
/* loaded from: classes3.dex */
class j {

    /* renamed from: a */
    private byte[] f23725a;

    /* renamed from: b */
    private byte[] f23726b;

    /* renamed from: c */
    private byte[] f23727c;

    /* renamed from: d */
    private int f23728d;

    /* renamed from: e */
    private org.bouncycastle.crypto.e f23729e;

    public j(org.bouncycastle.crypto.e eVar, int i10) {
        this.f23729e = eVar;
        this.f23728d = i10 / 8;
        this.f23725a = new byte[eVar.b()];
        this.f23726b = new byte[eVar.b()];
        this.f23727c = new byte[eVar.b()];
    }

    public String a() {
        return this.f23729e.getAlgorithmName() + "/CFB" + (this.f23728d * 8);
    }

    public int b() {
        return this.f23728d;
    }

    public void c(byte[] bArr) {
        this.f23729e.a(this.f23726b, 0, bArr, 0);
    }

    public void d(org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            int length = a10.length;
            byte[] bArr = this.f23725a;
            if (length < bArr.length) {
                System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
            } else {
                System.arraycopy(a10, 0, bArr, 0, bArr.length);
            }
            f();
            eVar = this.f23729e;
            iVar = f1Var.b();
        } else {
            f();
            eVar = this.f23729e;
        }
        eVar.init(true, iVar);
    }

    public int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f23728d;
        if (i10 + i12 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            this.f23729e.a(this.f23726b, 0, this.f23727c, 0);
            int i13 = 0;
            while (true) {
                int i14 = this.f23728d;
                if (i13 >= i14) {
                    byte[] bArr3 = this.f23726b;
                    System.arraycopy(bArr3, i14, bArr3, 0, bArr3.length - i14);
                    byte[] bArr4 = this.f23726b;
                    int length = bArr4.length;
                    int i15 = this.f23728d;
                    System.arraycopy(bArr2, i11, bArr4, length - i15, i15);
                    return this.f23728d;
                }
                bArr2[i11 + i13] = (byte) (this.f23727c[i13] ^ bArr[i10 + i13]);
                i13++;
            }
        } else {
            throw new org.bouncycastle.crypto.o("input buffer too short");
        }
    }

    public void f() {
        byte[] bArr = this.f23725a;
        System.arraycopy(bArr, 0, this.f23726b, 0, bArr.length);
        this.f23729e.reset();
    }
}
