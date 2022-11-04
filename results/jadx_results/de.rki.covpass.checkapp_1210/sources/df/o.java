package df;

import kotlin.Metadata;
import kotlinx.coroutines.q0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"E", "Ldf/e0;", "element", "Ltb/e0;", "a", "(Ldf/e0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
final /* synthetic */ class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {
        final /* synthetic */ e0<E> U3;
        final /* synthetic */ E V3;

        /* renamed from: y */
        int f8930y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e0<? super E> e0Var, E e10, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = e0Var;
            this.V3 = e10;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f8930y;
            if (i10 == 0) {
                tb.t.b(obj);
                e0<E> e0Var = this.U3;
                E e10 = this.V3;
                this.f8930y = 1;
                if (e0Var.c(e10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        public final Object d0(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, this.V3, dVar);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return d0(q0Var, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> void a(e0<? super E> e0Var, E e10) {
        if (m.i(e0Var.d(e10))) {
            return;
        }
        kotlinx.coroutines.k.b(null, new a(e0Var, e10, null), 1, null);
    }
}
