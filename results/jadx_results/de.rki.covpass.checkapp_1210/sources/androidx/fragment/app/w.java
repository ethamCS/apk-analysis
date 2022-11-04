package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.lifecycle.m;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import b1.d;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class w {
    private static boolean S = false;
    private androidx.activity.result.c<Intent> D;
    private androidx.activity.result.c<androidx.activity.result.e> E;
    private androidx.activity.result.c<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private z P;
    private d.c Q;

    /* renamed from: b */
    private boolean f4194b;

    /* renamed from: d */
    ArrayList<androidx.fragment.app.a> f4196d;

    /* renamed from: e */
    private ArrayList<Fragment> f4197e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4199g;

    /* renamed from: m */
    private ArrayList<n> f4205m;

    /* renamed from: v */
    private androidx.fragment.app.o<?> f4214v;

    /* renamed from: w */
    private androidx.fragment.app.l f4215w;

    /* renamed from: x */
    private Fragment f4216x;

    /* renamed from: y */
    Fragment f4217y;

    /* renamed from: a */
    private final ArrayList<o> f4193a = new ArrayList<>();

    /* renamed from: c */
    private final e0 f4195c = new e0();

    /* renamed from: f */
    private final androidx.fragment.app.p f4198f = new androidx.fragment.app.p(this);

    /* renamed from: h */
    private final androidx.activity.g f4200h = new b(false);

    /* renamed from: i */
    private final AtomicInteger f4201i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, androidx.fragment.app.c> f4202j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Bundle> f4203k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private final Map<String, Object> f4204l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final q f4206n = new q(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList<a0> f4207o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    private final androidx.core.util.a<Configuration> f4208p = new androidx.core.util.a() { // from class: androidx.fragment.app.r
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.T0((Configuration) obj);
        }
    };

    /* renamed from: q */
    private final androidx.core.util.a<Integer> f4209q = new androidx.core.util.a() { // from class: androidx.fragment.app.u
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.U0((Integer) obj);
        }
    };

    /* renamed from: r */
    private final androidx.core.util.a<androidx.core.app.g> f4210r = new androidx.core.util.a() { // from class: androidx.fragment.app.s
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.V0((androidx.core.app.g) obj);
        }
    };

    /* renamed from: s */
    private final androidx.core.util.a<androidx.core.app.k> f4211s = new androidx.core.util.a() { // from class: androidx.fragment.app.t
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            w.this.W0((androidx.core.app.k) obj);
        }
    };

    /* renamed from: t */
    private final androidx.core.view.l f4212t = new c();

    /* renamed from: u */
    int f4213u = -1;

    /* renamed from: z */
    private androidx.fragment.app.n f4218z = null;
    private androidx.fragment.app.n A = new d();
    private n0 B = null;
    private n0 C = new e();
    ArrayDeque<m> G = new ArrayDeque<>();
    private Runnable R = new f();

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        a() {
            w.this = r1;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = w.this.G.pollFirst();
            if (pollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = pollFirst.f4229c;
                int i11 = pollFirst.f4230d;
                Fragment i12 = w.this.f4195c.i(str);
                if (i12 != null) {
                    i12.j1(i11, strArr, iArr);
                    return;
                }
                sb2 = new StringBuilder();
                sb2.append("Permission request result delivered for unknown Fragment ");
                sb2.append(str);
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.activity.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10) {
            super(z10);
            w.this = r1;
        }

        @Override // androidx.activity.g
        public void b() {
            w.this.H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements androidx.core.view.l {
        c() {
            w.this = r1;
        }

        @Override // androidx.core.view.l
        public boolean a(MenuItem menuItem) {
            return w.this.L(menuItem);
        }

        @Override // androidx.core.view.l
        public void b(Menu menu) {
            w.this.M(menu);
        }

        @Override // androidx.core.view.l
        public void c(Menu menu, MenuInflater menuInflater) {
            w.this.E(menu, menuInflater);
        }

        @Override // androidx.core.view.l
        public void d(Menu menu) {
            w.this.Q(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.n {
        d() {
            w.this = r1;
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return w.this.y0().b(w.this.y0().i(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements n0 {
        e() {
            w.this = r1;
        }

        @Override // androidx.fragment.app.n0
        public m0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
            w.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.c0(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements a0 {

        /* renamed from: c */
        final /* synthetic */ Fragment f4225c;

        g(Fragment fragment) {
            w.this = r1;
            this.f4225c = fragment;
        }

        @Override // androidx.fragment.app.a0
        public void a(w wVar, Fragment fragment) {
            this.f4225c.N0(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        h() {
            w.this = r1;
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = w.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4229c;
            int i10 = pollFirst.f4230d;
            Fragment i11 = w.this.f4195c.i(str);
            if (i11 != null) {
                i11.K0(i10, aVar.c(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        i() {
            w.this = r1;
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = w.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4229c;
            int i10 = pollFirst.f4230d;
            Fragment i11 = w.this.f4195c.i(str);
            if (i11 != null) {
                i11.K0(i10, aVar.c(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    /* loaded from: classes.dex */
    public static class k extends d.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = eVar.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.e()).b(null).c(eVar.d(), eVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (w.L0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public void a(w wVar, Fragment fragment, Bundle bundle) {
        }

        public void b(w wVar, Fragment fragment, Context context) {
        }

        public void c(w wVar, Fragment fragment, Bundle bundle) {
        }

        public void d(w wVar, Fragment fragment) {
        }

        public void e(w wVar, Fragment fragment) {
        }

        public void f(w wVar, Fragment fragment) {
        }

        public void g(w wVar, Fragment fragment, Context context) {
        }

        public void h(w wVar, Fragment fragment, Bundle bundle) {
        }

        public void i(w wVar, Fragment fragment) {
        }

        public void j(w wVar, Fragment fragment, Bundle bundle) {
        }

        public void k(w wVar, Fragment fragment) {
        }

        public void l(w wVar, Fragment fragment) {
        }

        public void m(w wVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(w wVar, Fragment fragment) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: c */
        String f4229c;

        /* renamed from: d */
        int f4230d;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            /* renamed from: b */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(Parcel parcel) {
            this.f4229c = parcel.readString();
            this.f4230d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4229c);
            parcel.writeInt(this.f4230d);
        }
    }

    /* loaded from: classes.dex */
    public interface n {
        void a();
    }

    /* loaded from: classes.dex */
    public interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class p implements o {

        /* renamed from: a */
        final String f4231a;

        /* renamed from: b */
        final int f4232b;

        /* renamed from: c */
        final int f4233c;

        p(String str, int i10, int i11) {
            w.this = r1;
            this.f4231a = str;
            this.f4232b = i10;
            this.f4233c = i11;
        }

        @Override // androidx.fragment.app.w.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = w.this.f4217y;
            if (fragment == null || this.f4232b >= 0 || this.f4231a != null || !fragment.S().e1()) {
                return w.this.i1(arrayList, arrayList2, this.f4231a, this.f4232b, this.f4233c);
            }
            return false;
        }
    }

    private void B1() {
        synchronized (this.f4193a) {
            boolean z10 = true;
            if (!this.f4193a.isEmpty()) {
                this.f4200h.f(true);
                return;
            }
            androidx.activity.g gVar = this.f4200h;
            if (r0() <= 0 || !P0(this.f4216x)) {
                z10 = false;
            }
            gVar.f(z10);
        }
    }

    public static Fragment F0(View view) {
        Object tag = view.getTag(a1.b.a_res_0x7f090101);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean L0(int i10) {
        return S || Log.isLoggable("FragmentManager", i10);
    }

    private boolean M0(Fragment fragment) {
        return (fragment.f3923t4 && fragment.f3924u4) || fragment.f3913k4.q();
    }

    private void N(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.U3))) {
            return;
        }
        fragment.I1();
    }

    private void U(int i10) {
        try {
            this.f4194b = true;
            this.f4195c.d(i10);
            X0(i10, false);
            for (m0 m0Var : v()) {
                m0Var.j();
            }
            this.f4194b = false;
            c0(true);
        } catch (Throwable th2) {
            this.f4194b = false;
            throw th2;
        }
    }

    public /* synthetic */ void U0(Integer num) {
        if (num.intValue() == 80) {
            H();
        }
    }

    public /* synthetic */ void V0(androidx.core.app.g gVar) {
        I(gVar.a());
    }

    public /* synthetic */ void W0(androidx.core.app.k kVar) {
        P(kVar.a());
    }

    private void X() {
        if (this.L) {
            this.L = false;
            y1();
        }
    }

    private void Z() {
        for (m0 m0Var : v()) {
            m0Var.j();
        }
    }

    private void b0(boolean z10) {
        if (!this.f4194b) {
            if (this.f4214v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Looper.myLooper() != this.f4214v.k().getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z10) {
                    r();
                }
                if (this.M != null) {
                    return;
                }
                this.M = new ArrayList<>();
                this.N = new ArrayList<>();
                return;
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.v(-1);
                aVar.A();
            } else {
                aVar.v(1);
                aVar.z();
            }
            i10++;
        }
    }

    private void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f4088r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f4195c.o());
        Fragment C0 = C0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            C0 = !arrayList2.get(i12).booleanValue() ? aVar.B(this.O, C0) : aVar.E(this.O, C0);
            z11 = z11 || aVar.f4079i;
        }
        this.O.clear();
        if (!z10 && this.f4213u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<f0.a> it = arrayList.get(i13).f4073c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f4091b;
                    if (fragment != null && fragment.f3911i4 != null) {
                        this.f4195c.r(x(fragment));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (booleanValue) {
                for (int size = aVar2.f4073c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f4073c.get(size).f4091b;
                    if (fragment2 != null) {
                        x(fragment2).m();
                    }
                }
            } else {
                Iterator<f0.a> it2 = aVar2.f4073c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f4091b;
                    if (fragment3 != null) {
                        x(fragment3).m();
                    }
                }
            }
        }
        X0(this.f4213u, true);
        for (m0 m0Var : w(arrayList, i10, i11)) {
            m0Var.r(booleanValue);
            m0Var.p();
            m0Var.g();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.f3980v >= 0) {
                aVar3.f3980v = -1;
            }
            aVar3.D();
            i10++;
        }
        if (z11) {
            n1();
        }
    }

    private boolean h1(String str, int i10, int i11) {
        c0(false);
        b0(true);
        Fragment fragment = this.f4217y;
        if (fragment == null || i10 >= 0 || str != null || !fragment.S().e1()) {
            boolean i12 = i1(this.M, this.N, str, i10, i11);
            if (i12) {
                this.f4194b = true;
                try {
                    m1(this.M, this.N);
                } finally {
                    s();
                }
            }
            B1();
            X();
            this.f4195c.b();
            return i12;
        }
        return true;
    }

    private int i0(String str, int i10, boolean z10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4196d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (!z10) {
                return this.f4196d.size() - 1;
            }
            return 0;
        }
        int size = this.f4196d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f4196d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f3980v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size != this.f4196d.size() - 1) {
                return size + 1;
            }
            return -1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f4196d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f3980v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public static w m0(View view) {
        Fragment n02 = n0(view);
        if (n02 != null) {
            if (n02.C0()) {
                return n02.S();
            }
            throw new IllegalStateException("The Fragment " + n02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        androidx.fragment.app.j jVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof androidx.fragment.app.j) {
                jVar = (androidx.fragment.app.j) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (jVar != null) {
            return jVar.m0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void m1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f4088r) {
                if (i11 != i10) {
                    f0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4088r) {
                        i11++;
                    }
                }
                f0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 == size) {
            return;
        }
        f0(arrayList, arrayList2, i11, size);
    }

    private static Fragment n0(View view) {
        while (view != null) {
            Fragment F0 = F0(view);
            if (F0 != null) {
                return F0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n1() {
        if (this.f4205m != null) {
            for (int i10 = 0; i10 < this.f4205m.size(); i10++) {
                this.f4205m.get(i10).a();
            }
        }
    }

    private void o0() {
        for (m0 m0Var : v()) {
            m0Var.k();
        }
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4193a) {
            if (this.f4193a.isEmpty()) {
                return false;
            }
            int size = this.f4193a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f4193a.get(i10).a(arrayList, arrayList2);
            }
            this.f4193a.clear();
            this.f4214v.k().removeCallbacks(this.R);
            return z10;
        }
    }

    public static int p1(int i10) {
        if (i10 != 4097) {
            if (i10 == 8194) {
                return 4097;
            }
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            return i10 != 4100 ? 0 : 8197;
        }
        return 8194;
    }

    private void r() {
        if (!R0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void s() {
        this.f4194b = false;
        this.N.clear();
        this.M.clear();
    }

    private z s0(Fragment fragment) {
        return this.P.k(fragment);
    }

    private void t() {
        androidx.fragment.app.o<?> oVar = this.f4214v;
        boolean z10 = true;
        if (oVar instanceof z0) {
            z10 = this.f4195c.p().o();
        } else if (oVar.i() instanceof Activity) {
            z10 = true ^ ((Activity) this.f4214v.i()).isChangingConfigurations();
        }
        if (z10) {
            for (androidx.fragment.app.c cVar : this.f4202j.values()) {
                for (String str : cVar.f3990c) {
                    this.f4195c.p().h(str);
                }
            }
        }
    }

    private Set<m0> v() {
        HashSet hashSet = new HashSet();
        for (d0 d0Var : this.f4195c.k()) {
            ViewGroup viewGroup = d0Var.k().f3926w4;
            if (viewGroup != null) {
                hashSet.add(m0.o(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    private ViewGroup v0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3926w4;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3916n4 > 0 && this.f4215w.e()) {
            View d10 = this.f4215w.d(fragment.f3916n4);
            if (d10 instanceof ViewGroup) {
                return (ViewGroup) d10;
            }
        }
        return null;
    }

    private Set<m0> w(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<f0.a> it = arrayList.get(i10).f4073c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4091b;
                if (fragment != null && (viewGroup = fragment.f3926w4) != null) {
                    hashSet.add(m0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void w1(Fragment fragment) {
        ViewGroup v02 = v0(fragment);
        if (v02 == null || fragment.V() + fragment.Y() + fragment.k0() + fragment.l0() <= 0) {
            return;
        }
        int i10 = a1.b.c_res_0x7f0902b0;
        if (v02.getTag(i10) == null) {
            v02.setTag(i10, fragment);
        }
        ((Fragment) v02.getTag(i10)).f2(fragment.j0());
    }

    private void y1() {
        for (d0 d0Var : this.f4195c.k()) {
            a1(d0Var);
        }
    }

    private void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
        androidx.fragment.app.o<?> oVar = this.f4214v;
        try {
            if (oVar != null) {
                oVar.l("  ", null, printWriter, new String[0]);
            } else {
                Y("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
        }
        throw runtimeException;
    }

    public void A() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(0);
    }

    public q A0() {
        return this.f4206n;
    }

    public void A1(l lVar) {
        this.f4206n.p(lVar);
    }

    /* renamed from: B */
    public void T0(Configuration configuration) {
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.s1(configuration);
            }
        }
    }

    public Fragment B0() {
        return this.f4216x;
    }

    public boolean C(MenuItem menuItem) {
        if (this.f4213u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null && fragment.t1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment C0() {
        return this.f4217y;
    }

    public void D() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(1);
    }

    public n0 D0() {
        n0 n0Var = this.B;
        if (n0Var != null) {
            return n0Var;
        }
        Fragment fragment = this.f4216x;
        return fragment != null ? fragment.f3911i4.D0() : this.C;
    }

    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f4213u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null && O0(fragment) && fragment.v1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f4197e != null) {
            for (int i10 = 0; i10 < this.f4197e.size(); i10++) {
                Fragment fragment2 = this.f4197e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.V0();
                }
            }
        }
        this.f4197e = arrayList;
        return z10;
    }

    public d.c E0() {
        return this.Q;
    }

    public void F() {
        this.K = true;
        c0(true);
        Z();
        t();
        U(-1);
        androidx.fragment.app.o<?> oVar = this.f4214v;
        if (oVar instanceof androidx.core.content.c) {
            ((androidx.core.content.c) oVar).u(this.f4209q);
        }
        androidx.fragment.app.o<?> oVar2 = this.f4214v;
        if (oVar2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) oVar2).Q(this.f4208p);
        }
        androidx.fragment.app.o<?> oVar3 = this.f4214v;
        if (oVar3 instanceof androidx.core.app.i) {
            ((androidx.core.app.i) oVar3).M(this.f4210r);
        }
        androidx.fragment.app.o<?> oVar4 = this.f4214v;
        if (oVar4 instanceof androidx.core.app.j) {
            ((androidx.core.app.j) oVar4).r(this.f4211s);
        }
        androidx.fragment.app.o<?> oVar5 = this.f4214v;
        if (oVar5 instanceof androidx.core.view.i) {
            ((androidx.core.view.i) oVar5).j(this.f4212t);
        }
        this.f4214v = null;
        this.f4215w = null;
        this.f4216x = null;
        if (this.f4199g != null) {
            this.f4200h.d();
            this.f4199g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.D;
        if (cVar != null) {
            cVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public void G() {
        U(1);
    }

    public y0 G0(Fragment fragment) {
        return this.P.n(fragment);
    }

    public void H() {
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.B1();
            }
        }
    }

    void H0() {
        c0(true);
        if (this.f4200h.c()) {
            e1();
        } else {
            this.f4199g.c();
        }
    }

    public void I(boolean z10) {
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.C1(z10);
            }
        }
    }

    public void I0(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f3918p4) {
            fragment.f3918p4 = true;
            fragment.C4 = true ^ fragment.C4;
            w1(fragment);
        }
    }

    public void J(Fragment fragment) {
        Iterator<a0> it = this.f4207o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public void J0(Fragment fragment) {
        if (!fragment.f3901a4 || !M0(fragment)) {
            return;
        }
        this.H = true;
    }

    public void K() {
        for (Fragment fragment : this.f4195c.l()) {
            if (fragment != null) {
                fragment.Z0(fragment.D0());
                fragment.f3913k4.K();
            }
        }
    }

    public boolean K0() {
        return this.K;
    }

    public boolean L(MenuItem menuItem) {
        if (this.f4213u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null && fragment.D1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void M(Menu menu) {
        if (this.f4213u < 1) {
            return;
        }
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.E1(menu);
            }
        }
    }

    public boolean N0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.D0();
    }

    public void O() {
        U(5);
    }

    public boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.F0();
    }

    public void P(boolean z10) {
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.G1(z10);
            }
        }
    }

    public boolean P0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.f3911i4;
        return fragment.equals(wVar.C0()) && P0(wVar.f4216x);
    }

    public boolean Q(Menu menu) {
        boolean z10 = false;
        if (this.f4213u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null && O0(fragment) && fragment.H1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean Q0(int i10) {
        return this.f4213u >= i10;
    }

    public void R() {
        B1();
        N(this.f4217y);
    }

    public boolean R0() {
        return this.I || this.J;
    }

    public void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(7);
    }

    public void T() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(5);
    }

    public void V() {
        this.J = true;
        this.P.q(true);
        U(4);
    }

    public void W() {
        U(2);
    }

    void X0(int i10, boolean z10) {
        androidx.fragment.app.o<?> oVar;
        if (this.f4214v != null || i10 == -1) {
            if (!z10 && i10 == this.f4213u) {
                return;
            }
            this.f4213u = i10;
            this.f4195c.t();
            y1();
            if (!this.H || (oVar = this.f4214v) == null || this.f4213u != 7) {
                return;
            }
            oVar.q();
            this.H = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4195c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4197e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f4197e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f4196d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f4196d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4201i.get());
        synchronized (this.f4193a) {
            int size3 = this.f4193a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f4193a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4214v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4215w);
        if (this.f4216x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4216x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4213u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public void Y0() {
        if (this.f4214v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.f4195c.o()) {
            if (fragment != null) {
                fragment.I0();
            }
        }
    }

    public void Z0(FragmentContainerView fragmentContainerView) {
        View view;
        for (d0 d0Var : this.f4195c.k()) {
            Fragment k10 = d0Var.k();
            if (k10.f3916n4 == fragmentContainerView.getId() && (view = k10.f3928x4) != null && view.getParent() == null) {
                k10.f3926w4 = fragmentContainerView;
                d0Var.b();
            }
        }
    }

    public void a0(o oVar, boolean z10) {
        if (!z10) {
            if (this.f4214v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f4193a) {
            if (this.f4214v == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f4193a.add(oVar);
            s1();
        }
    }

    void a1(d0 d0Var) {
        Fragment k10 = d0Var.k();
        if (k10.f3930y4) {
            if (this.f4194b) {
                this.L = true;
                return;
            }
            k10.f3930y4 = false;
            d0Var.m();
        }
    }

    public void b1() {
        a0(new p(null, -1, 0), false);
    }

    public boolean c0(boolean z10) {
        b0(z10);
        boolean z11 = false;
        while (p0(this.M, this.N)) {
            this.f4194b = true;
            try {
                m1(this.M, this.N);
                s();
                z11 = true;
            } catch (Throwable th2) {
                s();
                throw th2;
            }
        }
        B1();
        X();
        this.f4195c.b();
        return z11;
    }

    public void c1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            a0(new p(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void d0(o oVar, boolean z10) {
        if (!z10 || (this.f4214v != null && !this.K)) {
            b0(z10);
            if (oVar.a(this.M, this.N)) {
                this.f4194b = true;
                try {
                    m1(this.M, this.N);
                } finally {
                    s();
                }
            }
            B1();
            X();
            this.f4195c.b();
        }
    }

    public void d1(String str, int i10) {
        a0(new p(str, -1, i10), false);
    }

    public boolean e1() {
        return h1(null, -1, 0);
    }

    public boolean f1(int i10, int i11) {
        if (i10 >= 0) {
            return h1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean g0() {
        boolean c02 = c0(true);
        o0();
        return c02;
    }

    public boolean g1(String str, int i10) {
        return h1(str, -1, i10);
    }

    public Fragment h0(String str) {
        return this.f4195c.f(str);
    }

    public void i(androidx.fragment.app.a aVar) {
        if (this.f4196d == null) {
            this.f4196d = new ArrayList<>();
        }
        this.f4196d.add(aVar);
    }

    boolean i1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i02 = i0(str, i10, (i11 & 1) != 0);
        if (i02 < 0) {
            return false;
        }
        for (int size = this.f4196d.size() - 1; size >= i02; size--) {
            arrayList.add(this.f4196d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public d0 j(Fragment fragment) {
        String str = fragment.F4;
        if (str != null) {
            b1.d.h(fragment, str);
        }
        if (L0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        d0 x10 = x(fragment);
        fragment.f3911i4 = this;
        this.f4195c.r(x10);
        if (!fragment.f3920q4) {
            this.f4195c.a(fragment);
            fragment.f3902b4 = false;
            if (fragment.f3928x4 == null) {
                fragment.C4 = false;
            }
            if (M0(fragment)) {
                this.H = true;
            }
        }
        return x10;
    }

    public Fragment j0(int i10) {
        return this.f4195c.g(i10);
    }

    public void j1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f3911i4 != this) {
            z1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.U3);
    }

    public void k(a0 a0Var) {
        this.f4207o.add(a0Var);
    }

    public Fragment k0(String str) {
        return this.f4195c.h(str);
    }

    public void k1(l lVar, boolean z10) {
        this.f4206n.o(lVar, z10);
    }

    public void l(n nVar) {
        if (this.f4205m == null) {
            this.f4205m = new ArrayList<>();
        }
        this.f4205m.add(nVar);
    }

    public Fragment l0(String str) {
        return this.f4195c.i(str);
    }

    public void l1(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3910h4);
        }
        boolean z10 = !fragment.E0();
        if (!fragment.f3920q4 || z10) {
            this.f4195c.u(fragment);
            if (M0(fragment)) {
                this.H = true;
            }
            fragment.f3902b4 = true;
            w1(fragment);
        }
    }

    public int m() {
        return this.f4201i.getAndIncrement();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(androidx.fragment.app.o<?> r4, androidx.fragment.app.l r5, androidx.fragment.app.Fragment r6) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.n(androidx.fragment.app.o, androidx.fragment.app.l, androidx.fragment.app.Fragment):void");
    }

    public void o(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3920q4) {
            fragment.f3920q4 = false;
            if (fragment.f3901a4) {
                return;
            }
            this.f4195c.a(fragment);
            if (L0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (!M0(fragment)) {
                return;
            }
            this.H = true;
        }
    }

    public void o1(Parcelable parcelable) {
        d0 d0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4214v.i().getClassLoader());
                this.f4203k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<c0> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4214v.i().getClassLoader());
                arrayList.add((c0) bundle.getParcelable("state"));
            }
        }
        this.f4195c.x(arrayList);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f4195c.v();
        Iterator<String> it = yVar.f4235c.iterator();
        while (it.hasNext()) {
            c0 B = this.f4195c.B(it.next(), null);
            if (B != null) {
                Fragment j10 = this.P.j(B.f3995d);
                if (j10 != null) {
                    if (L0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j10);
                    }
                    d0Var = new d0(this.f4206n, this.f4195c, j10, B);
                } else {
                    d0Var = new d0(this.f4206n, this.f4195c, this.f4214v.i().getClassLoader(), w0(), B);
                }
                Fragment k10 = d0Var.k();
                k10.f3911i4 = this;
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.U3 + "): " + k10);
                }
                d0Var.o(this.f4214v.i().getClassLoader());
                this.f4195c.r(d0Var);
                d0Var.u(this.f4213u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.f4195c.c(fragment.U3)) {
                if (L0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + yVar.f4235c);
                }
                this.P.p(fragment);
                fragment.f3911i4 = this;
                d0 d0Var2 = new d0(this.f4206n, this.f4195c, fragment);
                d0Var2.u(1);
                d0Var2.m();
                fragment.f3902b4 = true;
                d0Var2.m();
            }
        }
        this.f4195c.w(yVar.f4236d);
        if (yVar.f4237q != null) {
            this.f4196d = new ArrayList<>(yVar.f4237q.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = yVar.f4237q;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a c10 = bVarArr[i10].c(this);
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c10.f3980v + "): " + c10);
                    PrintWriter printWriter = new PrintWriter(new l0("FragmentManager"));
                    c10.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4196d.add(c10);
                i10++;
            }
        } else {
            this.f4196d = null;
        }
        this.f4201i.set(yVar.f4238x);
        String str3 = yVar.f4239y;
        if (str3 != null) {
            Fragment h02 = h0(str3);
            this.f4217y = h02;
            N(h02);
        }
        ArrayList<String> arrayList2 = yVar.U3;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                this.f4202j.put(arrayList2.get(i11), yVar.V3.get(i11));
            }
        }
        this.G = new ArrayDeque<>(yVar.W3);
    }

    public f0 p() {
        return new androidx.fragment.app.a(this);
    }

    boolean q() {
        boolean z10 = false;
        for (Fragment fragment : this.f4195c.l()) {
            if (fragment != null) {
                z10 = M0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public j q0(int i10) {
        return this.f4196d.get(i10);
    }

    /* renamed from: q1 */
    public Bundle S0() {
        int size;
        Bundle bundle = new Bundle();
        o0();
        Z();
        c0(true);
        this.I = true;
        this.P.q(true);
        ArrayList<String> y10 = this.f4195c.y();
        ArrayList<c0> m10 = this.f4195c.m();
        if (!m10.isEmpty()) {
            ArrayList<String> z10 = this.f4195c.z();
            androidx.fragment.app.b[] bVarArr = null;
            ArrayList<androidx.fragment.app.a> arrayList = this.f4196d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b(this.f4196d.get(i10));
                    if (L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f4196d.get(i10));
                    }
                }
            }
            y yVar = new y();
            yVar.f4235c = y10;
            yVar.f4236d = z10;
            yVar.f4237q = bVarArr;
            yVar.f4238x = this.f4201i.get();
            Fragment fragment = this.f4217y;
            if (fragment != null) {
                yVar.f4239y = fragment.U3;
            }
            yVar.U3.addAll(this.f4202j.keySet());
            yVar.V3.addAll(this.f4202j.values());
            yVar.W3 = new ArrayList<>(this.G);
            bundle.putParcelable("state", yVar);
            for (String str : this.f4203k.keySet()) {
                bundle.putBundle("result_" + str, this.f4203k.get(str));
            }
            Iterator<c0> it = m10.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.f3995d, bundle2);
            }
        } else if (L0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public int r0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4196d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Fragment.m r1(Fragment fragment) {
        d0 n10 = this.f4195c.n(fragment.U3);
        if (n10 == null || !n10.k().equals(fragment)) {
            z1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n10.r();
    }

    void s1() {
        synchronized (this.f4193a) {
            boolean z10 = true;
            if (this.f4193a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f4214v.k().removeCallbacks(this.R);
                this.f4214v.k().post(this.R);
                B1();
            }
        }
    }

    public androidx.fragment.app.l t0() {
        return this.f4215w;
    }

    public void t1(Fragment fragment, boolean z10) {
        ViewGroup v02 = v0(fragment);
        if (v02 == null || !(v02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) v02).setDrawDisappearingViewsLast(!z10);
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4216x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4216x;
        } else {
            androidx.fragment.app.o<?> oVar = this.f4214v;
            if (oVar == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(oVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4214v;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(String str) {
        this.f4203k.remove(str);
        if (L0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public Fragment u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment h02 = h0(string);
        if (h02 == null) {
            z1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return h02;
    }

    public void u1(Fragment fragment, m.c cVar) {
        if (fragment.equals(h0(fragment.U3)) && (fragment.f3912j4 == null || fragment.f3911i4 == this)) {
            fragment.G4 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void v1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.U3)) && (fragment.f3912j4 == null || fragment.f3911i4 == this))) {
            Fragment fragment2 = this.f4217y;
            this.f4217y = fragment;
            N(fragment2);
            N(this.f4217y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public androidx.fragment.app.n w0() {
        androidx.fragment.app.n nVar = this.f4218z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f4216x;
        return fragment != null ? fragment.f3911i4.w0() : this.A;
    }

    public d0 x(Fragment fragment) {
        d0 n10 = this.f4195c.n(fragment.U3);
        if (n10 != null) {
            return n10;
        }
        d0 d0Var = new d0(this.f4206n, this.f4195c, fragment);
        d0Var.o(this.f4214v.i().getClassLoader());
        d0Var.u(this.f4213u);
        return d0Var;
    }

    public List<Fragment> x0() {
        return this.f4195c.o();
    }

    public void x1(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3918p4) {
            fragment.f3918p4 = false;
            fragment.C4 = !fragment.C4;
        }
    }

    public void y(Fragment fragment) {
        if (L0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f3920q4) {
            fragment.f3920q4 = true;
            if (!fragment.f3901a4) {
                return;
            }
            if (L0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4195c.u(fragment);
            if (M0(fragment)) {
                this.H = true;
            }
            w1(fragment);
        }
    }

    public androidx.fragment.app.o<?> y0() {
        return this.f4214v;
    }

    public void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(4);
    }

    public LayoutInflater.Factory2 z0() {
        return this.f4198f;
    }
}
