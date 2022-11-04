package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
public class BCECGOST3410PrivateKey implements ECPrivateKey, b, n {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d */
    private transient BigInteger f18679d;
    private transient ECParameterSpec ecSpec;
    private transient g gostParams;
    private transient c publicKey;
    private boolean withCompression;

    protected BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18679d = d0Var.c();
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18679d = d0Var.c();
        if (eCParameterSpec == null) {
            y b10 = d0Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, e eVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18679d = d0Var.c();
        if (eVar == null) {
            y b10 = d0Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), EC5Util.convertPoint(eVar.b()), eVar.d(), eVar.c().intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18679d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18679d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18679d = bCECGOST3410PrivateKey.f18679d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }

    public BCECGOST3410PrivateKey(f fVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18679d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
    }

    public BCECGOST3410PrivateKey(s sVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(sVar);
    }

    private void extractBytes(byte[] bArr, int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i11 = 0; i11 != 32; i11++) {
            bArr[i10 + i11] = byteArray[(byteArray.length - 1) - i11];
        }
    }

    private c getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return n0.n(a0.u(bCECGOST3410PublicKey.getEncoded())).o();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(zg.s r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.populateFromPrivKeyInfo(zg.s):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(s.m(a0.u((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
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
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
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
        return this.f18679d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            gg.g r0 = r9.gostParams
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L2c
            r0 = 32
            byte[] r0 = new byte[r0]
            r3 = 0
            java.math.BigInteger r4 = r9.getS()
            r9.extractBytes(r0, r3, r4)
            zg.s r3 = new zg.s     // Catch: java.io.IOException -> L2b
            hh.b r4 = new hh.b     // Catch: java.io.IOException -> L2b
            gg.v r5 = lg.a.f16029m     // Catch: java.io.IOException -> L2b
            gg.g r6 = r9.gostParams     // Catch: java.io.IOException -> L2b
            r4.<init>(r5, r6)     // Catch: java.io.IOException -> L2b
            gg.t1 r5 = new gg.t1     // Catch: java.io.IOException -> L2b
            r5.<init>(r0)     // Catch: java.io.IOException -> L2b
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L2b
            byte[] r0 = r3.k(r1)     // Catch: java.io.IOException -> L2b
            return r0
        L2b:
            return r2
        L2c:
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r3 = r0 instanceof ri.d
            if (r3 == 0) goto L51
            ri.d r0 = (ri.d) r0
            java.lang.String r0 = r0.c()
            gg.v r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L4b
            gg.v r0 = new gg.v
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            ri.d r3 = (ri.d) r3
            java.lang.String r3 = r3.c()
            r0.<init>(r3)
        L4b:
            ih.g r3 = new ih.g
            r3.<init>(r0)
            goto La4
        L51:
            if (r0 != 0) goto L65
            ih.g r3 = new ih.g
            gg.r1 r0 = gg.r1.f10880d
            r3.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r4)
            goto Lb4
        L65:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            ti.e r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            ih.i r0 = new ih.i
            ih.k r5 = new ih.k
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.ECPoint r3 = r3.getGenerator()
            ti.i r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r3)
            boolean r6 = r9.withCompression
            r5.<init>(r3, r6)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            ih.g r3 = new ih.g
            r3.<init>(r0)
        La4:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r4 = r9.ecSpec
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r4, r5)
        Lb4:
            gg.c r4 = r9.publicKey
            if (r4 == 0) goto Lc4
            bh.a r4 = new bh.a
            java.math.BigInteger r5 = r9.getS()
            gg.c r6 = r9.publicKey
            r4.<init>(r0, r5, r6, r3)
            goto Lcd
        Lc4:
            bh.a r4 = new bh.a
            java.math.BigInteger r5 = r9.getS()
            r4.<init>(r0, r5, r3)
        Lcd:
            zg.s r0 = new zg.s     // Catch: java.io.IOException -> Le6
            hh.b r5 = new hh.b     // Catch: java.io.IOException -> Le6
            gg.v r6 = lg.a.f16029m     // Catch: java.io.IOException -> Le6
            gg.a0 r3 = r3.b()     // Catch: java.io.IOException -> Le6
            r5.<init>(r6, r3)     // Catch: java.io.IOException -> Le6
            gg.a0 r3 = r4.b()     // Catch: java.io.IOException -> Le6
            r0.<init>(r5, r3)     // Catch: java.io.IOException -> Le6
            byte[] r0 = r0.k(r1)     // Catch: java.io.IOException -> Le6
            return r0
        Le6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
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
        return this.f18679d;
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
        return ECUtil.privateKeyToString(this.algorithm, this.f18679d, engineGetSpec());
    }
}
