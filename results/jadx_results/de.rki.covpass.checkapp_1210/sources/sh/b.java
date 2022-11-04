package sh;
/* loaded from: classes3.dex */
public class b extends org.bouncycastle.crypto.h {
    @Override // org.bouncycastle.crypto.h
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.f18649a.nextBytes(bArr);
            zh.c.c(bArr);
        } while (zh.c.b(bArr, 0));
        return bArr;
    }

    @Override // org.bouncycastle.crypto.h
    public void b(org.bouncycastle.crypto.w wVar) {
        super.b(wVar);
        int i10 = this.f18650b;
        if (i10 == 0 || i10 == 7) {
            this.f18650b = 8;
        } else if (i10 != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
