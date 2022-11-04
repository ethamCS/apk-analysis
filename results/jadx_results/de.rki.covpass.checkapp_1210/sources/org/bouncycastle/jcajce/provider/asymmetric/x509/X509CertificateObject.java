package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ak.a;
import gg.a0;
import gg.g;
import gg.k1;
import gg.v;
import hh.j;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import ni.c;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
/* loaded from: classes3.dex */
class X509CertificateObject extends X509CertificateImpl implements n {
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;
    private final Object cacheLock = new Object();
    private n attrCarrier = new PKCS12BagAttributeCarrierImpl();

    /* loaded from: classes3.dex */
    public static class X509CertificateEncodingException extends CertificateEncodingException {
        private final Throwable cause;

        X509CertificateEncodingException(Throwable th2) {
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public X509CertificateObject(c cVar, hh.n nVar) {
        super(cVar, nVar, createBasicConstraints(nVar), createKeyUsage(nVar), createSigAlgName(nVar), createSigAlgParams(nVar));
    }

    private static j createBasicConstraints(hh.n nVar) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(nVar, "2.5.29.19");
            if (extensionOctets != null) {
                return j.l(a0.u(extensionOctets));
            }
            return null;
        } catch (Exception e10) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e10);
        }
    }

    private static boolean[] createKeyUsage(hh.n nVar) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(nVar, "2.5.29.15");
            if (extensionOctets == null) {
                return null;
            }
            k1 M = k1.M(a0.u(extensionOctets));
            byte[] D = M.D();
            int length = (D.length * 8) - M.d();
            int i10 = 9;
            if (length >= 9) {
                i10 = length;
            }
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 != length; i11++) {
                zArr[i11] = (D[i11 / 8] & (128 >>> (i11 % 8))) != 0;
            }
            return zArr;
        } catch (Exception e10) {
            throw new CertificateParsingException("cannot construct KeyUsage: " + e10);
        }
    }

    private static String createSigAlgName(hh.n nVar) {
        try {
            return X509SignatureUtil.getSignatureName(nVar.s());
        } catch (Exception e10) {
            throw new CertificateParsingException("cannot construct SigAlgName: " + e10);
        }
    }

    private static byte[] createSigAlgParams(hh.n nVar) {
        try {
            g o10 = nVar.s().o();
            if (o10 != null) {
                return o10.b().k("DER");
            }
            return null;
        } catch (Exception e10) {
            throw new CertificateParsingException("cannot construct SigAlgParams: " + e10);
        }
    }

    private X509CertificateInternal getInternalCertificate() {
        X509CertificateEncodingException x509CertificateEncodingException;
        byte[] bArr;
        X509CertificateInternal x509CertificateInternal;
        synchronized (this.cacheLock) {
            X509CertificateInternal x509CertificateInternal2 = this.internalCertificateValue;
            if (x509CertificateInternal2 != null) {
                return x509CertificateInternal2;
            }
            try {
                x509CertificateEncodingException = null;
                bArr = this.f18688c.k("DER");
            } catch (IOException e10) {
                bArr = null;
                x509CertificateEncodingException = new X509CertificateEncodingException(e10);
            }
            X509CertificateInternal x509CertificateInternal3 = new X509CertificateInternal(this.bcHelper, this.f18688c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, bArr, x509CertificateEncodingException);
            synchronized (this.cacheLock) {
                if (this.internalCertificateValue == null) {
                    this.internalCertificateValue = x509CertificateInternal3;
                }
                x509CertificateInternal = this.internalCertificateValue;
            }
            return x509CertificateInternal;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        long time = date.getTime();
        long[] validityValues = getValidityValues();
        if (time > validityValues[1]) {
            throw new CertificateExpiredException("certificate expired on " + this.f18688c.l().n());
        } else if (time >= validityValues[0]) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f18688c.u().n());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        X509CertificateInternal internalCertificate;
        gg.c r10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
            if (!this.hashValueSet || !x509CertificateObject.hashValueSet) {
                if ((this.internalCertificateValue == null || x509CertificateObject.internalCertificateValue == null) && (r10 = this.f18688c.r()) != null && !r10.s(x509CertificateObject.f18688c.r())) {
                    return false;
                }
            } else if (this.hashValue != x509CertificateObject.hashValue) {
                return false;
            }
            internalCertificate = getInternalCertificate();
            obj = x509CertificateObject.getInternalCertificate();
        } else {
            internalCertificate = getInternalCertificate();
        }
        return internalCertificate.equals(obj);
    }

    @Override // qi.n
    public g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return a.h(getInternalCertificate().getEncoded());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            X500Principal x500Principal2 = this.issuerValue;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.cacheLock) {
                if (this.issuerValue == null) {
                    this.issuerValue = issuerX500Principal;
                }
                x500Principal = this.issuerValue;
            }
            return x500Principal;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.cacheLock) {
            PublicKey publicKey2 = this.publicKeyValue;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.cacheLock) {
                if (this.publicKeyValue == null) {
                    this.publicKeyValue = publicKey3;
                }
                publicKey = this.publicKeyValue;
            }
            return publicKey;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            X500Principal x500Principal2 = this.subjectValue;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.cacheLock) {
                if (this.subjectValue == null) {
                    this.subjectValue = subjectX500Principal;
                }
                x500Principal = this.subjectValue;
            }
            return x500Principal;
        }
    }

    public long[] getValidityValues() {
        long[] jArr;
        synchronized (this.cacheLock) {
            long[] jArr2 = this.validityValues;
            if (jArr2 != null) {
                return jArr2;
            }
            long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
            synchronized (this.cacheLock) {
                if (this.validityValues == null) {
                    this.validityValues = jArr3;
                }
                jArr = this.validityValues;
            }
            return jArr;
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getInternalCertificate().getEncoded();
            int i10 = 0;
            for (int i11 = 1; i11 < encoded.length; i11++) {
                i10 += encoded[i11] * i11;
            }
            return i10;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }
}
