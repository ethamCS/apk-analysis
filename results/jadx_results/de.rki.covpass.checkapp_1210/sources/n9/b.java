package n9;

import bf.y;
import hc.t;
import j9.e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
import zb.f;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Ln9/b;", "Ln9/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "acceptanceCountryIsoCode", "issuanceCountryIsoCode", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", "j$/time/ZonedDateTime", "validationClock", "Ln9/d;", "validationType", "region", BuildConfig.FLAVOR, "Lj9/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/CertificateType;Lj$/time/ZonedDateTime;Ln9/d;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "Lj9/e;", "covPassRulesRepository", "<init>", "(Lj9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    private final e f16890a;

    @f(c = "de.rki.covpass.sdk.rules.domain.rules.CovPassGetRulesUseCase", f = "CovPassGetRulesUseCase.kt", l = {39, 63}, m = "invoke")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        /* synthetic */ Object Y3;

        /* renamed from: a4 */
        int f16891a4;

        /* renamed from: x */
        Object f16892x;

        /* renamed from: y */
        Object f16893y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.Y3 = obj;
            this.f16891a4 |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, null, null, null, this);
        }
    }

    public b(e eVar) {
        t.e(eVar, "covPassRulesRepository");
        this.f16890a = eVar;
    }

    private final Integer b(String str) {
        List x02;
        List<String> q02;
        int i10 = 1;
        try {
            int i11 = 0;
            x02 = y.x0(str, new char[]{'.'}, false, 0, 6, null);
            q02 = c0.q0(x02);
            for (String str2 : q02) {
                i11 += Integer.parseInt(str2) * i10;
                i10 *= 100;
            }
            return Integer.valueOf(i11);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b2 A[SYNTHETIC] */
    @Override // n9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r18, java.lang.String r19, dgca.verifier.app.engine.data.CertificateType r20, j$.time.ZonedDateTime r21, n9.d r22, java.lang.String r23, xb.d<? super java.util.List<j9.d>> r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.a(java.lang.String, java.lang.String, dgca.verifier.app.engine.data.CertificateType, j$.time.ZonedDateTime, n9.d, java.lang.String, xb.d):java.lang.Object");
    }
}
