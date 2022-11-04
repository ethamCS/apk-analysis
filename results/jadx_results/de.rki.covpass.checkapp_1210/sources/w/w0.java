package w;

import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w.r0;
/* loaded from: classes.dex */
public final class w0 {

    /* loaded from: classes.dex */
    public class a implements y.c<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f24606a;

        /* renamed from: b */
        final /* synthetic */ c.a f24607b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f24608c;

        a(boolean z10, c.a aVar, ScheduledFuture scheduledFuture) {
            this.f24606a = z10;
            this.f24607b = aVar;
            this.f24608c = scheduledFuture;
        }

        @Override // y.c
        public void a(Throwable th2) {
            this.f24607b.c(Collections.unmodifiableList(Collections.emptyList()));
            this.f24608c.cancel(true);
        }

        /* renamed from: c */
        public void b(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f24606a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f24607b.c(arrayList);
            this.f24608c.cancel(true);
        }
    }

    public static void e(List<r0> list) {
        for (r0 r0Var : list) {
            r0Var.d();
        }
    }

    public static void f(List<r0> list) {
        if (!list.isEmpty()) {
            int i10 = 0;
            do {
                try {
                    list.get(i10).j();
                    i10++;
                } catch (r0.a e10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        list.get(i11).d();
                    }
                    throw e10;
                }
            } while (i10 < list.size());
        }
    }

    public static /* synthetic */ void g(x5.a aVar, c.a aVar2, long j10) {
        if (!aVar.isDone()) {
            aVar2.f(new TimeoutException("Cannot complete surfaceList within " + j10));
            aVar.cancel(true);
        }
    }

    public static /* synthetic */ void h(Executor executor, final x5.a aVar, final c.a aVar2, final long j10) {
        executor.execute(new Runnable() { // from class: w.v0
            @Override // java.lang.Runnable
            public final void run() {
                w0.g(x5.a.this, aVar2, j10);
            }
        });
    }

    public static /* synthetic */ Object j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, boolean z10, final c.a aVar) {
        final x5.a n10 = y.f.n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: w.t0
            @Override // java.lang.Runnable
            public final void run() {
                w0.h(executor, n10, aVar, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: w.u0
            @Override // java.lang.Runnable
            public final void run() {
                x5.a.this.cancel(true);
            }
        }, executor);
        y.f.b(n10, new a(z10, aVar, schedule), executor);
        return "surfaceList";
    }

    public static x5.a<List<Surface>> k(Collection<r0> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (r0 r0Var : collection) {
            arrayList.add(y.f.j(r0Var.h()));
        }
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: w.s0
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object j11;
                j11 = w0.j(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return j11;
            }
        });
    }
}
