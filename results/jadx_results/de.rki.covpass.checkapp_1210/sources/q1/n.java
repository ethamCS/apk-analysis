package q1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class n implements Cloneable {

    /* renamed from: w4 */
    private static final int[] f19416w4 = {2, 1, 3, 4};

    /* renamed from: x4 */
    private static final g f19417x4 = new a();

    /* renamed from: y4 */
    private static ThreadLocal<i0.a<Animator, d>> f19418y4 = new ThreadLocal<>();

    /* renamed from: i4 */
    private ArrayList<t> f19429i4;

    /* renamed from: j4 */
    private ArrayList<t> f19430j4;

    /* renamed from: s4 */
    q f19440s4;

    /* renamed from: t4 */
    private e f19441t4;

    /* renamed from: u4 */
    private i0.a<String, String> f19442u4;

    /* renamed from: c */
    private String f19421c = getClass().getName();

    /* renamed from: d */
    private long f19423d = -1;

    /* renamed from: q */
    long f19437q = -1;

    /* renamed from: x */
    private TimeInterpolator f19444x = null;

    /* renamed from: y */
    ArrayList<Integer> f19445y = new ArrayList<>();
    ArrayList<View> U3 = new ArrayList<>();
    private ArrayList<String> V3 = null;
    private ArrayList<Class<?>> W3 = null;
    private ArrayList<Integer> X3 = null;
    private ArrayList<View> Y3 = null;
    private ArrayList<Class<?>> Z3 = null;

    /* renamed from: a4 */
    private ArrayList<String> f19419a4 = null;

    /* renamed from: b4 */
    private ArrayList<Integer> f19420b4 = null;

    /* renamed from: c4 */
    private ArrayList<View> f19422c4 = null;

    /* renamed from: d4 */
    private ArrayList<Class<?>> f19424d4 = null;

    /* renamed from: e4 */
    private u f19425e4 = new u();

    /* renamed from: f4 */
    private u f19426f4 = new u();

    /* renamed from: g4 */
    r f19427g4 = null;

    /* renamed from: h4 */
    private int[] f19428h4 = f19416w4;

    /* renamed from: k4 */
    private ViewGroup f19431k4 = null;

    /* renamed from: l4 */
    boolean f19432l4 = false;

    /* renamed from: m4 */
    ArrayList<Animator> f19433m4 = new ArrayList<>();

    /* renamed from: n4 */
    private int f19434n4 = 0;

    /* renamed from: o4 */
    private boolean f19435o4 = false;

    /* renamed from: p4 */
    private boolean f19436p4 = false;

    /* renamed from: q4 */
    private ArrayList<f> f19438q4 = null;

    /* renamed from: r4 */
    private ArrayList<Animator> f19439r4 = new ArrayList<>();

    /* renamed from: v4 */
    private g f19443v4 = f19417x4;

    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // q1.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i0.a f19446a;

        b(i0.a aVar) {
            n.this = r1;
            this.f19446a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19446a.remove(animator);
            n.this.f19433m4.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            n.this.f19433m4.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
            n.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n.this.q();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f19449a;

        /* renamed from: b */
        String f19450b;

        /* renamed from: c */
        t f19451c;

        /* renamed from: d */
        l0 f19452d;

        /* renamed from: e */
        n f19453e;

        d(View view, String str, n nVar, l0 l0Var, t tVar) {
            this.f19449a = view;
            this.f19450b = str;
            this.f19451c = tVar;
            this.f19452d = l0Var;
            this.f19453e = nVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract Rect a(n nVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(n nVar);

        void b(n nVar);

        void c(n nVar);

        void d(n nVar);

        void e(n nVar);
    }

    private static i0.a<Animator, d> D() {
        i0.a<Animator, d> aVar = f19418y4.get();
        if (aVar == null) {
            i0.a<Animator, d> aVar2 = new i0.a<>();
            f19418y4.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static boolean O(t tVar, t tVar2, String str) {
        Object obj = tVar.f19468a.get(str);
        Object obj2 = tVar2.f19468a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    private void P(i0.a<View, t> aVar, i0.a<View, t> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && N(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && N(view)) {
                t tVar = aVar.get(valueAt);
                t tVar2 = aVar2.get(view);
                if (tVar != null && tVar2 != null) {
                    this.f19429i4.add(tVar);
                    this.f19430j4.add(tVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(i0.a<View, t> aVar, i0.a<View, t> aVar2) {
        t remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j10 = aVar.j(size);
            if (j10 != null && N(j10) && (remove = aVar2.remove(j10)) != null && N(remove.f19469b)) {
                this.f19429i4.add(aVar.l(size));
                this.f19430j4.add(remove);
            }
        }
    }

    private void R(i0.a<View, t> aVar, i0.a<View, t> aVar2, i0.d<View> dVar, i0.d<View> dVar2) {
        View g10;
        int p10 = dVar.p();
        for (int i10 = 0; i10 < p10; i10++) {
            View q10 = dVar.q(i10);
            if (q10 != null && N(q10) && (g10 = dVar2.g(dVar.k(i10))) != null && N(g10)) {
                t tVar = aVar.get(q10);
                t tVar2 = aVar2.get(g10);
                if (tVar != null && tVar2 != null) {
                    this.f19429i4.add(tVar);
                    this.f19430j4.add(tVar2);
                    aVar.remove(q10);
                    aVar2.remove(g10);
                }
            }
        }
    }

    private void S(i0.a<View, t> aVar, i0.a<View, t> aVar2, i0.a<String, View> aVar3, i0.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View n10 = aVar3.n(i10);
            if (n10 != null && N(n10) && (view = aVar4.get(aVar3.j(i10))) != null && N(view)) {
                t tVar = aVar.get(n10);
                t tVar2 = aVar2.get(view);
                if (tVar != null && tVar2 != null) {
                    this.f19429i4.add(tVar);
                    this.f19430j4.add(tVar2);
                    aVar.remove(n10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(u uVar, u uVar2) {
        i0.a<View, t> aVar = new i0.a<>(uVar.f19471a);
        i0.a<View, t> aVar2 = new i0.a<>(uVar2.f19471a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19428h4;
            if (i10 >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                Q(aVar, aVar2);
            } else if (i11 == 2) {
                S(aVar, aVar2, uVar.f19474d, uVar2.f19474d);
            } else if (i11 == 3) {
                P(aVar, aVar2, uVar.f19472b, uVar2.f19472b);
            } else if (i11 == 4) {
                R(aVar, aVar2, uVar.f19473c, uVar2.f19473c);
            }
            i10++;
        }
    }

    private void Z(Animator animator, i0.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(i0.a<View, t> aVar, i0.a<View, t> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            t n10 = aVar.n(i10);
            if (N(n10.f19469b)) {
                this.f19429i4.add(n10);
                this.f19430j4.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            t n11 = aVar2.n(i11);
            if (N(n11.f19469b)) {
                this.f19430j4.add(n11);
                this.f19429i4.add(null);
            }
        }
    }

    private static void e(u uVar, View view, t tVar) {
        uVar.f19471a.put(view, tVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (uVar.f19472b.indexOfKey(id2) >= 0) {
                uVar.f19472b.put(id2, null);
            } else {
                uVar.f19472b.put(id2, view);
            }
        }
        String J = androidx.core.view.y.J(view);
        if (J != null) {
            if (uVar.f19474d.containsKey(J)) {
                uVar.f19474d.put(J, null);
            } else {
                uVar.f19474d.put(J, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (uVar.f19473c.i(itemIdAtPosition) < 0) {
                androidx.core.view.y.x0(view, true);
                uVar.f19473c.l(itemIdAtPosition, view);
                return;
            }
            View g10 = uVar.f19473c.g(itemIdAtPosition);
            if (g10 == null) {
                return;
            }
            androidx.core.view.y.x0(g10, false);
            uVar.f19473c.l(itemIdAtPosition, null);
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.X3;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList<View> arrayList2 = this.Y3;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.Z3;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.Z3.get(i10).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            t tVar = new t(view);
            if (z10) {
                j(tVar);
            } else {
                g(tVar);
            }
            tVar.f19470c.add(this);
            i(tVar);
            e(z10 ? this.f19425e4 : this.f19426f4, view, tVar);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ArrayList<Integer> arrayList4 = this.f19420b4;
        if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList<View> arrayList5 = this.f19422c4;
        if (arrayList5 != null && arrayList5.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList6 = this.f19424d4;
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (this.f19424d4.get(i11).isInstance(view)) {
                    return;
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            h(viewGroup.getChildAt(i12), z10);
        }
    }

    public String A() {
        return this.f19421c;
    }

    public g B() {
        return this.f19443v4;
    }

    public q C() {
        return this.f19440s4;
    }

    public long E() {
        return this.f19423d;
    }

    public List<Integer> F() {
        return this.f19445y;
    }

    public List<String> H() {
        return this.V3;
    }

    public List<Class<?>> I() {
        return this.W3;
    }

    public List<View> J() {
        return this.U3;
    }

    public String[] K() {
        return null;
    }

    public t L(View view, boolean z10) {
        r rVar = this.f19427g4;
        if (rVar != null) {
            return rVar.L(view, z10);
        }
        return (z10 ? this.f19425e4 : this.f19426f4).f19471a.get(view);
    }

    public boolean M(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return false;
        }
        String[] K = K();
        if (K == null) {
            for (String str : tVar.f19468a.keySet()) {
                if (O(tVar, tVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : K) {
            if (!O(tVar, tVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean N(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.X3;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList4 = this.Y3;
            if (arrayList4 != null && arrayList4.contains(view)) {
                return false;
            }
            ArrayList<Class<?>> arrayList5 = this.Z3;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.Z3.get(i10).isInstance(view)) {
                        return false;
                    }
                }
            }
            if (this.f19419a4 != null && androidx.core.view.y.J(view) != null && this.f19419a4.contains(androidx.core.view.y.J(view))) {
                return false;
            }
            if ((this.f19445y.size() == 0 && this.U3.size() == 0 && (((arrayList = this.W3) == null || arrayList.isEmpty()) && ((arrayList2 = this.V3) == null || arrayList2.isEmpty()))) || this.f19445y.contains(Integer.valueOf(id2)) || this.U3.contains(view)) {
                return true;
            }
            ArrayList<String> arrayList6 = this.V3;
            if (arrayList6 != null && arrayList6.contains(androidx.core.view.y.J(view))) {
                return true;
            }
            if (this.W3 != null) {
                for (int i11 = 0; i11 < this.W3.size(); i11++) {
                    if (this.W3.get(i11).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void U(View view) {
        if (!this.f19436p4) {
            i0.a<Animator, d> D = D();
            int size = D.size();
            l0 d10 = b0.d(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d n10 = D.n(i10);
                if (n10.f19449a != null && d10.equals(n10.f19452d)) {
                    q1.a.b(D.j(i10));
                }
            }
            ArrayList<f> arrayList = this.f19438q4;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19438q4.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((f) arrayList2.get(i11)).e(this);
                }
            }
            this.f19435o4 = true;
        }
    }

    public void V(ViewGroup viewGroup) {
        d dVar;
        this.f19429i4 = new ArrayList<>();
        this.f19430j4 = new ArrayList<>();
        T(this.f19425e4, this.f19426f4);
        i0.a<Animator, d> D = D();
        int size = D.size();
        l0 d10 = b0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator j10 = D.j(i10);
            if (j10 != null && (dVar = D.get(j10)) != null && dVar.f19449a != null && d10.equals(dVar.f19452d)) {
                t tVar = dVar.f19451c;
                View view = dVar.f19449a;
                t L = L(view, true);
                t y10 = y(view, true);
                if (L == null && y10 == null) {
                    y10 = this.f19426f4.f19471a.get(view);
                }
                if (!(L == null && y10 == null) && dVar.f19453e.M(tVar, y10)) {
                    if (j10.isRunning() || j10.isStarted()) {
                        j10.cancel();
                    } else {
                        D.remove(j10);
                    }
                }
            }
        }
        p(viewGroup, this.f19425e4, this.f19426f4, this.f19429i4, this.f19430j4);
        a0();
    }

    public n W(f fVar) {
        ArrayList<f> arrayList = this.f19438q4;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f19438q4.size() == 0) {
            this.f19438q4 = null;
        }
        return this;
    }

    public n X(View view) {
        this.U3.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.f19435o4) {
            if (!this.f19436p4) {
                i0.a<Animator, d> D = D();
                int size = D.size();
                l0 d10 = b0.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d n10 = D.n(i10);
                    if (n10.f19449a != null && d10.equals(n10.f19452d)) {
                        q1.a.c(D.j(i10));
                    }
                }
                ArrayList<f> arrayList = this.f19438q4;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f19438q4.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).d(this);
                    }
                }
            }
            this.f19435o4 = false;
        }
    }

    public n a(f fVar) {
        if (this.f19438q4 == null) {
            this.f19438q4 = new ArrayList<>();
        }
        this.f19438q4.add(fVar);
        return this;
    }

    public void a0() {
        h0();
        i0.a<Animator, d> D = D();
        Iterator<Animator> it = this.f19439r4.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (D.containsKey(next)) {
                h0();
                Z(next, D);
            }
        }
        this.f19439r4.clear();
        q();
    }

    public n b0(long j10) {
        this.f19437q = j10;
        return this;
    }

    public n c(View view) {
        this.U3.add(view);
        return this;
    }

    public void c0(e eVar) {
        this.f19441t4 = eVar;
    }

    public void cancel() {
        for (int size = this.f19433m4.size() - 1; size >= 0; size--) {
            this.f19433m4.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f19438q4;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f19438q4.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).c(this);
        }
    }

    public n d0(TimeInterpolator timeInterpolator) {
        this.f19444x = timeInterpolator;
        return this;
    }

    public void e0(g gVar) {
        if (gVar == null) {
            gVar = f19417x4;
        }
        this.f19443v4 = gVar;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(q qVar) {
        this.f19440s4 = qVar;
    }

    public abstract void g(t tVar);

    public n g0(long j10) {
        this.f19423d = j10;
        return this;
    }

    public void h0() {
        if (this.f19434n4 == 0) {
            ArrayList<f> arrayList = this.f19438q4;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19438q4.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).b(this);
                }
            }
            this.f19436p4 = false;
        }
        this.f19434n4++;
    }

    public void i(t tVar) {
        String[] b10;
        if (this.f19440s4 == null || tVar.f19468a.isEmpty() || (b10 = this.f19440s4.b()) == null) {
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= b10.length) {
                z10 = true;
                break;
            } else if (!tVar.f19468a.containsKey(b10[i10])) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        this.f19440s4.a(tVar);
    }

    public String i0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f19437q != -1) {
            str2 = str2 + "dur(" + this.f19437q + ") ";
        }
        if (this.f19423d != -1) {
            str2 = str2 + "dly(" + this.f19423d + ") ";
        }
        if (this.f19444x != null) {
            str2 = str2 + "interp(" + this.f19444x + ") ";
        }
        if (this.f19445y.size() > 0 || this.U3.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f19445y.size() > 0) {
                for (int i10 = 0; i10 < this.f19445y.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19445y.get(i10);
                }
            }
            if (this.U3.size() > 0) {
                for (int i11 = 0; i11 < this.U3.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.U3.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public abstract void j(t tVar);

    public void k(ViewGroup viewGroup, boolean z10) {
        i0.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        l(z10);
        if ((this.f19445y.size() > 0 || this.U3.size() > 0) && (((arrayList = this.V3) == null || arrayList.isEmpty()) && ((arrayList2 = this.W3) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f19445y.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f19445y.get(i10).intValue());
                if (findViewById != null) {
                    t tVar = new t(findViewById);
                    if (z10) {
                        j(tVar);
                    } else {
                        g(tVar);
                    }
                    tVar.f19470c.add(this);
                    i(tVar);
                    e(z10 ? this.f19425e4 : this.f19426f4, findViewById, tVar);
                }
            }
            for (int i11 = 0; i11 < this.U3.size(); i11++) {
                View view = this.U3.get(i11);
                t tVar2 = new t(view);
                if (z10) {
                    j(tVar2);
                } else {
                    g(tVar2);
                }
                tVar2.f19470c.add(this);
                i(tVar2);
                e(z10 ? this.f19425e4 : this.f19426f4, view, tVar2);
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (aVar = this.f19442u4) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f19425e4.f19474d.remove(this.f19442u4.j(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f19425e4.f19474d.put(this.f19442u4.n(i13), view2);
            }
        }
    }

    public void l(boolean z10) {
        u uVar;
        if (z10) {
            this.f19425e4.f19471a.clear();
            this.f19425e4.f19472b.clear();
            uVar = this.f19425e4;
        } else {
            this.f19426f4.f19471a.clear();
            this.f19426f4.f19472b.clear();
            uVar = this.f19426f4;
        }
        uVar.f19473c.c();
    }

    /* renamed from: m */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f19439r4 = new ArrayList<>();
            nVar.f19425e4 = new u();
            nVar.f19426f4 = new u();
            nVar.f19429i4 = null;
            nVar.f19430j4 = null;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    public void p(ViewGroup viewGroup, u uVar, u uVar2, ArrayList<t> arrayList, ArrayList<t> arrayList2) {
        int i10;
        int i11;
        Animator o10;
        View view;
        Animator animator;
        t tVar;
        t tVar2;
        Animator animator2;
        i0.a<Animator, d> D = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            t tVar3 = arrayList.get(i12);
            t tVar4 = arrayList2.get(i12);
            if (tVar3 != null && !tVar3.f19470c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f19470c.contains(this)) {
                tVar4 = null;
            }
            if (tVar3 != null || tVar4 != null) {
                if ((tVar3 == null || tVar4 == null || M(tVar3, tVar4)) && (o10 = o(viewGroup, tVar3, tVar4)) != null) {
                    if (tVar4 != null) {
                        view = tVar4.f19469b;
                        String[] K = K();
                        if (K != null && K.length > 0) {
                            tVar2 = new t(view);
                            i11 = size;
                            t tVar5 = uVar2.f19471a.get(view);
                            if (tVar5 != null) {
                                int i13 = 0;
                                while (i13 < K.length) {
                                    tVar2.f19468a.put(K[i13], tVar5.f19468a.get(K[i13]));
                                    i13++;
                                    i12 = i12;
                                    tVar5 = tVar5;
                                }
                            }
                            i10 = i12;
                            int size2 = D.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    animator2 = o10;
                                    break;
                                }
                                d dVar = D.get(D.j(i14));
                                if (dVar.f19451c != null && dVar.f19449a == view && dVar.f19450b.equals(A()) && dVar.f19451c.equals(tVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i11 = size;
                            i10 = i12;
                            animator2 = o10;
                            tVar2 = null;
                        }
                        animator = animator2;
                        tVar = tVar2;
                    } else {
                        i11 = size;
                        i10 = i12;
                        view = tVar3.f19469b;
                        animator = o10;
                        tVar = null;
                    }
                    if (animator != null) {
                        q qVar = this.f19440s4;
                        if (qVar != null) {
                            long c10 = qVar.c(viewGroup, this, tVar3, tVar4);
                            sparseIntArray.put(this.f19439r4.size(), (int) c10);
                            j10 = Math.min(c10, j10);
                        }
                        D.put(animator, new d(view, A(), this, b0.d(viewGroup), tVar));
                        this.f19439r4.add(animator);
                        j10 = j10;
                    }
                    i12 = i10 + 1;
                    size = i11;
                }
            }
            i11 = size;
            i10 = i12;
            i12 = i10 + 1;
            size = i11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator3 = this.f19439r4.get(sparseIntArray.keyAt(i15));
                animator3.setStartDelay((sparseIntArray.valueAt(i15) - j10) + animator3.getStartDelay());
            }
        }
    }

    public void q() {
        int i10 = this.f19434n4 - 1;
        this.f19434n4 = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.f19438q4;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19438q4.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < this.f19425e4.f19473c.p(); i12++) {
                View q10 = this.f19425e4.f19473c.q(i12);
                if (q10 != null) {
                    androidx.core.view.y.x0(q10, false);
                }
            }
            for (int i13 = 0; i13 < this.f19426f4.f19473c.p(); i13++) {
                View q11 = this.f19426f4.f19473c.q(i13);
                if (q11 != null) {
                    androidx.core.view.y.x0(q11, false);
                }
            }
            this.f19436p4 = true;
        }
    }

    public long t() {
        return this.f19437q;
    }

    public String toString() {
        return i0(BuildConfig.FLAVOR);
    }

    public Rect v() {
        e eVar = this.f19441t4;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e w() {
        return this.f19441t4;
    }

    public TimeInterpolator x() {
        return this.f19444x;
    }

    public t y(View view, boolean z10) {
        r rVar = this.f19427g4;
        if (rVar != null) {
            return rVar.y(view, z10);
        }
        ArrayList<t> arrayList = z10 ? this.f19429i4 : this.f19430j4;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            t tVar = arrayList.get(i11);
            if (tVar == null) {
                return null;
            }
            if (tVar.f19469b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.f19430j4 : this.f19429i4).get(i10);
    }
}
