package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.navigation.NavController;
import androidx.navigation.fragment.a;
import androidx.navigation.p;
import androidx.navigation.t;
import androidx.navigation.u;
import androidx.navigation.x;
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    private p X;
    private Boolean Y = null;
    private View Z;
    private int a0;
    private boolean b0;

    public static NavController A1(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.E()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).C1();
            }
            Fragment j0 = fragment2.F().j0();
            if (j0 instanceof NavHostFragment) {
                return ((NavHostFragment) j0).C1();
            }
        }
        View P = fragment.P();
        if (P != null) {
            return t.b(P);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    private int B1() {
        int z = z();
        return (z == 0 || z == -1) ? b.a_res_0x7f09012e : z;
    }

    @Override // androidx.fragment.app.Fragment
    public void B0(boolean z) {
        p pVar = this.X;
        if (pVar != null) {
            pVar.c(z);
        } else {
            this.Y = Boolean.valueOf(z);
        }
    }

    public final NavController C1() {
        p pVar = this.X;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    protected void D1(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(i1(), s()));
        navController.l().a(z1());
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        Bundle z = this.X.z();
        if (z != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", z);
        }
        if (this.b0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.a0;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(View view, Bundle bundle) {
        super.H0(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        t.e(view, this.X);
        if (view.getParent() == null) {
            return;
        }
        View view2 = (View) view.getParent();
        this.Z = view2;
        if (view2.getId() != z()) {
            return;
        }
        t.e(this.Z, this.X);
    }

    @Override // androidx.fragment.app.Fragment
    public void f0(Context context) {
        super.f0(context);
        if (this.b0) {
            androidx.fragment.app.t i = F().i();
            i.r(this);
            i.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        Bundle bundle2;
        super.i0(bundle);
        p pVar = new p(i1());
        this.X = pVar;
        pVar.D(this);
        this.X.E(h1().c());
        p pVar2 = this.X;
        Boolean bool = this.Y;
        int i = 0;
        pVar2.c(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.Y = null;
        this.X.F(h());
        D1(this.X);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.b0 = true;
                androidx.fragment.app.t i2 = F().i();
                i2.r(this);
                i2.h();
            }
            this.a0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.X.y(bundle2);
        }
        int i3 = this.a0;
        if (i3 != 0) {
            this.X.A(i3);
            return;
        }
        Bundle r = r();
        if (r != null) {
            i = r.getInt("android-support-nav:fragment:graphId");
        }
        if (r != null) {
            bundle3 = r.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i == 0) {
            return;
        }
        this.X.B(i, bundle3);
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g gVar = new g(layoutInflater.getContext());
        gVar.setId(B1());
        return gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void p0() {
        super.p0();
        View view = this.Z;
        if (view != null && t.b(view) == this.X) {
            t.e(this.Z, null);
        }
        this.Z = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void u0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.u0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f1397g);
        int resourceId = obtainStyledAttributes.getResourceId(x.f1398h, 0);
        if (resourceId != 0) {
            this.a0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.f1318e);
        if (obtainStyledAttributes2.getBoolean(c.f1319f, false)) {
            this.b0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Deprecated
    protected u<? extends a.C0021a> z1() {
        return new a(i1(), s(), B1());
    }
}
