package lh;

import java.math.BigInteger;
import zh.w;
import zh.x;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    private w f16067a;

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        x xVar = (x) iVar;
        d dVar = new d();
        d dVar2 = new d();
        dVar.init(this.f16067a.b());
        BigInteger b10 = dVar.b(xVar.b());
        dVar2.init(this.f16067a.a());
        BigInteger b11 = dVar2.b(xVar.a());
        int b12 = b();
        byte[] bArr = new byte[b12 * 2];
        ak.b.a(b11, bArr, 0, b12);
        ak.b.a(b10, bArr, b12, b12);
        return bArr;
    }

    public int b() {
        return (this.f16067a.b().b().a().t() + 7) / 8;
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        this.f16067a = (w) iVar;
    }
}
