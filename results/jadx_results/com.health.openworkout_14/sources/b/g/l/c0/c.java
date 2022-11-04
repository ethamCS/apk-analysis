package b.g.l.c0;

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
import b.g.l.c0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class c {

    /* renamed from: d */
    private static int f2523d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f2524a;

    /* renamed from: b */
    public int f2525b = -1;

    /* renamed from: c */
    private int f2526c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e */
        public static final a f2527e = new a(1, null);

        /* renamed from: f */
        public static final a f2528f = new a(2, null);

        /* renamed from: g */
        public static final a f2529g = new a(16, null);

        /* renamed from: h */
        public static final a f2530h = new a(4096, null);
        public static final a i = new a(8192, null);
        public static final a j = new a(262144, null);
        public static final a k = new a(524288, null);
        public static final a l = new a(1048576, null);
        public static final a m;
        public static final a n;

        /* renamed from: a */
        final Object f2531a;

        /* renamed from: b */
        private final int f2532b;

        /* renamed from: c */
        private final Class<? extends f.a> f2533c;

        /* renamed from: d */
        protected final f f2534d;

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
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            new a(2097152, null, f.h.class);
            int i2 = Build.VERSION.SDK_INT;
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            m = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            n = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0054f.class);
            new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (i2 >= 28) {
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

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f2532b = i2;
            this.f2534d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.f2531a = obj;
            this.f2533c = cls;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f2532b, charSequence, fVar, this.f2533c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2531a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2531a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            Exception e2;
            f.a newInstance;
            if (this.f2534d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f2533c;
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
                        Class<? extends f.a> cls2 = this.f2533c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e2);
                        return this.f2534d.a(view, aVar);
                    }
                }
                return this.f2534d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f2531a;
                Object obj3 = ((a) obj).f2531a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f2531a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f2535a;

        b(Object obj) {
            this.f2535a = obj;
        }

        public static b a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }

        public static b b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: b.g.l.c0.c$c */
    /* loaded from: classes.dex */
    public static class C0053c {

        /* renamed from: a */
        final Object f2536a;

        C0053c(Object obj) {
            this.f2536a = obj;
        }

        public static C0053c f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0053c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0053c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0053c(null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2536a).getColumnIndex();
            }
            return 0;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2536a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2536a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2536a).getRowSpan();
            }
            return 0;
        }

        public boolean e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f2536a).isSelected();
            }
            return false;
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2524a = accessibilityNodeInfo;
    }

    private int A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2523d;
        f2523d = i2 + 1;
        return i2;
    }

    public static c A0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c O() {
        return A0(AccessibilityNodeInfo.obtain());
    }

    public static c P(View view) {
        return A0(AccessibilityNodeInfo.obtain(view));
    }

    public static c Q(c cVar) {
        return A0(AccessibilityNodeInfo.obtain(cVar.f2524a));
    }

    private void U(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = w(view);
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < w.size(); i++) {
                if (w.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                w.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void W(int i, boolean z) {
        Bundle t = t();
        if (t != null) {
            int i2 = t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            t.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2524a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2524a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2524a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2524a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2524a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2524a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String j(int i) {
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
                case 262144:
                    return "ACTION_EXPAND";
                case 524288:
                    return "ACTION_COLLAPSE";
                case 2097152:
                    return "ACTION_SET_TEXT";
                case 16908354:
                    return "ACTION_MOVE_WINDOW";
                default:
                    switch (i) {
                        case 16908342:
                            return "ACTION_SHOW_ON_SCREEN";
                        case 16908343:
                            return "ACTION_SCROLL_TO_POSITION";
                        case 16908344:
                            return "ACTION_SCROLL_UP";
                        case 16908345:
                            return "ACTION_SCROLL_LEFT";
                        case 16908346:
                            return "ACTION_SCROLL_DOWN";
                        case 16908347:
                            return "ACTION_SCROLL_RIGHT";
                        case 16908348:
                            return "ACTION_CONTEXT_CLICK";
                        case 16908349:
                            return "ACTION_SET_PROGRESS";
                        default:
                            switch (i) {
                                case 16908356:
                                    return "ACTION_SHOW_TOOLTIP";
                                case 16908357:
                                    return "ACTION_HIDE_TOOLTIP";
                                case 16908358:
                                    return "ACTION_PAGE_UP";
                                case 16908359:
                                    return "ACTION_PAGE_DOWN";
                                case 16908360:
                                    return "ACTION_PAGE_LEFT";
                                case 16908361:
                                    return "ACTION_PAGE_RIGHT";
                                default:
                                    return "ACTION_UNKNOWN";
                            }
                    }
            }
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int i) {
        Bundle t = t();
        return t != null && (t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = w(view);
        if (w == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(b.g.b.c_res_0x7f0901b9, sparseArray);
            return sparseArray;
        }
        return w;
    }

    private SparseArray<WeakReference<ClickableSpan>> w(View view) {
        return (SparseArray) view.getTag(b.g.b.c_res_0x7f0901b9);
    }

    private boolean z() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public boolean B() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2524a.isAccessibilityFocused();
        }
        return false;
    }

    public boolean C() {
        return this.f2524a.isCheckable();
    }

    public boolean D() {
        return this.f2524a.isChecked();
    }

    public boolean E() {
        return this.f2524a.isClickable();
    }

    public boolean F() {
        return this.f2524a.isEnabled();
    }

    public boolean G() {
        return this.f2524a.isFocusable();
    }

    public boolean H() {
        return this.f2524a.isFocused();
    }

    public boolean I() {
        return this.f2524a.isLongClickable();
    }

    public boolean J() {
        return this.f2524a.isPassword();
    }

    public boolean K() {
        return this.f2524a.isScrollable();
    }

    public boolean L() {
        return this.f2524a.isSelected();
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2524a.isShowingHintText() : l(4);
    }

    public boolean N() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2524a.isVisibleToUser();
        }
        return false;
    }

    public boolean R(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2524a.performAction(i, bundle);
        }
        return false;
    }

    public void S() {
        this.f2524a.recycle();
    }

    public boolean T(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2524a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2531a);
        }
        return false;
    }

    public void V(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2524a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void X(Rect rect) {
        this.f2524a.setBoundsInParent(rect);
    }

    public void Y(Rect rect) {
        this.f2524a.setBoundsInScreen(rect);
    }

    public void Z(boolean z) {
        this.f2524a.setCheckable(z);
    }

    public void a(int i) {
        this.f2524a.addAction(i);
    }

    public void a0(boolean z) {
        this.f2524a.setChecked(z);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2524a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2531a);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f2524a.setClassName(charSequence);
    }

    public void c(View view) {
        this.f2524a.addChild(view);
    }

    public void c0(boolean z) {
        this.f2524a.setClickable(z);
    }

    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2524a.addChild(view, i);
        }
    }

    public void d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2524a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2535a);
        }
    }

    public void e0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2524a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0053c) obj).f2536a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2524a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2524a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2524a)) {
            return false;
        }
        return this.f2526c == cVar.f2526c && this.f2525b == cVar.f2525b;
    }

    public void f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        g();
        U(view);
        ClickableSpan[] q = q(charSequence);
        if (q == null || q.length <= 0) {
            return;
        }
        t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.g.b.a_res_0x7f09000f);
        SparseArray<WeakReference<ClickableSpan>> u = u(view);
        for (int i2 = 0; q != null && i2 < q.length; i2++) {
            int A = A(q[i2], u);
            u.put(A, new WeakReference<>(q[i2]));
            e(q[i2], (Spanned) charSequence, A);
        }
    }

    public void f0(CharSequence charSequence) {
        this.f2524a.setContentDescription(charSequence);
    }

    public void g0(boolean z) {
        this.f2524a.setEnabled(z);
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2524a.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2524a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2524a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void i0(boolean z) {
        this.f2524a.setFocusable(z);
    }

    public void j0(boolean z) {
        this.f2524a.setFocused(z);
    }

    public int k() {
        return this.f2524a.getActions();
    }

    public void k0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2524a.setHeading(z);
        } else {
            W(2, z);
        }
    }

    public void l0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2524a.setHintText(charSequence);
        } else if (i < 19) {
        } else {
            this.f2524a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    public void m(Rect rect) {
        this.f2524a.getBoundsInParent(rect);
    }

    public void m0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2524a.setMaxTextLength(i);
        }
    }

    public void n(Rect rect) {
        this.f2524a.getBoundsInScreen(rect);
    }

    public void n0(CharSequence charSequence) {
        this.f2524a.setPackageName(charSequence);
    }

    public int o() {
        return this.f2524a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f2524a.setPaneTitle(charSequence);
        } else if (i < 19) {
        } else {
            this.f2524a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence p() {
        return this.f2524a.getClassName();
    }

    public void p0(View view) {
        this.f2525b = -1;
        this.f2524a.setParent(view);
    }

    public void q0(View view, int i) {
        this.f2525b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2524a.setParent(view, i);
        }
    }

    public C0053c r() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f2524a.getCollectionItemInfo()) == null) {
            return null;
        }
        return new C0053c(collectionItemInfo);
    }

    public void r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2524a.setScreenReaderFocusable(z);
        } else {
            W(1, z);
        }
    }

    public CharSequence s() {
        return this.f2524a.getContentDescription();
    }

    public void s0(boolean z) {
        this.f2524a.setScrollable(z);
    }

    public Bundle t() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2524a.getExtras() : new Bundle();
    }

    public void t0(boolean z) {
        this.f2524a.setSelected(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(v());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(x());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; viewId: ");
        sb.append(y());
        sb.append("; checkable: ");
        sb.append(C());
        sb.append("; checked: ");
        sb.append(D());
        sb.append("; focusable: ");
        sb.append(G());
        sb.append("; focused: ");
        sb.append(H());
        sb.append("; selected: ");
        sb.append(L());
        sb.append("; clickable: ");
        sb.append(E());
        sb.append("; longClickable: ");
        sb.append(I());
        sb.append("; enabled: ");
        sb.append(F());
        sb.append("; password: ");
        sb.append(J());
        sb.append("; scrollable: " + K());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> i = i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                a aVar = i.get(i2);
                String j = j(aVar.b());
                if (j.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    j = aVar.c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= ~numberOfTrailingZeros;
                sb.append(j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2524a.setShowingHintText(z);
        } else {
            W(4, z);
        }
    }

    public CharSequence v() {
        return this.f2524a.getPackageName();
    }

    public void v0(View view) {
        this.f2526c = -1;
        this.f2524a.setSource(view);
    }

    public void w0(View view, int i) {
        this.f2526c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2524a.setSource(view, i);
        }
    }

    public CharSequence x() {
        if (z()) {
            List<Integer> h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h5 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2524a.getText(), 0, this.f2524a.getText().length()));
            for (int i = 0; i < h2.size(); i++) {
                spannableString.setSpan(new b.g.l.c0.a(h5.get(i).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h2.get(i).intValue(), h3.get(i).intValue(), h4.get(i).intValue());
            }
            return spannableString;
        }
        return this.f2524a.getText();
    }

    public void x0(CharSequence charSequence) {
        this.f2524a.setText(charSequence);
    }

    public String y() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2524a.getViewIdResourceName();
        }
        return null;
    }

    public void y0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2524a.setVisibleToUser(z);
        }
    }

    public AccessibilityNodeInfo z0() {
        return this.f2524a;
    }
}
