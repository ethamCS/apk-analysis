package dgca.verifier.app.engine.data.source.local.rules;

import dgca.verifier.app.engine.data.RuleIdentifier;
import dgca.verifier.app.engine.data.source.rules.RulesDataSource;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0005"}, d2 = {"Ldgca/verifier/app/engine/data/source/local/rules/RulesLocalDataSource;", "Ldgca/verifier/app/engine/data/source/rules/RulesDataSource;", BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/RuleIdentifier;", "getRuleIdentifiers", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface RulesLocalDataSource extends RulesDataSource {
    List<RuleIdentifier> getRuleIdentifiers();
}
