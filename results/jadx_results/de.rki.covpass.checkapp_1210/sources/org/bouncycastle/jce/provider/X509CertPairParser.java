package org.bouncycastle.jce.provider;

import ek.l;
import ek.p;
import gg.d0;
import gk.b;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes3.dex */
public class X509CertPairParser extends p {
    private InputStream currentStream = null;

    private l readDERCrossCertificatePair(InputStream inputStream) {
        return new l(hh.p.m((d0) new gg.p(inputStream).s()));
    }

    @Override // ek.p
    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        if (!inputStream.markSupported()) {
            this.currentStream = new BufferedInputStream(this.currentStream);
        }
    }

    @Override // ek.p
    public Object engineRead() {
        try {
            this.currentStream.mark(10);
            if (this.currentStream.read() == -1) {
                return null;
            }
            this.currentStream.reset();
            return readDERCrossCertificatePair(this.currentStream);
        } catch (Exception e10) {
            throw new b(e10.toString(), e10);
        }
    }

    @Override // ek.p
    public Collection engineReadAll() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            l lVar = (l) engineRead();
            if (lVar != null) {
                arrayList.add(lVar);
            } else {
                return arrayList;
            }
        }
    }
}
