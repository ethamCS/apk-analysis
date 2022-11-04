package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.e;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, androidx.lifecycle.w, androidx.savedstate.b {
    static final Object W = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    ViewGroup G;
    View H;
    boolean I;
    boolean J;
    c K;
    boolean L;
    boolean M;
    float N;
    LayoutInflater O;
    boolean P;
    e.b Q;
    androidx.lifecycle.j R;
    x S;
    androidx.lifecycle.n<androidx.lifecycle.i> T;
    androidx.savedstate.a U;
    private int V;

    /* renamed from: b */
    int f1012b;

    /* renamed from: c */
    Bundle f1013c;

    /* renamed from: d */
    SparseArray<Parcelable> f1014d;

    /* renamed from: e */
    Boolean f1015e;

    /* renamed from: f */
    String f1016f;

    /* renamed from: g */
    Bundle f1017g;

    /* renamed from: h */
    Fragment f1018h;
    String i;
    int j;
    private Boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    m s;
    j<?> t;
    m u;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {
        b() {
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.f
        public View e(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.f
        public boolean f() {
            return Fragment.this.H != null;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        View f1022a;

        /* renamed from: b */
        Animator f1023b;

        /* renamed from: c */
        int f1024c;

        /* renamed from: d */
        int f1025d;

        /* renamed from: e */
        int f1026e;

        /* renamed from: g */
        Object f1028g;
        Object i;
        Object k;
        Boolean l;
        Boolean m;
        androidx.core.app.m n;
        androidx.core.app.m o;
        boolean p;
        e q;
        boolean r;

        /* renamed from: f */
        Object f1027f = null;

        /* renamed from: h */
        Object f1029h = null;
        Object j = null;

        c() {
            Object obj = Fragment.W;
            this.f1028g = obj;
            this.i = obj;
            this.k = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    public Fragment() {
        this.f1012b = -1;
        this.f1016f = UUID.randomUUID().toString();
        this.i = null;
        this.k = null;
        this.u = new n();
        this.E = true;
        this.J = true;
        this.Q = e.b.RESUMED;
        this.T = new androidx.lifecycle.n<>();
        Q();
    }

    public Fragment(int i) {
        this();
        this.V = i;
    }

    private void Q() {
        this.R = new androidx.lifecycle.j(this);
        this.U = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.R.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.g
                public void d(androidx.lifecycle.i iVar, e.a aVar) {
                    View view;
                    if (aVar != e.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment S(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = i.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.o1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c k() {
        if (this.K == null) {
            this.K = new c();
        }
        return this.K;
    }

    public final LayoutInflater A() {
        LayoutInflater layoutInflater = this.O;
        return layoutInflater == null ? T0(null) : layoutInflater;
    }

    public void A0(Menu menu) {
    }

    @Deprecated
    public LayoutInflater B(Bundle bundle) {
        j<?> jVar = this.t;
        if (jVar != null) {
            LayoutInflater m = jVar.m();
            b.g.l.g.b(m, this.u.g0());
            return m;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void B0(boolean z) {
    }

    public int C() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1025d;
    }

    public void C0(int i, String[] strArr, int[] iArr) {
    }

    public int D() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1026e;
    }

    public void D0() {
        this.F = true;
    }

    public final Fragment E() {
        return this.v;
    }

    public void E0(Bundle bundle) {
    }

    public final m F() {
        m mVar = this.s;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void F0() {
        this.F = true;
    }

    public Object G() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.i;
        return obj == W ? w() : obj;
    }

    public void G0() {
        this.F = true;
    }

    public final Resources H() {
        return i1().getResources();
    }

    public void H0(View view, Bundle bundle) {
    }

    public final boolean I() {
        return this.B;
    }

    public void I0(Bundle bundle) {
        this.F = true;
    }

    public Object J() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f1028g;
        return obj == W ? u() : obj;
    }

    public void J0(Bundle bundle) {
        this.u.B0();
        this.f1012b = 2;
        this.F = false;
        c0(bundle);
        if (this.F) {
            this.u.r();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object K() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.j;
    }

    public void K0() {
        this.u.g(this.t, new b(), this);
        this.f1012b = 0;
        this.F = false;
        f0(this.t.i());
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onAttach()");
    }

    public Object L() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.k;
        return obj == W ? K() : obj;
    }

    public void L0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.s(configuration);
    }

    public int M() {
        c cVar = this.K;
        if (cVar == null) {
            return 0;
        }
        return cVar.f1024c;
    }

    public boolean M0(MenuItem menuItem) {
        if (!this.z) {
            return h0(menuItem) || this.u.t(menuItem);
        }
        return false;
    }

    public final String N(int i) {
        return H().getString(i);
    }

    public void N0(Bundle bundle) {
        this.u.B0();
        this.f1012b = 1;
        this.F = false;
        this.U.c(bundle);
        i0(bundle);
        this.P = true;
        if (this.F) {
            this.R.i(e.a.ON_CREATE);
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final Fragment O() {
        String str;
        Fragment fragment = this.f1018h;
        if (fragment != null) {
            return fragment;
        }
        m mVar = this.s;
        if (mVar != null && (str = this.i) != null) {
            return mVar.V(str);
        }
        return null;
    }

    public boolean O0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                l0(menu, menuInflater);
            }
            return z | this.u.v(menu, menuInflater);
        }
        return false;
    }

    public View P() {
        return this.H;
    }

    public void P0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.B0();
        this.q = true;
        this.S = new x();
        View m0 = m0(layoutInflater, viewGroup, bundle);
        this.H = m0;
        if (m0 != null) {
            this.S.e();
            this.T.h(this.S);
        } else if (this.S.f()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.S = null;
        }
    }

    public void Q0() {
        this.u.w();
        this.R.i(e.a.ON_DESTROY);
        this.f1012b = 0;
        this.F = false;
        this.P = false;
        n0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void R() {
        Q();
        this.f1016f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new n();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    public void R0() {
        this.u.x();
        if (this.H != null) {
            this.S.b(e.a.ON_DESTROY);
        }
        this.f1012b = 1;
        this.F = false;
        p0();
        if (this.F) {
            b.m.a.a.b(this).c();
            this.q = false;
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void S0() {
        this.f1012b = -1;
        this.F = false;
        q0();
        this.O = null;
        if (this.F) {
            if (this.u.o0()) {
                return;
            }
            this.u.w();
            this.u = new n();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean T() {
        return this.t != null && this.l;
    }

    public LayoutInflater T0(Bundle bundle) {
        LayoutInflater r0 = r0(bundle);
        this.O = r0;
        return r0;
    }

    public final boolean U() {
        return this.z;
    }

    public void U0() {
        onLowMemory();
        this.u.y();
    }

    public boolean V() {
        c cVar = this.K;
        if (cVar == null) {
            return false;
        }
        return cVar.r;
    }

    public void V0(boolean z) {
        v0(z);
        this.u.z(z);
    }

    public final boolean W() {
        return this.r > 0;
    }

    public boolean W0(MenuItem menuItem) {
        if (!this.z) {
            return (this.D && this.E && w0(menuItem)) || this.u.A(menuItem);
        }
        return false;
    }

    public boolean X() {
        c cVar = this.K;
        if (cVar == null) {
            return false;
        }
        return cVar.p;
    }

    public void X0(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                x0(menu);
            }
            this.u.B(menu);
        }
    }

    public final boolean Y() {
        return this.m;
    }

    public void Y0() {
        this.u.D();
        if (this.H != null) {
            this.S.b(e.a.ON_PAUSE);
        }
        this.R.i(e.a.ON_PAUSE);
        this.f1012b = 3;
        this.F = false;
        y0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean Z() {
        Fragment E = E();
        return E != null && (E.Y() || E.Z());
    }

    public void Z0(boolean z) {
        z0(z);
        this.u.E(z);
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.R;
    }

    public final boolean a0() {
        m mVar = this.s;
        if (mVar == null) {
            return false;
        }
        return mVar.t0();
    }

    public boolean a1(Menu menu) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                A0(menu);
            }
            return z | this.u.F(menu);
        }
        return false;
    }

    public void b0() {
        this.u.B0();
    }

    public void b1() {
        boolean r0 = this.s.r0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != r0) {
            this.k = Boolean.valueOf(r0);
            B0(r0);
            this.u.G();
        }
    }

    public void c0(Bundle bundle) {
        this.F = true;
    }

    public void c1() {
        this.u.B0();
        this.u.Q(true);
        this.f1012b = 4;
        this.F = false;
        D0();
        if (!this.F) {
            throw new y("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.R;
        e.a aVar = e.a.ON_RESUME;
        jVar.i(aVar);
        if (this.H != null) {
            this.S.b(aVar);
        }
        this.u.H();
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry d() {
        return this.U.b();
    }

    public void d0(int i, int i2, Intent intent) {
    }

    public void d1(Bundle bundle) {
        E0(bundle);
        this.U.d(bundle);
        Parcelable Q0 = this.u.Q0();
        if (Q0 != null) {
            bundle.putParcelable("android:support:fragments", Q0);
        }
    }

    @Deprecated
    public void e0(Activity activity) {
        this.F = true;
    }

    public void e1() {
        this.u.B0();
        this.u.Q(true);
        this.f1012b = 3;
        this.F = false;
        F0();
        if (!this.F) {
            throw new y("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.R;
        e.a aVar = e.a.ON_START;
        jVar.i(aVar);
        if (this.H != null) {
            this.S.b(aVar);
        }
        this.u.I();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0(Context context) {
        this.F = true;
        j<?> jVar = this.t;
        Activity g2 = jVar == null ? null : jVar.g();
        if (g2 != null) {
            this.F = false;
            e0(g2);
        }
    }

    public void f1() {
        this.u.K();
        if (this.H != null) {
            this.S.b(e.a.ON_STOP);
        }
        this.R.i(e.a.ON_STOP);
        this.f1012b = 2;
        this.F = false;
        G0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onStop()");
    }

    public void g0(Fragment fragment) {
    }

    public final void g1(String[] strArr, int i) {
        j<?> jVar = this.t;
        if (jVar != null) {
            jVar.n(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.lifecycle.w
    public androidx.lifecycle.v h() {
        m mVar = this.s;
        if (mVar != null) {
            return mVar.l0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public boolean h0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.d h1() {
        androidx.fragment.app.d m = m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void i() {
        c cVar = this.K;
        e eVar = null;
        if (cVar != null) {
            cVar.p = false;
            e eVar2 = cVar.q;
            cVar.q = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.a();
        }
    }

    public void i0(Bundle bundle) {
        this.F = true;
        k1(bundle);
        if (!this.u.s0(1)) {
            this.u.u();
        }
    }

    public final Context i1() {
        Context t = t();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1012b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1016f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.f1017g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1017g);
        }
        if (this.f1013c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1013c);
        }
        if (this.f1014d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1014d);
        }
        Fragment O = O();
        if (O != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(O);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (C() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(C());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(M());
        }
        if (t() != null) {
            b.m.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        m mVar = this.u;
        mVar.M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public Animation j0(int i, boolean z, int i2) {
        return null;
    }

    public final View j1() {
        View P = P();
        if (P != null) {
            return P;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator k0(int i, boolean z, int i2) {
        return null;
    }

    public void k1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.O0(parcelable);
        this.u.u();
    }

    public Fragment l(String str) {
        return str.equals(this.f1016f) ? this : this.u.Y(str);
    }

    public void l0(Menu menu, MenuInflater menuInflater) {
    }

    public final void l1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1014d;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f1014d = null;
        }
        this.F = false;
        I0(bundle);
        if (this.F) {
            if (this.H == null) {
                return;
            }
            this.S.b(e.a.ON_CREATE);
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public final androidx.fragment.app.d m() {
        j<?> jVar = this.t;
        if (jVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) jVar.g();
    }

    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.V;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void m1(View view) {
        k().f1022a = view;
    }

    public boolean n() {
        Boolean bool;
        c cVar = this.K;
        if (cVar == null || (bool = cVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0() {
        this.F = true;
    }

    public void n1(Animator animator) {
        k().f1023b = animator;
    }

    public boolean o() {
        Boolean bool;
        c cVar = this.K;
        if (cVar == null || (bool = cVar.l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0() {
    }

    public void o1(Bundle bundle) {
        if (this.s == null || !a0()) {
            this.f1017g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        h1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public View p() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1022a;
    }

    public void p0() {
        this.F = true;
    }

    public void p1(boolean z) {
        if (this.D != z) {
            this.D = z;
            if (!T() || U()) {
                return;
            }
            this.t.q();
        }
    }

    public Animator q() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1023b;
    }

    public void q0() {
        this.F = true;
    }

    public void q1(boolean z) {
        k().r = z;
    }

    public final Bundle r() {
        return this.f1017g;
    }

    public LayoutInflater r0(Bundle bundle) {
        return B(bundle);
    }

    public void r1(int i) {
        if (this.K == null && i == 0) {
            return;
        }
        k().f1025d = i;
    }

    public final m s() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0(boolean z) {
    }

    public void s1(int i) {
        if (this.K == null && i == 0) {
            return;
        }
        k();
        this.K.f1026e = i;
    }

    public Context t() {
        j<?> jVar = this.t;
        if (jVar == null) {
            return null;
        }
        return jVar.i();
    }

    @Deprecated
    public void t0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void t1(e eVar) {
        k();
        c cVar = this.K;
        e eVar2 = cVar.q;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (cVar.p) {
            cVar.q = eVar;
        }
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1016f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1027f;
    }

    public void u0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        j<?> jVar = this.t;
        Activity g2 = jVar == null ? null : jVar.g();
        if (g2 != null) {
            this.F = false;
            t0(g2, attributeSet, bundle);
        }
    }

    public void u1(int i) {
        k().f1024c = i;
    }

    public androidx.core.app.m v() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.n;
    }

    public void v0(boolean z) {
    }

    public void v1(Fragment fragment, int i) {
        m mVar = this.s;
        m mVar2 = fragment != null ? fragment.s : null;
        if (mVar != null && mVar2 != null && mVar != mVar2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.O()) {
            if (fragment2 == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.i = null;
        } else if (this.s == null || fragment.s == null) {
            this.i = null;
            this.f1018h = fragment;
            this.j = i;
        } else {
            this.i = fragment.f1016f;
        }
        this.f1018h = null;
        this.j = i;
    }

    public Object w() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.f1029h;
    }

    public boolean w0(MenuItem menuItem) {
        return false;
    }

    public void w1(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        x1(intent, i, null);
    }

    public androidx.core.app.m x() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    public void x0(Menu menu) {
    }

    public void x1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        j<?> jVar = this.t;
        if (jVar != null) {
            jVar.p(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final Object y() {
        j<?> jVar = this.t;
        if (jVar == null) {
            return null;
        }
        return jVar.l();
    }

    public void y0() {
        this.F = true;
    }

    public void y1() {
        m mVar = this.s;
        if (mVar == null || mVar.o == null) {
            k().p = false;
        } else if (Looper.myLooper() != this.s.o.j().getLooper()) {
            this.s.o.j().postAtFrontOfQueue(new a());
        } else {
            i();
        }
    }

    public final int z() {
        return this.w;
    }

    public void z0(boolean z) {
    }
}
