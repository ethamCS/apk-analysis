package j$.util.concurrent;

import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class l implements Map.Entry {

    /* renamed from: a */
    final Object f13311a;

    /* renamed from: b */
    Object f13312b;

    /* renamed from: c */
    final ConcurrentHashMap f13313c;

    public l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f13311a = obj;
        this.f13312b = obj2;
        this.f13313c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f13311a) || key.equals(obj2)) && (value == (obj3 = this.f13312b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13311a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13312b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f13311a.hashCode() ^ this.f13312b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Objects.requireNonNull(obj);
        Object obj2 = this.f13312b;
        this.f13312b = obj;
        this.f13313c.put(this.f13311a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f13311a + "=" + this.f13312b;
    }
}
