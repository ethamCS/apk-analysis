package sh;

import java.math.BigInteger;
import zh.l0;
import zh.n0;
import zh.o0;
import zh.p0;
/* loaded from: classes3.dex */
public class o implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private l0 f21743g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        e eVar = e.f21716a;
        n0 c10 = this.f21743g.c();
        zh.i iVar = new zh.i(c10.c(), c10.a(), null, c10.b());
        BigInteger a10 = eVar.a(iVar, this.f21743g.a());
        return new org.bouncycastle.crypto.b(new p0(eVar.b(iVar, a10), c10), new o0(a10, c10));
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21743g = (l0) wVar;
    }
}
