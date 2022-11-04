package s4;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00002(\b\u0002\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00042\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0007\u001ab\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00002(\b\u0002\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00042\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0007¨\u0006\r"}, d2 = {"Ls4/m;", "Lkotlin/Function1;", "Ls4/e;", "Ltb/e0;", "Lcom/ensody/reactivestate/AutoRunOnChangeCallback;", "onChange", "Ls4/r0;", "Lcom/ensody/reactivestate/AutoRunCallback;", "observer", "b", "Lkotlinx/coroutines/q0;", "launcher", "a", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {
    public static final e<tb.e0> a(kotlinx.coroutines.q0 q0Var, m mVar, gc.l<? super e<tb.e0>, tb.e0> lVar, gc.l<? super r0, tb.e0> lVar2) {
        hc.t.e(q0Var, "<this>");
        hc.t.e(mVar, "launcher");
        hc.t.e(lVar2, "observer");
        return b(mVar, lVar, lVar2);
    }

    public static final e<tb.e0> b(m mVar, gc.l<? super e<tb.e0>, tb.e0> lVar, gc.l<? super r0, tb.e0> lVar2) {
        hc.t.e(mVar, "<this>");
        hc.t.e(lVar2, "observer");
        e<tb.e0> eVar = new e<>(mVar, lVar, null, lVar2, 4, null);
        t.b(eVar, mVar);
        eVar.p();
        return eVar;
    }

    public static /* synthetic */ e c(kotlinx.coroutines.q0 q0Var, m mVar, gc.l lVar, gc.l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = new s0(q0Var);
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return a(q0Var, mVar, lVar, lVar2);
    }
}
