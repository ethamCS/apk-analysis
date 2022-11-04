package b.p;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b.g.h.a;
import b.p.m;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.w {

    /* loaded from: classes.dex */
    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    /* loaded from: classes.dex */
    class b implements m.f {

        /* renamed from: a */
        final /* synthetic */ View f2708a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2709b;

        b(e eVar, View view, ArrayList arrayList) {
            this.f2708a = view;
            this.f2709b = arrayList;
        }

        @Override // b.p.m.f
        public void a(m mVar) {
        }

        @Override // b.p.m.f
        public void b(m mVar) {
        }

        @Override // b.p.m.f
        public void c(m mVar) {
            mVar.T(this);
            mVar.b(this);
        }

        @Override // b.p.m.f
        public void d(m mVar) {
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            mVar.T(this);
            this.f2708a.setVisibility(8);
            int size = this.f2709b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2709b.get(i)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends n {

        /* renamed from: a */
        final /* synthetic */ Object f2710a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2711b;

        /* renamed from: c */
        final /* synthetic */ Object f2712c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2713d;

        /* renamed from: e */
        final /* synthetic */ Object f2714e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2715f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            e.this = r1;
            this.f2710a = obj;
            this.f2711b = arrayList;
            this.f2712c = obj2;
            this.f2713d = arrayList2;
            this.f2714e = obj3;
            this.f2715f = arrayList3;
        }

        @Override // b.p.n, b.p.m.f
        public void c(m mVar) {
            Object obj = this.f2710a;
            if (obj != null) {
                e.this.q(obj, this.f2711b, null);
            }
            Object obj2 = this.f2712c;
            if (obj2 != null) {
                e.this.q(obj2, this.f2713d, null);
            }
            Object obj3 = this.f2714e;
            if (obj3 != null) {
                e.this.q(obj3, this.f2715f, null);
            }
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            mVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    class d implements a.AbstractC0045a {

        /* renamed from: a */
        final /* synthetic */ m f2717a;

        d(e eVar, m mVar) {
            this.f2717a = mVar;
        }

        @Override // b.g.h.a.AbstractC0045a
        public void a() {
            this.f2717a.cancel();
        }
    }

    /* renamed from: b.p.e$e */
    /* loaded from: classes.dex */
    class C0065e implements m.f {

        /* renamed from: a */
        final /* synthetic */ Runnable f2718a;

        C0065e(e eVar, Runnable runnable) {
            this.f2718a = runnable;
        }

        @Override // b.p.m.f
        public void a(m mVar) {
        }

        @Override // b.p.m.f
        public void b(m mVar) {
        }

        @Override // b.p.m.f
        public void c(m mVar) {
        }

        @Override // b.p.m.f
        public void d(m mVar) {
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            this.f2718a.run();
        }
    }

    /* loaded from: classes.dex */
    class f extends m.e {
        f(e eVar, Rect rect) {
        }
    }

    private static boolean C(m mVar) {
        return !androidx.fragment.app.w.l(mVar.B()) || !androidx.fragment.app.w.l(mVar.C()) || !androidx.fragment.app.w.l(mVar.D());
    }

    @Override // androidx.fragment.app.w
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.E().clear();
            qVar.E().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.i0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.w
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int l0 = qVar.l0();
            while (i < l0) {
                b(qVar.k0(i), arrayList);
                i++;
            }
        } else if (C(mVar) || !androidx.fragment.app.w.l(mVar.E())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                mVar.d(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.w
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.w
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.i0(mVar);
            qVar.i0(mVar2);
            qVar.q0(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 != null) {
            q qVar2 = new q();
            if (mVar != null) {
                qVar2.i0(mVar);
            }
            qVar2.i0(mVar3);
            return qVar2;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.w
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.i0((m) obj);
        }
        if (obj2 != null) {
            qVar.i0((m) obj2);
        }
        if (obj3 != null) {
            qVar.i0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.w
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).U(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int l0 = qVar.l0();
            while (i < l0) {
                q(qVar.k0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(mVar)) {
            List<View> E = mVar.E();
            if (E.size() != arrayList.size() || !E.containsAll(arrayList)) {
                return;
            }
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                mVar.d(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.U(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).b(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.w
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.w
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).Z(new f(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).Z(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void w(Fragment fragment, Object obj, b.g.h.a aVar, Runnable runnable) {
        m mVar = (m) obj;
        aVar.c(new d(this, mVar));
        mVar.b(new C0065e(this, runnable));
    }

    @Override // androidx.fragment.app.w
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> E = qVar.E();
        E.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.w.d(E, arrayList.get(i));
        }
        E.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
