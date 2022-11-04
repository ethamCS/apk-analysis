package de.rki.covpass.sdk.cert.models;

import bf.y;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lde/rki/covpass/sdk/cert/models/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getId", "()Ljava/lang/String;", "id", "a", "idWithoutPrefix", "Lde/rki/covpass/sdk/cert/models/f;", "getType", "()Lde/rki/covpass/sdk/cert/models/f;", "type", "Lde/rki/covpass/sdk/cert/models/Recovery;", "Lde/rki/covpass/sdk/cert/models/TestCert;", "Lde/rki/covpass/sdk/cert/models/Vaccination;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface e {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(e eVar) {
            String p02;
            p02 = y.p0(eVar.getId(), "URN:UVCI:");
            return p02;
        }
    }

    String a();

    String getId();

    f getType();
}
