package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aY\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lkotlinx/coroutines/flow/d;", "a", "Lkotlin/Function1;", BuildConfig.FLAVOR, "keySelector", "Lkotlin/Function2;", BuildConfig.FLAVOR, "areEquivalent", "b", "(Lkotlinx/coroutines/flow/d;Lgc/l;Lgc/p;)Lkotlinx/coroutines/flow/d;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class k {

    /* renamed from: a */
    private static final gc.l<Object, Object> f15359a = b.f15362c;

    /* renamed from: b */
    private static final gc.p<Object, Object, Boolean> f15360b = a.f15361c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "old", "new", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class a extends hc.v implements gc.p<Object, Object, Boolean> {

        /* renamed from: c */
        public static final a f15361c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Boolean u(Object obj, Object obj2) {
            return Boolean.valueOf(hc.t.a(obj, obj2));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends hc.v implements gc.l<Object, Object> {

        /* renamed from: c */
        public static final b f15362c = new b();

        b() {
            super(1);
        }

        @Override // gc.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> a(d<? extends T> dVar) {
        return dVar instanceof w ? dVar : b(dVar, f15359a, f15360b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> d<T> b(d<? extends T> dVar, gc.l<? super T, ? extends Object> lVar, gc.p<Object, Object, Boolean> pVar) {
        if (dVar instanceof c) {
            c cVar = (c) dVar;
            if (cVar.f15350d == lVar && cVar.f15351q == pVar) {
                return dVar;
            }
        }
        return new c(dVar, lVar, pVar);
    }
}
