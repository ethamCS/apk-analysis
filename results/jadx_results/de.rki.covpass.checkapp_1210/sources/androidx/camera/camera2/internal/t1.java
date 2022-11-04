package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class t1 {

    /* renamed from: a */
    final Executor f1992a;

    /* renamed from: b */
    final Object f1993b = new Object();

    /* renamed from: c */
    final Set<o2> f1994c = new LinkedHashSet();

    /* renamed from: d */
    final Set<o2> f1995d = new LinkedHashSet();

    /* renamed from: e */
    final Set<o2> f1996e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f1997f = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraDevice.StateCallback {
        a() {
            t1.this = r1;
        }

        private void b() {
            List<o2> g10;
            synchronized (t1.this.f1993b) {
                g10 = t1.this.g();
                t1.this.f1996e.clear();
                t1.this.f1994c.clear();
                t1.this.f1995d.clear();
            }
            for (o2 o2Var : g10) {
                o2Var.b();
            }
        }

        private void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (t1.this.f1993b) {
                linkedHashSet.addAll(t1.this.f1996e);
                linkedHashSet.addAll(t1.this.f1994c);
            }
            t1.this.f1992a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s1
                @Override // java.lang.Runnable
                public final void run() {
                    t1.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public t1(Executor executor) {
        this.f1992a = executor;
    }

    private void a(o2 o2Var) {
        o2 next;
        Iterator<o2> it = g().iterator();
        while (it.hasNext() && (next = it.next()) != o2Var) {
            next.b();
        }
    }

    public static void b(Set<o2> set) {
        for (o2 o2Var : set) {
            o2Var.a().p(o2Var);
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f1997f;
    }

    public List<o2> d() {
        ArrayList arrayList;
        synchronized (this.f1993b) {
            arrayList = new ArrayList(this.f1994c);
        }
        return arrayList;
    }

    public List<o2> e() {
        ArrayList arrayList;
        synchronized (this.f1993b) {
            arrayList = new ArrayList(this.f1995d);
        }
        return arrayList;
    }

    public List<o2> f() {
        ArrayList arrayList;
        synchronized (this.f1993b) {
            arrayList = new ArrayList(this.f1996e);
        }
        return arrayList;
    }

    List<o2> g() {
        ArrayList arrayList;
        synchronized (this.f1993b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(o2 o2Var) {
        synchronized (this.f1993b) {
            this.f1994c.remove(o2Var);
            this.f1995d.remove(o2Var);
        }
    }

    public void i(o2 o2Var) {
        synchronized (this.f1993b) {
            this.f1995d.add(o2Var);
        }
    }

    public void j(o2 o2Var) {
        a(o2Var);
        synchronized (this.f1993b) {
            this.f1996e.remove(o2Var);
        }
    }

    public void k(o2 o2Var) {
        synchronized (this.f1993b) {
            this.f1994c.add(o2Var);
            this.f1996e.remove(o2Var);
        }
        a(o2Var);
    }

    public void l(o2 o2Var) {
        synchronized (this.f1993b) {
            this.f1996e.add(o2Var);
        }
    }
}
