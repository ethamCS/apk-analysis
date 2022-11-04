package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.o0;
import org.conscrypt.BuildConfig;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Ltb/e0;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/l0;", "undeliveredElementException", "c", "(Lgc/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/l0;)Lkotlinx/coroutines/internal/l0;", "Lxb/g;", "context", "b", "(Lgc/l;Ljava/lang/Object;Lxb/g;)V", BuildConfig.FLAVOR, "a", "(Lgc/l;Ljava/lang/Object;Lxb/g;)Lgc/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", BuildConfig.FLAVOR, "<anonymous parameter 0>", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<Throwable, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ gc.l<E, tb.e0> f15462c;

        /* renamed from: d */
        final /* synthetic */ E f15463d;

        /* renamed from: q */
        final /* synthetic */ xb.g f15464q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.l<? super E, tb.e0> lVar, E e10, xb.g gVar) {
            super(1);
            this.f15462c = lVar;
            this.f15463d = e10;
            this.f15464q = gVar;
        }

        public final void b(Throwable th2) {
            v.b(this.f15462c, this.f15463d, this.f15464q);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
            b(th2);
            return tb.e0.f22152a;
        }
    }

    public static final <E> gc.l<Throwable, tb.e0> a(gc.l<? super E, tb.e0> lVar, E e10, xb.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(gc.l<? super E, tb.e0> lVar, E e10, xb.g gVar) {
        l0 c10 = c(lVar, e10, null);
        if (c10 != null) {
            o0.a(gVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> l0 c(gc.l<? super E, tb.e0> lVar, E e10, l0 l0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (l0Var == null || l0Var.getCause() == th2) {
                return new l0("Exception in undelivered element handler for " + e10, th2);
            }
            tb.f.a(l0Var, th2);
        }
        return l0Var;
    }

    public static /* synthetic */ l0 d(gc.l lVar, Object obj, l0 l0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l0Var = null;
        }
        return c(lVar, obj, l0Var);
    }
}
