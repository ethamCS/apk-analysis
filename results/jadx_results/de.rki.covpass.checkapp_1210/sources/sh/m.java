package sh;

import java.security.SecureRandom;
import zh.g0;
/* loaded from: classes3.dex */
public class m implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private SecureRandom f21741g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        g0 g0Var = new g0(this.f21741g);
        return new org.bouncycastle.crypto.b(g0Var.b(), g0Var);
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21741g = wVar.a();
    }
}
