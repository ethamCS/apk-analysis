package mf;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mf.k;
import org.conscrypt.BuildConfig;
import ub.q0;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a&\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0000\"2\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "Llf/a;", "json", "name", "d", "suffix", "e", "Lmf/k$a;", "JsonAlternativeNamesKey", "Lmf/k$a;", "c", "()Lmf/k$a;", "getJsonAlternativeNamesKey$annotations", "()V", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a */
    private static final k.a<Map<String, Integer>> f16636a = new k.a<>();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends hc.q implements gc.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, r.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        /* renamed from: i0 */
        public final Map<String, Integer> invoke() {
            return r.a((SerialDescriptor) this.f11756d);
        }
    }

    public static final Map<String, Integer> a(SerialDescriptor serialDescriptor) {
        Map<String, Integer> h10;
        Object u02;
        String[] names;
        hc.t.e(serialDescriptor, "<this>");
        int m10 = serialDescriptor.m();
        Map<String, Integer> map = null;
        for (int i10 = 0; i10 < m10; i10++) {
            List<Annotation> p10 = serialDescriptor.p(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : p10) {
                if (obj instanceof lf.o) {
                    arrayList.add(obj);
                }
            }
            u02 = ub.c0.u0(arrayList);
            lf.o oVar = (lf.o) u02;
            if (oVar != null && (names = oVar.names()) != null) {
                for (String str : names) {
                    if (map == null) {
                        map = j.a(serialDescriptor.m());
                    }
                    hc.t.b(map);
                    b(map, serialDescriptor, str, i10);
                }
            }
        }
        if (map == null) {
            h10 = q0.h();
            return h10;
        }
        return map;
    }

    private static final void b(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i10) {
        Object i11;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The suggested name '");
        sb2.append(str);
        sb2.append("' for property ");
        sb2.append(serialDescriptor.n(i10));
        sb2.append(" is already one of the names for property ");
        i11 = q0.i(map, str);
        sb2.append(serialDescriptor.n(((Number) i11).intValue()));
        sb2.append(" in ");
        sb2.append(serialDescriptor);
        throw new p(sb2.toString());
    }

    public static final k.a<Map<String, Integer>> c() {
        return f16636a;
    }

    public static final int d(SerialDescriptor serialDescriptor, lf.a aVar, String str) {
        hc.t.e(serialDescriptor, "<this>");
        hc.t.e(aVar, "json");
        hc.t.e(str, "name");
        int k10 = serialDescriptor.k(str);
        if (k10 == -3 && aVar.f().j()) {
            Integer num = (Integer) ((Map) lf.s.a(aVar).b(serialDescriptor, f16636a, new a(serialDescriptor))).get(str);
            if (num == null) {
                return -3;
            }
            return num.intValue();
        }
        return k10;
    }

    public static final int e(SerialDescriptor serialDescriptor, lf.a aVar, String str, String str2) {
        hc.t.e(serialDescriptor, "<this>");
        hc.t.e(aVar, "json");
        hc.t.e(str, "name");
        hc.t.e(str2, "suffix");
        int d10 = d(serialDescriptor, aVar, str);
        if (d10 != -3) {
            return d10;
        }
        throw new kotlinx.serialization.i(serialDescriptor.l() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int f(SerialDescriptor serialDescriptor, lf.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        return e(serialDescriptor, aVar, str, str2);
    }
}
