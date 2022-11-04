package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class v implements w.a0 {

    /* renamed from: a */
    private final w.h0 f2026a;

    /* renamed from: c */
    private final r.m0 f2028c;

    /* renamed from: d */
    private final List<String> f2029d;

    /* renamed from: e */
    private final v1 f2030e;

    /* renamed from: f */
    private final Map<String, j0> f2031f = new HashMap();

    /* renamed from: b */
    private final w.g0 f2027b = new w.g0(1);

    public v(Context context, w.h0 h0Var, androidx.camera.core.s sVar) {
        this.f2026a = h0Var;
        this.f2028c = r.m0.b(context, h0Var.c());
        this.f2030e = v1.b(context);
        this.f2029d = d(h1.b(this, sVar));
    }

    private List<String> d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1") || g(str)) {
                arrayList.add(str);
            } else {
                androidx.camera.core.s1.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    private boolean g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f2028c.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (r.f e10) {
            throw new androidx.camera.core.r1(j1.a(e10));
        }
    }

    @Override // w.a0
    public w.d0 a(String str) {
        if (this.f2029d.contains(str)) {
            return new g0(this.f2028c, str, e(str), this.f2027b, this.f2026a.b(), this.f2026a.c(), this.f2030e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // w.a0
    public Set<String> c() {
        return new LinkedHashSet(this.f2029d);
    }

    public j0 e(String str) {
        try {
            j0 j0Var = this.f2031f.get(str);
            if (j0Var != null) {
                return j0Var;
            }
            j0 j0Var2 = new j0(str, this.f2028c);
            this.f2031f.put(str, j0Var2);
            return j0Var2;
        } catch (r.f e10) {
            throw j1.a(e10);
        }
    }

    /* renamed from: f */
    public r.m0 b() {
        return this.f2028c;
    }
}
