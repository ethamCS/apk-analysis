package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a */
    private final AtomicBoolean f1924a = new AtomicBoolean(false);

    /* renamed from: b */
    private final j f1925b;

    /* renamed from: c */
    private volatile b.o.a.f f1926c;

    public p(j jVar) {
        this.f1925b = jVar;
    }

    private b.o.a.f c() {
        return this.f1925b.d(d());
    }

    private b.o.a.f e(boolean z) {
        if (z) {
            if (this.f1926c == null) {
                this.f1926c = c();
            }
            return this.f1926c;
        }
        return c();
    }

    public b.o.a.f a() {
        b();
        return e(this.f1924a.compareAndSet(false, true));
    }

    protected void b() {
        this.f1925b.a();
    }

    protected abstract String d();

    public void f(b.o.a.f fVar) {
        if (fVar == this.f1926c) {
            this.f1924a.set(false);
        }
    }
}
