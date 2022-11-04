package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.b3;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010-\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b=\u0010>J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00101\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u000bR\u0014\u00103\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001a\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lkotlinx/coroutines/internal/f;", "T", "Lkotlinx/coroutines/d1;", "Lzb/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lxb/d;", BuildConfig.FLAVOR, "m", "()Z", "Ltb/e0;", "i", "()V", "o", "Lkotlinx/coroutines/q;", "j", "()Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/p;", "continuation", BuildConfig.FLAVOR, "q", "(Lkotlinx/coroutines/p;)Ljava/lang/Throwable;", "cause", "n", "(Ljava/lang/Throwable;)Z", BuildConfig.FLAVOR, "h", "()Ljava/lang/Object;", "Ltb/s;", "result", "y", "(Ljava/lang/Object;)V", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lxb/g;", "context", "value", "k", "(Lxb/g;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/l0;", "x", "Lkotlinx/coroutines/l0;", "dispatcher", "U3", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "V3", "countOrElement", "l", "reusableCancellableContinuation", "b", "()Lxb/g;", "()Lzb/e;", "callerFrame", "c", "()Lxb/d;", "delegate", "<init>", "(Lkotlinx/coroutines/l0;Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f<T> extends d1<T> implements zb.e, xb.d<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater W3 = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    public Object U3 = g.a();
    public final Object V3 = f0.b(b());
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: x */
    public final kotlinx.coroutines.l0 f15415x;

    /* renamed from: y */
    public final xb.d<T> f15416y;

    /* JADX WARN: Multi-variable type inference failed */
    public f(kotlinx.coroutines.l0 l0Var, xb.d<? super T> dVar) {
        super(-1);
        b0 b0Var;
        this.f15415x = l0Var;
        this.f15416y = dVar;
        b0Var = g.f15424a;
        this.U3 = b0Var;
    }

    private final kotlinx.coroutines.q<?> l() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.q) {
            return (kotlinx.coroutines.q) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.d1
    public void a(Object obj, Throwable th2) {
        if (obj instanceof kotlinx.coroutines.e0) {
            ((kotlinx.coroutines.e0) obj).f15335b.invoke(th2);
        }
    }

    @Override // xb.d
    public xb.g b() {
        return this.f15416y.b();
    }

    @Override // kotlinx.coroutines.d1
    public xb.d<T> c() {
        return this;
    }

    @Override // kotlinx.coroutines.d1
    public Object h() {
        b0 b0Var;
        Object obj = this.U3;
        b0Var = g.f15424a;
        this.U3 = b0Var;
        return obj;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == g.f15425b);
    }

    public final kotlinx.coroutines.q<T> j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f15425b;
                return null;
            } else if (obj instanceof kotlinx.coroutines.q) {
                if (androidx.concurrent.futures.b.a(W3, this, obj, g.f15425b)) {
                    return (kotlinx.coroutines.q) obj;
                }
            } else if (obj != g.f15425b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(xb.g gVar, T t10) {
        this.U3 = t10;
        this.f15326q = 1;
        this.f15415x.O0(gVar, this);
    }

    public final boolean m() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean n(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            b0 b0Var = g.f15425b;
            if (hc.t.a(obj, b0Var)) {
                if (androidx.concurrent.futures.b.a(W3, this, b0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.b.a(W3, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        i();
        kotlinx.coroutines.q<?> l10 = l();
        if (l10 != null) {
            l10.n();
        }
    }

    public final Throwable q(kotlinx.coroutines.p<?> pVar) {
        b0 b0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            b0Var = g.f15425b;
            if (obj != b0Var) {
                if (obj instanceof Throwable) {
                    if (!androidx.concurrent.futures.b.a(W3, this, obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(W3, this, b0Var, pVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f15415x + ", " + u0.c(this.f15416y) + ']';
    }

    @Override // zb.e
    public zb.e x() {
        xb.d<T> dVar = this.f15416y;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }

    @Override // xb.d
    public void y(Object obj) {
        xb.g b10 = this.f15416y.b();
        Object d10 = kotlinx.coroutines.h0.d(obj, null, 1, null);
        if (this.f15415x.R0(b10)) {
            this.U3 = d10;
            this.f15326q = 0;
            this.f15415x.u0(b10, this);
            return;
        }
        k1 b11 = b3.f15314a.b();
        if (b11.o1()) {
            this.U3 = d10;
            this.f15326q = 0;
            b11.k1(this);
            return;
        }
        b11.m1(true);
        try {
            xb.g b12 = b();
            Object c10 = f0.c(b12, this.V3);
            this.f15416y.y(obj);
            tb.e0 e0Var = tb.e0.f22152a;
            f0.a(b12, c10);
            do {
            } while (b11.r1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
