package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import ak.g;
import ak.m;
import gg.a1;
import gg.h;
import gg.j1;
import gg.r1;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
import gg.y0;
import gg.y1;
import hh.b;
import hh.m0;
import hh.n0;
import hh.u;
import hh.z0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import ji.i;
import ji.k;
import ni.a;
import ni.c;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import zg.f;
import zg.n;
import zg.o;
import zg.p;
import zg.q;
import zg.r;
import zg.y;
/* loaded from: classes3.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements q, z0 {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private v certAlgorithm;
    private CertificateFactory certFact;
    private v keyAlgorithm;
    private final c helper = new a();
    private IgnoresCaseHashtable keys = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable localIds = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable certs = new IgnoresCaseHashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = l.b();
    private b macAlgorithm = new b(yg.b.f26294i, r1.f10880d);
    private int itCount = 102400;
    private int saltLength = 20;

    /* loaded from: classes3.dex */
    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new a(), new PKCS12KeyStoreSpi(new a(), q.L3, q.O3));
        }
    }

    /* loaded from: classes3.dex */
    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BCPKCS12KeyStore3DES() {
            /*
                r4 = this;
                ni.a r0 = new ni.a
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                ni.a r2 = new ni.a
                r2.<init>()
                gg.v r3 = zg.q.L3
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.BCPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* loaded from: classes3.dex */
    public class CertId {

        /* renamed from: id */
        byte[] f18689id;

        CertId(PublicKey publicKey) {
            PKCS12KeyStoreSpi.this = r1;
            this.f18689id = r1.createSubjectKeyId(publicKey).l();
        }

        CertId(byte[] bArr) {
            PKCS12KeyStoreSpi.this = r1;
            this.f18689id = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return ak.a.c(this.f18689id, ((CertId) obj).f18689id);
            }
            return false;
        }

        public int hashCode() {
            return ak.a.F(this.f18689id);
        }
    }

    /* loaded from: classes3.dex */
    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new ni.b(), new PKCS12KeyStoreSpi(new ni.b(), q.L3, q.O3));
        }
    }

    /* loaded from: classes3.dex */
    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DefPKCS12KeyStore3DES() {
            /*
                r4 = this;
                ni.b r0 = new ni.b
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                ni.b r2 = new ni.b
                r2.<init>()
                gg.v r3 = zg.q.L3
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* loaded from: classes3.dex */
    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new v("1.2.840.113533.7.66.10"), g.e(128));
            hashMap.put(q.B1, g.e(192));
            hashMap.put(ug.b.f23668y, g.e(128));
            hashMap.put(ug.b.G, g.e(192));
            hashMap.put(ug.b.O, g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            hashMap.put(wg.a.f25079a, g.e(128));
            hashMap.put(wg.a.f25080b, g.e(192));
            hashMap.put(wg.a.f25081c, g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            hashMap.put(lg.a.f16022f, g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(b bVar) {
            Integer num = (Integer) this.KEY_SIZES.get(bVar.l());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    /* loaded from: classes3.dex */
    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : ak.q.g(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String g10 = str == null ? null : ak.q.g(str);
            String str2 = (String) this.keys.get(g10);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(g10, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : ak.q.g(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(c cVar, v vVar, v vVar2) {
        this.keyAlgorithm = vVar;
        this.certAlgorithm = vVar2;
        try {
            this.certFact = cVar.d("X.509");
        } catch (Exception e10) {
            throw new IllegalArgumentException("can't create cert factory - " + e10.toString());
        }
    }

    private byte[] calculatePbeMac(v vVar, byte[] bArr, int i10, char[] cArr, boolean z10, byte[] bArr2) {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i10);
        Mac b10 = this.helper.b(vVar.H());
        b10.init(new i(cArr, z10), pBEParameterSpec);
        b10.update(bArr2);
        return b10.doFinal();
    }

    private Cipher createCipher(int i10, char[] cArr, b bVar) {
        AlgorithmParameterSpec algorithmParameterSpec;
        n m10 = n.m(bVar.o());
        o l10 = o.l(m10.n().n());
        b n10 = b.n(m10.l());
        SecretKeyFactory g10 = this.helper.g(m10.n().l().H());
        SecretKey generateSecret = l10.r() ? g10.generateSecret(new PBEKeySpec(cArr, l10.q(), validateIterationCount(l10.m()), keySizeProvider.getKeySize(n10))) : g10.generateSecret(new mi.o(cArr, l10.q(), validateIterationCount(l10.m()), keySizeProvider.getKeySize(n10), l10.o()));
        Cipher e10 = this.helper.e(m10.l().l().H());
        gg.g n11 = m10.l().n();
        if (n11 instanceof w) {
            algorithmParameterSpec = new IvParameterSpec(w.E(n11).F());
        } else {
            lg.c n12 = lg.c.n(n11);
            algorithmParameterSpec = new mi.i(n12.l(), n12.m());
        }
        e10.init(i10, generateSecret, algorithmParameterSpec);
        return e10;
    }

    private y createSafeBag(String str, Certificate certificate) {
        zg.c cVar = new zg.c(q.f26834p2, new t1(certificate.getEncoded()));
        h hVar = new h();
        boolean z10 = false;
        if (certificate instanceof qi.n) {
            qi.n nVar = (qi.n) certificate;
            v vVar = q.f26822l2;
            gg.b bVar = (gg.b) nVar.getBagAttribute(vVar);
            if ((bVar == null || !bVar.c().equals(str)) && str != null) {
                nVar.setBagAttribute(vVar, new j1(str));
            }
            Enumeration bagAttributeKeys = nVar.getBagAttributeKeys();
            while (bagAttributeKeys.hasMoreElements()) {
                v vVar2 = (v) bagAttributeKeys.nextElement();
                if (!vVar2.s(q.f26825m2)) {
                    h hVar2 = new h();
                    hVar2.a(vVar2);
                    hVar2.a(new y1(nVar.getBagAttribute(vVar2)));
                    hVar.a(new x1(hVar2));
                    z10 = true;
                }
            }
        }
        if (!z10) {
            h hVar3 = new h();
            hVar3.a(q.f26822l2);
            hVar3.a(new y1(new j1(str)));
            hVar.a(new x1(hVar3));
        }
        return new y(q.E3, cVar.b(), new y1(hVar));
    }

    public m0 createSubjectKeyId(PublicKey publicKey) {
        try {
            return new m0(getDigest(n0.n(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    private void doStore(OutputStream outputStream, char[] cArr, boolean z10) {
        String str;
        boolean z11;
        boolean z12;
        String str2 = "BER";
        if (this.keys.size() != 0) {
            Objects.requireNonNull(cArr, "no password supplied for PKCS#12 KeyStore");
        } else if (cArr == null) {
            Enumeration keys = this.certs.keys();
            h hVar = new h();
            while (keys.hasMoreElements()) {
                try {
                    String str3 = (String) keys.nextElement();
                    hVar.a(createSafeBag(str3, (Certificate) this.certs.get(str3)));
                } catch (CertificateEncodingException e10) {
                    throw new IOException("Error encoding certificate: " + e10.toString());
                }
            }
            v vVar = q.Q1;
            if (z10) {
                new r(new f(vVar, new t1(new x1(new f(vVar, new t1(new x1(hVar).getEncoded()))).getEncoded())), null).i(outputStream, "DER");
                return;
            } else {
                new r(new f(vVar, new y0(new a1(new f(vVar, new y0(new a1(hVar).getEncoded()))).getEncoded())), null).i(outputStream, str2);
                return;
            }
        }
        h hVar2 = new h();
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str4 = (String) keys2.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str4);
            p pVar = new p(bArr, MIN_ITERATIONS);
            zg.i iVar = new zg.i(new b(this.keyAlgorithm, pVar.b()), wrapKey(this.keyAlgorithm.H(), privateKey, pVar, cArr));
            h hVar3 = new h();
            if (privateKey instanceof qi.n) {
                qi.n nVar = (qi.n) privateKey;
                v vVar2 = q.f26822l2;
                gg.b bVar = (gg.b) nVar.getBagAttribute(vVar2);
                if (bVar == null || !bVar.c().equals(str4)) {
                    nVar.setBagAttribute(vVar2, new j1(str4));
                }
                v vVar3 = q.f26825m2;
                if (nVar.getBagAttribute(vVar3) == null) {
                    nVar.setBagAttribute(vVar3, createSubjectKeyId(engineGetCertificate(str4).getPublicKey()));
                }
                Enumeration bagAttributeKeys = nVar.getBagAttributeKeys();
                z12 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    v vVar4 = (v) bagAttributeKeys.nextElement();
                    h hVar4 = new h();
                    hVar4.a(vVar4);
                    hVar4.a(new y1(nVar.getBagAttribute(vVar4)));
                    hVar3.a(new x1(hVar4));
                    z12 = true;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                h hVar5 = new h();
                Certificate engineGetCertificate = engineGetCertificate(str4);
                hVar5.a(q.f26825m2);
                hVar5.a(new y1(createSubjectKeyId(engineGetCertificate.getPublicKey())));
                hVar3.a(new x1(hVar5));
                h hVar6 = new h();
                hVar6.a(q.f26822l2);
                hVar6.a(new y1(new j1(str4)));
                hVar3.a(new x1(hVar6));
            }
            hVar2.a(new y(q.D3, iVar.b(), new y1(hVar3)));
        }
        y0 y0Var = new y0(new x1(hVar2).k("DER"));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        h hVar7 = new h();
        b bVar2 = new b(this.certAlgorithm, new p(bArr2, MIN_ITERATIONS).b());
        Hashtable hashtable = new Hashtable();
        Enumeration keys3 = this.keys.keys();
        while (keys3.hasMoreElements()) {
            try {
                String str5 = (String) keys3.nextElement();
                Certificate engineGetCertificate2 = engineGetCertificate(str5);
                Enumeration enumeration = keys3;
                zg.c cVar = new zg.c(q.f26834p2, new t1(engineGetCertificate2.getEncoded()));
                h hVar8 = new h();
                if (engineGetCertificate2 instanceof qi.n) {
                    qi.n nVar2 = (qi.n) engineGetCertificate2;
                    v vVar5 = q.f26822l2;
                    gg.b bVar3 = (gg.b) nVar2.getBagAttribute(vVar5);
                    if (bVar3 == null || !bVar3.c().equals(str5)) {
                        nVar2.setBagAttribute(vVar5, new j1(str5));
                    }
                    v vVar6 = q.f26825m2;
                    if (nVar2.getBagAttribute(vVar6) == null) {
                        nVar2.setBagAttribute(vVar6, createSubjectKeyId(engineGetCertificate2.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = nVar2.getBagAttributeKeys();
                    z11 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        v vVar7 = (v) bagAttributeKeys2.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys2;
                        h hVar9 = new h();
                        hVar9.a(vVar7);
                        hVar9.a(new y1(nVar2.getBagAttribute(vVar7)));
                        hVar8.a(new x1(hVar9));
                        bagAttributeKeys2 = enumeration2;
                        str2 = str2;
                        z11 = true;
                    }
                    str = str2;
                } else {
                    str = str2;
                    z11 = false;
                }
                if (!z11) {
                    h hVar10 = new h();
                    hVar10.a(q.f26825m2);
                    hVar10.a(new y1(createSubjectKeyId(engineGetCertificate2.getPublicKey())));
                    hVar8.a(new x1(hVar10));
                    h hVar11 = new h();
                    hVar11.a(q.f26822l2);
                    hVar11.a(new y1(new j1(str5)));
                    hVar8.a(new x1(hVar11));
                }
                hVar7.a(new y(q.E3, cVar.b(), new y1(hVar8)));
                hashtable.put(engineGetCertificate2, engineGetCertificate2);
                keys3 = enumeration;
                str2 = str;
            } catch (CertificateEncodingException e11) {
                throw new IOException("Error encoding certificate: " + e11.toString());
            }
        }
        String str6 = str2;
        Enumeration keys4 = this.certs.keys();
        while (keys4.hasMoreElements()) {
            try {
                String str7 = (String) keys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str7);
                if (this.keys.get(str7) == null) {
                    hVar7.a(createSafeBag(str7, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e12) {
                throw new IOException("Error encoding certificate: " + e12.toString());
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration keys5 = this.chainCerts.keys();
        while (keys5.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) keys5.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    zg.c cVar2 = new zg.c(q.f26834p2, new t1(certificate2.getEncoded()));
                    h hVar12 = new h();
                    if (certificate2 instanceof qi.n) {
                        qi.n nVar3 = (qi.n) certificate2;
                        Enumeration bagAttributeKeys3 = nVar3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            v vVar8 = (v) bagAttributeKeys3.nextElement();
                            if (!vVar8.s(q.f26825m2)) {
                                h hVar13 = new h();
                                hVar13.a(vVar8);
                                hVar13.a(new y1(nVar3.getBagAttribute(vVar8)));
                                hVar12.a(new x1(hVar13));
                                hashtable = hashtable;
                            }
                        }
                    }
                    Hashtable hashtable2 = hashtable;
                    hVar7.a(new y(q.E3, cVar2.b(), new y1(hVar12)));
                    hashtable = hashtable2;
                }
            } catch (CertificateEncodingException e13) {
                throw new IOException("Error encoding certificate: " + e13.toString());
            }
        }
        byte[] cryptData = cryptData(true, bVar2, cArr, false, new x1(hVar7).k("DER"));
        v vVar9 = q.Q1;
        f fVar = new f(vVar9, new y0(new zg.b(new f[]{new f(vVar9, y0Var), new f(q.V1, new zg.h(vVar9, bVar2, new y0(cryptData)).b())}).k(z10 ? "DER" : str6)));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        try {
            new r(fVar, new zg.l(new hh.r(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.l(), bArr3, this.itCount, cArr, false, ((w) fVar.l()).F())), bArr3, this.itCount)).i(outputStream, z10 ? "DER" : str6);
        } catch (Exception e14) {
            throw new IOException("error constructing MAC: " + e14.toString());
        }
    }

    private static byte[] getDigest(n0 n0Var) {
        org.bouncycastle.crypto.r b10 = ei.a.b();
        byte[] bArr = new byte[b10.getDigestSize()];
        byte[] D = n0Var.o().D();
        b10.update(D, 0, D.length);
        b10.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys = this.keys.keys();
        while (keys.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys.nextElement());
            for (int i10 = 0; i10 != engineGetCertificateChain.length; i10++) {
                hashSet.add(engineGetCertificateChain[i10]);
            }
        }
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys2.nextElement()));
        }
        return hashSet;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue >= 0) {
            BigInteger a10 = m.a(PKCS12_MAX_IT_COUNT_PROPERTY);
            if (a10 == null || a10.intValue() >= intValue) {
                return intValue;
            }
            throw new IllegalStateException("iteration count " + intValue + " greater than " + a10.intValue());
        }
        throw new IllegalStateException("negative iteration count found");
    }

    protected byte[] cryptData(boolean z10, b bVar, char[] cArr, boolean z11, byte[] bArr) {
        v l10 = bVar.l();
        int i10 = z10 ? 1 : 2;
        if (l10.N(q.I3)) {
            p m10 = p.m(bVar.o());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(m10.l(), m10.n().intValue());
                i iVar = new i(cArr, z11);
                Cipher e10 = this.helper.e(l10.H());
                e10.init(i10, iVar, pBEParameterSpec);
                return e10.doFinal(bArr);
            } catch (Exception e11) {
                throw new IOException("exception decrypting data - " + e11.toString());
            }
        } else if (!l10.s(q.f26860y1)) {
            throw new IOException("unknown PBE algorithm: " + l10);
        } else {
            try {
                return createCipher(i10, cArr, bVar).doFinal(bArr);
            } catch (Exception e12) {
                throw new IOException("exception decrypting data - " + e12.toString());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate == null) {
                return;
            }
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str != null) {
            Certificate certificate = (Certificate) this.certs.get(str);
            if (certificate != null) {
                return certificate;
            }
            String str2 = (String) this.localIds.get(str);
            return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
        }
        throw new IllegalArgumentException("null alias passed to getCertificate.");
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys = this.certs.keys();
        while (elements.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys2 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            String str2 = (String) keys2.nextElement();
            if (((Certificate) elements2.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        byte[] m10;
        if (str != null) {
            Certificate[] certificateArr = null;
            if (!engineIsKeyEntry(str)) {
                return null;
            }
            Certificate engineGetCertificate = engineGetCertificate(str);
            if (engineGetCertificate != null) {
                Vector vector = new Vector();
                while (engineGetCertificate != null) {
                    X509Certificate x509Certificate = (X509Certificate) engineGetCertificate;
                    byte[] extensionValue = x509Certificate.getExtensionValue(u.f12055k4.H());
                    X509Certificate x509Certificate2 = (extensionValue == null || (m10 = hh.i.l(w.E(extensionValue).F()).m()) == null) ? null : (Certificate) this.chainCerts.get(new CertId(m10));
                    if (x509Certificate2 == null) {
                        Principal issuerDN = x509Certificate.getIssuerDN();
                        if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                            Enumeration keys = this.chainCerts.keys();
                            while (true) {
                                if (!keys.hasMoreElements()) {
                                    break;
                                }
                                X509Certificate x509Certificate3 = (X509Certificate) this.chainCerts.get(keys.nextElement());
                                if (x509Certificate3.getSubjectDN().equals(issuerDN)) {
                                    try {
                                        x509Certificate.verify(x509Certificate3.getPublicKey());
                                        x509Certificate2 = x509Certificate3;
                                        break;
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    if (!vector.contains(engineGetCertificate)) {
                        vector.addElement(engineGetCertificate);
                        if (x509Certificate2 != engineGetCertificate) {
                            engineGetCertificate = x509Certificate2;
                        }
                    }
                    engineGetCertificate = null;
                }
                int size = vector.size();
                certificateArr = new Certificate[size];
                for (int i10 = 0; i10 != size; i10++) {
                    certificateArr[i10] = (Certificate) vector.elementAt(i10);
                }
            }
            return certificateArr;
        }
        throw new IllegalArgumentException("null alias passed to getCertificateChain.");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        Objects.requireNonNull(str, "alias == null");
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void engineLoad(java.io.InputStream r23, char[] r24) {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof ji.c) {
            engineLoad(((ji.c) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
    }

    public boolean engineProbe(InputStream inputStream) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
            return;
        }
        throw new KeyStoreException("There is a key entry with the name " + str + ".");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        boolean z10 = key instanceof PrivateKey;
        if (z10) {
            if (z10 && certificateArr == null) {
                throw new KeyStoreException("no certificate chain for private key");
            }
            if (this.keys.get(str) != null) {
                engineDeleteEntry(str);
            }
            this.keys.put(str, key);
            if (certificateArr == null) {
                return;
            }
            this.certs.put(str, certificateArr[0]);
            for (int i10 = 0; i10 != certificateArr.length; i10++) {
                this.chainCerts.put(new CertId(certificateArr[i10].getPublicKey()), certificateArr[i10]);
            }
            return;
        }
        throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        doStore(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        k kVar;
        char[] cArr;
        if (loadStoreParameter != null) {
            boolean z10 = loadStoreParameter instanceof k;
            if (!z10 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
                throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
            }
            if (z10) {
                kVar = (k) loadStoreParameter;
            } else {
                JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
                kVar = new k(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
            }
            KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
            if (protectionParameter == null) {
                cArr = null;
            } else if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
            } else {
                cArr = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
            }
            doStore(kVar.getOutputStream(), cArr, kVar.isForDEREncoding());
            return;
        }
        throw new IllegalArgumentException("'param' arg cannot be null");
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected PrivateKey unwrapKey(b bVar, byte[] bArr, char[] cArr, boolean z10) {
        v l10 = bVar.l();
        try {
            if (l10.N(q.I3)) {
                p m10 = p.m(bVar.o());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(m10.l(), validateIterationCount(m10.n()));
                Cipher e10 = this.helper.e(l10.H());
                e10.init(4, new i(cArr, z10), pBEParameterSpec);
                return (PrivateKey) e10.unwrap(bArr, BuildConfig.FLAVOR, 2);
            } else if (l10.s(q.f26860y1)) {
                return (PrivateKey) createCipher(4, cArr, bVar).unwrap(bArr, BuildConfig.FLAVOR, 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + l10);
            }
        } catch (Exception e11) {
            throw new IOException("exception unwrapping private key - " + e11.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, p pVar, char[] cArr) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory g10 = this.helper.g(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pVar.l(), pVar.n().intValue());
            Cipher e10 = this.helper.e(str);
            e10.init(3, g10.generateSecret(pBEKeySpec), pBEParameterSpec);
            return e10.wrap(key);
        } catch (Exception e11) {
            throw new IOException("exception encrypting data - " + e11.toString());
        }
    }
}
