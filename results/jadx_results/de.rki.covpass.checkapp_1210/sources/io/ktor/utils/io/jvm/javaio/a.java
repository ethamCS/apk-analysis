package io.ktor.utils.io.jvm.javaio;

import hc.q0;
import hc.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.n1;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.p;
import tb.s;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\"\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R$\u0010\u0012\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b)\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/a;", BuildConfig.FLAVOR, "Ljava/lang/Thread;", "thread", "Ltb/e0;", "i", "(Ljava/lang/Thread;)V", "Lxb/d;", "ucont", "j", "(Lxb/d;)Ljava/lang/Object;", "h", "k", "()V", BuildConfig.FLAVOR, "buffer", BuildConfig.FLAVOR, "offset", "length", "m", "([BII)I", "jobToken", "l", "(Ljava/lang/Object;)I", "rc", "d", "(I)V", "Lkotlinx/coroutines/a2;", "a", "Lkotlinx/coroutines/a2;", "g", "()Lkotlinx/coroutines/a2;", "parent", "Lkotlinx/coroutines/h1;", "c", "Lkotlinx/coroutines/h1;", "disposable", "<set-?>", "I", "f", "()I", "e", "<init>", "(Lkotlinx/coroutines/a2;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f */
    static final /* synthetic */ AtomicReferenceFieldUpdater f12919f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a */
    private final a2 f12920a;

    /* renamed from: b */
    private final xb.d<e0> f12921b;

    /* renamed from: c */
    private final h1 f12922c;

    /* renamed from: d */
    private int f12923d;

    /* renamed from: e */
    private int f12924e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.jvm.javaio.a$a */
    /* loaded from: classes.dex */
    public static final class C0197a extends l implements gc.l<xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f12925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0197a(xb.d<? super C0197a> dVar) {
            super(1, dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f12925y;
            if (i10 == 0) {
                t.b(obj);
                a aVar = a.this;
                this.f12925y = 1;
                if (aVar.h(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        public final xb.d<e0> d0(xb.d<?> dVar) {
            return new C0197a(dVar);
        }

        /* renamed from: e0 */
        public final Object invoke(xb.d<? super e0> dVar) {
            return ((C0197a) d0(dVar)).B(e0.f22152a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "cause", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<Throwable, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            a.this = r1;
        }

        public final void b(Throwable th2) {
            if (th2 != null) {
                xb.d dVar = a.this.f12921b;
                s.a aVar = s.Companion;
                dVar.y(s.c(t.a(th2)));
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"io/ktor/utils/io/jvm/javaio/a$c", "Lxb/d;", "Ltb/e0;", "Ltb/s;", "result", "y", "(Ljava/lang/Object;)V", "Lxb/g;", "context", "Lxb/g;", "b", "()Lxb/g;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c implements xb.d<e0> {

        /* renamed from: c */
        private final xb.g f12927c;

        c() {
            a.this = r2;
            this.f12927c = r2.g() != null ? i.f12943q.B(r2.g()) : i.f12943q;
        }

        @Override // xb.d
        public xb.g b() {
            return this.f12927c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xb.d
        public void y(Object obj) {
            Object obj2;
            boolean z10;
            a2 g10;
            Throwable g11;
            Object g12 = s.g(obj);
            if (g12 == null) {
                g12 = e0.f22152a;
            }
            a aVar = a.this;
            do {
                obj2 = aVar.state;
                z10 = obj2 instanceof Thread;
                if (!(z10 ? true : obj2 instanceof xb.d ? true : hc.t.a(obj2, this))) {
                    return;
                }
            } while (!androidx.concurrent.futures.b.a(a.f12919f, aVar, obj2, g12));
            if (z10) {
                f.a().b(obj2);
            } else if ((obj2 instanceof xb.d) && (g11 = s.g(obj)) != null) {
                s.a aVar2 = s.Companion;
                ((xb.d) obj2).y(s.c(t.a(g11)));
            }
            if (s.i(obj) && !(s.g(obj) instanceof CancellationException) && (g10 = a.this.g()) != null) {
                a2.a.a(g10, null, 1, null);
            }
            h1 h1Var = a.this.f12922c;
            if (h1Var == null) {
                return;
            }
            h1Var.g();
        }
    }

    public a() {
        this(null, 1, null);
    }

    public a(a2 a2Var) {
        this.f12920a = a2Var;
        c cVar = new c();
        this.f12921b = cVar;
        this.state = this;
        boolean z10 = false;
        this.result = 0;
        this.f12922c = a2Var == null ? null : a2Var.D0(new b());
        ((gc.l) q0.d(new C0197a(null), 1)).invoke(cVar);
        if (this.state != this ? true : z10) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public /* synthetic */ a(a2 a2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : a2Var);
    }

    private final void i(Thread thread) {
        if (this.state != thread) {
            return;
        }
        while (true) {
            long b10 = n1.b();
            if (this.state != thread) {
                return;
            }
            if (b10 > 0) {
                f.a().a(b10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(xb.d<Object> dVar) {
        Object obj;
        xb.d dVar2;
        Object c10;
        xb.d b10;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                dVar2 = yb.c.b(dVar);
                obj = obj3;
            } else if (!hc.t.a(obj3, this)) {
                throw new IllegalStateException("Already suspended or in finished state");
            } else {
                b10 = yb.c.b(dVar);
                obj = obj2;
                dVar2 = b10;
            }
            if (androidx.concurrent.futures.b.a(f12919f, this, obj3, dVar2)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                c10 = yb.d.c();
                return c10;
            }
            obj2 = obj;
        }
    }

    public final void d(int i10) {
        this.result = i10;
    }

    public final int e() {
        return this.f12924e;
    }

    public final int f() {
        return this.f12923d;
    }

    public final a2 g() {
        return this.f12920a;
    }

    protected abstract Object h(xb.d<? super e0> dVar);

    public final void k() {
        h1 h1Var = this.f12922c;
        if (h1Var != null) {
            h1Var.g();
        }
        xb.d<e0> dVar = this.f12921b;
        s.a aVar = s.Companion;
        dVar.y(s.c(t.a(new CancellationException("Stream closed"))));
    }

    public final int l(Object obj) {
        Object obj2;
        Object obj3;
        hc.t.e(obj, "jobToken");
        Thread currentThread = Thread.currentThread();
        xb.d dVar = null;
        do {
            obj2 = this.state;
            if (obj2 instanceof xb.d) {
                dVar = (xb.d) obj2;
                obj3 = currentThread;
            } else if (obj2 instanceof e0) {
                return this.result;
            } else {
                if (obj2 instanceof Throwable) {
                    throw ((Throwable) obj2);
                }
                if (obj2 instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (hc.t.a(obj2, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                obj3 = new p();
            }
            hc.t.d(obj3, "when (value) {\n         …Exception()\n            }");
        } while (!androidx.concurrent.futures.b.a(f12919f, this, obj2, obj3));
        hc.t.b(dVar);
        s.a aVar = s.Companion;
        dVar.y(s.c(obj));
        hc.t.d(currentThread, "thread");
        i(currentThread);
        Object obj4 = this.state;
        if (!(obj4 instanceof Throwable)) {
            return this.result;
        }
        throw ((Throwable) obj4);
    }

    public final int m(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "buffer");
        this.f12923d = i10;
        this.f12924e = i11;
        return l(bArr);
    }
}
