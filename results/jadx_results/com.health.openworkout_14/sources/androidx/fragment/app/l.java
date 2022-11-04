package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final CopyOnWriteArrayList<a> f1070a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final m f1071b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final m.f f1072a;

        /* renamed from: b */
        final boolean f1073b;
    }

    public l(m mVar) {
        this.f1071b = mVar;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.a(this.f1071b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().b(fragment, context, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.b(this.f1071b, fragment, context);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.c(this.f1071b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().d(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.d(this.f1071b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().e(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.e(this.f1071b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().f(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.f(this.f1071b, fragment);
            }
        }
    }

    public void g(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().g(fragment, context, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.g(this.f1071b, fragment, context);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.h(this.f1071b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().i(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.i(this.f1071b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.j(this.f1071b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().k(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.k(this.f1071b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().l(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.l(this.f1071b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.m(this.f1071b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment i0 = this.f1071b.i0();
        if (i0 != null) {
            i0.F().h0().n(fragment, true);
        }
        Iterator<a> it = this.f1070a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1073b) {
                next.f1072a.n(this.f1071b, fragment);
            }
        }
    }
}
