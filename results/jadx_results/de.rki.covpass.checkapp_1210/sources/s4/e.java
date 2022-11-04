package s4;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B®\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012(\b\u0002\u0010\u0011\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0010\u0012R\b\u0002\u0010\u0019\u001aL\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012,\u0012*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0015\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012j\u0002`\u0018\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0003j\b\u0012\u0004\u0012\u00028\u0001`\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ls4/e;", "T", "Ls4/d0;", "Lkotlin/Function1;", "Ls4/r0;", "Lcom/ensody/reactivestate/AutoRunCallback;", "observer", "o", "(Lgc/l;)Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "Ltb/e0;", "n", "(Lxb/d;)Ljava/lang/Object;", "Ls4/m;", "launcher", "Lcom/ensody/reactivestate/AutoRunOnChangeCallback;", "onChange", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/d;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/e;", "Lxb/d;", BuildConfig.FLAVOR, "Lcom/ensody/reactivestate/AutoRunFlowTransformer;", "flowTransformer", "<init>", "(Ls4/m;Lgc/l;Lgc/p;Lgc/l;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e<T> extends d0 {
    private final gc.l<r0, T> X3;
    private final gc.l<e<T>, tb.e0> Y3;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012.\u0010\u0007\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lkotlinx/coroutines/flow/d;", "Ltb/e0;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/e;", "Lxb/d;", BuildConfig.FLAVOR, "it", "b", "(Lkotlinx/coroutines/flow/d;Lgc/q;)Lkotlinx/coroutines/flow/d;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.p<kotlinx.coroutines.flow.d<? extends tb.e0>, gc.q<? super kotlinx.coroutines.flow.e<? super tb.e0>, ? super tb.e0, ? super xb.d<? super tb.e0>, ? extends Object>, kotlinx.coroutines.flow.d<? extends tb.e0>> {

        /* renamed from: c */
        public static final a f21392c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final kotlinx.coroutines.flow.d<tb.e0> u(kotlinx.coroutines.flow.d<tb.e0> dVar, gc.q<? super kotlinx.coroutines.flow.e<? super tb.e0>, ? super tb.e0, ? super xb.d<? super tb.e0>, ? extends Object> qVar) {
            hc.t.e(dVar, "$this$null");
            hc.t.e(qVar, "it");
            return b0.c(dVar, 0L, qVar, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ls4/e;", "it", "Ltb/e0;", "b", "(Ls4/e;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<e<T>, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ e<T> f21393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar) {
            super(1);
            this.f21393c = eVar;
        }

        public final void b(e<T> eVar) {
            hc.t.e(eVar, "it");
            this.f21393c.p();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Object obj) {
            b((e) obj);
            return tb.e0.f22152a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(m mVar, b bVar, gc.p<? super kotlinx.coroutines.flow.d<tb.e0>, ? super gc.q<? super kotlinx.coroutines.flow.e<? super tb.e0>, ? super tb.e0, ? super xb.d<? super tb.e0>, ? extends Object>, ? extends kotlinx.coroutines.flow.d<tb.e0>> pVar, gc.l<? super r0, ? extends T> lVar) {
        super(mVar, pVar);
        hc.t.e(mVar, "launcher");
        hc.t.e(pVar, "flowTransformer");
        hc.t.e(lVar, "observer");
        this.X3 = lVar;
        this.Y3 = (gc.l<e<T>, tb.e0>) (bVar == null ? new b(this) : bVar);
    }

    public /* synthetic */ e(m mVar, gc.l lVar, gc.p pVar, gc.l lVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? a.f21392c : pVar, lVar2);
    }

    private final <T> T o(gc.l<? super r0, ? extends T> lVar) {
        r0 c10 = c();
        r0 r0Var = new r0(this);
        try {
            T invoke = lVar.invoke(r0Var);
            if (c() == c10) {
                c().c(r0Var);
                m(r0Var);
            } else {
                r0Var.c(c());
            }
            return invoke;
        } catch (Throwable th2) {
            if (c() == c10) {
                c().c(r0Var);
                m(r0Var);
            } else {
                r0Var.c(c());
            }
            throw th2;
        }
    }

    @Override // s4.d0
    protected Object n(xb.d<? super tb.e0> dVar) {
        Object c10;
        tb.e0 invoke = this.Y3.invoke(this);
        c10 = yb.d.c();
        return invoke == c10 ? invoke : tb.e0.f22152a;
    }

    public final T p() {
        j();
        return o(this.X3);
    }
}
