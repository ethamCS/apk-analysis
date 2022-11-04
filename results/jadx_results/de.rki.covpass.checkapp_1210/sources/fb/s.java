package fb;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\b\u0000\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014J\u0018\u0010\t\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lfb/s;", "K", "V", "Ljava/util/LinkedHashMap;", BuildConfig.FLAVOR, "eldest", BuildConfig.FLAVOR, "removeEldestEntry", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "supplier", "Ltb/e0;", "close", BuildConfig.FLAVOR, "maxSize", "<init>", "(Lgc/l;Lgc/l;I)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class s<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private final gc.l<K, V> f10136c;

    /* renamed from: d */
    private final gc.l<V, e0> f10137d;

    /* renamed from: q */
    private final int f10138q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(gc.l<? super K, ? extends V> lVar, gc.l<? super V, e0> lVar2, int i10) {
        super(10, 0.75f, true);
        hc.t.e(lVar, "supplier");
        hc.t.e(lVar2, "close");
        this.f10136c = lVar;
        this.f10137d = lVar2;
        this.f10138q = i10;
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> e() {
        return super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) e();
    }

    public /* bridge */ Set<Object> f() {
        return super.keySet();
    }

    public /* bridge */ int g() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (this.f10138q == 0) {
            return this.f10136c.invoke(obj);
        }
        synchronized (this) {
            V v10 = (V) super.get(obj);
            if (v10 != null) {
                return v10;
            }
            V invoke = this.f10136c.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    public /* bridge */ Collection<Object> h() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) f();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> entry) {
        hc.t.e(entry, "eldest");
        boolean z10 = size() > this.f10138q;
        if (z10) {
            this.f10137d.invoke(entry.getValue());
        }
        return z10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) h();
    }
}
