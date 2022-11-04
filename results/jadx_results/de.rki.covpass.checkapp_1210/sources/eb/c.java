package eb;

import gc.p;
import io.ktor.utils.io.h;
import io.ktor.utils.io.j;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import tb.e0;
import tb.t;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/q0;", "Lio/ktor/utils/io/h;", "input", "Lya/d;", "request", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @f(c = "io.ktor.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", f = "TimeoutExceptionsCommon.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<u, xb.d<? super e0>, Object> {
        final /* synthetic */ h U3;
        final /* synthetic */ io.ktor.utils.io.c V3;

        /* renamed from: y */
        int f9547y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, io.ktor.utils.io.c cVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = hVar;
            this.V3 = cVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f9547y;
            try {
                if (i10 == 0) {
                    t.b(obj);
                    h hVar = this.U3;
                    io.ktor.utils.io.c cVar = this.V3;
                    this.f9547y = 1;
                    if (j.c(hVar, cVar, 0L, this, 2, null) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    t.b(obj);
                }
            } catch (Throwable th2) {
                this.U3.g(th2);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(u uVar, xb.d<? super e0> dVar) {
            return ((a) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, this.V3, dVar);
        }
    }

    public static final h a(q0 q0Var, h hVar, ya.d dVar) {
        hc.t.e(q0Var, "<this>");
        hc.t.e(hVar, "input");
        hc.t.e(dVar, "request");
        if (fb.u.f10140a.c()) {
            return hVar;
        }
        io.ktor.utils.io.c a10 = d.a(dVar);
        io.ktor.utils.io.p.d(q0Var, null, a10, new a(hVar, a10, null), 1, null);
        return a10;
    }
}
