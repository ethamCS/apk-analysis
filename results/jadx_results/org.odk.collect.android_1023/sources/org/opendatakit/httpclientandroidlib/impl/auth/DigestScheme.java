package org.opendatakit.httpclientandroidlib.impl.auth;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import me.regexp.RECharacter;
import org.apache.james.mime4j.field.ContentTypeField;
import org.kxml2.wap.Wbxml;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.utilities.EncryptionUtils;
import org.opendatakit.httpclientandroidlib.Header;
import org.opendatakit.httpclientandroidlib.HttpEntity;
import org.opendatakit.httpclientandroidlib.HttpEntityEnclosingRequest;
import org.opendatakit.httpclientandroidlib.HttpRequest;
import org.opendatakit.httpclientandroidlib.annotation.NotThreadSafe;
import org.opendatakit.httpclientandroidlib.auth.AuthenticationException;
import org.opendatakit.httpclientandroidlib.auth.ChallengeState;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.auth.MalformedChallengeException;
import org.opendatakit.httpclientandroidlib.auth.params.AuthParams;
import org.opendatakit.httpclientandroidlib.message.BasicHeaderValueFormatter;
import org.opendatakit.httpclientandroidlib.message.BasicNameValuePair;
import org.opendatakit.httpclientandroidlib.message.BufferedHeader;
import org.opendatakit.httpclientandroidlib.protocol.BasicHttpContext;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
import org.opendatakit.httpclientandroidlib.util.CharArrayBuffer;
import org.opendatakit.httpclientandroidlib.util.EncodingUtils;
@NotThreadSafe
/* loaded from: classes.dex */
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private String a1;
    private String a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    public DigestScheme(ChallengeState challengeState) {
        super(challengeState);
        this.complete = false;
    }

    public DigestScheme() {
        this(null);
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.auth.AuthSchemeBase, org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        this.complete = true;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public boolean isComplete() {
        String s = getParameter("stale");
        if ("true".equalsIgnoreCase(s)) {
            return false;
        }
        return this.complete;
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public String getSchemeName() {
        return "digest";
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    public void overrideParamter(String name, String value) {
        getParameters().put(name, value);
    }

    @Override // org.opendatakit.httpclientandroidlib.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException {
        return authenticate(credentials, request, new BasicHttpContext());
    }

    @Override // org.opendatakit.httpclientandroidlib.impl.auth.AuthSchemeBase, org.opendatakit.httpclientandroidlib.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest request, HttpContext context) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        }
        if (getParameter("nonce") == null) {
            throw new AuthenticationException("missing nonce in challenge");
        }
        getParameters().put("methodname", request.getRequestLine().getMethod());
        getParameters().put("uri", request.getRequestLine().getUri());
        String charset = getParameter(ContentTypeField.PARAM_CHARSET);
        if (charset == null) {
            String charset2 = AuthParams.getCredentialCharset(request.getParams());
            getParameters().put(ContentTypeField.PARAM_CHARSET, charset2);
        }
        return createDigestHeader(credentials, request);
    }

    private static MessageDigest createMessageDigest(String digAlg) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(digAlg);
        } catch (Exception e) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + digAlg);
        }
    }

    private Header createDigestHeader(Credentials credentials, HttpRequest request) throws AuthenticationException {
        String digestValue;
        String uri = getParameter("uri");
        String realm = getParameter("realm");
        String nonce = getParameter("nonce");
        String opaque = getParameter("opaque");
        String method = getParameter("methodname");
        String algorithm = getParameter("algorithm");
        Set<String> qopset = new HashSet<>(8);
        int qop = -1;
        String qoplist = getParameter("qop");
        if (qoplist != null) {
            StringTokenizer tok = new StringTokenizer(qoplist, ",");
            while (tok.hasMoreTokens()) {
                String variant = tok.nextToken().trim();
                qopset.add(variant.toLowerCase(Locale.US));
            }
            if ((request instanceof HttpEntityEnclosingRequest) && qopset.contains("auth-int")) {
                qop = 1;
            } else if (qopset.contains(PreferencesActivity.KEY_AUTH)) {
                qop = 2;
            }
        } else {
            qop = 0;
        }
        if (qop == -1) {
            throw new AuthenticationException("None of the qop methods is supported: " + qoplist);
        }
        if (algorithm == null) {
            algorithm = "MD5";
        }
        String charset = getParameter(ContentTypeField.PARAM_CHARSET);
        if (charset == null) {
            charset = "ISO-8859-1";
        }
        String digAlg = algorithm;
        if (digAlg.equalsIgnoreCase("MD5-sess")) {
            digAlg = "MD5";
        }
        try {
            MessageDigest digester = createMessageDigest(digAlg);
            String uname = credentials.getUserPrincipal().getName();
            String pwd = credentials.getPassword();
            if (nonce.equals(this.lastNonce)) {
                this.nounceCount++;
            } else {
                this.nounceCount = 1L;
                this.cnonce = null;
                this.lastNonce = nonce;
            }
            StringBuilder sb = new StringBuilder((int) EncryptionUtils.SYMMETRIC_KEY_LENGTH);
            Formatter formatter = new Formatter(sb, Locale.US);
            formatter.format("%08x", Long.valueOf(this.nounceCount));
            String nc = sb.toString();
            if (this.cnonce == null) {
                this.cnonce = createCnonce();
            }
            this.a1 = null;
            this.a2 = null;
            if (algorithm.equalsIgnoreCase("MD5-sess")) {
                sb.setLength(0);
                sb.append(uname).append(':').append(realm).append(':').append(pwd);
                String checksum = encode(digester.digest(EncodingUtils.getBytes(sb.toString(), charset)));
                sb.setLength(0);
                sb.append(checksum).append(':').append(nonce).append(':').append(this.cnonce);
                this.a1 = sb.toString();
            } else {
                sb.setLength(0);
                sb.append(uname).append(':').append(realm).append(':').append(pwd);
                this.a1 = sb.toString();
            }
            String hasha1 = encode(digester.digest(EncodingUtils.getBytes(this.a1, charset)));
            if (qop == 2) {
                this.a2 = method + ':' + uri;
            } else if (qop == 1) {
                HttpEntity entity = null;
                if (request instanceof HttpEntityEnclosingRequest) {
                    entity = ((HttpEntityEnclosingRequest) request).getEntity();
                }
                if (entity != null && !entity.isRepeatable()) {
                    if (qopset.contains(PreferencesActivity.KEY_AUTH)) {
                        qop = 2;
                        this.a2 = method + ':' + uri;
                    } else {
                        throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                    }
                } else {
                    HttpEntityDigester entityDigester = new HttpEntityDigester(digester);
                    if (entity != null) {
                        try {
                            entity.writeTo(entityDigester);
                        } catch (IOException ex) {
                            throw new AuthenticationException("I/O error reading entity content", ex);
                        }
                    }
                    entityDigester.close();
                    this.a2 = method + ':' + uri + ':' + encode(entityDigester.getDigest());
                }
            } else {
                this.a2 = method + ':' + uri;
            }
            String hasha2 = encode(digester.digest(EncodingUtils.getBytes(this.a2, charset)));
            if (qop == 0) {
                sb.setLength(0);
                sb.append(hasha1).append(':').append(nonce).append(':').append(hasha2);
                digestValue = sb.toString();
            } else {
                sb.setLength(0);
                sb.append(hasha1).append(':').append(nonce).append(':').append(nc).append(':').append(this.cnonce).append(':').append(qop == 1 ? "auth-int" : PreferencesActivity.KEY_AUTH).append(':').append(hasha2);
                digestValue = sb.toString();
            }
            String digest = encode(digester.digest(EncodingUtils.getAsciiBytes(digestValue)));
            CharArrayBuffer buffer = new CharArrayBuffer(Wbxml.EXT_T_0);
            if (isProxy()) {
                buffer.append("Proxy-Authorization");
            } else {
                buffer.append("Authorization");
            }
            buffer.append(": Digest ");
            List<BasicNameValuePair> params = new ArrayList<>(20);
            params.add(new BasicNameValuePair("username", uname));
            params.add(new BasicNameValuePair("realm", realm));
            params.add(new BasicNameValuePair("nonce", nonce));
            params.add(new BasicNameValuePair("uri", uri));
            params.add(new BasicNameValuePair("response", digest));
            if (qop != 0) {
                params.add(new BasicNameValuePair("qop", qop == 1 ? "auth-int" : PreferencesActivity.KEY_AUTH));
                params.add(new BasicNameValuePair("nc", nc));
                params.add(new BasicNameValuePair("cnonce", this.cnonce));
            }
            if (algorithm != null) {
                params.add(new BasicNameValuePair("algorithm", algorithm));
            }
            if (opaque != null) {
                params.add(new BasicNameValuePair("opaque", opaque));
            }
            for (int i = 0; i < params.size(); i++) {
                BasicNameValuePair param = params.get(i);
                if (i > 0) {
                    buffer.append(", ");
                }
                boolean noQuotes = "nc".equals(param.getName()) || "qop".equals(param.getName());
                BasicHeaderValueFormatter.DEFAULT.formatNameValuePair(buffer, param, !noQuotes);
            }
            return new BufferedHeader(buffer);
        } catch (UnsupportedDigestAlgorithmException e) {
            throw new AuthenticationException("Unsuppported digest algorithm: " + digAlg);
        }
    }

    String getCnonce() {
        return this.cnonce;
    }

    String getA1() {
        return this.a1;
    }

    String getA2() {
        return this.a2;
    }

    static String encode(byte[] binaryData) {
        int n = binaryData.length;
        char[] buffer = new char[n * 2];
        for (int i = 0; i < n; i++) {
            int low = binaryData[i] & RECharacter.CONTROL;
            int high = (binaryData[i] & 240) >> 4;
            buffer[i * 2] = HEXADECIMAL[high];
            buffer[(i * 2) + 1] = HEXADECIMAL[low];
        }
        return new String(buffer);
    }

    public static String createCnonce() {
        SecureRandom rnd = new SecureRandom();
        byte[] tmp = new byte[8];
        rnd.nextBytes(tmp);
        return encode(tmp);
    }
}
