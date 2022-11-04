package a.m;

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
    private static ThreadLocal<a.d.a<Animator, d>> J = new ThreadLocal<>();
    p D;
    private e E;
    private a.d.a<String, String> F;
    private ArrayList<s> u;
    private ArrayList<s> v;

    /* renamed from: b */
    private String f370b = getClass().getName();

    /* renamed from: c */
    private long f371c = -1;
    long d = -1;
    private TimeInterpolator e = null;
    ArrayList<Integer> f = new ArrayList<>();
    ArrayList<View> g = new ArrayList<>();
    private ArrayList<String> h = null;
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

        @Override // a.m.g
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ a.d.a f372a;

        b(a.d.a aVar) {
            m.this = r1;
            this.f372a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f372a.remove(animator);
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
            m.this.b();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f375a;

        /* renamed from: b */
        String f376b;

        /* renamed from: c */
        s f377c;
        m0 d;
        m e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f375a = view;
            this.f376b = str;
            this.f377c = sVar;
            this.d = m0Var;
            this.e = mVar;
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

    private void a(a.d.a<View, s> aVar, a.d.a<View, s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            s d2 = aVar.d(i);
            if (b(d2.f391b)) {
                this.u.add(d2);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            s d3 = aVar2.d(i2);
            if (b(d3.f391b)) {
                this.v.add(d3);
                this.u.add(null);
            }
        }
    }

    private void a(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, a.d.a<String, View> aVar3, a.d.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View d2 = aVar3.d(i);
            if (d2 != null && b(d2) && (view = aVar4.get(aVar3.b(i))) != null && b(view)) {
                s sVar = aVar.get(d2);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(d2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, a.d.d<View> dVar, a.d.d<View> dVar2) {
        View b2;
        int b3 = dVar.b();
        for (int i = 0; i < b3; i++) {
            View c2 = dVar.c(i);
            if (c2 != null && b(c2) && (b2 = dVar2.b(dVar.a(i))) != null && b(b2)) {
                s sVar = aVar.get(c2);
                s sVar2 = aVar2.get(b2);
                if (sVar != null && sVar2 != null) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(c2);
                    aVar2.remove(b2);
                }
            }
        }
    }

    private void a(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && b(view)) {
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

    private void a(t tVar, t tVar2) {
        a.d.a<View, s> aVar = new a.d.a<>(tVar.f393a);
        a.d.a<View, s> aVar2 = new a.d.a<>(tVar2.f393a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                a(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                b(aVar, aVar2);
            } else if (i2 == 2) {
                a(aVar, aVar2, tVar.d, tVar2.d);
            } else if (i2 == 3) {
                a(aVar, aVar2, tVar.f394b, tVar2.f394b);
            } else if (i2 == 4) {
                a(aVar, aVar2, tVar.f395c, tVar2.f395c);
            }
            i++;
        }
    }

    private static void a(t tVar, View view, s sVar) {
        tVar.f393a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f394b.indexOfKey(id) >= 0) {
                tVar.f394b.put(id, null);
            } else {
                tVar.f394b.put(id, view);
            }
        }
        String v = a.g.l.u.v(view);
        if (v != null) {
            if (tVar.d.containsKey(v)) {
                tVar.d.put(v, null);
            } else {
                tVar.d.put(v, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (tVar.f395c.c(itemIdAtPosition) < 0) {
                a.g.l.u.b(view, true);
                tVar.f395c.c(itemIdAtPosition, view);
                return;
            }
            View b2 = tVar.f395c.b(itemIdAtPosition);
            if (b2 == null) {
                return;
            }
            a.g.l.u.b(b2, false);
            tVar.f395c.c(itemIdAtPosition, null);
        }
    }

    private void a(Animator animator, a.d.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            a(animator);
        }
    }

    private static boolean a(s sVar, s sVar2, String str) {
        Object obj = sVar.f390a.get(str);
        Object obj2 = sVar2.f390a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    private void b(a.d.a<View, s> aVar, a.d.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b2 = aVar.b(size);
            if (b2 != null && b(b2) && (remove = aVar2.remove(b2)) != null && b(remove.f391b)) {
                this.u.add(aVar.c(size));
                this.v.add(remove);
            }
        }
    }

    private void c(View view, boolean z) {
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
                c(sVar);
            } else {
                a(sVar);
            }
            sVar.f392c.add(this);
            b(sVar);
            a(z ? this.q : this.r, view, sVar);
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
            c(viewGroup.getChildAt(i3), z);
        }
    }

    private static a.d.a<Animator, d> q() {
        a.d.a<Animator, d> aVar = J.get();
        if (aVar == null) {
            a.d.a<Animator, d> aVar2 = new a.d.a<>();
            J.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public m a(long j) {
        this.d = j;
        return this;
    }

    public m a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public m a(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
        return this;
    }

    public m a(View view) {
        this.g.add(view);
        return this;
    }

    public s a(View view, boolean z) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.a(view, z);
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
            if (sVar.f391b == view) {
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

    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.d != -1) {
            str2 = str2 + "dur(" + this.d + ") ";
        }
        if (this.f371c != -1) {
            str2 = str2 + "dly(" + this.f371c + ") ";
        }
        if (this.e != null) {
            str2 = str2 + "interp(" + this.e + ") ";
        }
        if (this.f.size() > 0 || this.g.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f.size() > 0) {
                for (int i = 0; i < this.f.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f.get(i);
                }
            }
            if (this.g.size() > 0) {
                for (int i2 = 0; i2 < this.g.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.g.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public void a() {
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
            ((f) arrayList2.get(i)).b(this);
        }
    }

    public void a(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void a(e eVar) {
        this.E = eVar;
    }

    public void a(p pVar) {
        this.D = pVar;
    }

    public abstract void a(s sVar);

    protected void a(Animator animator) {
        if (animator == null) {
            b();
            return;
        }
        if (c() >= 0) {
            animator.setDuration(c());
        }
        if (i() >= 0) {
            animator.setStartDelay(i() + animator.getStartDelay());
        }
        if (e() != null) {
            animator.setInterpolator(e());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void a(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        a(this.q, this.r);
        a.d.a<Animator, d> q = q();
        int size = q.size();
        m0 d2 = c0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b2 = q.b(i);
            if (b2 != null && (dVar = q.get(b2)) != null && dVar.f375a != null && d2.equals(dVar.d)) {
                s sVar = dVar.f377c;
                View view = dVar.f375a;
                s b3 = b(view, true);
                s a2 = a(view, true);
                if (b3 == null && a2 == null) {
                    a2 = this.r.f393a.get(view);
                }
                if (!(b3 == null && a2 == null) && dVar.e.a(sVar, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        q.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.q, this.r, this.u, this.v);
        o();
    }

    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i;
        int i2;
        Animator a2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        a.d.a<Animator, d> q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            s sVar3 = arrayList.get(i3);
            s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f392c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f392c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if ((sVar3 == null || sVar4 == null || a(sVar3, sVar4)) && (a2 = a(viewGroup, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f391b;
                        String[] n = n();
                        if (n != null && n.length > 0) {
                            sVar2 = new s(view);
                            i2 = size;
                            s sVar5 = tVar2.f393a.get(view);
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < n.length) {
                                    sVar2.f390a.put(n[i4], sVar5.f390a.get(n[i4]));
                                    i4++;
                                    i3 = i3;
                                    sVar5 = sVar5;
                                }
                            }
                            i = i3;
                            int size2 = q.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                d dVar = q.get(q.b(i5));
                                if (dVar.f377c != null && dVar.f375a == view && dVar.f376b.equals(f()) && dVar.f377c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = a2;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = sVar3.f391b;
                        animator = a2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.D;
                        if (pVar != null) {
                            long a3 = pVar.a(viewGroup, this, sVar3, sVar4);
                            sparseIntArray.put(this.C.size(), (int) a3);
                            j = Math.min(a3, j);
                        }
                        q.put(animator, new d(view, f(), this, c0.d(viewGroup), sVar));
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

    public void a(ViewGroup viewGroup, boolean z) {
        a.d.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a(z);
        if ((this.f.size() > 0 || this.g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f.get(i).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z) {
                        c(sVar);
                    } else {
                        a(sVar);
                    }
                    sVar.f392c.add(this);
                    b(sVar);
                    a(z ? this.q : this.r, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                View view = this.g.get(i2);
                s sVar2 = new s(view);
                if (z) {
                    c(sVar2);
                } else {
                    a(sVar2);
                }
                sVar2.f392c.add(this);
                b(sVar2);
                a(z ? this.q : this.r, view, sVar2);
            }
        } else {
            c(viewGroup, z);
        }
        if (z || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.d.remove(this.F.b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.d.put(this.F.d(i4), view2);
            }
        }
    }

    public void a(boolean z) {
        t tVar;
        if (z) {
            this.q.f393a.clear();
            this.q.f394b.clear();
            tVar = this.q;
        } else {
            this.r.f393a.clear();
            this.r.f394b.clear();
            tVar = this.r;
        }
        tVar.f395c.a();
    }

    public boolean a(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] n = n();
        if (n == null) {
            for (String str : sVar.f390a.keySet()) {
                if (a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : n) {
            if (!a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public m b(long j) {
        this.f371c = j;
        return this;
    }

    public m b(f fVar) {
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

    public s b(View view, boolean z) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.b(view, z);
        }
        return (z ? this.q : this.r).f393a.get(view);
    }

    public void b() {
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < this.q.f395c.b(); i3++) {
                View c2 = this.q.f395c.c(i3);
                if (c2 != null) {
                    a.g.l.u.b(c2, false);
                }
            }
            for (int i4 = 0; i4 < this.r.f395c.b(); i4++) {
                View c3 = this.r.f395c.c(i4);
                if (c3 != null) {
                    a.g.l.u.b(c3, false);
                }
            }
            this.A = true;
        }
    }

    public void b(s sVar) {
        String[] a2;
        if (this.D == null || sVar.f390a.isEmpty() || (a2 = this.D.a()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                z = true;
                break;
            } else if (!sVar.f390a.containsKey(a2[i])) {
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

    public boolean b(View view) {
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
            if (this.m != null && a.g.l.u.v(view) != null && this.m.contains(a.g.l.u.v(view))) {
                return false;
            }
            if ((this.f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
                return true;
            }
            ArrayList<String> arrayList6 = this.h;
            if (arrayList6 != null && arrayList6.contains(a.g.l.u.v(view))) {
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

    public long c() {
        return this.d;
    }

    public abstract void c(s sVar);

    public void c(View view) {
        if (!this.A) {
            a.d.a<Animator, d> q = q();
            int size = q.size();
            m0 d2 = c0.d(view);
            for (int i = size - 1; i >= 0; i--) {
                d d3 = q.d(i);
                if (d3.f375a != null && d2.equals(d3.d)) {
                    a.m.a.a(q.b(i));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f) arrayList2.get(i2)).d(this);
                }
            }
            this.z = true;
        }
    }

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

    public e d() {
        return this.E;
    }

    public m d(View view) {
        this.g.remove(view);
        return this;
    }

    public TimeInterpolator e() {
        return this.e;
    }

    public void e(View view) {
        if (this.z) {
            if (!this.A) {
                a.d.a<Animator, d> q = q();
                int size = q.size();
                m0 d2 = c0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d d3 = q.d(i);
                    if (d3.f375a != null && d2.equals(d3.d)) {
                        a.m.a.b(q.b(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).e(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public String f() {
        return this.f370b;
    }

    public g g() {
        return this.G;
    }

    public p h() {
        return this.D;
    }

    public long i() {
        return this.f371c;
    }

    public List<Integer> j() {
        return this.f;
    }

    public List<String> k() {
        return this.h;
    }

    public List<Class<?>> l() {
        return this.i;
    }

    public List<View> m() {
        return this.g;
    }

    public String[] n() {
        return null;
    }

    public void o() {
        p();
        a.d.a<Animator, d> q = q();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q.containsKey(next)) {
                p();
                a(next, q);
            }
        }
        this.C.clear();
        b();
    }

    public void p() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String toString() {
        return a("");
    }
}
