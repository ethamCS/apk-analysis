package s9;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import dgca.verifier.app.engine.data.ValueSet;
import hc.t;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0003\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0001\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\t"}, d2 = {"Lj9/f;", "Ls9/a;", "a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Ldgca/verifier/app/engine/data/ValueSet;", "c", "d", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final a a(j9.f fVar) {
        t.e(fVar, "<this>");
        return new a(0, fVar.c(), fVar.b(), fVar.d(), fVar.a(), 1, null);
    }

    public static final List<a> b(Collection<j9.f> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (j9.f fVar : collection) {
            arrayList.add(a(fVar));
        }
        return arrayList;
    }

    public static final ValueSet c(a aVar) {
        t.e(aVar, "<this>");
        String d10 = aVar.d();
        LocalDate c10 = aVar.c();
        JsonNode readTree = ExtensionsKt.jacksonObjectMapper().readTree(aVar.e());
        t.d(readTree, "jacksonObjectMapper().readTree(valueSetValues)");
        return new ValueSet(d10, c10, readTree);
    }

    public static final List<ValueSet> d(Collection<a> collection) {
        int s10;
        t.e(collection, "<this>");
        s10 = v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (a aVar : collection) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }
}
