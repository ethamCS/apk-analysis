package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.fragment.app.k;
import androidx.fragment.app.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends m0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3999a;

        static {
            int[] iArr = new int[m0.e.c.values().length];
            f3999a = iArr;
            try {
                iArr[m0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3999a[m0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3999a[m0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3999a[m0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f4000c;

        /* renamed from: d */
        final /* synthetic */ m0.e f4001d;

        b(List list, m0.e eVar) {
            d.this = r1;
            this.f4000c = list;
            this.f4001d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4000c.contains(this.f4001d)) {
                this.f4000c.remove(this.f4001d);
                d.this.s(this.f4001d);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4003a;

        /* renamed from: b */
        final /* synthetic */ View f4004b;

        /* renamed from: c */
        final /* synthetic */ boolean f4005c;

        /* renamed from: d */
        final /* synthetic */ m0.e f4006d;

        /* renamed from: e */
        final /* synthetic */ k f4007e;

        c(ViewGroup viewGroup, View view, boolean z10, m0.e eVar, k kVar) {
            d.this = r1;
            this.f4003a = viewGroup;
            this.f4004b = view;
            this.f4005c = z10;
            this.f4006d = eVar;
            this.f4007e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4003a.endViewTransition(this.f4004b);
            if (this.f4005c) {
                this.f4006d.e().b(this.f4004b);
            }
            this.f4007e.a();
            if (w.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4006d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: classes.dex */
    public class C0048d implements e.b {

        /* renamed from: a */
        final /* synthetic */ Animator f4009a;

        /* renamed from: b */
        final /* synthetic */ m0.e f4010b;

        C0048d(Animator animator, m0.e eVar) {
            d.this = r1;
            this.f4009a = animator;
            this.f4010b = eVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f4009a.end();
            if (w.L0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4010b + " has been canceled.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ m0.e f4012a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4013b;

        /* renamed from: c */
        final /* synthetic */ View f4014c;

        /* renamed from: d */
        final /* synthetic */ k f4015d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
                e.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f4013b.endViewTransition(eVar.f4014c);
                e.this.f4015d.a();
            }
        }

        e(m0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            d.this = r1;
            this.f4012a = eVar;
            this.f4013b = viewGroup;
            this.f4014c = view;
            this.f4015d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4013b.post(new a());
            if (w.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4012a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (w.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4012a + " has reached onAnimationStart.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements e.b {

        /* renamed from: a */
        final /* synthetic */ View f4018a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4019b;

        /* renamed from: c */
        final /* synthetic */ k f4020c;

        /* renamed from: d */
        final /* synthetic */ m0.e f4021d;

        f(View view, ViewGroup viewGroup, k kVar, m0.e eVar) {
            d.this = r1;
            this.f4018a = view;
            this.f4019b = viewGroup;
            this.f4020c = kVar;
            this.f4021d = eVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f4018a.clearAnimation();
            this.f4019b.endViewTransition(this.f4018a);
            this.f4020c.a();
            if (w.L0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4021d + " has been cancelled.");
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ m0.e f4023c;

        /* renamed from: d */
        final /* synthetic */ m0.e f4024d;

        /* renamed from: q */
        final /* synthetic */ boolean f4025q;

        /* renamed from: x */
        final /* synthetic */ i0.a f4026x;

        g(m0.e eVar, m0.e eVar2, boolean z10, i0.a aVar) {
            d.this = r1;
            this.f4023c = eVar;
            this.f4024d = eVar2;
            this.f4025q = z10;
            this.f4026x = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.a(this.f4023c.f(), this.f4024d.f(), this.f4025q, this.f4026x, false);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ i0 f4028c;

        /* renamed from: d */
        final /* synthetic */ View f4029d;

        /* renamed from: q */
        final /* synthetic */ Rect f4030q;

        h(i0 i0Var, View view, Rect rect) {
            d.this = r1;
            this.f4028c = i0Var;
            this.f4029d = view;
            this.f4030q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4028c.h(this.f4029d, this.f4030q);
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f4032c;

        i(ArrayList arrayList) {
            d.this = r1;
            this.f4032c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.d(this.f4032c, 4);
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: c */
        final /* synthetic */ m f4034c;

        /* renamed from: d */
        final /* synthetic */ m0.e f4035d;

        j(m mVar, m0.e eVar) {
            d.this = r1;
            this.f4034c = mVar;
            this.f4035d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4034c.a();
            if (w.L0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f4035d + "has completed");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c */
        private boolean f4037c;

        /* renamed from: d */
        private boolean f4038d = false;

        /* renamed from: e */
        private k.a f4039e;

        k(m0.e eVar, androidx.core.os.e eVar2, boolean z10) {
            super(eVar, eVar2);
            this.f4037c = z10;
        }

        k.a e(Context context) {
            if (this.f4038d) {
                return this.f4039e;
            }
            k.a b10 = androidx.fragment.app.k.b(context, b().f(), b().e() == m0.e.c.VISIBLE, this.f4037c);
            this.f4039e = b10;
            this.f4038d = true;
            return b10;
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        private final m0.e f4040a;

        /* renamed from: b */
        private final androidx.core.os.e f4041b;

        l(m0.e eVar, androidx.core.os.e eVar2) {
            this.f4040a = eVar;
            this.f4041b = eVar2;
        }

        void a() {
            this.f4040a.d(this.f4041b);
        }

        m0.e b() {
            return this.f4040a;
        }

        androidx.core.os.e c() {
            return this.f4041b;
        }

        boolean d() {
            m0.e.c cVar;
            m0.e.c h10 = m0.e.c.h(this.f4040a.f().f3928x4);
            m0.e.c e10 = this.f4040a.e();
            return h10 == e10 || !(h10 == (cVar = m0.e.c.VISIBLE) || e10 == cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c */
        private final Object f4042c;

        /* renamed from: d */
        private final boolean f4043d;

        /* renamed from: e */
        private final Object f4044e;

        m(m0.e eVar, androidx.core.os.e eVar2, boolean z10, boolean z11) {
            super(eVar, eVar2);
            boolean z12;
            Object obj;
            if (eVar.e() == m0.e.c.VISIBLE) {
                Fragment f10 = eVar.f();
                this.f4042c = z10 ? f10.n0() : f10.W();
                Fragment f11 = eVar.f();
                z12 = z10 ? f11.M() : f11.H();
            } else {
                Fragment f12 = eVar.f();
                this.f4042c = z10 ? f12.p0() : f12.Z();
                z12 = true;
            }
            this.f4043d = z12;
            if (z11) {
                Fragment f13 = eVar.f();
                obj = z10 ? f13.r0() : f13.q0();
            } else {
                obj = null;
            }
            this.f4044e = obj;
        }

        private i0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            i0 i0Var = g0.f4100a;
            if (i0Var != null && i0Var.e(obj)) {
                return i0Var;
            }
            i0 i0Var2 = g0.f4101b;
            if (i0Var2 != null && i0Var2.e(obj)) {
                return i0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        i0 e() {
            i0 f10 = f(this.f4042c);
            i0 f11 = f(this.f4044e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f4042c + " which uses a different Transition  type than its shared element transition " + this.f4044e);
        }

        public Object g() {
            return this.f4044e;
        }

        Object h() {
            return this.f4042c;
        }

        public boolean i() {
            return this.f4044e != null;
        }

        boolean j() {
            return this.f4043d;
        }
    }

    public d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<m0.e> list2, boolean z10, Map<m0.e, Boolean> map) {
        int i10;
        StringBuilder sb2;
        String str;
        boolean z11;
        int i11;
        k.a e10;
        m0.e eVar;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z12 = false;
        while (true) {
            i10 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (!next.d() && (e10 = next.e(context)) != null) {
                Animator animator = e10.f4135b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    m0.e b10 = next.b();
                    Fragment f10 = b10.f();
                    if (Boolean.TRUE.equals(map.get(b10))) {
                        if (w.L0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                        }
                        next.a();
                    } else {
                        boolean z13 = b10.e() == m0.e.c.GONE;
                        if (z13) {
                            list2.remove(b10);
                        }
                        View view = f10.f3928x4;
                        m10.startViewTransition(view);
                        animator.addListener(new c(m10, view, z13, b10, next));
                        animator.setTarget(view);
                        animator.start();
                        if (w.L0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Animator from operation ");
                            eVar = b10;
                            sb3.append(eVar);
                            sb3.append(" has started.");
                            Log.v("FragmentManager", sb3.toString());
                        } else {
                            eVar = b10;
                        }
                        next.c().b(new C0048d(animator, eVar));
                        z12 = true;
                    }
                }
            } else {
                next.a();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            m0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (w.L0(i10)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar.a();
            } else if (z12) {
                if (w.L0(i10)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar.a();
            } else {
                View view2 = f11.f3928x4;
                Animation animation = (Animation) androidx.core.util.h.g(((k.a) androidx.core.util.h.g(kVar.e(context))).f4134a);
                if (b11.e() != m0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                    z11 = z12;
                    i11 = i10;
                } else {
                    m10.startViewTransition(view2);
                    k.b bVar = new k.b(animation, m10, view2);
                    z11 = z12;
                    bVar.setAnimationListener(new e(b11, m10, view2, kVar));
                    view2.startAnimation(bVar);
                    i11 = 2;
                    if (w.L0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b11 + " has started.");
                    }
                }
                kVar.c().b(new f(view2, m10, kVar, b11));
                i10 = i11;
                z12 = z11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<m0.e, Boolean> x(List<m> list, List<m0.e> list2, boolean z10, m0.e eVar, m0.e eVar2) {
        String str;
        String str2;
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        View view;
        String str3;
        View view2;
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object obj3;
        i0.a aVar;
        HashMap hashMap2;
        m0.e eVar3;
        i0 i0Var;
        View view3;
        Rect rect;
        ArrayList<View> arrayList3;
        m0.e eVar4;
        ArrayList<View> arrayList4;
        View view4;
        View view5;
        boolean z11 = z10;
        m0.e eVar5 = eVar;
        m0.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        i0 i0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                i0 e10 = mVar.e();
                if (i0Var2 == null) {
                    i0Var2 = e10;
                } else if (e10 != null && i0Var2 != e10) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (i0Var2 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        i0.a aVar2 = new i0.a();
        Iterator<m> it = list.iterator();
        Object obj4 = null;
        View view7 = null;
        boolean z12 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar4 = eVar5;
                arrayList3 = arrayList5;
                rect = rect2;
                i0Var = i0Var2;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar3 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object u10 = i0Var2.u(i0Var2.f(next.g()));
                ArrayList<String> s02 = eVar2.f().s0();
                ArrayList<String> s03 = eVar.f().s0();
                ArrayList<String> t02 = eVar.f().t0();
                View view9 = view7;
                int i10 = 0;
                while (i10 < t02.size()) {
                    int indexOf = s02.indexOf(t02.get(i10));
                    ArrayList<String> arrayList7 = t02;
                    if (indexOf != -1) {
                        s02.set(indexOf, s03.get(i10));
                    }
                    i10++;
                    t02 = arrayList7;
                }
                ArrayList<String> t03 = eVar2.f().t0();
                Fragment f10 = eVar.f();
                if (!z11) {
                    f10.a0();
                    eVar2.f().X();
                } else {
                    f10.X();
                    eVar2.f().a0();
                }
                int i11 = 0;
                for (int size = s02.size(); i11 < size; size = size) {
                    aVar2.put(s02.get(i11), t03.get(i11));
                    i11++;
                }
                if (w.L0(2)) {
                    Log.v(str, ">>> entering view names <<<");
                    Iterator<String> it2 = t03.iterator();
                    while (it2.hasNext()) {
                        Iterator<String> it3 = it2;
                        Log.v(str, "Name: " + it2.next());
                        it2 = it3;
                    }
                    Log.v(str, ">>> exiting view names <<<");
                    Iterator<String> it4 = s02.iterator();
                    while (it4.hasNext()) {
                        Iterator<String> it5 = it4;
                        Log.v(str, "Name: " + it4.next());
                        it4 = it5;
                    }
                }
                i0.a<String, View> aVar3 = new i0.a<>();
                u(aVar3, eVar.f().f3928x4);
                aVar3.p(s02);
                aVar2.p(aVar3.keySet());
                i0.a<String, View> aVar4 = new i0.a<>();
                u(aVar4, eVar2.f().f3928x4);
                aVar4.p(t03);
                aVar4.p(aVar2.values());
                g0.c(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar4 = eVar5;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    i0Var = i0Var2;
                    view7 = view9;
                    obj4 = null;
                    eVar3 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    g0.a(eVar2.f(), eVar.f(), z11, aVar3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    androidx.core.view.v.a(m(), new g(eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (!s02.isEmpty()) {
                        View view11 = aVar3.get(s02.get(0));
                        i0Var2.p(u10, view11);
                        view7 = view11;
                    } else {
                        view7 = view9;
                    }
                    arrayList4 = arrayList8;
                    arrayList4.addAll(aVar4.values());
                    if (t03.isEmpty() || (view5 = aVar4.get(t03.get(0))) == null) {
                        view4 = view10;
                    } else {
                        androidx.core.view.v.a(m(), new h(i0Var2, view5, rect2));
                        view4 = view10;
                        z12 = true;
                    }
                    i0Var2.s(u10, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    i0Var = i0Var2;
                    i0Var2.n(u10, null, null, null, null, u10, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar4 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar4, bool);
                    eVar3 = eVar2;
                    hashMap2.put(eVar3, bool);
                    obj4 = u10;
                }
            }
            eVar5 = eVar4;
            arrayList5 = arrayList3;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList4;
            i0Var2 = i0Var;
            m0.e eVar7 = eVar3;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view12 = view7;
        i0.a aVar5 = aVar2;
        Collection<?> collection = arrayList6;
        m0.e eVar8 = eVar5;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        i0 i0Var3 = i0Var2;
        HashMap hashMap5 = hashMap3;
        View view13 = view6;
        m0.e eVar9 = eVar6;
        View view14 = view13;
        ArrayList arrayList9 = new ArrayList();
        Object obj5 = null;
        Object obj6 = null;
        for (m mVar3 : list) {
            if (mVar3.d()) {
                hashMap5.put(mVar3.b(), Boolean.FALSE);
                mVar3.a();
            } else {
                Object f11 = i0Var3.f(mVar3.h());
                m0.e b10 = mVar3.b();
                boolean z13 = obj4 != null && (b10 == eVar8 || b10 == eVar9);
                if (f11 == null) {
                    if (!z13) {
                        hashMap5.put(b10, Boolean.FALSE);
                        mVar3.a();
                    }
                    arrayList = collection;
                    str3 = str;
                    arrayList2 = collection2;
                    view = view14;
                    obj = obj5;
                    hashMap = hashMap5;
                    view2 = view12;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj7 = obj5;
                    t(arrayList10, b10.f().f3928x4);
                    if (z13) {
                        if (b10 == eVar8) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        i0Var3.a(f11, view14);
                        arrayList = collection;
                        arrayList2 = collection2;
                        view = view14;
                        obj3 = obj6;
                        hashMap = hashMap5;
                        obj2 = obj7;
                    } else {
                        i0Var3.b(f11, arrayList10);
                        view = view14;
                        obj2 = obj7;
                        arrayList2 = collection2;
                        obj3 = obj6;
                        arrayList = collection;
                        hashMap = hashMap5;
                        i0Var3.n(f11, f11, arrayList10, null, null, null, null);
                        if (b10.e() == m0.e.c.GONE) {
                            list2.remove(b10);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(b10.f().f3928x4);
                            i0Var3.m(f11, b10.f().f3928x4, arrayList11);
                            androidx.core.view.v.a(m(), new i(arrayList10));
                        }
                    }
                    if (b10.e() == m0.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z12) {
                            i0Var3.o(f11, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        i0Var3.p(f11, view2);
                    }
                    hashMap.put(b10, Boolean.TRUE);
                    if (mVar3.j()) {
                        obj6 = i0Var3.k(obj3, f11, null);
                        obj = obj2;
                    } else {
                        obj = i0Var3.k(obj2, f11, null);
                        obj6 = obj3;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj5 = obj;
                view12 = view2;
                str = str3;
                view14 = view;
                collection2 = arrayList2;
                collection = arrayList;
            }
        }
        ArrayList<View> arrayList12 = collection;
        String str4 = str;
        ArrayList<View> arrayList13 = collection2;
        HashMap hashMap6 = hashMap5;
        Object j10 = i0Var3.j(obj6, obj5, obj4);
        if (j10 == null) {
            return hashMap6;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h10 = mVar4.h();
                m0.e b11 = mVar4.b();
                HashMap hashMap7 = hashMap6;
                boolean z14 = obj4 != null && (b11 == eVar8 || b11 == eVar2);
                if (h10 == null && !z14) {
                    str2 = str4;
                } else if (!androidx.core.view.y.S(m())) {
                    if (w.L0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                    } else {
                        str2 = str4;
                    }
                    mVar4.a();
                } else {
                    str2 = str4;
                    i0Var3.q(mVar4.b().f(), j10, mVar4.c(), new j(mVar4, b11));
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!androidx.core.view.y.S(m())) {
            return hashMap8;
        }
        g0.d(arrayList9, 4);
        ArrayList<String> l10 = i0Var3.l(arrayList12);
        if (w.L0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it6 = arrayList13.iterator();
            while (it6.hasNext()) {
                View next2 = it6.next();
                Log.v(str5, "View: " + next2 + " Name: " + androidx.core.view.y.J(next2));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it7 = arrayList12.iterator();
            while (it7.hasNext()) {
                View next3 = it7.next();
                Log.v(str5, "View: " + next3 + " Name: " + androidx.core.view.y.J(next3));
            }
        }
        i0Var3.c(m(), j10);
        i0Var3.r(m(), arrayList13, arrayList12, l10, aVar5);
        g0.d(arrayList9, 0);
        i0Var3.t(obj4, arrayList13, arrayList12);
        return hashMap8;
    }

    @Override // androidx.fragment.app.m0
    void f(List<m0.e> list, boolean z10) {
        m0.e eVar = null;
        m0.e eVar2 = null;
        for (m0.e eVar3 : list) {
            m0.e.c h10 = m0.e.c.h(eVar3.f().f3928x4);
            int i10 = a.f3999a[eVar3.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (h10 == m0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && h10 != m0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (w.L0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<m0.e> arrayList3 = new ArrayList(list);
        for (m0.e eVar4 : list) {
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new k(eVar4, eVar5, z10));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<m0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (m0.e eVar7 : arrayList3) {
            s(eVar7);
        }
        arrayList3.clear();
        if (w.L0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(m0.e eVar) {
        eVar.e().b(eVar.f().f3928x4);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (androidx.core.view.b0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String J = androidx.core.view.y.J(view);
        if (J != null) {
            map.put(J, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(i0.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.y.J(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
