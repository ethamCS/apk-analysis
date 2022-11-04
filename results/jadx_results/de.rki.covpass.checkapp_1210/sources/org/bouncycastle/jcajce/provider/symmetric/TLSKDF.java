package org.bouncycastle.jcajce.provider.symmetric;

import ak.a;
import ak.q;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import mi.t;
import nh.a0;
import nh.x;
import org.bouncycastle.crypto.y;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import uh.g;
import zh.b1;
/* loaded from: classes3.dex */
public class TLSKDF {

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$TLS10");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS10KDF", sb2.toString());
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS11KDF", str + "$TLS11");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA256KDF", str + "$TLS12withSHA256");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", str + "$TLS12withSHA384");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", str + "$TLS12withSHA512");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((t) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((t) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static class TLS12 extends TLSKeyMaterialFactory {
        private final y prf;

        protected TLS12(String str, y yVar) {
            super(str);
            this.prf = yVar;
        }

        private byte[] PRF(t tVar, y yVar) {
            byte[] p10 = a.p(q.f(tVar.a()), tVar.d());
            byte[] c10 = tVar.c();
            byte[] bArr = new byte[tVar.b()];
            TLSKDF.hmac_hash(yVar, c10, p10, bArr);
            return bArr;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof t) {
                return new SecretKeySpec(PRF((t) keySpec, this.prf), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new g(new x()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new g(new nh.y()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new g(new a0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        protected TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    public static byte[] PRF_legacy(t tVar) {
        g gVar = new g(ei.a.a());
        g gVar2 = new g(ei.a.b());
        byte[] p10 = a.p(q.f(tVar.a()), tVar.d());
        byte[] c10 = tVar.c();
        int length = (c10.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(c10, 0, bArr, 0, length);
        System.arraycopy(c10, c10.length - length, bArr2, 0, length);
        int b10 = tVar.b();
        byte[] bArr3 = new byte[b10];
        byte[] bArr4 = new byte[b10];
        hmac_hash(gVar, bArr, p10, bArr3);
        hmac_hash(gVar2, bArr2, p10, bArr4);
        for (int i10 = 0; i10 < b10; i10++) {
            bArr3[i10] = (byte) (bArr3[i10] ^ bArr4[i10]);
        }
        return bArr3;
    }

    public static void hmac_hash(y yVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yVar.init(new b1(bArr));
        int macSize = yVar.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = yVar.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[yVar.getMacSize()];
        byte[] bArr6 = bArr2;
        int i10 = 0;
        while (i10 < length) {
            yVar.update(bArr6, 0, bArr6.length);
            yVar.doFinal(bArr4, 0);
            yVar.update(bArr4, 0, macSize2);
            yVar.update(bArr2, 0, bArr2.length);
            yVar.doFinal(bArr5, 0);
            int i11 = macSize * i10;
            System.arraycopy(bArr5, 0, bArr3, i11, Math.min(macSize, bArr3.length - i11));
            i10++;
            bArr6 = bArr4;
        }
    }
}
