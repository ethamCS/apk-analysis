package org.bouncycastle.jce.provider;

import ek.p;
import gg.d0;
import gg.e0;
import gg.g;
import gg.j0;
import gg.v;
import gk.b;
import hh.n;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import zg.q;
import zg.z;
/* loaded from: classes3.dex */
public class X509CertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CERTIFICATE");
    private e0 sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private Certificate getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                e0 e0Var = this.sData;
                int i10 = this.sDataObjectCount;
                this.sDataObjectCount = i10 + 1;
                g F = e0Var.F(i10);
                if (F instanceof d0) {
                    return new X509CertificateObject(n.n(F));
                }
            }
            return null;
        }
        return null;
    }

    private Certificate readDERCertificate(InputStream inputStream) {
        d0 d0Var = (d0) new gg.p(inputStream).s();
        if (d0Var.size() <= 1 || !(d0Var.G(0) instanceof v) || !d0Var.G(0).equals(q.R1)) {
            return new X509CertificateObject(n.n(d0Var));
        }
        this.sData = new z(d0.E((j0) d0Var.G(1), true)).m();
        return getCertificate();
    }

    private Certificate readPEMCertificate(InputStream inputStream) {
        d0 readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new X509CertificateObject(n.n(readPEMObject));
        }
        return null;
    }

    @Override // ek.p
    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        this.sData = null;
        this.sDataObjectCount = 0;
        if (!inputStream.markSupported()) {
            this.currentStream = new BufferedInputStream(this.currentStream);
        }
    }

    @Override // ek.p
    public Object engineRead() {
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
            this.currentStream.mark(10);
            int read = this.currentStream.read();
            if (read == -1) {
                return null;
            }
            if (read != 48) {
                this.currentStream.reset();
                return readPEMCertificate(this.currentStream);
            }
            this.currentStream.reset();
            return readDERCertificate(this.currentStream);
        } catch (Exception e10) {
            throw new b(e10.toString(), e10);
        }
    }

    @Override // ek.p
    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificate = (Certificate) engineRead();
            if (certificate != null) {
                arrayList.add(certificate);
            } else {
                return arrayList;
            }
        }
    }
}
