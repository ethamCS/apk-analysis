package ef;

import df.a0;
import df.w;
import df.y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0016J!\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0016R9\u0010 \u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lef/d;", "T", "Lef/i;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d;", "g", "l", "Ldf/y;", "scope", "Ltb/e0;", "k", "(Ldf/y;Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Ldf/a0;", "o", "Lkotlinx/coroutines/flow/e;", "collector", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "i", "toString", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "m", "()Lgc/p;", "collectToFun", "n", "()I", "produceCapacity", "<init>", "(Lxb/g;ILdf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class d<T> implements i<T> {

    /* renamed from: c */
    public final xb.g f9559c;

    /* renamed from: d */
    public final int f9560d;

    /* renamed from: q */
    public final df.h f9561q;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ kotlinx.coroutines.flow.e<T> V3;
        final /* synthetic */ d<T> W3;

        /* renamed from: y */
        int f9562y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.e<? super T> eVar, d<T> dVar, xb.d<? super a> dVar2) {
            super(2, dVar2);
            this.V3 = eVar;
            this.W3 = dVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f9562y;
            if (i10 == 0) {
                t.b(obj);
                kotlinx.coroutines.flow.e<T> eVar = this.V3;
                a0<T> o10 = this.W3.o((q0) this.U3);
                this.f9562y = 1;
                if (kotlinx.coroutines.flow.f.g(eVar, o10, this) == c10) {
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
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, this.W3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Ldf/y;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends zb.l implements gc.p<y<? super T>, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ d<T> V3;

        /* renamed from: y */
        int f9563y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, xb.d<? super b> dVar2) {
            super(2, dVar2);
            this.V3 = dVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f9563y;
            if (i10 == 0) {
                t.b(obj);
                d<T> dVar = this.V3;
                this.f9563y = 1;
                if (dVar.k((y) this.U3, this) == c10) {
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
        public final Object u(y<? super T> yVar, xb.d<? super e0> dVar) {
            return ((b) j(yVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    public d(xb.g gVar, int i10, df.h hVar) {
        this.f9559c = gVar;
        this.f9560d = i10;
        this.f9561q = hVar;
    }

    static /* synthetic */ Object j(d dVar, kotlinx.coroutines.flow.e eVar, xb.d dVar2) {
        Object c10;
        Object f10 = r0.f(new a(eVar, dVar, null), dVar2);
        c10 = yb.d.c();
        return f10 == c10 ? f10 : e0.f22152a;
    }

    @Override // kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super e0> dVar) {
        return j(this, eVar, dVar);
    }

    @Override // ef.i
    public kotlinx.coroutines.flow.d<T> g(xb.g gVar, int i10, df.h hVar) {
        xb.g B = gVar.B(this.f9559c);
        if (hVar == df.h.SUSPEND) {
            int i11 = this.f9560d;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2 && (i11 = i11 + i10) < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
                i10 = i11;
            }
            hVar = this.f9561q;
        }
        return (hc.t.a(B, this.f9559c) && i10 == this.f9560d && hVar == this.f9561q) ? this : l(B, i10, hVar);
    }

    protected String i() {
        return null;
    }

    protected abstract Object k(y<? super T> yVar, xb.d<? super e0> dVar);

    protected abstract d<T> l(xb.g gVar, int i10, df.h hVar);

    public final gc.p<y<? super T>, xb.d<? super e0>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i10 = this.f9560d;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public a0<T> o(q0 q0Var) {
        return w.b(q0Var, this.f9559c, n(), this.f9561q, s0.ATOMIC, null, m(), 16, null);
    }

    public String toString() {
        String e02;
        ArrayList arrayList = new ArrayList(4);
        String i10 = i();
        if (i10 != null) {
            arrayList.add(i10);
        }
        if (this.f9559c != xb.h.f25516c) {
            arrayList.add("context=" + this.f9559c);
        }
        if (this.f9560d != -3) {
            arrayList.add("capacity=" + this.f9560d);
        }
        if (this.f9561q != df.h.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f9561q);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u0.a(this));
        sb2.append('[');
        e02 = c0.e0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(e02);
        sb2.append(']');
        return sb2.toString();
    }
}
