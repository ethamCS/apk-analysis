package w1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import c2.p;
import d2.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u1.k;
import u1.s;
import v1.e;
import v1.i;
import y1.c;
import y1.d;
/* loaded from: classes.dex */
public class b implements e, c, v1.b {
    private static final String X3 = k.f("GreedyScheduler");
    private boolean U3;
    Boolean W3;

    /* renamed from: c */
    private final Context f24667c;

    /* renamed from: d */
    private final i f24668d;

    /* renamed from: q */
    private final d f24669q;

    /* renamed from: y */
    private a f24671y;

    /* renamed from: x */
    private final Set<p> f24670x = new HashSet();
    private final Object V3 = new Object();

    public b(Context context, u1.b bVar, e2.a aVar, i iVar) {
        this.f24667c = context;
        this.f24668d = iVar;
        this.f24669q = new d(context, aVar, this);
        this.f24671y = new a(this, bVar.j());
    }

    private void g() {
        this.W3 = Boolean.valueOf(f.b(this.f24667c, this.f24668d.i()));
    }

    private void h() {
        if (!this.U3) {
            this.f24668d.m().c(this);
            this.U3 = true;
        }
    }

    private void i(String str) {
        synchronized (this.V3) {
            Iterator<p> it = this.f24670x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f6164a.equals(str)) {
                    k.c().a(X3, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f24670x.remove(next);
                    this.f24669q.d(this.f24670x);
                    break;
                }
            }
        }
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        i(str);
    }

    @Override // v1.e
    public void b(String str) {
        if (this.W3 == null) {
            g();
        }
        if (!this.W3.booleanValue()) {
            k.c().d(X3, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        k.c().a(X3, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f24671y;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f24668d.y(str);
    }

    @Override // y1.c
    public void c(List<String> list) {
        for (String str : list) {
            k.c().a(X3, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f24668d.y(str);
        }
    }

    @Override // y1.c
    public void d(List<String> list) {
        for (String str : list) {
            k.c().a(X3, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f24668d.v(str);
        }
    }

    @Override // v1.e
    public void e(p... pVarArr) {
        if (this.W3 == null) {
            g();
        }
        if (!this.W3.booleanValue()) {
            k.c().d(X3, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f6165b == s.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f24671y;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (pVar.f6173j.h()) {
                        k.c().a(X3, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f6173j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f6164a);
                    } else {
                        k.c().a(X3, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    k.c().a(X3, String.format("Starting work for %s", pVar.f6164a), new Throwable[0]);
                    this.f24668d.v(pVar.f6164a);
                }
            }
        }
        synchronized (this.V3) {
            if (!hashSet.isEmpty()) {
                k.c().a(X3, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f24670x.addAll(hashSet);
                this.f24669q.d(this.f24670x);
            }
        }
    }

    @Override // v1.e
    public boolean f() {
        return false;
    }
}
