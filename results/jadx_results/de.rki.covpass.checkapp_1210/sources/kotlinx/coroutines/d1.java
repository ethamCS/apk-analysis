package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lkotlinx/coroutines/d1;", "T", "Lkotlinx/coroutines/scheduling/j;", "Lkotlinx/coroutines/SchedulerTask;", BuildConfig.FLAVOR, "h", "()Ljava/lang/Object;", "takenState", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "f", BuildConfig.FLAVOR, "q", "I", "resumeMode", "Lxb/d;", "c", "()Lxb/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class d1<T> extends kotlinx.coroutines.scheduling.j {

    /* renamed from: q */
    public int f15326q;

    public d1(int i10) {
        this.f15326q = i10;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract xb.d<T> c();

    public Throwable d(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f15325a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            tb.f.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        hc.t.b(th2);
        o0.a(c().b(), new t0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object c10;
        Object obj2;
        kotlinx.coroutines.scheduling.k kVar = this.f15539d;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) c();
            xb.d<T> dVar = fVar.f15416y;
            Object obj3 = fVar.V3;
            xb.g b10 = dVar.b();
            Object c11 = kotlinx.coroutines.internal.f0.c(b10, obj3);
            d3<?> g10 = c11 != kotlinx.coroutines.internal.f0.f15417a ? k0.g(dVar, b10, c11) : null;
            xb.g b11 = dVar.b();
            Object h10 = h();
            Throwable d10 = d(h10);
            a2 a2Var = (d10 != null || !e1.b(this.f15326q)) ? null : (a2) b11.i(a2.W0);
            if (a2Var != null && !a2Var.j()) {
                CancellationException w02 = a2Var.w0();
                a(h10, w02);
                s.a aVar = tb.s.Companion;
                c10 = tb.s.c(tb.t.a(w02));
            } else if (d10 != null) {
                s.a aVar2 = tb.s.Companion;
                c10 = tb.s.c(tb.t.a(d10));
            } else {
                s.a aVar3 = tb.s.Companion;
                c10 = tb.s.c(e(h10));
            }
            dVar.y(c10);
            tb.e0 e0Var = tb.e0.f22152a;
            if (g10 == null || g10.m1()) {
                kotlinx.coroutines.internal.f0.a(b10, c11);
            }
            try {
                s.a aVar4 = tb.s.Companion;
                kVar.h();
                obj2 = tb.s.c(e0Var);
            } catch (Throwable th2) {
                s.a aVar5 = tb.s.Companion;
                obj2 = tb.s.c(tb.t.a(th2));
            }
            f(null, tb.s.g(obj2));
        } catch (Throwable th3) {
            try {
                s.a aVar6 = tb.s.Companion;
                kVar.h();
                obj = tb.s.c(tb.e0.f22152a);
            } catch (Throwable th4) {
                s.a aVar7 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th4));
            }
            f(th3, tb.s.g(obj));
        }
    }
}
