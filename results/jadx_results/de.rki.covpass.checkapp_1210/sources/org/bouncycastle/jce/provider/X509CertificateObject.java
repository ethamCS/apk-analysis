package org.bouncycastle.jce.provider;

import ak.a;
import ak.g;
import ak.q;
import bk.f;
import fh.c;
import gg.a0;
import gg.d0;
import gg.g0;
import gg.k1;
import gg.o;
import gg.p;
import gg.r1;
import gg.v;
import gh.e;
import hh.b;
import hh.j;
import hh.u;
import hh.w;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
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
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
import tg.d;
/* loaded from: classes3.dex */
public class X509CertificateObject extends X509Certificate implements n {
    private n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private j basicConstraints;

    /* renamed from: c */
    private hh.n f18702c;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;

    public X509CertificateObject(hh.n nVar) {
        this.f18702c = nVar;
        try {
            byte[] extensionBytes = getExtensionBytes("2.5.29.19");
            if (extensionBytes != null) {
                this.basicConstraints = j.l(a0.u(extensionBytes));
            }
            try {
                byte[] extensionBytes2 = getExtensionBytes("2.5.29.15");
                if (extensionBytes2 == null) {
                    this.keyUsage = null;
                    return;
                }
                k1 M = k1.M(a0.u(extensionBytes2));
                byte[] D = M.D();
                int length = (D.length * 8) - M.d();
                int i10 = 9;
                if (length >= 9) {
                    i10 = length;
                }
                this.keyUsage = new boolean[i10];
                for (int i11 = 0; i11 != length; i11++) {
                    this.keyUsage[i11] = (D[i11 / 8] & (128 >>> (i11 % 8))) != 0;
                }
            } catch (Exception e10) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e10);
            }
        } catch (Exception e11) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e11);
        }
    }

    private int calculateHashCode() {
        try {
            byte[] encoded = getEncoded();
            int i10 = 0;
            for (int i11 = 1; i11 < encoded.length; i11++) {
                i10 += encoded[i11] * i11;
            }
            return i10;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    private void checkSignature(PublicKey publicKey, Signature signature) {
        if (isAlgIdEqual(this.f18702c.s(), this.f18702c.C().s())) {
            X509SignatureUtil.setSignatureParameters(signature, this.f18702c.s().o());
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
            return;
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private static Collection getAlternativeNames(byte[] bArr) {
        String c10;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration H = d0.F(bArr).H();
            while (H.hasMoreElements()) {
                w n10 = w.n(H.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(g.e(n10.q()));
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
                        c10 = c.l(e.V, n10.o()).toString();
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

    private byte[] getExtensionBytes(String str) {
        u l10;
        hh.v m10 = this.f18702c.C().m();
        if (m10 == null || (l10 = m10.l(new v(str))) == null) {
            return null;
        }
        return l10.n().F();
    }

    private boolean isAlgIdEqual(b bVar, b bVar2) {
        if (!bVar.l().s(bVar2.l())) {
            return false;
        }
        return bVar.o() == null ? bVar2.o() == null || bVar2.o().equals(r1.f10880d) : bVar2.o() == null ? bVar.o() == null || bVar.o().equals(r1.f10880d) : bVar.o().equals(bVar2.o());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f18702c.l().n());
        } else if (date.getTime() >= getNotBefore().getTime()) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f18702c.u().n());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return a.c(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // qi.n
    public gg.g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
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
            hh.v m10 = this.f18702c.C().m();
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

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        try {
            return this.f18702c.k("DER");
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        byte[] extensionBytes = getExtensionBytes("2.5.29.37");
        if (extensionBytes != null) {
            try {
                d0 d0Var = (d0) new p(extensionBytes).s();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 != d0Var.size(); i10++) {
                    arrayList.add(((v) d0Var.G(i10)).H());
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception unused) {
                throw new CertificateParsingException("error processing extended key usage extension");
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u l10;
        hh.v m10 = this.f18702c.C().m();
        if (m10 == null || (l10 = m10.l(new v(str))) == null) {
            return null;
        }
        try {
            return l10.n().getEncoded();
        } catch (Exception e10) {
            throw new IllegalStateException("error parsing " + e10.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(u.X3.H()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return new oi.e(this.f18702c.o());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        gg.c q10 = this.f18702c.C().q();
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f18702c.o().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            hh.v m10 = this.f18702c.C().m();
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
        return this.f18702c.l().l();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f18702c.u().l();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f18702c.z());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f18702c.q().G();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i10 = 0; i10 != providers.length; i10++) {
            Provider provider2 = providers[i10];
            String property2 = provider2.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f18702c.s().l().H();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f18702c.s().o() != null) {
            try {
                return this.f18702c.s().o().b().k("DER");
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f18702c.r().G();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return getAlternativeNames(getExtensionBytes(u.W3.H()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new oi.e(this.f18702c.w());
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        gg.c C = this.f18702c.C().C();
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

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f18702c.w().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        try {
            return this.f18702c.C().k("DER");
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f18702c.D();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        hh.v m10;
        if (getVersion() != 3 || (m10 = this.f18702c.C().m()) == null) {
            return false;
        }
        Enumeration o10 = m10.o();
        while (o10.hasMoreElements()) {
            v vVar = (v) o10.nextElement();
            String H = vVar.H();
            if (!H.equals(RFC3280CertPathUtilities.KEY_USAGE) && !H.equals(RFC3280CertPathUtilities.CERTIFICATE_POLICIES) && !H.equals(RFC3280CertPathUtilities.POLICY_MAPPINGS) && !H.equals(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY) && !H.equals(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS) && !H.equals(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT) && !H.equals(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR) && !H.equals(RFC3280CertPathUtilities.POLICY_CONSTRAINTS) && !H.equals(RFC3280CertPathUtilities.BASIC_CONSTRAINTS) && !H.equals(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME) && !H.equals(RFC3280CertPathUtilities.NAME_CONSTRAINTS) && m10.l(vVar).r()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = calculateHashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, gg.g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(f.e(signature, 0, 20)));
        stringBuffer.append(d10);
        int i10 = 20;
        while (i10 < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i10 < length ? new String(f.e(signature, i10, 20)) : new String(f.e(signature, i10, signature.length - i10)));
            stringBuffer.append(d10);
            i10 += 20;
        }
        hh.v m10 = this.f18702c.C().m();
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
                        gVar = new d((k1) pVar.s());
                    } else if (vVar.s(tg.c.f22324d)) {
                        gVar = new tg.e((o) pVar.s());
                    } else if (vVar.s(tg.c.f22331k)) {
                        gVar = new tg.g((o) pVar.s());
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
        Signature signature;
        String signatureName = X509SignatureUtil.getSignatureName(this.f18702c.s());
        try {
            signature = Signature.getInstance(signatureName, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(signatureName);
        }
        checkSignature(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) {
        String signatureName = X509SignatureUtil.getSignatureName(this.f18702c.s());
        checkSignature(publicKey, str != null ? Signature.getInstance(signatureName, str) : Signature.getInstance(signatureName));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) {
        String signatureName = X509SignatureUtil.getSignatureName(this.f18702c.s());
        checkSignature(publicKey, provider != null ? Signature.getInstance(signatureName, provider) : Signature.getInstance(signatureName));
    }
}
