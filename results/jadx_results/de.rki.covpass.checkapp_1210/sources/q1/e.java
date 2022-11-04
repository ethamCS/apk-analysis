package q1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import q1.n;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.i0 {

    /* loaded from: classes.dex */
    class a extends n.e {

        /* renamed from: a */
        final /* synthetic */ Rect f19374a;

        a(Rect rect) {
            e.this = r1;
            this.f19374a = rect;
        }

        @Override // q1.n.e
        public Rect a(n nVar) {
            return this.f19374a;
        }
    }

    /* loaded from: classes.dex */
    class b implements n.f {

        /* renamed from: a */
        final /* synthetic */ View f19376a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f19377b;

        b(View view, ArrayList arrayList) {
            e.this = r1;
            this.f19376a = view;
            this.f19377b = arrayList;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            nVar.W(this);
            this.f19376a.setVisibility(8);
            int size = this.f19377b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f19377b.get(i10)).setVisibility(0);
            }
        }

        @Override // q1.n.f
        public void b(n nVar) {
        }

        @Override // q1.n.f
        public void c(n nVar) {
        }

        @Override // q1.n.f
        public void d(n nVar) {
        }

        @Override // q1.n.f
        public void e(n nVar) {
        }
    }

    /* loaded from: classes.dex */
    class c extends o {

        /* renamed from: a */
        final /* synthetic */ Object f19379a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f19380b;

        /* renamed from: c */
        final /* synthetic */ Object f19381c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f19382d;

        /* renamed from: e */
        final /* synthetic */ Object f19383e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f19384f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            e.this = r1;
            this.f19379a = obj;
            this.f19380b = arrayList;
            this.f19381c = obj2;
            this.f19382d = arrayList2;
            this.f19383e = obj3;
            this.f19384f = arrayList3;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            nVar.W(this);
        }

        @Override // q1.o, q1.n.f
        public void b(n nVar) {
            Object obj = this.f19379a;
            if (obj != null) {
                e.this.w(obj, this.f19380b, null);
            }
            Object obj2 = this.f19381c;
            if (obj2 != null) {
                e.this.w(obj2, this.f19382d, null);
            }
            Object obj3 = this.f19383e;
            if (obj3 != null) {
                e.this.w(obj3, this.f19384f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends n.e {

        /* renamed from: a */
        final /* synthetic */ Rect f19386a;

        d(Rect rect) {
            e.this = r1;
            this.f19386a = rect;
        }

        @Override // q1.n.e
        public Rect a(n nVar) {
            Rect rect = this.f19386a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f19386a;
        }
    }

    private static boolean v(n nVar) {
        return !androidx.fragment.app.i0.i(nVar.F()) || !androidx.fragment.app.i0.i(nVar.H()) || !androidx.fragment.app.i0.i(nVar.I());
    }

    @Override // androidx.fragment.app.i0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((n) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.i0
    public void b(Object obj, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        if (nVar == null) {
            return;
        }
        int i10 = 0;
        if (nVar instanceof r) {
            r rVar = (r) nVar;
            int o02 = rVar.o0();
            while (i10 < o02) {
                b(rVar.n0(i10), arrayList);
                i10++;
            }
        } else if (v(nVar) || !androidx.fragment.app.i0.i(nVar.J())) {
        } else {
            int size = arrayList.size();
            while (i10 < size) {
                nVar.c(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.i0
    public void c(ViewGroup viewGroup, Object obj) {
        p.a(viewGroup, (n) obj);
    }

    @Override // androidx.fragment.app.i0
    public boolean e(Object obj) {
        return obj instanceof n;
    }

    @Override // androidx.fragment.app.i0
    public Object f(Object obj) {
        if (obj != null) {
            return ((n) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.i0
    public Object j(Object obj, Object obj2, Object obj3) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        n nVar3 = (n) obj3;
        if (nVar != null && nVar2 != null) {
            nVar = new r().l0(nVar).l0(nVar2).t0(1);
        } else if (nVar == null) {
            nVar = nVar2 != null ? nVar2 : null;
        }
        if (nVar3 != null) {
            r rVar = new r();
            if (nVar != null) {
                rVar.l0(nVar);
            }
            rVar.l0(nVar3);
            return rVar;
        }
        return nVar;
    }

    @Override // androidx.fragment.app.i0
    public Object k(Object obj, Object obj2, Object obj3) {
        r rVar = new r();
        if (obj != null) {
            rVar.l0((n) obj);
        }
        if (obj2 != null) {
            rVar.l0((n) obj2);
        }
        if (obj3 != null) {
            rVar.l0((n) obj3);
        }
        return rVar;
    }

    @Override // androidx.fragment.app.i0
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((n) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.i0
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((n) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.i0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((n) obj).c0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.i0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((n) obj).c0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.i0
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        r rVar = (r) obj;
        List<View> J = rVar.J();
        J.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.i0.d(J, arrayList.get(i10));
        }
        J.add(view);
        arrayList.add(view);
        b(rVar, arrayList);
    }

    @Override // androidx.fragment.app.i0
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        r rVar = (r) obj;
        if (rVar != null) {
            rVar.J().clear();
            rVar.J().addAll(arrayList2);
            w(rVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.i0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        r rVar = new r();
        rVar.l0((n) obj);
        return rVar;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        int i10 = 0;
        if (nVar instanceof r) {
            r rVar = (r) nVar;
            int o02 = rVar.o0();
            while (i10 < o02) {
                w(rVar.n0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!v(nVar)) {
            List<View> J = nVar.J();
            if (J.size() != arrayList.size() || !J.containsAll(arrayList)) {
                return;
            }
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                nVar.c(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                nVar.X(arrayList.get(size2));
            }
        }
    }
}
