package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.c3;
import androidx.camera.core.k;
import androidx.camera.core.r;
import androidx.lifecycle.f0;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCamera implements u, k {

    /* renamed from: d */
    private final v f2585d;

    /* renamed from: q */
    private final z.e f2586q;

    /* renamed from: c */
    private final Object f2584c = new Object();

    /* renamed from: x */
    private volatile boolean f2587x = false;

    /* renamed from: y */
    private boolean f2588y = false;
    private boolean U3 = false;

    public LifecycleCamera(v vVar, z.e eVar) {
        this.f2585d = vVar;
        this.f2586q = eVar;
        if (vVar.c().b().b(m.c.STARTED)) {
            eVar.k();
        } else {
            eVar.u();
        }
        vVar.c().a(this);
    }

    @Override // androidx.camera.core.k
    public r a() {
        return this.f2586q.a();
    }

    @Override // androidx.camera.core.k
    public androidx.camera.core.m d() {
        return this.f2586q.d();
    }

    public void h(t tVar) {
        this.f2586q.h(tVar);
    }

    public void j(Collection<c3> collection) {
        synchronized (this.f2584c) {
            this.f2586q.j(collection);
        }
    }

    public z.e k() {
        return this.f2586q;
    }

    public v n() {
        v vVar;
        synchronized (this.f2584c) {
            vVar = this.f2585d;
        }
        return vVar;
    }

    public List<c3> o() {
        List<c3> unmodifiableList;
        synchronized (this.f2584c) {
            unmodifiableList = Collections.unmodifiableList(this.f2586q.y());
        }
        return unmodifiableList;
    }

    @f0(m.b.ON_DESTROY)
    public void onDestroy(v vVar) {
        synchronized (this.f2584c) {
            z.e eVar = this.f2586q;
            eVar.G(eVar.y());
        }
    }

    @f0(m.b.ON_PAUSE)
    public void onPause(v vVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2586q.b(false);
        }
    }

    @f0(m.b.ON_RESUME)
    public void onResume(v vVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2586q.b(true);
        }
    }

    @f0(m.b.ON_START)
    public void onStart(v vVar) {
        synchronized (this.f2584c) {
            if (!this.f2588y && !this.U3) {
                this.f2586q.k();
                this.f2587x = true;
            }
        }
    }

    @f0(m.b.ON_STOP)
    public void onStop(v vVar) {
        synchronized (this.f2584c) {
            if (!this.f2588y && !this.U3) {
                this.f2586q.u();
                this.f2587x = false;
            }
        }
    }

    public boolean p(c3 c3Var) {
        boolean contains;
        synchronized (this.f2584c) {
            contains = this.f2586q.y().contains(c3Var);
        }
        return contains;
    }

    public void q() {
        synchronized (this.f2584c) {
            if (this.f2588y) {
                return;
            }
            onStop(this.f2585d);
            this.f2588y = true;
        }
    }

    public void r() {
        synchronized (this.f2584c) {
            z.e eVar = this.f2586q;
            eVar.G(eVar.y());
        }
    }

    public void s() {
        synchronized (this.f2584c) {
            if (!this.f2588y) {
                return;
            }
            this.f2588y = false;
            if (this.f2585d.c().b().b(m.c.STARTED)) {
                onStart(this.f2585d);
            }
        }
    }
}
