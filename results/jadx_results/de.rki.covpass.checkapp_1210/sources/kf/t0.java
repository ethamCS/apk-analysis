package kf;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0016"}, d2 = {"Lkf/t0;", "K", "V", "Lkf/f0;", "Ltb/r;", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ltb/r;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "(Ltb/r;)Ljava/lang/Object;", "e", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class t0<K, V> extends f0<K, V, tb.r<? extends K, ? extends V>> {

    /* renamed from: c */
    private final SerialDescriptor f15250c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lif/a;", "Ltb/e0;", "b", "(Lif/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<p000if.a, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ KSerializer<K> f15251c;

        /* renamed from: d */
        final /* synthetic */ KSerializer<V> f15252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f15251c = kSerializer;
            this.f15252d = kSerializer2;
        }

        public final void b(p000if.a aVar) {
            hc.t.e(aVar, "$this$buildClassSerialDescriptor");
            p000if.a.b(aVar, "first", this.f15251c.getDescriptor(), null, false, 12, null);
            p000if.a.b(aVar, "second", this.f15252d.getDescriptor(), null, false, 12, null);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(p000if.a aVar) {
            b(aVar);
            return tb.e0.f22152a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        hc.t.e(kSerializer, "keySerializer");
        hc.t.e(kSerializer2, "valueSerializer");
        this.f15250c = p000if.h.b("kotlin.Pair", new SerialDescriptor[0], new a(kSerializer, kSerializer2));
    }

    /* renamed from: d */
    public K a(tb.r<? extends K, ? extends V> rVar) {
        hc.t.e(rVar, "<this>");
        return rVar.e();
    }

    /* renamed from: e */
    public V b(tb.r<? extends K, ? extends V> rVar) {
        hc.t.e(rVar, "<this>");
        return rVar.f();
    }

    /* renamed from: f */
    public tb.r<K, V> c(K k10, V v10) {
        return tb.x.a(k10, v10);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return this.f15250c;
    }
}
