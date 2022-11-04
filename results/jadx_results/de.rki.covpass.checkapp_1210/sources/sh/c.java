package sh;
/* loaded from: classes3.dex */
public class c extends b {
    @Override // sh.b, org.bouncycastle.crypto.h
    public byte[] a() {
        int i10 = this.f18650b;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (true) {
            this.f18649a.nextBytes(bArr);
            zh.c.c(bArr);
            i11++;
            if (i11 >= 20 || (!zh.d.g(bArr, 0, i10) && zh.d.f(bArr, 0))) {
                break;
            }
        }
        if (zh.d.g(bArr, 0, i10) || !zh.d.f(bArr, 0)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }

    @Override // sh.b, org.bouncycastle.crypto.h
    public void b(org.bouncycastle.crypto.w wVar) {
        this.f18649a = wVar.a();
        int b10 = (wVar.b() + 7) / 8;
        this.f18650b = b10;
        if (b10 == 0 || b10 == 21) {
            this.f18650b = 24;
        } else if (b10 == 14) {
            this.f18650b = 16;
        } else if (b10 != 24 && b10 != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }
}
