package s4;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Ls4/r0;", "Lkotlinx/coroutines/flow/w;", "data", "a", "(Ls4/r0;Lkotlinx/coroutines/flow/w;)Ljava/lang/Object;", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ls4/t0;", "b", "()Ls4/t0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<t0<T>> {

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.flow.w<T> f21381c;

        /* renamed from: d */
        final /* synthetic */ r0 f21382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.w<? extends T> wVar, r0 r0Var) {
            super(0);
            this.f21381c = wVar;
            this.f21382d = r0Var;
        }

        /* renamed from: b */
        public final t0<T> invoke() {
            return new t0<>(this.f21381c, this.f21382d.a());
        }
    }

    public static final <T> T a(r0 r0Var, kotlinx.coroutines.flow.w<? extends T> wVar) {
        hc.t.e(r0Var, "<this>");
        hc.t.e(wVar, "data");
        r0Var.d(wVar, new a(wVar, r0Var));
        return wVar.getValue();
    }
}
