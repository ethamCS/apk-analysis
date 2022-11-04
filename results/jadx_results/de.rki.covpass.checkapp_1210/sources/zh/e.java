package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class e extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private i f26918c;

    public e(SecureRandom secureRandom, i iVar) {
        super(secureRandom, d(iVar));
        this.f26918c = iVar;
    }

    static int d(i iVar) {
        return iVar.d() != 0 ? iVar.d() : iVar.f().bitLength();
    }

    public i c() {
        return this.f26918c;
    }
}
