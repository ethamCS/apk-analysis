package androidx.fragment.app;

import a.g.l.u;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    private static final int[] f935a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final q f936b;

    /* renamed from: c */
    private static final q f937c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f938b;

        a(ArrayList arrayList) {
            this.f938b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.a(this.f938b, 4);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f939b;

        /* renamed from: c */
        final /* synthetic */ q f940c;
        final /* synthetic */ View d;
        final /* synthetic */ Fragment e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f939b = obj;
            this.f940c = qVar;
            this.d = view;
            this.e = fragment;
            this.f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f939b;
            if (obj != null) {
                this.f940c.b(obj, this.d);
                this.g.addAll(o.a(this.f940c, this.f939b, this.e, this.f, this.d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.d);
                    this.f940c.a(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Fragment f941b;

        /* renamed from: c */
        final /* synthetic */ Fragment f942c;
        final /* synthetic */ boolean d;
        final /* synthetic */ a.d.a e;
        final /* synthetic */ View f;
        final /* synthetic */ q g;
        final /* synthetic */ Rect h;

        c(Fragment fragment, Fragment fragment2, boolean z, a.d.a aVar, View view, q qVar, Rect rect) {
            this.f941b = fragment;
            this.f942c = fragment2;
            this.d = z;
            this.e = aVar;
            this.f = view;
            this.g = qVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.a(this.f941b, this.f942c, this.d, (a.d.a<String, View>) this.e, false);
            View view = this.f;
            if (view != null) {
                this.g.a(view, this.h);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ q f943b;

        /* renamed from: c */
        final /* synthetic */ a.d.a f944c;
        final /* synthetic */ Object d;
        final /* synthetic */ e e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(q qVar, a.d.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f943b = qVar;
            this.f944c = aVar;
            this.d = obj;
            this.e = eVar;
            this.f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.d.a<String, View> a2 = o.a(this.f943b, this.f944c, this.d, this.e);
            if (a2 != null) {
                this.f.addAll(a2.values());
                this.f.add(this.g);
            }
            o.a(this.h, this.i, this.j, a2, false);
            Object obj = this.d;
            if (obj != null) {
                this.f943b.b(obj, this.k, this.f);
                View a3 = o.a(a2, this.e, this.l, this.j);
                if (a3 == null) {
                    return;
                }
                this.f943b.a(a3, this.m);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public Fragment f945a;

        /* renamed from: b */
        public boolean f946b;

        /* renamed from: c */
        public androidx.fragment.app.a f947c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;

        e() {
        }
    }

    static {
        f936b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f937c = a();
    }

    private static a.d.a<String, String> a(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.d.a<String, String> aVar = new a.d.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    static a.d.a<String, View> a(q qVar, a.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.f fVar;
        ArrayList<String> arrayList;
        String a2;
        Fragment fragment = eVar.f945a;
        View F = fragment.F();
        if (aVar.isEmpty() || obj == null || F == null) {
            aVar.clear();
            return null;
        }
        a.d.a<String, View> aVar2 = new a.d.a<>();
        qVar.a((Map<String, View>) aVar2, F);
        androidx.fragment.app.a aVar3 = eVar.f947c;
        if (eVar.f946b) {
            fVar = fragment.q();
            arrayList = aVar3.n;
        } else {
            fVar = fragment.o();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
            aVar2.a((Collection<?>) aVar.values());
        }
        if (fVar != null) {
            fVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String a3 = a(aVar, str);
                    if (a3 != null) {
                        aVar.remove(a3);
                    }
                } else if (!str.equals(u.v(view)) && (a2 = a(aVar, str)) != null) {
                    aVar.put(a2, u.v(view));
                }
            }
        } else {
            a(aVar, aVar2);
        }
        return aVar2;
    }

    static View a(a.d.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f947c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    private static e a(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar == null) {
            e eVar2 = new e();
            sparseArray.put(i, eVar2);
            return eVar2;
        }
        return eVar;
    }

    private static q a() {
        try {
            return (q) Class.forName("a.m.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static q a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object p = fragment.p();
            if (p != null) {
                arrayList.add(p);
            }
            Object A = fragment.A();
            if (A != null) {
                arrayList.add(A);
            }
            Object C = fragment.C();
            if (C != null) {
                arrayList.add(C);
            }
        }
        if (fragment2 != null) {
            Object n = fragment2.n();
            if (n != null) {
                arrayList.add(n);
            }
            Object x = fragment2.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object B = fragment2.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f936b;
        if (qVar != null && a(qVar, arrayList)) {
            return f936b;
        }
        q qVar2 = f937c;
        if (qVar2 != null && a(qVar2, arrayList)) {
            return f937c;
        }
        if (f936b != null || f937c != null) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return null;
    }

    private static Object a(q qVar, ViewGroup viewGroup, View view, a.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        a.d.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = eVar.f945a;
        Fragment fragment2 = eVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f946b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = a(qVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        a.d.a<String, View> b2 = b(qVar, aVar2, obj3, eVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b2.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar.b(obj4, view, arrayList);
            a(qVar, obj4, obj2, b2, eVar.e, eVar.f);
            if (obj != null) {
                qVar.a(obj, rect);
            }
        } else {
            rect = null;
        }
        a.g.l.r.a(viewGroup, new d(qVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object a(q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.c(qVar.b(z ? fragment2.C() : fragment.B()));
    }

    private static Object a(q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.b(z ? fragment.x() : fragment.n());
    }

    private static Object a(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.h() : fragment.g() ? qVar.b(obj2, obj, obj3) : qVar.a(obj2, obj, obj3);
    }

    private static String a(a.d.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.d(i))) {
                return aVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View F = fragment.F();
            if (F != null) {
                qVar.a(arrayList2, F);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            qVar.a(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static void a(a.d.a<String, String> aVar, a.d.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.d(size))) {
                aVar.c(size);
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, a.d.a<String, View> aVar, boolean z2) {
        androidx.core.app.f o = z ? fragment2.o() : fragment.o();
        if (o != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.b(i));
                arrayList.add(aVar.d(i));
            }
            if (z2) {
                o.b(arrayList2, arrayList, null);
            } else {
                o.a(arrayList2, arrayList, null);
            }
        }
    }

    public static void a(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.f929a.size();
        for (int i = 0; i < size; i++) {
            a(aVar, aVar.f929a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r10.l != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
        if (r10.z == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.a(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static void a(j jVar, int i, e eVar, View view, a.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q a2;
        Object obj;
        ViewGroup viewGroup = jVar.s.d() ? (ViewGroup) jVar.s.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = eVar.d), (fragment = eVar.f945a))) == null) {
            return;
        }
        boolean z = eVar.f946b;
        boolean z2 = eVar.e;
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a4 = a(a2, viewGroup, view, aVar, eVar, arrayList, arrayList2, a3, b2);
        if (a3 == null && a4 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a5 = a(a2, obj, fragment2, arrayList, view);
        Object obj2 = (a5 == null || a5.isEmpty()) ? null : obj;
        a2.a(a3, view);
        Object a6 = a(a2, a3, obj2, a4, fragment, eVar.f946b);
        if (a6 == null) {
            return;
        }
        ArrayList<View> arrayList3 = new ArrayList<>();
        a2.a(a6, a3, arrayList3, obj2, a5, a4, arrayList2);
        a(a2, viewGroup, fragment, view, arrayList2, a3, arrayList3, obj2, a5);
        a2.a((View) viewGroup, arrayList2, (Map<String, String>) aVar);
        a2.a(viewGroup, a6);
        a2.a(viewGroup, arrayList2, (Map<String, String>) aVar);
    }

    public static void a(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.q < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(aVar, sparseArray, z);
            } else {
                a(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() == 0) {
            return;
        }
        View view = new View(jVar.r.g());
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            a.d.a<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
            e eVar = (e) sparseArray.valueAt(i4);
            if (z) {
                b(jVar, keyAt, eVar, view, a2);
            } else {
                a(jVar, keyAt, eVar, view, a2);
            }
        }
    }

    private static void a(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        a.g.l.r.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment == null || obj == null || !fragment.l || !fragment.z || !fragment.N) {
            return;
        }
        fragment.g(true);
        qVar.a(obj, fragment.F(), arrayList);
        a.g.l.r.a(fragment.G, new a(arrayList));
    }

    private static void a(q qVar, Object obj, Object obj2, a.d.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        qVar.c(obj, view);
        if (obj2 == null) {
            return;
        }
        qVar.c(obj2, view);
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static void a(ArrayList<View> arrayList, a.d.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d2 = aVar.d(size);
            if (collection.contains(u.v(d2))) {
                arrayList.add(d2);
            }
        }
    }

    private static boolean a(q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static a.d.a<String, View> b(q qVar, a.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.f fVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.d;
        a.d.a<String, View> aVar2 = new a.d.a<>();
        qVar.a((Map<String, View>) aVar2, fragment.g0());
        androidx.fragment.app.a aVar3 = eVar.f;
        if (eVar.e) {
            fVar = fragment.o();
            arrayList = aVar3.o;
        } else {
            fVar = fragment.q();
            arrayList = aVar3.n;
        }
        aVar2.a((Collection<?>) arrayList);
        if (fVar != null) {
            fVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(u.v(view))) {
                    aVar.put(u.v(view), aVar.remove(str));
                }
            }
        } else {
            aVar.a((Collection<?>) aVar2.keySet());
        }
        return aVar2;
    }

    private static Object b(q qVar, ViewGroup viewGroup, View view, a.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Fragment fragment = eVar.f945a;
        Fragment fragment2 = eVar.d;
        if (fragment != null) {
            fragment.g0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f946b;
        Object a2 = aVar.isEmpty() ? null : a(qVar, fragment, fragment2, z);
        a.d.a<String, View> b2 = b(qVar, aVar, a2, eVar);
        a.d.a<String, View> a3 = a(qVar, aVar, a2, eVar);
        if (aVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, aVar.keySet());
            a(arrayList2, a3, aVar.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.b(obj3, view, arrayList);
            a(qVar, obj3, obj2, b2, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View a4 = a(a3, eVar, obj, z);
            if (a4 != null) {
                qVar.a(obj, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        a.g.l.r.a(viewGroup, new c(fragment, fragment2, z, a3, view2, qVar, rect));
        return obj3;
    }

    private static Object b(q qVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return qVar.b(z ? fragment.A() : fragment.p());
    }

    public static void b(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        if (!aVar.r.s.d()) {
            return;
        }
        for (int size = aVar.f929a.size() - 1; size >= 0; size--) {
            a(aVar, aVar.f929a.get(size), sparseArray, true, z);
        }
    }

    private static void b(j jVar, int i, e eVar, View view, a.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q a2;
        Object obj;
        ViewGroup viewGroup = jVar.s.d() ? (ViewGroup) jVar.s.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = eVar.d), (fragment = eVar.f945a))) == null) {
            return;
        }
        boolean z = eVar.f946b;
        boolean z2 = eVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        Object b3 = b(a2, viewGroup, view, aVar, eVar, arrayList2, arrayList, a3, b2);
        if (a3 == null && b3 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a4 = a(a2, obj, fragment2, arrayList2, view);
        ArrayList<View> a5 = a(a2, a3, fragment, arrayList, view);
        a(a5, 4);
        Object a6 = a(a2, a3, obj, b3, fragment, z);
        if (a6 == null) {
            return;
        }
        a(a2, obj, fragment2, a4);
        ArrayList<String> a7 = a2.a(arrayList);
        a2.a(a6, a3, a5, obj, a4, b3, arrayList);
        a2.a(viewGroup, a6);
        a2.a(viewGroup, arrayList2, arrayList, a7, aVar);
        a(a5, 0);
        a2.b(b3, arrayList2, arrayList);
    }
}
