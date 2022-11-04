package b.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<b.d.a<Animator, d>> J = new ThreadLocal<>();
    p D;
    private e E;
    private b.d.a<String, String> F;
    private ArrayList<s> u;
    private ArrayList<s> v;

    /* renamed from: b */
    private String f2753b = getClass().getName();

    /* renamed from: c */
    private long f2754c = -1;

    /* renamed from: d */
    long f2755d = -1;

    /* renamed from: e */
    private TimeInterpolator f2756e = null;

    /* renamed from: f */
    ArrayList<Integer> f2757f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<View> f2758g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f2759h = null;
    private ArrayList<Class<?>> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class<?>> p = null;
    private t q = new t();
    private t r = new t();
    q s = null;
    private int[] t = H;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private g G = I;

    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // b.p.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ b.d.a f2760a;

        b(b.d.a aVar) {
            m.this = r1;
            this.f2760a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2760a.remove(animator);
            m.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.x.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
            m.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.r();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f2763a;

        /* renamed from: b */
        String f2764b;

        /* renamed from: c */
        s f2765c;

        /* renamed from: d */
        m0 f2766d;

        /* renamed from: e */
        m f2767e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f2763a = view;
            this.f2764b = str;
            this.f2765c = sVar;
            this.f2766d = m0Var;
            this.f2767e = mVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean K(s sVar, s sVar2, String str) {
        Object obj = sVar.f2780a.get(str);
        Object obj2 = sVar2.f2780a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    private void L(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && J(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && J(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void M(b.d.a<View, s> aVar, b.d.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.i(size);
            if (i != null && J(i) && (remove = aVar2.remove(i)) != null && J(remove.f2781b)) {
                this.u.add(aVar.k(size));
                this.v.add(remove);
            }
        }
    }

    private void O(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, b.d.d<View> dVar, b.d.d<View> dVar2) {
        View g2;
        int o = dVar.o();
        for (int i = 0; i < o; i++) {
            View p = dVar.p(i);
            if (p != null && J(p) && (g2 = dVar2.g(dVar.j(i))) != null && J(g2)) {
                s sVar = aVar.get(p);
                s sVar2 = aVar2.get(g2);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(p);
                    aVar2.remove(g2);
                }
            }
        }
    }

    private void P(b.d.a<View, s> aVar, b.d.a<View, s> aVar2, b.d.a<String, View> aVar3, b.d.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.m(i);
            if (m != null && J(m) && (view = aVar4.get(aVar3.i(i))) != null && J(view)) {
                s sVar = aVar.get(m);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(t tVar, t tVar2) {
        b.d.a<View, s> aVar = new b.d.a<>(tVar.f2783a);
        b.d.a<View, s> aVar2 = new b.d.a<>(tVar2.f2783a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                e(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                M(aVar, aVar2);
            } else if (i2 == 2) {
                P(aVar, aVar2, tVar.f2786d, tVar2.f2786d);
            } else if (i2 == 3) {
                L(aVar, aVar2, tVar.f2784b, tVar2.f2784b);
            } else if (i2 == 4) {
                O(aVar, aVar2, tVar.f2785c, tVar2.f2785c);
            }
            i++;
        }
    }

    private void W(Animator animator, b.d.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            g(animator);
        }
    }

    private void e(b.d.a<View, s> aVar, b.d.a<View, s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            s m = aVar.m(i);
            if (J(m.f2781b)) {
                this.u.add(m);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            s m2 = aVar2.m(i2);
            if (J(m2.f2781b)) {
                this.v.add(m2);
                this.u.add(null);
            }
        }
    }

    private static void f(t tVar, View view, s sVar) {
        tVar.f2783a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f2784b.indexOfKey(id) >= 0) {
                tVar.f2784b.put(id, null);
            } else {
                tVar.f2784b.put(id, view);
            }
        }
        String G = b.g.l.t.G(view);
        if (G != null) {
            if (tVar.f2786d.containsKey(G)) {
                tVar.f2786d.put(G, null);
            } else {
                tVar.f2786d.put(G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (tVar.f2785c.i(itemIdAtPosition) < 0) {
                b.g.l.t.q0(view, true);
                tVar.f2785c.l(itemIdAtPosition, view);
                return;
            }
            View g2 = tVar.f2785c.g(itemIdAtPosition);
            if (g2 == null) {
                return;
            }
            b.g.l.t.q0(g2, false);
            tVar.f2785c.l(itemIdAtPosition, null);
        }
    }

    private void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.k;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.l;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.l.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z) {
                l(sVar);
            } else {
                h(sVar);
            }
            sVar.f2782c.add(this);
            j(sVar);
            f(z ? this.q : this.r, view, sVar);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ArrayList<Integer> arrayList4 = this.n;
        if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList5 = this.o;
        if (arrayList5 != null && arrayList5.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList6 = this.p;
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (this.p.get(i2).isInstance(view)) {
                    return;
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            i(viewGroup.getChildAt(i3), z);
        }
    }

    private static b.d.a<Animator, d> z() {
        b.d.a<Animator, d> aVar = J.get();
        if (aVar == null) {
            b.d.a<Animator, d> aVar2 = new b.d.a<>();
            J.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public long A() {
        return this.f2754c;
    }

    public List<Integer> B() {
        return this.f2757f;
    }

    public List<String> C() {
        return this.f2759h;
    }

    public List<Class<?>> D() {
        return this.i;
    }

    public List<View> E() {
        return this.f2758g;
    }

    public String[] F() {
        return null;
    }

    public s G(View view, boolean z) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.G(view, z);
        }
        return (z ? this.q : this.r).f2783a.get(view);
    }

    public boolean H(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] F = F();
        if (F == null) {
            for (String str : sVar.f2780a.keySet()) {
                if (K(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : F) {
            if (!K(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean J(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.k;
            if (arrayList4 != null && arrayList4.contains(view)) {
                return false;
            }
            ArrayList<Class<?>> arrayList5 = this.l;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                for (int i = 0; i < size; i++) {
                    if (this.l.get(i).isInstance(view)) {
                        return false;
                    }
                }
            }
            if (this.m != null && b.g.l.t.G(view) != null && this.m.contains(b.g.l.t.G(view))) {
                return false;
            }
            if ((this.f2757f.size() == 0 && this.f2758g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2759h) == null || arrayList2.isEmpty()))) || this.f2757f.contains(Integer.valueOf(id)) || this.f2758g.contains(view)) {
                return true;
            }
            ArrayList<String> arrayList6 = this.f2759h;
            if (arrayList6 != null && arrayList6.contains(b.g.l.t.G(view))) {
                return true;
            }
            if (this.i != null) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    if (this.i.get(i2).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void R(View view) {
        if (!this.A) {
            b.d.a<Animator, d> z = z();
            int size = z.size();
            m0 d2 = c0.d(view);
            for (int i = size - 1; i >= 0; i--) {
                d m = z.m(i);
                if (m.f2763a != null && d2.equals(m.f2766d)) {
                    b.p.a.b(z.i(i));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.z = true;
        }
    }

    public void S(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        Q(this.q, this.r);
        b.d.a<Animator, d> z = z();
        int size = z.size();
        m0 d2 = c0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = z.i(i);
            if (i2 != null && (dVar = z.get(i2)) != null && dVar.f2763a != null && d2.equals(dVar.f2766d)) {
                s sVar = dVar.f2765c;
                View view = dVar.f2763a;
                s G = G(view, true);
                s v = v(view, true);
                if (G == null && v == null) {
                    v = this.r.f2783a.get(view);
                }
                if (!(G == null && v == null) && dVar.f2767e.H(sVar, v)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        z.remove(i2);
                    }
                }
            }
        }
        q(viewGroup, this.q, this.r, this.u, this.v);
        X();
    }

    public m T(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public m U(View view) {
        this.f2758g.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.z) {
            if (!this.A) {
                b.d.a<Animator, d> z = z();
                int size = z.size();
                m0 d2 = c0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d m = z.m(i);
                    if (m.f2763a != null && d2.equals(m.f2766d)) {
                        b.p.a.c(z.i(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).b(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public void X() {
        e0();
        b.d.a<Animator, d> z = z();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (z.containsKey(next)) {
                e0();
                W(next, z);
            }
        }
        this.C.clear();
        r();
    }

    public m Y(long j) {
        this.f2755d = j;
        return this;
    }

    public void Z(e eVar) {
        this.E = eVar;
    }

    public m a0(TimeInterpolator timeInterpolator) {
        this.f2756e = timeInterpolator;
        return this;
    }

    public m b(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public void b0(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void c0(p pVar) {
    }

    public void cancel() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).d(this);
        }
    }

    public m d(View view) {
        this.f2758g.add(view);
        return this;
    }

    public m d0(long j) {
        this.f2754c = j;
        return this;
    }

    public void e0() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).c(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2755d != -1) {
            str2 = str2 + "dur(" + this.f2755d + ") ";
        }
        if (this.f2754c != -1) {
            str2 = str2 + "dly(" + this.f2754c + ") ";
        }
        if (this.f2756e != null) {
            str2 = str2 + "interp(" + this.f2756e + ") ";
        }
        if (this.f2757f.size() > 0 || this.f2758g.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f2757f.size() > 0) {
                for (int i = 0; i < this.f2757f.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f2757f.get(i);
                }
            }
            if (this.f2758g.size() > 0) {
                for (int i2 = 0; i2 < this.f2758g.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f2758g.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    protected void g(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (A() >= 0) {
            animator.setStartDelay(A() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void h(s sVar);

    public void j(s sVar) {
        String[] b2;
        if (this.D == null || sVar.f2780a.isEmpty() || (b2 = this.D.b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= b2.length) {
                z = true;
                break;
            } else if (!sVar.f2780a.containsKey(b2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.D.a(sVar);
    }

    public abstract void l(s sVar);

    public void m(ViewGroup viewGroup, boolean z) {
        b.d.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        n(z);
        if ((this.f2757f.size() > 0 || this.f2758g.size() > 0) && (((arrayList = this.f2759h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f2757f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f2757f.get(i).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z) {
                        l(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f2782c.add(this);
                    j(sVar);
                    f(z ? this.q : this.r, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f2758g.size(); i2++) {
                View view = this.f2758g.get(i2);
                s sVar2 = new s(view);
                if (z) {
                    l(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.f2782c.add(this);
                j(sVar2);
                f(z ? this.q : this.r, view, sVar2);
            }
        } else {
            i(viewGroup, z);
        }
        if (z || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.f2786d.remove(this.F.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.f2786d.put(this.F.m(i4), view2);
            }
        }
    }

    public void n(boolean z) {
        t tVar;
        if (z) {
            this.q.f2783a.clear();
            this.q.f2784b.clear();
            tVar = this.q;
        } else {
            this.r.f2783a.clear();
            this.r.f2784b.clear();
            tVar = this.r;
        }
        tVar.f2785c.d();
    }

    /* renamed from: o */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.q = new t();
            mVar.r = new t();
            mVar.u = null;
            mVar.v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i;
        int i2;
        Animator p;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        b.d.a<Animator, d> z = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            s sVar3 = arrayList.get(i3);
            s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f2782c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f2782c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if ((sVar3 == null || sVar4 == null || H(sVar3, sVar4)) && (p = p(viewGroup, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f2781b;
                        String[] F = F();
                        if (F != null && F.length > 0) {
                            sVar2 = new s(view);
                            i2 = size;
                            s sVar5 = tVar2.f2783a.get(view);
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < F.length) {
                                    sVar2.f2780a.put(F[i4], sVar5.f2780a.get(F[i4]));
                                    i4++;
                                    i3 = i3;
                                    sVar5 = sVar5;
                                }
                            }
                            i = i3;
                            int size2 = z.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = p;
                                    break;
                                }
                                d dVar = z.get(z.i(i5));
                                if (dVar.f2765c != null && dVar.f2763a == view && dVar.f2764b.equals(w()) && dVar.f2765c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = p;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = sVar3.f2781b;
                        animator = p;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.D;
                        if (pVar != null) {
                            long c2 = pVar.c(viewGroup, this, sVar3, sVar4);
                            sparseIntArray.put(this.C.size(), (int) c2);
                            j = Math.min(c2, j);
                        }
                        z.put(animator, new d(view, w(), this, c0.d(viewGroup), sVar));
                        this.C.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    public void r() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.q.f2785c.o(); i3++) {
                View p = this.q.f2785c.p(i3);
                if (p != null) {
                    b.g.l.t.q0(p, false);
                }
            }
            for (int i4 = 0; i4 < this.r.f2785c.o(); i4++) {
                View p2 = this.r.f2785c.p(i4);
                if (p2 != null) {
                    b.g.l.t.q0(p2, false);
                }
            }
            this.A = true;
        }
    }

    public long s() {
        return this.f2755d;
    }

    public e t() {
        return this.E;
    }

    public String toString() {
        return f0("");
    }

    public TimeInterpolator u() {
        return this.f2756e;
    }

    public s v(View view, boolean z) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.v(view, z);
        }
        ArrayList<s> arrayList = z ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f2781b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.v : this.u).get(i);
    }

    public String w() {
        return this.f2753b;
    }

    public g x() {
        return this.G;
    }

    public p y() {
        return this.D;
    }
}
