package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    private static final int[] f1137a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final w f1138b;

    /* renamed from: c */
    private static final w f1139c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ g f1140b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1141c;

        /* renamed from: d */
        final /* synthetic */ b.g.h.a f1142d;

        a(g gVar, Fragment fragment, b.g.h.a aVar) {
            this.f1140b = gVar;
            this.f1141c = fragment;
            this.f1142d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1140b.a(this.f1141c, this.f1142d);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f1143b;

        b(ArrayList arrayList) {
            this.f1143b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.B(this.f1143b, 4);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ g f1144b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1145c;

        /* renamed from: d */
        final /* synthetic */ b.g.h.a f1146d;

        c(g gVar, Fragment fragment, b.g.h.a aVar) {
            this.f1144b = gVar;
            this.f1145c = fragment;
            this.f1146d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1144b.a(this.f1145c, this.f1146d);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f1147b;

        /* renamed from: c */
        final /* synthetic */ w f1148c;

        /* renamed from: d */
        final /* synthetic */ View f1149d;

        /* renamed from: e */
        final /* synthetic */ Fragment f1150e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1151f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f1152g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f1153h;
        final /* synthetic */ Object i;

        d(Object obj, w wVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1147b = obj;
            this.f1148c = wVar;
            this.f1149d = view;
            this.f1150e = fragment;
            this.f1151f = arrayList;
            this.f1152g = arrayList2;
            this.f1153h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1147b;
            if (obj != null) {
                this.f1148c.p(obj, this.f1149d);
                this.f1152g.addAll(u.k(this.f1148c, this.f1147b, this.f1150e, this.f1151f, this.f1149d));
            }
            if (this.f1153h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1149d);
                    this.f1148c.q(this.i, this.f1153h, arrayList);
                }
                this.f1153h.clear();
                this.f1153h.add(this.f1149d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Fragment f1154b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1155c;

        /* renamed from: d */
        final /* synthetic */ boolean f1156d;

        /* renamed from: e */
        final /* synthetic */ b.d.a f1157e;

        /* renamed from: f */
        final /* synthetic */ View f1158f;

        /* renamed from: g */
        final /* synthetic */ w f1159g;

        /* renamed from: h */
        final /* synthetic */ Rect f1160h;

        e(Fragment fragment, Fragment fragment2, boolean z, b.d.a aVar, View view, w wVar, Rect rect) {
            this.f1154b = fragment;
            this.f1155c = fragment2;
            this.f1156d = z;
            this.f1157e = aVar;
            this.f1158f = view;
            this.f1159g = wVar;
            this.f1160h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.f(this.f1154b, this.f1155c, this.f1156d, this.f1157e, false);
            View view = this.f1158f;
            if (view != null) {
                this.f1159g.k(view, this.f1160h);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ w f1161b;

        /* renamed from: c */
        final /* synthetic */ b.d.a f1162c;

        /* renamed from: d */
        final /* synthetic */ Object f1163d;

        /* renamed from: e */
        final /* synthetic */ h f1164e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1165f;

        /* renamed from: g */
        final /* synthetic */ View f1166g;

        /* renamed from: h */
        final /* synthetic */ Fragment f1167h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        f(w wVar, b.d.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1161b = wVar;
            this.f1162c = aVar;
            this.f1163d = obj;
            this.f1164e = hVar;
            this.f1165f = arrayList;
            this.f1166g = view;
            this.f1167h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.d.a<String, View> h2 = u.h(this.f1161b, this.f1162c, this.f1163d, this.f1164e);
            if (h2 != null) {
                this.f1165f.addAll(h2.values());
                this.f1165f.add(this.f1166g);
            }
            u.f(this.f1167h, this.i, this.j, h2, false);
            Object obj = this.f1163d;
            if (obj != null) {
                this.f1161b.A(obj, this.k, this.f1165f);
                View t = u.t(h2, this.f1164e, this.l, this.j);
                if (t == null) {
                    return;
                }
                this.f1161b.k(t, this.m);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, b.g.h.a aVar);

        void b(Fragment fragment, b.g.h.a aVar);
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public Fragment f1168a;

        /* renamed from: b */
        public boolean f1169b;

        /* renamed from: c */
        public androidx.fragment.app.a f1170c;

        /* renamed from: d */
        public Fragment f1171d;

        /* renamed from: e */
        public boolean f1172e;

        /* renamed from: f */
        public androidx.fragment.app.a f1173f;

        h() {
        }
    }

    static {
        f1138b = Build.VERSION.SDK_INT >= 21 ? new v() : null;
        f1139c = x();
    }

    private static void A(w wVar, Object obj, Object obj2, b.d.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        wVar.v(obj, view);
        if (obj2 == null) {
            return;
        }
        wVar.v(obj2, view);
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static void C(m mVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        if (mVar.n < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() == 0) {
            return;
        }
        View view = new View(mVar.o.i());
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            b.d.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
            h hVar = (h) sparseArray.valueAt(i4);
            if (z) {
                o(mVar, keyAt, hVar, view, d2, gVar);
            } else {
                n(mVar, keyAt, hVar, view, d2, gVar);
            }
        }
    }

    public static boolean D() {
        return (f1138b == null && f1139c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, b.d.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.m(size);
            if (collection.contains(b.g.l.t.G(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.l != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0088, code lost:
        if (r0.z == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.t.a r9, android.util.SparseArray<androidx.fragment.app.u.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b(androidx.fragment.app.a, androidx.fragment.app.t$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f1121a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.f1121a.get(i), sparseArray, false, z);
        }
    }

    private static b.d.a<String, String> d(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.d.a<String, String> aVar = new b.d.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.B(i)) {
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

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (!aVar.r.p.f()) {
            return;
        }
        for (int size = aVar.f1121a.size() - 1; size >= 0; size--) {
            b(aVar, aVar.f1121a.get(size), sparseArray, true, z);
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, b.d.a<String, View> aVar, boolean z2) {
        androidx.core.app.m v = z ? fragment2.v() : fragment.v();
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.i(i));
                arrayList.add(aVar.m(i));
            }
            if (z2) {
                v.c(arrayList2, arrayList, null);
            } else {
                v.b(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(w wVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!wVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static b.d.a<String, View> h(w wVar, b.d.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.m mVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f1168a;
        View P = fragment.P();
        if (aVar.isEmpty() || obj == null || P == null) {
            aVar.clear();
            return null;
        }
        b.d.a<String, View> aVar2 = new b.d.a<>();
        wVar.j(aVar2, P);
        androidx.fragment.app.a aVar3 = hVar.f1170c;
        if (hVar.f1169b) {
            mVar = fragment.x();
            arrayList = aVar3.n;
        } else {
            mVar = fragment.v();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (mVar != null) {
            mVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(b.g.l.t.G(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, b.g.l.t.G(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static b.d.a<String, View> i(w wVar, b.d.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1171d;
        b.d.a<String, View> aVar2 = new b.d.a<>();
        wVar.j(aVar2, fragment.j1());
        androidx.fragment.app.a aVar3 = hVar.f1173f;
        if (hVar.f1172e) {
            mVar = fragment.v();
            arrayList = aVar3.o;
        } else {
            mVar = fragment.x();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (mVar != null) {
            mVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(b.g.l.t.G(view))) {
                    aVar.put(b.g.l.t.G(view), aVar.remove(str));
                }
            }
        } else {
            aVar.o(aVar2.keySet());
        }
        return aVar2;
    }

    private static w j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object w = fragment.w();
            if (w != null) {
                arrayList.add(w);
            }
            Object J = fragment.J();
            if (J != null) {
                arrayList.add(J);
            }
            Object L = fragment.L();
            if (L != null) {
                arrayList.add(L);
            }
        }
        if (fragment2 != null) {
            Object u = fragment2.u();
            if (u != null) {
                arrayList.add(u);
            }
            Object G = fragment2.G();
            if (G != null) {
                arrayList.add(G);
            }
            Object K = fragment2.K();
            if (K != null) {
                arrayList.add(K);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        w wVar = f1138b;
        if (wVar != null && g(wVar, arrayList)) {
            return wVar;
        }
        w wVar2 = f1139c;
        if (wVar2 != null && g(wVar2, arrayList)) {
            return wVar2;
        }
        if (wVar != null || wVar2 != null) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return null;
    }

    static ArrayList<View> k(w wVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View P = fragment.P();
            if (P != null) {
                wVar.f(arrayList2, P);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            wVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(w wVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        b.d.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = hVar.f1168a;
        Fragment fragment2 = hVar.f1171d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1169b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(wVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        b.d.a<String, View> i = i(wVar, aVar2, obj3, hVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(i.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            wVar.z(obj4, view, arrayList);
            A(wVar, obj4, obj2, i, hVar.f1172e, hVar.f1173f);
            if (obj != null) {
                wVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        b.g.l.r.a(viewGroup, new f(wVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object m(w wVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Fragment fragment = hVar.f1168a;
        Fragment fragment2 = hVar.f1171d;
        if (fragment != null) {
            fragment.j1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1169b;
        Object u = aVar.isEmpty() ? null : u(wVar, fragment, fragment2, z);
        b.d.a<String, View> i = i(wVar, aVar, u, hVar);
        b.d.a<String, View> h2 = h(wVar, aVar, u, hVar);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i, aVar.keySet());
            a(arrayList2, h2, aVar.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            wVar.z(obj3, view, arrayList);
            A(wVar, obj3, obj2, i, hVar.f1172e, hVar.f1173f);
            Rect rect2 = new Rect();
            View t = t(h2, hVar, obj, z);
            if (t != null) {
                wVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        b.g.l.r.a(viewGroup, new e(fragment, fragment2, z, h2, view2, wVar, rect));
        return obj3;
    }

    private static void n(m mVar, int i, h hVar, View view, b.d.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        w j;
        Object obj;
        ViewGroup viewGroup = mVar.p.f() ? (ViewGroup) mVar.p.e(i) : null;
        if (viewGroup == null || (j = j((fragment2 = hVar.f1171d), (fragment = hVar.f1168a))) == null) {
            return;
        }
        boolean z = hVar.f1169b;
        boolean z2 = hVar.f1172e;
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, r, s);
        if (r == null && l == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
        Object obj2 = (k == null || k.isEmpty()) ? null : obj;
        j.a(r, view);
        Object v = v(j, r, obj2, l, fragment, hVar.f1169b);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList.size() > 0)) {
            b.g.h.a aVar2 = new b.g.h.a();
            gVar.b(fragment2, aVar2);
            j.w(fragment2, v, aVar2, new c(gVar, fragment2, aVar2));
        }
        if (v == null) {
            return;
        }
        ArrayList<View> arrayList3 = new ArrayList<>();
        j.t(v, r, arrayList3, obj2, k, l, arrayList2);
        z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k);
        j.x(viewGroup, arrayList2, aVar);
        j.c(viewGroup, v);
        j.s(viewGroup, arrayList2, aVar);
    }

    private static void o(m mVar, int i, h hVar, View view, b.d.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        w j;
        Object obj;
        ViewGroup viewGroup = mVar.p.f() ? (ViewGroup) mVar.p.e(i) : null;
        if (viewGroup == null || (j = j((fragment2 = hVar.f1171d), (fragment = hVar.f1168a))) == null) {
            return;
        }
        boolean z = hVar.f1169b;
        boolean z2 = hVar.f1172e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        Object m = m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, r, s);
        if (r == null && m == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
        ArrayList<View> k2 = k(j, r, fragment, arrayList, view);
        B(k2, 4);
        Object v = v(j, r, obj, m, fragment, z);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList2.size() > 0)) {
            b.g.h.a aVar2 = new b.g.h.a();
            gVar.b(fragment2, aVar2);
            j.w(fragment2, v, aVar2, new a(gVar, fragment2, aVar2));
        }
        if (v == null) {
            return;
        }
        w(j, obj, fragment2, k);
        ArrayList<String> o = j.o(arrayList);
        j.t(v, r, k2, obj, k, m, arrayList);
        j.c(viewGroup, v);
        j.y(viewGroup, arrayList2, arrayList, o, aVar);
        B(k2, 0);
        j.A(m, arrayList2, arrayList);
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private static String q(b.d.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.m(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    private static Object r(w wVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return wVar.g(z ? fragment.G() : fragment.u());
    }

    private static Object s(w wVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return wVar.g(z ? fragment.J() : fragment.w());
    }

    static View t(b.d.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f1170c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    private static Object u(w wVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return wVar.B(wVar.g(z ? fragment2.L() : fragment.K()));
    }

    private static Object v(w wVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.o() : fragment.n() ? wVar.n(obj2, obj, obj3) : wVar.m(obj2, obj, obj3);
    }

    private static void w(w wVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment == null || obj == null || !fragment.l || !fragment.z || !fragment.M) {
            return;
        }
        fragment.q1(true);
        wVar.r(obj, fragment.P(), arrayList);
        b.g.l.r.a(fragment.G, new b(arrayList));
    }

    private static w x() {
        try {
            return (w) Class.forName("b.p.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(b.d.a<String, String> aVar, b.d.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void z(w wVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b.g.l.r.a(viewGroup, new d(obj, wVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
