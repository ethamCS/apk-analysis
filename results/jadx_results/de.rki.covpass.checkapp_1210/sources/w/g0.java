package w;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import w.d0;
import w.g0;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: c */
    private final int f24461c;

    /* renamed from: e */
    private int f24463e;

    /* renamed from: a */
    private final StringBuilder f24459a = new StringBuilder();

    /* renamed from: b */
    private final Object f24460b = new Object();

    /* renamed from: d */
    private final Map<androidx.camera.core.k, a> f24462d = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private d0.a f24464a;

        /* renamed from: b */
        private final Executor f24465b;

        /* renamed from: c */
        private final b f24466c;

        a(d0.a aVar, Executor executor, b bVar) {
            this.f24464a = aVar;
            this.f24465b = executor;
            this.f24466c = bVar;
        }

        d0.a a() {
            return this.f24464a;
        }

        void b() {
            try {
                Executor executor = this.f24465b;
                final b bVar = this.f24466c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: w.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                androidx.camera.core.s1.d("CameraStateRegistry", "Unable to notify camera.", e10);
            }
        }

        d0.a c(d0.a aVar) {
            d0.a aVar2 = this.f24464a;
            this.f24464a = aVar;
            return aVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public g0(int i10) {
        this.f24461c = i10;
        synchronized ("mLock") {
            this.f24463e = i10;
        }
    }

    private static boolean b(d0.a aVar) {
        return aVar != null && aVar.b();
    }

    private void d() {
        if (androidx.camera.core.s1.f("CameraStateRegistry")) {
            this.f24459a.setLength(0);
            this.f24459a.append("Recalculating open cameras:\n");
            this.f24459a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f24459a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<androidx.camera.core.k, a> entry : this.f24462d.entrySet()) {
            if (androidx.camera.core.s1.f("CameraStateRegistry")) {
                this.f24459a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (b(entry.getValue().a())) {
                i10++;
            }
        }
        if (androidx.camera.core.s1.f("CameraStateRegistry")) {
            this.f24459a.append("-------------------------------------------------------------------\n");
            this.f24459a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f24461c)));
            androidx.camera.core.s1.a("CameraStateRegistry", this.f24459a.toString());
        }
        this.f24463e = Math.max(this.f24461c - i10, 0);
    }

    private d0.a g(androidx.camera.core.k kVar) {
        a remove = this.f24462d.remove(kVar);
        if (remove != null) {
            d();
            return remove.a();
        }
        return null;
    }

    private d0.a h(androidx.camera.core.k kVar, d0.a aVar) {
        d0.a c10 = ((a) androidx.core.util.h.h(this.f24462d.get(kVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).c(aVar);
        d0.a aVar2 = d0.a.OPENING;
        if (aVar == aVar2) {
            androidx.core.util.h.j(b(aVar) || c10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c10 != aVar) {
            d();
        }
        return c10;
    }

    public boolean a() {
        synchronized (this.f24460b) {
            for (Map.Entry<androidx.camera.core.k, a> entry : this.f24462d.entrySet()) {
                if (entry.getValue().a() == d0.a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    public void c(androidx.camera.core.k kVar, d0.a aVar, boolean z10) {
        HashMap hashMap;
        synchronized (this.f24460b) {
            int i10 = this.f24463e;
            if ((aVar == d0.a.RELEASED ? g(kVar) : h(kVar, aVar)) == aVar) {
                return;
            }
            if (i10 < 1 && this.f24463e > 0) {
                hashMap = new HashMap();
                for (Map.Entry<androidx.camera.core.k, a> entry : this.f24462d.entrySet()) {
                    if (entry.getValue().a() == d0.a.PENDING_OPEN) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else if (aVar != d0.a.PENDING_OPEN || this.f24463e <= 0) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put(kVar, this.f24462d.get(kVar));
            }
            if (hashMap != null && !z10) {
                hashMap.remove(kVar);
            }
            if (hashMap == null) {
                return;
            }
            for (a aVar2 : hashMap.values()) {
                aVar2.b();
            }
        }
    }

    public void e(androidx.camera.core.k kVar, Executor executor, b bVar) {
        synchronized (this.f24460b) {
            boolean z10 = !this.f24462d.containsKey(kVar);
            androidx.core.util.h.j(z10, "Camera is already registered: " + kVar);
            this.f24462d.put(kVar, new a(null, executor, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0063, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099), top: B:28:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0063, B:14:0x0069, B:16:0x0071, B:20:0x0080, B:22:0x0096, B:23:0x0099), top: B:28:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(androidx.camera.core.k r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f24460b
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.k, w.g0$a> r1 = r9.f24462d     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            w.g0$a r1 = (w.g0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.h.h(r1, r2)     // Catch: java.lang.Throwable -> L9b
            w.g0$a r1 = (w.g0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.s1.f(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.f24459a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f24459a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f24463e     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 2
            w.d0$a r8 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = b(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            r10 = 3
            w.d0$a r8 = r1.a()     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.f24463e     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            w.d0$a r10 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = b(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = r4
            goto L69
        L63:
            w.d0$a r10 = w.d0.a.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.c(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.s1.f(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f24459a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f24459a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.s1.a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.d()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g0.f(androidx.camera.core.k):boolean");
    }
}
