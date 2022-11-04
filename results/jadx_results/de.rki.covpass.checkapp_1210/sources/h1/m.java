package h1;

import androidx.room.i0;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a */
    private final AtomicBoolean f11158a = new AtomicBoolean(false);

    /* renamed from: b */
    private final i0 f11159b;

    /* renamed from: c */
    private volatile m1.k f11160c;

    public m(i0 i0Var) {
        this.f11159b = i0Var;
    }

    private m1.k c() {
        return this.f11159b.f(d());
    }

    private m1.k e(boolean z10) {
        if (z10) {
            if (this.f11160c == null) {
                this.f11160c = c();
            }
            return this.f11160c;
        }
        return c();
    }

    public m1.k a() {
        b();
        return e(this.f11158a.compareAndSet(false, true));
    }

    protected void b() {
        this.f11159b.c();
    }

    protected abstract String d();

    public void f(m1.k kVar) {
        if (kVar == this.f11160c) {
            this.f11158a.set(false);
        }
    }
}
