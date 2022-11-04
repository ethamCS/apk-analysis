package org.bouncycastle.jcajce.provider.asymmetric;

import gg.d0;
import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import ji.d;
import ji.e;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import tg.c;
import zg.s;
/* loaded from: classes3.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    /* loaded from: classes3.dex */
    private static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(s sVar) {
            d0 F = d0.F(sVar.n().F());
            PrivateKey[] privateKeyArr = new PrivateKey[F.size()];
            for (int i10 = 0; i10 != F.size(); i10++) {
                s m10 = s.m(F.G(i10));
                privateKeyArr[i10] = this.provider.getKeyInfoConverter(m10.o().l()).generatePrivate(m10);
            }
            return new d(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(n0 n0Var) {
            d0 F = d0.F(n0Var.o().D());
            PublicKey[] publicKeyArr = new PublicKey[F.size()];
            for (int i10 = 0; i10 != F.size(); i10++) {
                n0 n10 = n0.n(F.G(i10));
                publicKeyArr[i10] = this.provider.getKeyInfoConverter(n10.l().l()).generatePublic(n10);
            }
            return new e(publicKeyArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        protected Key engineTranslateKey(Key key) {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(s.m(key.getEncoded()));
                }
                if (!(key instanceof PublicKey)) {
                    throw new InvalidKeyException("key not recognized");
                }
                return generatePublic(n0.n(key.getEncoded()));
            } catch (IOException e10) {
                throw new InvalidKeyException("key could not be parsed: " + e10.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(s sVar) {
            return COMPOSITE.baseConverter.generatePrivate(sVar);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(n0 n0Var) {
            return COMPOSITE.baseConverter.generatePublic(n0Var);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("KeyFactory.");
            v vVar = c.N;
            sb2.append(vVar);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            configurableProvider.addAlgorithm("KeyFactory.OID." + vVar, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(vVar, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
