package h4;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c */
    private final d<K> f11250c;

    /* renamed from: e */
    protected r4.c<A> f11252e;

    /* renamed from: a */
    final List<b> f11248a = new ArrayList(1);

    /* renamed from: b */
    private boolean f11249b = false;

    /* renamed from: d */
    protected float f11251d = 0.0f;

    /* renamed from: f */
    private A f11253f = null;

    /* renamed from: g */
    private float f11254g = -1.0f;

    /* renamed from: h */
    private float f11255h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void b();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // h4.a.d
        public float a() {
            return 1.0f;
        }

        @Override // h4.a.d
        public boolean b(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // h4.a.d
        public float c() {
            return 0.0f;
        }

        @Override // h4.a.d
        public r4.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        @Override // h4.a.d
        public boolean e(float f10) {
            return false;
        }

        @Override // h4.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        float a();

        boolean b(float f10);

        float c();

        r4.a<T> d();

        boolean e(float f10);

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a */
        private final List<? extends r4.a<T>> f11256a;

        /* renamed from: c */
        private r4.a<T> f11258c = null;

        /* renamed from: d */
        private float f11259d = -1.0f;

        /* renamed from: b */
        private r4.a<T> f11257b = f(0.0f);

        e(List<? extends r4.a<T>> list) {
            this.f11256a = list;
        }

        private r4.a<T> f(float f10) {
            List<? extends r4.a<T>> list = this.f11256a;
            r4.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f11256a.size() - 2; size >= 1; size--) {
                r4.a<T> aVar2 = this.f11256a.get(size);
                if (this.f11257b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f11256a.get(0);
        }

        @Override // h4.a.d
        public float a() {
            List<? extends r4.a<T>> list = this.f11256a;
            return list.get(list.size() - 1).b();
        }

        @Override // h4.a.d
        public boolean b(float f10) {
            r4.a<T> aVar = this.f11258c;
            r4.a<T> aVar2 = this.f11257b;
            if (aVar == aVar2 && this.f11259d == f10) {
                return true;
            }
            this.f11258c = aVar2;
            this.f11259d = f10;
            return false;
        }

        @Override // h4.a.d
        public float c() {
            return this.f11256a.get(0).e();
        }

        @Override // h4.a.d
        public r4.a<T> d() {
            return this.f11257b;
        }

        @Override // h4.a.d
        public boolean e(float f10) {
            if (this.f11257b.a(f10)) {
                return !this.f11257b.h();
            }
            this.f11257b = f(f10);
            return true;
        }

        @Override // h4.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a */
        private final r4.a<T> f11260a;

        /* renamed from: b */
        private float f11261b = -1.0f;

        f(List<? extends r4.a<T>> list) {
            this.f11260a = list.get(0);
        }

        @Override // h4.a.d
        public float a() {
            return this.f11260a.b();
        }

        @Override // h4.a.d
        public boolean b(float f10) {
            if (this.f11261b == f10) {
                return true;
            }
            this.f11261b = f10;
            return false;
        }

        @Override // h4.a.d
        public float c() {
            return this.f11260a.e();
        }

        @Override // h4.a.d
        public r4.a<T> d() {
            return this.f11260a;
        }

        @Override // h4.a.d
        public boolean e(float f10) {
            return !this.f11260a.h();
        }

        @Override // h4.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends r4.a<K>> list) {
        this.f11250c = o(list);
    }

    private float g() {
        if (this.f11254g == -1.0f) {
            this.f11254g = this.f11250c.c();
        }
        return this.f11254g;
    }

    private static <T> d<T> o(List<? extends r4.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f11248a.add(bVar);
    }

    public r4.a<K> b() {
        e4.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        r4.a<K> d10 = this.f11250c.d();
        e4.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return d10;
    }

    float c() {
        if (this.f11255h == -1.0f) {
            this.f11255h = this.f11250c.a();
        }
        return this.f11255h;
    }

    public float d() {
        r4.a<K> b10 = b();
        if (b10 == null || b10.h()) {
            return 0.0f;
        }
        return b10.f20445d.getInterpolation(e());
    }

    public float e() {
        if (this.f11249b) {
            return 0.0f;
        }
        r4.a<K> b10 = b();
        if (!b10.h()) {
            return (this.f11251d - b10.e()) / (b10.b() - b10.e());
        }
        return 0.0f;
    }

    public float f() {
        return this.f11251d;
    }

    public A h() {
        float e10 = e();
        if (this.f11252e != null || !this.f11250c.b(e10)) {
            r4.a<K> b10 = b();
            Interpolator interpolator = b10.f20446e;
            A i10 = (interpolator == null || b10.f20447f == null) ? i(b10, d()) : j(b10, e10, interpolator.getInterpolation(e10), b10.f20447f.getInterpolation(e10));
            this.f11253f = i10;
            return i10;
        }
        return this.f11253f;
    }

    abstract A i(r4.a<K> aVar, float f10);

    protected A j(r4.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i10 = 0; i10 < this.f11248a.size(); i10++) {
            this.f11248a.get(i10).b();
        }
    }

    public void l() {
        this.f11249b = true;
    }

    public void m(float f10) {
        if (this.f11250c.isEmpty()) {
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f11251d) {
            return;
        }
        this.f11251d = f10;
        if (!this.f11250c.e(f10)) {
            return;
        }
        k();
    }

    public void n(r4.c<A> cVar) {
        r4.c<A> cVar2 = this.f11252e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f11252e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
