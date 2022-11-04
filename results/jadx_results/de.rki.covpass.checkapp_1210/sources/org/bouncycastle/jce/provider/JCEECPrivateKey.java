package org.bouncycastle.jce.provider;

import ak.q;
import gg.a0;
import gg.c;
import gg.g;
import gg.r;
import gg.r1;
import gg.v;
import hh.n0;
import ih.i;
import ih.k;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import lg.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.b;
import qi.n;
import ri.d;
import ri.e;
import ri.f;
import zg.s;
import zh.d0;
import zh.y;
/* loaded from: classes3.dex */
public class JCEECPrivateKey implements ECPrivateKey, b, n {
    private String algorithm;
    private PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d */
    private BigInteger f18692d;
    private ECParameterSpec ecSpec;
    private c publicKey;
    private boolean withCompression;

    protected JCEECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = jCEECPrivateKey.f18692d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, f fVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
    }

    public JCEECPrivateKey(String str, d0 d0Var) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = d0Var.c();
        this.ecSpec = null;
    }

    public JCEECPrivateKey(String str, d0 d0Var, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = d0Var.c();
        if (eCParameterSpec == null) {
            y b10 = d0Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, d0 d0Var, JCEECPublicKey jCEECPublicKey, e eVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f18692d = d0Var.c();
        if (eVar == null) {
            y b10 = d0Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b10.a(), b10.f()), EC5Util.convertPoint(b10.b()), b10.e(), b10.c().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), EC5Util.convertPoint(eVar.b()), eVar.d(), eVar.c().intValue());
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f18692d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    JCEECPrivateKey(s sVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(sVar);
    }

    private c getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return n0.n(a0.u(jCEECPublicKey.getEncoded())).o();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(zg.s r11) {
        /*
            r10 = this;
            hh.b r0 = r11.o()
            gg.g r0 = r0.o()
            ih.g r0 = ih.g.l(r0)
            boolean r1 = r0.o()
            if (r1 == 0) goto L72
            gg.a0 r0 = r0.m()
            gg.v r0 = gg.v.K(r0)
            ih.i r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 != 0) goto L4b
            zh.y r1 = lg.b.e(r0)
            ti.e r2 = r1.a()
            byte[] r3 = r1.f()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            ri.d r2 = new ri.d
            java.lang.String r5 = lg.b.g(r0)
            ti.i r0 = r1.b()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.e()
            java.math.BigInteger r9 = r1.c()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto La9
        L4b:
            ti.e r2 = r1.l()
            byte[] r3 = r1.r()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            ri.d r2 = new ri.d
            java.lang.String r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            ti.i r0 = r1.m()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.q()
            java.math.BigInteger r9 = r1.n()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto La9
        L72:
            boolean r1 = r0.n()
            if (r1 == 0) goto L7c
            r0 = 0
            r10.ecSpec = r0
            goto Lab
        L7c:
            gg.a0 r0 = r0.m()
            ih.i r0 = ih.i.o(r0)
            ti.e r1 = r0.l()
            byte[] r2 = r0.r()
            java.security.spec.EllipticCurve r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r1, r2)
            java.security.spec.ECParameterSpec r2 = new java.security.spec.ECParameterSpec
            ti.i r3 = r0.m()
            java.security.spec.ECPoint r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r3)
            java.math.BigInteger r4 = r0.q()
            java.math.BigInteger r0 = r0.n()
            int r0 = r0.intValue()
            r2.<init>(r1, r3, r4, r0)
        La9:
            r10.ecSpec = r2
        Lab:
            gg.g r11 = r11.u()
            boolean r0 = r11 instanceof gg.q
            if (r0 == 0) goto Lbe
            gg.q r11 = gg.q.E(r11)
            java.math.BigInteger r11 = r11.G()
            r10.f18692d = r11
            goto Ld1
        Lbe:
            bh.b r0 = new bh.b
            gg.d0 r11 = (gg.d0) r11
            r0.<init>(r11)
            java.math.BigInteger r11 = r0.l()
            r10.f18692d = r11
            gg.c r11 = r0.n()
            r10.publicKey = r11
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPrivateKey.populateFromPrivKeyInfo(zg.s):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        populateFromPrivKeyInfo(s.m(a0.u((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
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
        return this.f18692d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ih.g gVar;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof d) {
            v namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec).c());
            if (namedCurveOid == null) {
                namedCurveOid = new v(((d) this.ecSpec).c());
            }
            gVar = new ih.g(namedCurveOid);
        } else if (eCParameterSpec == null) {
            gVar = new ih.g((r) r1.f10880d);
        } else {
            ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            gVar = new ih.g(new i(convertCurve, new k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        bh.b bVar = this.publicKey != null ? new bh.b(getS(), this.publicKey, gVar) : new bh.b(getS(), gVar);
        try {
            return (this.algorithm.equals("ECGOST3410") ? new s(new hh.b(a.f16029m, gVar.b()), bVar.b()) : new s(new hh.b(o.Q, gVar.b()), bVar.b())).k("DER");
        } catch (IOException unused) {
            return null;
        }
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
        return this.f18692d;
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
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(d10);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f18692d.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
