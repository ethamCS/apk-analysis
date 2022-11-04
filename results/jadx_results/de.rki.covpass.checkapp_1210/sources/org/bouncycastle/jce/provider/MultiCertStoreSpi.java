package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oi.b;
/* loaded from: classes3.dex */
public class MultiCertStoreSpi extends CertStoreSpi {
    private b params;

    public MultiCertStoreSpi(CertStoreParameters certStoreParameters) {
        super(certStoreParameters);
        if (certStoreParameters instanceof b) {
            this.params = (b) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n" + certStoreParameters.toString());
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) {
        boolean c10 = this.params.c();
        List arrayList = c10 ? new ArrayList() : Collections.EMPTY_LIST;
        for (CertStore certStore : this.params.a()) {
            Collection<? extends CRL> cRLs = certStore.getCRLs(cRLSelector);
            if (c10) {
                arrayList.addAll(cRLs);
            } else if (!cRLs.isEmpty()) {
                return cRLs;
            }
        }
        return arrayList;
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) {
        boolean c10 = this.params.c();
        List arrayList = c10 ? new ArrayList() : Collections.EMPTY_LIST;
        for (CertStore certStore : this.params.a()) {
            Collection<? extends Certificate> certificates = certStore.getCertificates(certSelector);
            if (c10) {
                arrayList.addAll(certificates);
            } else if (!certificates.isEmpty()) {
                return certificates;
            }
        }
        return arrayList;
    }
}
