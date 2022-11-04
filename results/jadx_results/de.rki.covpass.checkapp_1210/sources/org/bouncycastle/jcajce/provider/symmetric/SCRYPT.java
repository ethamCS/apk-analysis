package org.bouncycastle.jcajce.provider.symmetric;

import gg.v;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import mi.r;
import org.bouncycastle.crypto.c0;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import sh.a0;
import tg.c;
import zh.b1;
/* loaded from: classes3.dex */
public class SCRYPT {

    /* loaded from: classes3.dex */
    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int scheme;

        public BasePBKDF2(String str, int i10) {
            super(str, c.M);
            this.scheme = i10;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof r) {
                r rVar = (r) keySpec;
                if (rVar.f() == null) {
                    throw new IllegalArgumentException("Salt S must be provided.");
                }
                if (rVar.b() <= 1) {
                    throw new IllegalArgumentException("Cost parameter N must be > 1.");
                }
                if (rVar.c() > 0) {
                    if (rVar.e().length == 0) {
                        throw new IllegalArgumentException("password empty");
                    }
                    return new BCPBEKey(this.algName, new b1(a0.i(c0.f18639d.b(rVar.e()), rVar.f(), rVar.b(), rVar.a(), rVar.d(), rVar.c() / 8)));
                }
                throw new InvalidKeySpecException("positive key length required: " + rVar.c());
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ScryptWithUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory.SCRYPT", sb2.toString());
            v vVar = c.M;
            configurableProvider.addAlgorithm("SecretKeyFactory", vVar, str + "$ScryptWithUTF8");
        }
    }

    /* loaded from: classes3.dex */
    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT", 5);
        }
    }

    private SCRYPT() {
    }
}
