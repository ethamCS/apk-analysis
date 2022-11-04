package dgca.verifier.app.engine.data.source.countries;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.d;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Ldgca/verifier/app/engine/data/source/countries/CountriesDataSource;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getCountries", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface CountriesDataSource {
    d<List<String>> getCountries();
}
