package a.g.l.d0;

import a.g.l.d0.f;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    private static int d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f261a;

    /* renamed from: b */
    public int f262b = -1;

    /* renamed from: c */
    private int f263c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(16, null);
        public static final a h = new a(262144, null);
        public static final a i = new a(524288, null);
        public static final a j = new a(1048576, null);

        /* renamed from: a */
        final Object f264a;

        /* renamed from: b */
        private final int f265b;

        /* renamed from: c */
        private final Class<? extends f.a> f266c;
        protected final f d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, null);
            new a(8, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            new a(2097152, null, f.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0017f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f265b = i2;
            this.d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.f264a = obj;
            this.f266c = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f264a).getId();
            }
            return 0;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f265b, charSequence, fVar, this.f266c);
        }

        public boolean a(View view, Bundle bundle) {
            Exception e2;
            f.a newInstance;
            if (this.d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f266c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e3) {
                        e2 = e3;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e4) {
                        e2 = e4;
                        aVar = newInstance;
                        Class<? extends f.a> cls2 = this.f266c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e2);
                        return this.d.a(view, aVar);
                    }
                }
                return this.d.a(view, aVar);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f267a;

        b(Object obj) {
            this.f267a = obj;
        }

        public static b a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: a.g.l.d0.c$c */
    /* loaded from: classes.dex */
    public static class C0016c {

        /* renamed from: a */
        final Object f268a;

        C0016c(Object obj) {
            this.f268a = obj;
        }

        public static C0016c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0016c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0016c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0016c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f261a = accessibilityNodeInfo;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static c a(c cVar) {
        return a(AccessibilityNodeInfo.obtain(cVar.f261a));
    }

    public static c a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private List<Integer> a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f261a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f261a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void a(int i, boolean z) {
        Bundle e = e();
        if (e != null) {
            int i2 = e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            e.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private static String b(int i) {
        if (i != 1) {
            if (i == 2) {
                return "ACTION_CLEAR_FOCUS";
            }
            switch (i) {
                case 4:
                    return "ACTION_SELECT";
                case 8:
                    return "ACTION_CLEAR_SELECTION";
                case 16:
                    return "ACTION_CLICK";
                case 32:
                    return "ACTION_LONG_CLICK";
                case 64:
                    return "ACTION_ACCESSIBILITY_FOCUS";
                case 128:
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                case 256:
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                case 512:
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                case 1024:
                    return "ACTION_NEXT_HTML_ELEMENT";
                case 2048:
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                case 4096:
                    return "ACTION_SCROLL_FORWARD";
                case 8192:
                    return "ACTION_SCROLL_BACKWARD";
                case 16384:
                    return "ACTION_COPY";
                case 32768:
                    return "ACTION_PASTE";
                case 65536:
                    return "ACTION_CUT";
                case 131072:
                    return "ACTION_SET_SELECTION";
                default:
                    return "ACTION_UNKNOWN";
            }
        }
        return "ACTION_FOCUS";
    }

    private boolean c(int i) {
        Bundle e = e();
        return e != null && (e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    private SparseArray<WeakReference<ClickableSpan>> d(View view) {
        SparseArray<WeakReference<ClickableSpan>> e = e(view);
        if (e == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(a.g.b.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return e;
    }

    private SparseArray<WeakReference<ClickableSpan>> e(View view) {
        return (SparseArray) view.getTag(a.g.b.tag_accessibility_clickable_spans);
    }

    public static c f(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    private void g(View view) {
        SparseArray<WeakReference<ClickableSpan>> e = e(view);
        if (e != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < e.size(); i++) {
                if (e.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public static ClickableSpan[] h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void x() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f261a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f261a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f261a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f261a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean y() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static c z() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public int a() {
        return this.f261a.getActions();
    }

    public void a(int i) {
        this.f261a.addAction(i);
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f261a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f264a);
        }
    }

    public void a(Rect rect) {
        this.f261a.getBoundsInParent(rect);
    }

    public void a(View view) {
        this.f261a.addChild(view);
    }

    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f261a.addChild(view, i);
        }
    }

    public void a(CharSequence charSequence) {
        this.f261a.setClassName(charSequence);
    }

    public void a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        x();
        g(view);
        ClickableSpan[] h = h(charSequence);
        if (h == null || h.length <= 0) {
            return;
        }
        e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.g.b.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> d2 = d(view);
        for (int i2 = 0; h != null && i2 < h.length; i2++) {
            int a2 = a(h[i2], d2);
            d2.put(a2, new WeakReference<>(h[i2]));
            a(h[i2], (Spanned) charSequence, a2);
        }
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f261a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f267a);
        }
    }

    public void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f261a.setAccessibilityFocused(z);
        }
    }

    public boolean a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f261a.performAction(i, bundle);
        }
        return false;
    }

    public int b() {
        return this.f261a.getChildCount();
    }

    public void b(Rect rect) {
        this.f261a.getBoundsInScreen(rect);
    }

    public void b(View view) {
        this.f262b = -1;
        this.f261a.setParent(view);
    }

    public void b(View view, int i) {
        this.f262b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f261a.setParent(view, i);
        }
    }

    public void b(CharSequence charSequence) {
        this.f261a.setContentDescription(charSequence);
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f261a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0016c) obj).f268a);
        }
    }

    public void b(boolean z) {
        this.f261a.setCheckable(z);
    }

    public boolean b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f261a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f264a);
        }
        return false;
    }

    public CharSequence c() {
        return this.f261a.getClassName();
    }

    public void c(Rect rect) {
        this.f261a.setBoundsInParent(rect);
    }

    public void c(View view) {
        this.f263c = -1;
        this.f261a.setSource(view);
    }

    public void c(View view, int i) {
        this.f263c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f261a.setSource(view, i);
        }
    }

    public void c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f261a.setError(charSequence);
        }
    }

    public void c(boolean z) {
        this.f261a.setChecked(z);
    }

    public CharSequence d() {
        return this.f261a.getContentDescription();
    }

    public void d(Rect rect) {
        this.f261a.setBoundsInScreen(rect);
    }

    public void d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f261a.setHintText(charSequence);
        } else if (i < 19) {
        } else {
            this.f261a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void d(boolean z) {
        this.f261a.setClickable(z);
    }

    public Bundle e() {
        return Build.VERSION.SDK_INT >= 19 ? this.f261a.getExtras() : new Bundle();
    }

    public void e(CharSequence charSequence) {
        this.f261a.setPackageName(charSequence);
    }

    public void e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f261a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f261a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f261a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f261a)) {
            return false;
        }
        return this.f263c == cVar.f263c && this.f262b == cVar.f262b;
    }

    public CharSequence f() {
        return this.f261a.getPackageName();
    }

    public void f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f261a.setPaneTitle(charSequence);
        } else if (i < 19) {
        } else {
            this.f261a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void f(boolean z) {
        this.f261a.setEnabled(z);
    }

    public CharSequence g() {
        if (y()) {
            List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f261a.getText(), 0, this.f261a.getText().length()));
            for (int i = 0; i < a2.size(); i++) {
                spannableString.setSpan(new a.g.l.d0.a(a5.get(i).intValue(), this, e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
            }
            return spannableString;
        }
        return this.f261a.getText();
    }

    public void g(CharSequence charSequence) {
        this.f261a.setText(charSequence);
    }

    public void g(boolean z) {
        this.f261a.setFocusable(z);
    }

    public String h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f261a.getViewIdResourceName();
        }
        return null;
    }

    public void h(boolean z) {
        this.f261a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f261a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f261a.setHeading(z);
        } else {
            a(2, z);
        }
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f261a.isAccessibilityFocused();
        }
        return false;
    }

    public void j(boolean z) {
        this.f261a.setLongClickable(z);
    }

    public boolean j() {
        return this.f261a.isCheckable();
    }

    public void k(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f261a.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    public boolean k() {
        return this.f261a.isChecked();
    }

    public void l(boolean z) {
        this.f261a.setScrollable(z);
    }

    public boolean l() {
        return this.f261a.isClickable();
    }

    public void m(boolean z) {
        this.f261a.setSelected(z);
    }

    public boolean m() {
        return this.f261a.isEnabled();
    }

    public void n(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f261a.setShowingHintText(z);
        } else {
            a(4, z);
        }
    }

    public boolean n() {
        return this.f261a.isFocusable();
    }

    public void o(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f261a.setVisibleToUser(z);
        }
    }

    public boolean o() {
        return this.f261a.isFocused();
    }

    public boolean p() {
        return this.f261a.isLongClickable();
    }

    public boolean q() {
        return this.f261a.isPassword();
    }

    public boolean r() {
        return this.f261a.isScrollable();
    }

    public boolean s() {
        return this.f261a.isSelected();
    }

    public boolean t() {
        return Build.VERSION.SDK_INT >= 26 ? this.f261a.isShowingHintText() : c(4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(f());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; viewId: ");
        sb.append(h());
        sb.append("; checkable: ");
        sb.append(j());
        sb.append("; checked: ");
        sb.append(k());
        sb.append("; focusable: ");
        sb.append(n());
        sb.append("; focused: ");
        sb.append(o());
        sb.append("; selected: ");
        sb.append(s());
        sb.append("; clickable: ");
        sb.append(l());
        sb.append("; longClickable: ");
        sb.append(p());
        sb.append("; enabled: ");
        sb.append(m());
        sb.append("; password: ");
        sb.append(q());
        sb.append("; scrollable: " + r());
        sb.append("; [");
        int a2 = a();
        while (a2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a2);
            a2 &= numberOfTrailingZeros ^ (-1);
            sb.append(b(numberOfTrailingZeros));
            if (a2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f261a.isVisibleToUser();
        }
        return false;
    }

    public void v() {
        this.f261a.recycle();
    }

    public AccessibilityNodeInfo w() {
        return this.f261a;
    }
}
