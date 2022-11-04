package f8;

import de.rki.covpass.sdk.cert.models.CovCertificate;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s4.v;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH&¨\u0006\r"}, d2 = {"Lf8/e;", "Ls4/v;", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "certificate", "Ltb/e0;", "q", BuildConfig.FLAVOR, "isTechnical", "n", "j$/time/ZonedDateTime", "sampleCollection", "o", "t", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface e extends v {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(e eVar, boolean z10, CovCertificate covCertificate, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    covCertificate = null;
                }
                eVar.n(z10, covCertificate);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onValidationFailure");
        }
    }

    void n(boolean z10, CovCertificate covCertificate);

    void o(CovCertificate covCertificate, ZonedDateTime zonedDateTime);

    void q(CovCertificate covCertificate);

    void t(CovCertificate covCertificate, ZonedDateTime zonedDateTime);
}
