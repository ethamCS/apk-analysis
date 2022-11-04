package l9;

import dgca.verifier.app.engine.DateTimeKt;
import dgca.verifier.app.engine.data.RuleCertificateType;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0003\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, d2 = {"Lk9/a;", "Ll9/d;", "c", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "Ll9/b;", "b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ll9/a;", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
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

    public static final b b(k9.a aVar) {
        t.e(aVar, "<this>");
        String g10 = aVar.g();
        k9.b l10 = aVar.l();
        String o10 = aVar.o();
        String k10 = aVar.k();
        String d10 = aVar.d();
        String e10 = aVar.e();
        RuleCertificateType j10 = aVar.j();
        ZonedDateTime withZoneSameInstant = aVar.m().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        t.d(withZoneSameInstant, "validFrom.withZoneSameInstant(UTC_ZONE_ID)");
        ZonedDateTime withZoneSameInstant2 = aVar.n().withZoneSameInstant(DateTimeKt.getUTC_ZONE_ID());
        t.d(withZoneSameInstant2, "validTo.withZoneSameInstant(UTC_ZONE_ID)");
        return new b(0L, g10, l10, o10, k10, d10, e10, j10, withZoneSameInstant, withZoneSameInstant2, aVar.a(), aVar.h(), aVar.b(), aVar.i(), aVar.f(), 1, null);
    }

    public static final d c(k9.a aVar) {
        t.e(aVar, "<this>");
        return new d(b(aVar), a(aVar.c()));
    }

    public static final List<d> d(Collection<k9.a> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (k9.a aVar : collection) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }
}
