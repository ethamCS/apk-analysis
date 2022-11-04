package org.bouncycastle.jcajce.provider.keystore.bcfks;

import ei.d;
import gg.g;
import gg.p;
import gg.r1;
import gg.v;
import hh.b;
import hh.n;
import hh.z0;
import ig.e;
import ig.h;
import ih.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import ji.a;
import nh.z;
import ni.c;
import org.bouncycastle.crypto.b0;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import sh.a0;
import sh.x;
import tg.f;
import zg.i;
import zg.j;
import zg.k;
import zg.q;
import zg.s;
import zh.b1;
/* loaded from: classes3.dex */
public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final Map<String, v> oidMap;
    private static final Map<v, String> publicAlgMap;
    private Date creationDate;
    private final c helper;
    private b hmacAlgorithm;
    private k hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private b signatureAlgorithm;
    private a.AbstractC0209a validator;
    private PublicKey verificationKey;
    private static final BigInteger CERTIFICATE = BigInteger.valueOf(0);
    private static final BigInteger PRIVATE_KEY = BigInteger.valueOf(1);
    private static final BigInteger SECRET_KEY = BigInteger.valueOf(2);
    private static final BigInteger PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3);
    private static final BigInteger PROTECTED_SECRET_KEY = BigInteger.valueOf(4);
    private final Map<String, e> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private v storeEncryptionAlgorithm = ug.b.T;

    /* loaded from: classes3.dex */
    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new ni.b());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new ni.b(), new BcFKSKeyStoreSpi(new ni.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new ni.b());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new ni.b(), new BcFKSKeyStoreSpi(new ni.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* loaded from: classes3.dex */
    private static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements q, z0 {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(c cVar) {
            super(cVar);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                cVar.a("DEFAULT").nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e10) {
                throw new IllegalArgumentException("can't create random - " + e10.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) {
            return a0.i(cArr != null ? ak.a.p(ak.q.j(cArr), ak.q.i(str)) : ak.a.p(this.seedKey, ak.q.i(str)), this.seedKey, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) {
            try {
                byte[] calculateMac = calculateMac(str, cArr);
                if (!this.cache.containsKey(str) || ak.a.u(this.cache.get(str), calculateMac)) {
                    Key engineGetKey = super.engineGetKey(str, cArr);
                    if (engineGetKey != null && !this.cache.containsKey(str)) {
                        this.cache.put(str, calculateMac);
                    }
                    return engineGetKey;
                }
                throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
            } catch (InvalidKeyException e10) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e10.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    /* loaded from: classes3.dex */
    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new ni.a());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new ni.b(), new BcFKSKeyStoreSpi(new ni.a()));
        }
    }

    /* loaded from: classes3.dex */
    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new ni.a());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new ni.a(), new BcFKSKeyStoreSpi(new ni.a()));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        v vVar = yg.b.f26293h;
        hashMap.put("DESEDE", vVar);
        hashMap.put("TRIPLEDES", vVar);
        hashMap.put("TDEA", vVar);
        hashMap.put("HMACSHA1", q.I1);
        hashMap.put("HMACSHA224", q.J1);
        hashMap.put("HMACSHA256", q.K1);
        hashMap.put("HMACSHA384", q.L1);
        hashMap.put("HMACSHA512", q.M1);
        hashMap.put("SEED", sg.a.f21704a);
        hashMap.put("CAMELLIA.128", wg.a.f25079a);
        hashMap.put("CAMELLIA.192", wg.a.f25080b);
        hashMap.put("CAMELLIA.256", wg.a.f25081c);
        hashMap.put("ARIA.128", vg.a.f24131h);
        hashMap.put("ARIA.192", vg.a.f24136m);
        hashMap.put("ARIA.256", vg.a.f24141r);
        hashMap2.put(q.Z0, "RSA");
        hashMap2.put(o.Q, "EC");
        hashMap2.put(yg.b.f26297l, "DH");
        hashMap2.put(q.f26836q1, "DH");
        hashMap2.put(o.A0, "DSA");
    }

    BcFKSKeyStoreSpi(c cVar) {
        this.helper = cVar;
    }

    private byte[] calculateMac(byte[] bArr, b bVar, k kVar, char[] cArr) {
        String H = bVar.l().H();
        Mac b10 = this.helper.b(H);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            b10.init(new SecretKeySpec(generateKey(kVar, "INTEGRITY_CHECK", cArr, -1), H));
            return b10.doFinal(bArr);
        } catch (InvalidKeyException e10) {
            throw new IOException("Cannot set up MAC calculation: " + e10.getMessage());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) {
        Cipher e10 = this.helper.e(str);
        e10.init(1, new SecretKeySpec(bArr, "AES"));
        return e10;
    }

    private ig.c createPrivateKeySequence(i iVar, Certificate[] certificateArr) {
        n[] nVarArr = new n[certificateArr.length];
        for (int i10 = 0; i10 != certificateArr.length; i10++) {
            nVarArr[i10] = n.n(certificateArr[i10].getEncoded());
        }
        return new ig.c(iVar, nVarArr);
    }

    private Certificate decodeCertificate(Object obj) {
        c cVar = this.helper;
        if (cVar != null) {
            try {
                return cVar.d("X.509").generateCertificate(new ByteArrayInputStream(n.n(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(n.n(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, b bVar, char[] cArr, byte[] bArr) {
        AlgorithmParameters algorithmParameters;
        Cipher cipher;
        if (bVar.l().s(q.f26860y1)) {
            zg.n m10 = zg.n.m(bVar.o());
            j l10 = m10.l();
            try {
                if (l10.l().s(ug.b.T)) {
                    cipher = this.helper.e("AES/CCM/NoPadding");
                    algorithmParameters = this.helper.f("CCM");
                    algorithmParameters.init(gi.a.m(l10.n()).getEncoded());
                } else if (!l10.l().s(ug.b.U)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                } else {
                    cipher = this.helper.e("AESKWP");
                    algorithmParameters = null;
                }
                k n10 = m10.n();
                if (cArr == null) {
                    cArr = new char[0];
                }
                cipher.init(2, new SecretKeySpec(generateKey(n10, str, cArr, 32), "AES"), algorithmParameters);
                return cipher.doFinal(bArr);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new IOException(e11.toString());
            }
        }
        throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
    }

    private Date extractCreationDate(e eVar, Date date) {
        try {
            return eVar.l().G();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(k kVar, String str, char[] cArr, int i10) {
        byte[] PKCS12PasswordToBytes = b0.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = b0.PKCS12PasswordToBytes(str.toCharArray());
        if (tg.c.M.s(kVar.l())) {
            f n10 = f.n(kVar.n());
            if (n10.o() != null) {
                i10 = n10.o().intValue();
            } else if (i10 == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return a0.i(ak.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), n10.r(), n10.m().intValue(), n10.l().intValue(), n10.l().intValue(), i10);
        } else if (!kVar.l().s(q.f26863z1)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        } else {
            zg.o l10 = zg.o.l(kVar.n());
            if (l10.n() != null) {
                i10 = l10.n().intValue();
            } else if (i10 == -1) {
                throw new IOException("no keyLength found in PBKDF2Params");
            }
            if (l10.o().l().s(q.M1)) {
                x xVar = new x(new nh.a0());
                xVar.init(ak.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), l10.q(), l10.m().intValue());
                return ((b1) xVar.generateDerivedParameters(i10 * 8)).a();
            } else if (l10.o().l().s(ug.b.f23661r)) {
                x xVar2 = new x(new z(512));
                xVar2.init(ak.a.p(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), l10.q(), l10.m().intValue());
                return ((b1) xVar2.generateDerivedParameters(i10 * 8)).a();
            } else {
                throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + l10.o().l());
            }
        }
    }

    private k generatePkbdAlgorithmIdentifier(ei.e eVar, int i10) {
        v vVar = tg.c.M;
        if (vVar.s(eVar.a())) {
            ei.j jVar = (ei.j) eVar;
            byte[] bArr = new byte[jVar.e()];
            getDefaultSecureRandom().nextBytes(bArr);
            return new k(vVar, new f(bArr, jVar.c(), jVar.b(), jVar.d(), i10));
        }
        d dVar = (d) eVar;
        byte[] bArr2 = new byte[dVar.d()];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new k(q.f26863z1, new zg.o(bArr2, dVar.b(), i10, dVar.c()));
    }

    private k generatePkbdAlgorithmIdentifier(v vVar, int i10) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        v vVar2 = q.f26863z1;
        if (vVar2.s(vVar)) {
            return new k(vVar2, new zg.o(bArr, 51200, i10, new b(q.M1, r1.f10880d)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + vVar);
    }

    private k generatePkbdAlgorithmIdentifier(k kVar, int i10) {
        v vVar = tg.c.M;
        boolean s10 = vVar.s(kVar.l());
        g n10 = kVar.n();
        if (s10) {
            f n11 = f.n(n10);
            byte[] bArr = new byte[n11.r().length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new k(vVar, new f(bArr, n11.m(), n11.l(), n11.q(), BigInteger.valueOf(i10)));
        }
        zg.o l10 = zg.o.l(n10);
        byte[] bArr2 = new byte[l10.q().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new k(q.f26863z1, new zg.o(bArr2, l10.m().intValue(), i10, l10.o()));
    }

    private b generateSignatureAlgId(Key key, a.d dVar) {
        if (key == null) {
            return null;
        }
        if (key instanceof qi.a) {
            if (dVar == a.d.SHA512withECDSA) {
                return new b(o.V);
            }
            if (dVar == a.d.SHA3_512withECDSA) {
                return new b(ug.b.f23648i0);
            }
        }
        if (key instanceof DSAKey) {
            if (dVar == a.d.SHA512withDSA) {
                return new b(ug.b.f23632a0);
            }
            if (dVar == a.d.SHA3_512withDSA) {
                return new b(ug.b.f23640e0);
            }
        }
        if (key instanceof RSAKey) {
            if (dVar == a.d.SHA512withRSA) {
                return new b(q.f26821l1, r1.f10880d);
            }
            if (dVar == a.d.SHA3_512withRSA) {
                return new b(ug.b.f23656m0, r1.f10880d);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        return l.b();
    }

    private ig.b getEncryptedObjectStoreData(b bVar, char[] cArr) {
        e[] eVarArr = (e[]) this.entries.values().toArray(new e[this.entries.size()]);
        k generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        h hVar = new h(bVar, this.creationDate, this.lastModifiedDate, new ig.f(eVarArr), null);
        try {
            v vVar = this.storeEncryptionAlgorithm;
            v vVar2 = ug.b.T;
            if (!vVar.s(vVar2)) {
                return new ig.b(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier, new j(ug.b.U))), createCipher("AESKWP", generateKey).doFinal(hVar.getEncoded()));
            }
            Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
            return new ig.b(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier, new j(vVar2, gi.a.m(createCipher.getParameters().getEncoded())))), createCipher.doFinal(hVar.getEncoded()));
        } catch (InvalidKeyException e10) {
            throw new IOException(e10.toString());
        } catch (NoSuchProviderException e11) {
            throw new IOException(e11.toString());
        } catch (BadPaddingException e12) {
            throw new IOException(e12.toString());
        } catch (IllegalBlockSizeException e13) {
            throw new IOException(e13.toString());
        } catch (NoSuchPaddingException e14) {
            throw new NoSuchAlgorithmException(e14.toString());
        }
    }

    private static String getPublicKeyAlg(v vVar) {
        String str = publicAlgMap.get(vVar);
        return str != null ? str : vVar.H();
    }

    private boolean isSimilarHmacPbkd(ei.e eVar, k kVar) {
        if (!eVar.a().s(kVar.l())) {
            return false;
        }
        if (tg.c.M.s(kVar.l())) {
            if (!(eVar instanceof ei.j)) {
                return false;
            }
            ei.j jVar = (ei.j) eVar;
            f n10 = f.n(kVar.n());
            return jVar.e() == n10.r().length && jVar.b() == n10.l().intValue() && jVar.c() == n10.m().intValue() && jVar.d() == n10.q().intValue();
        } else if (!(eVar instanceof d)) {
            return false;
        } else {
            d dVar = (d) eVar;
            zg.o l10 = zg.o.l(kVar.n());
            return dVar.d() == l10.q().length && dVar.b() == l10.m().intValue();
        }
    }

    private void verifyMac(byte[] bArr, ig.j jVar, char[] cArr) {
        if (ak.a.u(calculateMac(bArr, jVar.n(), jVar.o(), cArr), jVar.m())) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
    }

    private void verifySig(g gVar, ig.l lVar, PublicKey publicKey) {
        Signature createSignature = this.helper.createSignature(lVar.o().l().H());
        createSignature.initVerify(publicKey);
        createSignature.update(gVar.b().k("DER"));
        if (createSignature.verify(lVar.n().G())) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        Objects.requireNonNull(str, "alias value is null");
        return this.entries.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (eVar.r().equals(PRIVATE_KEY) || eVar.r().equals(PROTECTED_PRIVATE_KEY)) {
                return decodeCertificate(ig.c.n(eVar.m()).l()[0]);
            }
            if (!eVar.r().equals(CERTIFICATE)) {
                return null;
            }
            return decodeCertificate(eVar.m());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                e eVar = this.entries.get(str);
                if (eVar.r().equals(CERTIFICATE)) {
                    if (ak.a.c(eVar.m(), encoded)) {
                        return str;
                    }
                } else if (eVar.r().equals(PRIVATE_KEY) || eVar.r().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (ak.a.c(ig.c.n(eVar.m()).l()[0].b().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (!eVar.r().equals(PRIVATE_KEY) && !eVar.r().equals(PROTECTED_PRIVATE_KEY)) {
                return null;
            }
            n[] l10 = ig.c.n(eVar.m()).l();
            int length = l10.length;
            X509Certificate[] x509CertificateArr = new X509Certificate[length];
            for (int i10 = 0; i10 != length; i10++) {
                x509CertificateArr[i10] = decodeCertificate(l10[i10]);
            }
            return x509CertificateArr;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            try {
                return eVar.q().G();
            } catch (ParseException unused) {
                return new Date();
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            if (eVar.r().equals(PRIVATE_KEY) || eVar.r().equals(PROTECTED_PRIVATE_KEY)) {
                PrivateKey privateKey = this.privateKeyCache.get(str);
                if (privateKey != null) {
                    return privateKey;
                }
                i n10 = i.n(ig.c.n(eVar.m()).m());
                try {
                    s m10 = s.m(decryptData("PRIVATE_KEY_ENCRYPTION", n10.m(), cArr, n10.l()));
                    PrivateKey generatePrivate = this.helper.h(getPublicKeyAlg(m10.o().l())).generatePrivate(new PKCS8EncodedKeySpec(m10.getEncoded()));
                    this.privateKeyCache.put(str, generatePrivate);
                    return generatePrivate;
                } catch (Exception e10) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e10.getMessage());
                }
            } else if (!eVar.r().equals(SECRET_KEY) && !eVar.r().equals(PROTECTED_SECRET_KEY)) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
            } else {
                ig.d m11 = ig.d.m(eVar.m());
                try {
                    ig.k l10 = ig.k.l(decryptData("SECRET_KEY_ENCRYPTION", m11.n(), cArr, m11.l()));
                    return this.helper.g(l10.m().H()).generateSecret(new SecretKeySpec(l10.n(), l10.m().H()));
                } catch (Exception e11) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e11.getMessage());
                }
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            return eVar.r().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        e eVar = this.entries.get(str);
        if (eVar != null) {
            BigInteger r10 = eVar.r();
            return r10.equals(PRIVATE_KEY) || r10.equals(SECRET_KEY) || r10.equals(PROTECTED_PRIVATE_KEY) || r10.equals(PROTECTED_SECRET_KEY);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        b bVar;
        h hVar;
        g n10;
        PublicKey publicKey;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new b(q.M1, r1.f10880d);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(q.f26863z1, 64);
            return;
        }
        try {
            ig.g l10 = ig.g.l(new p(inputStream).s());
            ig.i m10 = l10.m();
            if (m10.n() == 0) {
                ig.j l11 = ig.j.l(m10.m());
                this.hmacAlgorithm = l11.n();
                this.hmacPkbdAlgorithm = l11.o();
                bVar = this.hmacAlgorithm;
                try {
                    verifyMac(l10.n().b().getEncoded(), l11, cArr);
                } catch (NoSuchProviderException e10) {
                    throw new IOException(e10.getMessage());
                }
            } else if (m10.n() != 1) {
                throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
            } else {
                ig.l m11 = ig.l.m(m10.m());
                bVar = m11.o();
                try {
                    n[] l12 = m11.l();
                    if (this.validator == null) {
                        n10 = l10.n();
                        publicKey = this.verificationKey;
                    } else if (l12 == null) {
                        throw new IOException("validator specified but no certifcates in store");
                    } else {
                        CertificateFactory d10 = this.helper.d("X.509");
                        int length = l12.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i10 = 0; i10 != length; i10++) {
                            x509CertificateArr[i10] = (X509Certificate) d10.generateCertificate(new ByteArrayInputStream(l12[i10].getEncoded()));
                        }
                        if (!this.validator.a(x509CertificateArr)) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        n10 = l10.n();
                        publicKey = x509CertificateArr[0].getPublicKey();
                    }
                    verifySig(n10, m11, publicKey);
                } catch (GeneralSecurityException e11) {
                    throw new IOException("error verifying signature: " + e11.getMessage(), e11);
                }
            }
            g n11 = l10.n();
            if (n11 instanceof ig.b) {
                ig.b bVar2 = (ig.b) n11;
                hVar = h.m(decryptData("STORE_ENCRYPTION", bVar2.m(), cArr, bVar2.l().F()));
            } else {
                hVar = h.m(n11);
            }
            try {
                this.creationDate = hVar.l().G();
                this.lastModifiedDate = hVar.o().G();
                if (!hVar.n().equals(bVar)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<g> it = hVar.q().iterator();
                while (it.hasNext()) {
                    e o10 = e.o(it.next());
                    this.entries.put(o10.n(), o10);
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e12) {
            throw new IOException(e12.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (!(loadStoreParameter instanceof a)) {
            if (loadStoreParameter instanceof ji.c) {
                engineLoad(((ji.c) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        } else {
            a aVar = (a) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(aVar);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
            this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? ug.b.T : ug.b.U;
            this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(q.M1, r1.f10880d) : new b(ug.b.f23661r, r1.f10880d);
            this.verificationKey = (PublicKey) aVar.i();
            this.validator = aVar.c();
            this.signatureAlgorithm = generateSignatureAlgId(this.verificationKey, aVar.h());
            v vVar = this.storeEncryptionAlgorithm;
            InputStream a10 = aVar.a();
            engineLoad(a10, extractPassword);
            if (a10 == null) {
                return;
            }
            if (isSimilarHmacPbkd(aVar.g(), this.hmacPkbdAlgorithm) && vVar.s(this.storeEncryptionAlgorithm)) {
                return;
            }
            throw new IOException("configuration parameters do not match existing store");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        Date date;
        e eVar = this.entries.get(str);
        Date date2 = new Date();
        if (eVar == null) {
            date = date2;
        } else if (!eVar.r().equals(CERTIFICATE)) {
            throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
        } else {
            date = extractCreationDate(eVar, date2);
        }
        try {
            this.entries.put(str, new e(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e10) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e10.getMessage(), e10);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        ig.k kVar;
        ig.d dVar;
        i iVar;
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                k generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(q.f26863z1, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                v vVar = this.storeEncryptionAlgorithm;
                v vVar2 = ug.b.T;
                if (vVar.s(vVar2)) {
                    Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                    iVar = new i(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier, new j(vVar2, gi.a.m(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                } else {
                    iVar = new i(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier, new j(ug.b.U))), createCipher("AESKWP", generateKey).doFinal(encoded));
                }
                this.entries.put(str, new e(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(iVar, certificateArr).getEncoded(), null));
            } catch (Exception e10) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e10.toString(), e10);
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else {
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                k generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(q.f26863z1, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String k10 = ak.q.k(key.getAlgorithm());
                if (k10.indexOf("AES") > -1) {
                    kVar = new ig.k(ug.b.f23666w, encoded2);
                } else {
                    Map<String, v> map = oidMap;
                    v vVar3 = map.get(k10);
                    if (vVar3 != null) {
                        kVar = new ig.k(vVar3, encoded2);
                    } else {
                        v vVar4 = map.get(k10 + "." + (encoded2.length * 8));
                        if (vVar4 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + k10 + ") for storage.");
                        }
                        kVar = new ig.k(vVar4, encoded2);
                    }
                }
                v vVar5 = this.storeEncryptionAlgorithm;
                v vVar6 = ug.b.T;
                if (vVar5.s(vVar6)) {
                    Cipher createCipher2 = createCipher("AES/CCM/NoPadding", generateKey2);
                    dVar = new ig.d(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier2, new j(vVar6, gi.a.m(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(kVar.getEncoded()));
                } else {
                    dVar = new ig.d(new b(q.f26860y1, new zg.n(generatePkbdAlgorithmIdentifier2, new j(ug.b.U))), createCipher("AESKWP", generateKey2).doFinal(kVar.getEncoded()));
                }
                this.entries.put(str, new e(SECRET_KEY, str, extractCreationDate, date, dVar.getEncoded(), null));
            } catch (Exception e11) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e11.toString(), e11);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        Date date = new Date();
        e eVar = this.entries.get(str);
        Date extractCreationDate = eVar != null ? extractCreationDate(eVar, date) : date;
        if (certificateArr != null) {
            try {
                i n10 = i.n(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new e(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(n10, certificateArr).getEncoded(), null));
                } catch (Exception e10) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e10.toString(), e10);
                }
            } catch (Exception e11) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e11);
            }
        } else {
            try {
                this.entries.put(str, new e(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, null));
            } catch (Exception e12) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e12.toString(), e12);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        k kVar;
        BigInteger bigInteger;
        if (this.creationDate != null) {
            ig.b encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
            if (tg.c.M.s(this.hmacPkbdAlgorithm.l())) {
                f n10 = f.n(this.hmacPkbdAlgorithm.n());
                kVar = this.hmacPkbdAlgorithm;
                bigInteger = n10.o();
            } else {
                zg.o l10 = zg.o.l(this.hmacPkbdAlgorithm.n());
                kVar = this.hmacPkbdAlgorithm;
                bigInteger = l10.n();
            }
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(kVar, bigInteger.intValue());
            try {
                outputStream.write(new ig.g(encryptedObjectStoreData, new ig.i(new ig.j(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
                outputStream.flush();
                return;
            } catch (NoSuchProviderException e10) {
                throw new IOException("cannot calculate mac: " + e10.getMessage());
            }
        }
        throw new IOException("KeyStore not initialized");
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        ig.l lVar;
        if (loadStoreParameter != null) {
            if (loadStoreParameter instanceof ji.b) {
                ji.b bVar = (ji.b) loadStoreParameter;
                char[] extractPassword = ParameterUtil.extractPassword(loadStoreParameter);
                this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bVar.b(), 64);
                engineStore(bVar.a(), extractPassword);
                return;
            } else if (!(loadStoreParameter instanceof a)) {
                if (loadStoreParameter instanceof ji.c) {
                    engineStore(((ji.c) loadStoreParameter).b(), ParameterUtil.extractPassword(loadStoreParameter));
                    return;
                }
                throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
            } else {
                a aVar = (a) loadStoreParameter;
                if (aVar.i() == null) {
                    char[] extractPassword2 = ParameterUtil.extractPassword(aVar);
                    this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
                    this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? ug.b.T : ug.b.U;
                    this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(q.M1, r1.f10880d) : new b(ug.b.f23661r, r1.f10880d);
                    engineStore(aVar.b(), extractPassword2);
                    return;
                }
                this.signatureAlgorithm = generateSignatureAlgId(aVar.i(), aVar.h());
                this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(aVar.g(), 64);
                this.storeEncryptionAlgorithm = aVar.e() == a.b.AES256_CCM ? ug.b.T : ug.b.U;
                this.hmacAlgorithm = aVar.f() == a.c.HmacSHA512 ? new b(q.M1, r1.f10880d) : new b(ug.b.f23661r, r1.f10880d);
                ig.b encryptedObjectStoreData = getEncryptedObjectStoreData(this.signatureAlgorithm, ParameterUtil.extractPassword(aVar));
                try {
                    Signature createSignature = this.helper.createSignature(this.signatureAlgorithm.l().H());
                    createSignature.initSign((PrivateKey) aVar.i());
                    createSignature.update(encryptedObjectStoreData.getEncoded());
                    X509Certificate[] d10 = aVar.d();
                    if (d10 != null) {
                        int length = d10.length;
                        n[] nVarArr = new n[length];
                        for (int i10 = 0; i10 != length; i10++) {
                            nVarArr[i10] = n.n(d10[i10].getEncoded());
                        }
                        lVar = new ig.l(this.signatureAlgorithm, nVarArr, createSignature.sign());
                    } else {
                        lVar = new ig.l(this.signatureAlgorithm, createSignature.sign());
                    }
                    aVar.b().write(new ig.g(encryptedObjectStoreData, new ig.i(lVar)).getEncoded());
                    aVar.b().flush();
                    return;
                } catch (GeneralSecurityException e10) {
                    throw new IOException("error creating signature: " + e10.getMessage(), e10);
                }
            }
        }
        throw new IllegalArgumentException("'parameter' arg cannot be null");
    }
}
