package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class e extends t {
    private static TimeInterpolator s;

    /* renamed from: h */
    private ArrayList<RecyclerView.d0> f1673h = new ArrayList<>();
    private ArrayList<RecyclerView.d0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.d0> o = new ArrayList<>();
    ArrayList<RecyclerView.d0> p = new ArrayList<>();
    ArrayList<RecyclerView.d0> q = new ArrayList<>();
    ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1674b;

        a(ArrayList arrayList) {
            e.this = r1;
            this.f1674b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1674b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                e.this.T(jVar.f1708a, jVar.f1709b, jVar.f1710c, jVar.f1711d, jVar.f1712e);
            }
            this.f1674b.clear();
            e.this.m.remove(this.f1674b);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1676b;

        b(ArrayList arrayList) {
            e.this = r1;
            this.f1676b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1676b.iterator();
            while (it.hasNext()) {
                e.this.S((i) it.next());
            }
            this.f1676b.clear();
            e.this.n.remove(this.f1676b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1678b;

        c(ArrayList arrayList) {
            e.this = r1;
            this.f1678b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1678b.iterator();
            while (it.hasNext()) {
                e.this.R((RecyclerView.d0) it.next());
            }
            this.f1678b.clear();
            e.this.l.remove(this.f1678b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f1680a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f1681b;

        /* renamed from: c */
        final /* synthetic */ View f1682c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            e.this = r1;
            this.f1680a = d0Var;
            this.f1681b = viewPropertyAnimator;
            this.f1682c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1681b.setListener(null);
            this.f1682c.setAlpha(1.0f);
            e.this.H(this.f1680a);
            e.this.q.remove(this.f1680a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.I(this.f1680a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e */
    /* loaded from: classes.dex */
    public class C0028e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f1684a;

        /* renamed from: b */
        final /* synthetic */ View f1685b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f1686c;

        C0028e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            e.this = r1;
            this.f1684a = d0Var;
            this.f1685b = view;
            this.f1686c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1685b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1686c.setListener(null);
            e.this.B(this.f1684a);
            e.this.o.remove(this.f1684a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.C(this.f1684a);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f1688a;

        /* renamed from: b */
        final /* synthetic */ int f1689b;

        /* renamed from: c */
        final /* synthetic */ View f1690c;

        /* renamed from: d */
        final /* synthetic */ int f1691d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f1692e;

        f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            e.this = r1;
            this.f1688a = d0Var;
            this.f1689b = i;
            this.f1690c = view;
            this.f1691d = i2;
            this.f1692e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f1689b != 0) {
                this.f1690c.setTranslationX(0.0f);
            }
            if (this.f1691d != 0) {
                this.f1690c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1692e.setListener(null);
            e.this.F(this.f1688a);
            e.this.p.remove(this.f1688a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.G(this.f1688a);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f1694a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f1695b;

        /* renamed from: c */
        final /* synthetic */ View f1696c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            e.this = r1;
            this.f1694a = iVar;
            this.f1695b = viewPropertyAnimator;
            this.f1696c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1695b.setListener(null);
            this.f1696c.setAlpha(1.0f);
            this.f1696c.setTranslationX(0.0f);
            this.f1696c.setTranslationY(0.0f);
            e.this.D(this.f1694a.f1702a, true);
            e.this.r.remove(this.f1694a.f1702a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.E(this.f1694a.f1702a, true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f1698a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f1699b;

        /* renamed from: c */
        final /* synthetic */ View f1700c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            e.this = r1;
            this.f1698a = iVar;
            this.f1699b = viewPropertyAnimator;
            this.f1700c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1699b.setListener(null);
            this.f1700c.setAlpha(1.0f);
            this.f1700c.setTranslationX(0.0f);
            this.f1700c.setTranslationY(0.0f);
            e.this.D(this.f1698a.f1703b, false);
            e.this.r.remove(this.f1698a.f1703b);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.E(this.f1698a.f1703b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.d0 f1702a;

        /* renamed from: b */
        public RecyclerView.d0 f1703b;

        /* renamed from: c */
        public int f1704c;

        /* renamed from: d */
        public int f1705d;

        /* renamed from: e */
        public int f1706e;

        /* renamed from: f */
        public int f1707f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f1702a = d0Var;
            this.f1703b = d0Var2;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f1704c = i;
            this.f1705d = i2;
            this.f1706e = i3;
            this.f1707f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1702a + ", newHolder=" + this.f1703b + ", fromX=" + this.f1704c + ", fromY=" + this.f1705d + ", toX=" + this.f1706e + ", toY=" + this.f1707f + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.d0 f1708a;

        /* renamed from: b */
        public int f1709b;

        /* renamed from: c */
        public int f1710c;

        /* renamed from: d */
        public int f1711d;

        /* renamed from: e */
        public int f1712e;

        j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f1708a = d0Var;
            this.f1709b = i;
            this.f1710c = i2;
            this.f1711d = i3;
            this.f1712e = i4;
        }
    }

    private void U(RecyclerView.d0 d0Var) {
        View view = d0Var.f1551a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void X(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Z(iVar, d0Var) && iVar.f1702a == null && iVar.f1703b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Y(i iVar) {
        RecyclerView.d0 d0Var = iVar.f1702a;
        if (d0Var != null) {
            Z(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f1703b;
        if (d0Var2 != null) {
            Z(iVar, d0Var2);
        }
    }

    private boolean Z(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.f1703b == d0Var) {
            iVar.f1703b = null;
        } else if (iVar.f1702a != d0Var) {
            return false;
        } else {
            iVar.f1702a = null;
            z = true;
        }
        d0Var.f1551a.setAlpha(1.0f);
        d0Var.f1551a.setTranslationX(0.0f);
        d0Var.f1551a.setTranslationY(0.0f);
        D(d0Var, z);
        return true;
    }

    private void a0(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.f1551a.animate().setInterpolator(s);
        j(d0Var);
    }

    @Override // androidx.recyclerview.widget.t
    public boolean A(RecyclerView.d0 d0Var) {
        a0(d0Var);
        this.f1673h.add(d0Var);
        return true;
    }

    void R(RecyclerView.d0 d0Var) {
        View view = d0Var.f1551a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new C0028e(d0Var, view, animate)).start();
    }

    void S(i iVar) {
        RecyclerView.d0 d0Var = iVar.f1702a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f1551a;
        RecyclerView.d0 d0Var2 = iVar.f1703b;
        if (d0Var2 != null) {
            view = d0Var2.f1551a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m());
            this.r.add(iVar.f1702a);
            duration.translationX(iVar.f1706e - iVar.f1704c);
            duration.translationY(iVar.f1707f - iVar.f1705d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.r.add(iVar.f1703b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    void T(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1551a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, animate)).start();
    }

    void V(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1551a.animate().cancel();
        }
    }

    void W() {
        if (!p()) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.f1551a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f1708a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(d0Var);
                this.j.remove(size);
            }
        }
        X(this.k, d0Var);
        if (this.f1673h.remove(d0Var)) {
            view.setAlpha(1.0f);
            H(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            B(d0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            X(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f1708a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                B(d0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.f1708a.f1551a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f1708a);
            this.j.remove(size);
        }
        for (int size2 = this.f1673h.size() - 1; size2 >= 0; size2--) {
            H(this.f1673h.get(size2));
            this.f1673h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.i.get(size3);
            d0Var.f1551a.setAlpha(1.0f);
            B(d0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            Y(this.k.get(size4));
        }
        this.k.clear();
        if (!p()) {
            return;
        }
        for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
            ArrayList<j> arrayList = this.m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = arrayList.get(size6);
                View view2 = jVar2.f1708a.f1551a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                F(jVar2.f1708a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.d0> arrayList2 = this.l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                d0Var2.f1551a.setAlpha(1.0f);
                B(d0Var2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
            ArrayList<i> arrayList3 = this.n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                Y(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.n.remove(arrayList3);
                }
            }
        }
        V(this.q);
        V(this.p);
        V(this.o);
        V(this.r);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.f1673h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v() {
        boolean z = !this.f1673h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.f1673h.iterator();
            while (it.hasNext()) {
                U(it.next());
            }
            this.f1673h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    b.g.l.t.b0(arrayList.get(0).f1708a.f1551a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.k);
                this.n.add(arrayList2);
                this.k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    b.g.l.t.b0(arrayList2.get(0).f1702a.f1551a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (!z4) {
                return;
            }
            ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.i);
            this.l.add(arrayList3);
            this.i.clear();
            c cVar = new c(arrayList3);
            if (!z && !z2 && !z3) {
                cVar.run();
                return;
            }
            long j2 = 0;
            long o = z ? o() : 0L;
            long n = z2 ? n() : 0L;
            if (z3) {
                j2 = m();
            }
            b.g.l.t.b0(arrayList3.get(0).f1551a, cVar, o + Math.max(n, j2));
        }
    }

    @Override // androidx.recyclerview.widget.t
    public boolean x(RecyclerView.d0 d0Var) {
        a0(d0Var);
        d0Var.f1551a.setAlpha(0.0f);
        this.i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return z(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.f1551a.getTranslationX();
        float translationY = d0Var.f1551a.getTranslationY();
        float alpha = d0Var.f1551a.getAlpha();
        a0(d0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        d0Var.f1551a.setTranslationX(translationX);
        d0Var.f1551a.setTranslationY(translationY);
        d0Var.f1551a.setAlpha(alpha);
        if (d0Var2 != null) {
            a0(d0Var2);
            d0Var2.f1551a.setTranslationX(-i6);
            d0Var2.f1551a.setTranslationY(-i7);
            d0Var2.f1551a.setAlpha(0.0f);
        }
        this.k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean z(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f1551a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.f1551a.getTranslationY());
        a0(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            F(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }
}
