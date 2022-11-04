package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class r extends b.g.l.a {

    /* renamed from: d */
    final RecyclerView f1806d;

    /* renamed from: e */
    private final a f1807e;

    /* loaded from: classes.dex */
    public static class a extends b.g.l.a {

        /* renamed from: d */
        final r f1808d;

        /* renamed from: e */
        private Map<View, b.g.l.a> f1809e = new WeakHashMap();

        public a(r rVar) {
            this.f1808d = rVar;
        }

        @Override // b.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.f1809e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // b.g.l.a
        public b.g.l.c0.d b(View view) {
            b.g.l.a aVar = this.f1809e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // b.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.f1809e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            if (!this.f1808d.o() && this.f1808d.f1806d.getLayoutManager() != null) {
                this.f1808d.f1806d.getLayoutManager().P0(view, cVar);
                b.g.l.a aVar = this.f1809e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // b.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.f1809e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // b.g.l.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.f1809e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // b.g.l.a
        public boolean j(View view, int i, Bundle bundle) {
            if (this.f1808d.o() || this.f1808d.f1806d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            b.g.l.a aVar = this.f1809e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.f1808d.f1806d.getLayoutManager().j1(view, i, bundle);
        }

        @Override // b.g.l.a
        public void l(View view, int i) {
            b.g.l.a aVar = this.f1809e.get(view);
            if (aVar != null) {
                aVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // b.g.l.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            b.g.l.a aVar = this.f1809e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public b.g.l.a n(View view) {
            return this.f1809e.remove(view);
        }

        public void o(View view) {
            b.g.l.a j = b.g.l.t.j(view);
            if (j == null || j == this) {
                return;
            }
            this.f1809e.put(view, j);
        }
    }

    public r(RecyclerView recyclerView) {
        this.f1806d = recyclerView;
        b.g.l.a n = n();
        this.f1807e = (n == null || !(n instanceof a)) ? new a(this) : (a) n;
    }

    @Override // b.g.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().L0(accessibilityEvent);
    }

    @Override // b.g.l.a
    public void g(View view, b.g.l.c0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f1806d.getLayoutManager() == null) {
            return;
        }
        this.f1806d.getLayoutManager().N0(cVar);
    }

    @Override // b.g.l.a
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (!o() && this.f1806d.getLayoutManager() != null) {
            return this.f1806d.getLayoutManager().h1(i, bundle);
        }
        return false;
    }

    public b.g.l.a n() {
        return this.f1807e;
    }

    boolean o() {
        return this.f1806d.p0();
    }
}
