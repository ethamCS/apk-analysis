package df;

import df.m;
import hc.q0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001'B)\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\b;\u00102R\u0014\u0010>\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\b=\u00102R\u001a\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010E\u001a\u00020.8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Ldf/c;", "E", "Ldf/e0;", "Ldf/q;", "closed", BuildConfig.FLAVOR, "o", "(Ldf/q;)Ljava/lang/Throwable;", "element", "Ltb/e0;", "z", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Lxb/d;", "p", "(Lxb/d;Ljava/lang/Object;Ldf/q;)V", "cause", "q", "(Ljava/lang/Throwable;)V", "n", "(Ldf/q;)V", BuildConfig.FLAVOR, "g", "()I", BuildConfig.FLAVOR, "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ldf/d0;", "B", "()Ldf/d0;", "Ldf/b0;", "y", "(Ljava/lang/Object;)Ldf/b0;", "c", "Ldf/m;", "d", "send", "h", "(Ldf/d0;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/internal/o;", "x", "(Lkotlinx/coroutines/internal/o;)V", "A", "()Ldf/b0;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "u", "()Z", "isFullImpl", "m", "queueDebugStateString", "Lkotlinx/coroutines/internal/m;", "queue", "Lkotlinx/coroutines/internal/m;", "l", "()Lkotlinx/coroutines/internal/m;", "s", "isBufferAlwaysFull", "t", "isBufferFull", "k", "()Ldf/q;", "closedForSend", "j", "closedForReceive", "i", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class c<E> implements e0<E> {

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8909q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: c */
    protected final gc.l<E, tb.e0> f8910c;

    /* renamed from: d */
    private final kotlinx.coroutines.internal.m f8911d = new kotlinx.coroutines.internal.m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Ldf/c$a;", "E", "Ldf/d0;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/b0;", "J", "Ltb/e0;", "G", "Ldf/q;", "closed", "I", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "H", "()Ljava/lang/Object;", "pollResult", "element", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a<E> extends d0 {

        /* renamed from: x */
        public final E f8912x;

        public a(E e10) {
            this.f8912x = e10;
        }

        @Override // df.d0
        public void G() {
        }

        @Override // df.d0
        public Object H() {
            return this.f8912x;
        }

        @Override // df.d0
        public void I(q<?> qVar) {
        }

        @Override // df.d0
        public kotlinx.coroutines.internal.b0 J(o.b bVar) {
            return kotlinx.coroutines.r.f15503a;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "SendBuffered@" + u0.b(this) + '(' + this.f8912x + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"df/c$b", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", BuildConfig.FLAVOR, "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends o.a {

        /* renamed from: d */
        final /* synthetic */ c f8913d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.internal.o oVar, c cVar) {
            super(oVar);
            this.f8913d = cVar;
        }

        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f8913d.t()) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(gc.l<? super E, tb.e0> lVar) {
        this.f8910c = lVar;
    }

    private final int g() {
        kotlinx.coroutines.internal.m mVar = this.f8911d;
        int i10 = 0;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) mVar.v(); !hc.t.a(oVar, mVar); oVar = oVar.w()) {
            if (oVar instanceof kotlinx.coroutines.internal.o) {
                i10++;
            }
        }
        return i10;
    }

    private final String m() {
        String str;
        kotlinx.coroutines.internal.o w9 = this.f8911d.w();
        if (w9 == this.f8911d) {
            return "EmptyQueue";
        }
        if (w9 instanceof q) {
            str = w9.toString();
        } else if (w9 instanceof z) {
            str = "ReceiveQueued";
        } else if (w9 instanceof d0) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + w9;
        }
        kotlinx.coroutines.internal.o x10 = this.f8911d.x();
        if (x10 == w9) {
            return str;
        }
        String str2 = str + ",queueSize=" + g();
        if (!(x10 instanceof q)) {
            return str2;
        }
        return str2 + ",closedForSend=" + x10;
    }

    private final void n(q<?> qVar) {
        Object b10 = kotlinx.coroutines.internal.j.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.o x10 = qVar.x();
            z zVar = x10 instanceof z ? (z) x10 : null;
            if (zVar == null) {
                break;
            } else if (!zVar.B()) {
                zVar.y();
            } else {
                b10 = kotlinx.coroutines.internal.j.c(b10, zVar);
            }
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                ((z) b10).I(qVar);
            } else {
                ArrayList arrayList = (ArrayList) b10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((z) arrayList.get(size)).I(qVar);
                }
            }
        }
        x(qVar);
    }

    private final Throwable o(q<?> qVar) {
        n(qVar);
        return qVar.P();
    }

    public final void p(xb.d<?> dVar, E e10, q<?> qVar) {
        Object a10;
        l0 d10;
        n(qVar);
        Throwable P = qVar.P();
        gc.l<E, tb.e0> lVar = this.f8910c;
        if (lVar == null || (d10 = kotlinx.coroutines.internal.v.d(lVar, e10, null, 2, null)) == null) {
            s.a aVar = tb.s.Companion;
            a10 = tb.t.a(P);
        } else {
            tb.f.a(d10, P);
            s.a aVar2 = tb.s.Companion;
            a10 = tb.t.a(d10);
        }
        dVar.y(tb.s.c(a10));
    }

    private final void q(Throwable th2) {
        kotlinx.coroutines.internal.b0 b0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (b0Var = df.b.f8908f) || !androidx.concurrent.futures.b.a(f8909q, this, obj, b0Var)) {
            return;
        }
        ((gc.l) q0.d(obj, 1)).invoke(th2);
    }

    public final boolean u() {
        return !(this.f8911d.w() instanceof b0) && t();
    }

    private final Object z(E e10, xb.d<? super tb.e0> dVar) {
        xb.d b10;
        Object c10;
        Object c11;
        b10 = yb.c.b(dVar);
        kotlinx.coroutines.q b11 = kotlinx.coroutines.s.b(b10);
        while (true) {
            if (u()) {
                d0 f0Var = this.f8910c == null ? new f0(e10, b11) : new g0(e10, b11, this.f8910c);
                Object h10 = h(f0Var);
                if (h10 == null) {
                    kotlinx.coroutines.s.c(b11, f0Var);
                    break;
                } else if (h10 instanceof q) {
                    p(b11, e10, (q) h10);
                    break;
                } else if (h10 != df.b.f8907e && !(h10 instanceof z)) {
                    throw new IllegalStateException(("enqueueSend returned " + h10).toString());
                }
            }
            Object v10 = v(e10);
            if (v10 == df.b.f8904b) {
                s.a aVar = tb.s.Companion;
                b11.y(tb.s.c(tb.e0.f22152a));
                break;
            } else if (v10 != df.b.f8905c) {
                if (!(v10 instanceof q)) {
                    throw new IllegalStateException(("offerInternal returned " + v10).toString());
                }
                p(b11, e10, (q) v10);
            }
        }
        Object s10 = b11.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return s10 == c11 ? s10 : tb.e0.f22152a;
    }

    public b0<E> A() {
        kotlinx.coroutines.internal.o oVar;
        kotlinx.coroutines.internal.o D;
        kotlinx.coroutines.internal.m mVar = this.f8911d;
        while (true) {
            oVar = (kotlinx.coroutines.internal.o) mVar.v();
            if (oVar != mVar && (oVar instanceof b0)) {
                if (((((b0) oVar) instanceof q) && !oVar.A()) || (D = oVar.D()) == null) {
                    break;
                }
                D.z();
            }
        }
        oVar = null;
        return (b0) oVar;
    }

    public final d0 B() {
        kotlinx.coroutines.internal.o oVar;
        kotlinx.coroutines.internal.o D;
        kotlinx.coroutines.internal.m mVar = this.f8911d;
        while (true) {
            oVar = (kotlinx.coroutines.internal.o) mVar.v();
            if (oVar != mVar && (oVar instanceof d0)) {
                if (((((d0) oVar) instanceof q) && !oVar.A()) || (D = oVar.D()) == null) {
                    break;
                }
                D.z();
            }
        }
        oVar = null;
        return (d0) oVar;
    }

    @Override // df.e0
    public boolean a(Throwable th2) {
        boolean z10;
        q<?> qVar = new q<>(th2);
        kotlinx.coroutines.internal.o oVar = this.f8911d;
        while (true) {
            kotlinx.coroutines.internal.o x10 = oVar.x();
            z10 = true;
            if (!(x10 instanceof q)) {
                if (x10.m(qVar, oVar)) {
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            qVar = (q) this.f8911d.x();
        }
        n(qVar);
        if (z10) {
            q(th2);
        }
        return z10;
    }

    @Override // df.e0
    public final Object c(E e10, xb.d<? super tb.e0> dVar) {
        Object c10;
        if (v(e10) == df.b.f8904b) {
            return tb.e0.f22152a;
        }
        Object z10 = z(e10, dVar);
        c10 = yb.d.c();
        return z10 == c10 ? z10 : tb.e0.f22152a;
    }

    @Override // df.e0
    public final Object d(E e10) {
        q<?> qVar;
        m.b bVar;
        Object v10 = v(e10);
        if (v10 == df.b.f8904b) {
            return m.Companion.c(tb.e0.f22152a);
        }
        if (v10 == df.b.f8905c) {
            qVar = k();
            if (qVar == null) {
                return m.Companion.b();
            }
            bVar = m.Companion;
        } else if (!(v10 instanceof q)) {
            throw new IllegalStateException(("trySend returned " + v10).toString());
        } else {
            bVar = m.Companion;
            qVar = (q) v10;
        }
        return bVar.a(o(qVar));
    }

    public Object h(d0 d0Var) {
        boolean z10;
        kotlinx.coroutines.internal.o x10;
        if (s()) {
            kotlinx.coroutines.internal.o oVar = this.f8911d;
            do {
                x10 = oVar.x();
                if (x10 instanceof b0) {
                    return x10;
                }
            } while (!x10.m(d0Var, oVar));
            return null;
        }
        kotlinx.coroutines.internal.o oVar2 = this.f8911d;
        b bVar = new b(d0Var, this);
        while (true) {
            kotlinx.coroutines.internal.o x11 = oVar2.x();
            if (!(x11 instanceof b0)) {
                int F = x11.F(d0Var, oVar2, bVar);
                z10 = true;
                if (F != 1) {
                    if (F == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return x11;
            }
        }
        if (z10) {
            return null;
        }
        return df.b.f8907e;
    }

    protected String i() {
        return BuildConfig.FLAVOR;
    }

    public final q<?> j() {
        kotlinx.coroutines.internal.o w9 = this.f8911d.w();
        q<?> qVar = w9 instanceof q ? (q) w9 : null;
        if (qVar != null) {
            n(qVar);
            return qVar;
        }
        return null;
    }

    public final q<?> k() {
        kotlinx.coroutines.internal.o x10 = this.f8911d.x();
        q<?> qVar = x10 instanceof q ? (q) x10 : null;
        if (qVar != null) {
            n(qVar);
            return qVar;
        }
        return null;
    }

    public final kotlinx.coroutines.internal.m l() {
        return this.f8911d;
    }

    protected abstract boolean s();

    protected abstract boolean t();

    public String toString() {
        return u0.a(this) + '@' + u0.b(this) + '{' + m() + '}' + i();
    }

    public Object v(E e10) {
        b0<E> A;
        do {
            A = A();
            if (A == null) {
                return df.b.f8905c;
            }
        } while (A.e(e10, null) == null);
        A.b(e10);
        return A.c();
    }

    protected void x(kotlinx.coroutines.internal.o oVar) {
    }

    public final b0<?> y(E e10) {
        kotlinx.coroutines.internal.o x10;
        kotlinx.coroutines.internal.o oVar = this.f8911d;
        a aVar = new a(e10);
        do {
            x10 = oVar.x();
            if (x10 instanceof b0) {
                return (b0) x10;
            }
        } while (!x10.m(aVar, oVar));
        return null;
    }
}
