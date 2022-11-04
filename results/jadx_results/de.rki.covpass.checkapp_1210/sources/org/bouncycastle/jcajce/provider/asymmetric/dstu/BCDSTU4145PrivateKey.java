package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import gg.a0;
import gg.c;
import gg.g;
import gg.v;
import hh.n0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import qi.b;
import qi.n;
import ri.e;
import ri.f;
import zg.s;
import zh.d0;
import zh.y;
/* loaded from: classes3.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, b, n {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d */
    private transient BigInteger f18677d;
    private transient ECParameterSpec ecSpec;
    private transient c publicKey;
    private boolean withCompression;

    protected BCDSTU4145PrivateKey() {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(String str, d0 d0Var) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18677d = d0Var.c();
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(String str, d0 d0Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        y b10 = d0Var.b();
        this.algorithm = str;
        this.f18677d = d0Var.c();
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, d0 d0Var, BCDSTU4145PublicKey bCDSTU4145PublicKey, e eVar) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        y b10 = d0Var.b();
        this.algorithm = str;
        this.f18677d = d0Var.c();
        this.ecSpec = eVar == null ? new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), EC5Util.convertPoint(eVar.b()), eVar.d(), eVar.c().intValue());
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18677d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18677d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18677d = bCDSTU4145PrivateKey.f18677d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }

    public BCDSTU4145PrivateKey(f fVar) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18677d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
    }

    public BCDSTU4145PrivateKey(s sVar) {
        this.algorithm = "DSTU4145";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(sVar);
    }

    private c getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return n0.n(a0.u(bCDSTU4145PublicKey.getEncoded())).o();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(zg.s r13) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.populateFromPrivKeyInfo(zg.s):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(s.m(a0.u((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - 1) - i10];
            bArr[(bArr.length - 1) - i10] = b10;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // qi.n
    public g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // qi.b
    public BigInteger getD() {
        return this.f18677d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac A[Catch: IOException -> 0x00dc, TryCatch #0 {IOException -> 0x00dc, blocks: (B:16:0x00a2, B:18:0x00ac, B:19:0x00c1, B:20:0x00d5), top: B:23:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1 A[Catch: IOException -> 0x00dc, TryCatch #0 {IOException -> 0x00dc, blocks: (B:16:0x00a2, B:18:0x00ac, B:19:0x00c1, B:20:0x00d5), top: B:23:0x00a2 }] */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r1 = r0 instanceof ri.d
            r2 = 0
            if (r1 == 0) goto L26
            ri.d r0 = (ri.d) r0
            java.lang.String r0 = r0.c()
            gg.v r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L20
            gg.v r0 = new gg.v
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            ri.d r1 = (ri.d) r1
            java.lang.String r1 = r1.c()
            r0.<init>(r1)
        L20:
            ih.g r1 = new ih.g
            r1.<init>(r0)
            goto L79
        L26:
            if (r0 != 0) goto L3a
            ih.g r1 = new ih.g
            gg.r1 r0 = gg.r1.f10880d
            r1.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r3 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r3)
            goto L89
        L3a:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            ti.e r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            ih.i r0 = new ih.i
            ih.k r5 = new ih.k
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.ECPoint r1 = r1.getGenerator()
            ti.i r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r1)
            boolean r3 = r9.withCompression
            r5.<init>(r1, r3)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.math.BigInteger r6 = r1.getOrder()
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            int r1 = r1.getCofactor()
            long r7 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            byte[] r8 = r1.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            ih.g r1 = new ih.g
            r1.<init>(r0)
        L79:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3, r4)
        L89:
            gg.c r3 = r9.publicKey
            if (r3 == 0) goto L99
            bh.a r3 = new bh.a
            java.math.BigInteger r4 = r9.getS()
            gg.c r5 = r9.publicKey
            r3.<init>(r0, r4, r5, r1)
            goto La2
        L99:
            bh.a r3 = new bh.a
            java.math.BigInteger r4 = r9.getS()
            r3.<init>(r0, r4, r1)
        La2:
            java.lang.String r0 = r9.algorithm     // Catch: java.io.IOException -> Ldc
            java.lang.String r4 = "DSTU4145"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> Ldc
            if (r0 == 0) goto Lc1
            zg.s r0 = new zg.s     // Catch: java.io.IOException -> Ldc
            hh.b r4 = new hh.b     // Catch: java.io.IOException -> Ldc
            gg.v r5 = dh.f.f9060c     // Catch: java.io.IOException -> Ldc
            gg.a0 r1 = r1.b()     // Catch: java.io.IOException -> Ldc
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Ldc
            gg.a0 r1 = r3.b()     // Catch: java.io.IOException -> Ldc
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Ldc
            goto Ld5
        Lc1:
            zg.s r0 = new zg.s     // Catch: java.io.IOException -> Ldc
            hh.b r4 = new hh.b     // Catch: java.io.IOException -> Ldc
            gg.v r5 = ih.o.Q     // Catch: java.io.IOException -> Ldc
            gg.a0 r1 = r1.b()     // Catch: java.io.IOException -> Ldc
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Ldc
            gg.a0 r1 = r3.b()     // Catch: java.io.IOException -> Ldc
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Ldc
        Ld5:
            java.lang.String r1 = "DER"
            byte[] r0 = r0.k(r1)     // Catch: java.io.IOException -> Ldc
            return r0
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // qi.a
    public e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f18677d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.f18677d, engineGetSpec());
    }
}
