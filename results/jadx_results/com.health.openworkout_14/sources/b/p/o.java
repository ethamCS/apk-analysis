package b.p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    private static m f2768a = new b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<b.d.a<ViewGroup, ArrayList<m>>>> f2769b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f2770c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        m f2771b;

        /* renamed from: c */
        ViewGroup f2772c;

        /* renamed from: b.p.o$a$a */
        /* loaded from: classes.dex */
        class C0066a extends n {

            /* renamed from: a */
            final /* synthetic */ b.d.a f2773a;

            C0066a(b.d.a aVar) {
                a.this = r1;
                this.f2773a = aVar;
            }

            @Override // b.p.m.f
            public void e(m mVar) {
                ((ArrayList) this.f2773a.get(a.this.f2772c)).remove(mVar);
                mVar.T(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f2771b = mVar;
            this.f2772c = viewGroup;
        }

        private void a() {
            this.f2772c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2772c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f2770c.remove(this.f2772c)) {
                return true;
            }
            b.d.a<ViewGroup, ArrayList<m>> b2 = o.b();
            ArrayList<m> arrayList = b2.get(this.f2772c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b2.put(this.f2772c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2771b);
            this.f2771b.b(new C0066a(b2));
            this.f2771b.m(this.f2772c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).V(this.f2772c);
                }
            }
            this.f2771b.S(this.f2772c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f2770c.remove(this.f2772c);
            ArrayList<m> arrayList = o.b().get(this.f2772c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().V(this.f2772c);
                }
            }
            this.f2771b.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f2770c.contains(viewGroup) || !b.g.l.t.O(viewGroup)) {
            return;
        }
        f2770c.add(viewGroup);
        if (mVar == null) {
            mVar = f2768a;
        }
        m clone = mVar.clone();
        d(viewGroup, clone);
        l.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static b.d.a<ViewGroup, ArrayList<m>> b() {
        b.d.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<b.d.a<ViewGroup, ArrayList<m>>> weakReference = f2769b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            b.d.a<ViewGroup, ArrayList<m>> aVar2 = new b.d.a<>();
            f2769b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().R(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.m(viewGroup, true);
        }
        l b2 = l.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
