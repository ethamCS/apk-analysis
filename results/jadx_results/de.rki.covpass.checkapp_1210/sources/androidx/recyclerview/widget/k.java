package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.y;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class k extends androidx.core.view.a {

    /* renamed from: d */
    final RecyclerView f4797d;

    /* renamed from: e */
    private final a f4798e;

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d */
        final k f4799d;

        /* renamed from: e */
        private Map<View, androidx.core.view.a> f4800e = new WeakHashMap();

        public a(k kVar) {
            this.f4799d = kVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public androidx.core.view.accessibility.e b(View view) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            if (!this.f4799d.o() && this.f4799d.f4797d.getLayoutManager() != null) {
                this.f4799d.f4797d.getLayoutManager().O0(view, dVar);
                androidx.core.view.a aVar = this.f4800e.get(view);
                if (aVar != null) {
                    aVar.g(view, dVar);
                    return;
                }
            }
            super.g(view, dVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4800e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f4799d.o() || this.f4799d.f4797d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f4800e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f4799d.f4797d.getLayoutManager().i1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4800e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public androidx.core.view.a n(View view) {
            return this.f4800e.remove(view);
        }

        public void o(View view) {
            androidx.core.view.a l10 = y.l(view);
            if (l10 == null || l10 == this) {
                return;
            }
            this.f4800e.put(view, l10);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f4797d = recyclerView;
        androidx.core.view.a n10 = n();
        this.f4798e = (n10 == null || !(n10 instanceof a)) ? new a(this) : (a) n10;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().K0(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.accessibility.d dVar) {
        super.g(view, dVar);
        if (o() || this.f4797d.getLayoutManager() == null) {
            return;
        }
        this.f4797d.getLayoutManager().M0(dVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (!o() && this.f4797d.getLayoutManager() != null) {
            return this.f4797d.getLayoutManager().g1(i10, bundle);
        }
        return false;
    }

    public androidx.core.view.a n() {
        return this.f4798e;
    }

    boolean o() {
        return this.f4797d.m0();
    }
}
