package q1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private static n f19454a = new b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<i0.a<ViewGroup, ArrayList<n>>>> f19455b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f19456c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        n f19457c;

        /* renamed from: d */
        ViewGroup f19458d;

        /* renamed from: q1.p$a$a */
        /* loaded from: classes.dex */
        class C0315a extends o {

            /* renamed from: a */
            final /* synthetic */ i0.a f19459a;

            C0315a(i0.a aVar) {
                a.this = r1;
                this.f19459a = aVar;
            }

            @Override // q1.n.f
            public void a(n nVar) {
                ((ArrayList) this.f19459a.get(a.this.f19458d)).remove(nVar);
                nVar.W(this);
            }
        }

        a(n nVar, ViewGroup viewGroup) {
            this.f19457c = nVar;
            this.f19458d = viewGroup;
        }

        private void a() {
            this.f19458d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19458d.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!p.f19456c.remove(this.f19458d)) {
                return true;
            }
            i0.a<ViewGroup, ArrayList<n>> b10 = p.b();
            ArrayList<n> arrayList = b10.get(this.f19458d);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b10.put(this.f19458d, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f19457c);
            this.f19457c.a(new C0315a(b10));
            this.f19457c.k(this.f19458d, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).Y(this.f19458d);
                }
            }
            this.f19457c.V(this.f19458d);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            p.f19456c.remove(this.f19458d);
            ArrayList<n> arrayList = p.b().get(this.f19458d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<n> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Y(this.f19458d);
                }
            }
            this.f19457c.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, n nVar) {
        if (f19456c.contains(viewGroup) || !androidx.core.view.y.S(viewGroup)) {
            return;
        }
        f19456c.add(viewGroup);
        if (nVar == null) {
            nVar = f19454a;
        }
        n clone = nVar.clone();
        d(viewGroup, clone);
        k.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static i0.a<ViewGroup, ArrayList<n>> b() {
        i0.a<ViewGroup, ArrayList<n>> aVar;
        WeakReference<i0.a<ViewGroup, ArrayList<n>>> weakReference = f19455b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            i0.a<ViewGroup, ArrayList<n>> aVar2 = new i0.a<>();
            f19455b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    private static void c(ViewGroup viewGroup, n nVar) {
        if (nVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(nVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, n nVar) {
        ArrayList<n> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().U(viewGroup);
            }
        }
        if (nVar != null) {
            nVar.k(viewGroup, true);
        }
        k b10 = k.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
