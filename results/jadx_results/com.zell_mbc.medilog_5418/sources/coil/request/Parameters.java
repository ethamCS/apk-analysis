package coil.request;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
/* compiled from: Parameters.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001d\u001e\u001fB\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u001b\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0003J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J\u001b\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0017H\u0096\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0003J\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006 "}, d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "()V", "map", "", "(Ljava/util/Map;)V", "size", "", "()I", "cacheKey", "key", "cacheKeys", "entry", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "newBuilder", "Lcoil/request/Parameters$Builder;", "toString", "value", "values", "Builder", "Companion", "Entry", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    public static final Parameters EMPTY = new Parameters();
    private final Map<String, Entry> map;

    private Parameters(Map<String, Entry> map) {
        this.map = map;
    }

    public /* synthetic */ Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public Parameters() {
        this(MapsKt.emptyMap());
    }

    public final int size() {
        return this.map.size();
    }

    public final Object value(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Entry entry = this.map.get(key);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    public final String cacheKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Entry entry = this.map.get(key);
        if (entry != null) {
            return entry.getCacheKey();
        }
        return null;
    }

    public final Entry entry(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final Map<String, Object> values() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<String, Entry> map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((Entry) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    public final Map<String, String> cacheKeys() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<String, Entry> map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            String cacheKey = entry.getValue().getCacheKey();
            if (cacheKey != null) {
                linkedHashMap.put(entry.getKey(), cacheKey);
            }
        }
        return linkedHashMap;
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map<String, Entry> map = this.map;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Parameters) && Intrinsics.areEqual(this.map, ((Parameters) obj).map));
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "Parameters(map=" + this.map + ')';
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* compiled from: Parameters.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcoil/request/Parameters$Entry;", "", "value", "cacheKey", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getCacheKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Entry {
        private final String cacheKey;
        private final Object value;

        public static /* synthetic */ Entry copy$default(Entry entry, Object obj, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = entry.value;
            }
            if ((i & 2) != 0) {
                str = entry.cacheKey;
            }
            return entry.copy(obj, str);
        }

        public final Object component1() {
            return this.value;
        }

        public final String component2() {
            return this.cacheKey;
        }

        public final Entry copy(Object obj, String str) {
            return new Entry(obj, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return Intrinsics.areEqual(this.value, entry.value) && Intrinsics.areEqual(this.cacheKey, entry.cacheKey);
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.value;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.cacheKey;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Entry(value=" + this.value + ", cacheKey=" + this.cacheKey + ")";
        }

        public Entry(Object obj, String str) {
            this.value = obj;
            this.cacheKey = str;
        }

        public final Object getValue() {
            return this.value;
        }

        public final String getCacheKey() {
            return this.cacheKey;
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ&\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcoil/request/Parameters$Builder;", "", "()V", "parameters", "Lcoil/request/Parameters;", "(Lcoil/request/Parameters;)V", "map", "", "", "Lcoil/request/Parameters$Entry;", "build", "remove", "key", "set", "value", "cacheKey", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final Map<String, Entry> map;

        public final Builder set(String str, Object obj) {
            return set$default(this, str, obj, null, 4, null);
        }

        public Builder() {
            this.map = new LinkedHashMap();
        }

        public Builder(Parameters parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.map = MapsKt.toMutableMap(parameters.map);
        }

        public static /* synthetic */ Builder set$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.set(str, obj, str2);
        }

        public final Builder set(String key, Object obj, String str) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.map.put(key, new Entry(obj, str));
            return this;
        }

        public final Builder remove(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.map.remove(key);
            return this;
        }

        public final Parameters build() {
            return new Parameters(MapsKt.toMap(this.map), null);
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcoil/request/Parameters$Companion;", "", "()V", "EMPTY", "Lcoil/request/Parameters;", "coil-base_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
