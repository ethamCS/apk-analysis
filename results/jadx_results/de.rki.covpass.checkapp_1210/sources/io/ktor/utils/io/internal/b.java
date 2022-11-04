package io.ktor.utils.io.internal;

import hc.t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.h1;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0010\u0010\n\u001a\f0\tR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lio/ktor/utils/io/internal/b;", BuildConfig.FLAVOR, "T", "Lxb/d;", "Lxb/g;", "context", "Ltb/e0;", "i", "(Lxb/g;)V", "Lio/ktor/utils/io/internal/b$a;", "relation", "h", "(Lio/ktor/utils/io/internal/b$a;)V", "Lkotlinx/coroutines/a2;", "job", BuildConfig.FLAVOR, "exception", "j", "(Lkotlinx/coroutines/a2;Ljava/lang/Throwable;)V", "value", "d", "(Ljava/lang/Object;)V", "cause", "e", "(Ljava/lang/Throwable;)V", "actual", "f", "(Lxb/d;)Ljava/lang/Object;", "Ltb/s;", "result", "y", "b", "()Lxb/g;", "<init>", "()V", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b<T> implements xb.d<T> {

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12871c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12872d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010\u0007\u001a\u00020\u0003R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/internal/b$a;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "Lkotlinx/coroutines/CompletionHandler;", "cause", "c", "a", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/a2;", "b", "()Lkotlinx/coroutines/a2;", "job", "Lkotlinx/coroutines/h1;", "d", "Lkotlinx/coroutines/h1;", "handler", "<init>", "(Lio/ktor/utils/io/internal/b;Lkotlinx/coroutines/a2;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class a implements gc.l<Throwable, e0> {

        /* renamed from: c */
        private final a2 f12873c;

        /* renamed from: d */
        private h1 f12874d;

        /* renamed from: q */
        final /* synthetic */ b<T> f12875q;

        public a(b bVar, a2 a2Var) {
            t.e(bVar, "this$0");
            t.e(a2Var, "job");
            this.f12875q = bVar;
            this.f12873c = a2Var;
            h1 d10 = a2.a.d(a2Var, true, false, this, 2, null);
            if (a2Var.j()) {
                this.f12874d = d10;
            }
        }

        public final void a() {
            h1 h1Var = this.f12874d;
            if (h1Var == null) {
                return;
            }
            this.f12874d = null;
            h1Var.g();
        }

        public final a2 b() {
            return this.f12873c;
        }

        public void c(Throwable th2) {
            this.f12875q.h(this);
            a();
            if (th2 != null) {
                this.f12875q.j(this.f12873c, th2);
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            c(th2);
            return e0.f22152a;
        }
    }

    public final void h(b<T>.a aVar) {
        androidx.concurrent.futures.b.a(f12872d, this, aVar, null);
    }

    private final void i(xb.g gVar) {
        Object obj;
        a aVar;
        a2 a2Var = (a2) gVar.i(a2.W0);
        a aVar2 = (a) this.jobCancellationHandler;
        if ((aVar2 == null ? null : aVar2.b()) == a2Var) {
            return;
        }
        if (a2Var == null) {
            a aVar3 = (a) f12872d.getAndSet(this, null);
            if (aVar3 == null) {
                return;
            }
            aVar3.a();
            return;
        }
        a aVar4 = new a(this, a2Var);
        do {
            obj = this.jobCancellationHandler;
            aVar = (a) obj;
            if (aVar != null && aVar.b() == a2Var) {
                aVar4.a();
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f12872d, this, obj, aVar4));
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void j(a2 a2Var, Throwable th2) {
        Object obj;
        do {
            obj = this.state;
            if (!(obj instanceof xb.d) || ((xb.d) obj).b().i(a2.W0) != a2Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f12871c, this, obj, null));
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        s.a aVar = s.Companion;
        ((xb.d) obj).y(s.c(tb.t.a(th2)));
    }

    @Override // xb.d
    public xb.g b() {
        Object obj = this.state;
        xb.g gVar = null;
        xb.d dVar = obj instanceof xb.d ? (xb.d) obj : null;
        if (dVar != null) {
            gVar = dVar.b();
        }
        return gVar == null ? xb.h.f25516c : gVar;
    }

    public final void d(T t10) {
        t.e(t10, "value");
        s.a aVar = s.Companion;
        y(s.c(t10));
        a aVar2 = (a) f12872d.getAndSet(this, null);
        if (aVar2 == null) {
            return;
        }
        aVar2.a();
    }

    public final void e(Throwable th2) {
        t.e(th2, "cause");
        s.a aVar = s.Companion;
        y(s.c(tb.t.a(th2)));
        a aVar2 = (a) f12872d.getAndSet(this, null);
        if (aVar2 == null) {
            return;
        }
        aVar2.a();
    }

    public final Object f(xb.d<? super T> dVar) {
        Object c10;
        t.e(dVar, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f12871c, this, null, dVar)) {
                    i(dVar.b());
                    c10 = yb.d.c();
                    return c10;
                }
            } else if (androidx.concurrent.futures.b.a(f12871c, this, obj, null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                return obj;
            }
        }
    }

    @Override // xb.d
    public void y(Object obj) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                obj3 = s.g(obj);
                if (obj3 == null) {
                    tb.t.b(obj);
                    obj3 = obj;
                }
            } else if (!(obj2 instanceof xb.d)) {
                return;
            } else {
                obj3 = null;
            }
        } while (!androidx.concurrent.futures.b.a(f12871c, this, obj2, obj3));
        if (obj2 instanceof xb.d) {
            ((xb.d) obj2).y(obj);
        }
    }
}
