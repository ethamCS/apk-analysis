package org.bouncycastle.jce.provider;

import ek.h;
import ek.p;
import ek.q;
import gg.d0;
import gg.e0;
import gg.g;
import gg.j0;
import gg.v;
import gk.b;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import zg.z;
/* loaded from: classes3.dex */
public class X509AttrCertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private e0 sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;

    private h getCertificate() {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                e0 e0Var = this.sData;
                int i10 = this.sDataObjectCount;
                this.sDataObjectCount = i10 + 1;
                g F = e0Var.F(i10);
                if (F instanceof j0) {
                    j0 j0Var = (j0) F;
                    if (j0Var.Q() == 2) {
                        return new q(d0.E(j0Var, false).getEncoded());
                    }
                }
            }
            return null;
        }
        return null;
    }

    private h readDERCertificate(InputStream inputStream) {
        d0 F = d0.F(new gg.p(inputStream).s());
        if (F.size() <= 1 || !(F.G(0) instanceof v) || !F.G(0).equals(zg.q.R1)) {
            return new q(F.getEncoded());
        }
        this.sData = new z(d0.E((j0) F.G(1), true)).m();
        return getCertificate();
    }

    private h readPEMCertificate(InputStream inputStream) {
        d0 readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new q(readPEMObject.getEncoded());
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
            h hVar = (h) engineRead();
            if (hVar != null) {
                arrayList.add(hVar);
            } else {
                return arrayList;
            }
        }
    }
}
