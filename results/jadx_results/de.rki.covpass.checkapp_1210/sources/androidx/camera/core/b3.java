package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b3;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w.r0;
/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a */
    private final Object f2102a = new Object();

    /* renamed from: b */
    private final Size f2103b;

    /* renamed from: c */
    private final boolean f2104c;

    /* renamed from: d */
    private final w.d0 f2105d;

    /* renamed from: e */
    final x5.a<Surface> f2106e;

    /* renamed from: f */
    private final c.a<Surface> f2107f;

    /* renamed from: g */
    private final x5.a<Void> f2108g;

    /* renamed from: h */
    private final c.a<Void> f2109h;

    /* renamed from: i */
    private final w.r0 f2110i;

    /* renamed from: j */
    private g f2111j;

    /* renamed from: k */
    private h f2112k;

    /* renamed from: l */
    private Executor f2113l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ c.a f2114a;

        /* renamed from: b */
        final /* synthetic */ x5.a f2115b;

        a(c.a aVar, x5.a aVar2) {
            b3.this = r1;
            this.f2114a = aVar;
            this.f2115b = aVar2;
        }

        @Override // y.c
        public void a(Throwable th2) {
            androidx.core.util.h.i(th2 instanceof e ? this.f2115b.cancel(false) : this.f2114a.c(null));
        }

        /* renamed from: c */
        public void b(Void r22) {
            androidx.core.util.h.i(this.f2114a.c(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends w.r0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Size size, int i10) {
            super(size, i10);
            b3.this = r1;
        }

        @Override // w.r0
        protected x5.a<Surface> n() {
            return b3.this.f2106e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements y.c<Surface> {

        /* renamed from: a */
        final /* synthetic */ x5.a f2118a;

        /* renamed from: b */
        final /* synthetic */ c.a f2119b;

        /* renamed from: c */
        final /* synthetic */ String f2120c;

        c(x5.a aVar, c.a aVar2, String str) {
            b3.this = r1;
            this.f2118a = aVar;
            this.f2119b = aVar2;
            this.f2120c = str;
        }

        @Override // y.c
        public void a(Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f2119b.c(null);
                return;
            }
            c.a aVar = this.f2119b;
            androidx.core.util.h.i(aVar.f(new e(this.f2120c + " cancelled.", th2)));
        }

        /* renamed from: c */
        public void b(Surface surface) {
            y.f.k(this.f2118a, this.f2119b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ androidx.core.util.a f2122a;

        /* renamed from: b */
        final /* synthetic */ Surface f2123b;

        d(androidx.core.util.a aVar, Surface surface) {
            b3.this = r1;
            this.f2122a = aVar;
            this.f2123b = surface;
        }

        @Override // y.c
        public void a(Throwable th2) {
            androidx.core.util.h.j(th2 instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f2122a.a(f.c(1, this.f2123b));
        }

        /* renamed from: c */
        public void b(Void r32) {
            this.f2122a.a(f.c(0, this.f2123b));
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends RuntimeException {
        e(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        static f c(int i10, Surface surface) {
            return new i(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public static g d(Rect rect, int i10, int i11) {
            return new j(rect, i10, i11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract int c();
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(g gVar);
    }

    public b3(Size size, w.d0 d0Var, boolean z10) {
        this.f2103b = size;
        this.f2105d = d0Var;
        this.f2104c = z10;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        x5.a a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.u2
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = b3.n(atomicReference, str, aVar);
                return n10;
            }
        });
        c.a<Void> aVar = (c.a) androidx.core.util.h.g((c.a) atomicReference.get());
        this.f2109h = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        x5.a<Void> a11 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.v2
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar2) {
                Object o10;
                o10 = b3.o(atomicReference2, str, aVar2);
                return o10;
            }
        });
        this.f2108g = a11;
        y.f.b(a11, new a(aVar, a10), x.a.a());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        x5.a<Surface> a12 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.t2
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar2) {
                Object p10;
                p10 = b3.p(atomicReference3, str, aVar2);
                return p10;
            }
        });
        this.f2106e = a12;
        this.f2107f = (c.a) androidx.core.util.h.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f2110i = bVar;
        x5.a<Void> i10 = bVar.i();
        y.f.b(a12, new c(i10, (c.a) androidx.core.util.h.g((c.a) atomicReference2.get()), str), x.a.a());
        i10.b(new Runnable() { // from class: androidx.camera.core.y2
            @Override // java.lang.Runnable
            public final void run() {
                b3.this.q();
            }
        }, x.a.a());
    }

    public static /* synthetic */ Object n(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object o(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public static /* synthetic */ Object p(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public /* synthetic */ void q() {
        this.f2106e.cancel(true);
    }

    public static /* synthetic */ void r(androidx.core.util.a aVar, Surface surface) {
        aVar.a(f.c(3, surface));
    }

    public static /* synthetic */ void s(androidx.core.util.a aVar, Surface surface) {
        aVar.a(f.c(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void i(Executor executor, Runnable runnable) {
        this.f2109h.a(runnable, executor);
    }

    public w.d0 j() {
        return this.f2105d;
    }

    public w.r0 k() {
        return this.f2110i;
    }

    public Size l() {
        return this.f2103b;
    }

    public boolean m() {
        return this.f2104c;
    }

    public void v(final Surface surface, Executor executor, final androidx.core.util.a<f> aVar) {
        if (this.f2107f.c(surface) || this.f2106e.isCancelled()) {
            y.f.b(this.f2108g, new d(aVar, surface), executor);
            return;
        }
        androidx.core.util.h.i(this.f2106e.isDone());
        try {
            this.f2106e.get();
            executor.execute(new Runnable() { // from class: androidx.camera.core.z2
                @Override // java.lang.Runnable
                public final void run() {
                    b3.r(androidx.core.util.a.this, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.a3
                @Override // java.lang.Runnable
                public final void run() {
                    b3.s(androidx.core.util.a.this, surface);
                }
            });
        }
    }

    public void w(Executor executor, final h hVar) {
        final g gVar;
        synchronized (this.f2102a) {
            this.f2112k = hVar;
            this.f2113l = executor;
            gVar = this.f2111j;
        }
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: androidx.camera.core.w2
                @Override // java.lang.Runnable
                public final void run() {
                    b3.h.this.a(gVar);
                }
            });
        }
    }

    public void x(final g gVar) {
        final h hVar;
        Executor executor;
        synchronized (this.f2102a) {
            this.f2111j = gVar;
            hVar = this.f2112k;
            executor = this.f2113l;
        }
        if (hVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.core.x2
            @Override // java.lang.Runnable
            public final void run() {
                b3.h.this.a(gVar);
            }
        });
    }

    public boolean y() {
        return this.f2107f.f(new r0.b("Surface request will not complete."));
    }
}
