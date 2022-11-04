package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import w.h1;
/* loaded from: classes.dex */
public class g0 implements w.l0 {

    /* renamed from: a */
    private final w.l0 f2179a;

    /* renamed from: b */
    private final w.l0 f2180b;

    /* renamed from: c */
    private final x5.a<List<Void>> f2181c;

    /* renamed from: d */
    final Executor f2182d;

    /* renamed from: e */
    private final int f2183e;

    /* renamed from: f */
    private w.h1 f2184f = null;

    /* renamed from: g */
    private k1 f2185g = null;

    /* renamed from: h */
    private final Object f2186h = new Object();

    /* renamed from: i */
    private boolean f2187i = false;

    /* renamed from: j */
    private boolean f2188j = false;

    /* renamed from: k */
    c.a<Void> f2189k;

    /* renamed from: l */
    private x5.a<Void> f2190l;

    public g0(w.l0 l0Var, int i10, w.l0 l0Var2, Executor executor) {
        this.f2179a = l0Var;
        this.f2180b = l0Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(l0Var.d());
        arrayList.add(l0Var2.d());
        this.f2181c = y.f.c(arrayList);
        this.f2182d = executor;
        this.f2183e = i10;
    }

    private void j() {
        boolean z10;
        boolean z11;
        final c.a<Void> aVar;
        synchronized (this.f2186h) {
            z10 = this.f2187i;
            z11 = this.f2188j;
            aVar = this.f2189k;
            if (z10 && !z11) {
                this.f2184f.close();
            }
        }
        if (!z10 || z11 || aVar == null) {
            return;
        }
        this.f2181c.b(new Runnable() { // from class: androidx.camera.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                c.a.this.c(null);
            }
        }, x.a.a());
    }

    public static /* synthetic */ Void l(List list) {
        return null;
    }

    public /* synthetic */ Object m(c.a aVar) {
        synchronized (this.f2186h) {
            this.f2189k = aVar;
        }
        return "CaptureProcessorPipeline-close";
    }

    public /* synthetic */ void o(w.h1 h1Var) {
        final n1 j10 = h1Var.j();
        try {
            this.f2182d.execute(new Runnable() { // from class: androidx.camera.core.c0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.this.n(j10);
                }
            });
        } catch (RejectedExecutionException unused) {
            s1.c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            j10.close();
        }
    }

    @Override // w.l0
    public void a(w.g1 g1Var) {
        synchronized (this.f2186h) {
            if (this.f2187i) {
                return;
            }
            this.f2188j = true;
            x5.a<n1> a10 = g1Var.a(g1Var.b().get(0).intValue());
            androidx.core.util.h.a(a10.isDone());
            try {
                this.f2185g = a10.get().I();
                this.f2179a.a(g1Var);
            } catch (InterruptedException | ExecutionException unused) {
                throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
            }
        }
    }

    @Override // w.l0
    public void b(Size size) {
        d dVar = new d(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f2183e));
        this.f2184f = dVar;
        this.f2179a.c(dVar.b(), 35);
        this.f2179a.b(size);
        this.f2180b.b(size);
        this.f2184f.g(new h1.a() { // from class: androidx.camera.core.f0
            @Override // w.h1.a
            public final void a(w.h1 h1Var) {
                g0.this.o(h1Var);
            }
        }, x.a.a());
    }

    @Override // w.l0
    public void c(Surface surface, int i10) {
        this.f2180b.c(surface, i10);
    }

    @Override // w.l0
    public void close() {
        synchronized (this.f2186h) {
            if (this.f2187i) {
                return;
            }
            this.f2187i = true;
            this.f2179a.close();
            this.f2180b.close();
            j();
        }
    }

    @Override // w.l0
    public x5.a<Void> d() {
        x5.a<Void> aVar;
        synchronized (this.f2186h) {
            if (!this.f2187i || this.f2188j) {
                if (this.f2190l == null) {
                    this.f2190l = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.b0
                        @Override // androidx.concurrent.futures.c.AbstractC0023c
                        public final Object a(c.a aVar2) {
                            Object m10;
                            m10 = g0.this.m(aVar2);
                            return m10;
                        }
                    });
                }
                aVar = y.f.j(this.f2190l);
            } else {
                aVar = y.f.o(this.f2181c, e0.f2163a, x.a.a());
            }
        }
        return aVar;
    }

    /* renamed from: p */
    public void n(n1 n1Var) {
        boolean z10;
        synchronized (this.f2186h) {
            z10 = this.f2187i;
        }
        if (!z10) {
            Size size = new Size(n1Var.d(), n1Var.a());
            androidx.core.util.h.g(this.f2185g);
            String next = this.f2185g.a().d().iterator().next();
            int intValue = ((Integer) this.f2185g.a().c(next)).intValue();
            p2 p2Var = new p2(n1Var, size, this.f2185g);
            this.f2185g = null;
            q2 q2Var = new q2(Collections.singletonList(Integer.valueOf(intValue)), next);
            q2Var.c(p2Var);
            try {
                this.f2180b.a(q2Var);
            } catch (Exception e10) {
                s1.c("CaptureProcessorPipeline", "Post processing image failed! " + e10.getMessage());
            }
        }
        synchronized (this.f2186h) {
            this.f2188j = false;
        }
        j();
    }
}
