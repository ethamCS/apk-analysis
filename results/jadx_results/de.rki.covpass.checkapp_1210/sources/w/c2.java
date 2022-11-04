package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import w.k0;
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a */
    private final List<r0> f24410a;

    /* renamed from: b */
    private final List<CameraDevice.StateCallback> f24411b;

    /* renamed from: c */
    private final List<CameraCaptureSession.StateCallback> f24412c;

    /* renamed from: d */
    private final List<h> f24413d;

    /* renamed from: e */
    private final List<c> f24414e;

    /* renamed from: f */
    private final k0 f24415f;

    /* renamed from: g */
    private InputConfiguration f24416g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Set<r0> f24417a = new LinkedHashSet();

        /* renamed from: b */
        final k0.a f24418b = new k0.a();

        /* renamed from: c */
        final List<CameraDevice.StateCallback> f24419c = new ArrayList();

        /* renamed from: d */
        final List<CameraCaptureSession.StateCallback> f24420d = new ArrayList();

        /* renamed from: e */
        final List<c> f24421e = new ArrayList();

        /* renamed from: f */
        final List<h> f24422f = new ArrayList();

        /* renamed from: g */
        InputConfiguration f24423g;

        a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public static b o(o2<?> o2Var) {
            d r10 = o2Var.r(null);
            if (r10 != null) {
                b bVar = new b();
                r10.a(o2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o2Var.B(o2Var.toString()));
        }

        public void a(Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback stateCallback : collection) {
                e(stateCallback);
            }
        }

        public void b(Collection<h> collection) {
            this.f24418b.a(collection);
        }

        public void c(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                j(stateCallback);
            }
        }

        public void d(h hVar) {
            this.f24418b.c(hVar);
            if (!this.f24422f.contains(hVar)) {
                this.f24422f.add(hVar);
            }
        }

        public void e(CameraDevice.StateCallback stateCallback) {
            if (this.f24419c.contains(stateCallback)) {
                return;
            }
            this.f24419c.add(stateCallback);
        }

        public void f(c cVar) {
            this.f24421e.add(cVar);
        }

        public void g(o0 o0Var) {
            this.f24418b.e(o0Var);
        }

        public void h(r0 r0Var) {
            this.f24417a.add(r0Var);
        }

        public void i(h hVar) {
            this.f24418b.c(hVar);
        }

        public void j(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f24420d.contains(stateCallback)) {
                return;
            }
            this.f24420d.add(stateCallback);
        }

        public void k(r0 r0Var) {
            this.f24417a.add(r0Var);
            this.f24418b.f(r0Var);
        }

        public void l(String str, Object obj) {
            this.f24418b.g(str, obj);
        }

        public c2 m() {
            return new c2(new ArrayList(this.f24417a), this.f24419c, this.f24420d, this.f24422f, this.f24421e, this.f24418b.h(), this.f24423g);
        }

        public void n() {
            this.f24417a.clear();
            this.f24418b.i();
        }

        public List<h> p() {
            return Collections.unmodifiableList(this.f24422f);
        }

        public void q(o0 o0Var) {
            this.f24418b.o(o0Var);
        }

        public void r(InputConfiguration inputConfiguration) {
            this.f24423g = inputConfiguration;
        }

        public void s(int i10) {
            this.f24418b.p(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(c2 c2Var, e eVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(o2<?> o2Var, b bVar);
    }

    /* loaded from: classes.dex */
    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes.dex */
    public static final class f extends a {

        /* renamed from: k */
        private static final List<Integer> f24427k = Arrays.asList(1, 3);

        /* renamed from: h */
        private final c0.c f24428h = new c0.c();

        /* renamed from: i */
        private boolean f24429i = true;

        /* renamed from: j */
        private boolean f24430j = false;

        private int e(int i10, int i11) {
            List<Integer> list = f24427k;
            return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
        }

        public void a(c2 c2Var) {
            k0 g10 = c2Var.g();
            if (g10.g() != -1) {
                this.f24430j = true;
                this.f24418b.p(e(g10.g(), this.f24418b.m()));
            }
            this.f24418b.b(c2Var.g().f());
            this.f24419c.addAll(c2Var.b());
            this.f24420d.addAll(c2Var.h());
            this.f24418b.a(c2Var.f());
            this.f24422f.addAll(c2Var.i());
            this.f24421e.addAll(c2Var.c());
            if (c2Var.e() != null) {
                this.f24423g = c2Var.e();
            }
            this.f24417a.addAll(c2Var.j());
            this.f24418b.l().addAll(g10.e());
            if (!this.f24417a.containsAll(this.f24418b.l())) {
                androidx.camera.core.s1.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f24429i = false;
            }
            this.f24418b.e(g10.d());
        }

        public c2 b() {
            if (this.f24429i) {
                ArrayList arrayList = new ArrayList(this.f24417a);
                this.f24428h.d(arrayList);
                return new c2(arrayList, this.f24419c, this.f24420d, this.f24422f, this.f24421e, this.f24418b.h(), this.f24423g);
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        public void c() {
            this.f24417a.clear();
            this.f24418b.i();
        }

        public boolean d() {
            return this.f24430j && this.f24429i;
        }
    }

    c2(List<r0> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<h> list4, List<c> list5, k0 k0Var, InputConfiguration inputConfiguration) {
        this.f24410a = list;
        this.f24411b = Collections.unmodifiableList(list2);
        this.f24412c = Collections.unmodifiableList(list3);
        this.f24413d = Collections.unmodifiableList(list4);
        this.f24414e = Collections.unmodifiableList(list5);
        this.f24415f = k0Var;
        this.f24416g = inputConfiguration;
    }

    public static c2 a() {
        return new c2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new k0.a().h(), null);
    }

    public List<CameraDevice.StateCallback> b() {
        return this.f24411b;
    }

    public List<c> c() {
        return this.f24414e;
    }

    public o0 d() {
        return this.f24415f.d();
    }

    public InputConfiguration e() {
        return this.f24416g;
    }

    public List<h> f() {
        return this.f24415f.b();
    }

    public k0 g() {
        return this.f24415f;
    }

    public List<CameraCaptureSession.StateCallback> h() {
        return this.f24412c;
    }

    public List<h> i() {
        return this.f24413d;
    }

    public List<r0> j() {
        return Collections.unmodifiableList(this.f24410a);
    }

    public int k() {
        return this.f24415f.g();
    }
}
