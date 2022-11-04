package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ak.m;
import ak.q;
import gg.a0;
import gg.d0;
import gg.g;
import gg.g0;
import gg.k1;
import gg.o;
import gg.p;
import gg.r1;
import gg.v;
import hh.b;
import hh.j;
import hh.n;
import hh.p0;
import hh.u;
import hh.w;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ji.e;
import ki.a;
import ni.c;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import tg.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class X509CertificateImpl extends X509Certificate implements a {
    protected j basicConstraints;
    protected c bcHelper;

    /* renamed from: c */
    protected n f18688c;
    protected boolean[] keyUsage;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CertificateImpl(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr) {
        this.bcHelper = cVar;
        this.f18688c = nVar;
        this.basicConstraints = jVar;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, g gVar, byte[] bArr) {
        if (isAlgIdEqual(this.f18688c.s(), this.f18688c.C().s())) {
            X509SignatureUtil.setSignatureParameters(signature, gVar);
            signature.initVerify(publicKey);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(li.c.a(signature), 512);
                this.f18688c.C().i(bufferedOutputStream, "DER");
                bufferedOutputStream.close();
                if (!signature.verify(bArr)) {
                    throw new SignatureException("certificate does not verify with supplied key");
                }
                return;
            } catch (IOException e10) {
                throw new CertificateEncodingException(e10.toString());
            }
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) {
        SignatureException e10;
        SignatureException e11;
        boolean z10 = publicKey instanceof e;
        int i10 = 0;
        if (z10 && X509SignatureUtil.isCompositeAlgorithm(this.f18688c.s())) {
            List<PublicKey> b10 = ((e) publicKey).b();
            d0 F = d0.F(this.f18688c.s().o());
            d0 F2 = d0.F(k1.M(this.f18688c.r()).D());
            boolean z11 = false;
            while (i10 != b10.size()) {
                if (b10.get(i10) != null) {
                    b n10 = b.n(F.G(i10));
                    try {
                        checkSignature(b10.get(i10), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(n10)), n10.o(), k1.M(F2.G(i10)).D());
                        e11 = null;
                        z11 = true;
                    } catch (SignatureException e12) {
                        e11 = e12;
                    }
                    if (e11 != null) {
                        throw e11;
                    }
                }
                i10++;
            }
            if (!z11) {
                throw new InvalidKeyException("no matching key found");
            }
        } else if (!X509SignatureUtil.isCompositeAlgorithm(this.f18688c.s())) {
            Signature createSignature = signatureCreator.createSignature(X509SignatureUtil.getSignatureName(this.f18688c.s()));
            if (!z10) {
                checkSignature(publicKey, createSignature, this.f18688c.s().o(), getSignature());
                return;
            }
            List<PublicKey> b11 = ((e) publicKey).b();
            while (i10 != b11.size()) {
                try {
                    checkSignature(b11.get(i10), createSignature, this.f18688c.s().o(), getSignature());
                    return;
                } catch (InvalidKeyException unused) {
                    i10++;
                }
            }
            throw new InvalidKeyException("no matching signature found");
        } else {
            d0 F3 = d0.F(this.f18688c.s().o());
            d0 F4 = d0.F(k1.M(this.f18688c.r()).D());
            boolean z12 = false;
            while (i10 != F4.size()) {
                b n11 = b.n(F3.G(i10));
                try {
                    checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(n11)), n11.o(), k1.M(F4.G(i10)).D());
                    e10 = null;
                    z12 = true;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                    e10 = null;
                } catch (SignatureException e13) {
                    e10 = e13;
                }
                if (e10 != null) {
                    throw e10;
                }
                i10++;
            }
            if (!z12) {
                throw new InvalidKeyException("no matching key found");
            }
        }
    }

    private static Collection getAlternativeNames(n nVar, String str) {
        String c10;
        byte[] extensionOctets = getExtensionOctets(nVar, str);
        if (extensionOctets == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration H = d0.F(extensionOctets).H();
            while (H.hasMoreElements()) {
                w n10 = w.n(H.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ak.g.e(n10.q()));
                switch (n10.q()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(n10.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        c10 = ((g0) n10.o()).c();
                        arrayList2.add(c10);
                        break;
                    case 4:
                        c10 = fh.c.l(gh.e.V, n10.o()).toString();
                        arrayList2.add(c10);
                        break;
                    case 7:
                        try {
                            c10 = InetAddress.getByAddress(gg.w.E(n10.o()).F()).getHostAddress();
                            arrayList2.add(c10);
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        c10 = v.K(n10.o()).H();
                        arrayList2.add(c10);
                        break;
                    default:
                        throw new IOException("Bad tag number: " + n10.q());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() != 0) {
                return Collections.unmodifiableCollection(arrayList);
            }
            return null;
        } catch (Exception e10) {
            throw new CertificateParsingException(e10.getMessage());
        }
    }

    public static byte[] getExtensionOctets(n nVar, String str) {
        gg.w extensionValue = getExtensionValue(nVar, str);
        if (extensionValue != null) {
            return extensionValue.F();
        }
        return null;
    }

    protected static gg.w getExtensionValue(n nVar, String str) {
        u l10;
        hh.v m10 = nVar.C().m();
        if (m10 == null || (l10 = m10.l(new v(str))) == null) {
            return null;
        }
        return l10.n();
    }

    private boolean isAlgIdEqual(b bVar, b bVar2) {
        if (!bVar.l().s(bVar2.l())) {
            return false;
        }
        if (m.c("org.bouncycastle.x509.allow_absent_equiv_NULL")) {
            if (bVar.o() == null) {
                return bVar2.o() == null || bVar2.o().equals(r1.f10880d);
            } else if (bVar2.o() == null) {
                return bVar.o() == null || bVar.o().equals(r1.f10880d);
            }
        }
        if (bVar.o() != null) {
            return bVar.o().equals(bVar2.o());
        }
        if (bVar2.o() == null) {
            return true;
        }
        return bVar2.o().equals(bVar.o());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f18688c.l().n());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f18688c.u().n());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        j jVar = this.basicConstraints;
        if (jVar == null || !jVar.n()) {
            return -1;
        }
        if (this.basicConstraints.m() != null) {
            return this.basicConstraints.m().intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            hh.v m10 = this.f18688c.C().m();
            if (m10 == null) {
                return null;
            }
            Enumeration o10 = m10.o();
            while (o10.hasMoreElements()) {
                v vVar = (v) o10.nextElement();
                if (m10.l(vVar).r()) {
                    hashSet.add(vVar.H());
                }
            }
            return hashSet;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        byte[] extensionOctets = getExtensionOctets(this.f18688c, "2.5.29.37");
        if (extensionOctets == null) {
            return null;
        }
        try {
            d0 F = d0.F(a0.u(extensionOctets));
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 != F.size(); i10++) {
                arrayList.add(((v) F.G(i10)).H());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        gg.w extensionValue = getExtensionValue(this.f18688c, str);
        if (extensionValue != null) {
            try {
                return extensionValue.getEncoded();
            } catch (Exception e10) {
                throw new IllegalStateException("error parsing " + e10.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(this.f18688c, u.X3.H());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new oi.e(this.f18688c.o());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        gg.c q10 = this.f18688c.C().q();
        if (q10 != null) {
            byte[] D = q10.D();
            int length = (D.length * 8) - q10.d();
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 != length; i10++) {
                zArr[i10] = (D[i10 / 8] & (128 >>> (i10 % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // ki.a
    public fh.c getIssuerX500Name() {
        return this.f18688c.o();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f18688c.o().k("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return ak.a.o(this.keyUsage);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            hh.v m10 = this.f18688c.C().m();
            if (m10 == null) {
                return null;
            }
            Enumeration o10 = m10.o();
            while (o10.hasMoreElements()) {
                v vVar = (v) o10.nextElement();
                if (!m10.l(vVar).r()) {
                    hashSet.add(vVar.H());
                }
            }
            return hashSet;
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f18688c.l().l();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f18688c.u().l();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f18688c.z());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f18688c.q().G();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f18688c.s().l().H();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return ak.a.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f18688c.r().G();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(this.f18688c, u.W3.H());
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new oi.e(this.f18688c.w());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        gg.c C = this.f18688c.C().C();
        if (C != null) {
            byte[] D = C.D();
            int length = (D.length * 8) - C.d();
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 != length; i10++) {
                zArr[i10] = (D[i10 / 8] & (128 >>> (i10 % 8))) != 0;
            }
            return zArr;
        }
        return null;
    }

    @Override // ki.a
    public fh.c getSubjectX500Name() {
        return this.f18688c.w();
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f18688c.w().k("DER"));
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        try {
            return this.f18688c.C().k("DER");
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    @Override // ki.a
    public p0 getTBSCertificateNative() {
        return this.f18688c.C();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f18688c.D();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        hh.v m10;
        if (getVersion() != 3 || (m10 = this.f18688c.C().m()) == null) {
            return false;
        }
        Enumeration o10 = m10.o();
        while (o10.hasMoreElements()) {
            v vVar = (v) o10.nextElement();
            if (!vVar.s(u.U3) && !vVar.s(u.f12053i4) && !vVar.s(u.f12054j4) && !vVar.s(u.f12059o4) && !vVar.s(u.f12052h4) && !vVar.s(u.f12049e4) && !vVar.s(u.f12048d4) && !vVar.s(u.f12056l4) && !vVar.s(u.Y3) && !vVar.s(u.W3) && !vVar.s(u.f12051g4) && m10.l(vVar).r()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        Object gVar;
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d10);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d10);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d10);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(d10);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(d10);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(d10);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(d10);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d10);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d10);
        hh.v m10 = this.f18688c.C().m();
        if (m10 != null) {
            Enumeration o10 = m10.o();
            if (o10.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (o10.hasMoreElements()) {
                v vVar = (v) o10.nextElement();
                u l10 = m10.l(vVar);
                if (l10.n() != null) {
                    p pVar = new p(l10.n().F());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(l10.r());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(vVar.H());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                    if (vVar.s(u.Y3)) {
                        gVar = j.l(pVar.s());
                    } else if (vVar.s(u.U3)) {
                        gVar = hh.d0.l(pVar.s());
                    } else if (vVar.s(tg.c.f22322b)) {
                        gVar = new d(k1.M(pVar.s()));
                    } else if (vVar.s(tg.c.f22324d)) {
                        gVar = new tg.e(o.E(pVar.s()));
                    } else if (vVar.s(tg.c.f22331k)) {
                        gVar = new tg.g(o.E(pVar.s()));
                    } else {
                        stringBuffer.append(vVar.H());
                        stringBuffer.append(" value = ");
                        stringBuffer.append(eh.a.c(pVar.s()));
                        stringBuffer.append(d10);
                    }
                    stringBuffer.append(gVar);
                    stringBuffer.append(d10);
                }
                stringBuffer.append(d10);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CertificateImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final String str) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, final Provider provider) {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    Provider provider2 = provider;
                    return provider2 != null ? Signature.getInstance(str, provider2) : Signature.getInstance(str);
                }
            });
        } catch (NoSuchProviderException e10) {
            throw new NoSuchAlgorithmException("provider issue: " + e10.getMessage());
        }
    }
}
