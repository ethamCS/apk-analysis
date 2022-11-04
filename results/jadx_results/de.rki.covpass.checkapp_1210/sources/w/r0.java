package w;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: i */
    public static final Size f24571i = new Size(0, 0);

    /* renamed from: j */
    private static final boolean f24572j = androidx.camera.core.s1.f("DeferrableSurface");

    /* renamed from: k */
    private static final AtomicInteger f24573k = new AtomicInteger(0);

    /* renamed from: l */
    private static final AtomicInteger f24574l = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f24575a;

    /* renamed from: b */
    private int f24576b;

    /* renamed from: c */
    private boolean f24577c;

    /* renamed from: d */
    private c.a<Void> f24578d;

    /* renamed from: e */
    private final x5.a<Void> f24579e;

    /* renamed from: f */
    private final Size f24580f;

    /* renamed from: g */
    private final int f24581g;

    /* renamed from: h */
    Class<?> f24582h;

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: c */
        r0 f24583c;

        public a(String str, r0 r0Var) {
            super(str);
            this.f24583c = r0Var;
        }

        public r0 b() {
            return this.f24583c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public r0() {
        this(f24571i, 0);
    }

    public r0(Size size, int i10) {
        this.f24575a = new Object();
        this.f24576b = 0;
        this.f24577c = false;
        this.f24580f = size;
        this.f24581g = i10;
        x5.a<Void> a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: w.p0
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object k10;
                k10 = r0.this.k(aVar);
                return k10;
            }
        });
        this.f24579e = a10;
        if (androidx.camera.core.s1.f("DeferrableSurface")) {
            m("Surface created", f24574l.incrementAndGet(), f24573k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a10.b(new Runnable() { // from class: w.q0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.this.l(stackTraceString);
                }
            }, x.a.a());
        }
    }

    public /* synthetic */ Object k(c.a aVar) {
        synchronized (this.f24575a) {
            this.f24578d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public /* synthetic */ void l(String str) {
        try {
            this.f24579e.get();
            m("Surface terminated", f24574l.decrementAndGet(), f24573k.get());
        } catch (Exception e10) {
            androidx.camera.core.s1.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f24575a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f24577c), Integer.valueOf(this.f24576b)), e10);
            }
        }
    }

    private void m(String str, int i10, int i11) {
        if (!f24572j && androidx.camera.core.s1.f("DeferrableSurface")) {
            androidx.camera.core.s1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.s1.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public final void c() {
        c.a<Void> aVar;
        synchronized (this.f24575a) {
            if (!this.f24577c) {
                this.f24577c = true;
                if (this.f24576b == 0) {
                    aVar = this.f24578d;
                    this.f24578d = null;
                } else {
                    aVar = null;
                }
                if (androidx.camera.core.s1.f("DeferrableSurface")) {
                    androidx.camera.core.s1.a("DeferrableSurface", "surface closed,  useCount=" + this.f24576b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f24575a) {
            int i10 = this.f24576b;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i11 = i10 - 1;
            this.f24576b = i11;
            if (i11 != 0 || !this.f24577c) {
                aVar = null;
            } else {
                aVar = this.f24578d;
                this.f24578d = null;
            }
            if (androidx.camera.core.s1.f("DeferrableSurface")) {
                androidx.camera.core.s1.a("DeferrableSurface", "use count-1,  useCount=" + this.f24576b + " closed=" + this.f24577c + " " + this);
                if (this.f24576b == 0) {
                    m("Surface no longer in use", f24574l.get(), f24573k.decrementAndGet());
                }
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public Class<?> e() {
        return this.f24582h;
    }

    public Size f() {
        return this.f24580f;
    }

    public int g() {
        return this.f24581g;
    }

    public final x5.a<Surface> h() {
        synchronized (this.f24575a) {
            if (this.f24577c) {
                return y.f.f(new a("DeferrableSurface already closed.", this));
            }
            return n();
        }
    }

    public x5.a<Void> i() {
        return y.f.j(this.f24579e);
    }

    public void j() {
        synchronized (this.f24575a) {
            int i10 = this.f24576b;
            if (i10 == 0 && this.f24577c) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f24576b = i10 + 1;
            if (androidx.camera.core.s1.f("DeferrableSurface")) {
                if (this.f24576b == 1) {
                    m("New surface in use", f24574l.get(), f24573k.incrementAndGet());
                }
                androidx.camera.core.s1.a("DeferrableSurface", "use count+1, useCount=" + this.f24576b + " " + this);
            }
        }
    }

    protected abstract x5.a<Surface> n();

    public void o(Class<?> cls) {
        this.f24582h = cls;
    }
}
