package sh;

import java.security.SecureRandom;
import zh.s1;
/* loaded from: classes3.dex */
public class b0 implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private SecureRandom f21713g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        s1 s1Var = new s1(this.f21713g);
        return new org.bouncycastle.crypto.b(s1Var.b(), s1Var);
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21713g = wVar.a();
    }
}
