package sh;

import java.security.SecureRandom;
import zh.j0;
/* loaded from: classes3.dex */
public class n implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private SecureRandom f21742g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        j0 j0Var = new j0(this.f21742g);
        return new org.bouncycastle.crypto.b(j0Var.b(), j0Var);
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21742g = wVar.a();
    }
}
