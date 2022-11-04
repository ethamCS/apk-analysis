package org.bouncycastle.jcajce.provider.asymmetric.x509;

import dk.b;
import gg.a0;
import gg.d0;
import gg.g;
import gg.h;
import gg.p;
import gg.x1;
import gg.y1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import ni.a;
import ni.c;
import zg.f;
import zg.q;
import zg.z;
/* loaded from: classes3.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final c helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) {
        super("X.509");
        a aVar = new a();
        this.helper = aVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + str);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory d10 = aVar.d("X.509");
                while (true) {
                    Certificate generateCertificate = d10.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            } else {
                a0 s10 = new p(inputStream).s();
                if (!(s10 instanceof d0)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration H = ((d0) s10).H();
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory d11 = aVar.d("X.509");
                while (H.hasMoreElements()) {
                    this.certificates.add(0, d11.generateCertificate(new ByteArrayInputStream(((g) H.nextElement()).b().k("DER"))));
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e10) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e10.toString());
        } catch (NoSuchProviderException e11) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e11.toString());
        }
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new a();
        this.certificates = sortCerts(new ArrayList(list));
    }

    private List sortCerts(List list) {
        boolean z10;
        boolean z11;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i10 = 1;
        while (true) {
            if (i10 == list.size()) {
                z10 = true;
                break;
            } else if (!issuerX500Principal.equals(((X509Certificate) list.get(i10)).getSubjectX500Principal())) {
                z10 = false;
                break;
            } else {
                issuerX500Principal = ((X509Certificate) list.get(i10)).getIssuerX500Principal();
                i10++;
            }
        }
        if (z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i11 = 0; i11 < list.size(); i11++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i11);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i12 = 0;
            while (true) {
                if (i12 == list.size()) {
                    z11 = false;
                    break;
                } else if (((X509Certificate) list.get(i12)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z11 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (!z11) {
                arrayList.add(x509Certificate);
                list.remove(i11);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i13 = 0; i13 != arrayList.size(); i13++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i13)).getIssuerX500Principal();
            int i14 = 0;
            while (true) {
                if (i14 < list.size()) {
                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i14);
                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                        arrayList.add(x509Certificate2);
                        list.remove(i14);
                        break;
                    }
                    i14++;
                }
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private a0 toASN1Object(X509Certificate x509Certificate) {
        try {
            return new p(x509Certificate.getEncoded()).s();
        } catch (Exception e10) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e10.toString());
        }
    }

    private byte[] toDEREncoded(g gVar) {
        try {
            return gVar.b().k("DER");
        } catch (IOException e10) {
            throw new CertificateEncodingException("Exception thrown: " + e10);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (encodings.hasNext()) {
            Object next = encodings.next();
            if (!(next instanceof String)) {
                return null;
            }
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) {
        if (str.equalsIgnoreCase("PkiPath")) {
            h hVar = new h();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                hVar.a(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new x1(hVar));
        }
        int i10 = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            f fVar = new f(q.Q1, null);
            h hVar2 = new h();
            while (i10 != this.certificates.size()) {
                hVar2.a(toASN1Object((X509Certificate) this.certificates.get(i10)));
                i10++;
            }
            return toDEREncoded(new f(q.R1, new z(new gg.q(1L), new y1(), fVar, new y1(hVar2), null, new y1())));
        } else if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dk.f fVar2 = new dk.f(new OutputStreamWriter(byteArrayOutputStream));
            while (i10 != this.certificates.size()) {
                try {
                    fVar2.e(new b("CERTIFICATE", ((X509Certificate) this.certificates.get(i10)).getEncoded()));
                    i10++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            fVar2.close();
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }
}
