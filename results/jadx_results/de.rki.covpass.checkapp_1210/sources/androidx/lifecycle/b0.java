package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class b0<T> extends d0<T> {

    /* renamed from: l */
    private n.b<LiveData<?>, a<?>> f4299l = new n.b<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<V> implements e0<V> {

        /* renamed from: a */
        final LiveData<V> f4300a;

        /* renamed from: b */
        final e0<? super V> f4301b;

        /* renamed from: c */
        int f4302c = -1;

        a(LiveData<V> liveData, e0<? super V> e0Var) {
            this.f4300a = liveData;
            this.f4301b = e0Var;
        }

        @Override // androidx.lifecycle.e0
        public void a(V v10) {
            if (this.f4302c != this.f4300a.f()) {
                this.f4302c = this.f4300a.f();
                this.f4301b.a(v10);
            }
        }

        void b() {
            this.f4300a.h(this);
        }

        void c() {
            this.f4300a.l(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void i() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4299l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void j() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4299l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void n(LiveData<S> liveData, e0<? super S> e0Var) {
        Objects.requireNonNull(liveData, "source cannot be null");
        a<?> aVar = new a<>(liveData, e0Var);
        a<?> i10 = this.f4299l.i(liveData, aVar);
        if (i10 == null || i10.f4301b == e0Var) {
            if (i10 != null || !g()) {
                return;
            }
            aVar.b();
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    public <S> void o(LiveData<S> liveData) {
        a<?> k10 = this.f4299l.k(liveData);
        if (k10 != null) {
            k10.c();
        }
    }
}
