package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class a0 extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private y f26904c;

    public a0(y yVar, SecureRandom secureRandom) {
        super(secureRandom, yVar.e().bitLength());
        this.f26904c = yVar;
    }

    public y c() {
        return this.f26904c;
    }
}
