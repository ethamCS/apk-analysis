package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ak.a;
import gg.g;
import hh.b0;
import hh.o;
import hh.u;
import java.io.IOException;
import java.security.cert.CRLException;
import ni.c;
/* loaded from: classes3.dex */
class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock = new Object();
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    /* loaded from: classes3.dex */
    public static class X509CRLException extends CRLException {
        private final Throwable cause;

        X509CRLException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        X509CRLException(Throwable th2) {
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public X509CRLObject(c cVar, o oVar) {
        super(cVar, oVar, createSigAlgName(oVar), createSigAlgParams(oVar), isIndirectCRL(oVar));
    }

    private static String createSigAlgName(o oVar) {
        try {
            return X509SignatureUtil.getSignatureName(oVar.r());
        } catch (Exception e10) {
            throw new X509CRLException("CRL contents invalid: " + e10.getMessage(), e10);
        }
    }

    private static byte[] createSigAlgParams(o oVar) {
        try {
            g o10 = oVar.r().o();
            if (o10 != null) {
                return o10.b().k("DER");
            }
            return null;
        } catch (Exception e10) {
            throw new CRLException("CRL contents invalid: " + e10);
        }
    }

    private X509CRLInternal getInternalCRL() {
        X509CRLException x509CRLException;
        byte[] bArr;
        X509CRLInternal x509CRLInternal;
        synchronized (this.cacheLock) {
            X509CRLInternal x509CRLInternal2 = this.internalCRLValue;
            if (x509CRLInternal2 != null) {
                return x509CRLInternal2;
            }
            try {
                x509CRLException = null;
                bArr = this.f18687c.k("DER");
            } catch (IOException e10) {
                bArr = null;
                x509CRLException = new X509CRLException(e10);
            }
            X509CRLInternal x509CRLInternal3 = new X509CRLInternal(this.bcHelper, this.f18687c, this.sigAlgName, this.sigAlgParams, this.isIndirect, bArr, x509CRLException);
            synchronized (this.cacheLock) {
                if (this.internalCRLValue == null) {
                    this.internalCRLValue = x509CRLInternal3;
                }
                x509CRLInternal = this.internalCRLValue;
            }
            return x509CRLInternal;
        }
    }

    private static boolean isIndirectCRL(o oVar) {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(oVar, u.f12049e4.H());
            if (extensionOctets != null) {
                return b0.o(extensionOctets).r();
            }
            return false;
        } catch (Exception e10) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e10);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        X509CRLInternal internalCRL;
        gg.c q10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (!this.hashValueSet || !x509CRLObject.hashValueSet) {
                if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (q10 = this.f18687c.q()) != null && !q10.s(x509CRLObject.f18687c.q())) {
                    return false;
                }
            } else if (this.hashValue != x509CRLObject.hashValue) {
                return false;
            }
            internalCRL = getInternalCRL();
            obj = x509CRLObject.getInternalCRL();
        } else {
            internalCRL = getInternalCRL();
        }
        return internalCRL.equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        return a.h(getInternalCRL().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }
}
