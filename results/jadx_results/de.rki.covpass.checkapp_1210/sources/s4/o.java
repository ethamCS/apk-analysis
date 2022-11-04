package s4;

import kotlin.Lazy;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0003\u001a4\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0003\"\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function1;", "Ls4/r0;", "Lcom/ensody/reactivestate/AutoRunCallback;", "observer", "Lkotlinx/coroutines/flow/w;", "b", "Ls4/m;", "c", "Ls4/s0;", "scopelessCoroutineLauncher$delegate", "Lkotlin/Lazy;", "d", "()Ls4/s0;", "scopelessCoroutineLauncher", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    private static final Lazy f21425a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls4/s0;", "b", "()Ls4/s0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class a extends hc.v implements gc.a<s0> {

        /* renamed from: c */
        public static final a f21426c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final s0 invoke() {
            return new s0(kotlinx.coroutines.r0.b());
        }
    }

    static {
        Lazy a10;
        a10 = tb.m.a(a.f21426c);
        f21425a = a10;
    }

    public static final <T> kotlinx.coroutines.flow.w<T> b(gc.l<? super r0, ? extends T> lVar) {
        hc.t.e(lVar, "observer");
        return new p(null, lVar, 1, null);
    }

    public static final <T> kotlinx.coroutines.flow.w<T> c(m mVar, gc.l<? super r0, ? extends T> lVar) {
        hc.t.e(mVar, "<this>");
        hc.t.e(lVar, "observer");
        return new p(mVar, lVar);
    }

    public static final s0 d() {
        return (s0) f21425a.getValue();
    }
}
