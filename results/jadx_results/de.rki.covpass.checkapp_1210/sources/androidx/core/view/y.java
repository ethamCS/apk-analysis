package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.accessibility.d;
import androidx.core.view.j0;
import androidx.core.view.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class y {

    /* renamed from: c */
    private static Field f3735c;

    /* renamed from: a */
    private static final AtomicInteger f3733a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap<View, e0> f3734b = null;

    /* renamed from: d */
    private static boolean f3736d = false;

    /* renamed from: e */
    private static final int[] f3737e = {q0.b.f19286b, q0.b.f19287c, q0.b.f19298n, q0.b.f19309y, q0.b.B, q0.b.C, q0.b.D, q0.b.E, q0.b.F, q0.b.G, q0.b.f19288d, q0.b.f19289e, q0.b.f19290f, q0.b.f19291g, q0.b.f19292h, q0.b.f19293i, q0.b.f19294j, q0.b.f19295k, q0.b.f19296l, q0.b.f19297m, q0.b.f19299o, q0.b.f19300p, q0.b.f19301q, q0.b.f19302r, q0.b.f19303s, q0.b.f19304t, q0.b.f19305u, q0.b.f19306v, q0.b.f19307w, q0.b.f19308x, q0.b.f19310z, q0.b.A};

    /* renamed from: f */
    private static final androidx.core.view.u f3738f = x.f3732c;

    /* renamed from: g */
    private static final e f3739g = new e();

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.b(view, charSequence);
        }

        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: c */
        private final WeakHashMap<View, Boolean> f3740c = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                y.X(view, z11 ? 16 : 32);
                this.f3740c.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f3740c.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f3740c.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3740c.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        private final int f3741a;

        /* renamed from: b */
        private final Class<T> f3742b;

        /* renamed from: c */
        private final int f3743c;

        /* renamed from: d */
        private final int f3744d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f3741a = i10;
            this.f3742b = cls;
            this.f3744d = i11;
            this.f3743c = i12;
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f3743c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t10);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f3741a);
            if (!this.f3742b.isInstance(t10)) {
                return null;
            }
            return t10;
        }

        void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (!b() || !h(f(view), t10)) {
            } else {
                y.j(view);
                view.setTag(this.f3741a, t10);
                y.X(view, this.f3744d);
            }
        }

        abstract boolean h(T t10, T t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            j0 f3745a = null;

            /* renamed from: b */
            final /* synthetic */ View f3746b;

            /* renamed from: c */
            final /* synthetic */ androidx.core.view.s f3747c;

            a(View view, androidx.core.view.s sVar) {
                this.f3746b = view;
                this.f3747c = sVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j0 v10 = j0.v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f3746b);
                    if (v10.equals(this.f3745a)) {
                        return this.f3747c.a(view, v10).t();
                    }
                }
                this.f3745a = v10;
                j0 a10 = this.f3747c.a(view, v10);
                if (i10 >= 30) {
                    return a10.t();
                }
                y.l0(view);
                return a10.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(q0.b.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static j0 b(View view, j0 j0Var, Rect rect) {
            WindowInsets t10 = j0Var.t();
            if (t10 != null) {
                return j0.v(view.computeSystemWindowInsets(t10, rect), view);
            }
            rect.setEmpty();
            return j0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static j0 j(View view) {
            return j0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, androidx.core.view.s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(q0.b.L, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(q0.b.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, sVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {
        public static j0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j0 u10 = j0.u(rootWindowInsets);
            u10.r(u10);
            u10.d(view.getRootView());
            return u10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        static void a(View view, final v vVar) {
            int i10 = q0.b.R;
            i0.g gVar = (i0.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new i0.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.z
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return y.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            i0.g gVar = (i0.g) view.getTag(q0.b.R);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.c b(View view, androidx.core.view.c cVar) {
            ContentInfo f10 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? cVar : androidx.core.view.c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, androidx.core.view.t tVar) {
            if (tVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(tVar));
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: a */
        private final androidx.core.view.t f3748a;

        u(androidx.core.view.t tVar) {
            this.f3748a = tVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c g10 = androidx.core.view.c.g(contentInfo);
            androidx.core.view.c a10 = this.f3748a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class w {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3749d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3750a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3751b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3752c = null;

        w() {
        }

        static w a(View view) {
            int i10 = q0.b.Q;
            w wVar = (w) view.getTag(i10);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(i10, wVar2);
                return wVar2;
            }
            return wVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3750a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f3751b == null) {
                this.f3751b = new SparseArray<>();
            }
            return this.f3751b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(q0.b.R);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3750a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3749d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3750a == null) {
                    this.f3750a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3749d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3750a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3750a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3752c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f3752c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d10 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d10.valueAt(indexOfKey);
                    d10.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d10.get(keyEvent.getKeyCode());
                }
                if (weakReference2 == null) {
                    return false;
                }
                View view = weakReference2.get();
                if (view != null && y.R(view)) {
                    e(view, keyEvent);
                }
                return true;
            }
            return false;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static void A0(View view, androidx.core.view.s sVar) {
        m.u(view, sVar);
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, int i10, int i11, int i12, int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    public static int C(View view) {
        return h.d(view);
    }

    public static void C0(View view, androidx.core.view.w wVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (wVar != null ? wVar.a() : null));
        }
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, boolean z10) {
        n0().g(view, Boolean.valueOf(z10));
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.a(view) : (String[]) view.getTag(q0.b.N);
    }

    public static void E0(View view, int i10, int i11) {
        n.d(view, i10, i11);
    }

    public static int F(View view) {
        return i.e(view);
    }

    public static void F0(View view, CharSequence charSequence) {
        I0().g(view, charSequence);
    }

    public static int G(View view) {
        return i.f(view);
    }

    public static void G0(View view, String str) {
        m.v(view, str);
    }

    public static j0 H(View view) {
        return n.a(view);
    }

    private static void H0(View view) {
        if (z(view) == 0) {
            y0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (z((View) parent) == 4) {
                y0(view, 2);
                return;
            }
        }
    }

    public static CharSequence I(View view) {
        return I0().f(view);
    }

    private static f<CharSequence> I0() {
        return new c(q0.b.P, CharSequence.class, 64, 30);
    }

    public static String J(View view) {
        return m.k(view);
    }

    public static void J0(View view) {
        m.z(view);
    }

    @Deprecated
    public static int K(View view) {
        return h.g(view);
    }

    public static float L(View view) {
        return m.m(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static boolean N(View view) {
        return g.a(view);
    }

    public static boolean O(View view) {
        return h.h(view);
    }

    public static boolean P(View view) {
        return h.i(view);
    }

    public static boolean Q(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean R(View view) {
        return k.b(view);
    }

    public static boolean S(View view) {
        return k.c(view);
    }

    public static boolean T(View view) {
        return m.p(view);
    }

    public static boolean U(View view) {
        return i.g(view);
    }

    public static boolean V(View view) {
        Boolean f10 = n0().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static /* synthetic */ androidx.core.view.c W(androidx.core.view.c cVar) {
        return cVar;
    }

    static void X(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z10 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
        int i11 = 32;
        if (o(view) != 0 || z10) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (!z10) {
                i11 = 2048;
            }
            obtain.setEventType(i11);
            k.g(obtain, i10);
            if (z10) {
                obtain.getText().add(p(view));
                H0(view);
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i10 == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            k.g(obtain2, i10);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(p(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                k.e(view.getParent(), view, view, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
            }
        }
    }

    public static void Y(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Z(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static j0 a0(View view, j0 j0Var) {
        WindowInsets t10 = j0Var.t();
        if (t10 != null) {
            WindowInsets b10 = l.b(view, t10);
            if (!b10.equals(t10)) {
                return j0.v(b10, view);
            }
        }
        return j0Var;
    }

    private static f<Boolean> b() {
        return new d(q0.b.J, Boolean.class, 28);
    }

    public static void b0(View view, androidx.core.view.accessibility.d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.x0());
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.g gVar) {
        int r10 = r(view, charSequence);
        if (r10 != -1) {
            d(view, new d.a(r10, charSequence, gVar));
        }
        return r10;
    }

    private static f<CharSequence> c0() {
        return new b(q0.b.K, CharSequence.class, 8, 28);
    }

    private static void d(View view, d.a aVar) {
        j(view);
        j0(aVar.b(), view);
        q(view).add(aVar);
        X(view, 0);
    }

    public static boolean d0(View view, int i10, Bundle bundle) {
        return h.j(view, i10, bundle);
    }

    public static e0 e(View view) {
        if (f3734b == null) {
            f3734b = new WeakHashMap<>();
        }
        e0 e0Var = f3734b.get(view);
        if (e0Var == null) {
            e0 e0Var2 = new e0(view);
            f3734b.put(view, e0Var2);
            return e0Var2;
        }
        return e0Var;
    }

    public static androidx.core.view.c e0(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, cVar);
        }
        androidx.core.view.t tVar = (androidx.core.view.t) view.getTag(q0.b.M);
        if (tVar == null) {
            return x(view).a(cVar);
        }
        androidx.core.view.c a10 = tVar.a(view, cVar);
        if (a10 != null) {
            return x(view).a(a10);
        }
        return null;
    }

    public static j0 f(View view, j0 j0Var, Rect rect) {
        return m.b(view, j0Var, rect);
    }

    public static void f0(View view) {
        h.k(view);
    }

    public static j0 g(View view, j0 j0Var) {
        WindowInsets t10 = j0Var.t();
        if (t10 != null) {
            WindowInsets a10 = l.a(view, t10);
            if (!a10.equals(t10)) {
                return j0.v(a10, view);
            }
        }
        return j0Var;
    }

    public static void g0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static void h0(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    public static void i0(View view, int i10) {
        j0(i10, view);
        X(view, 0);
    }

    static void j(View view) {
        androidx.core.view.a l10 = l(view);
        if (l10 == null) {
            l10 = new androidx.core.view.a();
        }
        o0(view, l10);
    }

    private static void j0(int i10, View view) {
        List<d.a> q10 = q(view);
        for (int i11 = 0; i11 < q10.size(); i11++) {
            if (q10.get(i11).b() == i10) {
                q10.remove(i11);
                return;
            }
        }
    }

    public static int k() {
        return i.a();
    }

    public static void k0(View view, d.a aVar, CharSequence charSequence, androidx.core.view.accessibility.g gVar) {
        if (gVar == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, gVar));
        }
    }

    public static androidx.core.view.a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        return m10 instanceof a.C0038a ? ((a.C0038a) m10).f3604a : new androidx.core.view.a(m10);
    }

    public static void l0(View view) {
        l.c(view);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : n(view);
    }

    public static void m0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f3736d) {
            return null;
        }
        if (f3735c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3735c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3736d = true;
                return null;
            }
        }
        try {
            Object obj = f3735c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f3736d = true;
            return null;
        }
    }

    private static f<Boolean> n0() {
        return new a(q0.b.O, Boolean.class, 28);
    }

    public static int o(View view) {
        return k.a(view);
    }

    public static void o0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (m(view) instanceof a.C0038a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static CharSequence p(View view) {
        return c0().f(view);
    }

    public static void p0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    private static List<d.a> q(View view) {
        int i10 = q0.b.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void q0(View view, int i10) {
        k.f(view, i10);
    }

    private static int r(View view, CharSequence charSequence) {
        List<d.a> q10 = q(view);
        for (int i10 = 0; i10 < q10.size(); i10++) {
            if (TextUtils.equals(charSequence, q10.get(i10).c())) {
                return q10.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f3737e;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < q10.size(); i14++) {
                z10 &= q10.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void r0(View view, CharSequence charSequence) {
        c0().g(view, charSequence);
        if (charSequence != null) {
            f3739g.a(view);
        } else {
            f3739g.d(view);
        }
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, float f10) {
        m.s(view, f10);
    }

    private static androidx.core.view.u x(View view) {
        return view instanceof androidx.core.view.u ? (androidx.core.view.u) view : f3738f;
    }

    public static void x0(View view, boolean z10) {
        h.r(view, z10);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, int i10) {
        h.s(view, i10);
    }

    public static int z(View view) {
        return h.c(view);
    }

    public static void z0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i10);
        }
    }
}
