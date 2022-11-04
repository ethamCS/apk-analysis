package d9;

import de.rki.covpass.sdk.cert.models.CovCertificate;
import de.rki.covpass.sdk.cert.models.TestCert;
import de.rki.covpass.sdk.cert.models.Vaccination;
import hc.k0;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializersKt;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ub.c0;
import ub.y0;
import ub.z0;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000f\u001a\u00020\b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006!"}, d2 = {"Ld9/f;", BuildConfig.FLAVOR, "Le9/b;", "kid", BuildConfig.FLAVOR, "Ld9/v;", "f", "cert", BuildConfig.FLAVOR, "allowExpiredCertificates", "Ltb/e0;", "b", "Ljava/security/cert/X509Certificate;", "Lde/rki/covpass/sdk/cert/models/e;", "dgcEntry", "a", BuildConfig.FLAVOR, "trusted", "g", "Lde/rki/covpass/sdk/cert/models/b;", "cwt", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "d", "(Lde/rki/covpass/sdk/cert/models/b;Ljava/security/cert/X509Certificate;)Lde/rki/covpass/sdk/cert/models/CovCertificate;", "e", "(Lde/rki/covpass/sdk/cert/models/b;)Lde/rki/covpass/sdk/cert/models/CovCertificate;", "La/u;", "cose", "c", "Lgf/b;", "cbor", "<init>", "(Ljava/lang/Iterable;Lgf/b;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {
    private static final a Companion = new a(null);

    /* renamed from: a */
    private final gf.b f8402a;

    /* renamed from: b */
    private g f8403b;

    /* renamed from: c */
    private final Set<String> f8404c;

    /* renamed from: d */
    private final Set<String> f8405d;

    /* renamed from: e */
    private final Set<String> f8406e;

    /* renamed from: f */
    private final Set<String> f8407f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Ld9/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "DIGITAL_GREEN_CERTIFICATE", "I", "HEALTH_CERTIFICATE_CLAIM", "SIGNATURE_ALGORITHM_ECDSA", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(Iterable<v> iterable, gf.b bVar) {
        Set<String> e10;
        Set<String> e11;
        Set<String> e12;
        Set h10;
        Set<String> h11;
        hc.t.e(iterable, "trusted");
        hc.t.e(bVar, "cbor");
        this.f8402a = bVar;
        this.f8403b = new g(iterable);
        e10 = y0.e("1.3.6.1.4.1.1847.2021.1.2", "1.3.6.1.4.1.0.1847.2021.1.2");
        this.f8404c = e10;
        e11 = y0.e("1.3.6.1.4.1.1847.2021.1.1", "1.3.6.1.4.1.0.1847.2021.1.1");
        this.f8405d = e11;
        e12 = y0.e("1.3.6.1.4.1.1847.2021.1.3", "1.3.6.1.4.1.0.1847.2021.1.3");
        this.f8406e = e12;
        h10 = z0.h(e10, e11);
        h11 = z0.h(h10, e12);
        this.f8407f = h11;
    }

    private final boolean a(X509Certificate x509Certificate, de.rki.covpass.sdk.cert.models.e eVar) {
        Set set;
        Set a02;
        Set J0;
        List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        if (extendedKeyUsage == null || extendedKeyUsage.isEmpty()) {
            set = y0.b();
        } else {
            List<String> extendedKeyUsage2 = x509Certificate.getExtendedKeyUsage();
            hc.t.d(extendedKeyUsage2, "extendedKeyUsage");
            J0 = c0.J0(extendedKeyUsage2);
            set = c0.a0(J0, this.f8407f);
        }
        if (!set.isEmpty()) {
            a02 = c0.a0(eVar instanceof Vaccination ? this.f8404c : eVar instanceof TestCert ? this.f8405d : this.f8406e, set);
            if (!(!a02.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    private final void b(v vVar, boolean z10) {
        try {
            vVar.a().checkValidity();
        } catch (CertificateExpiredException e10) {
            if (!z10) {
                throw e10;
            }
        }
    }

    private final List<v> f(e9.b bVar) {
        List<v> h10;
        List<v> list = this.f8403b.a().get(bVar);
        if (list == null) {
            h10 = ub.u.h();
            return h10;
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        r7 = ub.m.W(r7, new nc.g(0, 7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final de.rki.covpass.sdk.cert.models.CovCertificate c(a.u r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.f.c(a.u, boolean):de.rki.covpass.sdk.cert.models.CovCertificate");
    }

    public final CovCertificate d(de.rki.covpass.sdk.cert.models.b bVar, X509Certificate x509Certificate) {
        CovCertificate a10;
        hc.t.e(bVar, "cwt");
        hc.t.e(x509Certificate, "cert");
        CovCertificate e10 = e(bVar);
        if (a(x509Certificate, e10.d())) {
            a10 = e10.a((r24 & 1) != 0 ? e10.f8620a : bVar.a(), (r24 & 2) != 0 ? e10.f8621b : bVar.c(), (r24 & 4) != 0 ? e10.f8622c : bVar.d(), (r24 & 8) != 0 ? e10.f8623d : null, (r24 & 16) != 0 ? e10.f8624e : null, (r24 & 32) != 0 ? e10.f8625f : null, (r24 & 64) != 0 ? e10.f8626g : null, (r24 & 128) != 0 ? e10.f8627h : null, (r24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? e10.f8628i : null, (r24 & 512) != 0 ? e10.f8629j : null, (r24 & 1024) != 0 ? e10.f8630k : null);
            return a10;
        }
        throw new t(null, 1, null);
    }

    public final CovCertificate e(de.rki.covpass.sdk.cert.models.b bVar) {
        hc.t.e(bVar, "cwt");
        gf.b bVar2 = this.f8402a;
        t7.o j12 = bVar.b().j1(-260).j1(1);
        hc.t.d(j12, "cwt.rawCbor[HEALTH_CERTI…IGITAL_GREEN_CERTIFICATE]");
        byte[] I = z9.b.a(j12).I();
        hc.t.d(I, "cwt.rawCbor[HEALTH_CERTI…Strings().EncodeToBytes()");
        return (CovCertificate) bVar2.e(SerializersKt.serializer(bVar2.a(), k0.j(CovCertificate.class)), I);
    }

    public final void g(Iterable<v> iterable) {
        hc.t.e(iterable, "trusted");
        this.f8403b = new g(iterable);
    }
}
