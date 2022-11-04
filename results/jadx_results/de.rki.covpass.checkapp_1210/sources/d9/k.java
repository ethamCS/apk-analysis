package d9;

import de.rki.covpass.sdk.cert.models.CovCertificate;
import de.rki.covpass.sdk.cert.models.Recovery;
import de.rki.covpass.sdk.cert.models.TestCert;
import de.rki.covpass.sdk.cert.models.Vaccination;
import dgca.verifier.app.engine.CertLogicEngine;
import dgca.verifier.app.engine.data.CertificateType;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Ld9/k;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "Ldgca/verifier/app/engine/data/CertificateType;", "a", "cert", BuildConfig.FLAVOR, "countryIsoCode", "j$/time/ZonedDateTime", "validationClock", "Ln9/d;", "validationType", BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/ValidationResult;", "b", "(Lde/rki/covpass/sdk/cert/models/CovCertificate;Ljava/lang/String;Lj$/time/ZonedDateTime;Ln9/d;Lxb/d;)Ljava/lang/Object;", "Ln9/c;", "rulesUseCase", "Ldgca/verifier/app/engine/CertLogicEngine;", "certLogicEngine", "Lj9/g;", "valueSetsRepository", "<init>", "(Ln9/c;Ldgca/verifier/app/engine/CertLogicEngine;Lj9/g;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private final n9.c f8434a;

    /* renamed from: b */
    private final CertLogicEngine f8435b;

    /* renamed from: c */
    private final j9.g f8436c;

    @zb.f(c = "de.rki.covpass.sdk.cert.CovPassRulesValidator", f = "CovPassRulesValidator.kt", l = {41, 49}, m = "validate")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        Object Y3;
        /* synthetic */ Object Z3;

        /* renamed from: b4 */
        int f8438b4;

        /* renamed from: x */
        Object f8439x;

        /* renamed from: y */
        Object f8440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            k.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.Z3 = obj;
            this.f8438b4 |= Integer.MIN_VALUE;
            return k.this.b(null, null, null, null, this);
        }
    }

    public k(n9.c cVar, CertLogicEngine certLogicEngine, j9.g gVar) {
        hc.t.e(cVar, "rulesUseCase");
        hc.t.e(certLogicEngine, "certLogicEngine");
        hc.t.e(gVar, "valueSetsRepository");
        this.f8434a = cVar;
        this.f8435b = certLogicEngine;
        this.f8436c = gVar;
    }

    private final CertificateType a(CovCertificate covCertificate) {
        de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
        if (d10 instanceof Vaccination) {
            return CertificateType.VACCINATION;
        }
        if (d10 instanceof TestCert) {
            return CertificateType.TEST;
        }
        if (!(d10 instanceof Recovery)) {
            throw new tb.p();
        }
        return CertificateType.RECOVERY;
    }

    public static /* synthetic */ Object c(k kVar, CovCertificate covCertificate, String str, ZonedDateTime zonedDateTime, n9.d dVar, xb.d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "de";
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            zonedDateTime = ZonedDateTime.now();
            hc.t.d(zonedDateTime, "now()");
        }
        ZonedDateTime zonedDateTime2 = zonedDateTime;
        if ((i10 & 8) != 0) {
            dVar = n9.d.RULES;
        }
        return kVar.b(covCertificate, str2, zonedDateTime2, dVar, dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112 A[LOOP:0: B:25:0x010c->B:27:0x0112, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(de.rki.covpass.sdk.cert.models.CovCertificate r20, java.lang.String r21, j$.time.ZonedDateTime r22, n9.d r23, xb.d<? super java.util.List<dgca.verifier.app.engine.ValidationResult>> r24) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.k.b(de.rki.covpass.sdk.cert.models.CovCertificate, java.lang.String, j$.time.ZonedDateTime, n9.d, xb.d):java.lang.Object");
    }
}
