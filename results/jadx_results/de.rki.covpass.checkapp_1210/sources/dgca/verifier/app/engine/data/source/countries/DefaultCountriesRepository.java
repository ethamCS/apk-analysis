package dgca.verifier.app.engine.data.source.countries;

import dgca.verifier.app.engine.data.source.local.countries.CountriesLocalDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.d;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldgca/verifier/app/engine/data/source/countries/DefaultCountriesRepository;", "Ldgca/verifier/app/engine/data/source/countries/CountriesRepository;", "Lkotlinx/coroutines/flow/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getCountries", "Ldgca/verifier/app/engine/data/source/local/countries/CountriesLocalDataSource;", "a", "Ldgca/verifier/app/engine/data/source/local/countries/CountriesLocalDataSource;", "localDataSource", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultCountriesRepository implements CountriesRepository {

    /* renamed from: a */
    private final CountriesLocalDataSource f9014a;

    @Override // dgca.verifier.app.engine.data.source.countries.CountriesDataSource
    public d<List<String>> getCountries() {
        return this.f9014a.getCountries();
    }
}
