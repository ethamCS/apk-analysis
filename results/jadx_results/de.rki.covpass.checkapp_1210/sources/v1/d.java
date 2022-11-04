package v1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import u1.k;
import v1.j;
/* loaded from: classes.dex */
public class d implements b, b2.a {

    /* renamed from: a4 */
    private static final String f23841a4 = k.f("Processor");
    private List<e> W3;

    /* renamed from: d */
    private Context f23843d;

    /* renamed from: q */
    private u1.b f23844q;

    /* renamed from: x */
    private e2.a f23845x;

    /* renamed from: y */
    private WorkDatabase f23846y;
    private Map<String, j> V3 = new HashMap();
    private Map<String, j> U3 = new HashMap();
    private Set<String> X3 = new HashSet();
    private final List<b> Y3 = new ArrayList();

    /* renamed from: c */
    private PowerManager.WakeLock f23842c = null;
    private final Object Z3 = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: c */
        private b f23847c;

        /* renamed from: d */
        private String f23848d;

        /* renamed from: q */
        private x5.a<Boolean> f23849q;

        a(b bVar, String str, x5.a<Boolean> aVar) {
            this.f23847c = bVar;
            this.f23848d = str;
            this.f23849q = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f23849q.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f23847c.a(this.f23848d, z10);
        }
    }

    public d(Context context, u1.b bVar, e2.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f23843d = context;
        this.f23844q = bVar;
        this.f23845x = aVar;
        this.f23846y = workDatabase;
        this.W3 = list;
    }

    private static boolean d(String str, j jVar) {
        if (jVar == null) {
            k.c().a(f23841a4, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.d();
        k.c().a(f23841a4, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void l() {
        synchronized (this.Z3) {
            if (!(!this.U3.isEmpty())) {
                this.f23843d.startService(androidx.work.impl.foreground.a.b(this.f23843d));
                PowerManager.WakeLock wakeLock = this.f23842c;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f23842c = null;
                }
            }
        }
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        synchronized (this.Z3) {
            this.V3.remove(str);
            k.c().a(f23841a4, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            for (b bVar : this.Y3) {
                bVar.a(str, z10);
            }
        }
    }

    @Override // b2.a
    public void b(String str) {
        synchronized (this.Z3) {
            this.U3.remove(str);
            l();
        }
    }

    public void c(b bVar) {
        synchronized (this.Z3) {
            this.Y3.add(bVar);
        }
    }

    public boolean e(String str) {
        boolean contains;
        synchronized (this.Z3) {
            contains = this.X3.contains(str);
        }
        return contains;
    }

    public boolean f(String str) {
        boolean z10;
        synchronized (this.Z3) {
            if (!this.V3.containsKey(str) && !this.U3.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public boolean g(String str) {
        boolean containsKey;
        synchronized (this.Z3) {
            containsKey = this.U3.containsKey(str);
        }
        return containsKey;
    }

    public void h(b bVar) {
        synchronized (this.Z3) {
            this.Y3.remove(bVar);
        }
    }

    public boolean i(String str) {
        return j(str, null);
    }

    public boolean j(String str, WorkerParameters.a aVar) {
        synchronized (this.Z3) {
            if (f(str)) {
                k.c().a(f23841a4, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f23843d, this.f23844q, this.f23845x, this, this.f23846y, str).c(this.W3).b(aVar).a();
            x5.a<Boolean> b10 = a10.b();
            b10.b(new a(this, str, b10), this.f23845x.a());
            this.V3.put(str, a10);
            this.f23845x.c().execute(a10);
            k.c().a(f23841a4, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean k(String str) {
        boolean d10;
        synchronized (this.Z3) {
            boolean z10 = true;
            k.c().a(f23841a4, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.X3.add(str);
            j remove = this.U3.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.V3.remove(str);
            }
            d10 = d(str, remove);
            if (z10) {
                l();
            }
        }
        return d10;
    }

    public boolean m(String str) {
        boolean d10;
        synchronized (this.Z3) {
            k.c().a(f23841a4, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            d10 = d(str, this.U3.remove(str));
        }
        return d10;
    }

    public boolean n(String str) {
        boolean d10;
        synchronized (this.Z3) {
            k.c().a(f23841a4, String.format("Processor stopping background work %s", str), new Throwable[0]);
            d10 = d(str, this.V3.remove(str));
        }
        return d10;
    }
}
