package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private final l f1115a;

    /* renamed from: b */
    private final Fragment f1116b;

    /* renamed from: c */
    private int f1117c = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1118a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1118a = iArr;
            try {
                iArr[e.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1118a[e.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1118a[e.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public r(l lVar, Fragment fragment) {
        this.f1115a = lVar;
        this.f1116b = fragment;
    }

    public r(l lVar, Fragment fragment, q qVar) {
        this.f1115a = lVar;
        this.f1116b = fragment;
        fragment.f1014d = null;
        fragment.r = 0;
        fragment.o = false;
        fragment.l = false;
        Fragment fragment2 = fragment.f1018h;
        fragment.i = fragment2 != null ? fragment2.f1016f : null;
        fragment.f1018h = null;
        Bundle bundle = qVar.n;
        fragment.f1013c = bundle == null ? new Bundle() : bundle;
    }

    public r(l lVar, ClassLoader classLoader, i iVar, q qVar) {
        this.f1115a = lVar;
        Fragment a2 = iVar.a(classLoader, qVar.f1108b);
        this.f1116b = a2;
        Bundle bundle = qVar.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.o1(qVar.k);
        a2.f1016f = qVar.f1109c;
        a2.n = qVar.f1110d;
        a2.p = true;
        a2.w = qVar.f1111e;
        a2.x = qVar.f1112f;
        a2.y = qVar.f1113g;
        a2.B = qVar.f1114h;
        a2.m = qVar.i;
        a2.A = qVar.j;
        a2.z = qVar.l;
        a2.Q = e.b.values()[qVar.m];
        Bundle bundle2 = qVar.n;
        a2.f1013c = bundle2 == null ? new Bundle() : bundle2;
        if (m.p0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        this.f1116b.d1(bundle);
        this.f1115a.j(this.f1116b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1116b.H != null) {
            p();
        }
        if (this.f1116b.f1014d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1116b.f1014d);
        }
        if (!this.f1116b.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1116b.J);
        }
        return bundle;
    }

    public void a() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1116b);
        }
        Fragment fragment = this.f1116b;
        fragment.J0(fragment.f1013c);
        l lVar = this.f1115a;
        Fragment fragment2 = this.f1116b;
        lVar.a(fragment2, fragment2.f1013c, false);
    }

    public void b(j<?> jVar, m mVar, Fragment fragment) {
        Fragment fragment2 = this.f1116b;
        fragment2.t = jVar;
        fragment2.v = fragment;
        fragment2.s = mVar;
        this.f1115a.g(fragment2, jVar.i(), false);
        this.f1116b.K0();
        Fragment fragment3 = this.f1116b;
        Fragment fragment4 = fragment3.v;
        if (fragment4 == null) {
            jVar.k(fragment3);
        } else {
            fragment4.g0(fragment3);
        }
        this.f1115a.b(this.f1116b, jVar.i(), false);
    }

    public int c() {
        int i = this.f1117c;
        Fragment fragment = this.f1116b;
        if (fragment.n) {
            i = fragment.o ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f1012b) : Math.min(i, 1);
        }
        if (!this.f1116b.l) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f1116b;
        if (fragment2.m) {
            i = fragment2.W() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f1116b;
        if (fragment3.I && fragment3.f1012b < 3) {
            i = Math.min(i, 2);
        }
        int i2 = a.f1118a[this.f1116b.Q.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    public void d() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1116b);
        }
        Fragment fragment = this.f1116b;
        if (fragment.P) {
            fragment.k1(fragment.f1013c);
            this.f1116b.f1012b = 1;
            return;
        }
        this.f1115a.h(fragment, fragment.f1013c, false);
        Fragment fragment2 = this.f1116b;
        fragment2.N0(fragment2.f1013c);
        l lVar = this.f1115a;
        Fragment fragment3 = this.f1116b;
        lVar.c(fragment3, fragment3.f1013c, false);
    }

    public void e(f fVar) {
        String str;
        if (this.f1116b.n) {
            return;
        }
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1116b);
        }
        ViewGroup viewGroup = null;
        Fragment fragment = this.f1116b;
        ViewGroup viewGroup2 = fragment.G;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.x;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1116b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fVar.e(i);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f1116b;
                    if (!fragment2.p) {
                        try {
                            str = fragment2.H().getResourceName(this.f1116b.x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1116b.x) + " (" + str + ") for fragment " + this.f1116b);
                    }
                }
            }
        }
        Fragment fragment3 = this.f1116b;
        fragment3.G = viewGroup;
        fragment3.P0(fragment3.T0(fragment3.f1013c), viewGroup, this.f1116b.f1013c);
        View view = this.f1116b.H;
        if (view == null) {
            return;
        }
        boolean z = false;
        view.setSaveFromParentEnabled(false);
        Fragment fragment4 = this.f1116b;
        fragment4.H.setTag(b.k.b.a_res_0x7f0900d3, fragment4);
        if (viewGroup != null) {
            viewGroup.addView(this.f1116b.H);
        }
        Fragment fragment5 = this.f1116b;
        if (fragment5.z) {
            fragment5.H.setVisibility(8);
        }
        b.g.l.t.f0(this.f1116b.H);
        Fragment fragment6 = this.f1116b;
        fragment6.H0(fragment6.H, fragment6.f1013c);
        l lVar = this.f1115a;
        Fragment fragment7 = this.f1116b;
        lVar.m(fragment7, fragment7.H, fragment7.f1013c, false);
        Fragment fragment8 = this.f1116b;
        if (fragment8.H.getVisibility() == 0 && this.f1116b.G != null) {
            z = true;
        }
        fragment8.L = z;
    }

    public void f(j<?> jVar, p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1116b);
        }
        Fragment fragment = this.f1116b;
        boolean z = true;
        boolean z2 = fragment.m && !fragment.W();
        if (!(z2 || pVar.n(this.f1116b))) {
            this.f1116b.f1012b = 0;
            return;
        }
        if (jVar instanceof androidx.lifecycle.w) {
            z = pVar.l();
        } else if (jVar.i() instanceof Activity) {
            z = true ^ ((Activity) jVar.i()).isChangingConfigurations();
        }
        if (z2 || z) {
            pVar.f(this.f1116b);
        }
        this.f1116b.Q0();
        this.f1115a.d(this.f1116b, false);
    }

    public void g(p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1116b);
        }
        this.f1116b.S0();
        boolean z = false;
        this.f1115a.e(this.f1116b, false);
        Fragment fragment = this.f1116b;
        fragment.f1012b = -1;
        fragment.t = null;
        fragment.v = null;
        fragment.s = null;
        if (fragment.m && !fragment.W()) {
            z = true;
        }
        if (z || pVar.n(this.f1116b)) {
            if (m.p0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1116b);
            }
            this.f1116b.R();
        }
    }

    public void h() {
        Fragment fragment = this.f1116b;
        if (!fragment.n || !fragment.o || fragment.q) {
            return;
        }
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1116b);
        }
        Fragment fragment2 = this.f1116b;
        fragment2.P0(fragment2.T0(fragment2.f1013c), null, this.f1116b.f1013c);
        View view = this.f1116b.H;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        Fragment fragment3 = this.f1116b;
        fragment3.H.setTag(b.k.b.a_res_0x7f0900d3, fragment3);
        Fragment fragment4 = this.f1116b;
        if (fragment4.z) {
            fragment4.H.setVisibility(8);
        }
        Fragment fragment5 = this.f1116b;
        fragment5.H0(fragment5.H, fragment5.f1013c);
        l lVar = this.f1115a;
        Fragment fragment6 = this.f1116b;
        lVar.m(fragment6, fragment6.H, fragment6.f1013c, false);
    }

    public Fragment i() {
        return this.f1116b;
    }

    public void j() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1116b);
        }
        this.f1116b.Y0();
        this.f1115a.f(this.f1116b, false);
    }

    public void k(ClassLoader classLoader) {
        Bundle bundle = this.f1116b.f1013c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1116b;
        fragment.f1014d = fragment.f1013c.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1116b;
        fragment2.i = fragment2.f1013c.getString("android:target_state");
        Fragment fragment3 = this.f1116b;
        if (fragment3.i != null) {
            fragment3.j = fragment3.f1013c.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f1116b;
        Boolean bool = fragment4.f1015e;
        if (bool != null) {
            fragment4.J = bool.booleanValue();
            this.f1116b.f1015e = null;
        } else {
            fragment4.J = fragment4.f1013c.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.f1116b;
        if (fragment5.J) {
            return;
        }
        fragment5.I = true;
    }

    public void l() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f1116b);
        }
        Fragment fragment = this.f1116b;
        if (fragment.H != null) {
            fragment.l1(fragment.f1013c);
        }
        this.f1116b.f1013c = null;
    }

    public void m() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1116b);
        }
        this.f1116b.c1();
        this.f1115a.i(this.f1116b, false);
        Fragment fragment = this.f1116b;
        fragment.f1013c = null;
        fragment.f1014d = null;
    }

    public q o() {
        q qVar = new q(this.f1116b);
        Fragment fragment = this.f1116b;
        if (fragment.f1012b <= -1 || qVar.n != null) {
            qVar.n = fragment.f1013c;
        } else {
            Bundle n = n();
            qVar.n = n;
            if (this.f1116b.i != null) {
                if (n == null) {
                    qVar.n = new Bundle();
                }
                qVar.n.putString("android:target_state", this.f1116b.i);
                int i = this.f1116b.j;
                if (i != 0) {
                    qVar.n.putInt("android:target_req_state", i);
                }
            }
        }
        return qVar;
    }

    public void p() {
        if (this.f1116b.H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1116b.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() <= 0) {
            return;
        }
        this.f1116b.f1014d = sparseArray;
    }

    public void q(int i) {
        this.f1117c = i;
    }

    public void r() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1116b);
        }
        this.f1116b.e1();
        this.f1115a.k(this.f1116b, false);
    }

    public void s() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1116b);
        }
        this.f1116b.f1();
        this.f1115a.l(this.f1116b, false);
    }
}
