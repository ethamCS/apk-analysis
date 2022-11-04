package androidx.fragment.app;

import android.animation.Animator;
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
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.h, t, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    d L;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    androidx.lifecycle.i S;
    r T;
    androidx.savedstate.a V;
    private int W;

    /* renamed from: c */
    Bundle f884c;
    SparseArray<Parcelable> d;
    Boolean e;
    Bundle g;
    Fragment h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    j s;
    h t;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    /* renamed from: b */
    int f883b = 0;
    String f = UUID.randomUUID().toString();
    String i = null;
    private Boolean k = null;
    j u = new j();
    boolean E = true;
    boolean K = true;
    e.b R = e.b.RESUMED;
    androidx.lifecycle.m<androidx.lifecycle.h> U = new androidx.lifecycle.m<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.h0();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.fragment.app.e {
        c() {
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.e
        public View a(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.H != null;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f889a;

        /* renamed from: b */
        Animator f890b;

        /* renamed from: c */
        int f891c;
        int d;
        int e;
        int f;
        Object h;
        Object j;
        Object l;
        Boolean m;
        Boolean n;
        boolean q;
        f r;
        boolean s;
        Object g = null;
        Object i = null;
        Object k = null;
        androidx.core.app.f o = null;
        androidx.core.app.f p = null;

        d() {
            Object obj = Fragment.X;
            this.h = obj;
            this.j = obj;
            this.l = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    public Fragment() {
        new a();
        j0();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d i0() {
        if (this.L == null) {
            this.L = new d();
        }
        return this.L;
    }

    private void j0() {
        this.S = new androidx.lifecycle.i(this);
        this.V = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.f() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.f
                public void a(androidx.lifecycle.h hVar, e.a aVar) {
                    View view;
                    if (aVar != e.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    public Object A() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == X ? n() : obj;
    }

    public Object B() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public Object C() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == X ? B() : obj;
    }

    public int D() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f891c;
    }

    public final Fragment E() {
        String str;
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.s;
        if (jVar != null && (str = this.i) != null) {
            return jVar.h.get(str);
        }
        return null;
    }

    public View F() {
        return this.H;
    }

    public void G() {
        j0();
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new j();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    public boolean H() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    public final boolean I() {
        return this.r > 0;
    }

    public boolean J() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    public final boolean K() {
        j jVar = this.s;
        if (jVar == null) {
            return false;
        }
        return jVar.v();
    }

    public void L() {
        this.u.w();
    }

    public void M() {
        this.F = true;
    }

    public void N() {
    }

    public void O() {
        this.F = true;
    }

    public void P() {
        this.F = true;
    }

    public void Q() {
        this.F = true;
    }

    public void R() {
        this.F = true;
    }

    public void S() {
        this.F = true;
    }

    public void T() {
        this.F = true;
    }

    public void U() {
        this.u.a(this.t, new c(), this);
        this.F = false;
        a(this.t.g());
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void V() {
        this.u.g();
        this.S.a(e.a.ON_DESTROY);
        this.f883b = 0;
        this.F = false;
        this.Q = false;
        M();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void W() {
        this.u.h();
        if (this.H != null) {
            this.T.a(e.a.ON_DESTROY);
        }
        this.f883b = 1;
        this.F = false;
        O();
        if (this.F) {
            a.k.a.a.a(this).a();
            this.q = false;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void X() {
        this.F = false;
        P();
        this.P = null;
        if (this.F) {
            if (this.u.u()) {
                return;
            }
            this.u.g();
            this.u = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void Y() {
        onLowMemory();
        this.u.i();
    }

    public void Z() {
        this.u.j();
        if (this.H != null) {
            this.T.a(e.a.ON_PAUSE);
        }
        this.S.a(e.a.ON_PAUSE);
        this.f883b = 3;
        this.F = false;
        Q();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        h hVar = this.t;
        if (hVar != null) {
            LayoutInflater j = hVar.j();
            j jVar = this.u;
            jVar.r();
            a.g.l.e.b(j, jVar);
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.W;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public Animation a(int i, boolean z, int i2) {
        return null;
    }

    public Fragment a(String str) {
        return str.equals(this.f) ? this : this.u.b(str);
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.e a() {
        return this.S;
    }

    public final String a(int i) {
        return y().getString(i);
    }

    public void a(int i, int i2) {
        if (this.L == null && i == 0 && i2 == 0) {
            return;
        }
        i0();
        d dVar = this.L;
        dVar.e = i;
        dVar.f = i2;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    public void a(Animator animator) {
        i0().f890b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.F = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void a(Context context) {
        this.F = true;
        h hVar = this.t;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.F = false;
            a(f2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        h hVar = this.t;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.F = false;
            a(f2, attributeSet, bundle);
        }
    }

    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.a(configuration);
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view) {
        i0().f889a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(f fVar) {
        i0();
        f fVar2 = this.L.r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        d dVar = this.L;
        if (dVar.q) {
            dVar.r = fVar;
        }
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f883b);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
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
        printWriter.println(this.K);
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
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f884c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f884c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.d);
        }
        Fragment E = E();
        if (E != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(E);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(t());
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
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(i());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(D());
        }
        if (m() != null) {
            a.k.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        j jVar = this.u;
        jVar.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void a(boolean z) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public void a0() {
        boolean i = this.s.i(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != i) {
            this.k = Boolean.valueOf(i);
            d(i);
            this.u.k();
        }
    }

    public Animator b(int i, boolean z, int i2) {
        return null;
    }

    public void b(int i) {
        if (this.L == null && i == 0) {
            return;
        }
        i0().d = i;
    }

    public void b(Bundle bundle) {
        this.F = true;
    }

    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.w();
        this.q = true;
        this.T = new r();
        View a2 = a(layoutInflater, viewGroup, bundle);
        this.H = a2;
        if (a2 != null) {
            this.T.d();
            this.U.a((androidx.lifecycle.m<androidx.lifecycle.h>) this.T);
        } else if (this.T.e()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.T = null;
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z) {
    }

    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                a(menu, menuInflater);
            }
            return z | this.u.a(menu, menuInflater);
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public void b0() {
        this.u.w();
        this.u.p();
        this.f883b = 4;
        this.F = false;
        R();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        this.S.a(e.a.ON_RESUME);
        if (this.H != null) {
            this.T.a(e.a.ON_RESUME);
        }
        this.u.l();
        this.u.p();
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.V.a();
    }

    public void c(int i) {
        i0().f891c = i;
    }

    public void c(Bundle bundle) {
        this.F = true;
        k(bundle);
        if (!this.u.c(1)) {
            this.u.f();
        }
    }

    public void c(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                a(menu);
            }
            this.u.a(menu);
        }
    }

    public void c(boolean z) {
    }

    public boolean c(MenuItem menuItem) {
        if (!this.z) {
            return a(menuItem) || this.u.a(menuItem);
        }
        return false;
    }

    public void c0() {
        this.u.w();
        this.u.p();
        this.f883b = 3;
        this.F = false;
        S();
        if (this.F) {
            this.S.a(e.a.ON_START);
            if (this.H != null) {
                this.T.a(e.a.ON_START);
            }
            this.u.m();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStart()");
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    void d() {
        d dVar = this.L;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void d(boolean z) {
    }

    public boolean d(Menu menu) {
        boolean z = false;
        if (!this.z) {
            if (this.D && this.E) {
                z = true;
                b(menu);
            }
            return z | this.u.b(menu);
        }
        return false;
    }

    public boolean d(MenuItem menuItem) {
        if (!this.z) {
            return (this.D && this.E && b(menuItem)) || this.u.b(menuItem);
        }
        return false;
    }

    public void d0() {
        this.u.n();
        if (this.H != null) {
            this.T.a(e.a.ON_STOP);
        }
        this.S.a(e.a.ON_STOP);
        this.f883b = 2;
        this.F = false;
        T();
        if (this.F) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.s e() {
        j jVar = this.s;
        if (jVar != null) {
            return jVar.g(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e(Bundle bundle) {
    }

    public void e(boolean z) {
        b(z);
        this.u.a(z);
    }

    public final androidx.fragment.app.d e0() {
        androidx.fragment.app.d f2 = f();
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final androidx.fragment.app.d f() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.f();
    }

    public void f(Bundle bundle) {
        this.F = true;
    }

    public void f(boolean z) {
        c(z);
        this.u.b(z);
    }

    public final Context f0() {
        Context m = m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void g(Bundle bundle) {
        this.u.w();
        this.f883b = 2;
        this.F = false;
        b(bundle);
        if (this.F) {
            this.u.e();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void g(boolean z) {
        i0().s = z;
    }

    public boolean g() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final View g0() {
        View F = F();
        if (F != null) {
            return F;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void h(Bundle bundle) {
        this.u.w();
        this.f883b = 1;
        this.F = false;
        this.V.a(bundle);
        c(bundle);
        this.Q = true;
        if (this.F) {
            this.S.a(e.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void h0() {
        j jVar = this.s;
        if (jVar == null || jVar.r == null) {
            i0().q = false;
        } else if (Looper.myLooper() != this.s.r.h().getLooper()) {
            this.s.r.h().postAtFrontOfQueue(new b());
        } else {
            d();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public LayoutInflater i(Bundle bundle) {
        LayoutInflater d2 = d(bundle);
        this.P = d2;
        return d2;
    }

    public View i() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f889a;
    }

    public Animator j() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f890b;
    }

    public void j(Bundle bundle) {
        e(bundle);
        this.V.b(bundle);
        Parcelable y = this.u.y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
    }

    public final Bundle k() {
        return this.g;
    }

    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.a(parcelable);
        this.u.f();
    }

    public final i l() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.d = null;
        }
        this.F = false;
        f(bundle);
        if (this.F) {
            if (this.H == null) {
                return;
            }
            this.T.a(e.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public Context m() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void m(Bundle bundle) {
        if (this.s == null || !K()) {
            this.g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Object n() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    public androidx.core.app.f o() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public Object p() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public androidx.core.app.f q() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public final i r() {
        return this.s;
    }

    public final Object s() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    public int t() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.g.k.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f);
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

    public int u() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    public int v() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    public final Fragment w() {
        return this.v;
    }

    public Object x() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == X ? p() : obj;
    }

    public final Resources y() {
        return f0().getResources();
    }

    public final boolean z() {
        return this.B;
    }
}
