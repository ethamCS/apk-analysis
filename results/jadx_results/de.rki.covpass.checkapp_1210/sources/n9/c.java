package n9;

import dgca.verifier.app.engine.data.CertificateType;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ln9/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "acceptanceCountryIsoCode", "issuanceCountryIsoCode", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", "j$/time/ZonedDateTime", "validationClock", "Ln9/d;", "validationType", "region", BuildConfig.FLAVOR, "Lj9/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/CertificateType;Lj$/time/ZonedDateTime;Ln9/d;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface c {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(c cVar, String str, String str2, CertificateType certificateType, ZonedDateTime zonedDateTime, d dVar, String str3, xb.d dVar2, int i10, Object obj) {
            if (obj == null) {
                return cVar.a(str, str2, certificateType, zonedDateTime, (i10 & 16) != 0 ? d.RULES : dVar, (i10 & 32) != 0 ? null : str3, dVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object a(String str, String str2, CertificateType certificateType, ZonedDateTime zonedDateTime, d dVar, String str3, xb.d<? super List<j9.d>> dVar2);
}
