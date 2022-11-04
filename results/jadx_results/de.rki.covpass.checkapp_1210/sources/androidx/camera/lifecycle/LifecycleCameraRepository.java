package androidx.camera.lifecycle;

import androidx.camera.core.c3;
import androidx.camera.core.i3;
import androidx.core.util.h;
import androidx.lifecycle.f0;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import z.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCameraRepository {

    /* renamed from: a */
    private final Object f2589a = new Object();

    /* renamed from: b */
    private final Map<a, LifecycleCamera> f2590b = new HashMap();

    /* renamed from: c */
    private final Map<LifecycleCameraRepositoryObserver, Set<a>> f2591c = new HashMap();

    /* renamed from: d */
    private final ArrayDeque<v> f2592d = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements u {

        /* renamed from: c */
        private final LifecycleCameraRepository f2593c;

        /* renamed from: d */
        private final v f2594d;

        LifecycleCameraRepositoryObserver(v vVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2594d = vVar;
            this.f2593c = lifecycleCameraRepository;
        }

        v a() {
            return this.f2594d;
        }

        @f0(m.b.ON_DESTROY)
        public void onDestroy(v vVar) {
            this.f2593c.l(vVar);
        }

        @f0(m.b.ON_START)
        public void onStart(v vVar) {
            this.f2593c.h(vVar);
        }

        @f0(m.b.ON_STOP)
        public void onStop(v vVar) {
            this.f2593c.i(vVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        static a a(v vVar, e.b bVar) {
            return new androidx.camera.lifecycle.a(vVar, bVar);
        }

        public abstract e.b b();

        public abstract v c();
    }

    private LifecycleCameraRepositoryObserver d(v vVar) {
        synchronized (this.f2589a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2591c.keySet()) {
                if (vVar.equals(lifecycleCameraRepositoryObserver.a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    private boolean f(v vVar) {
        synchronized (this.f2589a) {
            LifecycleCameraRepositoryObserver d10 = d(vVar);
            if (d10 == null) {
                return false;
            }
            for (a aVar : this.f2591c.get(d10)) {
                if (!((LifecycleCamera) h.g(this.f2590b.get(aVar))).o().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void g(LifecycleCamera lifecycleCamera) {
        synchronized (this.f2589a) {
            v n10 = lifecycleCamera.n();
            a a10 = a.a(n10, lifecycleCamera.k().w());
            LifecycleCameraRepositoryObserver d10 = d(n10);
            Set<a> hashSet = d10 != null ? this.f2591c.get(d10) : new HashSet<>();
            hashSet.add(a10);
            this.f2590b.put(a10, lifecycleCamera);
            if (d10 == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(n10, this);
                this.f2591c.put(lifecycleCameraRepositoryObserver, hashSet);
                n10.c().a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    private void j(v vVar) {
        synchronized (this.f2589a) {
            LifecycleCameraRepositoryObserver d10 = d(vVar);
            if (d10 == null) {
                return;
            }
            for (a aVar : this.f2591c.get(d10)) {
                ((LifecycleCamera) h.g(this.f2590b.get(aVar))).q();
            }
        }
    }

    private void m(v vVar) {
        synchronized (this.f2589a) {
            for (a aVar : this.f2591c.get(d(vVar))) {
                LifecycleCamera lifecycleCamera = this.f2590b.get(aVar);
                if (!((LifecycleCamera) h.g(lifecycleCamera)).o().isEmpty()) {
                    lifecycleCamera.s();
                }
            }
        }
    }

    public void a(LifecycleCamera lifecycleCamera, i3 i3Var, Collection<c3> collection) {
        synchronized (this.f2589a) {
            h.a(!collection.isEmpty());
            v n10 = lifecycleCamera.n();
            for (a aVar : this.f2591c.get(d(n10))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) h.g(this.f2590b.get(aVar));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.o().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.k().I(i3Var);
                lifecycleCamera.j(collection);
                if (n10.c().b().b(m.c.STARTED)) {
                    h(n10);
                }
            } catch (e.a e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
    }

    public LifecycleCamera b(v vVar, z.e eVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2589a) {
            h.b(this.f2590b.get(a.a(vVar, eVar.w())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (vVar.c().b() == m.c.DESTROYED) {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
            lifecycleCamera = new LifecycleCamera(vVar, eVar);
            if (eVar.y().isEmpty()) {
                lifecycleCamera.q();
            }
            g(lifecycleCamera);
        }
        return lifecycleCamera;
    }

    public LifecycleCamera c(v vVar, e.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2589a) {
            lifecycleCamera = this.f2590b.get(a.a(vVar, bVar));
        }
        return lifecycleCamera;
    }

    public Collection<LifecycleCamera> e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2589a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2590b.values());
        }
        return unmodifiableCollection;
    }

    void h(v vVar) {
        ArrayDeque<v> arrayDeque;
        synchronized (this.f2589a) {
            if (!f(vVar)) {
                return;
            }
            if (!this.f2592d.isEmpty()) {
                v peek = this.f2592d.peek();
                if (!vVar.equals(peek)) {
                    j(peek);
                    this.f2592d.remove(vVar);
                    arrayDeque = this.f2592d;
                }
                m(vVar);
            }
            arrayDeque = this.f2592d;
            arrayDeque.push(vVar);
            m(vVar);
        }
    }

    void i(v vVar) {
        synchronized (this.f2589a) {
            this.f2592d.remove(vVar);
            j(vVar);
            if (!this.f2592d.isEmpty()) {
                m(this.f2592d.peek());
            }
        }
    }

    public void k() {
        synchronized (this.f2589a) {
            for (a aVar : this.f2590b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f2590b.get(aVar);
                lifecycleCamera.r();
                i(lifecycleCamera.n());
            }
        }
    }

    void l(v vVar) {
        synchronized (this.f2589a) {
            LifecycleCameraRepositoryObserver d10 = d(vVar);
            if (d10 == null) {
                return;
            }
            i(vVar);
            for (a aVar : this.f2591c.get(d10)) {
                this.f2590b.remove(aVar);
            }
            this.f2591c.remove(d10);
            d10.a().c().c(d10);
        }
    }
}
