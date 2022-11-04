package ef;

import df.y;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import xb.e;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lef/f;", "S", "T", "Lef/d;", "Lkotlinx/coroutines/flow/e;", "collector", "Lxb/g;", "newContext", "Ltb/e0;", "r", "(Lkotlinx/coroutines/flow/e;Lxb/g;Lxb/d;)Ljava/lang/Object;", "s", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "Ldf/y;", "scope", "k", "(Ldf/y;Lxb/d;)Ljava/lang/Object;", "a", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/flow/d;", "flow", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/d;Lxb/g;ILdf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class f<S, T> extends d<T> {

    /* renamed from: x */
    protected final kotlinx.coroutines.flow.d<S> f9564x;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/e;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends zb.l implements gc.p<kotlinx.coroutines.flow.e<? super T>, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ f<S, T> V3;

        /* renamed from: y */
        int f9565y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<S, T> fVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = fVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f9565y;
            if (i10 == 0) {
                t.b(obj);
                f<S, T> fVar = this.V3;
                this.f9565y = 1;
                if (fVar.s((kotlinx.coroutines.flow.e) this.U3, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super e0> dVar) {
            return ((a) j(eVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(kotlinx.coroutines.flow.d<? extends S> dVar, xb.g gVar, int i10, df.h hVar) {
        super(gVar, i10, hVar);
        this.f9564x = dVar;
    }

    static /* synthetic */ Object p(f fVar, kotlinx.coroutines.flow.e eVar, xb.d dVar) {
        Object c10;
        Object c11;
        Object c12;
        if (fVar.f9560d == -3) {
            xb.g b10 = dVar.b();
            xb.g B = b10.B(fVar.f9559c);
            if (hc.t.a(B, b10)) {
                Object s10 = fVar.s(eVar, dVar);
                c12 = yb.d.c();
                return s10 == c12 ? s10 : e0.f22152a;
            }
            e.b bVar = xb.e.X0;
            if (hc.t.a(B.i(bVar), b10.i(bVar))) {
                Object r10 = fVar.r(eVar, B, dVar);
                c11 = yb.d.c();
                return r10 == c11 ? r10 : e0.f22152a;
            }
        }
        Object a10 = super.a(eVar, dVar);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }

    static /* synthetic */ Object q(f fVar, y yVar, xb.d dVar) {
        Object c10;
        Object s10 = fVar.s(new p(yVar), dVar);
        c10 = yb.d.c();
        return s10 == c10 ? s10 : e0.f22152a;
    }

    private final Object r(kotlinx.coroutines.flow.e<? super T> eVar, xb.g gVar, xb.d<? super e0> dVar) {
        kotlinx.coroutines.flow.e d10;
        Object c10;
        d10 = e.d(eVar, dVar.b());
        Object c11 = e.c(gVar, d10, null, new a(this, null), dVar, 4, null);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : e0.f22152a;
    }

    @Override // ef.d, kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super e0> dVar) {
        return p(this, eVar, dVar);
    }

    @Override // ef.d
    protected Object k(y<? super T> yVar, xb.d<? super e0> dVar) {
        return q(this, yVar, dVar);
    }

    protected abstract Object s(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super e0> dVar);

    @Override // ef.d
    public String toString() {
        return this.f9564x + " -> " + super.toString();
    }
}
