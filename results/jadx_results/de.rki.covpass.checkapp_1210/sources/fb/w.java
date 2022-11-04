package fb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\r0\fJ\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014J\u001c\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lfb/w;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "value", "Ltb/e0;", "m", "g", "a", "Lfb/v;", "stringValues", "b", BuildConfig.FLAVOR, "values", "c", "l", "d", "o", "p", BuildConfig.FLAVOR, "Ljava/util/Map;", "j", "()Ljava/util/Map;", "built", "Z", "i", "()Z", "n", "(Z)V", "caseInsensitiveName", "<init>", "(ZI)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class w {

    /* renamed from: a */
    private final boolean f10147a;

    /* renamed from: b */
    private final Map<String, List<String>> f10148b;

    /* renamed from: c */
    private boolean f10149c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "values", "Ltb/e0;", "b", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.p<String, List<? extends String>, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(2);
            w.this = r1;
        }

        public final void b(String str, List<String> list) {
            hc.t.e(str, "name");
            hc.t.e(list, "values");
            w.this.c(str, list);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(String str, List<? extends String> list) {
            b(str, list);
            return e0.f22152a;
        }
    }

    public w(boolean z10, int i10) {
        this.f10147a = z10;
        this.f10148b = z10 ? l.a() : new LinkedHashMap<>(i10);
    }

    private final List<String> e(String str, int i10) {
        if (!this.f10149c) {
            List<String> list = this.f10148b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(i10);
            o(str);
            j().put(str, arrayList);
            return arrayList;
        }
        throw new IllegalStateException("Cannot modify a builder after build() function already invoked. Make sure you call build() last.");
    }

    public final void a(String str, String str2) {
        hc.t.e(str, "name");
        hc.t.e(str2, "value");
        p(str2);
        e(str, 1).add(str2);
    }

    public final void b(v vVar) {
        hc.t.e(vVar, "stringValues");
        vVar.c(new a());
    }

    public final void c(String str, Iterable<String> iterable) {
        hc.t.e(str, "name");
        hc.t.e(iterable, "values");
        Collection collection = iterable instanceof Collection ? (Collection) iterable : null;
        List<String> e10 = e(str, collection == null ? 2 : collection.size());
        for (String str2 : iterable) {
            p(str2);
            e10.add(str2);
        }
    }

    public final void d() {
        this.f10148b.clear();
    }

    public final Set<Map.Entry<String, List<String>>> f() {
        return k.a(this.f10148b.entrySet());
    }

    public final String g(String str) {
        Object X;
        hc.t.e(str, "name");
        List<String> h10 = h(str);
        if (h10 == null) {
            return null;
        }
        X = c0.X(h10);
        return (String) X;
    }

    public final List<String> h(String str) {
        hc.t.e(str, "name");
        return this.f10148b.get(str);
    }

    public final boolean i() {
        return this.f10149c;
    }

    public final Map<String, List<String>> j() {
        return this.f10148b;
    }

    public final boolean k() {
        return this.f10148b.isEmpty();
    }

    public final void l(String str) {
        hc.t.e(str, "name");
        this.f10148b.remove(str);
    }

    public final void m(String str, String str2) {
        hc.t.e(str, "name");
        hc.t.e(str2, "value");
        p(str2);
        List<String> e10 = e(str, 1);
        e10.clear();
        e10.add(str2);
    }

    public final void n(boolean z10) {
        this.f10149c = z10;
    }

    public void o(String str) {
        hc.t.e(str, "name");
    }

    public void p(String str) {
        hc.t.e(str, "value");
    }
}
