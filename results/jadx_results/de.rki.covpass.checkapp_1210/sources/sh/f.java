package sh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class f implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private zh.e f21719g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        e eVar = e.f21716a;
        zh.i c10 = this.f21719g.c();
        BigInteger a10 = eVar.a(c10, this.f21719g.a());
        return new org.bouncycastle.crypto.b(new zh.k(eVar.b(c10, a10), c10), new zh.j(a10, c10));
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21719g = (zh.e) wVar;
    }
}
