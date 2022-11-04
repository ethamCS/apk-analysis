package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object i = new Object();

    /* renamed from: d */
    private volatile Object f1204d;

    /* renamed from: e */
    volatile Object f1205e;

    /* renamed from: g */
    private boolean f1207g;

    /* renamed from: h */
    private boolean f1208h;

    /* renamed from: a */
    final Object f1201a = new Object();

    /* renamed from: b */
    private b.b.a.b.b<o<? super T>, LiveData<T>.a> f1202b = new b.b.a.b.b<>();

    /* renamed from: c */
    int f1203c = 0;

    /* renamed from: f */
    private int f1206f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.a implements g {

        /* renamed from: e */
        final i f1209e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LifecycleBoundObserver(i iVar, o<? super T> oVar) {
            super(oVar);
            LiveData.this = r1;
            this.f1209e = iVar;
        }

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.a aVar) {
            if (this.f1209e.a().b() == e.b.DESTROYED) {
                LiveData.this.g(this.f1211a);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        void i() {
            this.f1209e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean j(i iVar) {
            return this.f1209e == iVar;
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean k() {
            return this.f1209e.a().b().a(e.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a */
        final o<? super T> f1211a;

        /* renamed from: b */
        boolean f1212b;

        /* renamed from: c */
        int f1213c = -1;

        a(o<? super T> oVar) {
            LiveData.this = r1;
            this.f1211a = oVar;
        }

        void h(boolean z) {
            if (z == this.f1212b) {
                return;
            }
            this.f1212b = z;
            LiveData liveData = LiveData.this;
            int i = liveData.f1203c;
            int i2 = 1;
            boolean z2 = i == 0;
            if (!z) {
                i2 = -1;
            }
            liveData.f1203c = i + i2;
            if (z2 && z) {
                liveData.e();
            }
            LiveData liveData2 = LiveData.this;
            if (liveData2.f1203c == 0 && !this.f1212b) {
                liveData2.f();
            }
            if (!this.f1212b) {
                return;
            }
            LiveData.this.c(this);
        }

        void i() {
        }

        boolean j(i iVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = i;
        this.f1205e = obj;
        this.f1204d = obj;
    }

    static void a(String str) {
        if (b.b.a.a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.a aVar) {
        if (!aVar.f1212b) {
            return;
        }
        if (!aVar.k()) {
            aVar.h(false);
            return;
        }
        int i2 = aVar.f1213c;
        int i3 = this.f1206f;
        if (i2 >= i3) {
            return;
        }
        aVar.f1213c = i3;
        aVar.f1211a.a((Object) this.f1204d);
    }

    void c(LiveData<T>.a aVar) {
        if (this.f1207g) {
            this.f1208h = true;
            return;
        }
        this.f1207g = true;
        do {
            this.f1208h = false;
            if (aVar == null) {
                b.b.a.b.b<o<? super T>, LiveData<T>.a>.d d2 = this.f1202b.d();
                while (d2.hasNext()) {
                    b((a) d2.next().getValue());
                    if (this.f1208h) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.f1208h);
        this.f1207g = false;
    }

    public void d(i iVar, o<? super T> oVar) {
        a("observe");
        if (iVar.a().b() == e.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
        LiveData<T>.a g2 = this.f1202b.g(oVar, lifecycleBoundObserver);
        if (g2 != null && !g2.j(iVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g2 != null) {
            return;
        }
        iVar.a().a(lifecycleBoundObserver);
    }

    protected void e() {
    }

    protected void f() {
    }

    public void g(o<? super T> oVar) {
        a("removeObserver");
        LiveData<T>.a h2 = this.f1202b.h(oVar);
        if (h2 == null) {
            return;
        }
        h2.i();
        h2.h(false);
    }

    public void h(T t) {
        a("setValue");
        this.f1206f++;
        this.f1204d = t;
        c(null);
    }
}
