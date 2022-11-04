package org.bouncycastle.jce.provider;

import gg.d0;
import gg.h;
import gg.m;
import gg.v;
import gg.w;
import gg.x1;
import hh.u;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import ji.o;
import ni.c;
import xg.a;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.j;
import xg.k;
import xg.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<b, f>>> cache = DesugarCollections.synchronizedMap(new WeakHashMap());

    OcspCache() {
    }

    public static f getOcspResponse(b bVar, o oVar, URI uri, X509Certificate x509Certificate, List<Extension> list, c cVar) {
        IOException e10;
        f l10;
        f fVar;
        m o10;
        WeakReference<Map<b, f>> weakReference = cache.get(uri);
        Map<b, f> map = weakReference != null ? weakReference.get() : null;
        boolean z10 = false;
        if (map != null && (fVar = map.get(bVar)) != null) {
            d0 o11 = k.l(a.m(w.E(fVar.m().n()).F()).q()).o();
            for (int i10 = 0; i10 != o11.size(); i10++) {
                n n10 = n.n(o11.G(i10));
                if (bVar.equals(n10.l()) && (o10 = n10.o()) != null) {
                    try {
                    } catch (ParseException unused) {
                        map.remove(bVar);
                    }
                    if (oVar.e().after(o10.G())) {
                        map.remove(bVar);
                        fVar = null;
                    }
                }
            }
            if (fVar != null) {
                return fVar;
            }
        }
        try {
            URL url = uri.toURL();
            h hVar = new h();
            hVar.a(new xg.h(bVar, null));
            h hVar2 = new h();
            byte[] bArr = null;
            for (int i11 = 0; i11 != list.size(); i11++) {
                Extension extension = list.get(i11);
                byte[] value = extension.getValue();
                if (d.f25620c.H().equals(extension.getId())) {
                    bArr = value;
                }
                hVar2.a(new u(new v(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new e(new xg.o(null, new x1(hVar), hh.v.n(new x1(hVar2))), null).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(encoded.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = DEFAULT_MAX_RESPONSE_SIZE;
                }
                l10 = f.l(ck.b.e(inputStream, contentLength));
            } catch (IOException e11) {
                e10 = e11;
            }
            try {
                if (l10.n().m() != 0) {
                    throw new CertPathValidatorException("OCSP responder failed: " + l10.n().n(), null, oVar.a(), oVar.b());
                }
                j m10 = j.m(l10.m());
                if (m10.o().s(d.f25619b)) {
                    z10 = ProvOcspRevocationChecker.validatedOcspResponse(a.m(m10.n().F()), oVar, bArr, x509Certificate, cVar);
                }
                if (!z10) {
                    throw new CertPathValidatorException("OCSP response failed to validate", null, oVar.a(), oVar.b());
                }
                WeakReference<Map<b, f>> weakReference2 = cache.get(uri);
                if (weakReference2 != null) {
                    weakReference2.get().put(bVar, l10);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(bVar, l10);
                    cache.put(uri, new WeakReference<>(hashMap));
                }
                return l10;
            } catch (IOException e12) {
                e10 = e12;
                throw new CertPathValidatorException("configuration error: " + e10.getMessage(), e10, oVar.a(), oVar.b());
            }
        } catch (MalformedURLException e13) {
            throw new CertPathValidatorException("configuration error: " + e13.getMessage(), e13, oVar.a(), oVar.b());
        }
    }
}
