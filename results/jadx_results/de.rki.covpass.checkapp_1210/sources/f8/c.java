package f8;

import de.rki.covpass.sdk.cert.models.CovCertificate;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s4.v;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&J\u001e\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lf8/c;", BuildConfig.FLAVOR, "Lf8/j;", "firstCertData", "secondCertData", "Ltb/e0;", "O", "boosterCertData", "w", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "certificate", "B", "j$/time/ZonedDateTime", "sampleCollection", "J", "i", BuildConfig.FLAVOR, "is2gOn", "R", "K", "P", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface c extends v {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(c cVar, CovCertificate covCertificate, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    covCertificate = null;
                }
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                cVar.K(covCertificate, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: on3gFailure");
        }

        public static /* synthetic */ void b(c cVar, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                cVar.R(z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: on3gTechnicalFailure");
        }
    }

    void B(CovCertificate covCertificate);

    void J(CovCertificate covCertificate, ZonedDateTime zonedDateTime);

    void K(CovCertificate covCertificate, boolean z10);

    void O(j jVar, j jVar2);

    void P();

    void R(boolean z10);

    void i(CovCertificate covCertificate, ZonedDateTime zonedDateTime);

    void w(j jVar);
}
