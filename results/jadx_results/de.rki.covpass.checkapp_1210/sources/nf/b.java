package nf;

import gc.l;
import hc.k0;
import hc.q0;
import hc.t;
import java.util.List;
import java.util.Map;
import kf.u0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.j;
import nf.a;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B×\u0001\u0012\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u0017\u0012*\u0010\u001a\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u0012.\u0010\u001d\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001bj\u0006\u0012\u0002\b\u0003`\u001c0\u0017\u0012&\u0010\u001e\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u00122\u0010 \u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001bj\u0006\u0012\u0002\b\u0003`\u001f0\u0017¢\u0006\u0004\b!\u0010\"J9\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ6\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006#"}, d2 = {"Lnf/b;", "Lnf/d;", BuildConfig.FLAVOR, "T", "Loc/d;", "baseClass", "value", "Lkotlinx/serialization/j;", "e", "(Loc/d;Ljava/lang/Object;)Lkotlinx/serialization/j;", BuildConfig.FLAVOR, "serializedClassName", "Lkotlinx/serialization/b;", "d", "kClass", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "Lnf/f;", "collector", "Ltb/e0;", "a", BuildConfig.FLAVOR, "Lnf/a;", "class2ContextualFactory", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: a */
    private final Map<oc.d<?>, a> f17005a;

    /* renamed from: b */
    public final Map<oc.d<?>, Map<oc.d<?>, KSerializer<?>>> f17006b;

    /* renamed from: c */
    private final Map<oc.d<?>, l<?, j<?>>> f17007c;

    /* renamed from: d */
    private final Map<oc.d<?>, Map<String, KSerializer<?>>> f17008d;

    /* renamed from: e */
    private final Map<oc.d<?>, l<String, kotlinx.serialization.b<?>>> f17009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<oc.d<?>, ? extends a> map, Map<oc.d<?>, ? extends Map<oc.d<?>, ? extends KSerializer<?>>> map2, Map<oc.d<?>, ? extends l<?, ? extends j<?>>> map3, Map<oc.d<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, Map<oc.d<?>, ? extends l<? super String, ? extends kotlinx.serialization.b<?>>> map5) {
        super(null);
        t.e(map, "class2ContextualFactory");
        t.e(map2, "polyBase2Serializers");
        t.e(map3, "polyBase2DefaultSerializerProvider");
        t.e(map4, "polyBase2NamedSerializers");
        t.e(map5, "polyBase2DefaultDeserializerProvider");
        this.f17005a = map;
        this.f17006b = map2;
        this.f17007c = map3;
        this.f17008d = map4;
        this.f17009e = map5;
    }

    @Override // nf.d
    public void a(f fVar) {
        t.e(fVar, "collector");
        for (Map.Entry<oc.d<?>, a> entry : this.f17005a.entrySet()) {
            oc.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0265a) {
                fVar.e(key, ((a.C0265a) value).b());
            } else if (value instanceof a.b) {
                fVar.d(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<oc.d<?>, Map<oc.d<?>, KSerializer<?>>> entry2 : this.f17006b.entrySet()) {
            oc.d<?> key2 = entry2.getKey();
            for (Map.Entry<oc.d<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                fVar.a(key2, entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry<oc.d<?>, l<?, j<?>>> entry4 : this.f17007c.entrySet()) {
            fVar.c(entry4.getKey(), (l) q0.d(entry4.getValue(), 1));
        }
        for (Map.Entry<oc.d<?>, l<String, kotlinx.serialization.b<?>>> entry5 : this.f17009e.entrySet()) {
            fVar.b(entry5.getKey(), (l) q0.d(entry5.getValue(), 1));
        }
    }

    @Override // nf.d
    public <T> KSerializer<T> b(oc.d<T> dVar, List<? extends KSerializer<?>> list) {
        t.e(dVar, "kClass");
        t.e(list, "typeArgumentsSerializers");
        a aVar = this.f17005a.get(dVar);
        KSerializer<?> a10 = aVar != null ? aVar.a(list) : null;
        if (a10 instanceof KSerializer) {
            return (KSerializer<T>) a10;
        }
        return null;
    }

    @Override // nf.d
    public <T> kotlinx.serialization.b<? extends T> d(oc.d<? super T> dVar, String str) {
        t.e(dVar, "baseClass");
        Map<String, KSerializer<?>> map = this.f17008d.get(dVar);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l<String, kotlinx.serialization.b<?>> lVar = this.f17009e.get(dVar);
        l<String, kotlinx.serialization.b<?>> lVar2 = q0.i(lVar, 1) ? lVar : null;
        if (lVar2 == null) {
            return null;
        }
        return (kotlinx.serialization.b<? extends T>) lVar2.invoke(str);
    }

    @Override // nf.d
    public <T> j<T> e(oc.d<? super T> dVar, T t10) {
        t.e(dVar, "baseClass");
        t.e(t10, "value");
        if (!u0.i(t10, dVar)) {
            return null;
        }
        Map<oc.d<?>, KSerializer<?>> map = this.f17006b.get(dVar);
        KSerializer<?> kSerializer = map != null ? map.get(k0.b(t10.getClass())) : null;
        if (!(kSerializer instanceof j)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l<?, j<?>> lVar = this.f17007c.get(dVar);
        l<?, j<?>> lVar2 = q0.i(lVar, 1) ? lVar : null;
        if (lVar2 == null) {
            return null;
        }
        return (j<T>) lVar2.invoke(t10);
    }
}
