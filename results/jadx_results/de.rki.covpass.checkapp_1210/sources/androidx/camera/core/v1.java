package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w.h1;
/* loaded from: classes.dex */
public class v1 implements w.h1, k0.a {

    /* renamed from: a */
    private final Object f2515a;

    /* renamed from: b */
    private w.h f2516b;

    /* renamed from: c */
    private h1.a f2517c;

    /* renamed from: d */
    private boolean f2518d;

    /* renamed from: e */
    private final w.h1 f2519e;

    /* renamed from: f */
    h1.a f2520f;

    /* renamed from: g */
    private Executor f2521g;

    /* renamed from: h */
    private final LongSparseArray<k1> f2522h;

    /* renamed from: i */
    private final LongSparseArray<n1> f2523i;

    /* renamed from: j */
    private int f2524j;

    /* renamed from: k */
    private final List<n1> f2525k;

    /* renamed from: l */
    private final List<n1> f2526l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w.h {
        a() {
            v1.this = r1;
        }

        @Override // w.h
        public void b(w.q qVar) {
            super.b(qVar);
            v1.this.v(qVar);
        }
    }

    public v1(int i10, int i11, int i12, int i13) {
        this(m(i10, i11, i12, i13));
    }

    v1(w.h1 h1Var) {
        this.f2515a = new Object();
        this.f2516b = new a();
        this.f2517c = new h1.a() { // from class: androidx.camera.core.u1
            @Override // w.h1.a
            public final void a(w.h1 h1Var2) {
                v1.this.s(h1Var2);
            }
        };
        this.f2518d = false;
        this.f2522h = new LongSparseArray<>();
        this.f2523i = new LongSparseArray<>();
        this.f2526l = new ArrayList();
        this.f2519e = h1Var;
        this.f2524j = 0;
        this.f2525k = new ArrayList(i());
    }

    private static w.h1 m(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void n(n1 n1Var) {
        synchronized (this.f2515a) {
            int indexOf = this.f2525k.indexOf(n1Var);
            if (indexOf >= 0) {
                this.f2525k.remove(indexOf);
                int i10 = this.f2524j;
                if (indexOf <= i10) {
                    this.f2524j = i10 - 1;
                }
            }
            this.f2526l.remove(n1Var);
        }
    }

    private void o(p2 p2Var) {
        final h1.a aVar;
        Executor executor;
        synchronized (this.f2515a) {
            aVar = null;
            if (this.f2525k.size() < i()) {
                p2Var.b(this);
                this.f2525k.add(p2Var);
                aVar = this.f2520f;
                executor = this.f2521g;
            } else {
                s1.a("TAG", "Maximum image number reached.");
                p2Var.close();
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        v1.this.r(aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public /* synthetic */ void r(h1.a aVar) {
        aVar.a(this);
    }

    private void t() {
        synchronized (this.f2515a) {
            for (int size = this.f2522h.size() - 1; size >= 0; size--) {
                k1 valueAt = this.f2522h.valueAt(size);
                long c10 = valueAt.c();
                n1 n1Var = this.f2523i.get(c10);
                if (n1Var != null) {
                    this.f2523i.remove(c10);
                    this.f2522h.removeAt(size);
                    o(new p2(n1Var, valueAt));
                }
            }
            u();
        }
    }

    private void u() {
        synchronized (this.f2515a) {
            if (this.f2523i.size() != 0 && this.f2522h.size() != 0) {
                boolean z10 = false;
                Long valueOf = Long.valueOf(this.f2523i.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f2522h.keyAt(0));
                if (!valueOf2.equals(valueOf)) {
                    z10 = true;
                }
                androidx.core.util.h.a(z10);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f2523i.size() - 1; size >= 0; size--) {
                        if (this.f2523i.keyAt(size) < valueOf2.longValue()) {
                            this.f2523i.valueAt(size).close();
                            this.f2523i.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f2522h.size() - 1; size2 >= 0; size2--) {
                        if (this.f2522h.keyAt(size2) < valueOf.longValue()) {
                            this.f2522h.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // w.h1
    public int a() {
        int a10;
        synchronized (this.f2515a) {
            a10 = this.f2519e.a();
        }
        return a10;
    }

    @Override // w.h1
    public Surface b() {
        Surface b10;
        synchronized (this.f2515a) {
            b10 = this.f2519e.b();
        }
        return b10;
    }

    @Override // androidx.camera.core.k0.a
    public void c(n1 n1Var) {
        synchronized (this.f2515a) {
            n(n1Var);
        }
    }

    @Override // w.h1
    public void close() {
        synchronized (this.f2515a) {
            if (this.f2518d) {
                return;
            }
            for (n1 n1Var : new ArrayList(this.f2525k)) {
                n1Var.close();
            }
            this.f2525k.clear();
            this.f2519e.close();
            this.f2518d = true;
        }
    }

    @Override // w.h1
    public int d() {
        int d10;
        synchronized (this.f2515a) {
            d10 = this.f2519e.d();
        }
        return d10;
    }

    @Override // w.h1
    public n1 e() {
        synchronized (this.f2515a) {
            if (this.f2525k.isEmpty()) {
                return null;
            }
            if (this.f2524j >= this.f2525k.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList<n1> arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f2525k.size() - 1; i10++) {
                if (!this.f2526l.contains(this.f2525k.get(i10))) {
                    arrayList.add(this.f2525k.get(i10));
                }
            }
            for (n1 n1Var : arrayList) {
                n1Var.close();
            }
            int size = this.f2525k.size() - 1;
            List<n1> list = this.f2525k;
            this.f2524j = size + 1;
            n1 n1Var2 = list.get(size);
            this.f2526l.add(n1Var2);
            return n1Var2;
        }
    }

    @Override // w.h1
    public int f() {
        int f10;
        synchronized (this.f2515a) {
            f10 = this.f2519e.f();
        }
        return f10;
    }

    @Override // w.h1
    public void g(h1.a aVar, Executor executor) {
        synchronized (this.f2515a) {
            this.f2520f = (h1.a) androidx.core.util.h.g(aVar);
            this.f2521g = (Executor) androidx.core.util.h.g(executor);
            this.f2519e.g(this.f2517c, executor);
        }
    }

    @Override // w.h1
    public void h() {
        synchronized (this.f2515a) {
            this.f2520f = null;
            this.f2521g = null;
        }
    }

    @Override // w.h1
    public int i() {
        int i10;
        synchronized (this.f2515a) {
            i10 = this.f2519e.i();
        }
        return i10;
    }

    @Override // w.h1
    public n1 j() {
        synchronized (this.f2515a) {
            if (this.f2525k.isEmpty()) {
                return null;
            }
            if (this.f2524j >= this.f2525k.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List<n1> list = this.f2525k;
            int i10 = this.f2524j;
            this.f2524j = i10 + 1;
            n1 n1Var = list.get(i10);
            this.f2526l.add(n1Var);
            return n1Var;
        }
    }

    public w.h p() {
        return this.f2516b;
    }

    /* renamed from: q */
    public void s(w.h1 h1Var) {
        synchronized (this.f2515a) {
            if (this.f2518d) {
                return;
            }
            int i10 = 0;
            do {
                n1 n1Var = null;
                try {
                    n1Var = h1Var.j();
                    if (n1Var != null) {
                        i10++;
                        this.f2523i.put(n1Var.I().c(), n1Var);
                        t();
                    }
                } catch (IllegalStateException e10) {
                    s1.b("MetadataImageReader", "Failed to acquire next image.", e10);
                }
                if (n1Var == null) {
                    break;
                }
            } while (i10 < h1Var.i());
        }
    }

    void v(w.q qVar) {
        synchronized (this.f2515a) {
            if (this.f2518d) {
                return;
            }
            this.f2522h.put(qVar.c(), new z.b(qVar));
            t();
        }
    }
}
