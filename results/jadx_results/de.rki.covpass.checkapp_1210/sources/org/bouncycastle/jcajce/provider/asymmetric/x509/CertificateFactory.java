package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ck.b;
import gg.d0;
import gg.e0;
import gg.g;
import gg.j0;
import gg.p;
import gg.v;
import hh.n;
import hh.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ni.a;
import ni.c;
import zg.q;
import zg.z;
/* loaded from: classes3.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final c bcHelper = new a();
    private e0 sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;
    private e0 sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private InputStream currentCrlStream = null;

    /* loaded from: classes3.dex */
    public class ExCertificateException extends CertificateException {
        private Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExCertificateException(String str, Throwable th2) {
            super(str);
            CertificateFactory.this = r1;
            this.cause = th2;
        }

        public ExCertificateException(Throwable th2) {
            CertificateFactory.this = r1;
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    private CRL doGenerateCRL(InputStream inputStream, boolean z10) {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            e0 e0Var = this.sCrlData;
            if (e0Var != null) {
                if (this.sCrlDataObjectCount != e0Var.size()) {
                    return getCRL();
                }
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(b.d(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCRL(inputStream, z10) : readDERCRL(new p(inputStream, true));
        } catch (CRLException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new CRLException(e11.toString());
        }
    }

    private Certificate doGenerateCertificate(InputStream inputStream, boolean z10) {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            e0 e0Var = this.sData;
            if (e0Var != null) {
                if (this.sDataObjectCount != e0Var.size()) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(b.d(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCertificate(inputStream, z10) : readDERCertificate(new p(inputStream));
        } catch (Exception e10) {
            throw new ExCertificateException("parsing issue: " + e10.getMessage(), e10);
        }
    }

    private CRL getCRL() {
        e0 e0Var = this.sCrlData;
        if (e0Var == null || this.sCrlDataObjectCount >= e0Var.size()) {
            return null;
        }
        e0 e0Var2 = this.sCrlData;
        int i10 = this.sCrlDataObjectCount;
        this.sCrlDataObjectCount = i10 + 1;
        return createCRL(o.l(e0Var2.F(i10)));
    }

    private CRL getCRL(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (d0Var.size() <= 1 || !(d0Var.G(0) instanceof v) || !d0Var.G(0).equals(q.R1)) {
            return createCRL(o.l(d0Var));
        }
        this.sCrlData = z.n(d0.E((j0) d0Var.G(1), true)).l();
        return getCRL();
    }

    private Certificate getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                e0 e0Var = this.sData;
                int i10 = this.sDataObjectCount;
                this.sDataObjectCount = i10 + 1;
                g F = e0Var.F(i10);
                if (F instanceof d0) {
                    return new X509CertificateObject(this.bcHelper, n.n(F));
                }
            }
            return null;
        }
        return null;
    }

    private Certificate getCertificate(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (d0Var.size() <= 1 || !(d0Var.G(0) instanceof v) || !d0Var.G(0).equals(q.R1)) {
            return new X509CertificateObject(this.bcHelper, n.n(d0Var));
        }
        this.sData = z.n(d0.E((j0) d0Var.G(1), true)).m();
        return getCertificate();
    }

    private CRL readDERCRL(p pVar) {
        return getCRL(d0.F(pVar.s()));
    }

    private Certificate readDERCertificate(p pVar) {
        return getCertificate(d0.F(pVar.s()));
    }

    private CRL readPEMCRL(InputStream inputStream, boolean z10) {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream, z10));
    }

    private Certificate readPEMCertificate(InputStream inputStream, boolean z10) {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream, z10));
    }

    protected CRL createCRL(o oVar) {
        return new X509CRLObject(this.bcHelper, oVar);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        return doGenerateCRL(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL doGenerateCRL = doGenerateCRL(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCRL != null) {
                arrayList.add(doGenerateCRL);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        return doGenerateCertificate(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate doGenerateCertificate = doGenerateCertificate(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCertificate != null) {
                arrayList.add(doGenerateCertificate);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }
}
