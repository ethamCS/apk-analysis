package fb;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010\u001c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000!0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lfb/h;", "Value", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "a", "value", "containsValue", "(Ljava/lang/Object;)Z", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "Ltb/e0;", "clear", "i", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "from", "putAll", "j", BuildConfig.FLAVOR, "other", "equals", BuildConfig.FLAVOR, "hashCode", "f", "()I", "size", BuildConfig.FLAVOR, "e", "()Ljava/util/Set;", "keys", BuildConfig.FLAVOR, "d", "entries", BuildConfig.FLAVOR, "g", "()Ljava/util/Collection;", "values", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h<Value> implements Map<String, Value>, ic.a {

    /* renamed from: c */
    private final Map<i, Value> f10118c = new LinkedHashMap();

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Value", BuildConfig.FLAVOR, "Lfb/i;", BuildConfig.FLAVOR, "b", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Map.Entry<i, Value>, Map.Entry<String, Value>> {

        /* renamed from: c */
        public static final a f10119c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Map.Entry<String, Value> invoke(Map.Entry<i, Value> entry) {
            hc.t.e(entry, "$this$$receiver");
            return new p(entry.getKey().a(), entry.getValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Value", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lfb/i;", "b", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<Map.Entry<String, Value>, Map.Entry<i, Value>> {

        /* renamed from: c */
        public static final b f10120c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Map.Entry<i, Value> invoke(Map.Entry<String, Value> entry) {
            hc.t.e(entry, "$this$$receiver");
            return new p(a0.a(entry.getKey()), entry.getValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Value", "Lfb/i;", BuildConfig.FLAVOR, "b", "(Lfb/i;)Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<i, String> {

        /* renamed from: c */
        public static final c f10121c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(i iVar) {
            hc.t.e(iVar, "$this$$receiver");
            return iVar.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Value", BuildConfig.FLAVOR, "Lfb/i;", "b", "(Ljava/lang/String;)Lfb/i;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<String, i> {

        /* renamed from: c */
        public static final d f10122c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final i invoke(String str) {
            hc.t.e(str, "$this$$receiver");
            return a0.a(str);
        }
    }

    public boolean a(String str) {
        hc.t.e(str, "key");
        return this.f10118c.containsKey(new i(str));
    }

    public Value b(String str) {
        hc.t.e(str, "key");
        return this.f10118c.get(a0.a(str));
    }

    @Override // java.util.Map
    public void clear() {
        this.f10118c.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return a((String) obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f10118c.containsValue(obj);
    }

    public Set<Map.Entry<String, Value>> d() {
        return new o(this.f10118c.entrySet(), a.f10119c, b.f10120c);
    }

    public Set<String> e() {
        return new o(this.f10118c.keySet(), c.f10121c, d.f10122c);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return hc.t.a(((h) obj).f10118c, this.f10118c);
    }

    public int f() {
        return this.f10118c.size();
    }

    public Collection<Value> g() {
        return this.f10118c.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return b((String) obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f10118c.hashCode();
    }

    /* renamed from: i */
    public Value put(String str, Value value) {
        hc.t.e(str, "key");
        return this.f10118c.put(a0.a(str), value);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f10118c.isEmpty();
    }

    public Value j(String str) {
        hc.t.e(str, "key");
        return this.f10118c.remove(a0.a(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Value> map) {
        hc.t.e(map, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return j((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return g();
    }
}
