package org.bouncycastle.jce.provider;

import ak.o;
import ak.p;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ji.m;
/* loaded from: classes3.dex */
abstract class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    public static Set findCRLs(m mVar, Date date, List list, List list2) {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, mVar, list2);
            findCRLs(hashSet, mVar, list);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate d10 = mVar.d();
                    if (d10 == null || x509crl.getThisUpdate().before(d10.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e10);
        }
    }

    private static void findCRLs(HashSet hashSet, m mVar, List list) {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z10 = false;
        for (Object obj : list) {
            if (obj instanceof o) {
                try {
                    hashSet.addAll(((o) obj).getMatches(mVar));
                } catch (p e10) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e10);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(m.c(mVar, (CertStore) obj));
                } catch (CertStoreException e11) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e11);
                    annotatedException2 = annotatedException;
                }
            }
            z10 = true;
        }
        if (z10 || annotatedException2 == null) {
            return;
        }
        throw annotatedException2;
    }
}
