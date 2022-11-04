package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import androidx.lifecycle.m;
import androidx.lifecycle.z0;
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a */
    private final q f4045a;

    /* renamed from: b */
    private final e0 f4046b;

    /* renamed from: c */
    private final Fragment f4047c;

    /* renamed from: d */
    private boolean f4048d = false;

    /* renamed from: e */
    private int f4049e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        final /* synthetic */ View f4050c;

        a(View view) {
            d0.this = r1;
            this.f4050c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4050c.removeOnAttachStateChangeListener(this);
            androidx.core.view.y.l0(this.f4050c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4052a;

        static {
            int[] iArr = new int[m.c.values().length];
            f4052a = iArr;
            try {
                iArr[m.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4052a[m.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4052a[m.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4052a[m.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public d0(q qVar, e0 e0Var, Fragment fragment) {
        this.f4045a = qVar;
        this.f4046b = e0Var;
        this.f4047c = fragment;
    }

    public d0(q qVar, e0 e0Var, Fragment fragment, c0 c0Var) {
        this.f4045a = qVar;
        this.f4046b = e0Var;
        this.f4047c = fragment;
        fragment.f3919q = null;
        fragment.f3927x = null;
        fragment.f3910h4 = 0;
        fragment.f3907e4 = false;
        fragment.f3901a4 = false;
        Fragment fragment2 = fragment.W3;
        fragment.X3 = fragment2 != null ? fragment2.U3 : null;
        fragment.W3 = null;
        Bundle bundle = c0Var.f3993b4;
        fragment.f3905d = bundle == null ? new Bundle() : bundle;
    }

    public d0(q qVar, e0 e0Var, ClassLoader classLoader, n nVar, c0 c0Var) {
        this.f4045a = qVar;
        this.f4046b = e0Var;
        Fragment a10 = c0Var.a(nVar, classLoader);
        this.f4047c = a10;
        if (w.L0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    private boolean l(View view) {
        if (view == this.f4047c.f3928x4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4047c.f3928x4) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f4047c.K1(bundle);
        this.f4045a.j(this.f4047c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4047c.f3928x4 != null) {
            t();
        }
        if (this.f4047c.f3919q != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4047c.f3919q);
        }
        if (this.f4047c.f3927x != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4047c.f3927x);
        }
        if (!this.f4047c.f3931z4) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4047c.f3931z4);
        }
        return bundle;
    }

    void a() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        fragment.q1(fragment.f3905d);
        q qVar = this.f4045a;
        Fragment fragment2 = this.f4047c;
        qVar.a(fragment2, fragment2.f3905d, false);
    }

    public void b() {
        int j10 = this.f4046b.j(this.f4047c);
        Fragment fragment = this.f4047c;
        fragment.f3926w4.addView(fragment.f3928x4, j10);
    }

    void c() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        Fragment fragment2 = fragment.W3;
        d0 d0Var = null;
        if (fragment2 != null) {
            d0 n10 = this.f4046b.n(fragment2.U3);
            if (n10 == null) {
                throw new IllegalStateException("Fragment " + this.f4047c + " declared target fragment " + this.f4047c.W3 + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f4047c;
            fragment3.X3 = fragment3.W3.U3;
            fragment3.W3 = null;
            d0Var = n10;
        } else {
            String str = fragment.X3;
            if (str != null && (d0Var = this.f4046b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4047c + " declared target fragment " + this.f4047c.X3 + " that does not belong to this FragmentManager!");
            }
        }
        if (d0Var != null) {
            d0Var.m();
        }
        Fragment fragment4 = this.f4047c;
        fragment4.f3912j4 = fragment4.f3911i4.y0();
        Fragment fragment5 = this.f4047c;
        fragment5.f3914l4 = fragment5.f3911i4.B0();
        this.f4045a.g(this.f4047c, false);
        this.f4047c.r1();
        this.f4045a.b(this.f4047c, false);
    }

    int d() {
        Fragment fragment = this.f4047c;
        if (fragment.f3911i4 == null) {
            return fragment.f3903c;
        }
        int i10 = this.f4049e;
        int i11 = b.f4052a[fragment.G4.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment2 = this.f4047c;
        if (fragment2.f3906d4) {
            if (fragment2.f3907e4) {
                i10 = Math.max(this.f4049e, 2);
                View view = this.f4047c.f3928x4;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f4049e < 4 ? Math.min(i10, fragment2.f3903c) : Math.min(i10, 1);
            }
        }
        if (!this.f4047c.f3901a4) {
            i10 = Math.min(i10, 1);
        }
        m0.e.b bVar = null;
        Fragment fragment3 = this.f4047c;
        ViewGroup viewGroup = fragment3.f3926w4;
        if (viewGroup != null) {
            bVar = m0.n(viewGroup, fragment3.i0()).l(this);
        }
        if (bVar == m0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == m0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f4047c;
            if (fragment4.f3902b4) {
                i10 = fragment4.E0() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f4047c;
        if (fragment5.f3930y4 && fragment5.f3903c < 5) {
            i10 = Math.min(i10, 4);
        }
        if (w.L0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f4047c);
        }
        return i10;
    }

    void e() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        if (fragment.E4) {
            fragment.U1(fragment.f3905d);
            this.f4047c.f3903c = 1;
            return;
        }
        this.f4045a.h(fragment, fragment.f3905d, false);
        Fragment fragment2 = this.f4047c;
        fragment2.u1(fragment2.f3905d);
        q qVar = this.f4045a;
        Fragment fragment3 = this.f4047c;
        qVar.c(fragment3, fragment3.f3905d, false);
    }

    void f() {
        String str;
        if (this.f4047c.f3906d4) {
            return;
        }
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        LayoutInflater A1 = fragment.A1(fragment.f3905d);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4047c;
        ViewGroup viewGroup2 = fragment2.f3926w4;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.f3916n4;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4047c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f3911i4.t0().d(this.f4047c.f3916n4);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f4047c;
                    if (!fragment3.f3908f4) {
                        try {
                            str = fragment3.o0().getResourceName(this.f4047c.f3916n4);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4047c.f3916n4) + " (" + str + ") for fragment " + this.f4047c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    b1.d.k(this.f4047c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f4047c;
        fragment4.f3926w4 = viewGroup;
        fragment4.w1(A1, viewGroup, fragment4.f3905d);
        View view = this.f4047c.f3928x4;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4047c;
            fragment5.f3928x4.setTag(a1.b.a_res_0x7f090101, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f4047c;
            if (fragment6.f3918p4) {
                fragment6.f3928x4.setVisibility(8);
            }
            if (androidx.core.view.y.R(this.f4047c.f3928x4)) {
                androidx.core.view.y.l0(this.f4047c.f3928x4);
            } else {
                View view2 = this.f4047c.f3928x4;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f4047c.N1();
            q qVar = this.f4045a;
            Fragment fragment7 = this.f4047c;
            qVar.m(fragment7, fragment7.f3928x4, fragment7.f3905d, false);
            int visibility = this.f4047c.f3928x4.getVisibility();
            this.f4047c.g2(this.f4047c.f3928x4.getAlpha());
            Fragment fragment8 = this.f4047c;
            if (fragment8.f3926w4 != null && visibility == 0) {
                View findFocus = fragment8.f3928x4.findFocus();
                if (findFocus != null) {
                    this.f4047c.b2(findFocus);
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4047c);
                    }
                }
                this.f4047c.f3928x4.setAlpha(0.0f);
            }
        }
        this.f4047c.f3903c = 2;
    }

    void g() {
        Fragment f10;
        if (w.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        boolean z10 = true;
        boolean z11 = fragment.f3902b4 && !fragment.E0();
        if (z11) {
            Fragment fragment2 = this.f4047c;
            if (!fragment2.f3904c4) {
                this.f4046b.B(fragment2.U3, null);
            }
        }
        if (!(z11 || this.f4046b.p().r(this.f4047c))) {
            String str = this.f4047c.X3;
            if (str != null && (f10 = this.f4046b.f(str)) != null && f10.f3921r4) {
                this.f4047c.W3 = f10;
            }
            this.f4047c.f3903c = 0;
            return;
        }
        o<?> oVar = this.f4047c.f3912j4;
        if (oVar instanceof z0) {
            z10 = this.f4046b.p().o();
        } else if (oVar.i() instanceof Activity) {
            z10 = true ^ ((Activity) oVar.i()).isChangingConfigurations();
        }
        if ((z11 && !this.f4047c.f3904c4) || z10) {
            this.f4046b.p().g(this.f4047c);
        }
        this.f4047c.x1();
        this.f4045a.d(this.f4047c, false);
        for (d0 d0Var : this.f4046b.k()) {
            if (d0Var != null) {
                Fragment k10 = d0Var.k();
                if (this.f4047c.U3.equals(k10.X3)) {
                    k10.W3 = this.f4047c;
                    k10.X3 = null;
                }
            }
        }
        Fragment fragment3 = this.f4047c;
        String str2 = fragment3.X3;
        if (str2 != null) {
            fragment3.W3 = this.f4046b.f(str2);
        }
        this.f4046b.s(this);
    }

    void h() {
        View view;
        if (w.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4047c);
        }
        Fragment fragment = this.f4047c;
        ViewGroup viewGroup = fragment.f3926w4;
        if (viewGroup != null && (view = fragment.f3928x4) != null) {
            viewGroup.removeView(view);
        }
        this.f4047c.y1();
        this.f4045a.n(this.f4047c, false);
        Fragment fragment2 = this.f4047c;
        fragment2.f3926w4 = null;
        fragment2.f3928x4 = null;
        fragment2.I4 = null;
        fragment2.J4.m(null);
        this.f4047c.f3907e4 = false;
    }

    void i() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4047c);
        }
        this.f4047c.z1();
        boolean z10 = false;
        this.f4045a.e(this.f4047c, false);
        Fragment fragment = this.f4047c;
        fragment.f3903c = -1;
        fragment.f3912j4 = null;
        fragment.f3914l4 = null;
        fragment.f3911i4 = null;
        if (fragment.f3902b4 && !fragment.E0()) {
            z10 = true;
        }
        if (z10 || this.f4046b.p().r(this.f4047c)) {
            if (w.L0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4047c);
            }
            this.f4047c.A0();
        }
    }

    public void j() {
        Fragment fragment = this.f4047c;
        if (!fragment.f3906d4 || !fragment.f3907e4 || fragment.f3909g4) {
            return;
        }
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4047c);
        }
        Fragment fragment2 = this.f4047c;
        fragment2.w1(fragment2.A1(fragment2.f3905d), null, this.f4047c.f3905d);
        View view = this.f4047c.f3928x4;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        Fragment fragment3 = this.f4047c;
        fragment3.f3928x4.setTag(a1.b.a_res_0x7f090101, fragment3);
        Fragment fragment4 = this.f4047c;
        if (fragment4.f3918p4) {
            fragment4.f3928x4.setVisibility(8);
        }
        this.f4047c.N1();
        q qVar = this.f4045a;
        Fragment fragment5 = this.f4047c;
        qVar.m(fragment5, fragment5.f3928x4, fragment5.f3905d, false);
        this.f4047c.f3903c = 2;
    }

    public Fragment k() {
        return this.f4047c;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4048d) {
            if (!w.L0(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
            return;
        }
        try {
            this.f4048d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f4047c;
                int i10 = fragment.f3903c;
                if (d10 == i10) {
                    if (!z10 && i10 == -1 && fragment.f3902b4 && !fragment.E0() && !this.f4047c.f3904c4) {
                        if (w.L0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4047c);
                        }
                        this.f4046b.p().g(this.f4047c);
                        this.f4046b.s(this);
                        if (w.L0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4047c);
                        }
                        this.f4047c.A0();
                    }
                    Fragment fragment2 = this.f4047c;
                    if (fragment2.C4) {
                        if (fragment2.f3928x4 != null && (viewGroup = fragment2.f3926w4) != null) {
                            m0 n10 = m0.n(viewGroup, fragment2.i0());
                            if (this.f4047c.f3918p4) {
                                n10.c(this);
                            } else {
                                n10.e(this);
                            }
                        }
                        Fragment fragment3 = this.f4047c;
                        w wVar = fragment3.f3911i4;
                        if (wVar != null) {
                            wVar.J0(fragment3);
                        }
                        Fragment fragment4 = this.f4047c;
                        fragment4.C4 = false;
                        fragment4.Z0(fragment4.f3918p4);
                        this.f4047c.f3913k4.K();
                    }
                    return;
                }
                if (d10 > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.f3928x4 != null && (viewGroup3 = fragment.f3926w4) != null) {
                                m0.n(viewGroup3, fragment.i0()).b(m0.e.c.g(this.f4047c.f3928x4.getVisibility()), this);
                            }
                            this.f4047c.f3903c = 4;
                            continue;
                        case 5:
                            v();
                            continue;
                        case 6:
                            fragment.f3903c = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            if (fragment.f3904c4 && this.f4046b.q(fragment.U3) == null) {
                                s();
                            }
                            g();
                            continue;
                        case 1:
                            h();
                            this.f4047c.f3903c = 1;
                            continue;
                        case 2:
                            fragment.f3907e4 = false;
                            fragment.f3903c = 2;
                            continue;
                        case 3:
                            if (w.L0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4047c);
                            }
                            Fragment fragment5 = this.f4047c;
                            if (fragment5.f3904c4) {
                                s();
                            } else if (fragment5.f3928x4 != null && fragment5.f3919q == null) {
                                t();
                            }
                            Fragment fragment6 = this.f4047c;
                            if (fragment6.f3928x4 != null && (viewGroup2 = fragment6.f3926w4) != null) {
                                m0.n(viewGroup2, fragment6.i0()).d(this);
                            }
                            this.f4047c.f3903c = 3;
                            continue;
                        case 4:
                            w();
                            continue;
                        case 5:
                            fragment.f3903c = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f4048d = false;
        }
    }

    void n() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4047c);
        }
        this.f4047c.F1();
        this.f4045a.f(this.f4047c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f4047c.f3905d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4047c;
        fragment.f3919q = fragment.f3905d.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4047c;
        fragment2.f3927x = fragment2.f3905d.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4047c;
        fragment3.X3 = fragment3.f3905d.getString("android:target_state");
        Fragment fragment4 = this.f4047c;
        if (fragment4.X3 != null) {
            fragment4.Y3 = fragment4.f3905d.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4047c;
        Boolean bool = fragment5.f3929y;
        if (bool != null) {
            fragment5.f3931z4 = bool.booleanValue();
            this.f4047c.f3929y = null;
        } else {
            fragment5.f3931z4 = fragment5.f3905d.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4047c;
        if (fragment6.f3931z4) {
            return;
        }
        fragment6.f3930y4 = true;
    }

    void p() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4047c);
        }
        View b02 = this.f4047c.b0();
        if (b02 != null && l(b02)) {
            boolean requestFocus = b02.requestFocus();
            if (w.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(b02);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4047c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4047c.f3928x4.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4047c.b2(null);
        this.f4047c.J1();
        this.f4045a.i(this.f4047c, false);
        Fragment fragment = this.f4047c;
        fragment.f3905d = null;
        fragment.f3919q = null;
        fragment.f3927x = null;
    }

    public Fragment.m r() {
        Bundle q10;
        if (this.f4047c.f3903c <= -1 || (q10 = q()) == null) {
            return null;
        }
        return new Fragment.m(q10);
    }

    public void s() {
        c0 c0Var = new c0(this.f4047c);
        Fragment fragment = this.f4047c;
        if (fragment.f3903c <= -1 || c0Var.f3993b4 != null) {
            c0Var.f3993b4 = fragment.f3905d;
        } else {
            Bundle q10 = q();
            c0Var.f3993b4 = q10;
            if (this.f4047c.X3 != null) {
                if (q10 == null) {
                    c0Var.f3993b4 = new Bundle();
                }
                c0Var.f3993b4.putString("android:target_state", this.f4047c.X3);
                int i10 = this.f4047c.Y3;
                if (i10 != 0) {
                    c0Var.f3993b4.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f4046b.B(this.f4047c.U3, c0Var);
    }

    void t() {
        if (this.f4047c.f3928x4 == null) {
            return;
        }
        if (w.L0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4047c + " with view " + this.f4047c.f3928x4);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4047c.f3928x4.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4047c.f3919q = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4047c.I4.h(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4047c.f3927x = bundle;
    }

    public void u(int i10) {
        this.f4049e = i10;
    }

    void v() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4047c);
        }
        this.f4047c.L1();
        this.f4045a.k(this.f4047c, false);
    }

    void w() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4047c);
        }
        this.f4047c.M1();
        this.f4045a.l(this.f4047c, false);
    }
}
