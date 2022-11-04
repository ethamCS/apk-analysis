package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import gg.g;
import gg.v;
import hh.b;
import hh.q;
import ih.o;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
import zg.s;
/* loaded from: classes3.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, n {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient DSAParams dsaSpec;

    /* renamed from: x */
    private BigInteger f18675x;

    protected BCDSAPrivateKey() {
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.f18675x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.f18675x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(s sVar) {
        q m10 = q.m(sVar.o().o());
        this.f18675x = ((gg.q) sVar.u()).G();
        this.dsaSpec = new DSAParameterSpec(m10.n(), m10.o(), m10.l());
    }

    public BCDSAPrivateKey(zh.s sVar) {
        this.f18675x = sVar.c();
        this.dsaSpec = new DSAParameterSpec(sVar.b().b(), sVar.b().c(), sVar.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // qi.n
    public g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(new b(o.A0, new q(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).b()), new gg.q(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.f18675x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = ak.q.d();
        BigInteger modPow = getParams().getG().modPow(this.f18675x, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(modPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("            Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
