package d2;

import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c2.p;
import java.util.List;
import u1.n;
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: q */
    private static final String f8213q = u1.k.f("EnqueueRunnable");

    /* renamed from: c */
    private final v1.g f8214c;

    /* renamed from: d */
    private final v1.c f8215d = new v1.c();

    public b(v1.g gVar) {
        this.f8214c = gVar;
    }

    private static boolean b(v1.g gVar) {
        boolean c10 = c(gVar.g(), gVar.f(), (String[]) v1.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(v1.i r16, java.util.List<? extends u1.u> r17, java.lang.String[] r18, java.lang.String r19, u1.e r20) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.b.c(v1.i, java.util.List, java.lang.String[], java.lang.String, u1.e):boolean");
    }

    private static boolean e(v1.g gVar) {
        List<v1.g> e10 = gVar.e();
        boolean z10 = false;
        if (e10 != null) {
            boolean z11 = false;
            for (v1.g gVar2 : e10) {
                if (!gVar2.j()) {
                    z11 |= e(gVar2);
                } else {
                    u1.k.c().h(f8213q, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z10 = z11;
        }
        return b(gVar) | z10;
    }

    private static void g(p pVar) {
        u1.c cVar = pVar.f6173j;
        if (cVar.f() || cVar.i()) {
            String str = pVar.f6166c;
            a.C0069a c0069a = new a.C0069a();
            c0069a.c(pVar.f6168e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f6166c = ConstraintTrackingWorker.class.getName();
            pVar.f6168e = c0069a.a();
        }
    }

    public boolean a() {
        WorkDatabase p10 = this.f8214c.g().p();
        p10.e();
        try {
            boolean e10 = e(this.f8214c);
            p10.D();
            return e10;
        } finally {
            p10.i();
        }
    }

    public n d() {
        return this.f8215d;
    }

    public void f() {
        v1.i g10 = this.f8214c.g();
        v1.f.b(g10.i(), g10.p(), g10.o());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f8214c.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f8214c));
            }
            if (a()) {
                d.a(this.f8214c.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f8215d.a(n.f22565a);
        } catch (Throwable th2) {
            this.f8215d.a(new n.b.a(th2));
        }
    }
}
