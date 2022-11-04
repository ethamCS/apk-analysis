package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: a */
    int f241a;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.a implements g {

        /* renamed from: d */
        final i f242d;

        /* renamed from: e */
        final /* synthetic */ LiveData f243e;

        @Override // androidx.lifecycle.g
        public void g(i iVar, e.a aVar) {
            if (this.f242d.a().a() == e.b.DESTROYED) {
                this.f243e.d(this.f244a);
            } else {
                h(i());
            }
        }

        boolean i() {
            return this.f242d.a().a().a(e.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    private abstract class a {

        /* renamed from: a */
        final m<? super T> f244a;

        /* renamed from: b */
        boolean f245b;

        /* renamed from: c */
        final /* synthetic */ LiveData f246c;

        void h(boolean z) {
            if (z == this.f245b) {
                return;
            }
            this.f245b = z;
            LiveData liveData = this.f246c;
            int i = liveData.f241a;
            int i2 = 1;
            boolean z2 = i == 0;
            if (!z) {
                i2 = -1;
            }
            liveData.f241a = i + i2;
            if (z2 && z) {
                liveData.b();
            }
            LiveData liveData2 = this.f246c;
            if (liveData2.f241a == 0 && !this.f245b) {
                liveData2.c();
            }
            if (!this.f245b) {
                return;
            }
            this.f246c.a(this);
        }
    }

    abstract void a(LiveData<T>.a aVar);

    protected abstract void b();

    protected abstract void c();

    public abstract void d(m<? super T> mVar);
}
