package a.g.l;

import a.g.l.d0.c;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f250c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f251a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f252b;

    /* renamed from: a.g.l.a$a */
    /* loaded from: classes.dex */
    public static final class C0014a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final a f253a;

        C0014a(a aVar) {
            this.f253a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f253a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a.g.l.d0.d a2 = this.f253a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f253a.b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.g.l.d0.c a2 = a.g.l.d0.c.a(accessibilityNodeInfo);
            a2.k(u.G(view));
            a2.i(u.B(view));
            a2.f(u.e(view));
            this.f253a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List<c.a> b2 = a.b(view);
            for (int i = 0; i < b2.size(); i++) {
                a2.a(b2.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f253a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f253a.a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f253a.a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f253a.a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f253a.d(view, accessibilityEvent);
        }
    }

    public a() {
        this(f250c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f251a = accessibilityDelegate;
        this.f252b = new C0014a(this);
    }

    private boolean a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.g.b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] h = a.g.l.d0.c.h(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; h != null && i < h.length; i++) {
                if (clickableSpan.equals(h[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static List<c.a> b(View view) {
        List<c.a> list = (List) view.getTag(a.g.b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public a.g.l.d0.d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f251a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new a.g.l.d0.d(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate a() {
        return this.f252b;
    }

    public void a(View view, int i) {
        this.f251a.sendAccessibilityEvent(view, i);
    }

    public void a(View view, a.g.l.d0.c cVar) {
        this.f251a.onInitializeAccessibilityNodeInfo(view, cVar.w());
    }

    public boolean a(View view, int i, Bundle bundle) {
        List<c.a> b2 = b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            c.a aVar = b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f251a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != a.g.b.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f251a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f251a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f251a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f251a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f251a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
