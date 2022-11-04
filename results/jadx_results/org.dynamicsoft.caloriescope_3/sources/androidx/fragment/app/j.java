package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean I = false;
    static final Interpolator J = new DecelerateInterpolator(2.5f);
    static final Interpolator K = new DecelerateInterpolator(1.5f);
    ArrayList<androidx.fragment.app.a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    ArrayList<l> F;
    private androidx.fragment.app.l G;
    ArrayList<k> d;
    boolean e;
    ArrayList<androidx.fragment.app.a> i;
    ArrayList<Fragment> j;
    private OnBackPressedDispatcher k;
    ArrayList<androidx.fragment.app.a> m;
    ArrayList<Integer> n;
    ArrayList<i.b> o;
    androidx.fragment.app.h r;
    androidx.fragment.app.e s;
    Fragment t;
    Fragment u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    int f = 0;
    final ArrayList<Fragment> g = new ArrayList<>();
    final HashMap<String, Fragment> h = new HashMap<>();
    private final androidx.activity.b l = new a(false);
    private final CopyOnWriteArrayList<i> p = new CopyOnWriteArrayList<>();
    int q = 0;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    Runnable H = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(z);
            j.this = r1;
        }

        @Override // androidx.activity.b
        public void a() {
            j.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.p();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f902a;

        /* renamed from: b */
        final /* synthetic */ Fragment f903b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
                c.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f903b.i() != null) {
                    c.this.f903b.a((View) null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f903b;
                    jVar.a(fragment, fragment.D(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            j.this = r1;
            this.f902a = viewGroup;
            this.f903b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f902a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f906a;

        /* renamed from: b */
        final /* synthetic */ View f907b;

        /* renamed from: c */
        final /* synthetic */ Fragment f908c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            j.this = r1;
            this.f906a = viewGroup;
            this.f907b = view;
            this.f908c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f906a.endViewTransition(this.f907b);
            Animator j = this.f908c.j();
            this.f908c.a((Animator) null);
            if (j == null || this.f906a.indexOfChild(this.f907b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f908c;
            jVar.a(fragment, fragment.D(), 0, 0, false);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f909a;

        /* renamed from: b */
        final /* synthetic */ View f910b;

        /* renamed from: c */
        final /* synthetic */ Fragment f911c;

        e(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f909a = viewGroup;
            this.f910b = view;
            this.f911c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f909a.endViewTransition(this.f910b);
            animator.removeListener(this);
            Fragment fragment = this.f911c;
            View view = fragment.H;
            if (view == null || !fragment.z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.g {
        f() {
            j.this = r1;
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.r;
            return hVar.a(hVar.g(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public final Animation f913a;

        /* renamed from: b */
        public final Animator f914b;

        g(Animator animator) {
            this.f913a = null;
            this.f914b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        g(Animation animation) {
            this.f913a = animation;
            this.f914b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f915b;

        /* renamed from: c */
        private final View f916c;
        private boolean d;
        private boolean e;
        private boolean f = true;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f915b = viewGroup;
            this.f916c = view;
            addAnimation(animation);
            this.f915b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                a.g.l.r.a(this.f915b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                a.g.l.r.a(this.f915b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d || !this.f) {
                this.f915b.endViewTransition(this.f916c);
                this.e = true;
                return;
            }
            this.f = false;
            this.f915b.post(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a */
        final i.a f917a;

        /* renamed from: b */
        final boolean f918b;
    }

    /* renamed from: androidx.fragment.app.j$j */
    /* loaded from: classes.dex */
    public static class C0040j {

        /* renamed from: a */
        public static final int[] f919a = {16842755, 16842960, 16842961};
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public static class l implements Fragment.f {

        /* renamed from: a */
        final boolean f920a;

        /* renamed from: b */
        final androidx.fragment.app.a f921b;

        /* renamed from: c */
        private int f922c;

        l(androidx.fragment.app.a aVar, boolean z) {
            this.f920a = z;
            this.f921b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i = this.f922c - 1;
            this.f922c = i;
            if (i != 0) {
                return;
            }
            this.f921b.r.z();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f922c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f921b;
            aVar.r.a(aVar, this.f920a, false, false);
        }

        public void d() {
            boolean z = this.f922c > 0;
            j jVar = this.f921b.r;
            int size = jVar.g.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.g.get(i);
                fragment.a((Fragment.f) null);
                if (z && fragment.J()) {
                    fragment.h0();
                }
            }
            androidx.fragment.app.a aVar = this.f921b;
            aVar.r.a(aVar, this.f920a, !z, true);
        }

        public boolean e() {
            return this.f922c == 0;
        }
    }

    private void B() {
        this.h.values().removeAll(Collections.singleton(null));
    }

    private void C() {
        if (!v()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void D() {
        this.e = false;
        this.B.clear();
        this.A.clear();
    }

    private void E() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.i() != null) {
                    int D = fragment.D();
                    View i2 = fragment.i();
                    Animation animation = i2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        i2.clearAnimation();
                    }
                    fragment.a((View) null);
                    a(fragment, D, 0, 0, false);
                } else if (fragment.j() != null) {
                    fragment.j().end();
                }
            }
        }
    }

    private void F() {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                this.F.remove(0).d();
            }
        }
    }

    private void G() {
        ArrayList<k> arrayList = this.d;
        boolean z = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.l.a(true);
            return;
        }
        androidx.activity.b bVar = this.l;
        if (q() <= 0 || !i(this.t)) {
            z = false;
        }
        bVar.a(z);
    }

    private int a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.d.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.c() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                l lVar = new l(aVar, booleanValue);
                this.F.add(lVar);
                aVar.a(lVar);
                if (booleanValue) {
                    aVar.a();
                } else {
                    aVar.a(false);
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

    static g a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(J);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void a(a.d.b<Fragment> bVar) {
        int i2 = this.q;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.g.get(i3);
            if (fragment.f883b < min) {
                a(fragment, min, fragment.t(), fragment.u(), false);
                if (fragment.H != null && !fragment.z && fragment.M) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void a(Fragment fragment, g gVar, int i2) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.c(i2);
        if (gVar.f913a != null) {
            h hVar = new h(gVar.f913a, viewGroup, view);
            fragment.a(fragment.H);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.H.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f914b;
        fragment.a(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.H);
        animator.start();
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.g.k.b("FragmentManager"));
        androidx.fragment.app.h hVar = this.r;
        try {
            if (hVar != null) {
                hVar.a("  ", null, printWriter, new String[0]);
            } else {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
        }
        throw runtimeException;
    }

    private void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<l> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = this.F.get(i2);
            if (arrayList == null || lVar.f920a || (indexOf2 = arrayList.indexOf(lVar.f921b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (lVar.e() || (arrayList != null && lVar.f921b.a(arrayList, 0, arrayList.size()))) {
                    this.F.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || lVar.f920a || (indexOf = arrayList.indexOf(lVar.f921b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        lVar.d();
                    }
                }
                i2++;
            } else {
                this.F.remove(i2);
                i2--;
                size--;
            }
            lVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                aVar.a(z);
            } else {
                aVar.a(1);
                aVar.a();
            }
            i2++;
        }
    }

    private boolean a(String str, int i2, int i3) {
        p();
        c(true);
        Fragment fragment = this.u;
        if (fragment == null || i2 >= 0 || str != null || !fragment.l().c()) {
            boolean a2 = a(this.A, this.B, str, i2, i3);
            if (a2) {
                this.e = true;
                try {
                    c(this.A, this.B);
                } finally {
                    D();
                }
            }
            G();
            o();
            B();
            return a2;
        }
        return true;
    }

    public static int b(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        } else if (i2 == 4099) {
            return z ? 5 : 6;
        } else if (i2 != 8194) {
            return -1;
        } else {
            return z ? 3 : 4;
        }
    }

    private void b(a.d.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment c2 = bVar.c(i2);
            if (!c2.l) {
                View g0 = c2.g0();
                c2.O = g0.getAlpha();
                g0.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).p;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.g);
        Fragment s = s();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            s = !arrayList2.get(i7).booleanValue() ? aVar.a(this.C, s) : aVar.b(this.C, s);
            z2 = z2 || aVar.h;
        }
        this.C.clear();
        if (!z) {
            o.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z) {
            a.d.b<Fragment> bVar = new a.d.b<>();
            a(bVar);
            int a2 = a(arrayList, arrayList2, i2, i3, bVar);
            b(bVar);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            o.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.q, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.t) >= 0) {
                b(i5);
                aVar2.t = -1;
            }
            aVar2.d();
            i6++;
        }
        if (z2) {
            x();
        }
    }

    private boolean b(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.d != null && this.d.size() != 0) {
                int size = this.d.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.d.get(i2).a(arrayList, arrayList2);
                }
                this.d.clear();
                this.r.h().removeCallbacks(this.H);
                return z;
            }
            return false;
        }
    }

    private void c(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 == size) {
            return;
        }
        b(arrayList, arrayList2, i3, size);
    }

    private void c(boolean z) {
        if (!this.e) {
            if (this.r == null) {
                throw new IllegalStateException("Fragment host has been destroyed");
            }
            if (Looper.myLooper() != this.r.h().getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            if (!z) {
                C();
            }
            if (this.A == null) {
                this.A = new ArrayList<>();
                this.B = new ArrayList<>();
            }
            this.e = true;
            try {
                a((ArrayList<androidx.fragment.app.a>) null, (ArrayList<Boolean>) null);
                return;
            } finally {
                this.e = false;
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private void d(int i2) {
        try {
            this.e = true;
            a(i2, false);
            this.e = false;
            p();
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public static int e(int i2) {
        if (i2 != 4097) {
            if (i2 == 4099) {
                return 4099;
            }
            return i2 != 8194 ? 0 : 4097;
        }
        return 8194;
    }

    private void u(Fragment fragment) {
        if (fragment == null || this.h.get(fragment.f) != fragment) {
            return;
        }
        fragment.a0();
    }

    private Fragment v(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.g.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.g.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private boolean w(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.d();
    }

    void A() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                n(fragment);
            }
        }
    }

    public Fragment a(int i2) {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.g.get(size);
            if (fragment != null && fragment.w == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment2.w == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.h.get(string);
        if (fragment != null) {
            return fragment;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public Fragment a(String str) {
        if (str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.h.values()) {
                if (fragment2 != null && str.equals(fragment2.y)) {
                    return fragment2;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g a() {
        if (super.a() == androidx.fragment.app.i.f898c) {
            Fragment fragment = this.t;
            if (fragment != null) {
                return fragment.s.a();
            }
            a(new f());
        }
        return super.a();
    }

    g a(Fragment fragment, int i2, boolean z, int i3) {
        int b2;
        int t = fragment.t();
        boolean z2 = false;
        fragment.b(0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation a2 = fragment.a(i2, z, t);
            if (a2 != null) {
                return new g(a2);
            }
            Animator b3 = fragment.b(i2, z, t);
            if (b3 != null) {
                return new g(b3);
            }
            if (t != 0) {
                boolean equals = "anim".equals(this.r.g().getResources().getResourceTypeName(t));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(this.r.g(), t);
                        if (loadAnimation != null) {
                            return new g(loadAnimation);
                        }
                        z2 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z2) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(this.r.g(), t);
                        if (loadAnimator != null) {
                            return new g(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.r.g(), t);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    }
                }
            }
            if (i2 == 0 || (b2 = b(i2, z)) < 0) {
                return null;
            }
            switch (b2) {
                case 1:
                    return a(1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    return a(1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    return a(0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    return a(1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    return a(0.0f, 1.0f);
                case 6:
                    return a(1.0f, 0.0f);
                default:
                    if (i3 == 0 && this.r.l()) {
                        this.r.k();
                    }
                    return null;
            }
        }
        return null;
    }

    public void a(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (i2 < size) {
                if (I) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.m.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.m.add(null);
                    if (this.n == null) {
                        this.n = new ArrayList<>();
                    }
                    if (I) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.n.add(Integer.valueOf(size));
                    size++;
                }
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.m.add(aVar);
            }
        }
    }

    public void a(int i2, boolean z) {
        androidx.fragment.app.h hVar;
        if (this.r != null || i2 == 0) {
            if (!z && i2 == this.q) {
                return;
            }
            this.q = i2;
            int size = this.g.size();
            for (int i3 = 0; i3 < size; i3++) {
                l(this.g.get(i3));
            }
            for (Fragment fragment : this.h.values()) {
                if (fragment != null && (fragment.m || fragment.A)) {
                    if (!fragment.M) {
                        l(fragment);
                    }
                }
            }
            A();
            if (!this.v || (hVar = this.r) == null || this.q != 4) {
                return;
            }
            hVar.m();
            this.v = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.s == this) {
            bundle.putString(str, fragment.f);
            return;
        }
        a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void a(Parcelable parcelable) {
        m mVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f923b == null) {
            return;
        }
        for (Fragment fragment : this.G.c()) {
            if (I) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<m> it = kVar.f923b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                mVar = it.next();
                if (mVar.f928c.equals(fragment.f)) {
                    break;
                }
            }
            if (mVar == null) {
                if (I) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f923b);
                }
                a(fragment, 1, 0, 0, false);
                fragment.m = true;
                a(fragment, 0, 0, 0, false);
            } else {
                mVar.o = fragment;
                fragment.d = null;
                fragment.r = 0;
                fragment.o = false;
                fragment.l = false;
                Fragment fragment2 = fragment.h;
                fragment.i = fragment2 != null ? fragment2.f : null;
                fragment.h = null;
                Bundle bundle = mVar.n;
                if (bundle != null) {
                    bundle.setClassLoader(this.r.g().getClassLoader());
                    fragment.d = mVar.n.getSparseParcelableArray("android:view_state");
                    fragment.f884c = mVar.n;
                }
            }
        }
        this.h.clear();
        Iterator<m> it2 = kVar.f923b.iterator();
        while (it2.hasNext()) {
            m next = it2.next();
            if (next != null) {
                Fragment a2 = next.a(this.r.g().getClassLoader(), a());
                a2.s = this;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a2.f + "): " + a2);
                }
                this.h.put(a2.f, a2);
                next.o = null;
            }
        }
        this.g.clear();
        ArrayList<String> arrayList = kVar.f924c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.h.get(next2);
                if (fragment3 == null) {
                    a(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                    throw null;
                }
                fragment3.l = true;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.g.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.g) {
                    this.g.add(fragment3);
                }
            }
        }
        if (kVar.d != null) {
            this.i = new ArrayList<>(kVar.d.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.d;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a3 = bVarArr[i2].a(this);
                if (I) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a3.t + "): " + a3);
                    PrintWriter printWriter = new PrintWriter(new a.g.k.b("FragmentManager"));
                    a3.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.i.add(a3);
                int i3 = a3.t;
                if (i3 >= 0) {
                    a(i3, a3);
                }
                i2++;
            }
        } else {
            this.i = null;
        }
        String str = kVar.e;
        if (str != null) {
            Fragment fragment4 = this.h.get(str);
            this.u = fragment4;
            u(fragment4);
        }
        this.f = kVar.f;
    }

    public void a(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.c(menu);
            }
        }
    }

    void a(Fragment fragment) {
        if (v()) {
            if (!I) {
                return;
            }
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        } else if (!this.G.a(fragment) || !I) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
        if (r0 != 3) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).a(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.a(this, fragment, context);
            }
        }
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).a(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.a(this, fragment, bundle);
            }
        }
    }

    void a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).a(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.a(this, fragment, view, bundle);
            }
        }
    }

    public void a(Fragment fragment, e.b bVar) {
        if (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.r() == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void a(Fragment fragment, boolean z) {
        if (I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        j(fragment);
        if (!fragment.A) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.g) {
                this.g.add(fragment);
            }
            fragment.l = true;
            fragment.m = false;
            if (fragment.H == null) {
                fragment.N = false;
            }
            if (w(fragment)) {
                this.v = true;
            }
            if (!z) {
                return;
            }
            m(fragment);
        }
    }

    public void a(androidx.fragment.app.a aVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(aVar);
    }

    void a(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.a(z3);
        } else {
            aVar.a();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            o.a(this, (ArrayList<androidx.fragment.app.a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.q, true);
        }
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.b(fragment.x)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.r == null) {
            this.r = hVar;
            this.s = eVar;
            this.t = fragment;
            if (fragment != null) {
                G();
            }
            if (hVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) hVar;
                this.k = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                this.k.a(fragment2, this.l);
            }
            this.G = fragment != null ? fragment.s.f(fragment) : hVar instanceof t ? androidx.fragment.app.l.a(((t) hVar).e()) : new androidx.fragment.app.l(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    @Override // androidx.fragment.app.i
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.h.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.h.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.g.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.g.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.j.get(i3).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.i;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.m != null && (size2 = this.m.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((androidx.fragment.app.a) this.m.get(i5));
                }
            }
            if (this.n != null && this.n.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.n.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((k) this.d.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public void a(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.g.get(size);
                if (fragment != null) {
                    fragment.e(z);
                }
            } else {
                return;
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                Fragment fragment2 = this.j.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.N();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.i.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.i.get(size2);
                    if ((str != null && str.equals(aVar.b())) || (i2 >= 0 && i2 == aVar.t)) {
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
                        androidx.fragment.app.a aVar2 = this.i.get(size2);
                        if (str == null || !str.equals(aVar2.b())) {
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
            if (i4 == this.i.size() - 1) {
                return false;
            }
            for (int size3 = this.i.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.i.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public Fragment b(String str) {
        Fragment a2;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && (a2 = fragment.a(str)) != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> b() {
        List<Fragment> list;
        if (this.g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.g) {
            list = (List) this.g.clone();
        }
        return list;
    }

    public void b(int i2) {
        synchronized (this) {
            this.m.set(i2, null);
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            if (I) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.n.add(Integer.valueOf(i2));
        }
    }

    public void b(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (I) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.g) {
                this.g.add(fragment);
            }
            fragment.l = true;
            if (!w(fragment)) {
                return;
            }
            this.v = true;
        }
    }

    void b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).b(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.b(this, fragment, context);
            }
        }
    }

    void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).b(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.b(this, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).b(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.a(this, fragment);
            }
        }
    }

    public void b(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.g.get(size);
                if (fragment != null) {
                    fragment.f(z);
                }
            } else {
                return;
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.q < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.d(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean b(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void c(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            g a2 = a(fragment, fragment.u(), !fragment.z, fragment.v());
            if (a2 == null || (animator = a2.f914b) == null) {
                if (a2 != null) {
                    fragment.H.startAnimation(a2.f913a);
                    a2.f913a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.H()) ? 0 : 8);
                if (fragment.H()) {
                    fragment.g(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.H()) {
                    fragment.g(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    a2.f914b.addListener(new e(this, viewGroup, view, fragment));
                }
                a2.f914b.start();
            }
        }
        if (fragment.l && w(fragment)) {
            this.v = true;
        }
        fragment.N = false;
        fragment.a(fragment.z);
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).c(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.c(this, fragment, bundle);
            }
        }
    }

    void c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).c(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.b(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean c() {
        C();
        return a((String) null, -1, 0);
    }

    public boolean c(int i2) {
        return this.q >= i2;
    }

    public void d(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (!fragment.l) {
                return;
            }
            if (I) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (w(fragment)) {
                this.v = true;
            }
            fragment.l = false;
        }
    }

    void d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).d(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.d(this, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).d(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.c(this, fragment);
            }
        }
    }

    boolean d() {
        boolean z = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                z = w(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.w = false;
        this.x = false;
        d(2);
    }

    void e(Fragment fragment) {
        if (!fragment.n || fragment.q) {
            return;
        }
        fragment.b(fragment.i(fragment.f884c), (ViewGroup) null, fragment.f884c);
        View view = fragment.H;
        if (view == null) {
            fragment.I = null;
            return;
        }
        fragment.I = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.z) {
            fragment.H.setVisibility(8);
        }
        fragment.a(fragment.H, fragment.f884c);
        a(fragment, fragment.H, fragment.f884c, false);
    }

    void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).e(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.d(this, fragment);
            }
        }
    }

    androidx.fragment.app.l f(Fragment fragment) {
        return this.G.c(fragment);
    }

    public void f() {
        this.w = false;
        this.x = false;
        d(1);
    }

    void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).f(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.e(this, fragment);
            }
        }
    }

    public androidx.lifecycle.s g(Fragment fragment) {
        return this.G.d(fragment);
    }

    public void g() {
        this.y = true;
        p();
        d(0);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.k != null) {
            this.l.c();
            this.k = null;
        }
    }

    void g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).g(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.f(this, fragment);
            }
        }
    }

    public void h() {
        d(1);
    }

    public void h(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            fragment.N = true ^ fragment.N;
        }
    }

    void h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.i r = fragment2.r();
            if (r instanceof j) {
                ((j) r).h(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z || next.f918b) {
                next.f917a.g(this, fragment);
            }
        }
    }

    public void i() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.Y();
            }
        }
    }

    public boolean i(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        return fragment == jVar.s() && i(jVar.t);
    }

    public void j() {
        d(3);
    }

    public void j(Fragment fragment) {
        if (this.h.get(fragment.f) != null) {
            return;
        }
        this.h.put(fragment.f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                a(fragment);
            } else {
                p(fragment);
            }
            fragment.C = false;
        }
        if (!I) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + fragment);
    }

    public void k() {
        G();
        u(this.u);
    }

    void k(Fragment fragment) {
        if (this.h.get(fragment.f) == null) {
            return;
        }
        if (I) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment.f.equals(fragment2.i)) {
                fragment2.h = fragment;
                fragment2.i = null;
            }
        }
        this.h.put(fragment.f, null);
        p(fragment);
        String str = fragment.i;
        if (str != null) {
            fragment.h = this.h.get(str);
        }
        fragment.G();
    }

    public void l() {
        this.w = false;
        this.x = false;
        d(4);
    }

    public void l(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.h.containsKey(fragment.f)) {
            if (!I) {
                return;
            }
            Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
            return;
        }
        int i2 = this.q;
        if (fragment.m) {
            i2 = fragment.I() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        a(fragment, i2, fragment.u(), fragment.v(), false);
        if (fragment.H != null) {
            Fragment v = v(fragment);
            if (v != null) {
                View view = v.H;
                ViewGroup viewGroup = fragment.G;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.H, indexOfChild);
                }
            }
            if (fragment.M && fragment.G != null) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.O = 0.0f;
                fragment.M = false;
                g a2 = a(fragment, fragment.u(), true, fragment.v());
                if (a2 != null) {
                    Animation animation = a2.f913a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        a2.f914b.setTarget(fragment.H);
                        a2.f914b.start();
                    }
                }
            }
        }
        if (!fragment.N) {
            return;
        }
        c(fragment);
    }

    public void m() {
        this.w = false;
        this.x = false;
        d(3);
    }

    void m(Fragment fragment) {
        a(fragment, this.q, 0, 0, false);
    }

    public void n() {
        this.x = true;
        d(2);
    }

    public void n(Fragment fragment) {
        if (fragment.J) {
            if (this.e) {
                this.z = true;
                return;
            }
            fragment.J = false;
            a(fragment, this.q, 0, 0, false);
        }
    }

    void o() {
        if (this.z) {
            this.z = false;
            A();
        }
    }

    public void o(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.I();
        if (!fragment.A || z) {
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (w(fragment)) {
                this.v = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0040j.f919a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        if (resourceId != -1) {
            fragment = a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = a(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = a(i2);
        }
        if (I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = a().a(context.getClassLoader(), str2);
            fragment.n = true;
            fragment.w = resourceId != 0 ? resourceId : i2;
            fragment.x = i2;
            fragment.y = string;
            fragment.o = true;
            fragment.s = this;
            androidx.fragment.app.h hVar = this.r;
            fragment.t = hVar;
            fragment.a(hVar.g(), attributeSet, fragment.f884c);
            a(fragment, true);
        } else if (fragment.o) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        } else {
            fragment.o = true;
            androidx.fragment.app.h hVar2 = this.r;
            fragment.t = hVar2;
            fragment.a(hVar2.g(), attributeSet, fragment.f884c);
        }
        Fragment fragment2 = fragment;
        if (this.q >= 1 || !fragment2.n) {
            m(fragment2);
        } else {
            a(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment2.H.getTag() == null) {
                fragment2.H.setTag(string);
            }
            return fragment2.H;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    void p(Fragment fragment) {
        if (v()) {
            if (!I) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        } else if (!this.G.e(fragment) || !I) {
        } else {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean p() {
        c(true);
        boolean z = false;
        while (b(this.A, this.B)) {
            this.e = true;
            try {
                c(this.A, this.B);
                D();
                z = true;
            } catch (Throwable th) {
                D();
                throw th;
            }
        }
        G();
        o();
        B();
        return z;
    }

    public int q() {
        ArrayList<androidx.fragment.app.a> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    Bundle q(Fragment fragment) {
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.j(this.D);
        d(fragment, this.D, false);
        Bundle bundle = null;
        if (!this.D.isEmpty()) {
            Bundle bundle2 = this.D;
            this.D = null;
            bundle = bundle2;
        }
        if (fragment.H != null) {
            r(fragment);
        }
        if (fragment.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.d);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    public LayoutInflater.Factory2 r() {
        return this;
    }

    void r(Fragment fragment) {
        if (fragment.I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.E;
        if (sparseArray == null) {
            this.E = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.I.saveHierarchyState(this.E);
        if (this.E.size() <= 0) {
            return;
        }
        fragment.d = this.E;
        this.E = null;
    }

    public Fragment s() {
        return this.u;
    }

    public void s(Fragment fragment) {
        if (fragment == null || (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.r() == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            u(fragment2);
            u(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void t() {
        p();
        if (this.l.b()) {
            c();
        } else {
            this.k.a();
        }
    }

    public void t(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.N = !fragment.N;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.t;
        if (obj == null) {
            obj = this.r;
        }
        a.g.k.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public boolean u() {
        return this.y;
    }

    public boolean v() {
        return this.w || this.x;
    }

    public void w() {
        this.w = false;
        this.x = false;
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.L();
            }
        }
    }

    void x() {
        if (this.o != null) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                this.o.get(i2).a();
            }
        }
    }

    public Parcelable y() {
        ArrayList<String> arrayList;
        int size;
        F();
        E();
        p();
        this.w = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.h.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.h.size());
        boolean z = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
                m mVar = new m(fragment);
                arrayList2.add(mVar);
                if (fragment.f883b <= 0 || mVar.n != null) {
                    mVar.n = fragment.f884c;
                } else {
                    mVar.n = q(fragment);
                    String str = fragment.i;
                    if (str != null) {
                        Fragment fragment2 = this.h.get(str);
                        if (fragment2 == null) {
                            a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                            throw null;
                        }
                        if (mVar.n == null) {
                            mVar.n = new Bundle();
                        }
                        a(mVar.n, "android:target_state", fragment2);
                        int i2 = fragment.j;
                        if (i2 != 0) {
                            mVar.n.putInt("android:target_req_state", i2);
                        }
                    }
                }
                if (I) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.n);
                }
                z = true;
            }
        }
        if (!z) {
            if (I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.g.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.g.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f);
                if (next.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                } else if (I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new androidx.fragment.app.b(this.i.get(i3));
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.i.get(i3));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f923b = arrayList2;
        kVar.f924c = arrayList;
        kVar.d = bVarArr;
        Fragment fragment3 = this.u;
        if (fragment3 != null) {
            kVar.e = fragment3.f;
        }
        kVar.f = this.f;
        return kVar;
    }

    void z() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.F != null && !this.F.isEmpty();
            if (this.d != null && this.d.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.r.h().removeCallbacks(this.H);
                this.r.h().post(this.H);
                G();
            }
        }
    }
}
