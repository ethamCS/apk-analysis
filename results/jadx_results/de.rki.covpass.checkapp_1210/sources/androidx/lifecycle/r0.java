package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.m;
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a */
    private final x f4371a;

    /* renamed from: b */
    private final Handler f4372b = new Handler();

    /* renamed from: c */
    private a f4373c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: c */
        private final x f4374c;

        /* renamed from: d */
        final m.b f4375d;

        /* renamed from: q */
        private boolean f4376q = false;

        a(x xVar, m.b bVar) {
            this.f4374c = xVar;
            this.f4375d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4376q) {
                this.f4374c.h(this.f4375d);
                this.f4376q = true;
            }
        }
    }

    public r0(v vVar) {
        this.f4371a = new x(vVar);
    }

    private void f(m.b bVar) {
        a aVar = this.f4373c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f4371a, bVar);
        this.f4373c = aVar2;
        this.f4372b.postAtFrontOfQueue(aVar2);
    }

    public m a() {
        return this.f4371a;
    }

    public void b() {
        f(m.b.ON_START);
    }

    public void c() {
        f(m.b.ON_CREATE);
    }

    public void d() {
        f(m.b.ON_STOP);
        f(m.b.ON_DESTROY);
    }

    public void e() {
        f(m.b.ON_START);
    }
}
