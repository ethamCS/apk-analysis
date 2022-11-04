package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: s */
    private static TimeInterpolator f4677s;

    /* renamed from: h */
    private ArrayList<RecyclerView.d0> f4678h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.d0> f4679i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<j> f4680j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<i> f4681k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.d0>> f4682l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<j>> f4683m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<i>> f4684n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.d0> f4685o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.d0> f4686p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.d0> f4687q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.d0> f4688r = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f4689c;

        a(ArrayList arrayList) {
            c.this = r1;
            this.f4689c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4689c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f4723a, jVar.f4724b, jVar.f4725c, jVar.f4726d, jVar.f4727e);
            }
            this.f4689c.clear();
            c.this.f4683m.remove(this.f4689c);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f4691c;

        b(ArrayList arrayList) {
            c.this = r1;
            this.f4691c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4691c.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f4691c.clear();
            c.this.f4684n.remove(this.f4691c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class RunnableC0058c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ ArrayList f4693c;

        RunnableC0058c(ArrayList arrayList) {
            c.this = r1;
            this.f4693c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4693c.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.f4693c.clear();
            c.this.f4682l.remove(this.f4693c);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f4695a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4696b;

        /* renamed from: c */
        final /* synthetic */ View f4697c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            c.this = r1;
            this.f4695a = d0Var;
            this.f4696b = viewPropertyAnimator;
            this.f4697c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4696b.setListener(null);
            this.f4697c.setAlpha(1.0f);
            c.this.G(this.f4695a);
            c.this.f4687q.remove(this.f4695a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f4695a);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f4699a;

        /* renamed from: b */
        final /* synthetic */ View f4700b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4701c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            c.this = r1;
            this.f4699a = d0Var;
            this.f4700b = view;
            this.f4701c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4700b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4701c.setListener(null);
            c.this.A(this.f4699a);
            c.this.f4685o.remove(this.f4699a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f4699a);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.d0 f4703a;

        /* renamed from: b */
        final /* synthetic */ int f4704b;

        /* renamed from: c */
        final /* synthetic */ View f4705c;

        /* renamed from: d */
        final /* synthetic */ int f4706d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4707e;

        f(RecyclerView.d0 d0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            c.this = r1;
            this.f4703a = d0Var;
            this.f4704b = i10;
            this.f4705c = view;
            this.f4706d = i11;
            this.f4707e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4704b != 0) {
                this.f4705c.setTranslationX(0.0f);
            }
            if (this.f4706d != 0) {
                this.f4705c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4707e.setListener(null);
            c.this.E(this.f4703a);
            c.this.f4686p.remove(this.f4703a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f4703a);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f4709a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4710b;

        /* renamed from: c */
        final /* synthetic */ View f4711c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            c.this = r1;
            this.f4709a = iVar;
            this.f4710b = viewPropertyAnimator;
            this.f4711c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4710b.setListener(null);
            this.f4711c.setAlpha(1.0f);
            this.f4711c.setTranslationX(0.0f);
            this.f4711c.setTranslationY(0.0f);
            c.this.C(this.f4709a.f4717a, true);
            c.this.f4688r.remove(this.f4709a.f4717a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4709a.f4717a, true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f4713a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4714b;

        /* renamed from: c */
        final /* synthetic */ View f4715c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            c.this = r1;
            this.f4713a = iVar;
            this.f4714b = viewPropertyAnimator;
            this.f4715c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4714b.setListener(null);
            this.f4715c.setAlpha(1.0f);
            this.f4715c.setTranslationX(0.0f);
            this.f4715c.setTranslationY(0.0f);
            c.this.C(this.f4713a.f4718b, false);
            c.this.f4688r.remove(this.f4713a.f4718b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4713a.f4718b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.d0 f4717a;

        /* renamed from: b */
        public RecyclerView.d0 f4718b;

        /* renamed from: c */
        public int f4719c;

        /* renamed from: d */
        public int f4720d;

        /* renamed from: e */
        public int f4721e;

        /* renamed from: f */
        public int f4722f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f4717a = d0Var;
            this.f4718b = d0Var2;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
            this(d0Var, d0Var2);
            this.f4719c = i10;
            this.f4720d = i11;
            this.f4721e = i12;
            this.f4722f = i13;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4717a + ", newHolder=" + this.f4718b + ", fromX=" + this.f4719c + ", fromY=" + this.f4720d + ", toX=" + this.f4721e + ", toY=" + this.f4722f + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.d0 f4723a;

        /* renamed from: b */
        public int f4724b;

        /* renamed from: c */
        public int f4725c;

        /* renamed from: d */
        public int f4726d;

        /* renamed from: e */
        public int f4727e;

        j(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
            this.f4723a = d0Var;
            this.f4724b = i10;
            this.f4725c = i11;
            this.f4726d = i12;
            this.f4727e = i13;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.f4533a;
        ViewPropertyAnimator animate = view.animate();
        this.f4687q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.f4717a == null && iVar.f4718b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f4717a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f4718b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z10 = false;
        if (iVar.f4718b == d0Var) {
            iVar.f4718b = null;
        } else if (iVar.f4717a != d0Var) {
            return false;
        } else {
            iVar.f4717a = null;
            z10 = true;
        }
        d0Var.f4533a.setAlpha(1.0f);
        d0Var.f4533a.setTranslationX(0.0f);
        d0Var.f4533a.setTranslationY(0.0f);
        C(d0Var, z10);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f4677s == null) {
            f4677s = new ValueAnimator().getInterpolator();
        }
        d0Var.f4533a.animate().setInterpolator(f4677s);
        j(d0Var);
    }

    void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.f4533a;
        ViewPropertyAnimator animate = view.animate();
        this.f4685o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.d0 d0Var = iVar.f4717a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f4533a;
        RecyclerView.d0 d0Var2 = iVar.f4718b;
        if (d0Var2 != null) {
            view = d0Var2.f4533a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m());
            this.f4688r.add(iVar.f4717a);
            duration.translationX(iVar.f4721e - iVar.f4719c);
            duration.translationY(iVar.f4722f - iVar.f4720d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f4688r.add(iVar.f4718b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    void S(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f4533a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4686p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i14, view, i15, animate)).start();
    }

    void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4533a.animate().cancel();
        }
    }

    void V() {
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
        View view = d0Var.f4533a;
        view.animate().cancel();
        int size = this.f4680j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4680j.get(size).f4723a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f4680j.remove(size);
            }
        }
        W(this.f4681k, d0Var);
        if (this.f4678h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f4679i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.f4684n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4684n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f4684n.remove(size2);
            }
        }
        for (int size3 = this.f4683m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4683m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4723a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4683m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4682l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f4682l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f4682l.remove(size5);
                }
            }
        }
        this.f4687q.remove(d0Var);
        this.f4685o.remove(d0Var);
        this.f4688r.remove(d0Var);
        this.f4686p.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f4680j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4680j.get(size);
            View view = jVar.f4723a.f4533a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f4723a);
            this.f4680j.remove(size);
        }
        for (int size2 = this.f4678h.size() - 1; size2 >= 0; size2--) {
            G(this.f4678h.get(size2));
            this.f4678h.remove(size2);
        }
        int size3 = this.f4679i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f4679i.get(size3);
            d0Var.f4533a.setAlpha(1.0f);
            A(d0Var);
            this.f4679i.remove(size3);
        }
        for (int size4 = this.f4681k.size() - 1; size4 >= 0; size4--) {
            X(this.f4681k.get(size4));
        }
        this.f4681k.clear();
        if (!p()) {
            return;
        }
        for (int size5 = this.f4683m.size() - 1; size5 >= 0; size5--) {
            ArrayList<j> arrayList = this.f4683m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = arrayList.get(size6);
                View view2 = jVar2.f4723a.f4533a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                E(jVar2.f4723a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f4683m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f4682l.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.d0> arrayList2 = this.f4682l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                d0Var2.f4533a.setAlpha(1.0f);
                A(d0Var2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f4682l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f4684n.size() - 1; size9 >= 0; size9--) {
            ArrayList<i> arrayList3 = this.f4684n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                X(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f4684n.remove(arrayList3);
                }
            }
        }
        U(this.f4687q);
        U(this.f4686p);
        U(this.f4685o);
        U(this.f4688r);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return !this.f4679i.isEmpty() || !this.f4681k.isEmpty() || !this.f4680j.isEmpty() || !this.f4678h.isEmpty() || !this.f4686p.isEmpty() || !this.f4687q.isEmpty() || !this.f4685o.isEmpty() || !this.f4688r.isEmpty() || !this.f4683m.isEmpty() || !this.f4682l.isEmpty() || !this.f4684n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z10 = !this.f4678h.isEmpty();
        boolean z11 = !this.f4680j.isEmpty();
        boolean z12 = !this.f4681k.isEmpty();
        boolean z13 = !this.f4679i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.d0> it = this.f4678h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f4678h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4680j);
                this.f4683m.add(arrayList);
                this.f4680j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    y.h0(arrayList.get(0).f4723a.f4533a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4681k);
                this.f4684n.add(arrayList2);
                this.f4681k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    y.h0(arrayList2.get(0).f4717a.f4533a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (!z13) {
                return;
            }
            ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f4679i);
            this.f4682l.add(arrayList3);
            this.f4679i.clear();
            RunnableC0058c runnableC0058c = new RunnableC0058c(arrayList3);
            if (!z10 && !z11 && !z12) {
                runnableC0058c.run();
                return;
            }
            long j10 = 0;
            long o10 = z10 ? o() : 0L;
            long n10 = z11 ? n() : 0L;
            if (z12) {
                j10 = m();
            }
            y.h0(arrayList3.get(0).f4533a, runnableC0058c, o10 + Math.max(n10, j10));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.f4533a.setAlpha(0.0f);
        this.f4679i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
        if (d0Var == d0Var2) {
            return y(d0Var, i10, i11, i12, i13);
        }
        float translationX = d0Var.f4533a.getTranslationX();
        float translationY = d0Var.f4533a.getTranslationY();
        float alpha = d0Var.f4533a.getAlpha();
        Z(d0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        d0Var.f4533a.setTranslationX(translationX);
        d0Var.f4533a.setTranslationY(translationY);
        d0Var.f4533a.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.f4533a.setTranslationX(-i14);
            d0Var2.f4533a.setTranslationY(-i15);
            d0Var2.f4533a.setAlpha(0.0f);
        }
        this.f4681k.add(new i(d0Var, d0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f4533a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d0Var.f4533a.getTranslationY());
        Z(d0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(d0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4680j.add(new j(d0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f4678h.add(d0Var);
        return true;
    }
}
