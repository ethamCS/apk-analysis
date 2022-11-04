package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class o extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private r f26973c;

    public o(SecureRandom secureRandom, r rVar) {
        super(secureRandom, rVar.b().bitLength() - 1);
        this.f26973c = rVar;
    }

    public r c() {
        return this.f26973c;
    }
}
