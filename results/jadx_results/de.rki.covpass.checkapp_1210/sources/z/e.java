package z;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b3;
import androidx.camera.core.c2;
import androidx.camera.core.c3;
import androidx.camera.core.g1;
import androidx.camera.core.i3;
import androidx.camera.core.r;
import androidx.camera.core.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import w.b0;
import w.d0;
import w.o0;
import w.o2;
import w.p2;
import w.t;
import w.x;
import w.y;
import w.z;
/* loaded from: classes.dex */
public final class e implements androidx.camera.core.k {
    private i3 V3;

    /* renamed from: c */
    private d0 f26346c;

    /* renamed from: d */
    private final LinkedHashSet<d0> f26347d;

    /* renamed from: q */
    private final z f26348q;

    /* renamed from: x */
    private final p2 f26349x;

    /* renamed from: y */
    private final b f26350y;
    private final List<c3> U3 = new ArrayList();
    private t W3 = x.a();
    private final Object X3 = new Object();
    private boolean Y3 = true;
    private o0 Z3 = null;

    /* renamed from: a4 */
    private List<c3> f26345a4 = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<String> f26351a = new ArrayList();

        b(LinkedHashSet<d0> linkedHashSet) {
            Iterator<d0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f26351a.add(it.next().i().c());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f26351a.equals(((b) obj).f26351a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26351a.hashCode() * 53;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        o2<?> f26352a;

        /* renamed from: b */
        o2<?> f26353b;

        c(o2<?> o2Var, o2<?> o2Var2) {
            this.f26352a = o2Var;
            this.f26353b = o2Var2;
        }
    }

    public e(LinkedHashSet<d0> linkedHashSet, z zVar, p2 p2Var) {
        this.f26346c = linkedHashSet.iterator().next();
        LinkedHashSet<d0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f26347d = linkedHashSet2;
        this.f26350y = new b(linkedHashSet2);
        this.f26348q = zVar;
        this.f26349x = p2Var;
    }

    private boolean A(List<c3> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (c3 c3Var : list) {
            if (D(c3Var)) {
                z10 = true;
            } else if (C(c3Var)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    private boolean B(List<c3> list) {
        boolean z10 = false;
        boolean z11 = false;
        for (c3 c3Var : list) {
            if (D(c3Var)) {
                z11 = true;
            } else if (C(c3Var)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    private boolean C(c3 c3Var) {
        return c3Var instanceof g1;
    }

    private boolean D(c3 c3Var) {
        return c3Var instanceof c2;
    }

    public static /* synthetic */ void E(Surface surface, SurfaceTexture surfaceTexture, b3.f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void F(b3 b3Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(b3Var.l().getWidth(), b3Var.l().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        b3Var.v(surface, x.a.a(), new androidx.core.util.a() { // from class: z.d
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                e.E(surface, surfaceTexture, (b3.f) obj);
            }
        });
    }

    private void H() {
        synchronized (this.X3) {
            if (this.Z3 != null) {
                this.f26346c.m().f(this.Z3);
            }
        }
    }

    private void J(Map<c3, Size> map, Collection<c3> collection) {
        synchronized (this.X3) {
            if (this.V3 != null) {
                Map<c3, Rect> a10 = n.a(this.f26346c.m().g(), this.f26346c.i().a().intValue() == 0, this.V3.a(), this.f26346c.i().e(this.V3.c()), this.V3.d(), this.V3.b(), map);
                for (c3 c3Var : collection) {
                    c3Var.H((Rect) androidx.core.util.h.g(a10.get(c3Var)));
                    c3Var.G(p(this.f26346c.m().g(), map.get(c3Var)));
                }
            }
        }
    }

    private void n() {
        synchronized (this.X3) {
            y m10 = this.f26346c.m();
            this.Z3 = m10.c();
            m10.e();
        }
    }

    private List<c3> o(List<c3> list, List<c3> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean B = B(list);
        boolean A = A(list);
        c3 c3Var = null;
        c3 c3Var2 = null;
        for (c3 c3Var3 : list2) {
            if (D(c3Var3)) {
                c3Var = c3Var3;
            } else if (C(c3Var3)) {
                c3Var2 = c3Var3;
            }
        }
        if (B && c3Var == null) {
            arrayList.add(s());
        } else if (!B && c3Var != null) {
            arrayList.remove(c3Var);
        }
        if (A && c3Var2 == null) {
            arrayList.add(r());
        } else if (!A && c3Var2 != null) {
            arrayList.remove(c3Var2);
        }
        return arrayList;
    }

    private static Matrix p(Rect rect, Size size) {
        androidx.core.util.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<c3, Size> q(b0 b0Var, List<c3> list, List<c3> list2, Map<c3, c> map) {
        ArrayList arrayList = new ArrayList();
        String c10 = b0Var.c();
        HashMap hashMap = new HashMap();
        for (c3 c3Var : list2) {
            arrayList.add(this.f26348q.a(c10, c3Var.i(), c3Var.c()));
            hashMap.put(c3Var, c3Var.c());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (c3 c3Var2 : list) {
                c cVar = map.get(c3Var2);
                hashMap2.put(c3Var2.q(b0Var, cVar.f26352a, cVar.f26353b), c3Var2);
            }
            Map<o2<?>, Size> b10 = this.f26348q.b(c10, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((c3) entry.getValue(), b10.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    private g1 r() {
        return new g1.f().i("ImageCapture-Extra").c();
    }

    private c2 s() {
        c2 c10 = new c2.b().i("Preview-Extra").c();
        c10.S(z.c.f26342a);
        return c10;
    }

    private void t(List<c3> list) {
        synchronized (this.X3) {
            if (!list.isEmpty()) {
                this.f26346c.g(list);
                for (c3 c3Var : list) {
                    if (this.U3.contains(c3Var)) {
                        c3Var.z(this.f26346c);
                    } else {
                        s1.c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + c3Var);
                    }
                }
                this.U3.removeAll(list);
            }
        }
    }

    public static b v(LinkedHashSet<d0> linkedHashSet) {
        return new b(linkedHashSet);
    }

    private Map<c3, c> x(List<c3> list, p2 p2Var, p2 p2Var2) {
        HashMap hashMap = new HashMap();
        for (c3 c3Var : list) {
            hashMap.put(c3Var, new c(c3Var.h(false, p2Var), c3Var.h(true, p2Var2)));
        }
        return hashMap;
    }

    private boolean z() {
        boolean z10;
        synchronized (this.X3) {
            z10 = true;
            if (this.W3.F() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public void G(Collection<c3> collection) {
        synchronized (this.X3) {
            t(new ArrayList(collection));
            if (z()) {
                this.f26345a4.removeAll(collection);
                try {
                    j(Collections.emptyList());
                } catch (a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public void I(i3 i3Var) {
        synchronized (this.X3) {
            this.V3 = i3Var;
        }
    }

    @Override // androidx.camera.core.k
    public r a() {
        return this.f26346c.i();
    }

    public void b(boolean z10) {
        this.f26346c.b(z10);
    }

    @Override // androidx.camera.core.k
    public androidx.camera.core.m d() {
        return this.f26346c.m();
    }

    public void h(t tVar) {
        synchronized (this.X3) {
            if (tVar == null) {
                tVar = x.a();
            }
            if (!this.U3.isEmpty() && !this.W3.s().equals(tVar.s())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.W3 = tVar;
            this.f26346c.h(tVar);
        }
    }

    public void j(Collection<c3> collection) {
        synchronized (this.X3) {
            ArrayList<c3> arrayList = new ArrayList();
            for (c3 c3Var : collection) {
                if (this.U3.contains(c3Var)) {
                    s1.a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(c3Var);
                }
            }
            List<c3> arrayList2 = new ArrayList<>(this.U3);
            List<c3> emptyList = Collections.emptyList();
            List<c3> emptyList2 = Collections.emptyList();
            if (z()) {
                arrayList2.removeAll(this.f26345a4);
                arrayList2.addAll(arrayList);
                emptyList = o(arrayList2, new ArrayList<>(this.f26345a4));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.f26345a4);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.f26345a4);
                emptyList2.removeAll(emptyList);
            }
            Map<c3, c> x10 = x(arrayList, this.W3.h(), this.f26349x);
            try {
                List<c3> arrayList4 = new ArrayList<>(this.U3);
                arrayList4.removeAll(emptyList2);
                Map<c3, Size> q10 = q(this.f26346c.i(), arrayList, arrayList4, x10);
                J(q10, collection);
                this.f26345a4 = emptyList;
                t(emptyList2);
                for (c3 c3Var2 : arrayList) {
                    c cVar = x10.get(c3Var2);
                    c3Var2.w(this.f26346c, cVar.f26352a, cVar.f26353b);
                    c3Var2.J((Size) androidx.core.util.h.g(q10.get(c3Var2)));
                }
                this.U3.addAll(arrayList);
                if (this.Y3) {
                    this.f26346c.e(arrayList);
                }
                for (c3 c3Var3 : arrayList) {
                    c3Var3.u();
                }
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    public void k() {
        synchronized (this.X3) {
            if (!this.Y3) {
                this.f26346c.e(this.U3);
                H();
                for (c3 c3Var : this.U3) {
                    c3Var.u();
                }
                this.Y3 = true;
            }
        }
    }

    public void u() {
        synchronized (this.X3) {
            if (this.Y3) {
                this.f26346c.g(new ArrayList(this.U3));
                n();
                this.Y3 = false;
            }
        }
    }

    public b w() {
        return this.f26350y;
    }

    public List<c3> y() {
        ArrayList arrayList;
        synchronized (this.X3) {
            arrayList = new ArrayList(this.U3);
        }
        return arrayList;
    }
}
