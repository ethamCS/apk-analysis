package d9;

import android.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R-\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Ld9/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ld9/v;", "trustedCerts", "Ljava/util/Set;", "b", "()Ljava/util/Set;", BuildConfig.FLAVOR, "Le9/b;", BuildConfig.FLAVOR, "kidToCerts$delegate", "Lkotlin/Lazy;", "a", "()Ljava/util/Map;", "kidToCerts", BuildConfig.FLAVOR, "trusted", "<init>", "(Ljava/lang/Iterable;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final Set<v> f8408a;

    /* renamed from: b */
    private final Lazy f8409b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Le9/b;", BuildConfig.FLAVOR, "Ld9/v;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<Map<e9.b, ? extends List<? extends v>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final Map<e9.b, List<v>> invoke() {
            Set<v> b10 = g.this.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : b10) {
                byte[] decode = Base64.decode(((v) obj).b(), 0);
                hc.t.d(decode, "decode(it.kid, Base64.DEFAULT)");
                e9.b bVar = new e9.b(decode);
                Object obj2 = linkedHashMap.get(bVar);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(bVar, obj2);
                }
                ((List) obj2).add(obj);
            }
            return linkedHashMap;
        }
    }

    public g(Iterable<v> iterable) {
        Set<v> J0;
        Lazy a10;
        hc.t.e(iterable, "trusted");
        J0 = c0.J0(iterable);
        this.f8408a = J0;
        a10 = tb.m.a(new a());
        this.f8409b = a10;
    }

    public final Map<e9.b, List<v>> a() {
        return (Map) this.f8409b.getValue();
    }

    public final Set<v> b() {
        return this.f8408a;
    }
}
