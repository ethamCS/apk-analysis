package androidx.core.view.accessibility;

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
import androidx.core.view.accessibility.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class d {

    /* renamed from: d */
    private static int f3610d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3611a;

    /* renamed from: b */
    public int f3612b = -1;

    /* renamed from: c */
    private int f3613c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;

        /* renamed from: a */
        final Object f3636a;

        /* renamed from: b */
        private final int f3637b;

        /* renamed from: c */
        private final Class<? extends g.a> f3638c;

        /* renamed from: d */
        protected final g f3639d;

        /* renamed from: e */
        public static final a f3614e = new a(1, null);

        /* renamed from: f */
        public static final a f3615f = new a(2, null);

        /* renamed from: g */
        public static final a f3616g = new a(4, null);

        /* renamed from: h */
        public static final a f3617h = new a(8, null);

        /* renamed from: i */
        public static final a f3618i = new a(16, null);

        /* renamed from: j */
        public static final a f3619j = new a(32, null);

        /* renamed from: k */
        public static final a f3620k = new a(64, null);

        /* renamed from: l */
        public static final a f3621l = new a(128, null);

        /* renamed from: m */
        public static final a f3622m = new a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, (CharSequence) null, g.b.class);

        /* renamed from: n */
        public static final a f3623n = new a(512, (CharSequence) null, g.b.class);

        /* renamed from: o */
        public static final a f3624o = new a(1024, (CharSequence) null, g.c.class);

        /* renamed from: p */
        public static final a f3625p = new a(2048, (CharSequence) null, g.c.class);

        /* renamed from: q */
        public static final a f3626q = new a(4096, null);

        /* renamed from: r */
        public static final a f3627r = new a(8192, null);

        /* renamed from: s */
        public static final a f3628s = new a(16384, null);

        /* renamed from: t */
        public static final a f3629t = new a(32768, null);

        /* renamed from: u */
        public static final a f3630u = new a(65536, null);

        /* renamed from: v */
        public static final a f3631v = new a(131072, (CharSequence) null, g.C0040g.class);

        /* renamed from: w */
        public static final a f3632w = new a(262144, null);

        /* renamed from: x */
        public static final a f3633x = new a(524288, null);

        /* renamed from: y */
        public static final a f3634y = new a(1048576, null);

        /* renamed from: z */
        public static final a f3635z = new a(2097152, (CharSequence) null, g.h.class);
        public static final a A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        public static final a B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, g.e.class);
        public static final a C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        public static final a D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        public static final a E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        public static final a F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            int i10 = Build.VERSION.SDK_INT;
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, g.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, g.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            Q = new a(accessibilityAction, 16908372, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a(int i10, CharSequence charSequence, g gVar) {
            this(null, i10, charSequence, gVar, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends g.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f3637b = i10;
            this.f3639d = gVar;
            this.f3636a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f3638c = cls;
        }

        public a a(CharSequence charSequence, g gVar) {
            return new a(null, this.f3637b, charSequence, gVar, this.f3638c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3636a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3636a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            Exception e10;
            g.a newInstance;
            if (this.f3639d != null) {
                g.a aVar = null;
                Class<? extends g.a> cls = this.f3638c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e11) {
                        e10 = e11;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e12) {
                        e10 = e12;
                        aVar = newInstance;
                        Class<? extends g.a> cls2 = this.f3638c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e10);
                        return this.f3639d.a(view, aVar);
                    }
                }
                return this.f3639d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f3636a;
                Object obj3 = ((a) obj).f3636a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f3636a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f3640a;

        b(Object obj) {
            this.f3640a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final Object f3641a;

        c(Object obj) {
            this.f3641a = obj;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3611a = accessibilityNodeInfo;
    }

    public static d K() {
        return y0(AccessibilityNodeInfo.obtain());
    }

    public static d L(View view) {
        return y0(AccessibilityNodeInfo.obtain(view));
    }

    public static d M(d dVar) {
        return y0(AccessibilityNodeInfo.obtain(dVar.f3611a));
    }

    private void Q(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < u10.size(); i10++) {
                if (u10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void S(int i10, boolean z10) {
        Bundle r10 = r();
        if (r10 != null) {
            int i11 = r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            r10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void f() {
        this.f3611a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f3611a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f3611a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f3611a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> g(String str) {
        ArrayList<Integer> integerArrayList = this.f3611a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f3611a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String i(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "ACTION_CLEAR_FOCUS";
            }
            switch (i10) {
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
                case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
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
                case 16908372:
                    return "ACTION_IME_ENTER";
                default:
                    switch (i10) {
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
                            switch (i10) {
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
                                case 16908362:
                                    return "ACTION_PRESS_AND_HOLD";
                                default:
                                    return "ACTION_UNKNOWN";
                            }
                    }
            }
        }
        return "ACTION_FOCUS";
    }

    private boolean k(int i10) {
        Bundle r10 = r();
        return r10 != null && (r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(q0.b.I, sparseArray);
            return sparseArray;
        }
        return u10;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(q0.b.I);
    }

    private boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f3610d;
        f3610d = i11 + 1;
        return i11;
    }

    public static d y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    public boolean A() {
        return this.f3611a.isChecked();
    }

    public boolean B() {
        return this.f3611a.isClickable();
    }

    public boolean C() {
        return this.f3611a.isEnabled();
    }

    public boolean D() {
        return this.f3611a.isFocusable();
    }

    public boolean E() {
        return this.f3611a.isFocused();
    }

    public boolean F() {
        return this.f3611a.isLongClickable();
    }

    public boolean G() {
        return this.f3611a.isPassword();
    }

    public boolean H() {
        return this.f3611a.isScrollable();
    }

    public boolean I() {
        return this.f3611a.isSelected();
    }

    public boolean J() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3611a.isShowingHintText() : k(4);
    }

    public boolean N(int i10, Bundle bundle) {
        return this.f3611a.performAction(i10, bundle);
    }

    public void O() {
        this.f3611a.recycle();
    }

    public boolean P(a aVar) {
        return this.f3611a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3636a);
    }

    public void R(boolean z10) {
        this.f3611a.setAccessibilityFocused(z10);
    }

    @Deprecated
    public void T(Rect rect) {
        this.f3611a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f3611a.setBoundsInScreen(rect);
    }

    public void V(boolean z10) {
        this.f3611a.setCheckable(z10);
    }

    public void W(boolean z10) {
        this.f3611a.setChecked(z10);
    }

    public void X(CharSequence charSequence) {
        this.f3611a.setClassName(charSequence);
    }

    public void Y(boolean z10) {
        this.f3611a.setClickable(z10);
    }

    public void Z(Object obj) {
        this.f3611a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f3640a);
    }

    public void a(int i10) {
        this.f3611a.addAction(i10);
    }

    public void a0(Object obj) {
        this.f3611a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f3641a);
    }

    public void b(a aVar) {
        this.f3611a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3636a);
    }

    public void b0(CharSequence charSequence) {
        this.f3611a.setContentDescription(charSequence);
    }

    public void c(View view, int i10) {
        this.f3611a.addChild(view, i10);
    }

    public void c0(boolean z10) {
        this.f3611a.setEnabled(z10);
    }

    public void d0(CharSequence charSequence) {
        this.f3611a.setError(charSequence);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            Q(view);
            ClickableSpan[] p10 = p(charSequence);
            if (p10 == null || p10.length <= 0) {
                return;
            }
            r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", q0.b.f19285a);
            SparseArray<WeakReference<ClickableSpan>> s10 = s(view);
            for (int i10 = 0; i10 < p10.length; i10++) {
                int y10 = y(p10[i10], s10);
                s10.put(y10, new WeakReference<>(p10[i10]));
                d(p10[i10], (Spanned) charSequence, y10);
            }
        }
    }

    public void e0(boolean z10) {
        this.f3611a.setFocusable(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3611a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f3611a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f3611a)) {
            return false;
        }
        return this.f3613c == dVar.f3613c && this.f3612b == dVar.f3612b;
    }

    public void f0(boolean z10) {
        this.f3611a.setFocused(z10);
    }

    public void g0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3611a.setHeading(z10);
        } else {
            S(2, z10);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3611a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3611a.setHintText(charSequence);
        } else {
            this.f3611a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3611a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(View view) {
        this.f3611a.setLabelFor(view);
    }

    public int j() {
        return this.f3611a.getActions();
    }

    public void j0(int i10) {
        this.f3611a.setMaxTextLength(i10);
    }

    public void k0(CharSequence charSequence) {
        this.f3611a.setPackageName(charSequence);
    }

    @Deprecated
    public void l(Rect rect) {
        this.f3611a.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3611a.setPaneTitle(charSequence);
        } else {
            this.f3611a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void m(Rect rect) {
        this.f3611a.getBoundsInScreen(rect);
    }

    public void m0(View view) {
        this.f3612b = -1;
        this.f3611a.setParent(view);
    }

    public int n() {
        return this.f3611a.getChildCount();
    }

    public void n0(View view, int i10) {
        this.f3612b = i10;
        this.f3611a.setParent(view, i10);
    }

    public CharSequence o() {
        return this.f3611a.getClassName();
    }

    public void o0(CharSequence charSequence) {
        this.f3611a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void p0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3611a.setScreenReaderFocusable(z10);
        } else {
            S(1, z10);
        }
    }

    public CharSequence q() {
        return this.f3611a.getContentDescription();
    }

    public void q0(boolean z10) {
        this.f3611a.setScrollable(z10);
    }

    public Bundle r() {
        return this.f3611a.getExtras();
    }

    public void r0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3611a.setShowingHintText(z10);
        } else {
            S(4, z10);
        }
    }

    public void s0(View view, int i10) {
        this.f3613c = i10;
        this.f3611a.setSource(view, i10);
    }

    public CharSequence t() {
        return this.f3611a.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        if (androidx.core.os.a.a()) {
            this.f3611a.setStateDescription(charSequence);
        } else {
            this.f3611a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb2.append("; boundsInParent: " + rect);
        m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(t());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(v());
        sb2.append("; contentDescription: ");
        sb2.append(q());
        sb2.append("; viewId: ");
        sb2.append(w());
        sb2.append("; checkable: ");
        sb2.append(z());
        sb2.append("; checked: ");
        sb2.append(A());
        sb2.append("; focusable: ");
        sb2.append(D());
        sb2.append("; focused: ");
        sb2.append(E());
        sb2.append("; selected: ");
        sb2.append(I());
        sb2.append("; clickable: ");
        sb2.append(B());
        sb2.append("; longClickable: ");
        sb2.append(F());
        sb2.append("; enabled: ");
        sb2.append(C());
        sb2.append("; password: ");
        sb2.append(G());
        sb2.append("; scrollable: " + H());
        sb2.append("; [");
        List<a> h10 = h();
        for (int i10 = 0; i10 < h10.size(); i10++) {
            a aVar = h10.get(i10);
            String i11 = i(aVar.b());
            if (i11.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i11 = aVar.c().toString();
            }
            sb2.append(i11);
            if (i10 != h10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void u0(CharSequence charSequence) {
        this.f3611a.setText(charSequence);
    }

    public CharSequence v() {
        if (x()) {
            List<Integer> g10 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> g11 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> g12 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> g13 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3611a.getText(), 0, this.f3611a.getText().length()));
            for (int i10 = 0; i10 < g10.size(); i10++) {
                spannableString.setSpan(new androidx.core.view.accessibility.a(g13.get(i10).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g10.get(i10).intValue(), g11.get(i10).intValue(), g12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f3611a.getText();
    }

    public void v0(View view) {
        this.f3611a.setTraversalAfter(view);
    }

    public String w() {
        return this.f3611a.getViewIdResourceName();
    }

    public void w0(boolean z10) {
        this.f3611a.setVisibleToUser(z10);
    }

    public AccessibilityNodeInfo x0() {
        return this.f3611a;
    }

    public boolean z() {
        return this.f3611a.isCheckable();
    }
}
