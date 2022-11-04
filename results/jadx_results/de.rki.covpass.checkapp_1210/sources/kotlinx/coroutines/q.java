package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b{\u0010|J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010i\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010cR \u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010p\u001a\u00020o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u00108R\u0014\u0010v\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\bR\u0014\u0010w\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\bR\u001c\u0010z\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Lkotlinx/coroutines/q;", "T", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/p;", "Lzb/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", BuildConfig.FLAVOR, "C", "()Z", BuildConfig.FLAVOR, "cause", "m", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Ltb/e0;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "j", "(Lgc/l;Ljava/lang/Throwable;)V", "Q", "O", "Lkotlinx/coroutines/h1;", "B", "()Lkotlinx/coroutines/h1;", "H", "()V", BuildConfig.FLAVOR, "state", "E", "(Lgc/l;Ljava/lang/Object;)V", "Lkotlinx/coroutines/n;", "D", "(Lgc/l;)Lkotlinx/coroutines/n;", BuildConfig.FLAVOR, "mode", "q", "(I)V", "Lkotlinx/coroutines/p2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "M", "(Lkotlinx/coroutines/p2;Ljava/lang/Object;ILgc/l;Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;ILgc/l;)V", "Lkotlinx/coroutines/internal/b0;", "P", "(Ljava/lang/Object;Ljava/lang/Object;Lgc/l;)Lkotlinx/coroutines/internal/b0;", BuildConfig.FLAVOR, "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "o", "z", "J", "h", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "g", "G", "(Ljava/lang/Throwable;)V", "k", "(Lkotlinx/coroutines/n;Ljava/lang/Throwable;)V", "l", "Lkotlinx/coroutines/a2;", "parent", "r", "(Lkotlinx/coroutines/a2;)Ljava/lang/Throwable;", "s", "Ltb/s;", "result", "y", "(Ljava/lang/Object;)V", "value", "I", "(Ljava/lang/Object;Lgc/l;)V", "N", "(Lgc/l;)V", "n", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "A", "(Ljava/lang/Object;Ljava/lang/Object;Lgc/l;)Ljava/lang/Object;", "exception", "b0", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "c0", "Lkotlinx/coroutines/l0;", "v", "(Lkotlinx/coroutines/l0;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "F", "U3", "Lkotlinx/coroutines/h1;", "parentHandle", "w", "stateDebugRepresentation", "Lxb/d;", "delegate", "Lxb/d;", "c", "()Lxb/d;", "Lxb/g;", "context", "Lxb/g;", "b", "()Lxb/g;", "u", "p", "isCompleted", "isCancelled", "x", "()Lzb/e;", "callerFrame", "<init>", "(Lxb/d;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class q<T> extends d1<T> implements p<T>, zb.e {
    private static final /* synthetic */ AtomicIntegerFieldUpdater V3 = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater W3 = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private h1 U3;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = d.f15323c;

    /* renamed from: x */
    private final xb.d<T> f15499x;

    /* renamed from: y */
    private final xb.g f15500y;

    /* JADX WARN: Multi-variable type inference failed */
    public q(xb.d<? super T> dVar, int i10) {
        super(i10);
        this.f15499x = dVar;
        this.f15500y = dVar.b();
    }

    private final h1 B() {
        a2 a2Var = (a2) b().i(a2.W0);
        if (a2Var == null) {
            return null;
        }
        h1 d10 = a2.a.d(a2Var, true, false, new u(this), 2, null);
        this.U3 = d10;
        return d10;
    }

    private final boolean C() {
        return e1.c(this.f15326q) && ((kotlinx.coroutines.internal.f) this.f15499x).m();
    }

    private final n D(gc.l<? super Throwable, tb.e0> lVar) {
        return lVar instanceof n ? (n) lVar : new x1(lVar);
    }

    private final void E(gc.l<? super Throwable, tb.e0> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void H() {
        Throwable q10;
        xb.d<T> dVar = this.f15499x;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        if (fVar == null || (q10 = fVar.q(this)) == null) {
            return;
        }
        n();
        g(q10);
    }

    private final void K(Object obj, int i10, gc.l<? super Throwable, tb.e0> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof p2)) {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        l(lVar, tVar.f15325a);
                        return;
                    }
                }
                i(obj);
                throw new tb.i();
            }
        } while (!androidx.concurrent.futures.b.a(W3, this, obj2, M((p2) obj2, obj, i10, lVar, null)));
        o();
        q(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void L(q qVar, Object obj, int i10, gc.l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            qVar.K(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object M(p2 p2Var, Object obj, int i10, gc.l<? super Throwable, tb.e0> lVar, Object obj2) {
        if (obj instanceof d0) {
            return obj;
        }
        if (!e1.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(p2Var instanceof n) || (p2Var instanceof g)) && obj2 == null)) {
            return obj;
        }
        return new c0(obj, p2Var instanceof n ? (n) p2Var : null, lVar, obj2, null, 16, null);
    }

    private final boolean O() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                return false;
            }
        } while (!V3.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.b0 P(Object obj, Object obj2, gc.l<? super Throwable, tb.e0> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof p2)) {
                if ((obj3 instanceof c0) && obj2 != null && ((c0) obj3).f15319d == obj2) {
                    return r.f15503a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(W3, this, obj3, M((p2) obj3, obj, this.f15326q, lVar, obj2)));
        o();
        return r.f15503a;
    }

    private final boolean Q() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                return false;
            }
        } while (!V3.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void j(gc.l<? super Throwable, tb.e0> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            xb.g b10 = b();
            o0.a(b10, new g0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean m(Throwable th2) {
        if (!C()) {
            return false;
        }
        return ((kotlinx.coroutines.internal.f) this.f15499x).n(th2);
    }

    private final void o() {
        if (!C()) {
            n();
        }
    }

    private final void q(int i10) {
        if (O()) {
            return;
        }
        e1.a(this, i10);
    }

    private final String w() {
        Object u10 = u();
        return u10 instanceof p2 ? "Active" : u10 instanceof t ? "Cancelled" : "Completed";
    }

    @Override // kotlinx.coroutines.p
    public Object A(T t10, Object obj, gc.l<? super Throwable, tb.e0> lVar) {
        return P(t10, obj, lVar);
    }

    protected String F() {
        return "CancellableContinuation";
    }

    public final void G(Throwable th2) {
        if (m(th2)) {
            return;
        }
        g(th2);
        o();
    }

    @Override // kotlinx.coroutines.p
    public void I(T t10, gc.l<? super Throwable, tb.e0> lVar) {
        K(t10, this.f15326q, lVar);
    }

    public final boolean J() {
        Object obj = this._state;
        if ((obj instanceof c0) && ((c0) obj).f15319d != null) {
            n();
            return false;
        }
        this._decision = 0;
        this._state = d.f15323c;
        return true;
    }

    @Override // kotlinx.coroutines.p
    public void N(gc.l<? super Throwable, tb.e0> lVar) {
        n D = D(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.b.a(W3, this, obj, D)) {
                    return;
                }
            } else if (obj instanceof n) {
                E(lVar, obj);
            } else {
                boolean z10 = obj instanceof d0;
                if (z10) {
                    d0 d0Var = (d0) obj;
                    if (!d0Var.b()) {
                        E(lVar, obj);
                    }
                    if (!(obj instanceof t)) {
                        return;
                    }
                    Throwable th2 = null;
                    if (!z10) {
                        d0Var = null;
                    }
                    if (d0Var != null) {
                        th2 = d0Var.f15325a;
                    }
                    j(lVar, th2);
                    return;
                } else if (obj instanceof c0) {
                    c0 c0Var = (c0) obj;
                    if (c0Var.f15317b != null) {
                        E(lVar, obj);
                    }
                    if (D instanceof g) {
                        return;
                    }
                    if (c0Var.c()) {
                        j(lVar, c0Var.f15320e);
                        return;
                    }
                    if (androidx.concurrent.futures.b.a(W3, this, obj, c0.b(c0Var, null, D, null, null, null, 29, null))) {
                        return;
                    }
                } else if (D instanceof g) {
                    return;
                } else {
                    if (androidx.concurrent.futures.b.a(W3, this, obj, new c0(obj, D, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.d1
    public void a(Object obj, Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof p2)) {
                if (obj2 instanceof d0) {
                    return;
                }
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!(!c0Var.c())) {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                    if (androidx.concurrent.futures.b.a(W3, this, obj2, c0.b(c0Var, null, null, null, null, th2, 15, null))) {
                        c0Var.d(this, th2);
                        return;
                    }
                } else if (androidx.concurrent.futures.b.a(W3, this, obj2, new c0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // xb.d
    public xb.g b() {
        return this.f15500y;
    }

    @Override // kotlinx.coroutines.p
    public Object b0(Throwable th2) {
        return P(new d0(th2, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.d1
    public final xb.d<T> c() {
        return this.f15499x;
    }

    @Override // kotlinx.coroutines.p
    public void c0(Object obj) {
        q(this.f15326q);
    }

    @Override // kotlinx.coroutines.d1
    public Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.d1
    public <T> T e(Object obj) {
        return obj instanceof c0 ? (T) ((c0) obj).f15316a : obj;
    }

    @Override // kotlinx.coroutines.p
    public boolean g(Throwable th2) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof p2)) {
                return false;
            }
            z10 = obj instanceof n;
        } while (!androidx.concurrent.futures.b.a(W3, this, obj, new t(this, th2, z10)));
        n nVar = z10 ? (n) obj : null;
        if (nVar != null) {
            k(nVar, th2);
        }
        o();
        q(this.f15326q);
        return true;
    }

    @Override // kotlinx.coroutines.d1
    public Object h() {
        return u();
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
        return u() instanceof t;
    }

    public final void k(n nVar, Throwable th2) {
        try {
            nVar.a(th2);
        } catch (Throwable th3) {
            xb.g b10 = b();
            o0.a(b10, new g0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(gc.l<? super Throwable, tb.e0> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            xb.g b10 = b();
            o0.a(b10, new g0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void n() {
        h1 h1Var = this.U3;
        if (h1Var == null) {
            return;
        }
        h1Var.g();
        this.U3 = o2.f15496c;
    }

    @Override // kotlinx.coroutines.p
    public boolean p() {
        return !(u() instanceof p2);
    }

    public Throwable r(a2 a2Var) {
        return a2Var.w0();
    }

    public final Object s() {
        a2 a2Var;
        Object c10;
        boolean C = C();
        if (Q()) {
            if (this.U3 == null) {
                B();
            }
            if (C) {
                H();
            }
            c10 = yb.d.c();
            return c10;
        }
        if (C) {
            H();
        }
        Object u10 = u();
        if (u10 instanceof d0) {
            throw ((d0) u10).f15325a;
        }
        if (!e1.b(this.f15326q) || (a2Var = (a2) b().i(a2.W0)) == null || a2Var.j()) {
            return e(u10);
        }
        CancellationException w02 = a2Var.w0();
        a(u10, w02);
        throw w02;
    }

    @Override // kotlinx.coroutines.p
    public Object t(T t10, Object obj) {
        return P(t10, obj, null);
    }

    public String toString() {
        return F() + '(' + u0.c(this.f15499x) + "){" + w() + "}@" + u0.b(this);
    }

    public final Object u() {
        return this._state;
    }

    @Override // kotlinx.coroutines.p
    public void v(l0 l0Var, T t10) {
        xb.d<T> dVar = this.f15499x;
        l0 l0Var2 = null;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        if (fVar != null) {
            l0Var2 = fVar.f15415x;
        }
        L(this, t10, l0Var2 == l0Var ? 4 : this.f15326q, null, 4, null);
    }

    @Override // zb.e
    public zb.e x() {
        xb.d<T> dVar = this.f15499x;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }

    @Override // xb.d
    public void y(Object obj) {
        L(this, h0.c(obj, this), this.f15326q, null, 4, null);
    }

    public void z() {
        h1 B = B();
        if (B != null && p()) {
            B.g();
            this.U3 = o2.f15496c;
        }
    }
}
