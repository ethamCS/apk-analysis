package r9;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import dgca.verifier.app.engine.DateTimeKt;
import dgca.verifier.app.engine.data.Rule;
import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import hc.t;
import j$.time.ZonedDateTime;
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
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0003\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u001a\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\n0\u0003\u001a\n\u0010\r\u001a\u00020\u0000*\u00020\u0001\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0012"}, d2 = {"Lj9/d;", "Lr9/d;", "d", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "Lr9/b;", "c", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lr9/a;", "a", "g", "b", "e", "Ldgca/verifier/app/engine/data/Rule;", "h", "i", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    public static final List<a> a(Map<String, String> map) {
        t.e(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new a(0L, 0L, entry.getKey(), entry.getValue(), 3, null));
        }
        return arrayList;
    }

    public static final j9.d b(d dVar) {
        t.e(dVar, "<this>");
        String f10 = dVar.b().f();
        Type l10 = dVar.b().l();
        String o10 = dVar.b().o();
        String k10 = dVar.b().k();
        String c10 = dVar.b().c();
        String d10 = dVar.b().d();
        RuleCertificateType i10 = dVar.b().i();
        ZonedDateTime withZoneSameInstant = dVar.b().m().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        ZonedDateTime withZoneSameInstant2 = dVar.b().n().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        List<String> a10 = dVar.b().a();
        String g10 = dVar.b().g();
        String b10 = dVar.b().b();
        Map<String, String> g11 = g(dVar.a());
        String h10 = dVar.b().h();
        String e10 = dVar.b().e();
        t.d(withZoneSameInstant, "withZoneSameInstant(UTC_ZONE_ID)");
        t.d(withZoneSameInstant2, "withZoneSameInstant(UTC_ZONE_ID)");
        return new j9.d(f10, l10, o10, k10, c10, d10, i10, g11, withZoneSameInstant, withZoneSameInstant2, a10, g10, b10, h10, e10);
    }

    public static final b c(j9.d dVar) {
        t.e(dVar, "<this>");
        String g10 = dVar.g();
        Type l10 = dVar.l();
        String o10 = dVar.o();
        String k10 = dVar.k();
        String d10 = dVar.d();
        String e10 = dVar.e();
        RuleCertificateType j10 = dVar.j();
        ZonedDateTime withZoneSameInstant = dVar.m().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        t.d(withZoneSameInstant, "validFrom.withZoneSameInstant(UTC_ZONE_ID)");
        ZonedDateTime withZoneSameInstant2 = dVar.n().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        t.d(withZoneSameInstant2, "validTo.withZoneSameInstant(UTC_ZONE_ID)");
        return new b(0L, g10, l10, o10, k10, d10, e10, j10, withZoneSameInstant, withZoneSameInstant2, dVar.a(), dVar.h(), dVar.b(), dVar.i(), dVar.f(), 1, null);
    }

    public static final d d(j9.d dVar) {
        t.e(dVar, "<this>");
        return new d(c(dVar), a(dVar.c()));
    }

    public static final List<j9.d> e(Collection<d> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (d dVar : collection) {
            arrayList.add(b(dVar));
        }
        return arrayList;
    }

    public static final List<d> f(Collection<j9.d> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (j9.d dVar : collection) {
            arrayList.add(d(dVar));
        }
        return arrayList;
    }

    public static final Map<String, String> g(Collection<a> collection) {
        int s10;
        Map<String, String> q10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (a aVar : collection) {
            String lowerCase = aVar.e().toLowerCase(Locale.ROOT);
            t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(x.a(lowerCase, aVar.c()));
        }
        q10 = q0.q(arrayList);
        return q10;
    }

    public static final Rule h(j9.d dVar) {
        t.e(dVar, "<this>");
        String g10 = dVar.g();
        Type l10 = dVar.l();
        String o10 = dVar.o();
        String k10 = dVar.k();
        String d10 = dVar.d();
        String e10 = dVar.e();
        RuleCertificateType j10 = dVar.j();
        ZonedDateTime m10 = dVar.m();
        ZonedDateTime n10 = dVar.n();
        List<String> a10 = dVar.a();
        JsonNode readTree = ExtensionsKt.jacksonObjectMapper().readTree(dVar.h());
        String b10 = dVar.b();
        Map<String, String> c10 = dVar.c();
        String i10 = dVar.i();
        t.d(readTree, "readTree(logic)");
        return new Rule(g10, l10, o10, k10, d10, e10, j10, c10, m10, n10, a10, readTree, b10, i10);
    }

    public static final List<Rule> i(Collection<j9.d> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (j9.d dVar : collection) {
            arrayList.add(h(dVar));
        }
        return arrayList;
    }
}
