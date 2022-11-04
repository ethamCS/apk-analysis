package t9;

import de.rki.covpass.sdk.rules.remote.rules.eu.CovPassDescriptionRemote;
import de.rki.covpass.sdk.rules.remote.rules.eu.CovPassRuleRemote;
import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import hc.t;
import j$.time.ZonedDateTime;
import j9.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.x;
import ub.q0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\t"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote;", BuildConfig.FLAVOR, "hash", "Lj9/d;", "a", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassDescriptionRemote;", BuildConfig.FLAVOR, "b", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    public static final d a(CovPassRuleRemote covPassRuleRemote, String str) {
        t.e(covPassRuleRemote, "<this>");
        t.e(str, "hash");
        String g10 = covPassRuleRemote.g();
        String k10 = covPassRuleRemote.k();
        Locale locale = Locale.ROOT;
        String upperCase = k10.toUpperCase(locale);
        t.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        Type valueOf = Type.valueOf(upperCase);
        String n10 = covPassRuleRemote.n();
        String j10 = covPassRuleRemote.j();
        String e10 = covPassRuleRemote.e();
        String f10 = covPassRuleRemote.f();
        String upperCase2 = covPassRuleRemote.b().toUpperCase(locale);
        t.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        RuleCertificateType valueOf2 = RuleCertificateType.valueOf(upperCase2);
        Map<String, String> b10 = b(covPassRuleRemote.d());
        ZonedDateTime l10 = covPassRuleRemote.l();
        ZonedDateTime m10 = covPassRuleRemote.m();
        List<String> a10 = covPassRuleRemote.a();
        String obj = covPassRuleRemote.h().toString();
        String lowerCase = covPassRuleRemote.c().toLowerCase(locale);
        t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new d(g10, valueOf, n10, j10, e10, f10, valueOf2, b10, l10, m10, a10, obj, lowerCase, covPassRuleRemote.i(), str);
    }

    public static final Map<String, String> b(Collection<CovPassDescriptionRemote> collection) {
        int s10;
        Map<String, String> q10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (CovPassDescriptionRemote covPassDescriptionRemote : collection) {
            String lowerCase = covPassDescriptionRemote.b().toLowerCase(Locale.ROOT);
            t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(x.a(lowerCase, covPassDescriptionRemote.a()));
        }
        q10 = q0.q(arrayList);
        return q10;
    }
}
