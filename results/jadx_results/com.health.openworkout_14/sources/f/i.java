package f;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class i extends u {

    /* renamed from: e */
    private u f4446e;

    public i(u uVar) {
        if (uVar != null) {
            this.f4446e = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // f.u
    public u a() {
        return this.f4446e.a();
    }

    @Override // f.u
    public u b() {
        return this.f4446e.b();
    }

    @Override // f.u
    public long c() {
        return this.f4446e.c();
    }

    @Override // f.u
    public u d(long j) {
        return this.f4446e.d(j);
    }

    @Override // f.u
    public boolean e() {
        return this.f4446e.e();
    }

    @Override // f.u
    public void f() {
        this.f4446e.f();
    }

    @Override // f.u
    public u g(long j, TimeUnit timeUnit) {
        return this.f4446e.g(j, timeUnit);
    }

    public final u i() {
        return this.f4446e;
    }

    public final i j(u uVar) {
        if (uVar != null) {
            this.f4446e = uVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
