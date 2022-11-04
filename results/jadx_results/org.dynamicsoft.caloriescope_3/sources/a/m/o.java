package a.m;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    private static m f378a = new b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<a.d.a<ViewGroup, ArrayList<m>>>> f379b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f380c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        m f381b;

        /* renamed from: c */
        ViewGroup f382c;

        /* renamed from: a.m.o$a$a */
        /* loaded from: classes.dex */
        class C0026a extends n {

            /* renamed from: a */
            final /* synthetic */ a.d.a f383a;

            C0026a(a.d.a aVar) {
                a.this = r1;
                this.f383a = aVar;
            }

            @Override // a.m.m.f
            public void c(m mVar) {
                ((ArrayList) this.f383a.get(a.this.f382c)).remove(mVar);
                mVar.b(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f381b = mVar;
            this.f382c = viewGroup;
        }

        private void a() {
            this.f382c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f382c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f380c.remove(this.f382c)) {
                return true;
            }
            a.d.a<ViewGroup, ArrayList<m>> a2 = o.a();
            ArrayList<m> arrayList = a2.get(this.f382c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a2.put(this.f382c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f381b);
            this.f381b.a(new C0026a(a2));
            this.f381b.a(this.f382c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f382c);
                }
            }
            this.f381b.a(this.f382c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f380c.remove(this.f382c);
            ArrayList<m> arrayList = o.a().get(this.f382c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f382c);
                }
            }
            this.f381b.a(true);
        }
    }

    static a.d.a<ViewGroup, ArrayList<m>> a() {
        a.d.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<a.d.a<ViewGroup, ArrayList<m>>> weakReference = f379b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            a.d.a<ViewGroup, ArrayList<m>> aVar2 = new a.d.a<>();
            f379b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f380c.contains(viewGroup) || !a.g.l.u.D(viewGroup)) {
            return;
        }
        f380c.add(viewGroup);
        if (mVar == null) {
            mVar = f378a;
        }
        m clone = mVar.clone();
        c(viewGroup, clone);
        l.a(viewGroup, null);
        b(viewGroup, clone);
    }

    private static void b(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.a(viewGroup, true);
        }
        l a2 = l.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
