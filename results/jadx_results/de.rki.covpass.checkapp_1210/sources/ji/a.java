package ji;

import java.security.Key;
import java.security.cert.X509Certificate;
/* loaded from: classes3.dex */
public class a extends ji.c {

    /* renamed from: d */
    private final ei.e f14364d;

    /* renamed from: e */
    private final b f14365e;

    /* renamed from: f */
    private final c f14366f;

    /* renamed from: g */
    private final d f14367g;

    /* renamed from: h */
    private final Key f14368h;

    /* renamed from: i */
    private final X509Certificate[] f14369i;

    /* renamed from: j */
    private final AbstractC0209a f14370j;

    /* renamed from: ji.a$a */
    /* loaded from: classes3.dex */
    public interface AbstractC0209a {
        boolean a(X509Certificate[] x509CertificateArr);
    }

    /* loaded from: classes3.dex */
    public enum b {
        AES256_CCM,
        AES256_KWP
    }

    /* loaded from: classes3.dex */
    public enum c {
        HmacSHA512,
        HmacSHA3_512
    }

    /* loaded from: classes3.dex */
    public enum d {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    public AbstractC0209a c() {
        return this.f14370j;
    }

    public X509Certificate[] d() {
        return this.f14369i;
    }

    public b e() {
        return this.f14365e;
    }

    public c f() {
        return this.f14366f;
    }

    public ei.e g() {
        return this.f14364d;
    }

    public d h() {
        return this.f14367g;
    }

    public Key i() {
        return this.f14368h;
    }
}
