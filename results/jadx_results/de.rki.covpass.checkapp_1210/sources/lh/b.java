package lh;

import java.math.BigInteger;
import zh.l;
import zh.m;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    private l f16064a;

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        m mVar = (m) iVar;
        a aVar = new a();
        a aVar2 = new a();
        aVar.init(this.f16064a.b());
        BigInteger b10 = aVar.b(mVar.b());
        aVar2.init(this.f16064a.a());
        BigInteger b11 = aVar2.b(mVar.a());
        int b12 = b();
        byte[] bArr = new byte[b12 * 2];
        ak.b.a(b11, bArr, 0, b12);
        ak.b.a(b10, bArr, b12, b12);
        return bArr;
    }

    public int b() {
        return (this.f16064a.b().b().f().bitLength() + 7) / 8;
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        this.f16064a = (l) iVar;
    }
}
