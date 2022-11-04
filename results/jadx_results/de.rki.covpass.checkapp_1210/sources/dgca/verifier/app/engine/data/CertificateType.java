package dgca.verifier.app.engine.data;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.p;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ldgca/verifier/app/engine/data/CertificateType;", BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/RuleCertificateType;", "g", "<init>", "(Ljava/lang/String;I)V", "TEST", "VACCINATION", "RECOVERY", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public enum CertificateType {
    TEST,
    VACCINATION,
    RECOVERY;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8971a;

        static {
            int[] iArr = new int[CertificateType.values().length];
            iArr[CertificateType.TEST.ordinal()] = 1;
            iArr[CertificateType.VACCINATION.ordinal()] = 2;
            iArr[CertificateType.RECOVERY.ordinal()] = 3;
            f8971a = iArr;
        }
    }

    public final RuleCertificateType g() {
        int i10 = WhenMappings.f8971a[ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return RuleCertificateType.VACCINATION;
            }
            if (i10 != 3) {
                throw new p();
            }
            return RuleCertificateType.RECOVERY;
        }
        return RuleCertificateType.TEST;
    }
}
