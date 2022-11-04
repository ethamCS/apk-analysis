package nf;

import af.h;
import gc.l;
import hc.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.j;
import nf.a;
import org.conscrypt.BuildConfig;
import ub.s0;
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b'\u0010(J.\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016JB\u0010\r\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042 \u0010\f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\nH\u0016JF\u0010\u0013\u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u0002\"\b\b\u0001\u0010\u000f*\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J<\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\nH\u0017J@\u0010\u001a\u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00180\nH\u0017J2\u0010\u001f\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\f\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0001JD\u0010 \u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001JH\u0010!\u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00180\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001JP\u0010$\u001a\u00020\b\"\b\b\u0000\u0010\u000e*\u00020\u0002\"\b\b\u0001\u0010\u000f*\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0001J\b\u0010&\u001a\u00020%H\u0001¨\u0006)"}, d2 = {"Lnf/e;", "Lnf/f;", BuildConfig.FLAVOR, "T", "Loc/d;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Ltb/e0;", "e", "Lkotlin/Function1;", BuildConfig.FLAVOR, "provider", "d", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "a", "Lkotlinx/serialization/j;", "defaultSerializerProvider", "c", BuildConfig.FLAVOR, "Lkotlinx/serialization/b;", "defaultDeserializerProvider", "b", "forClass", "Lnf/a;", BuildConfig.FLAVOR, "allowOverwrite", "k", "h", "g", "concreteClass", "concreteSerializer", "i", "Lnf/d;", "f", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a */
    private final Map<oc.d<?>, a> f17010a = new HashMap();

    /* renamed from: b */
    private final Map<oc.d<?>, Map<oc.d<?>, KSerializer<?>>> f17011b = new HashMap();

    /* renamed from: c */
    private final Map<oc.d<?>, l<?, j<?>>> f17012c = new HashMap();

    /* renamed from: d */
    private final Map<oc.d<?>, Map<String, KSerializer<?>>> f17013d = new HashMap();

    /* renamed from: e */
    private final Map<oc.d<?>, l<String, kotlinx.serialization.b<?>>> f17014e = new HashMap();

    public static /* synthetic */ void j(e eVar, oc.d dVar, oc.d dVar2, KSerializer kSerializer, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        eVar.i(dVar, dVar2, kSerializer, z10);
    }

    public static /* synthetic */ void l(e eVar, oc.d dVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        eVar.k(dVar, aVar, z10);
    }

    @Override // nf.f
    public <Base, Sub extends Base> void a(oc.d<Base> dVar, oc.d<Sub> dVar2, KSerializer<Sub> kSerializer) {
        t.e(dVar, "baseClass");
        t.e(dVar2, "actualClass");
        t.e(kSerializer, "actualSerializer");
        j(this, dVar, dVar2, kSerializer, false, 8, null);
    }

    @Override // nf.f
    public <Base> void b(oc.d<Base> dVar, l<? super String, ? extends kotlinx.serialization.b<? extends Base>> lVar) {
        t.e(dVar, "baseClass");
        t.e(lVar, "defaultDeserializerProvider");
        g(dVar, lVar, false);
    }

    @Override // nf.f
    public <Base> void c(oc.d<Base> dVar, l<? super Base, ? extends j<? super Base>> lVar) {
        t.e(dVar, "baseClass");
        t.e(lVar, "defaultSerializerProvider");
        h(dVar, lVar, false);
    }

    @Override // nf.f
    public <T> void d(oc.d<T> dVar, l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
        t.e(dVar, "kClass");
        t.e(lVar, "provider");
        l(this, dVar, new a.b(lVar), false, 4, null);
    }

    @Override // nf.f
    public <T> void e(oc.d<T> dVar, KSerializer<T> kSerializer) {
        t.e(dVar, "kClass");
        t.e(kSerializer, "serializer");
        l(this, dVar, new a.C0265a(kSerializer), false, 4, null);
    }

    public final d f() {
        return new b(this.f17010a, this.f17011b, this.f17012c, this.f17013d, this.f17014e);
    }

    public final <Base> void g(oc.d<Base> dVar, l<? super String, ? extends kotlinx.serialization.b<? extends Base>> lVar, boolean z10) {
        t.e(dVar, "baseClass");
        t.e(lVar, "defaultDeserializerProvider");
        l<String, kotlinx.serialization.b<?>> lVar2 = this.f17014e.get(dVar);
        if (lVar2 == null || t.a(lVar2, lVar) || z10) {
            this.f17014e.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final <Base> void h(oc.d<Base> dVar, l<? super Base, ? extends j<? super Base>> lVar, boolean z10) {
        t.e(dVar, "baseClass");
        t.e(lVar, "defaultSerializerProvider");
        l<?, j<?>> lVar2 = this.f17012c.get(dVar);
        if (lVar2 == null || t.a(lVar2, lVar) || z10) {
            this.f17012c.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final <Base, Sub extends Base> void i(oc.d<Base> dVar, oc.d<Sub> dVar2, KSerializer<Sub> kSerializer, boolean z10) {
        h v10;
        Object obj;
        boolean z11;
        t.e(dVar, "baseClass");
        t.e(dVar2, "concreteClass");
        t.e(kSerializer, "concreteSerializer");
        String l10 = kSerializer.getDescriptor().l();
        Map<oc.d<?>, Map<oc.d<?>, KSerializer<?>>> map = this.f17011b;
        Map<oc.d<?>, KSerializer<?>> map2 = map.get(dVar);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(dVar, map2);
        }
        Map<oc.d<?>, KSerializer<?>> map3 = map2;
        KSerializer<?> kSerializer2 = map3.get(dVar2);
        Map<oc.d<?>, Map<String, KSerializer<?>>> map4 = this.f17013d;
        Map<String, KSerializer<?>> map5 = map4.get(dVar);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(dVar, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        if (!z10) {
            if (kSerializer2 != null) {
                if (!t.a(kSerializer2, kSerializer)) {
                    throw new c(dVar, dVar2);
                }
                map6.remove(kSerializer2.getDescriptor().l());
            }
            KSerializer<?> kSerializer3 = map6.get(l10);
            if (kSerializer3 != null) {
                Map<oc.d<?>, KSerializer<?>> map7 = this.f17011b.get(dVar);
                t.b(map7);
                v10 = s0.v(map7);
                Iterator it = v10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == kSerializer3) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                }
                throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + dVar + "' have the same serial name '" + l10 + "': '" + dVar2 + "' and '" + ((Map.Entry) obj) + '\'');
            }
        } else if (kSerializer2 != null) {
            map6.remove(kSerializer2.getDescriptor().l());
        }
        map3.put(dVar2, kSerializer);
        map6.put(l10, kSerializer);
    }

    public final <T> void k(oc.d<T> dVar, a aVar, boolean z10) {
        a aVar2;
        t.e(dVar, "forClass");
        t.e(aVar, "provider");
        if (z10 || (aVar2 = this.f17010a.get(dVar)) == null || t.a(aVar2, aVar)) {
            this.f17010a.put(dVar, aVar);
            return;
        }
        throw new c("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
    }
}
