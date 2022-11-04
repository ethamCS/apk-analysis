package e8;

import android.content.Context;
import bf.x;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Le8/a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "revocationExportData", BuildConfig.FLAVOR, "base64EncodedCode", "base64EncodedQrCode", "a", "(Landroid/content/Context;Lde/rki/covpass/sdk/cert/models/ExpertModeData;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f9510a = new a();

    private a() {
    }

    public final String a(Context context, ExpertModeData expertModeData, String str, String str2) {
        String d10;
        String E;
        String c10;
        String E2;
        String E3;
        String E4;
        t.e(context, "context");
        t.e(expertModeData, "revocationExportData");
        t.e(str, "base64EncodedCode");
        t.e(str2, "base64EncodedQrCode");
        String a10 = z9.a.a(context, "TechnicalDetailsTemplate.svg");
        d10 = b.d(str, 55, 37, 21);
        E = x.E(a10, "$code", d10, false, 4, null);
        c10 = b.c(expertModeData.c());
        E2 = x.E(E, "$co", c10, false, 4, null);
        E3 = x.E(E2, "$te", expertModeData.e(), false, 4, null);
        E4 = x.E(E3, "$qr", str2, false, 4, null);
        return E4;
    }
}
