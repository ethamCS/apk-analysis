package kf;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0016B#\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkf/n0;", "K", "V", "Lkf/f0;", BuildConfig.FLAVOR, "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "a", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n0<K, V> extends f0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f15205c;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00028\u0002\u0012\u0006\u0010\u0010\u001a\u00028\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001a\u0010\f\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkf/n0$a;", "K", "V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "value", "getValue", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a<K, V> implements Map.Entry<K, V>, ic.a {

        /* renamed from: c */
        private final K f15206c;

        /* renamed from: d */
        private final V f15207d;

        public a(K k10, V v10) {
            this.f15206c = k10;
            this.f15207d = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return hc.t.a(getKey(), aVar.getKey()) && hc.t.a(getValue(), aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f15206c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f15207d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i10 = 0;
            int hashCode = (getKey() == null ? 0 : getKey().hashCode()) * 31;
            if (getValue() != null) {
                i10 = getValue().hashCode();
            }
            return hashCode + i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.l<p000if.a, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ KSerializer<K> f15208c;

        /* renamed from: d */
        final /* synthetic */ KSerializer<V> f15209d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f15208c = kSerializer;
            this.f15209d = kSerializer2;
        }

        public final void b(p000if.a aVar) {
            hc.t.e(aVar, "$this$buildSerialDescriptor");
            p000if.a.b(aVar, "key", this.f15208c.getDescriptor(), null, false, 12, null);
            p000if.a.b(aVar, "value", this.f15209d.getDescriptor(), null, false, 12, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(p000if.a aVar) {
            b(aVar);
            return tb.e0.f22152a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        hc.t.e(kSerializer, "keySerializer");
        hc.t.e(kSerializer2, "valueSerializer");
        this.f15205c = p000if.h.c("kotlin.collections.Map.Entry", j.c.f12555a, new SerialDescriptor[0], new b(kSerializer, kSerializer2));
    }

    /* renamed from: d */
    public K a(Map.Entry<? extends K, ? extends V> entry) {
        hc.t.e(entry, "<this>");
        return entry.getKey();
    }

    /* renamed from: e */
    public V b(Map.Entry<? extends K, ? extends V> entry) {
        hc.t.e(entry, "<this>");
        return entry.getValue();
    }

    /* renamed from: f */
    public Map.Entry<K, V> c(K k10, V v10) {
        return new a(k10, v10);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15205c;
    }
}
