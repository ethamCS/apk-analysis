package androidx.recyclerview.widget;

import a.g.l.u;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class k extends a.g.l.a {
    final RecyclerView d;
    private final a e;

    /* loaded from: classes.dex */
    public static class a extends a.g.l.a {
        final k d;
        private Map<View, a.g.l.a> e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // a.g.l.a
        public a.g.l.d0.d a(View view) {
            a.g.l.a aVar = this.e.get(view);
            return aVar != null ? aVar.a(view) : super.a(view);
        }

        @Override // a.g.l.a
        public void a(View view, int i) {
            a.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.a(view, i);
            } else {
                super.a(view, i);
            }
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            if (!this.d.c() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().a(view, cVar);
                a.g.l.a aVar = this.e.get(view);
                if (aVar != null) {
                    aVar.a(view, cVar);
                    return;
                }
            }
            super.a(view, cVar);
        }

        @Override // a.g.l.a
        public boolean a(View view, int i, Bundle bundle) {
            if (this.d.c() || this.d.d.getLayoutManager() == null) {
                return super.a(view, i, bundle);
            }
            a.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                if (aVar.a(view, i, bundle)) {
                    return true;
                }
            } else if (super.a(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().a(view, i, bundle);
        }

        @Override // a.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a.g.l.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.e.get(viewGroup);
            return aVar != null ? aVar.a(viewGroup, view, accessibilityEvent) : super.a(viewGroup, view, accessibilityEvent);
        }

        @Override // a.g.l.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.b(view, accessibilityEvent);
            } else {
                super.b(view, accessibilityEvent);
            }
        }

        public a.g.l.a c(View view) {
            return this.e.remove(view);
        }

        @Override // a.g.l.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public void d(View view) {
            a.g.l.a b2 = u.b(view);
            if (b2 == null || b2 == this) {
                return;
            }
            this.e.put(view, b2);
        }

        @Override // a.g.l.a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.d(view, accessibilityEvent);
            } else {
                super.d(view, accessibilityEvent);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        a.g.l.a b2 = b();
        this.e = (b2 == null || !(b2 instanceof a)) ? new a(this) : (a) b2;
    }

    @Override // a.g.l.a
    public void a(View view, a.g.l.d0.c cVar) {
        super.a(view, cVar);
        if (c() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().a(cVar);
    }

    @Override // a.g.l.a
    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (!c() && this.d.getLayoutManager() != null) {
            return this.d.getLayoutManager().a(i, bundle);
        }
        return false;
    }

    public a.g.l.a b() {
        return this.e;
    }

    @Override // a.g.l.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || c()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().a(accessibilityEvent);
    }

    boolean c() {
        return this.d.hasPendingAdapterUpdates();
    }
}
