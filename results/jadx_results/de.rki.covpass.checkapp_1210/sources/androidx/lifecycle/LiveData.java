package androidx.lifecycle;

import androidx.lifecycle.m;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f4258k = new Object();

    /* renamed from: a */
    final Object f4259a;

    /* renamed from: b */
    private n.b<e0<? super T>, LiveData<T>.c> f4260b;

    /* renamed from: c */
    int f4261c;

    /* renamed from: d */
    private boolean f4262d;

    /* renamed from: e */
    private volatile Object f4263e;

    /* renamed from: f */
    volatile Object f4264f;

    /* renamed from: g */
    private int f4265g;

    /* renamed from: h */
    private boolean f4266h;

    /* renamed from: i */
    private boolean f4267i;

    /* renamed from: j */
    private final Runnable f4268j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements s {
        final /* synthetic */ LiveData U3;

        /* renamed from: y */
        final v f4269y;

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f4269y.c().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return this.f4269y.c().b().b(m.c.STARTED);
        }

        @Override // androidx.lifecycle.s
        public void f(v vVar, m.b bVar) {
            m.c b10 = this.f4269y.c().b();
            if (b10 == m.c.DESTROYED) {
                this.U3.l(this.f4272c);
                return;
            }
            m.c cVar = null;
            while (cVar != b10) {
                a(d());
                cVar = b10;
                b10 = this.f4269y.c().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            LiveData.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4259a) {
                obj = LiveData.this.f4264f;
                LiveData.this.f4264f = LiveData.f4258k;
            }
            LiveData.this.m(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e0<? super T> e0Var) {
            super(e0Var);
            LiveData.this = r1;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: c */
        final e0<? super T> f4272c;

        /* renamed from: d */
        boolean f4273d;

        /* renamed from: q */
        int f4274q = -1;

        c(e0<? super T> e0Var) {
            LiveData.this = r1;
            this.f4272c = e0Var;
        }

        void a(boolean z10) {
            if (z10 == this.f4273d) {
                return;
            }
            this.f4273d = z10;
            LiveData.this.b(z10 ? 1 : -1);
            if (!this.f4273d) {
                return;
            }
            LiveData.this.d(this);
        }

        void b() {
        }

        abstract boolean d();
    }

    public LiveData() {
        this.f4259a = new Object();
        this.f4260b = new n.b<>();
        this.f4261c = 0;
        Object obj = f4258k;
        this.f4264f = obj;
        this.f4268j = new a();
        this.f4263e = obj;
        this.f4265g = -1;
    }

    public LiveData(T t10) {
        this.f4259a = new Object();
        this.f4260b = new n.b<>();
        this.f4261c = 0;
        this.f4264f = f4258k;
        this.f4268j = new a();
        this.f4263e = t10;
        this.f4265g = 0;
    }

    static void a(String str) {
        if (m.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.c cVar) {
        if (!cVar.f4273d) {
            return;
        }
        if (!cVar.d()) {
            cVar.a(false);
            return;
        }
        int i10 = cVar.f4274q;
        int i11 = this.f4265g;
        if (i10 >= i11) {
            return;
        }
        cVar.f4274q = i11;
        cVar.f4272c.a((Object) this.f4263e);
    }

    void b(int i10) {
        int i11 = this.f4261c;
        this.f4261c = i10 + i11;
        if (this.f4262d) {
            return;
        }
        this.f4262d = true;
        while (true) {
            try {
                int i12 = this.f4261c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    i();
                } else if (z11) {
                    j();
                }
                i11 = i12;
            } finally {
                this.f4262d = false;
            }
        }
    }

    void d(LiveData<T>.c cVar) {
        if (this.f4266h) {
            this.f4267i = true;
            return;
        }
        this.f4266h = true;
        do {
            this.f4267i = false;
            if (cVar == null) {
                n.b<e0<? super T>, LiveData<T>.c>.d d10 = this.f4260b.d();
                while (d10.hasNext()) {
                    c((c) d10.next().getValue());
                    if (this.f4267i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.f4267i);
        this.f4266h = false;
    }

    public T e() {
        T t10 = (T) this.f4263e;
        if (t10 != f4258k) {
            return t10;
        }
        return null;
    }

    public int f() {
        return this.f4265g;
    }

    public boolean g() {
        return this.f4261c > 0;
    }

    public void h(e0<? super T> e0Var) {
        a("observeForever");
        b bVar = new b(e0Var);
        LiveData<T>.c i10 = this.f4260b.i(e0Var, bVar);
        if (!(i10 instanceof LifecycleBoundObserver)) {
            if (i10 != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    protected void i() {
    }

    protected void j() {
    }

    public void k(T t10) {
        boolean z10;
        synchronized (this.f4259a) {
            z10 = this.f4264f == f4258k;
            this.f4264f = t10;
        }
        if (!z10) {
            return;
        }
        m.a.e().c(this.f4268j);
    }

    public void l(e0<? super T> e0Var) {
        a("removeObserver");
        LiveData<T>.c k10 = this.f4260b.k(e0Var);
        if (k10 == null) {
            return;
        }
        k10.b();
        k10.a(false);
    }

    public void m(T t10) {
        a("setValue");
        this.f4265g++;
        this.f4263e = t10;
        d(null);
    }
}
