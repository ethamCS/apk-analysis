package io.ktor.util.collections;

import fb.q;
import fb.t;
import hc.k0;
import hc.v;
import hc.y;
import io.ktor.utils.io.s;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: Value
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\b\b\u0002\u0010P\u001a\u00020O\u0012\b\b\u0002\u0010Q\u001a\u00020&¢\u0006\u0004\bR\u0010SJ+\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\rJ!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u000b2\u0014\u0010 \u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0,H\u0000¢\u0006\u0004\b.\u0010/R[\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006002\u001e\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107RO\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00062\u0018\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010(R&\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006T"}, d2 = {"Lio/ktor/util/collections/c;", BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "key", "Lhb/h;", "Lhb/f;", "k", "(Ljava/lang/Object;)Lhb/h;", "l", "Ltb/e0;", "x", "()V", "T", "Lkotlin/Function0;", "block", "u", "(Lgc/a;)Ljava/lang/Object;", BuildConfig.FLAVOR, "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "from", "putAll", "(Ljava/util/Map;)V", "remove", "other", "equals", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "t", "()Ljava/util/Iterator;", "Lhb/i;", "<set-?>", "table$delegate", "Lkc/d;", "r", "()Lhb/i;", "w", "(Lhb/i;)V", "table", "insertionOrder$delegate", "n", "()Lhb/h;", "v", "(Lhb/h;)V", "insertionOrder", BuildConfig.FLAVOR, "p", "()F", "loadFactor", "q", "size", BuildConfig.FLAVOR, "m", "()Ljava/util/Set;", "entries", "o", "keys", BuildConfig.FLAVOR, "s", "()Ljava/util/Collection;", "values", "Lfb/t;", "lock", "initialCapacity", "<init>", "(Lfb/t;I)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c<Key, Value> implements Map<Key, Value>, ic.a {

    /* renamed from: x */
    static final /* synthetic */ oc.k<Object>[] f12756x = {k0.e(new y(c.class, "table", "getTable()Lio/ktor/util/collections/internal/SharedList;", 0)), k0.e(new y(c.class, "insertionOrder", "getInsertionOrder()Lio/ktor/util/collections/internal/SharedForwardList;", 0))};

    /* renamed from: y */
    static final /* synthetic */ AtomicIntegerFieldUpdater f12757y = AtomicIntegerFieldUpdater.newUpdater(c.class, "_size");
    volatile /* synthetic */ int _size;

    /* renamed from: c */
    private final t f12758c;

    /* renamed from: d */
    private final kc.d f12759d;

    /* renamed from: q */
    private final kc.d f12760q;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Key", "Value", "Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<Key, Value> cVar) {
            super(0);
            this.f12761c = cVar;
        }

        public final void b() {
            this.f12761c.w(new hb.i(32));
            this.f12761c.v(new hb.h());
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<Boolean> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12762c;

        /* renamed from: d */
        final /* synthetic */ Value f12763d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<Key, Value> cVar, Value value) {
            super(0);
            this.f12762c = cVar;
            this.f12763d = value;
        }

        public final Boolean b() {
            Iterator it = this.f12762c.r().iterator();
            while (it.hasNext()) {
                hb.h hVar = (hb.h) it.next();
                if (hVar != null) {
                    Iterator it2 = hVar.iterator();
                    while (it2.hasNext()) {
                        if (hc.t.a(((hb.f) it2.next()).getValue(), this.f12763d)) {
                            return Boolean.TRUE;
                        }
                    }
                    continue;
                }
            }
            return Boolean.FALSE;
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return b();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: io.ktor.util.collections.c$c */
    /* loaded from: classes.dex */
    static final class C0191c extends v implements gc.a<Boolean> {

        /* renamed from: c */
        final /* synthetic */ Object f12764c;

        /* renamed from: d */
        final /* synthetic */ c<Key, Value> f12765d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0191c(Object obj, c<Key, Value> cVar) {
            super(0);
            this.f12764c = obj;
            this.f12765d = cVar;
        }

        public final Boolean b() {
            Object obj = this.f12764c;
            if (obj == null || !(obj instanceof Map) || ((Map) obj).size() != this.f12765d.size()) {
                return Boolean.FALSE;
            }
            for (Map.Entry entry : ((Map) this.f12764c).entrySet()) {
                Object key = entry.getKey();
                if (!hc.t.a(this.f12765d.get(key), entry.getValue())) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Value", "Key", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<Value> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12766c;

        /* renamed from: d */
        final /* synthetic */ Key f12767d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<Key, Value> cVar, Key key) {
            super(0);
            this.f12766c = cVar;
            this.f12767d = key;
        }

        @Override // gc.a
        public final Value invoke() {
            Object obj;
            hb.h k10 = this.f12766c.k(this.f12767d);
            if (k10 == null) {
                return null;
            }
            Key key = this.f12767d;
            Iterator<T> it = k10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (hc.t.a(((hb.f) obj).getKey(), key)) {
                    break;
                }
            }
            hb.f fVar = (hb.f) obj;
            if (fVar != null) {
                return (Value) fVar.getValue();
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class e extends v implements gc.a<Integer> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c<Key, Value> cVar) {
            super(0);
            this.f12768c = cVar;
        }

        public final Integer b() {
            int i10 = 7;
            for (Map.Entry<Key, Value> entry : this.f12768c.entrySet()) {
                i10 = q.f10134a.a(Integer.valueOf(entry.getKey().hashCode()), Integer.valueOf(entry.getValue().hashCode()), Integer.valueOf(i10));
            }
            return Integer.valueOf(i10);
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ Integer invoke() {
            return b();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016RS\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0018\u00010\b2\u001a\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"io/ktor/util/collections/c$f", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "e", "Ltb/e0;", "remove", "Lhb/e;", "Lhb/f;", "<set-?>", "current$delegate", "Lkc/d;", "b", "()Lhb/e;", "f", "(Lhb/e;)V", "current", "d", "previous", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f implements Iterator<Map.Entry<Key, Value>>, ic.a, j$.util.Iterator {

        /* renamed from: q */
        static final /* synthetic */ oc.k<Object>[] f12769q = {k0.e(new y(f.class, "current", "getCurrent()Lio/ktor/util/collections/internal/ForwardListNode;", 0))};

        /* renamed from: c */
        private final kc.d f12770c;

        /* renamed from: d */
        final /* synthetic */ c<Key, Value> f12771d;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a implements kc.d<Object, hb.e<hb.f<Key, Value>>> {

            /* renamed from: a */
            private hb.e<hb.f<Key, Value>> f12772a;

            /* renamed from: b */
            final /* synthetic */ Object f12773b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Object obj) {
                this.f12773b = obj;
                this.f12772a = obj;
            }

            @Override // kc.d, kc.c
            public hb.e<hb.f<Key, Value>> a(Object obj, oc.k<?> kVar) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                return this.f12772a;
            }

            @Override // kc.d
            public void b(Object obj, oc.k<?> kVar, hb.e<hb.f<Key, Value>> eVar) {
                hc.t.e(obj, "thisRef");
                hc.t.e(kVar, "property");
                this.f12772a = eVar;
            }
        }

        static {
        }

        f(c<Key, Value> cVar) {
            this.f12771d = cVar;
            this.f12770c = new a(cVar.n().d());
            s.a(this);
        }

        private final hb.e<hb.f<Key, Value>> b() {
            return (hb.e) this.f12770c.a(this, f12769q[0]);
        }

        private final hb.e<hb.f<Key, Value>> d() {
            hb.e<hb.f<Key, Value>> b10 = b();
            if (b10 == null) {
                return null;
            }
            return b10.c();
        }

        private final void f(hb.e<hb.f<Key, Value>> eVar) {
            this.f12770c.b(this, f12769q[0], eVar);
        }

        public Map.Entry<Key, Value> e() {
            hb.e<hb.f<Key, Value>> b10 = b();
            hc.t.b(b10);
            hb.f<Key, Value> a10 = b10.a();
            hc.t.b(a10);
            hb.f<Key, Value> fVar = a10;
            hb.e<hb.f<Key, Value>> b11 = b();
            f(b11 == null ? null : b11.b());
            return fVar;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return b() != null;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return e();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            hb.e<hb.f<Key, Value>> d10 = d();
            hc.t.b(d10);
            hb.f<Key, Value> a10 = d10.a();
            hc.t.b(a10);
            this.f12771d.remove(a10.getKey());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Value", "Key", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.a<Value> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12774c;

        /* renamed from: d */
        final /* synthetic */ Key f12775d;

        /* renamed from: q */
        final /* synthetic */ Value f12776q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c<Key, Value> cVar, Key key, Value value) {
            super(0);
            this.f12774c = cVar;
            this.f12775d = key;
            this.f12776q = value;
        }

        @Override // gc.a
        public final Value invoke() {
            Object obj;
            if (this.f12774c.p() > 0.5d) {
                this.f12774c.x();
            }
            hb.h l10 = this.f12774c.l(this.f12775d);
            Key key = this.f12775d;
            java.util.Iterator<T> it = l10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (hc.t.a(((hb.f) obj).getKey(), key)) {
                    break;
                }
            }
            hb.f fVar = (hb.f) obj;
            if (fVar != null) {
                Value value = (Value) fVar.getValue();
                fVar.e(this.f12776q);
                return value;
            }
            hb.f fVar2 = new hb.f(this.f12775d, this.f12776q);
            fVar2.d(this.f12774c.n().b(fVar2));
            l10.a(fVar2);
            c.f12757y.incrementAndGet(this.f12774c);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Value", "Key", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends v implements gc.a<Value> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12777c;

        /* renamed from: d */
        final /* synthetic */ Key f12778d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(c<Key, Value> cVar, Key key) {
            super(0);
            this.f12777c = cVar;
            this.f12778d = key;
        }

        @Override // gc.a
        public final Value invoke() {
            hb.h k10 = this.f12777c.k(this.f12778d);
            if (k10 == null) {
                return null;
            }
            java.util.Iterator it = k10.iterator();
            Key key = this.f12778d;
            c<Key, Value> cVar = this.f12777c;
            while (it.hasNext()) {
                hb.f fVar = (hb.f) it.next();
                if (hc.t.a(fVar.getKey(), key)) {
                    Value value = (Value) fVar.getValue();
                    c.f12757y.decrementAndGet(cVar);
                    fVar.b();
                    it.remove();
                    return value;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class i implements kc.d<Object, hb.i<hb.h<hb.f<Key, Value>>>> {

        /* renamed from: a */
        private hb.i<hb.h<hb.f<Key, Value>>> f12779a;

        /* renamed from: b */
        final /* synthetic */ Object f12780b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj) {
            this.f12780b = obj;
            this.f12779a = obj;
        }

        @Override // kc.d, kc.c
        public hb.i<hb.h<hb.f<Key, Value>>> a(Object obj, oc.k<?> kVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            return this.f12779a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, hb.i<hb.h<hb.f<Key, Value>>> iVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            this.f12779a = iVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class j implements kc.d<Object, hb.h<hb.f<Key, Value>>> {

        /* renamed from: a */
        private hb.h<hb.f<Key, Value>> f12781a;

        /* renamed from: b */
        final /* synthetic */ Object f12782b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Object obj) {
            this.f12782b = obj;
            this.f12781a = obj;
        }

        @Override // kc.d, kc.c
        public hb.h<hb.f<Key, Value>> a(Object obj, oc.k<?> kVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            return this.f12781a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, hb.h<hb.f<Key, Value>> hVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            this.f12781a = hVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "Key", "Value", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class k extends v implements gc.a<String> {

        /* renamed from: c */
        final /* synthetic */ c<Key, Value> f12783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c<Key, Value> cVar) {
            super(0);
            this.f12783c = cVar;
        }

        public final String b() {
            c<Key, Value> cVar = this.f12783c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{");
            int i10 = 0;
            for (Object obj : cVar.entrySet()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u.r();
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(key);
                sb3.append('=');
                sb3.append(value);
                sb2.append(sb3.toString());
                if (i10 != cVar.size() - 1) {
                    sb2.append(", ");
                }
                i10 = i11;
            }
            sb2.append("}");
            String sb4 = sb2.toString();
            hc.t.d(sb4, "StringBuilder().apply(builderAction).toString()");
            return sb4;
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ String invoke() {
            return b();
        }
    }

    static {
    }

    public c() {
        this(null, 0, 3, null);
    }

    public c(t tVar, int i10) {
        hc.t.e(tVar, "lock");
        this.f12758c = tVar;
        this.f12759d = new i(new hb.i(i10));
        this.f12760q = new j(new hb.h());
        this._size = 0;
        s.a(this);
    }

    public /* synthetic */ c(t tVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new t() : tVar, (i11 & 2) != 0 ? 32 : i10);
    }

    public final hb.h<hb.f<Key, Value>> k(Key key) {
        return r().get(key.hashCode() & (r().size() - 1));
    }

    public final hb.h<hb.f<Key, Value>> l(Key key) {
        int hashCode = key.hashCode() & (r().size() - 1);
        hb.h<hb.f<Key, Value>> hVar = r().get(hashCode);
        if (hVar == null) {
            hb.h<hb.f<Key, Value>> hVar2 = new hb.h<>();
            r().b(hashCode, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public final hb.h<hb.f<Key, Value>> n() {
        return (hb.h) this.f12760q.a(this, f12756x[1]);
    }

    public final float p() {
        return this._size / r().size();
    }

    public final hb.i<hb.h<hb.f<Key, Value>>> r() {
        return (hb.i) this.f12759d.a(this, f12756x[0]);
    }

    private final <T> T u(gc.a<? extends T> aVar) {
        t tVar = this.f12758c;
        try {
            tVar.a();
            return aVar.invoke();
        } finally {
            tVar.b();
        }
    }

    public final void v(hb.h<hb.f<Key, Value>> hVar) {
        this.f12760q.b(this, f12756x[1], hVar);
    }

    public final void w(hb.i<hb.h<hb.f<Key, Value>>> iVar) {
        this.f12759d.b(this, f12756x[0], iVar);
    }

    public final void x() {
        c cVar = new c(null, r().size() * 2, 1, null);
        cVar.putAll(this);
        w(cVar.r());
    }

    @Override // java.util.Map
    public void clear() {
        u(new a(this));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return (obj == null || get(obj) == null) ? false : true;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((Boolean) u(new b(this, obj))).booleanValue();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return m();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ((Boolean) u(new C0191c(obj, this))).booleanValue();
    }

    @Override // java.util.Map
    public Value get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Value) u(new d(this, obj));
    }

    @Override // java.util.Map
    public int hashCode() {
        return ((Number) u(new e(this))).intValue();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return o();
    }

    public Set<Map.Entry<Key, Value>> m() {
        return new hb.g(this);
    }

    public Set<Key> o() {
        return new hb.b(this);
    }

    @Override // java.util.Map
    public Value put(Key key, Value value) {
        hc.t.e(key, "key");
        hc.t.e(value, "value");
        return (Value) u(new g(this, key, value));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Key, ? extends Value> map) {
        hc.t.e(map, "from");
        for (Map.Entry<? extends Key, ? extends Value> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public int q() {
        return this._size;
    }

    @Override // java.util.Map
    public Value remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Value) u(new h(this, obj));
    }

    public Collection<Value> s() {
        return new hb.c(this);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return q();
    }

    public final java.util.Iterator<Map.Entry<Key, Value>> t() {
        return new f(this);
    }

    public String toString() {
        return (String) u(new k(this));
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return s();
    }
}
