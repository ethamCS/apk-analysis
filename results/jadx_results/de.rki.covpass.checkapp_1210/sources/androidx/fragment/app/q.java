package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f4184a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final w f4185b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final w.l f4186a;

        /* renamed from: b */
        final boolean f4187b;

        a(w.l lVar, boolean z10) {
            this.f4186a = lVar;
            this.f4187b = z10;
        }
    }

    public q(w wVar) {
        this.f4185b = wVar;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.a(this.f4185b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z10) {
        Context i10 = this.f4185b.y0().i();
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().b(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.b(this.f4185b, fragment, i10);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.c(this.f4185b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().d(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.d(this.f4185b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().e(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.e(this.f4185b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().f(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.f(this.f4185b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z10) {
        Context i10 = this.f4185b.y0().i();
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().g(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.g(this.f4185b, fragment, i10);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.h(this.f4185b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().i(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.i(this.f4185b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.j(this.f4185b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().k(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.k(this.f4185b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().l(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.l(this.f4185b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.m(this.f4185b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z10) {
        Fragment B0 = this.f4185b.B0();
        if (B0 != null) {
            B0.i0().A0().n(fragment, true);
        }
        Iterator<a> it = this.f4184a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4187b) {
                next.f4186a.n(this.f4185b, fragment);
            }
        }
    }

    public void o(w.l lVar, boolean z10) {
        this.f4184a.add(new a(lVar, z10));
    }

    public void p(w.l lVar) {
        synchronized (this.f4184a) {
            int i10 = 0;
            int size = this.f4184a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f4184a.get(i10).f4186a == lVar) {
                    this.f4184a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }
}
