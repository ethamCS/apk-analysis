package d9;

import de.rki.covpass.logging.Lumber;
import de.rki.covpass.sdk.cert.models.DscList;
import de.rki.covpass.sdk.cert.models.DscListEntry;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import timber.log.a;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Lde/rki/covpass/sdk/cert/models/DscList;", BuildConfig.FLAVOR, "Ld9/v;", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p {
    public static final List<v> a(DscList dscList) {
        Object X;
        hc.t.e(dscList, "<this>");
        List<DscListEntry> c10 = dscList.c();
        ArrayList arrayList = new ArrayList();
        for (DscListEntry dscListEntry : c10) {
            String c11 = dscListEntry.c();
            X = c0.X(e9.c.c("-----BEGIN CERTIFICATE-----\n" + c11 + "\n-----END CERTIFICATE-----"));
            X509Certificate x509Certificate = (X509Certificate) X;
            v vVar = null;
            if (x509Certificate != null) {
                vVar = new v(dscListEntry.a(), dscListEntry.b(), x509Certificate);
            } else if (Lumber.Companion.getEnabled()) {
                a.b bVar = timber.log.a.f22457a;
                String b10 = dscListEntry.b();
                bVar.w(null, "DSC list contains invalid X509Certificate for kid " + b10, new Object[0]);
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }
}
