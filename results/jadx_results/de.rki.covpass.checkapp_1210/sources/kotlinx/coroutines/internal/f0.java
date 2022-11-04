package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import kotlinx.coroutines.z2;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lxb/g;", "context", BuildConfig.FLAVOR, "b", "countOrElement", "c", "oldState", "Ltb/e0;", "a", "Lkotlinx/coroutines/internal/b0;", "Lkotlinx/coroutines/internal/b0;", "NO_THREAD_ELEMENTS", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a */
    public static final b0 f15417a = new b0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final gc.p<Object, g.b, Object> f15418b = a.f15421c;

    /* renamed from: c */
    private static final gc.p<z2<?>, g.b, z2<?>> f15419c = b.f15422c;

    /* renamed from: d */
    private static final gc.p<k0, g.b, k0> f15420d = c.f15423c;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "countOrElement", "Lxb/g$b;", "element", "b", "(Ljava/lang/Object;Lxb/g$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class a extends hc.v implements gc.p<Object, g.b, Object> {

        /* renamed from: c */
        public static final a f15421c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Object u(Object obj, g.b bVar) {
            if (bVar instanceof z2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/z2;", "found", "Lxb/g$b;", "element", "b", "(Lkotlinx/coroutines/z2;Lxb/g$b;)Lkotlinx/coroutines/z2;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class b extends hc.v implements gc.p<z2<?>, g.b, z2<?>> {

        /* renamed from: c */
        public static final b f15422c = new b();

        b() {
            super(2);
        }

        /* renamed from: b */
        public final z2<?> u(z2<?> z2Var, g.b bVar) {
            if (z2Var != null) {
                return z2Var;
            }
            if (!(bVar instanceof z2)) {
                return null;
            }
            return (z2) bVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/k0;", "state", "Lxb/g$b;", "element", "b", "(Lkotlinx/coroutines/internal/k0;Lxb/g$b;)Lkotlinx/coroutines/internal/k0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class c extends hc.v implements gc.p<k0, g.b, k0> {

        /* renamed from: c */
        public static final c f15423c = new c();

        c() {
            super(2);
        }

        /* renamed from: b */
        public final k0 u(k0 k0Var, g.b bVar) {
            if (bVar instanceof z2) {
                z2<?> z2Var = (z2) bVar;
                k0Var.a(z2Var, z2Var.e0(k0Var.f15436a));
            }
            return k0Var;
        }
    }

    public static final void a(xb.g gVar, Object obj) {
        if (obj == f15417a) {
            return;
        }
        if (obj instanceof k0) {
            ((k0) obj).b(gVar);
            return;
        }
        Object f10 = gVar.f(null, f15419c);
        Objects.requireNonNull(f10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((z2) f10).z0(gVar, obj);
    }

    public static final Object b(xb.g gVar) {
        Object f10 = gVar.f(0, f15418b);
        hc.t.b(f10);
        return f10;
    }

    public static final Object c(xb.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f15417a : obj instanceof Integer ? gVar.f(new k0(gVar, ((Number) obj).intValue()), f15420d) : ((z2) obj).e0(gVar);
    }
}
