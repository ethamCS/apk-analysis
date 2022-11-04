package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.u;
import androidx.lifecycle.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class m {
    private static boolean F = false;
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<j> C;
    private p D;

    /* renamed from: b */
    private boolean f1075b;

    /* renamed from: d */
    ArrayList<androidx.fragment.app.a> f1077d;

    /* renamed from: e */
    private ArrayList<Fragment> f1078e;

    /* renamed from: g */
    private OnBackPressedDispatcher f1080g;
    private ArrayList<g> j;
    androidx.fragment.app.j<?> o;
    androidx.fragment.app.f p;
    private Fragment q;
    Fragment r;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<androidx.fragment.app.a> z;

    /* renamed from: a */
    private final ArrayList<h> f1074a = new ArrayList<>();

    /* renamed from: c */
    private final s f1076c = new s();

    /* renamed from: f */
    private final k f1079f = new k(this);

    /* renamed from: h */
    private final androidx.activity.b f1081h = new a(false);
    private final AtomicInteger i = new AtomicInteger();
    private ConcurrentHashMap<Fragment, HashSet<b.g.h.a>> k = new ConcurrentHashMap<>();
    private final u.g l = new b();
    private final l m = new l(this);
    int n = -1;
    private androidx.fragment.app.i s = null;
    private androidx.fragment.app.i t = new c();
    private Runnable E = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(z);
            m.this = r1;
        }

        @Override // androidx.activity.b
        public void b() {
            m.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements u.g {
        b() {
            m.this = r1;
        }

        @Override // androidx.fragment.app.u.g
        public void a(Fragment fragment, b.g.h.a aVar) {
            if (!aVar.b()) {
                m.this.J0(fragment, aVar);
            }
        }

        @Override // androidx.fragment.app.u.g
        public void b(Fragment fragment, b.g.h.a aVar) {
            m.this.c(fragment, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.fragment.app.i {
        c() {
            m.this = r1;
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.j<?> jVar = m.this.o;
            return jVar.b(jVar.i(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            m.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.Q(true);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1086a;

        /* renamed from: b */
        final /* synthetic */ View f1087b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1088c;

        e(m mVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1086a = viewGroup;
            this.f1087b = view;
            this.f1088c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1086a.endViewTransition(this.f1087b);
            animator.removeListener(this);
            Fragment fragment = this.f1088c;
            View view = fragment.H;
            if (view == null || !fragment.z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract void a(m mVar, Fragment fragment, Bundle bundle);

        public abstract void b(m mVar, Fragment fragment, Context context);

        public abstract void c(m mVar, Fragment fragment, Bundle bundle);

        public abstract void d(m mVar, Fragment fragment);

        public abstract void e(m mVar, Fragment fragment);

        public abstract void f(m mVar, Fragment fragment);

        public abstract void g(m mVar, Fragment fragment, Context context);

        public abstract void h(m mVar, Fragment fragment, Bundle bundle);

        public abstract void i(m mVar, Fragment fragment);

        public abstract void j(m mVar, Fragment fragment, Bundle bundle);

        public abstract void k(m mVar, Fragment fragment);

        public abstract void l(m mVar, Fragment fragment);

        public abstract void m(m mVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(m mVar, Fragment fragment);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i implements h {

        /* renamed from: a */
        final String f1089a;

        /* renamed from: b */
        final int f1090b;

        /* renamed from: c */
        final int f1091c;

        i(String str, int i, int i2) {
            m.this = r1;
            this.f1089a = str;
            this.f1090b = i;
            this.f1091c = i2;
        }

        @Override // androidx.fragment.app.m.h
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = m.this.r;
            if (fragment == null || this.f1090b >= 0 || this.f1089a != null || !fragment.s().F0()) {
                return m.this.H0(arrayList, arrayList2, this.f1089a, this.f1090b, this.f1091c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Fragment.e {

        /* renamed from: a */
        final boolean f1093a;

        /* renamed from: b */
        final androidx.fragment.app.a f1094b;

        /* renamed from: c */
        private int f1095c;

        j(androidx.fragment.app.a aVar, boolean z) {
            this.f1093a = z;
            this.f1094b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void a() {
            int i = this.f1095c - 1;
            this.f1095c = i;
            if (i != 0) {
                return;
            }
            this.f1094b.r.R0();
        }

        @Override // androidx.fragment.app.Fragment.e
        public void b() {
            this.f1095c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.f1094b;
            aVar.r.n(aVar, this.f1093a, false, false);
        }

        void d() {
            boolean z = this.f1095c > 0;
            for (Fragment fragment : this.f1094b.r.f0()) {
                fragment.t1(null);
                if (z && fragment.X()) {
                    fragment.y1();
                }
            }
            androidx.fragment.app.a aVar = this.f1094b;
            aVar.r.n(aVar, this.f1093a, !z, true);
        }

        public boolean e() {
            return this.f1095c == 0;
        }
    }

    private void C(Fragment fragment) {
        if (fragment == null || !fragment.equals(V(fragment.f1016f))) {
            return;
        }
        fragment.b1();
    }

    private boolean G0(String str, int i2, int i3) {
        Q(false);
        P(true);
        Fragment fragment = this.r;
        if (fragment == null || i2 >= 0 || str != null || !fragment.s().F0()) {
            boolean H0 = H0(this.z, this.A, str, i2, i3);
            if (H0) {
                this.f1075b = true;
                try {
                    L0(this.z, this.A);
                } finally {
                    m();
                }
            }
            Y0();
            L();
            this.f1076c.b();
            return H0;
        }
        return true;
    }

    private int I0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, b.d.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.E() && !aVar.C(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.C.add(jVar);
                aVar.G(jVar);
                if (booleanValue) {
                    aVar.x();
                } else {
                    aVar.y(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    private void J(int i2) {
        try {
            this.f1075b = true;
            this.f1076c.d(i2);
            y0(i2, false);
            this.f1075b = false;
            Q(true);
        } catch (Throwable th) {
            this.f1075b = false;
            throw th;
        }
    }

    private void L() {
        if (this.y) {
            this.y = false;
            X0();
        }
    }

    private void L0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        U(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    T(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                T(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 == size) {
            return;
        }
        T(arrayList, arrayList2, i3, size);
    }

    private void N() {
        if (!this.k.isEmpty()) {
            for (Fragment fragment : this.k.keySet()) {
                j(fragment);
                A0(fragment, fragment.M());
            }
        }
    }

    private void N0() {
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).a();
            }
        }
    }

    private void P(boolean z) {
        if (!this.f1075b) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Looper.myLooper() != this.o.j().getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z) {
                    l();
                }
                if (this.z == null) {
                    this.z = new ArrayList<>();
                    this.A = new ArrayList<>();
                }
                this.f1075b = true;
                try {
                    U(null, null);
                    return;
                } finally {
                    this.f1075b = false;
                }
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public static int P0(int i2) {
        if (i2 != 4097) {
            if (i2 == 4099) {
                return 4099;
            }
            return i2 != 8194 ? 0 : 4097;
        }
        return 8194;
    }

    private static void S(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.t(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                aVar.y(z);
            } else {
                aVar.t(1);
                aVar.x();
            }
            i2++;
        }
    }

    private void T(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5 = i2;
        boolean z = arrayList.get(i5).p;
        ArrayList<Fragment> arrayList3 = this.B;
        if (arrayList3 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.B.addAll(this.f1076c.m());
        Fragment j0 = j0();
        boolean z2 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            j0 = !arrayList2.get(i6).booleanValue() ? aVar.z(this.B, j0) : aVar.H(this.B, j0);
            z2 = z2 || aVar.f1127g;
        }
        this.B.clear();
        if (!z) {
            u.C(this, arrayList, arrayList2, i2, i3, false, this.l);
        }
        S(arrayList, arrayList2, i2, i3);
        if (z) {
            b.d.b<Fragment> bVar = new b.d.b<>();
            a(bVar);
            int I0 = I0(arrayList, arrayList2, i2, i3, bVar);
            w0(bVar);
            i4 = I0;
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z) {
            u.C(this, arrayList, arrayList2, i2, i4, true, this.l);
            y0(this.n, true);
        }
        while (i5 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && aVar2.t >= 0) {
                aVar2.t = -1;
            }
            aVar2.F();
            i5++;
        }
        if (z2) {
            N0();
        }
    }

    private void U(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.C.get(i2);
            if (arrayList == null || jVar.f1093a || (indexOf2 = arrayList.indexOf(jVar.f1094b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.e() || (arrayList != null && jVar.f1094b.C(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.f1093a || (indexOf = arrayList.indexOf(jVar.f1094b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.d();
                    }
                }
                i2++;
            } else {
                this.C.remove(i2);
                i2--;
                size--;
            }
            jVar.c();
            i2++;
        }
    }

    private void V0(Fragment fragment) {
        ViewGroup d0 = d0(fragment);
        if (d0 != null) {
            int i2 = b.k.b.b_res_0x7f0901f6;
            if (d0.getTag(i2) == null) {
                d0.setTag(i2, fragment);
            }
            ((Fragment) d0.getTag(i2)).r1(fragment.C());
        }
    }

    private void X0() {
        for (Fragment fragment : this.f1076c.k()) {
            if (fragment != null) {
                C0(fragment);
            }
        }
    }

    private void Y0() {
        synchronized (this.f1074a) {
            boolean z = true;
            if (!this.f1074a.isEmpty()) {
                this.f1081h.f(true);
                return;
            }
            androidx.activity.b bVar = this.f1081h;
            if (b0() <= 0 || !r0(this.q)) {
                z = false;
            }
            bVar.f(z);
        }
    }

    private void Z() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private void a(b.d.b<Fragment> bVar) {
        int i2 = this.n;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment.f1012b < min) {
                A0(fragment, min);
                if (fragment.H != null && !fragment.z && fragment.L) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private boolean a0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1074a) {
            if (this.f1074a.isEmpty()) {
                return false;
            }
            int size = this.f1074a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.f1074a.get(i2).a(arrayList, arrayList2);
            }
            this.f1074a.clear();
            this.o.j().removeCallbacks(this.E);
            return z;
        }
    }

    private p c0(Fragment fragment) {
        return this.D.h(fragment);
    }

    private ViewGroup d0(Fragment fragment) {
        if (fragment.x > 0 && this.p.f()) {
            View e2 = this.p.e(fragment.x);
            if (e2 instanceof ViewGroup) {
                return (ViewGroup) e2;
            }
        }
        return null;
    }

    private void j(Fragment fragment) {
        HashSet<b.g.h.a> hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator<b.g.h.a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            p(fragment);
            this.k.remove(fragment);
        }
    }

    public static Fragment k0(View view) {
        Object tag = view.getTag(b.k.b.a_res_0x7f0900d3);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void l() {
        if (!t0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void m() {
        this.f1075b = false;
        this.A.clear();
        this.z.clear();
    }

    private void o(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            e.d b2 = androidx.fragment.app.e.b(this.o.i(), this.p, fragment, !fragment.z);
            if (b2 == null || (animator = b2.f1054b) == null) {
                if (b2 != null) {
                    fragment.H.startAnimation(b2.f1053a);
                    b2.f1053a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.V()) ? 0 : 8);
                if (fragment.V()) {
                    fragment.q1(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.V()) {
                    fragment.q1(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    b2.f1054b.addListener(new e(this, viewGroup, view, fragment));
                }
                b2.f1054b.start();
            }
        }
        if (fragment.l && q0(fragment)) {
            this.u = true;
        }
        fragment.M = false;
        fragment.s0(fragment.z);
    }

    private void p(Fragment fragment) {
        fragment.R0();
        this.m.n(fragment, false);
        fragment.G = null;
        fragment.H = null;
        fragment.S = null;
        fragment.T.h(null);
        fragment.o = false;
    }

    public static boolean p0(int i2) {
        return F || Log.isLoggable("FragmentManager", i2);
    }

    private boolean q0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.k();
    }

    private void v0(r rVar) {
        Fragment i2 = rVar.i();
        if (!this.f1076c.c(i2.f1016f)) {
            return;
        }
        if (p0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + i2);
        }
        this.f1076c.o(rVar);
        M0(i2);
    }

    private void w0(b.d.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment h2 = bVar.h(i2);
            if (!h2.l) {
                View j1 = h2.j1();
                h2.N = j1.getAlpha();
                j1.setAlpha(0.0f);
            }
        }
    }

    public boolean A(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null && fragment.W0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r2 != 3) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.A0(androidx.fragment.app.Fragment, int):void");
    }

    public void B(Menu menu) {
        if (this.n < 1) {
            return;
        }
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.X0(menu);
            }
        }
    }

    public void B0() {
        if (this.o == null) {
            return;
        }
        this.v = false;
        this.w = false;
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.b0();
            }
        }
    }

    void C0(Fragment fragment) {
        if (fragment.I) {
            if (this.f1075b) {
                this.y = true;
                return;
            }
            fragment.I = false;
            A0(fragment, this.n);
        }
    }

    public void D() {
        J(3);
    }

    public void D0(int i2, int i3) {
        if (i2 >= 0) {
            O(new i(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void E(boolean z) {
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.Z0(z);
            }
        }
    }

    public void E0(String str, int i2) {
        O(new i(str, -1, i2), false);
    }

    public boolean F(Menu menu) {
        boolean z = false;
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null && fragment.a1(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean F0() {
        return G0(null, -1, 0);
    }

    public void G() {
        Y0();
        C(this.r);
    }

    public void H() {
        this.v = false;
        this.w = false;
        J(4);
    }

    boolean H0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1077d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1077d.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1077d.get(size2);
                    if ((str != null && str.equals(aVar.A())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1077d.get(size2);
                        if (str == null || !str.equals(aVar2.A())) {
                            if (i2 < 0 || i2 != aVar2.t) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1077d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1077d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1077d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    public void I() {
        this.v = false;
        this.w = false;
        J(3);
    }

    void J0(Fragment fragment, b.g.h.a aVar) {
        HashSet<b.g.h.a> hashSet = this.k.get(fragment);
        if (hashSet == null || !hashSet.remove(aVar) || !hashSet.isEmpty()) {
            return;
        }
        this.k.remove(fragment);
        if (fragment.f1012b >= 3) {
            return;
        }
        p(fragment);
        A0(fragment, fragment.M());
    }

    public void K() {
        this.w = true;
        J(2);
    }

    public void K0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.W();
        if (!fragment.A || z) {
            this.f1076c.p(fragment);
            if (q0(fragment)) {
                this.u = true;
            }
            fragment.m = true;
            V0(fragment);
        }
    }

    public void M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1076c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1078e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1078e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1077d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.f1077d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1074a) {
            int size3 = this.f1074a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f1074a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    void M0(Fragment fragment) {
        if (t0()) {
            if (!p0(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        } else if (!this.D.m(fragment) || !p0(2)) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void O(h hVar, boolean z) {
        if (!z) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            l();
        }
        synchronized (this.f1074a) {
            if (this.o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f1074a.add(hVar);
            R0();
        }
    }

    public void O0(Parcelable parcelable) {
        r rVar;
        if (parcelable == null) {
            return;
        }
        o oVar = (o) parcelable;
        if (oVar.f1096b == null) {
            return;
        }
        this.f1076c.q();
        Iterator<q> it = oVar.f1096b.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (next != null) {
                Fragment g2 = this.D.g(next.f1109c);
                if (g2 != null) {
                    if (p0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g2);
                    }
                    rVar = new r(this.m, g2, next);
                } else {
                    rVar = new r(this.m, this.o.i().getClassLoader(), e0(), next);
                }
                Fragment i2 = rVar.i();
                i2.s = this;
                if (p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + i2.f1016f + "): " + i2);
                }
                rVar.k(this.o.i().getClassLoader());
                this.f1076c.n(rVar);
                rVar.q(this.n);
            }
        }
        for (Fragment fragment : this.D.j()) {
            if (!this.f1076c.c(fragment.f1016f)) {
                if (p0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + oVar.f1096b);
                }
                A0(fragment, 1);
                fragment.m = true;
                A0(fragment, -1);
            }
        }
        this.f1076c.r(oVar.f1097c);
        if (oVar.f1098d != null) {
            this.f1077d = new ArrayList<>(oVar.f1098d.length);
            int i3 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = oVar.f1098d;
                if (i3 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a2 = bVarArr[i3].a(this);
                if (p0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a2.t + "): " + a2);
                    PrintWriter printWriter = new PrintWriter(new b.g.k.b("FragmentManager"));
                    a2.w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1077d.add(a2);
                i3++;
            }
        } else {
            this.f1077d = null;
        }
        this.i.set(oVar.f1099e);
        String str = oVar.f1100f;
        if (str == null) {
            return;
        }
        Fragment V = V(str);
        this.r = V;
        C(V);
    }

    public boolean Q(boolean z) {
        P(z);
        boolean z2 = false;
        while (a0(this.z, this.A)) {
            this.f1075b = true;
            try {
                L0(this.z, this.A);
                m();
                z2 = true;
            } catch (Throwable th) {
                m();
                throw th;
            }
        }
        Y0();
        L();
        this.f1076c.b();
        return z2;
    }

    public Parcelable Q0() {
        int size;
        Z();
        N();
        Q(true);
        this.v = true;
        ArrayList<q> s = this.f1076c.s();
        androidx.fragment.app.b[] bVarArr = null;
        if (s.isEmpty()) {
            if (p0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t = this.f1076c.t();
        ArrayList<androidx.fragment.app.a> arrayList = this.f1077d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.f1077d.get(i2));
                if (p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1077d.get(i2));
                }
            }
        }
        o oVar = new o();
        oVar.f1096b = s;
        oVar.f1097c = t;
        oVar.f1098d = bVarArr;
        oVar.f1099e = this.i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            oVar.f1100f = fragment.f1016f;
        }
        return oVar;
    }

    public void R(h hVar, boolean z) {
        if (!z || (this.o != null && !this.x)) {
            P(z);
            if (hVar.a(this.z, this.A)) {
                this.f1075b = true;
                try {
                    L0(this.z, this.A);
                } finally {
                    m();
                }
            }
            Y0();
            L();
            this.f1076c.b();
        }
    }

    void R0() {
        synchronized (this.f1074a) {
            ArrayList<j> arrayList = this.C;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f1074a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.o.j().removeCallbacks(this.E);
                this.o.j().post(this.E);
                Y0();
            }
        }
    }

    public void S0(Fragment fragment, boolean z) {
        ViewGroup d0 = d0(fragment);
        if (d0 == null || !(d0 instanceof androidx.fragment.app.g)) {
            return;
        }
        ((androidx.fragment.app.g) d0).setDrawDisappearingViewsLast(!z);
    }

    public void T0(Fragment fragment, e.b bVar) {
        if (fragment.equals(V(fragment.f1016f)) && (fragment.t == null || fragment.s == this)) {
            fragment.Q = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void U0(Fragment fragment) {
        if (fragment == null || (fragment.equals(V(fragment.f1016f)) && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            C(fragment2);
            C(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public Fragment V(String str) {
        return this.f1076c.f(str);
    }

    public Fragment W(int i2) {
        return this.f1076c.g(i2);
    }

    public void W0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.M = !fragment.M;
        }
    }

    public Fragment X(String str) {
        return this.f1076c.h(str);
    }

    public Fragment Y(String str) {
        return this.f1076c.i(str);
    }

    public void b(androidx.fragment.app.a aVar) {
        if (this.f1077d == null) {
            this.f1077d = new ArrayList<>();
        }
        this.f1077d.add(aVar);
    }

    public int b0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1077d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void c(Fragment fragment, b.g.h.a aVar) {
        if (this.k.get(fragment) == null) {
            this.k.put(fragment, new HashSet<>());
        }
        this.k.get(fragment).add(aVar);
    }

    public void d(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u0(fragment);
        if (!fragment.A) {
            this.f1076c.a(fragment);
            fragment.m = false;
            if (fragment.H == null) {
                fragment.M = false;
            }
            if (!q0(fragment)) {
                return;
            }
            this.u = true;
        }
    }

    void e(Fragment fragment) {
        if (t0()) {
            if (!p0(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        } else if (!this.D.e(fragment) || !p0(2)) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public androidx.fragment.app.i e0() {
        androidx.fragment.app.i iVar = this.s;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.q;
        return fragment != null ? fragment.s.e0() : this.t;
    }

    public int f() {
        return this.i.getAndIncrement();
    }

    public List<Fragment> f0() {
        return this.f1076c.m();
    }

    public void g(androidx.fragment.app.j<?> jVar, androidx.fragment.app.f fVar, Fragment fragment) {
        if (this.o == null) {
            this.o = jVar;
            this.p = fVar;
            this.q = fragment;
            if (fragment != null) {
                Y0();
            }
            if (jVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) jVar;
                OnBackPressedDispatcher c2 = cVar.c();
                this.f1080g = c2;
                androidx.lifecycle.i iVar = cVar;
                if (fragment != null) {
                    iVar = fragment;
                }
                c2.a(iVar, this.f1081h);
            }
            this.D = fragment != null ? fragment.s.c0(fragment) : jVar instanceof androidx.lifecycle.w ? p.i(((androidx.lifecycle.w) jVar).h()) : new p(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public LayoutInflater.Factory2 g0() {
        return this.f1079f;
    }

    public void h(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            this.f1076c.a(fragment);
            if (p0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (!q0(fragment)) {
                return;
            }
            this.u = true;
        }
    }

    public l h0() {
        return this.m;
    }

    public t i() {
        return new androidx.fragment.app.a(this);
    }

    public Fragment i0() {
        return this.q;
    }

    public Fragment j0() {
        return this.r;
    }

    boolean k() {
        boolean z = false;
        for (Fragment fragment : this.f1076c.k()) {
            if (fragment != null) {
                z = q0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public androidx.lifecycle.v l0(Fragment fragment) {
        return this.D.k(fragment);
    }

    void m0() {
        Q(true);
        if (this.f1081h.c()) {
            F0();
        } else {
            this.f1080g.c();
        }
    }

    void n(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.y(z3);
        } else {
            aVar.x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            u.C(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z3) {
            y0(this.n, true);
        }
        for (Fragment fragment : this.f1076c.k()) {
            if (fragment != null && fragment.H != null && fragment.L && aVar.B(fragment.x)) {
                float f2 = fragment.N;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.N = 0.0f;
                } else {
                    fragment.N = -1.0f;
                    fragment.L = false;
                }
            }
        }
    }

    public void n0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            fragment.M = true ^ fragment.M;
            V0(fragment);
        }
    }

    public boolean o0() {
        return this.x;
    }

    public void q(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (!fragment.l) {
                return;
            }
            if (p0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1076c.p(fragment);
            if (q0(fragment)) {
                this.u = true;
            }
            V0(fragment);
        }
    }

    public void r() {
        this.v = false;
        this.w = false;
        J(2);
    }

    public boolean r0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        m mVar = fragment.s;
        return fragment.equals(mVar.j0()) && r0(mVar.q);
    }

    public void s(Configuration configuration) {
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.L0(configuration);
            }
        }
    }

    public boolean s0(int i2) {
        return this.n >= i2;
    }

    public boolean t(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null && fragment.M0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean t0() {
        return this.v || this.w;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.q;
        } else {
            androidx.fragment.app.j<?> jVar = this.o;
            if (jVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(jVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.o;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u() {
        this.v = false;
        this.w = false;
        J(1);
    }

    public void u0(Fragment fragment) {
        if (this.f1076c.c(fragment.f1016f)) {
            return;
        }
        r rVar = new r(this.m, fragment);
        rVar.k(this.o.i().getClassLoader());
        this.f1076c.n(rVar);
        if (fragment.C) {
            if (fragment.B) {
                e(fragment);
            } else {
                M0(fragment);
            }
            fragment.C = false;
        }
        rVar.q(this.n);
        if (!p0(2)) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + fragment);
    }

    public boolean v(Menu menu, MenuInflater menuInflater) {
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null && fragment.O0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1078e != null) {
            for (int i2 = 0; i2 < this.f1078e.size(); i2++) {
                Fragment fragment2 = this.f1078e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.o0();
                }
            }
        }
        this.f1078e = arrayList;
        return z;
    }

    public void w() {
        this.x = true;
        Q(true);
        N();
        J(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.f1080g != null) {
            this.f1081h.d();
            this.f1080g = null;
        }
    }

    public void x() {
        J(1);
    }

    public void x0(Fragment fragment) {
        if (!this.f1076c.c(fragment.f1016f)) {
            if (!p0(3)) {
                return;
            }
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.n + "since it is not added to " + this);
            return;
        }
        z0(fragment);
        if (fragment.H != null) {
            Fragment j2 = this.f1076c.j(fragment);
            if (j2 != null) {
                View view = j2.H;
                ViewGroup viewGroup = fragment.G;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.H, indexOfChild);
                }
            }
            if (fragment.L && fragment.G != null) {
                float f2 = fragment.N;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.N = 0.0f;
                fragment.L = false;
                e.d b2 = androidx.fragment.app.e.b(this.o.i(), this.p, fragment, true);
                if (b2 != null) {
                    Animation animation = b2.f1053a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        b2.f1054b.setTarget(fragment.H);
                        b2.f1054b.start();
                    }
                }
            }
        }
        if (!fragment.M) {
            return;
        }
        o(fragment);
    }

    public void y() {
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.U0();
            }
        }
    }

    public void y0(int i2, boolean z) {
        androidx.fragment.app.j<?> jVar;
        if (this.o != null || i2 == -1) {
            if (!z && i2 == this.n) {
                return;
            }
            this.n = i2;
            for (Fragment fragment : this.f1076c.m()) {
                x0(fragment);
            }
            for (Fragment fragment2 : this.f1076c.k()) {
                if (fragment2 != null && !fragment2.L) {
                    x0(fragment2);
                }
            }
            X0();
            if (!this.u || (jVar = this.o) == null || this.n != 4) {
                return;
            }
            jVar.q();
            this.u = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    public void z(boolean z) {
        for (Fragment fragment : this.f1076c.m()) {
            if (fragment != null) {
                fragment.V0(z);
            }
        }
    }

    public void z0(Fragment fragment) {
        A0(fragment, this.n);
    }
}
