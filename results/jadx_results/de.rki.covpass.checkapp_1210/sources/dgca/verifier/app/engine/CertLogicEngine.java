package dgca.verifier.app.engine;

import dgca.verifier.app.engine.data.CertificateType;
import dgca.verifier.app.engine.data.ExternalParameter;
import dgca.verifier.app.engine.data.Rule;
import java.util.List;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Ldgca/verifier/app/engine/CertLogicEngine;", org.conscrypt.BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", org.conscrypt.BuildConfig.FLAVOR, "hcertVersionString", org.conscrypt.BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/Rule;", "rules", "Ldgca/verifier/app/engine/data/ExternalParameter;", "externalParameter", "payload", "Ldgca/verifier/app/engine/ValidationResult;", "a", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface CertLogicEngine {
    List<ValidationResult> a(CertificateType certificateType, String str, List<Rule> list, ExternalParameter externalParameter, String str2);
}
