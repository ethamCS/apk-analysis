package org.bouncycastle.jce.provider;

import ak.c;
import ak.n;
import ak.o;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import ji.l;
import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<l>> cache = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class LocalCRLStore<T extends CRL> implements l, Iterable {
        private Collection<CRL> _local;

        public LocalCRLStore(o<CRL> oVar) {
            this._local = new ArrayList(oVar.getMatches(null));
        }

        @Override // ji.l, ak.o
        public Collection getMatches(n nVar) {
            if (nVar == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (nVar.z(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    CrlCache() {
    }

    public static synchronized l getCrl(CertificateFactory certificateFactory, Date date, URI uri) {
        synchronized (CrlCache.class) {
            WeakReference<l> weakReference = cache.get(uri);
            l lVar = weakReference != null ? weakReference.get() : null;
            if (lVar != null) {
                boolean z10 = false;
                Iterator it = lVar.getMatches(null).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                        if (nextUpdate != null && nextUpdate.before(date)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z10) {
                    return lVar;
                }
            }
            LocalCRLStore localCRLStore = new LocalCRLStore(new c(uri.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri)));
            cache.put(uri, new WeakReference<>(localCRLStore));
            return localCRLStore;
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
        httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
        httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
        InputStream inputStream = httpURLConnection.getInputStream();
        Collection<? extends CRL> generateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return generateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes(BuildConfig.FLAVOR).get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException("no CRL returned from: " + uri);
        } catch (NamingException e10) {
            throw new CRLException("issue connecting to: " + uri.toString(), e10);
        }
    }
}
