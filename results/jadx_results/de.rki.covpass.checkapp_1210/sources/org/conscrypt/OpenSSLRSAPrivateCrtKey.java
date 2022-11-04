package org.conscrypt;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
/* loaded from: classes3.dex */
public final class OpenSSLRSAPrivateCrtKey extends OpenSSLRSAPrivateKey implements RSAPrivateCrtKey {
    private static final long serialVersionUID = 3785291944868707197L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    public OpenSSLRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(init(rSAPrivateCrtKeySpec));
    }

    OpenSSLRSAPrivateCrtKey(OpenSSLKey openSSLKey) {
        super(openSSLKey);
    }

    public OpenSSLRSAPrivateCrtKey(OpenSSLKey openSSLKey, byte[][] bArr) {
        super(openSSLKey, bArr);
    }

    public static OpenSSLKey getInstance(RSAPrivateCrtKey rSAPrivateCrtKey) {
        if (rSAPrivateCrtKey.getFormat() == null) {
            return OpenSSLRSAPrivateKey.wrapPlatformKey(rSAPrivateCrtKey);
        }
        BigInteger modulus = rSAPrivateCrtKey.getModulus();
        BigInteger privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        if (modulus == null) {
            throw new InvalidKeyException("modulus == null");
        }
        if (privateExponent == null) {
            throw new InvalidKeyException("privateExponent == null");
        }
        try {
            BigInteger publicExponent = rSAPrivateCrtKey.getPublicExponent();
            BigInteger primeP = rSAPrivateCrtKey.getPrimeP();
            BigInteger primeQ = rSAPrivateCrtKey.getPrimeQ();
            BigInteger primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
            BigInteger primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
            BigInteger crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
            byte[] byteArray = modulus.toByteArray();
            byte[] bArr = null;
            byte[] byteArray2 = publicExponent == null ? null : publicExponent.toByteArray();
            byte[] byteArray3 = privateExponent.toByteArray();
            byte[] byteArray4 = primeP == null ? null : primeP.toByteArray();
            byte[] byteArray5 = primeQ == null ? null : primeQ.toByteArray();
            byte[] byteArray6 = primeExponentP == null ? null : primeExponentP.toByteArray();
            byte[] byteArray7 = primeExponentQ == null ? null : primeExponentQ.toByteArray();
            if (crtCoefficient != null) {
                bArr = crtCoefficient.toByteArray();
            }
            return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, byteArray2, byteArray3, byteArray4, byteArray5, byteArray6, byteArray7, bArr));
        } catch (Exception e10) {
            throw new InvalidKeyException(e10);
        }
    }

    private static OpenSSLKey init(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        BigInteger modulus = rSAPrivateCrtKeySpec.getModulus();
        BigInteger privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        if (modulus != null) {
            if (privateExponent == null) {
                throw new InvalidKeySpecException("privateExponent == null");
            }
            try {
                BigInteger publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
                BigInteger primeP = rSAPrivateCrtKeySpec.getPrimeP();
                BigInteger primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
                BigInteger primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
                BigInteger primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
                BigInteger crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
                byte[] byteArray = modulus.toByteArray();
                byte[] bArr = null;
                byte[] byteArray2 = publicExponent == null ? null : publicExponent.toByteArray();
                byte[] byteArray3 = privateExponent.toByteArray();
                byte[] byteArray4 = primeP == null ? null : primeP.toByteArray();
                byte[] byteArray5 = primeQ == null ? null : primeQ.toByteArray();
                byte[] byteArray6 = primeExponentP == null ? null : primeExponentP.toByteArray();
                byte[] byteArray7 = primeExponentQ == null ? null : primeExponentQ.toByteArray();
                if (crtCoefficient != null) {
                    bArr = crtCoefficient.toByteArray();
                }
                return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, byteArray2, byteArray3, byteArray4, byteArray5, byteArray6, byteArray7, bArr));
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10);
            }
        }
        throw new InvalidKeySpecException("modulus == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] byteArray = this.modulus.toByteArray();
        BigInteger bigInteger = this.publicExponent;
        byte[] bArr = null;
        byte[] byteArray2 = bigInteger == null ? null : bigInteger.toByteArray();
        byte[] byteArray3 = this.privateExponent.toByteArray();
        BigInteger bigInteger2 = this.primeP;
        byte[] byteArray4 = bigInteger2 == null ? null : bigInteger2.toByteArray();
        BigInteger bigInteger3 = this.primeQ;
        byte[] byteArray5 = bigInteger3 == null ? null : bigInteger3.toByteArray();
        BigInteger bigInteger4 = this.primeExponentP;
        byte[] byteArray6 = bigInteger4 == null ? null : bigInteger4.toByteArray();
        BigInteger bigInteger5 = this.primeExponentQ;
        byte[] byteArray7 = bigInteger5 == null ? null : bigInteger5.toByteArray();
        BigInteger bigInteger6 = this.crtCoefficient;
        if (bigInteger6 != null) {
            bArr = bigInteger6.toByteArray();
        }
        this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, byteArray2, byteArray3, byteArray4, byteArray5, byteArray6, byteArray7, bArr));
        this.fetchedParams = true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        if (!getOpenSSLKey().isHardwareBacked()) {
            ensureReadParams();
            objectOutputStream.defaultWriteObject();
            return;
        }
        throw new NotSerializableException("Hardware backed keys cannot be serialized");
    }

    @Override // org.conscrypt.OpenSSLRSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLRSAPrivateKey) {
            return getOpenSSLKey().equals(((OpenSSLRSAPrivateKey) obj).getOpenSSLKey());
        }
        if (obj instanceof RSAPrivateCrtKey) {
            ensureReadParams();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
            return getOpenSSLKey().isHardwareBacked() ? getModulus().equals(rSAPrivateCrtKey.getModulus()) && this.publicExponent.equals(rSAPrivateCrtKey.getPublicExponent()) : getModulus().equals(rSAPrivateCrtKey.getModulus()) && this.publicExponent.equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && this.primeP.equals(rSAPrivateCrtKey.getPrimeP()) && this.primeQ.equals(rSAPrivateCrtKey.getPrimeQ()) && this.primeExponentP.equals(rSAPrivateCrtKey.getPrimeExponentP()) && this.primeExponentQ.equals(rSAPrivateCrtKey.getPrimeExponentQ()) && this.crtCoefficient.equals(rSAPrivateCrtKey.getCrtCoefficient());
        } else if (!(obj instanceof RSAPrivateKey)) {
            return false;
        } else {
            ensureReadParams();
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
            return getOpenSSLKey().isHardwareBacked() ? getModulus().equals(rSAPrivateKey.getModulus()) : getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
        }
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        ensureReadParams();
        return this.crtCoefficient;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        ensureReadParams();
        return this.primeExponentP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        ensureReadParams();
        return this.primeExponentQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        ensureReadParams();
        return this.primeP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        ensureReadParams();
        return this.primeQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        ensureReadParams();
        return this.publicExponent;
    }

    @Override // org.conscrypt.OpenSSLRSAPrivateKey
    public final int hashCode() {
        int hashCode = super.hashCode();
        BigInteger bigInteger = this.publicExponent;
        return bigInteger != null ? hashCode ^ bigInteger.hashCode() : hashCode;
    }

    @Override // org.conscrypt.OpenSSLRSAPrivateKey
    public synchronized void readParams(byte[][] bArr) {
        super.readParams(bArr);
        if (bArr[1] != null) {
            this.publicExponent = new BigInteger(bArr[1]);
        }
        if (bArr[3] != null) {
            this.primeP = new BigInteger(bArr[3]);
        }
        if (bArr[4] != null) {
            this.primeQ = new BigInteger(bArr[4]);
        }
        if (bArr[5] != null) {
            this.primeExponentP = new BigInteger(bArr[5]);
        }
        if (bArr[6] != null) {
            this.primeExponentQ = new BigInteger(bArr[6]);
        }
        if (bArr[7] != null) {
            this.crtCoefficient = new BigInteger(bArr[7]);
        }
    }

    @Override // org.conscrypt.OpenSSLRSAPrivateKey
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OpenSSLRSAPrivateCrtKey{");
        ensureReadParams();
        sb2.append("modulus=");
        sb2.append(getModulus().toString(16));
        if (this.publicExponent != null) {
            sb2.append(',');
            sb2.append("publicExponent=");
            sb2.append(this.publicExponent.toString(16));
        }
        sb2.append('}');
        return sb2.toString();
    }
}
