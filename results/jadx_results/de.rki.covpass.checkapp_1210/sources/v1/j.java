package v1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c2.p;
import c2.q;
import c2.t;
import d2.l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import u1.k;
import u1.s;
/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: i4 */
    static final String f23877i4 = k.f("WorkerWrapper");
    ListenableWorker U3;
    private u1.b W3;
    private e2.a X3;
    private b2.a Y3;
    private WorkDatabase Z3;

    /* renamed from: a4 */
    private q f23878a4;

    /* renamed from: b4 */
    private c2.b f23879b4;

    /* renamed from: c */
    Context f23880c;

    /* renamed from: c4 */
    private t f23881c4;

    /* renamed from: d */
    private String f23882d;

    /* renamed from: d4 */
    private List<String> f23883d4;

    /* renamed from: e4 */
    private String f23884e4;

    /* renamed from: h4 */
    private volatile boolean f23887h4;

    /* renamed from: q */
    private List<e> f23888q;

    /* renamed from: x */
    private WorkerParameters.a f23889x;

    /* renamed from: y */
    p f23890y;
    ListenableWorker.a V3 = ListenableWorker.a.a();

    /* renamed from: f4 */
    androidx.work.impl.utils.futures.c<Boolean> f23885f4 = androidx.work.impl.utils.futures.c.t();

    /* renamed from: g4 */
    x5.a<ListenableWorker.a> f23886g4 = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23891c;

        a(androidx.work.impl.utils.futures.c cVar) {
            j.this = r1;
            this.f23891c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k.c().a(j.f23877i4, String.format("Starting work for %s", j.this.f23890y.f6166c), new Throwable[0]);
                j jVar = j.this;
                jVar.f23886g4 = jVar.U3.n();
                this.f23891c.r(j.this.f23886g4);
            } catch (Throwable th2) {
                this.f23891c.q(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23893c;

        /* renamed from: d */
        final /* synthetic */ String f23894d;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            j.this = r1;
            this.f23893c = cVar;
            this.f23894d = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            Throwable e10;
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f23893c.get();
                    if (aVar == null) {
                        k.c().b(j.f23877i4, String.format("%s returned a null result. Treating it as a failure.", j.this.f23890y.f6166c), new Throwable[0]);
                    } else {
                        k.c().a(j.f23877i4, String.format("%s returned a %s result.", j.this.f23890y.f6166c, aVar), new Throwable[0]);
                        j.this.V3 = aVar;
                    }
                } catch (InterruptedException e11) {
                    e10 = e11;
                    k.c().b(j.f23877i4, String.format("%s failed because it threw an exception/error", this.f23894d), e10);
                } catch (CancellationException e12) {
                    k.c().d(j.f23877i4, String.format("%s was cancelled", this.f23894d), e12);
                } catch (ExecutionException e13) {
                    e10 = e13;
                    k.c().b(j.f23877i4, String.format("%s failed because it threw an exception/error", this.f23894d), e10);
                }
            } finally {
                j.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        Context f23896a;

        /* renamed from: b */
        ListenableWorker f23897b;

        /* renamed from: c */
        b2.a f23898c;

        /* renamed from: d */
        e2.a f23899d;

        /* renamed from: e */
        u1.b f23900e;

        /* renamed from: f */
        WorkDatabase f23901f;

        /* renamed from: g */
        String f23902g;

        /* renamed from: h */
        List<e> f23903h;

        /* renamed from: i */
        WorkerParameters.a f23904i = new WorkerParameters.a();

        public c(Context context, u1.b bVar, e2.a aVar, b2.a aVar2, WorkDatabase workDatabase, String str) {
            this.f23896a = context.getApplicationContext();
            this.f23899d = aVar;
            this.f23898c = aVar2;
            this.f23900e = bVar;
            this.f23901f = workDatabase;
            this.f23902g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f23904i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f23903h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f23880c = cVar.f23896a;
        this.X3 = cVar.f23899d;
        this.Y3 = cVar.f23898c;
        this.f23882d = cVar.f23902g;
        this.f23888q = cVar.f23903h;
        this.f23889x = cVar.f23904i;
        this.U3 = cVar.f23897b;
        this.W3 = cVar.f23900e;
        WorkDatabase workDatabase = cVar.f23901f;
        this.Z3 = workDatabase;
        this.f23878a4 = workDatabase.O();
        this.f23879b4 = this.Z3.G();
        this.f23881c4 = this.Z3.P();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f23882d);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            k.c().d(f23877i4, String.format("Worker result SUCCESS for %s", this.f23884e4), new Throwable[0]);
            if (!this.f23890y.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            k.c().d(f23877i4, String.format("Worker result RETRY for %s", this.f23884e4), new Throwable[0]);
            g();
            return;
        } else {
            k.c().d(f23877i4, String.format("Worker result FAILURE for %s", this.f23884e4), new Throwable[0]);
            if (!this.f23890y.d()) {
                l();
                return;
            }
        }
        h();
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f23878a4.h(str2) != s.a.CANCELLED) {
                this.f23878a4.l(s.a.FAILED, str2);
            }
            linkedList.addAll(this.f23879b4.d(str2));
        }
    }

    private void g() {
        this.Z3.e();
        try {
            this.f23878a4.l(s.a.ENQUEUED, this.f23882d);
            this.f23878a4.q(this.f23882d, System.currentTimeMillis());
            this.f23878a4.d(this.f23882d, -1L);
            this.Z3.D();
        } finally {
            this.Z3.i();
            i(true);
        }
    }

    private void h() {
        this.Z3.e();
        try {
            this.f23878a4.q(this.f23882d, System.currentTimeMillis());
            this.f23878a4.l(s.a.ENQUEUED, this.f23882d);
            this.f23878a4.k(this.f23882d);
            this.f23878a4.d(this.f23882d, -1L);
            this.Z3.D();
        } finally {
            this.Z3.i();
            i(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x001f, B:13:0x0028, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:21:0x0053), top: B:27:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0005, B:5:0x0013, B:11:0x001f, B:13:0x0028, B:14:0x003e, B:16:0x0042, B:18:0x0046, B:20:0x004c, B:21:0x0053), top: B:27:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.Z3
            r0.e()
            androidx.work.impl.WorkDatabase r0 = r5.Z3     // Catch: java.lang.Throwable -> L67
            c2.q r0 = r0.O()     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L67
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L26
            android.content.Context r0 = r5.f23880c     // Catch: java.lang.Throwable -> L67
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r3 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            d2.d.a(r0, r3, r2)     // Catch: java.lang.Throwable -> L67
        L26:
            if (r6 == 0) goto L3e
            c2.q r0 = r5.f23878a4     // Catch: java.lang.Throwable -> L67
            u1.s$a r3 = u1.s.a.ENQUEUED     // Catch: java.lang.Throwable -> L67
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r5.f23882d     // Catch: java.lang.Throwable -> L67
            r1[r2] = r4     // Catch: java.lang.Throwable -> L67
            r0.l(r3, r1)     // Catch: java.lang.Throwable -> L67
            c2.q r0 = r5.f23878a4     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r5.f23882d     // Catch: java.lang.Throwable -> L67
            r2 = -1
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L67
        L3e:
            c2.p r0 = r5.f23890y     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L53
            androidx.work.ListenableWorker r0 = r5.U3     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L53
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L53
            b2.a r0 = r5.Y3     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r5.f23882d     // Catch: java.lang.Throwable -> L67
            r0.b(r1)     // Catch: java.lang.Throwable -> L67
        L53:
            androidx.work.impl.WorkDatabase r0 = r5.Z3     // Catch: java.lang.Throwable -> L67
            r0.D()     // Catch: java.lang.Throwable -> L67
            androidx.work.impl.WorkDatabase r0 = r5.Z3
            r0.i()
            androidx.work.impl.utils.futures.c<java.lang.Boolean> r0 = r5.f23885f4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.p(r6)
            return
        L67:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.Z3
            r0.i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.j.i(boolean):void");
    }

    private void j() {
        s.a h10 = this.f23878a4.h(this.f23882d);
        if (h10 == s.a.RUNNING) {
            k.c().a(f23877i4, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f23882d), new Throwable[0]);
            i(true);
            return;
        }
        k.c().a(f23877i4, String.format("Status for %s is %s; not doing any work", this.f23882d, h10), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.a b10;
        if (n()) {
            return;
        }
        this.Z3.e();
        try {
            p j10 = this.f23878a4.j(this.f23882d);
            this.f23890y = j10;
            if (j10 == null) {
                k.c().b(f23877i4, String.format("Didn't find WorkSpec for id %s", this.f23882d), new Throwable[0]);
                i(false);
                this.Z3.D();
            } else if (j10.f6165b != s.a.ENQUEUED) {
                j();
                this.Z3.D();
                k.c().a(f23877i4, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f23890y.f6166c), new Throwable[0]);
            } else {
                if (j10.d() || this.f23890y.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p pVar = this.f23890y;
                    if (!(pVar.f6177n == 0) && currentTimeMillis < pVar.a()) {
                        k.c().a(f23877i4, String.format("Delaying execution for %s because it is being executed before schedule.", this.f23890y.f6166c), new Throwable[0]);
                        i(true);
                        this.Z3.D();
                        return;
                    }
                }
                this.Z3.D();
                this.Z3.i();
                if (this.f23890y.d()) {
                    b10 = this.f23890y.f6168e;
                } else {
                    u1.i b11 = this.W3.e().b(this.f23890y.f6167d);
                    if (b11 == null) {
                        k.c().b(f23877i4, String.format("Could not create Input Merger %s", this.f23890y.f6167d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f23890y.f6168e);
                    arrayList.addAll(this.f23878a4.o(this.f23882d));
                    b10 = b11.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f23882d), b10, this.f23883d4, this.f23889x, this.f23890y.f6174k, this.W3.d(), this.X3, this.W3.l(), new l(this.Z3, this.X3), new d2.k(this.Z3, this.Y3, this.X3));
                if (this.U3 == null) {
                    this.U3 = this.W3.l().b(this.f23880c, this.f23890y.f6166c, workerParameters);
                }
                ListenableWorker listenableWorker = this.U3;
                if (listenableWorker == null) {
                    k.c().b(f23877i4, String.format("Could not create Worker %s", this.f23890y.f6166c), new Throwable[0]);
                    l();
                } else if (listenableWorker.k()) {
                    k.c().b(f23877i4, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f23890y.f6166c), new Throwable[0]);
                    l();
                } else {
                    this.U3.m();
                    if (!o()) {
                        j();
                    } else if (n()) {
                    } else {
                        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
                        this.X3.a().execute(new a(t10));
                        t10.b(new b(t10, this.f23884e4), this.X3.c());
                    }
                }
            }
        } finally {
            this.Z3.i();
        }
    }

    private void m() {
        this.Z3.e();
        try {
            this.f23878a4.l(s.a.SUCCEEDED, this.f23882d);
            this.f23878a4.t(this.f23882d, ((ListenableWorker.a.c) this.V3).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f23879b4.d(this.f23882d)) {
                if (this.f23878a4.h(str) == s.a.BLOCKED && this.f23879b4.a(str)) {
                    k.c().d(f23877i4, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f23878a4.l(s.a.ENQUEUED, str);
                    this.f23878a4.q(str, currentTimeMillis);
                }
            }
            this.Z3.D();
        } finally {
            this.Z3.i();
            i(false);
        }
    }

    private boolean n() {
        if (this.f23887h4) {
            k.c().a(f23877i4, String.format("Work interrupted for %s", this.f23884e4), new Throwable[0]);
            s.a h10 = this.f23878a4.h(this.f23882d);
            if (h10 == null) {
                i(false);
            } else {
                i(!h10.b());
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        this.Z3.e();
        try {
            boolean z10 = true;
            if (this.f23878a4.h(this.f23882d) == s.a.ENQUEUED) {
                this.f23878a4.l(s.a.RUNNING, this.f23882d);
                this.f23878a4.p(this.f23882d);
            } else {
                z10 = false;
            }
            this.Z3.D();
            return z10;
        } finally {
            this.Z3.i();
        }
    }

    public x5.a<Boolean> b() {
        return this.f23885f4;
    }

    public void d() {
        boolean z10;
        this.f23887h4 = true;
        n();
        x5.a<ListenableWorker.a> aVar = this.f23886g4;
        if (aVar != null) {
            z10 = aVar.isDone();
            this.f23886g4.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.U3;
        if (listenableWorker == null || z10) {
            k.c().a(f23877i4, String.format("WorkSpec %s is already done. Not interrupting.", this.f23890y), new Throwable[0]);
        } else {
            listenableWorker.o();
        }
    }

    void f() {
        if (!n()) {
            this.Z3.e();
            try {
                s.a h10 = this.f23878a4.h(this.f23882d);
                this.Z3.N().a(this.f23882d);
                if (h10 == null) {
                    i(false);
                } else if (h10 == s.a.RUNNING) {
                    c(this.V3);
                } else if (!h10.b()) {
                    g();
                }
                this.Z3.D();
            } finally {
                this.Z3.i();
            }
        }
        List<e> list = this.f23888q;
        if (list != null) {
            for (e eVar : list) {
                eVar.b(this.f23882d);
            }
            f.b(this.W3, this.Z3, this.f23888q);
        }
    }

    void l() {
        this.Z3.e();
        try {
            e(this.f23882d);
            this.f23878a4.t(this.f23882d, ((ListenableWorker.a.C0068a) this.V3).e());
            this.Z3.D();
        } finally {
            this.Z3.i();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b10 = this.f23881c4.b(this.f23882d);
        this.f23883d4 = b10;
        this.f23884e4 = a(b10);
        k();
    }
}
