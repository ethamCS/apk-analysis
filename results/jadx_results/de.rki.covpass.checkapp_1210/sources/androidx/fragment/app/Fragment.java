package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.v, z0, androidx.lifecycle.l, k1.e {
    static final Object Q4 = new Object();
    i A4;
    Runnable B4;
    boolean C4;
    LayoutInflater D4;
    boolean E4;
    public String F4;
    m.c G4;
    androidx.lifecycle.x H4;
    j0 I4;
    androidx.lifecycle.d0<androidx.lifecycle.v> J4;
    v0.b K4;
    k1.d L4;
    private int M4;
    private final AtomicInteger N4;
    private final ArrayList<l> O4;
    private final l P4;
    String U3;
    Bundle V3;
    Fragment W3;
    String X3;
    int Y3;
    private Boolean Z3;

    /* renamed from: a4 */
    boolean f3901a4;

    /* renamed from: b4 */
    boolean f3902b4;

    /* renamed from: c */
    int f3903c;

    /* renamed from: c4 */
    boolean f3904c4;

    /* renamed from: d */
    Bundle f3905d;

    /* renamed from: d4 */
    boolean f3906d4;

    /* renamed from: e4 */
    boolean f3907e4;

    /* renamed from: f4 */
    boolean f3908f4;

    /* renamed from: g4 */
    boolean f3909g4;

    /* renamed from: h4 */
    int f3910h4;

    /* renamed from: i4 */
    w f3911i4;

    /* renamed from: j4 */
    o<?> f3912j4;

    /* renamed from: k4 */
    w f3913k4;

    /* renamed from: l4 */
    Fragment f3914l4;

    /* renamed from: m4 */
    int f3915m4;

    /* renamed from: n4 */
    int f3916n4;

    /* renamed from: o4 */
    String f3917o4;

    /* renamed from: p4 */
    boolean f3918p4;

    /* renamed from: q */
    SparseArray<Parcelable> f3919q;

    /* renamed from: q4 */
    boolean f3920q4;

    /* renamed from: r4 */
    boolean f3921r4;

    /* renamed from: s4 */
    boolean f3922s4;

    /* renamed from: t4 */
    boolean f3923t4;

    /* renamed from: u4 */
    boolean f3924u4;

    /* renamed from: v4 */
    private boolean f3925v4;

    /* renamed from: w4 */
    ViewGroup f3926w4;

    /* renamed from: x */
    Bundle f3927x;

    /* renamed from: x4 */
    View f3928x4;

    /* renamed from: y */
    Boolean f3929y;

    /* renamed from: y4 */
    boolean f3930y4;

    /* renamed from: z4 */
    boolean f3931z4;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f3933a;

        /* renamed from: b */
        final /* synthetic */ d.a f3934b;

        a(AtomicReference atomicReference, d.a aVar) {
            Fragment.this = r1;
            this.f3933a = atomicReference;
            this.f3934b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            androidx.activity.result.c cVar2 = (androidx.activity.result.c) this.f3933a.get();
            if (cVar2 != null) {
                cVar2.b(i10, cVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f3933a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(null);
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            Fragment.this.L4.c();
            androidx.lifecycle.m0.c(Fragment.this);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.v(false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ m0 f3939c;

        e(m0 m0Var) {
            Fragment.this = r1;
            this.f3939c = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3939c.g();
        }
    }

    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.l {
        f() {
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.l
        public View d(int i10) {
            View view = Fragment.this.f3928x4;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.l
        public boolean e() {
            return Fragment.this.f3928x4 != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements o.a<Void, ActivityResultRegistry> {
        g() {
            Fragment.this = r1;
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            o<?> oVar = fragment.f3912j4;
            return oVar instanceof androidx.activity.result.d ? ((androidx.activity.result.d) oVar).D() : fragment.R1().D();
        }
    }

    /* loaded from: classes.dex */
    public class h extends l {

        /* renamed from: a */
        final /* synthetic */ o.a f3943a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f3944b;

        /* renamed from: c */
        final /* synthetic */ d.a f3945c;

        /* renamed from: d */
        final /* synthetic */ androidx.activity.result.b f3946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o.a aVar, AtomicReference atomicReference, d.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            Fragment.this = r1;
            this.f3943a = aVar;
            this.f3944b = atomicReference;
            this.f3945c = aVar2;
            this.f3946d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            this.f3944b.set(((ActivityResultRegistry) this.f3943a.apply(null)).i(Fragment.this.E(), Fragment.this, this.f3945c, this.f3946d));
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        View f3948a;

        /* renamed from: b */
        boolean f3949b;

        /* renamed from: c */
        int f3950c;

        /* renamed from: d */
        int f3951d;

        /* renamed from: e */
        int f3952e;

        /* renamed from: f */
        int f3953f;

        /* renamed from: g */
        int f3954g;

        /* renamed from: h */
        ArrayList<String> f3955h;

        /* renamed from: i */
        ArrayList<String> f3956i;

        /* renamed from: k */
        Object f3958k;

        /* renamed from: m */
        Object f3960m;

        /* renamed from: o */
        Object f3962o;

        /* renamed from: p */
        Boolean f3963p;

        /* renamed from: q */
        Boolean f3964q;

        /* renamed from: t */
        boolean f3967t;

        /* renamed from: j */
        Object f3957j = null;

        /* renamed from: l */
        Object f3959l = null;

        /* renamed from: n */
        Object f3961n = null;

        /* renamed from: r */
        float f3965r = 1.0f;

        /* renamed from: s */
        View f3966s = null;

        i() {
            Object obj = Fragment.Q4;
            this.f3958k = obj;
            this.f3960m = obj;
            this.f3962o = obj;
        }
    }

    /* loaded from: classes.dex */
    static class j {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends RuntimeException {
        public k(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        private l() {
        }

        /* synthetic */ l(b bVar) {
            this();
        }

        abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: c */
        final Bundle f3968c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            /* renamed from: c */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        public m(Bundle bundle) {
            this.f3968c = bundle;
        }

        m(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3968c = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f3968c);
        }
    }

    public Fragment() {
        this.f3903c = -1;
        this.U3 = UUID.randomUUID().toString();
        this.X3 = null;
        this.Z3 = null;
        this.f3913k4 = new x();
        this.f3924u4 = true;
        this.f3931z4 = true;
        this.B4 = new b();
        this.G4 = m.c.RESUMED;
        this.J4 = new androidx.lifecycle.d0<>();
        this.N4 = new AtomicInteger();
        this.O4 = new ArrayList<>();
        this.P4 = new c();
        z0();
    }

    public Fragment(int i10) {
        this();
        this.M4 = i10;
    }

    @Deprecated
    public static Fragment B0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = n.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.Y1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private i C() {
        if (this.A4 == null) {
            this.A4 = new i();
        }
        return this.A4;
    }

    private <I, O> androidx.activity.result.c<I> O1(d.a<I, O> aVar, o.a<Void, ActivityResultRegistry> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.f3903c <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            Q1(new h(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void Q1(l lVar) {
        if (this.f3903c >= 0) {
            lVar.a();
        } else {
            this.O4.add(lVar);
        }
    }

    private void V1() {
        if (w.L0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3928x4 != null) {
            W1(this.f3905d);
        }
        this.f3905d = null;
    }

    private int f0() {
        m.c cVar = this.G4;
        return (cVar == m.c.INITIALIZED || this.f3914l4 == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f3914l4.f0());
    }

    private Fragment w0(boolean z10) {
        String str;
        if (z10) {
            b1.d.j(this);
        }
        Fragment fragment = this.W3;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.f3911i4;
        if (wVar != null && (str = this.X3) != null) {
            return wVar.h0(str);
        }
        return null;
    }

    private void z0() {
        this.H4 = new androidx.lifecycle.x(this);
        this.L4 = k1.d.a(this);
        this.K4 = null;
        if (!this.O4.contains(this.P4)) {
            Q1(this.P4);
        }
    }

    public void A0() {
        z0();
        this.F4 = this.U3;
        this.U3 = UUID.randomUUID().toString();
        this.f3901a4 = false;
        this.f3902b4 = false;
        this.f3906d4 = false;
        this.f3907e4 = false;
        this.f3908f4 = false;
        this.f3910h4 = 0;
        this.f3911i4 = null;
        this.f3913k4 = new x();
        this.f3912j4 = null;
        this.f3915m4 = 0;
        this.f3916n4 = 0;
        this.f3917o4 = null;
        this.f3918p4 = false;
        this.f3920q4 = false;
    }

    public LayoutInflater A1(Bundle bundle) {
        LayoutInflater Y0 = Y0(bundle);
        this.D4 = Y0;
        return Y0;
    }

    public void B1() {
        onLowMemory();
        this.f3913k4.H();
    }

    public final boolean C0() {
        return this.f3912j4 != null && this.f3901a4;
    }

    public void C1(boolean z10) {
        c1(z10);
        this.f3913k4.I(z10);
    }

    public Fragment D(String str) {
        return str.equals(this.U3) ? this : this.f3913k4.l0(str);
    }

    public final boolean D0() {
        w wVar;
        return this.f3918p4 || ((wVar = this.f3911i4) != null && wVar.N0(this.f3914l4));
    }

    public boolean D1(MenuItem menuItem) {
        if (!this.f3918p4) {
            if (this.f3923t4 && this.f3924u4 && d1(menuItem)) {
                return true;
            }
            return this.f3913k4.L(menuItem);
        }
        return false;
    }

    String E() {
        return "fragment_" + this.U3 + "_rq#" + this.N4.getAndIncrement();
    }

    public final boolean E0() {
        return this.f3910h4 > 0;
    }

    public void E1(Menu menu) {
        if (!this.f3918p4) {
            if (this.f3923t4 && this.f3924u4) {
                e1(menu);
            }
            this.f3913k4.M(menu);
        }
    }

    public final androidx.fragment.app.j F() {
        o<?> oVar = this.f3912j4;
        if (oVar == null) {
            return null;
        }
        return (androidx.fragment.app.j) oVar.h();
    }

    public final boolean F0() {
        w wVar;
        return this.f3924u4 && ((wVar = this.f3911i4) == null || wVar.O0(this.f3914l4));
    }

    public void F1() {
        this.f3913k4.O();
        if (this.f3928x4 != null) {
            this.I4.a(m.b.ON_PAUSE);
        }
        this.H4.h(m.b.ON_PAUSE);
        this.f3903c = 6;
        this.f3925v4 = false;
        f1();
        if (this.f3925v4) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onPause()");
    }

    public boolean G0() {
        i iVar = this.A4;
        if (iVar == null) {
            return false;
        }
        return iVar.f3967t;
    }

    public void G1(boolean z10) {
        g1(z10);
        this.f3913k4.P(z10);
    }

    public boolean H() {
        Boolean bool;
        i iVar = this.A4;
        if (iVar == null || (bool = iVar.f3964q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean H0() {
        w wVar = this.f3911i4;
        if (wVar == null) {
            return false;
        }
        return wVar.R0();
    }

    public boolean H1(Menu menu) {
        boolean z10 = false;
        if (!this.f3918p4) {
            if (this.f3923t4 && this.f3924u4) {
                z10 = true;
                h1(menu);
            }
            return z10 | this.f3913k4.Q(menu);
        }
        return false;
    }

    @Override // androidx.lifecycle.z0
    public y0 I() {
        if (this.f3911i4 != null) {
            if (f0() == m.c.INITIALIZED.ordinal()) {
                throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            }
            return this.f3911i4.G0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void I0() {
        this.f3913k4.Y0();
    }

    public void I1() {
        boolean P0 = this.f3911i4.P0(this);
        Boolean bool = this.Z3;
        if (bool == null || bool.booleanValue() != P0) {
            this.Z3 = Boolean.valueOf(P0);
            i1(P0);
            this.f3913k4.R();
        }
    }

    @Deprecated
    public void J0(Bundle bundle) {
        this.f3925v4 = true;
    }

    public void J1() {
        this.f3913k4.Y0();
        this.f3913k4.c0(true);
        this.f3903c = 7;
        this.f3925v4 = false;
        k1();
        if (!this.f3925v4) {
            throw new o0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.x xVar = this.H4;
        m.b bVar = m.b.ON_RESUME;
        xVar.h(bVar);
        if (this.f3928x4 != null) {
            this.I4.a(bVar);
        }
        this.f3913k4.S();
    }

    @Deprecated
    public void K0(int i10, int i11, Intent intent) {
        if (w.L0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void K1(Bundle bundle) {
        l1(bundle);
        this.L4.e(bundle);
        Bundle S0 = this.f3913k4.S0();
        if (S0 != null) {
            bundle.putParcelable("android:support:fragments", S0);
        }
    }

    @Deprecated
    public void L0(Activity activity) {
        this.f3925v4 = true;
    }

    public void L1() {
        this.f3913k4.Y0();
        this.f3913k4.c0(true);
        this.f3903c = 5;
        this.f3925v4 = false;
        m1();
        if (!this.f3925v4) {
            throw new o0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.x xVar = this.H4;
        m.b bVar = m.b.ON_START;
        xVar.h(bVar);
        if (this.f3928x4 != null) {
            this.I4.a(bVar);
        }
        this.f3913k4.T();
    }

    public boolean M() {
        Boolean bool;
        i iVar = this.A4;
        if (iVar == null || (bool = iVar.f3963p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void M0(Context context) {
        this.f3925v4 = true;
        o<?> oVar = this.f3912j4;
        Activity h10 = oVar == null ? null : oVar.h();
        if (h10 != null) {
            this.f3925v4 = false;
            L0(h10);
        }
    }

    public void M1() {
        this.f3913k4.V();
        if (this.f3928x4 != null) {
            this.I4.a(m.b.ON_STOP);
        }
        this.H4.h(m.b.ON_STOP);
        this.f3903c = 4;
        this.f3925v4 = false;
        n1();
        if (this.f3925v4) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onStop()");
    }

    View N() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        return iVar.f3948a;
    }

    @Deprecated
    public void N0(Fragment fragment) {
    }

    public void N1() {
        o1(this.f3928x4, this.f3905d);
        this.f3913k4.W();
    }

    public boolean O0(MenuItem menuItem) {
        return false;
    }

    public void P0(Bundle bundle) {
        this.f3925v4 = true;
        U1(bundle);
        if (!this.f3913k4.Q0(1)) {
            this.f3913k4.D();
        }
    }

    public final <I, O> androidx.activity.result.c<I> P1(d.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return O1(aVar, new g(), bVar);
    }

    public final Bundle Q() {
        return this.V3;
    }

    public Animation Q0(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator R0(int i10, boolean z10, int i11) {
        return null;
    }

    public final androidx.fragment.app.j R1() {
        androidx.fragment.app.j F = F();
        if (F != null) {
            return F;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final w S() {
        if (this.f3912j4 != null) {
            return this.f3913k4;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Deprecated
    public void S0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context S1() {
        Context T = T();
        if (T != null) {
            return T;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public Context T() {
        o<?> oVar = this.f3912j4;
        if (oVar == null) {
            return null;
        }
        return oVar.i();
    }

    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.M4;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public final View T1() {
        View x02 = x0();
        if (x02 != null) {
            return x02;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public v0.b U() {
        if (this.f3911i4 != null) {
            if (this.K4 == null) {
                Application application = null;
                Context applicationContext = S1().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && w.L0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + S1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.K4 = new p0(application, this, Q());
            }
            return this.K4;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void U0() {
        this.f3925v4 = true;
    }

    public void U1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3913k4.o1(parcelable);
        this.f3913k4.D();
    }

    public int V() {
        i iVar = this.A4;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3950c;
    }

    @Deprecated
    public void V0() {
    }

    public Object W() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        return iVar.f3957j;
    }

    public void W0() {
        this.f3925v4 = true;
    }

    final void W1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3919q;
        if (sparseArray != null) {
            this.f3928x4.restoreHierarchyState(sparseArray);
            this.f3919q = null;
        }
        if (this.f3928x4 != null) {
            this.I4.e(this.f3927x);
            this.f3927x = null;
        }
        this.f3925v4 = false;
        p1(bundle);
        if (this.f3925v4) {
            if (this.f3928x4 == null) {
                return;
            }
            this.I4.a(m.b.ON_CREATE);
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public androidx.core.app.n X() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public void X0() {
        this.f3925v4 = true;
    }

    public void X1(int i10, int i11, int i12, int i13) {
        if (this.A4 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        C().f3950c = i10;
        C().f3951d = i11;
        C().f3952e = i12;
        C().f3953f = i13;
    }

    public int Y() {
        i iVar = this.A4;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3951d;
    }

    public LayoutInflater Y0(Bundle bundle) {
        return e0(bundle);
    }

    public void Y1(Bundle bundle) {
        if (this.f3911i4 == null || !H0()) {
            this.V3 = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Object Z() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        return iVar.f3959l;
    }

    public void Z0(boolean z10) {
    }

    public void Z1(Object obj) {
        C().f3957j = obj;
    }

    public androidx.core.app.n a0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    @Deprecated
    public void a1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f3925v4 = true;
    }

    public void a2(Object obj) {
        C().f3959l = obj;
    }

    public View b0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        return iVar.f3966s;
    }

    public void b1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3925v4 = true;
        o<?> oVar = this.f3912j4;
        Activity h10 = oVar == null ? null : oVar.h();
        if (h10 != null) {
            this.f3925v4 = false;
            a1(h10, attributeSet, bundle);
        }
    }

    public void b2(View view) {
        C().f3966s = view;
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.m c() {
        return this.H4;
    }

    public final Object c0() {
        o<?> oVar = this.f3912j4;
        if (oVar == null) {
            return null;
        }
        return oVar.n();
    }

    public void c1(boolean z10) {
    }

    public void c2(m mVar) {
        Bundle bundle;
        if (this.f3911i4 == null) {
            if (mVar == null || (bundle = mVar.f3968c) == null) {
                bundle = null;
            }
            this.f3905d = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final LayoutInflater d0() {
        LayoutInflater layoutInflater = this.D4;
        return layoutInflater == null ? A1(null) : layoutInflater;
    }

    @Deprecated
    public boolean d1(MenuItem menuItem) {
        return false;
    }

    public void d2(boolean z10) {
        if (this.f3924u4 != z10) {
            this.f3924u4 = z10;
            if (!this.f3923t4 || !C0() || D0()) {
                return;
            }
            this.f3912j4.q();
        }
    }

    @Deprecated
    public LayoutInflater e0(Bundle bundle) {
        o<?> oVar = this.f3912j4;
        if (oVar != null) {
            LayoutInflater o10 = oVar.o();
            androidx.core.view.g.a(o10, this.f3913k4.z0());
            return o10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void e1(Menu menu) {
    }

    public void e2(int i10) {
        if (this.A4 == null && i10 == 0) {
            return;
        }
        C();
        this.A4.f3954g = i10;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f1() {
        this.f3925v4 = true;
    }

    public void f2(boolean z10) {
        if (this.A4 == null) {
            return;
        }
        C().f3949b = z10;
    }

    @Override // k1.e
    public final k1.c g() {
        return this.L4.b();
    }

    public int g0() {
        i iVar = this.A4;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3954g;
    }

    public void g1(boolean z10) {
    }

    public void g2(float f10) {
        C().f3965r = f10;
    }

    public final Fragment h0() {
        return this.f3914l4;
    }

    @Deprecated
    public void h1(Menu menu) {
    }

    public void h2(Object obj) {
        C().f3960m = obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final w i0() {
        w wVar = this.f3911i4;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void i1(boolean z10) {
    }

    public void i2(Object obj) {
        C().f3958k = obj;
    }

    public boolean j0() {
        i iVar = this.A4;
        if (iVar == null) {
            return false;
        }
        return iVar.f3949b;
    }

    @Deprecated
    public void j1(int i10, String[] strArr, int[] iArr) {
    }

    public void j2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        C();
        i iVar = this.A4;
        iVar.f3955h = arrayList;
        iVar.f3956i = arrayList2;
    }

    public int k0() {
        i iVar = this.A4;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3952e;
    }

    public void k1() {
        this.f3925v4 = true;
    }

    public void k2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        l2(intent, null);
    }

    public int l0() {
        i iVar = this.A4;
        if (iVar == null) {
            return 0;
        }
        return iVar.f3953f;
    }

    public void l1(Bundle bundle) {
    }

    public void l2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        o<?> oVar = this.f3912j4;
        if (oVar != null) {
            oVar.p(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public float m0() {
        i iVar = this.A4;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f3965r;
    }

    public void m1() {
        this.f3925v4 = true;
    }

    public void m2() {
        if (this.A4 == null || !C().f3967t) {
            return;
        }
        if (this.f3912j4 == null) {
            C().f3967t = false;
        } else if (Looper.myLooper() != this.f3912j4.k().getLooper()) {
            this.f3912j4.k().postAtFrontOfQueue(new d());
        } else {
            v(true);
        }
    }

    public Object n0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3960m;
        return obj == Q4 ? Z() : obj;
    }

    public void n1() {
        this.f3925v4 = true;
    }

    public final Resources o0() {
        return S1().getResources();
    }

    public void o1(View view, Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3925v4 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        R1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3925v4 = true;
    }

    public Object p0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3958k;
        return obj == Q4 ? W() : obj;
    }

    public void p1(Bundle bundle) {
        this.f3925v4 = true;
    }

    public Object q0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        return iVar.f3961n;
    }

    public void q1(Bundle bundle) {
        this.f3913k4.Y0();
        this.f3903c = 3;
        this.f3925v4 = false;
        J0(bundle);
        if (this.f3925v4) {
            V1();
            this.f3913k4.z();
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object r0() {
        i iVar = this.A4;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f3962o;
        return obj == Q4 ? q0() : obj;
    }

    public void r1() {
        Iterator<l> it = this.O4.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.O4.clear();
        this.f3913k4.n(this.f3912j4, y(), this);
        this.f3903c = 0;
        this.f3925v4 = false;
        M0(this.f3912j4.i());
        if (this.f3925v4) {
            this.f3911i4.J(this);
            this.f3913k4.A();
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public ArrayList<String> s0() {
        ArrayList<String> arrayList;
        i iVar = this.A4;
        return (iVar == null || (arrayList = iVar.f3955h) == null) ? new ArrayList<>() : arrayList;
    }

    public void s1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3913k4.T0(configuration);
    }

    public ArrayList<String> t0() {
        ArrayList<String> arrayList;
        i iVar = this.A4;
        return (iVar == null || (arrayList = iVar.f3956i) == null) ? new ArrayList<>() : arrayList;
    }

    public boolean t1(MenuItem menuItem) {
        if (!this.f3918p4) {
            if (!O0(menuItem)) {
                return this.f3913k4.C(menuItem);
            }
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.U3);
        if (this.f3915m4 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3915m4));
        }
        if (this.f3917o4 != null) {
            sb2.append(" tag=");
            sb2.append(this.f3917o4);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final String u0(int i10) {
        return o0().getString(i10);
    }

    public void u1(Bundle bundle) {
        this.f3913k4.Y0();
        this.f3903c = 1;
        this.f3925v4 = false;
        this.H4.a(new androidx.lifecycle.s() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.s
            public void f(androidx.lifecycle.v vVar, m.b bVar) {
                View view;
                if (bVar != m.b.ON_STOP || (view = Fragment.this.f3928x4) == null) {
                    return;
                }
                j.a(view);
            }
        });
        this.L4.d(bundle);
        P0(bundle);
        this.E4 = true;
        if (this.f3925v4) {
            this.H4.h(m.b.ON_CREATE);
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onCreate()");
    }

    void v(boolean z10) {
        ViewGroup viewGroup;
        w wVar;
        i iVar = this.A4;
        if (iVar != null) {
            iVar.f3967t = false;
        }
        if (this.f3928x4 == null || (viewGroup = this.f3926w4) == null || (wVar = this.f3911i4) == null) {
            return;
        }
        m0 n10 = m0.n(viewGroup, wVar);
        n10.p();
        if (z10) {
            this.f3912j4.k().post(new e(n10));
        } else {
            n10.g();
        }
    }

    public final String v0(int i10, Object... objArr) {
        return o0().getString(i10, objArr);
    }

    public boolean v1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (!this.f3918p4) {
            if (this.f3923t4 && this.f3924u4) {
                z10 = true;
                S0(menu, menuInflater);
            }
            return z10 | this.f3913k4.E(menu, menuInflater);
        }
        return false;
    }

    public void w1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3913k4.Y0();
        this.f3909g4 = true;
        this.I4 = new j0(this, I());
        View T0 = T0(layoutInflater, viewGroup, bundle);
        this.f3928x4 = T0;
        if (T0 == null) {
            if (this.I4.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.I4 = null;
            return;
        }
        this.I4.b();
        a1.a(this.f3928x4, this.I4);
        b1.a(this.f3928x4, this.I4);
        k1.f.a(this.f3928x4, this.I4);
        this.J4.m(this.I4);
    }

    @Override // androidx.lifecycle.l
    public e1.a x() {
        Application application;
        Context applicationContext = S1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && w.L0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + S1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        e1.d dVar = new e1.d();
        if (application != null) {
            dVar.c(v0.a.f4390e, application);
        }
        dVar.c(androidx.lifecycle.m0.f4345a, this);
        dVar.c(androidx.lifecycle.m0.f4346b, this);
        if (Q() != null) {
            dVar.c(androidx.lifecycle.m0.f4347c, Q());
        }
        return dVar;
    }

    public View x0() {
        return this.f3928x4;
    }

    public void x1() {
        this.f3913k4.F();
        this.H4.h(m.b.ON_DESTROY);
        this.f3903c = 0;
        this.f3925v4 = false;
        this.E4 = false;
        U0();
        if (this.f3925v4) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public androidx.fragment.app.l y() {
        return new f();
    }

    public LiveData<androidx.lifecycle.v> y0() {
        return this.J4;
    }

    public void y1() {
        this.f3913k4.G();
        if (this.f3928x4 != null && this.I4.c().b().b(m.c.CREATED)) {
            this.I4.a(m.b.ON_DESTROY);
        }
        this.f3903c = 1;
        this.f3925v4 = false;
        W0();
        if (this.f3925v4) {
            androidx.loader.app.a.b(this).c();
            this.f3909g4 = false;
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3915m4));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3916n4));
        printWriter.print(" mTag=");
        printWriter.println(this.f3917o4);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3903c);
        printWriter.print(" mWho=");
        printWriter.print(this.U3);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3910h4);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3901a4);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3902b4);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3906d4);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3907e4);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3918p4);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3920q4);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3924u4);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3923t4);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3921r4);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3931z4);
        if (this.f3911i4 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3911i4);
        }
        if (this.f3912j4 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3912j4);
        }
        if (this.f3914l4 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3914l4);
        }
        if (this.V3 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.V3);
        }
        if (this.f3905d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3905d);
        }
        if (this.f3919q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3919q);
        }
        if (this.f3927x != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3927x);
        }
        Fragment w02 = w0(false);
        if (w02 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(w02);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.Y3);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(j0());
        if (V() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(V());
        }
        if (Y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(Y());
        }
        if (k0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(k0());
        }
        if (l0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(l0());
        }
        if (this.f3926w4 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3926w4);
        }
        if (this.f3928x4 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3928x4);
        }
        if (N() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(N());
        }
        if (T() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3913k4 + ":");
        w wVar = this.f3913k4;
        wVar.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void z1() {
        this.f3903c = -1;
        this.f3925v4 = false;
        X0();
        this.D4 = null;
        if (this.f3925v4) {
            if (this.f3913k4.K0()) {
                return;
            }
            this.f3913k4.F();
            this.f3913k4 = new x();
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onDetach()");
    }
}
