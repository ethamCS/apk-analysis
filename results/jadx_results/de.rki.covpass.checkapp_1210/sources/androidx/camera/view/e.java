package androidx.camera.view;

import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import w.b0;
import w.d0;
import w.s1;
/* loaded from: classes.dex */
public final class e implements s1.a<d0.a> {

    /* renamed from: a */
    private final b0 f2642a;

    /* renamed from: b */
    private final androidx.lifecycle.d0<PreviewView.g> f2643b;

    /* renamed from: c */
    private PreviewView.g f2644c;

    /* renamed from: d */
    private final k f2645d;

    /* renamed from: e */
    x5.a<Void> f2646e;

    /* renamed from: f */
    private boolean f2647f = false;

    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ List f2648a;

        /* renamed from: b */
        final /* synthetic */ androidx.camera.core.r f2649b;

        a(List list, androidx.camera.core.r rVar) {
            e.this = r1;
            this.f2648a = list;
            this.f2649b = rVar;
        }

        @Override // y.c
        public void a(Throwable th2) {
            e.this.f2646e = null;
            if (!this.f2648a.isEmpty()) {
                for (w.h hVar : this.f2648a) {
                    ((b0) this.f2649b).b(hVar);
                }
                this.f2648a.clear();
            }
        }

        /* renamed from: c */
        public void b(Void r22) {
            e.this.f2646e = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends w.h {

        /* renamed from: a */
        final /* synthetic */ c.a f2651a;

        /* renamed from: b */
        final /* synthetic */ androidx.camera.core.r f2652b;

        b(c.a aVar, androidx.camera.core.r rVar) {
            e.this = r1;
            this.f2651a = aVar;
            this.f2652b = rVar;
        }

        @Override // w.h
        public void b(w.q qVar) {
            this.f2651a.c(null);
            ((b0) this.f2652b).b(this);
        }
    }

    public e(b0 b0Var, androidx.lifecycle.d0<PreviewView.g> d0Var, k kVar) {
        this.f2642a = b0Var;
        this.f2643b = d0Var;
        this.f2645d = kVar;
        synchronized (this) {
            this.f2644c = d0Var.e();
        }
    }

    private void f() {
        x5.a<Void> aVar = this.f2646e;
        if (aVar != null) {
            aVar.cancel(false);
            this.f2646e = null;
        }
    }

    public /* synthetic */ x5.a h(Void r12) {
        return this.f2645d.i();
    }

    public /* synthetic */ Void i(Void r12) {
        m(PreviewView.g.STREAMING);
        return null;
    }

    public /* synthetic */ Object j(androidx.camera.core.r rVar, List list, c.a aVar) {
        b bVar = new b(aVar, rVar);
        list.add(bVar);
        ((b0) rVar).g(x.a.a(), bVar);
        return "waitForCaptureResult";
    }

    private void l(androidx.camera.core.r rVar) {
        m(PreviewView.g.IDLE);
        ArrayList arrayList = new ArrayList();
        y.d e10 = y.d.a(n(rVar, arrayList)).f(new y.a() { // from class: androidx.camera.view.d
            @Override // y.a
            public final x5.a apply(Object obj) {
                x5.a h10;
                h10 = e.this.h((Void) obj);
                return h10;
            }
        }, x.a.a()).e(new o.a() { // from class: androidx.camera.view.c
            @Override // o.a
            public final Object apply(Object obj) {
                Void i10;
                i10 = e.this.i((Void) obj);
                return i10;
            }
        }, x.a.a());
        this.f2646e = e10;
        y.f.b(e10, new a(arrayList, rVar), x.a.a());
    }

    private x5.a<Void> n(final androidx.camera.core.r rVar, final List<w.h> list) {
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.view.b
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object j10;
                j10 = e.this.j(rVar, list, aVar);
                return j10;
            }
        });
    }

    @Override // w.s1.a
    public void a(Throwable th2) {
        g();
        m(PreviewView.g.IDLE);
    }

    public void g() {
        f();
    }

    /* renamed from: k */
    public void b(d0.a aVar) {
        if (aVar == d0.a.CLOSING || aVar == d0.a.CLOSED || aVar == d0.a.RELEASING || aVar == d0.a.RELEASED) {
            m(PreviewView.g.IDLE);
            if (!this.f2647f) {
                return;
            }
            this.f2647f = false;
            f();
        } else if ((aVar != d0.a.OPENING && aVar != d0.a.OPEN && aVar != d0.a.PENDING_OPEN) || this.f2647f) {
        } else {
            l(this.f2642a);
            this.f2647f = true;
        }
    }

    public void m(PreviewView.g gVar) {
        synchronized (this) {
            if (this.f2644c.equals(gVar)) {
                return;
            }
            this.f2644c = gVar;
            androidx.camera.core.s1.a("StreamStateObserver", "Update Preview stream state to " + gVar);
            this.f2643b.k(gVar);
        }
    }
}
