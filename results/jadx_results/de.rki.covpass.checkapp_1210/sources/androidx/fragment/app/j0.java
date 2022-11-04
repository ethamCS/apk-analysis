package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
/* loaded from: classes.dex */
public class j0 implements androidx.lifecycle.l, k1.e, z0 {

    /* renamed from: c */
    private final Fragment f4130c;

    /* renamed from: d */
    private final y0 f4131d;

    /* renamed from: q */
    private androidx.lifecycle.x f4132q = null;

    /* renamed from: x */
    private k1.d f4133x = null;

    public j0(Fragment fragment, y0 y0Var) {
        this.f4130c = fragment;
        this.f4131d = y0Var;
    }

    @Override // androidx.lifecycle.z0
    public y0 I() {
        b();
        return this.f4131d;
    }

    public void a(m.b bVar) {
        this.f4132q.h(bVar);
    }

    public void b() {
        if (this.f4132q == null) {
            this.f4132q = new androidx.lifecycle.x(this);
            k1.d a10 = k1.d.a(this);
            this.f4133x = a10;
            a10.c();
            androidx.lifecycle.m0.c(this);
        }
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.m c() {
        b();
        return this.f4132q;
    }

    public boolean d() {
        return this.f4132q != null;
    }

    public void e(Bundle bundle) {
        this.f4133x.d(bundle);
    }

    @Override // k1.e
    public k1.c g() {
        b();
        return this.f4133x.b();
    }

    public void h(Bundle bundle) {
        this.f4133x.e(bundle);
    }

    public void i(m.c cVar) {
        this.f4132q.o(cVar);
    }

    @Override // androidx.lifecycle.l
    public e1.a x() {
        Application application;
        Context applicationContext = this.f4130c.S1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        e1.d dVar = new e1.d();
        if (application != null) {
            dVar.c(v0.a.f4390e, application);
        }
        dVar.c(androidx.lifecycle.m0.f4345a, this);
        dVar.c(androidx.lifecycle.m0.f4346b, this);
        if (this.f4130c.Q() != null) {
            dVar.c(androidx.lifecycle.m0.f4347c, this.f4130c.Q());
        }
        return dVar;
    }
}
