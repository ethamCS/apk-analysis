package sf;

import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010+\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u001f¨\u00060"}, d2 = {"Lsf/d;", BuildConfig.FLAVOR, "Lsf/a;", "task", BuildConfig.FLAVOR, "delayNanos", "Ltb/e0;", "i", BuildConfig.FLAVOR, "recurrence", "k", "(Lsf/a;JZ)Z", "a", "o", "b", "()Z", BuildConfig.FLAVOR, "toString", "Lsf/e;", "taskRunner", "Lsf/e;", "h", "()Lsf/e;", "name", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "shutdown", "Z", "g", "n", "(Z)V", "activeTask", "Lsf/a;", "c", "()Lsf/a;", "l", "(Lsf/a;)V", BuildConfig.FLAVOR, "futureTasks", "Ljava/util/List;", "e", "()Ljava/util/List;", "cancelActiveTask", "d", "m", "<init>", "(Lsf/e;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private final e f21687a;

    /* renamed from: b */
    private final String f21688b;

    /* renamed from: c */
    private boolean f21689c;

    /* renamed from: d */
    private a f21690d;

    /* renamed from: e */
    private final List<a> f21691e = new ArrayList();

    /* renamed from: f */
    private boolean f21692f;

    public d(e eVar, String str) {
        t.e(eVar, "taskRunner");
        t.e(str, "name");
        this.f21687a = eVar;
        this.f21688b = str;
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (!pf.d.f19195h || !Thread.holdsLock(this)) {
            synchronized (this.f21687a) {
                if (b()) {
                    h().h(this);
                }
                e0 e0Var = e0.f22152a;
            }
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final boolean b() {
        a aVar = this.f21690d;
        if (aVar != null) {
            t.b(aVar);
            if (aVar.a()) {
                this.f21692f = true;
            }
        }
        boolean z10 = false;
        int size = this.f21691e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.f21691e.get(size).a()) {
                    a aVar2 = this.f21691e.get(size);
                    if (e.Companion.a().isLoggable(Level.FINE)) {
                        b.c(aVar2, this, "canceled");
                    }
                    this.f21691e.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f21690d;
    }

    public final boolean d() {
        return this.f21692f;
    }

    public final List<a> e() {
        return this.f21691e;
    }

    public final String f() {
        return this.f21688b;
    }

    public final boolean g() {
        return this.f21689c;
    }

    public final e h() {
        return this.f21687a;
    }

    public final void i(a aVar, long j10) {
        t.e(aVar, "task");
        synchronized (this.f21687a) {
            if (!g()) {
                if (k(aVar, j10, false)) {
                    h().h(this);
                }
                e0 e0Var = e0.f22152a;
            } else if (aVar.a()) {
                if (e.Companion.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.Companion.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a aVar, long j10, boolean z10) {
        String str;
        String str2;
        t.e(aVar, "task");
        aVar.e(this);
        long c10 = this.f21687a.g().c();
        long j11 = c10 + j10;
        int indexOf = this.f21691e.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.Companion.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f21691e.remove(indexOf);
        }
        aVar.g(j11);
        if (e.Companion.a().isLoggable(Level.FINE)) {
            long j12 = j11 - c10;
            if (z10) {
                str = b.b(j12);
                str2 = "run again after ";
            } else {
                str = b.b(j12);
                str2 = "scheduled after ";
            }
            b.c(aVar, this, t.l(str2, str));
        }
        Iterator<a> it = this.f21691e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().c() - c10 > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f21691e.size();
        }
        this.f21691e.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f21690d = aVar;
    }

    public final void m(boolean z10) {
        this.f21692f = z10;
    }

    public final void n(boolean z10) {
        this.f21689c = z10;
    }

    public final void o() {
        if (pf.d.f19195h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f21687a) {
            n(true);
            if (b()) {
                h().h(this);
            }
            e0 e0Var = e0.f22152a;
        }
    }

    public String toString() {
        return this.f21688b;
    }
}
