package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class g1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private SecureRandom f26930c;

    /* renamed from: d */
    private org.bouncycastle.crypto.i f26931d;

    public g1(org.bouncycastle.crypto.i iVar, SecureRandom secureRandom) {
        this.f26930c = org.bouncycastle.crypto.l.c(secureRandom);
        this.f26931d = iVar;
    }

    public org.bouncycastle.crypto.i a() {
        return this.f26931d;
    }

    public SecureRandom b() {
        return this.f26930c;
    }
}
