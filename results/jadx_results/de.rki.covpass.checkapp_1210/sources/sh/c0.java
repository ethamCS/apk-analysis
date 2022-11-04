package sh;

import java.security.SecureRandom;
import zh.v1;
/* loaded from: classes3.dex */
public class c0 implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private SecureRandom f21714g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        v1 v1Var = new v1(this.f21714g);
        return new org.bouncycastle.crypto.b(v1Var.b(), v1Var);
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21714g = wVar.a();
    }
}
