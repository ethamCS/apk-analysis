package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import gg.g;
import gg.q;
import gg.r1;
import hh.b;
import hh.n0;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import zh.t;
/* loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient t lwKeyParams;

    /* renamed from: y */
    private BigInteger f18676y;

    public BCDSAPublicKey(n0 n0Var) {
        try {
            this.f18676y = ((q) n0Var.q()).G();
            if (isNotNull(n0Var.l().o())) {
                hh.q m10 = hh.q.m(n0Var.l().o());
                this.dsaSpec = new DSAParameterSpec(m10.n(), m10.o(), m10.l());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new t(this.f18676y, DSAUtil.toDSAParameters(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f18676y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new t(this.f18676y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f18676y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new t(this.f18676y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    public BCDSAPublicKey(t tVar) {
        this.f18676y = tVar.c();
        this.dsaSpec = tVar.b() != null ? new DSAParameterSpec(tVar.b().b(), tVar.b().c(), tVar.b().a()) : null;
        this.lwKeyParams = tVar;
    }

    private boolean isNotNull(g gVar) {
        return gVar != null && !r1.f10880d.s(gVar.b());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new t(this.f18676y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        BigInteger bigInteger;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            bigInteger = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            bigInteger = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(bigInteger);
    }

    public t engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.dsaSpec != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        return dSAParams == null ? KeyUtil.getEncodedSubjectPublicKeyInfo(new b(o.A0), new q(this.f18676y)) : KeyUtil.getEncodedSubjectPublicKeyInfo(new b(o.A0, new hh.q(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).b()), new q(this.f18676y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f18676y;
    }

    public int hashCode() {
        return this.dsaSpec != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = ak.q.d();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(this.f18676y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
