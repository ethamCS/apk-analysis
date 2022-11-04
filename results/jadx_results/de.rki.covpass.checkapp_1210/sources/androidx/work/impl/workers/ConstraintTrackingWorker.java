package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c2.p;
import java.util.Collections;
import java.util.List;
import u1.k;
import v1.i;
import y1.c;
import y1.d;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    private static final String Z3 = k.f("ConstraintTrkngWrkr");
    private WorkerParameters U3;
    final Object V3 = new Object();
    volatile boolean W3 = false;
    androidx.work.impl.utils.futures.c<ListenableWorker.a> X3 = androidx.work.impl.utils.futures.c.t();
    private ListenableWorker Y3;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            ConstraintTrackingWorker.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ x5.a f5417c;

        b(x5.a aVar) {
            ConstraintTrackingWorker.this = r1;
            this.f5417c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.V3) {
                if (ConstraintTrackingWorker.this.W3) {
                    ConstraintTrackingWorker.this.r();
                } else {
                    ConstraintTrackingWorker.this.X3.r(this.f5417c);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.U3 = workerParameters;
    }

    @Override // y1.c
    public void c(List<String> list) {
        k.c().a(Z3, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.V3) {
            this.W3 = true;
        }
    }

    @Override // y1.c
    public void d(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public e2.a g() {
        return i.k(a()).q();
    }

    @Override // androidx.work.ListenableWorker
    public boolean i() {
        ListenableWorker listenableWorker = this.Y3;
        return listenableWorker != null && listenableWorker.i();
    }

    @Override // androidx.work.ListenableWorker
    public void l() {
        super.l();
        ListenableWorker listenableWorker = this.Y3;
        if (listenableWorker == null || listenableWorker.j()) {
            return;
        }
        this.Y3.o();
    }

    @Override // androidx.work.ListenableWorker
    public x5.a<ListenableWorker.a> n() {
        b().execute(new a());
        return this.X3;
    }

    public WorkDatabase p() {
        return i.k(a()).p();
    }

    void q() {
        this.X3.p(ListenableWorker.a.a());
    }

    void r() {
        this.X3.p(ListenableWorker.a.b());
    }

    void s() {
        String i10 = f().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i10)) {
            k.c().b(Z3, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b10 = h().b(a(), i10, this.U3);
            this.Y3 = b10;
            if (b10 != null) {
                p j10 = p().O().j(e().toString());
                if (j10 == null) {
                    q();
                    return;
                }
                d dVar = new d(a(), g(), this);
                dVar.d(Collections.singletonList(j10));
                if (!dVar.c(e().toString())) {
                    k.c().a(Z3, String.format("Constraints not met for delegate %s. Requesting retry.", i10), new Throwable[0]);
                    r();
                    return;
                }
                k.c().a(Z3, String.format("Constraints met for delegate %s", i10), new Throwable[0]);
                try {
                    x5.a<ListenableWorker.a> n10 = this.Y3.n();
                    n10.b(new b(n10), b());
                    return;
                } catch (Throwable th2) {
                    k c10 = k.c();
                    String str = Z3;
                    c10.a(str, String.format("Delegated worker %s threw exception in startWork.", i10), th2);
                    synchronized (this.V3) {
                        if (this.W3) {
                            k.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            r();
                        } else {
                            q();
                        }
                        return;
                    }
                }
            }
            k.c().a(Z3, "No worker to delegate to.", new Throwable[0]);
        }
        q();
    }
}
