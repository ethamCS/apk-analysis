package fb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
import ub.q0;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u001c¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\f0\bH\u0016J(\u0010\u0011\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u0018\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR-\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u001c8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lfb/y;", "Lfb/v;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "h", "e", "b", BuildConfig.FLAVOR, "names", BuildConfig.FLAVOR, "isEmpty", BuildConfig.FLAVOR, "a", "Lkotlin/Function2;", "Ltb/e0;", "body", "c", "toString", BuildConfig.FLAVOR, "other", "equals", BuildConfig.FLAVOR, "hashCode", "caseInsensitiveName", "Z", "d", "()Z", BuildConfig.FLAVOR, "values$delegate", "Lkotlin/Lazy;", "g", "()Ljava/util/Map;", "values", "<init>", "(ZLjava/util/Map;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class y implements v {

    /* renamed from: a */
    private final boolean f10151a;

    /* renamed from: b */
    private final Lazy f10152b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<Map<String, ? extends List<? extends String>>> {

        /* renamed from: d */
        final /* synthetic */ Map<String, List<String>> f10154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Map<String, ? extends List<String>> map) {
            super(0);
            y.this = r1;
            this.f10154d = map;
        }

        /* renamed from: b */
        public final Map<String, List<String>> invoke() {
            Map<String, List<String>> s10;
            if (!y.this.d()) {
                s10 = q0.s(this.f10154d);
                return s10;
            }
            Map<String, List<String>> a10 = l.a();
            a10.putAll(this.f10154d);
            return a10;
        }
    }

    public y(boolean z10, Map<String, ? extends List<String>> map) {
        Lazy a10;
        hc.t.e(map, "values");
        this.f10151a = z10;
        a10 = tb.m.a(new a(map));
        this.f10152b = a10;
    }

    public /* synthetic */ y(boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? q0.h() : map);
    }

    private final List<String> h(String str) {
        return g().get(str);
    }

    @Override // fb.v
    public Set<Map.Entry<String, List<String>>> a() {
        return k.a(g().entrySet());
    }

    @Override // fb.v
    public List<String> b(String str) {
        hc.t.e(str, "name");
        return h(str);
    }

    @Override // fb.v
    public void c(gc.p<? super String, ? super List<String>, e0> pVar) {
        hc.t.e(pVar, "body");
        for (Map.Entry<String, List<String>> entry : g().entrySet()) {
            pVar.u(entry.getKey(), entry.getValue());
        }
    }

    @Override // fb.v
    public boolean d() {
        return this.f10151a;
    }

    @Override // fb.v
    public String e(String str) {
        Object X;
        hc.t.e(str, "name");
        List<String> h10 = h(str);
        if (h10 == null) {
            return null;
        }
        X = c0.X(h10);
        return (String) X;
    }

    public boolean equals(Object obj) {
        boolean d10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (d() != vVar.d()) {
            return false;
        }
        d10 = z.d(a(), vVar.a());
        return d10;
    }

    protected final Map<String, List<String>> g() {
        return (Map) this.f10152b.getValue();
    }

    public int hashCode() {
        int e10;
        e10 = z.e(a(), x.a(d()) * 31);
        return e10;
    }

    @Override // fb.v
    public boolean isEmpty() {
        return g().isEmpty();
    }

    @Override // fb.v
    public Set<String> names() {
        return k.a(g().keySet());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StringValues(case=");
        sb2.append(!d());
        sb2.append(") ");
        sb2.append(a());
        return sb2.toString();
    }
}
