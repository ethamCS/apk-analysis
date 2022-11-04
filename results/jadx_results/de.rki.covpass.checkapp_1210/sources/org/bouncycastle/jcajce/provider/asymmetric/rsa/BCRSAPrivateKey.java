package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import gg.g;
import hh.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
import zg.q;
import zg.v;
import zh.n1;
/* loaded from: classes3.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, n {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    protected transient b algorithmIdentifier;
    private byte[] algorithmIdentifierEnc;
    protected transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    protected transient n1 rsaPrivateKey;

    public BCRSAPrivateKey(b bVar, v vVar) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = vVar.q();
        this.privateExponent = vVar.u();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    public BCRSAPrivateKey(b bVar, n1 n1Var) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = n1Var.c();
        this.privateExponent = n1Var.b();
        this.rsaPrivateKey = n1Var;
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    public BCRSAPrivateKey(n1 n1Var) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = n1Var.c();
        this.privateExponent = n1Var.b();
        this.rsaPrivateKey = n1Var;
    }

    private static byte[] getEncoding(b bVar) {
        try {
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.algorithmIdentifierEnc == null) {
            this.algorithmIdentifierEnc = getEncoding(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER);
        }
        this.algorithmIdentifier = b.n(this.algorithmIdentifierEnc);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public n1 engineGetKeyParameters() {
        return this.rsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithmIdentifier.l().s(q.f26812i1) ? "RSASSA-PSS" : "RSA";
    }

    @Override // qi.n
    public g getBagAttribute(gg.v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        b bVar = this.algorithmIdentifier;
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return KeyUtil.getEncodedPrivateKeyInfo(bVar, new v(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // qi.n
    public void setBagAttribute(gg.v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = ak.q.d();
        stringBuffer.append("RSA Private Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("],[]");
        stringBuffer.append(d10);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
