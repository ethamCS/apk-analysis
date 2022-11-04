package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.internal.j0;
import androidx.camera.core.t;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j0 implements w.b0 {

    /* renamed from: a */
    private final String f1778a;

    /* renamed from: b */
    private final r.z f1779b;

    /* renamed from: e */
    private t f1782e;

    /* renamed from: j */
    private final w.y1 f1787j;

    /* renamed from: k */
    private final w.g f1788k;

    /* renamed from: l */
    private final r.m0 f1789l;

    /* renamed from: d */
    private final Object f1781d = new Object();

    /* renamed from: f */
    private a<Integer> f1783f = null;

    /* renamed from: g */
    private a<androidx.camera.core.j3> f1784g = null;

    /* renamed from: i */
    private List<Pair<w.h, Executor>> f1786i = null;

    /* renamed from: c */
    private final v.h f1780c = new v.h(this);

    /* renamed from: h */
    private final a<androidx.camera.core.t> f1785h = new a<>(androidx.camera.core.t.a(t.b.CLOSED));

    /* loaded from: classes.dex */
    public static class a<T> extends androidx.lifecycle.b0<T> {

        /* renamed from: m */
        private LiveData<T> f1790m;

        /* renamed from: n */
        private T f1791n;

        a(T t10) {
            this.f1791n = t10;
        }

        @Override // androidx.lifecycle.LiveData
        public T e() {
            LiveData<T> liveData = this.f1790m;
            return liveData == null ? this.f1791n : liveData.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void p(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f1790m;
            if (liveData2 != null) {
                super.o(liveData2);
            }
            this.f1790m = liveData;
            super.n(liveData, new androidx.lifecycle.e0() { // from class: androidx.camera.camera2.internal.i0
                @Override // androidx.lifecycle.e0
                public final void a(Object obj) {
                    j0.a.this.m(obj);
                }
            });
        }
    }

    public j0(String str, r.m0 m0Var) {
        String str2 = (String) androidx.core.util.h.g(str);
        this.f1778a = str2;
        this.f1789l = m0Var;
        r.z c10 = m0Var.c(str2);
        this.f1779b = c10;
        this.f1787j = t.g.a(str, c10);
        this.f1788k = new d(str, c10);
    }

    private void m() {
        n();
    }

    private void n() {
        String str;
        int k10 = k();
        if (k10 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (k10 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (k10 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (k10 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (k10 != 4) {
            str = "Unknown value: " + k10;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        androidx.camera.core.s1.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // w.b0
    public Integer a() {
        Integer num = (Integer) this.f1779b.a(CameraCharacteristics.LENS_FACING);
        androidx.core.util.h.g(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // w.b0
    public void b(w.h hVar) {
        synchronized (this.f1781d) {
            t tVar = this.f1782e;
            if (tVar != null) {
                tVar.d0(hVar);
                return;
            }
            List<Pair<w.h, Executor>> list = this.f1786i;
            if (list == null) {
                return;
            }
            Iterator<Pair<w.h, Executor>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().first == hVar) {
                    it.remove();
                }
            }
        }
    }

    @Override // w.b0
    public String c() {
        return this.f1778a;
    }

    @Override // androidx.camera.core.r
    public String d() {
        return k() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.r
    public int e(int i10) {
        Integer valueOf = Integer.valueOf(j());
        int b10 = androidx.camera.core.impl.utils.b.b(i10);
        Integer a10 = a();
        boolean z10 = true;
        if (a10 == null || 1 != a10.intValue()) {
            z10 = false;
        }
        return androidx.camera.core.impl.utils.b.a(b10, valueOf.intValue(), z10);
    }

    @Override // androidx.camera.core.r
    public boolean f() {
        return u.f.c(this.f1779b);
    }

    @Override // w.b0
    public void g(Executor executor, w.h hVar) {
        synchronized (this.f1781d) {
            t tVar = this.f1782e;
            if (tVar != null) {
                tVar.v(executor, hVar);
                return;
            }
            if (this.f1786i == null) {
                this.f1786i = new ArrayList();
            }
            this.f1786i.add(new Pair<>(hVar, executor));
        }
    }

    @Override // w.b0
    public w.y1 h() {
        return this.f1787j;
    }

    public r.z i() {
        return this.f1779b;
    }

    int j() {
        Integer num = (Integer) this.f1779b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        androidx.core.util.h.g(num);
        return num.intValue();
    }

    public int k() {
        Integer num = (Integer) this.f1779b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        androidx.core.util.h.g(num);
        return num.intValue();
    }

    public void l(t tVar) {
        synchronized (this.f1781d) {
            this.f1782e = tVar;
            a<androidx.camera.core.j3> aVar = this.f1784g;
            if (aVar != null) {
                aVar.p(tVar.L().e());
            }
            a<Integer> aVar2 = this.f1783f;
            if (aVar2 != null) {
                aVar2.p(this.f1782e.J().f());
            }
            List<Pair<w.h, Executor>> list = this.f1786i;
            if (list != null) {
                for (Pair<w.h, Executor> pair : list) {
                    this.f1782e.v((Executor) pair.second, (w.h) pair.first);
                }
                this.f1786i = null;
            }
        }
        m();
    }

    public void o(LiveData<androidx.camera.core.t> liveData) {
        this.f1785h.p(liveData);
    }
}
