package org.conscrypt;

import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.OpenSSLX509CertificateFactory;
/* loaded from: classes3.dex */
public final class OpenSSLX509Certificate extends X509Certificate {
    private static final long serialVersionUID = 1992239142393372128L;
    private final transient long mContext;
    private transient Integer mHashCode;
    private final Date notAfter;
    private final Date notBefore;

    public OpenSSLX509Certificate(long j10) {
        this.mContext = j10;
        this.notBefore = toDate(NativeCrypto.X509_get_notBefore(j10, this));
        this.notAfter = toDate(NativeCrypto.X509_get_notAfter(j10, this));
    }

    private OpenSSLX509Certificate(long j10, Date date, Date date2) {
        this.mContext = j10;
        this.notBefore = date;
        this.notAfter = date2;
    }

    private static Collection<List<?>> alternativeNameArrayToList(Object[][] objArr) {
        if (objArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object[] objArr2 : objArr) {
            arrayList.add(Collections.unmodifiableList(Arrays.asList(objArr2)));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static OpenSSLX509Certificate fromCertificate(Certificate certificate) {
        if (certificate instanceof OpenSSLX509Certificate) {
            return (OpenSSLX509Certificate) certificate;
        }
        if (!(certificate instanceof X509Certificate)) {
            throw new CertificateEncodingException("Only X.509 certificates are supported");
        }
        return fromX509Der(certificate.getEncoded());
    }

    public static List<OpenSSLX509Certificate> fromPkcs7DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] d2i_PKCS7_bio = NativeCrypto.d2i_PKCS7_bio(openSSLBIOInputStream.getBioContext(), 1);
                if (d2i_PKCS7_bio == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(d2i_PKCS7_bio.length);
                for (int i10 = 0; i10 < d2i_PKCS7_bio.length; i10++) {
                    if (d2i_PKCS7_bio[i10] != 0) {
                        arrayList.add(new OpenSSLX509Certificate(d2i_PKCS7_bio[i10]));
                    }
                }
                return arrayList;
            } catch (Exception e10) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e10);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    public static List<OpenSSLX509Certificate> fromPkcs7PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] PEM_read_bio_PKCS7 = NativeCrypto.PEM_read_bio_PKCS7(openSSLBIOInputStream.getBioContext(), 1);
                openSSLBIOInputStream.release();
                ArrayList arrayList = new ArrayList(PEM_read_bio_PKCS7.length);
                for (int i10 = 0; i10 < PEM_read_bio_PKCS7.length; i10++) {
                    if (PEM_read_bio_PKCS7[i10] != 0) {
                        arrayList.add(new OpenSSLX509Certificate(PEM_read_bio_PKCS7[i10]));
                    }
                }
                return arrayList;
            } catch (Exception e10) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e10);
            }
        } catch (Throwable th2) {
            openSSLBIOInputStream.release();
            throw th2;
        }
    }

    public static OpenSSLX509Certificate fromX509Der(byte[] bArr) {
        try {
            return new OpenSSLX509Certificate(NativeCrypto.d2i_X509(bArr));
        } catch (OpenSSLX509CertificateFactory.ParsingException e10) {
            throw new CertificateEncodingException(e10);
        }
    }

    public static OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long d2i_X509_bio = NativeCrypto.d2i_X509_bio(openSSLBIOInputStream.getBioContext());
                if (d2i_X509_bio != 0) {
                    return new OpenSSLX509Certificate(d2i_X509_bio);
                }
                return null;
            } catch (Exception e10) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e10);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    public static OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long PEM_read_bio_X509 = NativeCrypto.PEM_read_bio_X509(openSSLBIOInputStream.getBioContext());
                if (PEM_read_bio_X509 != 0) {
                    return new OpenSSLX509Certificate(PEM_read_bio_X509);
                }
                return null;
            } catch (Exception e10) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e10);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    private static Date toDate(long j10) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.set(14, 0);
        NativeCrypto.ASN1_TIME_to_Calendar(j10, calendar);
        return calendar.getTime();
    }

    private void verifyInternal(PublicKey publicKey, String str) {
        Signature signature = str == null ? Signature.getInstance(getSigAlgName()) : Signature.getInstance(getSigAlgName(), str);
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (signature.verify(getSignature())) {
            return;
        }
        throw new SignatureException("signature did not verify");
    }

    private void verifyOpenSSL(OpenSSLKey openSSLKey) {
        try {
            NativeCrypto.X509_verify(this.mContext, this, openSSLKey.getNativeRef());
        } catch (RuntimeException e10) {
            throw new CertificateException(e10);
        } catch (BadPaddingException unused) {
            throw new SignatureException();
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (getNotBefore().compareTo(date) > 0) {
            throw new CertificateNotYetValidException("Certificate not valid until " + getNotBefore().toString() + " (compared to " + date.toString() + ")");
        } else if (getNotAfter().compareTo(date) >= 0) {
        } else {
            throw new CertificateExpiredException("Certificate expired at " + getNotAfter().toString() + " (compared to " + date.toString() + ")");
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj instanceof OpenSSLX509Certificate) {
            OpenSSLX509Certificate openSSLX509Certificate = (OpenSSLX509Certificate) obj;
            return NativeCrypto.X509_cmp(this.mContext, this, openSSLX509Certificate.mContext, openSSLX509Certificate) == 0;
        }
        return super.equals(obj);
    }

    protected void finalize() {
        try {
            long j10 = this.mContext;
            if (j10 != 0) {
                NativeCrypto.X509_free(j10, this);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        if ((NativeCrypto.get_X509_ex_flags(this.mContext, this) & 16) == 0) {
            return -1;
        }
        int i10 = NativeCrypto.get_X509_ex_pathlen(this.mContext, this);
        if (i10 != -1) {
            return i10;
        }
        return Integer.MAX_VALUE;
    }

    public long getContext() {
        return this.mContext;
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_ext_oids(this.mContext, this, 1);
        if (strArr.length == 0 && NativeCrypto.get_X509_ext_oids(this.mContext, this, 0).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return NativeCrypto.i2d_X509(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public List<String> getExtendedKeyUsage() {
        String[] strArr = NativeCrypto.get_X509_ex_xkusage(this.mContext, this);
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return NativeCrypto.X509_get_ext_oid(this.mContext, this, str);
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getIssuerAlternativeNames() {
        return alternativeNameArrayToList(NativeCrypto.get_X509_GENERAL_NAME_stack(this.mContext, this, 2));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return NativeCrypto.get_X509_issuerUID(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        return new X500Principal(NativeCrypto.X509_get_issuer_name(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        boolean[] zArr = NativeCrypto.get_X509_ex_kusage(this.mContext, this);
        if (zArr == null) {
            return null;
        }
        if (zArr.length >= 9) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[9];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        return zArr2;
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_ext_oids(this.mContext, this, 0);
        if (strArr.length == 0 && NativeCrypto.get_X509_ext_oids(this.mContext, this, 1).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return (Date) this.notAfter.clone();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return (Date) this.notBefore.clone();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return new OpenSSLKey(NativeCrypto.X509_get_pubkey(this.mContext, this)).getPublicKey();
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            String str = NativeCrypto.get_X509_pubkey_oid(this.mContext, this);
            byte[] i2d_X509_PUBKEY = NativeCrypto.i2d_X509_PUBKEY(this.mContext, this);
            try {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i2d_X509_PUBKEY));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException unused2) {
                return new X509PublicKey(str, i2d_X509_PUBKEY);
            }
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return new BigInteger(NativeCrypto.X509_get_serialNumber(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        String sigAlgOID = getSigAlgOID();
        String oidToAlgorithmName = OidData.oidToAlgorithmName(sigAlgOID);
        if (oidToAlgorithmName != null) {
            return oidToAlgorithmName;
        }
        String oidToAlgorithmName2 = Platform.oidToAlgorithmName(sigAlgOID);
        return oidToAlgorithmName2 != null ? oidToAlgorithmName2 : sigAlgOID;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return NativeCrypto.get_X509_sig_alg_oid(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return NativeCrypto.get_X509_sig_alg_parameter(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return NativeCrypto.get_X509_signature(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public Collection<List<?>> getSubjectAlternativeNames() {
        return alternativeNameArrayToList(NativeCrypto.get_X509_GENERAL_NAME_stack(this.mContext, this, 1));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return NativeCrypto.get_X509_subjectUID(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        return new X500Principal(NativeCrypto.X509_get_subject_name(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        return NativeCrypto.get_X509_cert_info_enc(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return ((int) NativeCrypto.X509_get_version(this.mContext, this)) + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return (NativeCrypto.get_X509_ex_flags(this.mContext, this) & 512) != 0;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        Integer num = this.mHashCode;
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(super.hashCode());
        this.mHashCode = valueOf;
        return valueOf.intValue();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long create_BIO_OutputStream = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        try {
            NativeCrypto.X509_print_ex(create_BIO_OutputStream, this.mContext, this, 0L, 0L);
            return byteArrayOutputStream.toString();
        } finally {
            NativeCrypto.BIO_free_all(create_BIO_OutputStream);
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLKeyHolder) {
            verifyOpenSSL(((OpenSSLKeyHolder) publicKey).getOpenSSLKey());
        } else {
            verifyInternal(publicKey, null);
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        verifyInternal(publicKey, str);
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public void verify(PublicKey publicKey, Provider provider) {
        if ((publicKey instanceof OpenSSLKeyHolder) && (provider instanceof OpenSSLProvider)) {
            verifyOpenSSL(((OpenSSLKeyHolder) publicKey).getOpenSSLKey());
            return;
        }
        Signature signature = provider == null ? Signature.getInstance(getSigAlgName()) : Signature.getInstance(getSigAlgName(), provider);
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("signature did not verify");
        }
    }

    public OpenSSLX509Certificate withDeletedExtension(String str) {
        OpenSSLX509Certificate openSSLX509Certificate = new OpenSSLX509Certificate(NativeCrypto.X509_dup(this.mContext, this), this.notBefore, this.notAfter);
        NativeCrypto.X509_delete_ext(openSSLX509Certificate.getContext(), openSSLX509Certificate, str);
        return openSSLX509Certificate;
    }
}
