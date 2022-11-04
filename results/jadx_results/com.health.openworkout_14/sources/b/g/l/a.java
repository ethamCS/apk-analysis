package b.g.l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.g.l.c0.c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f2498c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f2499a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f2500b;

    /* renamed from: b.g.l.a$a */
    /* loaded from: classes.dex */
    public static final class C0051a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final a f2501a;

        C0051a(a aVar) {
            this.f2501a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2501a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b.g.l.c0.d b2 = this.f2501a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.d();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2501a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            b.g.l.c0.c A0 = b.g.l.c0.c.A0(accessibilityNodeInfo);
            A0.r0(t.R(view));
            A0.k0(t.M(view));
            A0.o0(t.n(view));
            this.f2501a.g(view, A0);
            A0.f(accessibilityNodeInfo.getText(), view);
            List<c.a> c2 = a.c(view);
            for (int i = 0; i < c2.size(); i++) {
                A0.b(c2.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2501a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2501a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2501a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f2501a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2501a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f2498c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2499a = accessibilityDelegate;
        this.f2500b = new C0051a(this);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(b.g.b.b_res_0x7f0901b8);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = b.g.l.c0.c.q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; q != null && i < q.length; i++) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.g.b.c_res_0x7f0901b9);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2499a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b.g.l.c0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2499a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new b.g.l.c0.d(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate d() {
        return this.f2500b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2499a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, b.g.l.c0.c cVar) {
        this.f2499a.onInitializeAccessibilityNodeInfo(view, cVar.z0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2499a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2499a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<c.a> c2 = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c2.size()) {
                break;
            }
            c.a aVar = c2.get(i2);
            if (aVar.b() == i) {
                z = aVar.d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f2499a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != b.g.b.a_res_0x7f09000f) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i) {
        this.f2499a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2499a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
