package org.conscrypt;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes3.dex */
public final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("org.conscrypt.useEngineSocketByDefault", "true"));
    private static final Charset US_ASCII = Charset.forName("US-ASCII");

    /* loaded from: classes3.dex */
    static final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    /* loaded from: classes3.dex */
    enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);
        
        final int value;

        SessionType(int i10) {
            this.value = i10;
        }

        public static boolean isSupportedType(int i10) {
            return i10 == OPEN_SSL.value || i10 == OPEN_SSL_WITH_OCSP.value || i10 == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    public static int calculateOutNetBufSize(int i10) {
        return Math.min(16709, Math.min((int) MAX_ENCRYPTION_OVERHEAD_DIFF, i10) + 86);
    }

    public static String[] concat(String[]... strArr) {
        int i10 = 0;
        for (String[] strArr2 : strArr) {
            i10 += strArr2.length;
        }
        String[] strArr3 = new String[i10];
        int i11 = 0;
        for (String[] strArr4 : strArr) {
            System.arraycopy(strArr4, 0, strArr3, i11, strArr4.length);
            i11 += strArr4.length;
        }
        return strArr3;
    }

    public static String[] decodeProtocols(byte[] bArr) {
        String str;
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            byte b10 = bArr[i11];
            if (b10 < 0 || b10 > bArr.length - i11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Protocol has invalid length (");
                sb2.append((int) b10);
                sb2.append(" at position ");
                sb2.append(i11);
                sb2.append("): ");
                if (bArr.length < 50) {
                    str = Arrays.toString(bArr);
                } else {
                    str = bArr.length + " byte array";
                }
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            i12++;
            i11 += b10 + 1;
        }
        String[] strArr = new String[i12];
        int i13 = 0;
        while (i10 < bArr.length) {
            byte b11 = bArr[i10];
            int i14 = i13 + 1;
            strArr[i13] = b11 > 0 ? new String(bArr, i10 + 1, b11, US_ASCII) : BuildConfig.FLAVOR;
            i10 += b11 + 1;
            i13 = i14;
        }
        return strArr;
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) {
        return certificateFactory != null ? (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)) : OpenSSLX509Certificate.fromX509Der(bArr);
    }

    public static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i10 = 0; i10 < length; i10++) {
            x509CertificateArr[i10] = decodeX509Certificate(certificateFactory, bArr[i10]);
        }
        return x509CertificateArr;
    }

    public static byte[] encodeProtocols(String[] strArr) {
        if (strArr != null) {
            if (strArr.length == 0) {
                return EmptyArray.BYTE;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (strArr[i11] == null) {
                    throw new IllegalArgumentException("protocol[" + i11 + "] is null");
                }
                int length = strArr[i11].length();
                if (length == 0 || length > MAX_PROTOCOL_LENGTH) {
                    throw new IllegalArgumentException("protocol[" + i11 + "] has invalid length: " + length);
                }
                i10 += length + 1;
            }
            byte[] bArr = new byte[i10];
            int i12 = 0;
            for (String str : strArr) {
                int length2 = str.length();
                bArr[i12] = (byte) length2;
                i12++;
                int i13 = 0;
                while (i13 < length2) {
                    char charAt = str.charAt(i13);
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Protocol contains invalid character: " + charAt + "(protocol=" + str + ")");
                    }
                    bArr[i12] = (byte) charAt;
                    i13++;
                    i12++;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("protocols array must be non-null");
    }

    public static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) {
        byte[][] bArr = new byte[x509CertificateArr.length];
        for (int i10 = 0; i10 < x509CertificateArr.length; i10++) {
            bArr[i10] = x509CertificateArr[i10].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            return null;
        }
    }

    static String getClientKeyType(byte b10) {
        if (b10 != 1) {
            if (b10 == 64) {
                return KEY_TYPE_EC;
            }
            return null;
        }
        return KEY_TYPE_RSA;
    }

    static String getClientKeyTypeFromSignatureAlg(int i10) {
        int SSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i10);
        if (SSL_get_signature_algorithm_key_type != 6) {
            if (SSL_get_signature_algorithm_key_type == 408) {
                return KEY_TYPE_EC;
            }
            return null;
        }
        return KEY_TYPE_RSA;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int unsignedShort;
        int position = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(position))) {
            case 20:
            case 21:
            case 22:
            case 23:
                if (unsignedByte(byteBuffer.get(position + 1)) != 3 || (unsignedShort = unsignedShort(byteBuffer.getShort(position + 3)) + 5) <= 5) {
                    return -1;
                }
                return unsignedShort;
            default:
                return -1;
        }
    }

    public static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i10) {
        ByteBuffer byteBuffer = byteBufferArr[i10];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            int i11 = i10 + 1;
            ByteBuffer byteBuffer2 = byteBufferArr[i10];
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > allocate.remaining()) {
                byteBuffer2.limit(allocate.remaining() + position);
            }
            try {
                allocate.put(byteBuffer2);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                if (!allocate.hasRemaining()) {
                    allocate.flip();
                    return getEncryptedPacketLength(allocate);
                }
                i10 = i11;
            } catch (Throwable th2) {
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        }
    }

    public static String getServerX509KeyType(long j10) {
        String SSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j10);
        if (SSL_CIPHER_get_kx_name.equals(KEY_TYPE_RSA) || SSL_CIPHER_get_kx_name.equals("DHE_RSA") || SSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return KEY_TYPE_RSA;
        }
        if (!SSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    public static Set<String> getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        HashSet hashSet = new HashSet(bArr.length);
        for (byte b10 : bArr) {
            String clientKeyType = getClientKeyType(b10);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(iArr.length);
        for (int i10 : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i10);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length > 0 ? linkedHashSet : hashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    public static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i10 = 0; i10 < x509CertificateArr.length; i10++) {
                x509CertificateArr2[i10] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i10].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(sSLPeerUnverifiedException);
            throw sSLPeerUnverifiedException;
        } catch (javax.security.cert.CertificateException e11) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException2 = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException2.initCause(sSLPeerUnverifiedException2);
            throw sSLPeerUnverifiedException2;
        }
    }

    public static byte[] toProtocolBytes(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(US_ASCII);
    }

    public static String toProtocolString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, US_ASCII);
    }

    public static SSLException toSSLException(Throwable th2) {
        return th2 instanceof SSLException ? (SSLException) th2 : new SSLException(th2);
    }

    public static SSLHandshakeException toSSLHandshakeException(Throwable th2) {
        return th2 instanceof SSLHandshakeException ? (SSLHandshakeException) th2 : (SSLHandshakeException) new SSLHandshakeException(th2.getMessage()).initCause(th2);
    }

    private static short unsignedByte(byte b10) {
        return (short) (b10 & 255);
    }

    private static int unsignedShort(short s10) {
        return s10 & 65535;
    }
}
