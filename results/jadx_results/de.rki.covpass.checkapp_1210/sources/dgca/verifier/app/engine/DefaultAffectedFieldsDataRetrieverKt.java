package dgca.verifier.app.engine;

import dgca.verifier.app.engine.data.CertificateType;
import kotlin.Metadata;
import tb.p;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/CertificateType;", org.conscrypt.BuildConfig.FLAVOR, "key", "b", "covpass-dgc-certlogic_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultAffectedFieldsDataRetrieverKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8948a;

        static {
            int[] iArr = new int[CertificateType.values().length];
            iArr[CertificateType.TEST.ordinal()] = 1;
            iArr[CertificateType.RECOVERY.ordinal()] = 2;
            iArr[CertificateType.VACCINATION.ordinal()] = 3;
            f8948a = iArr;
        }
    }

    public static final String b(CertificateType certificateType, String str) {
        String str2;
        int i10 = WhenMappings.f8948a[certificateType.ordinal()];
        if (i10 == 1) {
            str2 = "test_entry";
        } else if (i10 == 2) {
            str2 = "recovery_entry";
        } else if (i10 != 3) {
            throw new p();
        } else {
            str2 = "vaccination_entry";
        }
        return "$defs." + str2 + ".properties." + str + ".description";
    }
}
