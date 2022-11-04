package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object i = new Object();

    /* renamed from: a */
    final Object f967a = new Object();

    /* renamed from: b */
    private a.b.a.b.b<n<? super T>, LiveData<T>.b> f968b = new a.b.a.b.b<>();

    /* renamed from: c */
    int f969c = 0;
    private volatile Object d = i;
    volatile Object e = i;
    private int f = -1;
    private boolean g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements d {
        final h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LifecycleBoundObserver(h hVar, n<? super T> nVar) {
            super(nVar);
            LiveData.this = r1;
            this.e = hVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        void a() {
            this.e.a().b(this);
        }

        @Override // androidx.lifecycle.f
        public void a(h hVar, e.a aVar) {
            if (this.e.a().a() == e.b.DESTROYED) {
                LiveData.this.a((n) this.f971a);
            } else {
                a(b());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean b() {
            return this.e.a().a().a(e.b.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean g(h hVar) {
            return this.e == hVar;
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
            synchronized (LiveData.this.f967a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.i;
            }
            LiveData.this.a((LiveData) obj);
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: a */
        final n<? super T> f971a;

        /* renamed from: b */
        boolean f972b;

        /* renamed from: c */
        int f973c = -1;

        b(n<? super T> nVar) {
            LiveData.this = r1;
            this.f971a = nVar;
        }

        void a() {
        }

        void a(boolean z) {
            if (z == this.f972b) {
                return;
            }
            this.f972b = z;
            int i = 1;
            boolean z2 = LiveData.this.f969c == 0;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f969c;
            if (!this.f972b) {
                i = -1;
            }
            liveData.f969c = i2 + i;
            if (z2 && this.f972b) {
                LiveData.this.a();
            }
            LiveData liveData2 = LiveData.this;
            if (liveData2.f969c == 0 && !this.f972b) {
                liveData2.b();
            }
            if (!this.f972b) {
                return;
            }
            LiveData.this.a(this);
        }

        abstract boolean b();

        boolean g(h hVar) {
            return false;
        }
    }

    public LiveData() {
        new a();
    }

    private static void a(String str) {
        if (a.b.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (!bVar.f972b) {
            return;
        }
        if (!bVar.b()) {
            bVar.a(false);
            return;
        }
        int i2 = bVar.f973c;
        int i3 = this.f;
        if (i2 >= i3) {
            return;
        }
        bVar.f973c = i3;
        bVar.f971a.a((Object) this.d);
    }

    protected void a() {
    }

    void a(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar == null) {
                a.b.a.b.b<n<? super T>, LiveData<T>.b>.d c2 = this.f968b.c();
                while (c2.hasNext()) {
                    b((b) c2.next().getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public void a(h hVar, n<? super T> nVar) {
        a("observe");
        if (hVar.a().a() == e.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, nVar);
        LiveData<T>.b b2 = this.f968b.b(nVar, lifecycleBoundObserver);
        if (b2 != null && !b2.g(hVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b2 != null) {
            return;
        }
        hVar.a().a(lifecycleBoundObserver);
    }

    public void a(n<? super T> nVar) {
        a("removeObserver");
        LiveData<T>.b remove = this.f968b.remove(nVar);
        if (remove == null) {
            return;
        }
        remove.a();
        remove.a(false);
    }

    public void a(T t) {
        a("setValue");
        this.f++;
        this.d = t;
        a((b) null);
    }

    protected void b() {
    }
}
