package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.e;
import b.a.o.b;
import b.a.o.f;
import b.g.d.c.f;
import b.g.l.b0;
import b.g.l.f;
import b.g.l.x;
import b.g.l.z;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class g extends androidx.appcompat.app.f implements g.a, LayoutInflater.Factory2 {
    private static final b.d.g<String, Integer> b0 = new b.d.g<>();
    private static final boolean c0;
    private static final int[] d0;
    private static final boolean e0;
    private static final boolean f0;
    private static boolean g0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private t[] H;
    private t I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private m S;
    private m T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private androidx.appcompat.app.i a0;

    /* renamed from: e */
    final Object f146e;

    /* renamed from: f */
    final Context f147f;

    /* renamed from: g */
    Window f148g;

    /* renamed from: h */
    private k f149h;
    final androidx.appcompat.app.e i;
    androidx.appcompat.app.a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private i n;
    private u o;
    b.a.o.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    x t;
    private boolean u;
    private boolean v;
    ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f150a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f150a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f150a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f150a.uncaughtException(thread, notFoundException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.V & 1) != 0) {
                gVar.Y(0);
            }
            g gVar2 = g.this;
            if ((gVar2.V & 4096) != 0) {
                gVar2.Y(androidx.constraintlayout.widget.j.H0);
            }
            g gVar3 = g.this;
            gVar3.U = false;
            gVar3.V = 0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.g.l.q {
        c() {
            g.this = r1;
        }

        @Override // b.g.l.q
        public b0 a(View view, b0 b0Var) {
            int i = b0Var.i();
            int P0 = g.this.P0(b0Var, null);
            if (i != P0) {
                b0Var = b0Var.o(b0Var.g(), P0, b0Var.h(), b0Var.f());
            }
            return b.g.l.t.V(view, b0Var);
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0.a {
        d() {
            g.this = r1;
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = g.this.P0(null, rect);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
            g.this = r1;
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.W();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends z {
            a() {
                f.this = r1;
            }

            @Override // b.g.l.y
            public void a(View view) {
                g.this.q.setAlpha(1.0f);
                g.this.t.f(null);
                g.this.t = null;
            }

            @Override // b.g.l.z, b.g.l.y
            public void b(View view) {
                g.this.q.setVisibility(0);
            }
        }

        f() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.r.showAtLocation(gVar.q, 55, 0, 0);
            g.this.Z();
            if (!g.this.H0()) {
                g.this.q.setAlpha(1.0f);
                g.this.q.setVisibility(0);
                return;
            }
            g.this.q.setAlpha(0.0f);
            g gVar2 = g.this;
            x c2 = b.g.l.t.c(gVar2.q);
            c2.a(1.0f);
            gVar2.t = c2;
            g.this.t.f(new a());
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    /* loaded from: classes.dex */
    public class C0007g extends z {
        C0007g() {
            g.this = r1;
        }

        @Override // b.g.l.y
        public void a(View view) {
            g.this.q.setAlpha(1.0f);
            g.this.t.f(null);
            g.this.t = null;
        }

        @Override // b.g.l.z, b.g.l.y
        public void b(View view) {
            g.this.q.setVisibility(0);
            g.this.q.sendAccessibilityEvent(32);
            if (g.this.q.getParent() instanceof View) {
                b.g.l.t.f0((View) g.this.q.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    private class h implements androidx.appcompat.app.b {
        h() {
            g.this = r1;
        }

        @Override // androidx.appcompat.app.b
        public void a(Drawable drawable, int i) {
            androidx.appcompat.app.a p = g.this.p();
            if (p != null) {
                p.u(drawable);
                p.t(i);
            }
        }

        @Override // androidx.appcompat.app.b
        public Context b() {
            return g.this.e0();
        }
    }

    /* loaded from: classes.dex */
    public final class i implements m.a {
        i() {
            g.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            g.this.P(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback j0 = g.this.j0();
            if (j0 != null) {
                j0.onMenuOpened(androidx.constraintlayout.widget.j.H0, gVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class j implements b.a {

        /* renamed from: a */
        private b.a f160a;

        /* loaded from: classes.dex */
        class a extends z {
            a() {
                j.this = r1;
            }

            @Override // b.g.l.y
            public void a(View view) {
                g.this.q.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.q.getParent() instanceof View) {
                    b.g.l.t.f0((View) g.this.q.getParent());
                }
                g.this.q.removeAllViews();
                g.this.t.f(null);
                g gVar2 = g.this;
                gVar2.t = null;
                b.g.l.t.f0(gVar2.w);
            }
        }

        public j(b.a aVar) {
            g.this = r1;
            this.f160a = aVar;
        }

        @Override // b.a.o.b.a
        public boolean a(b.a.o.b bVar, Menu menu) {
            b.g.l.t.f0(g.this.w);
            return this.f160a.a(bVar, menu);
        }

        @Override // b.a.o.b.a
        public boolean b(b.a.o.b bVar, MenuItem menuItem) {
            return this.f160a.b(bVar, menuItem);
        }

        @Override // b.a.o.b.a
        public boolean c(b.a.o.b bVar, Menu menu) {
            return this.f160a.c(bVar, menu);
        }

        @Override // b.a.o.b.a
        public void d(b.a.o.b bVar) {
            this.f160a.d(bVar);
            g gVar = g.this;
            if (gVar.r != null) {
                gVar.f148g.getDecorView().removeCallbacks(g.this.s);
            }
            g gVar2 = g.this;
            if (gVar2.q != null) {
                gVar2.Z();
                g gVar3 = g.this;
                x c2 = b.g.l.t.c(gVar3.q);
                c2.a(0.0f);
                gVar3.t = c2;
                g.this.t.f(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.e eVar = gVar4.i;
            if (eVar != null) {
                eVar.i(gVar4.p);
            }
            g gVar5 = g.this;
            gVar5.p = null;
            b.g.l.t.f0(gVar5.w);
        }
    }

    /* loaded from: classes.dex */
    public class k extends b.a.o.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Window.Callback callback) {
            super(callback);
            g.this = r1;
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f147f, callback);
            b.a.o.b J0 = g.this.J0(aVar);
            if (J0 != null) {
                return aVar.e(J0);
            }
            return null;
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.v0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g.this.y0(i);
            return true;
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            g.this.z0(i);
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.e0(false);
            }
            return onPreparePanel;
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            t h0 = g.this.h0(0, true);
            if (h0 == null || (gVar = h0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return g.this.q0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!g.this.q0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : b(callback);
        }
    }

    /* loaded from: classes.dex */
    public class l extends m {

        /* renamed from: c */
        private final PowerManager f164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super();
            g.this = r1;
            this.f164c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.m
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.g.m
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f164c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.g.m
        public void d() {
            g.this.e();
        }
    }

    /* loaded from: classes.dex */
    public abstract class m {

        /* renamed from: a */
        private BroadcastReceiver f166a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
                m.this = r1;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                m.this.d();
            }
        }

        m() {
            g.this = r1;
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f166a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f147f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f166a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f166a == null) {
                this.f166a = new a();
            }
            g.this.f147f.registerReceiver(this.f166a, b2);
        }
    }

    /* loaded from: classes.dex */
    public class n extends m {

        /* renamed from: c */
        private final androidx.appcompat.app.m f169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.appcompat.app.m mVar) {
            super();
            g.this = r1;
            this.f169c = mVar;
        }

        @Override // androidx.appcompat.app.g.m
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.m
        public int c() {
            return this.f169c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.m
        public void d() {
            g.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class s extends ContentFrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Context context) {
            super(context);
            g.this = r1;
        }

        private boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.R(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(b.a.k.a.a.d(getContext(), i));
        }
    }

    /* loaded from: classes.dex */
    public static final class t {

        /* renamed from: a */
        int f171a;

        /* renamed from: b */
        int f172b;

        /* renamed from: c */
        int f173c;

        /* renamed from: d */
        int f174d;

        /* renamed from: e */
        int f175e;

        /* renamed from: f */
        int f176f;

        /* renamed from: g */
        ViewGroup f177g;

        /* renamed from: h */
        View f178h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        t(int i) {
            this.f171a = i;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, b.a.g.j_res_0x7f0c0010);
                this.k = eVar;
                eVar.k(aVar);
                this.j.b(this.k);
            }
            return this.k.g(this.f177g);
        }

        public boolean b() {
            if (this.f178h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.Q(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(b.a.a.a_res_0x7f040003, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(b.a.a.G, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = b.a.i.c_res_0x7f1101ab;
            }
            newTheme.applyStyle(i2, true);
            b.a.o.d dVar = new b.a.o.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(b.a.j.u0);
            this.f172b = obtainStyledAttributes.getResourceId(b.a.j.x0, 0);
            this.f176f = obtainStyledAttributes.getResourceId(b.a.j.w0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class u implements m.a {
        u() {
            g.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g F = gVar.F();
            boolean z2 = F != gVar;
            g gVar2 = g.this;
            if (z2) {
                gVar = F;
            }
            t c0 = gVar2.c0(gVar);
            if (c0 != null) {
                if (!z2) {
                    g.this.S(c0, z);
                    return;
                }
                g.this.O(c0.f171a, c0, F);
                g.this.S(c0, true);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback j0;
            if (gVar == gVar.F()) {
                g gVar2 = g.this;
                if (!gVar2.B || (j0 = gVar2.j0()) == null || g.this.N) {
                    return true;
                }
                j0.onMenuOpened(androidx.constraintlayout.widget.j.H0, gVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i2 < 21;
        c0 = z2;
        d0 = new int[]{16842836};
        e0 = !"robolectric".equals(Build.FINGERPRINT);
        if (i2 >= 17) {
            z = true;
        }
        f0 = z;
        if (!z2 || g0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        g0 = true;
    }

    public g(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    public g(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private g(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        b.d.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.d M0;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f147f = context;
        this.i = eVar;
        this.f146e = obj;
        if ((obj instanceof Dialog) && (M0 = M0()) != null) {
            this.O = M0.y().n();
        }
        if (this.O == -100 && (num = (gVar = b0).get(obj.getClass().getName())) != null) {
            this.O = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            M(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private void B0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.o || this.N) {
            return;
        }
        if (tVar.f171a == 0) {
            if ((this.f147f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback j0 = j0();
        if (j0 != null && !j0.onMenuOpened(tVar.f171a, tVar.j)) {
            S(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f147f.getSystemService("window");
        if (windowManager == null || !E0(tVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = tVar.f177g;
        if (viewGroup == null || tVar.q) {
            if (viewGroup == null) {
                if (!m0(tVar) || tVar.f177g == null) {
                    return;
                }
            } else if (tVar.q && viewGroup.getChildCount() > 0) {
                tVar.f177g.removeAllViews();
            }
            if (!l0(tVar) || !tVar.b()) {
                tVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = tVar.f178h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            tVar.f177g.setBackgroundResource(tVar.f172b);
            ViewParent parent = tVar.f178h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tVar.f178h);
            }
            tVar.f177g.addView(tVar.f178h, layoutParams2);
            if (!tVar.f178h.hasFocus()) {
                tVar.f178h.requestFocus();
            }
        } else {
            View view = tVar.i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
                tVar.n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, tVar.f174d, tVar.f175e, 1002, 8519680, -3);
                layoutParams3.gravity = tVar.f173c;
                layoutParams3.windowAnimations = tVar.f176f;
                windowManager.addView(tVar.f177g, layoutParams3);
                tVar.o = true;
            }
        }
        i2 = -2;
        tVar.n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, tVar.f174d, tVar.f175e, 1002, 8519680, -3);
        layoutParams32.gravity = tVar.f173c;
        layoutParams32.windowAnimations = tVar.f176f;
        windowManager.addView(tVar.f177g, layoutParams32);
        tVar.o = true;
    }

    private boolean D0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || E0(tVar, keyEvent)) && (gVar = tVar.j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.m == null) {
            S(tVar, true);
        }
        return z;
    }

    private boolean E0(t tVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        c0 c0Var4;
        if (this.N) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.I;
        if (tVar2 != null && tVar2 != tVar) {
            S(tVar2, false);
        }
        Window.Callback j0 = j0();
        if (j0 != null) {
            tVar.i = j0.onCreatePanelView(tVar.f171a);
        }
        int i2 = tVar.f171a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var4 = this.m) != null) {
            c0Var4.f();
        }
        if (tVar.i == null && (!z || !(C0() instanceof androidx.appcompat.app.k))) {
            androidx.appcompat.view.menu.g gVar = tVar.j;
            if (gVar == null || tVar.r) {
                if (gVar == null && (!n0(tVar) || tVar.j == null)) {
                    return false;
                }
                if (z && (c0Var3 = this.m) != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    c0Var3.a(tVar.j, this.n);
                }
                tVar.j.h0();
                if (!j0.onCreatePanelMenu(tVar.f171a, tVar.j)) {
                    tVar.c(null);
                    if (z && (c0Var2 = this.m) != null) {
                        c0Var2.a(null, this.n);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.j.h0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.j.R(bundle);
                tVar.s = null;
            }
            if (!j0.onPreparePanel(0, tVar.i, tVar.j)) {
                if (z && (c0Var = this.m) != null) {
                    c0Var.a(null, this.n);
                }
                tVar.j.g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.j.setQwertyMode(z2);
            tVar.j.g0();
        }
        tVar.m = true;
        tVar.n = false;
        this.I = tVar;
        return true;
    }

    private void F0(boolean z) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.g() || (ViewConfiguration.get(this.f147f).hasPermanentMenuKey() && !this.m.b())) {
            t h0 = h0(0, true);
            h0.q = true;
            S(h0, false);
            B0(h0, null);
            return;
        }
        Window.Callback j0 = j0();
        if (this.m.c() && z) {
            this.m.d();
            if (this.N) {
                return;
            }
            j0.onPanelClosed(androidx.constraintlayout.widget.j.H0, h0(0, true).j);
        } else if (j0 == null || this.N) {
        } else {
            if (this.U && (this.V & 1) != 0) {
                this.f148g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            t h02 = h0(0, true);
            androidx.appcompat.view.menu.g gVar = h02.j;
            if (gVar == null || h02.r || !j0.onPreparePanel(0, h02.i, gVar)) {
                return;
            }
            j0.onMenuOpened(androidx.constraintlayout.widget.j.H0, h02.j);
            this.m.e();
        }
    }

    private int G0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return androidx.constraintlayout.widget.j.H0;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return androidx.constraintlayout.widget.j.I0;
        }
    }

    private boolean I0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f148g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || b.g.l.t.N((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean K(boolean z) {
        if (this.N) {
            return false;
        }
        int N = N();
        boolean N0 = N0(r0(this.f147f, N), z);
        if (N == 0) {
            g0(this.f147f).e();
        } else {
            m mVar = this.S;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (N == 3) {
            f0(this.f147f).e();
        } else {
            m mVar2 = this.T;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return N0;
    }

    private void L() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.f148g.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f147f.obtainStyledAttributes(b.a.j.u0);
        obtainStyledAttributes.getValue(b.a.j.G0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(b.a.j.H0, contentFrameLayout.getMinWidthMinor());
        int i2 = b.a.j.E0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = b.a.j.F0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = b.a.j.C0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = b.a.j.D0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void L0() {
        if (!this.v) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private void M(Window window) {
        if (this.f148g == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof k) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            k kVar = new k(callback);
            this.f149h = kVar;
            window.setCallback(kVar);
            w0 u2 = w0.u(this.f147f, null, d0);
            Drawable h2 = u2.h(0);
            if (h2 != null) {
                window.setBackgroundDrawable(h2);
            }
            u2.w();
            this.f148g = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private androidx.appcompat.app.d M0() {
        for (Context context = this.f147f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int N() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.f.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean N0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f147f
            r1 = 0
            android.content.res.Configuration r0 = r6.T(r0, r7, r1)
            boolean r2 = r6.p0()
            android.content.Context r3 = r6.f147f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.K
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.g.e0
            if (r8 != 0) goto L30
            boolean r8 = r6.L
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f146e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f146e
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.h(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.O0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f146e
            boolean r0 = r8 instanceof androidx.appcompat.app.d
            if (r0 == 0) goto L5e
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.d) r8
            r8.C(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.N0(int, boolean):boolean");
    }

    private void O0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.f147f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i4 = this.P;
        if (i4 != 0) {
            this.f147f.setTheme(i4);
            if (i3 >= 23) {
                this.f147f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.f146e;
            if (!(obj instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) obj;
            if (activity instanceof androidx.lifecycle.i) {
                if (!((androidx.lifecycle.i) activity).a().b().a(e.b.STARTED)) {
                    return;
                }
            } else if (!this.M) {
                return;
            }
            activity.onConfigurationChanged(configuration2);
        }
    }

    private void Q() {
        m mVar = this.S;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.T;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    private void Q0(View view) {
        int i2;
        Context context;
        if ((b.g.l.t.H(view) & 8192) != 0) {
            context = this.f147f;
            i2 = b.a.c.b_res_0x7f060006;
        } else {
            context = this.f147f;
            i2 = b.a.c.a_res_0x7f060005;
        }
        view.setBackgroundColor(b.g.d.a.b(context, i2));
    }

    private Configuration T(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup U() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f147f.obtainStyledAttributes(b.a.j.u0);
        int i2 = b.a.j.z0;
        if (!obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.I0, false)) {
            C(1);
        } else if (obtainStyledAttributes.getBoolean(i2, false)) {
            C(androidx.constraintlayout.widget.j.H0);
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.A0, false)) {
            C(androidx.constraintlayout.widget.j.I0);
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.B0, false)) {
            C(10);
        }
        this.E = obtainStyledAttributes.getBoolean(b.a.j.v0, false);
        obtainStyledAttributes.recycle();
        b0();
        this.f148g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f147f);
        if (this.F) {
            viewGroup = (ViewGroup) from.inflate(this.D ? b.a.g.o_res_0x7f0c0016 : b.a.g.n_res_0x7f0c0015, (ViewGroup) null);
        } else if (this.E) {
            viewGroup = (ViewGroup) from.inflate(b.a.g.f_res_0x7f0c000c, (ViewGroup) null);
            this.C = false;
            this.B = false;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f147f.getTheme().resolveAttribute(b.a.a.f_res_0x7f04000a, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.a.o.d(this.f147f, typedValue.resourceId) : this.f147f).inflate(b.a.g.p_res_0x7f0c0017, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(b.a.f.p_res_0x7f09009a);
            this.m = c0Var;
            c0Var.setWindowCallback(j0());
            if (this.C) {
                this.m.k(androidx.constraintlayout.widget.j.I0);
            }
            if (this.z) {
                this.m.k(2);
            }
            if (this.A) {
                this.m.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            b.g.l.t.t0(viewGroup, new c());
        } else if (viewGroup instanceof g0) {
            ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.m == null) {
            this.x = (TextView) viewGroup.findViewById(b.a.f.M);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b.a.f.b_res_0x7f09003f);
        ViewGroup viewGroup2 = (ViewGroup) this.f148g.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f148g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void a0() {
        if (!this.v) {
            this.w = U();
            CharSequence i0 = i0();
            if (!TextUtils.isEmpty(i0)) {
                c0 c0Var = this.m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(i0);
                } else if (C0() != null) {
                    C0().x(i0);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(i0);
                    }
                }
            }
            L();
            A0(this.w);
            this.v = true;
            t h0 = h0(0, false);
            if (this.N) {
                return;
            }
            if (h0 != null && h0.j != null) {
                return;
            }
            o0(androidx.constraintlayout.widget.j.H0);
        }
    }

    private void b0() {
        if (this.f148g == null) {
            Object obj = this.f146e;
            if (obj instanceof Activity) {
                M(((Activity) obj).getWindow());
            }
        }
        if (this.f148g != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private static Configuration d0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                p.a(configuration, configuration2, configuration3);
            } else if (!b.g.k.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                q.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                o.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private m f0(Context context) {
        if (this.T == null) {
            this.T = new l(context);
        }
        return this.T;
    }

    private m g0(Context context) {
        if (this.S == null) {
            this.S = new n(androidx.appcompat.app.m.a(context));
        }
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0() {
        /*
            r3 = this;
            r3.a0()
            boolean r0 = r3.B
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f146e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f146e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.C
            r0.<init>(r1, r2)
        L1d:
            r3.j = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f146e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L37
            boolean r1 = r3.X
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.k0():void");
    }

    private boolean l0(t tVar) {
        View view = tVar.i;
        if (view != null) {
            tVar.f178h = view;
            return true;
        } else if (tVar.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new u();
            }
            View view2 = (View) tVar.a(this.o);
            tVar.f178h = view2;
            return view2 != null;
        }
    }

    private boolean m0(t tVar) {
        tVar.d(e0());
        tVar.f177g = new s(tVar.l);
        tVar.f173c = 81;
        return true;
    }

    private boolean n0(t tVar) {
        Context context = this.f147f;
        int i2 = tVar.f171a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.a.a.f_res_0x7f04000a, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(b.a.a.g_res_0x7f04000b, typedValue, true);
            } else {
                theme.resolveAttribute(b.a.a.g_res_0x7f04000b, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                b.a.o.d dVar = new b.a.o.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.V(this);
        tVar.c(gVar);
        return true;
    }

    private void o0(int i2) {
        this.V = (1 << i2) | this.V;
        if (!this.U) {
            b.g.l.t.a0(this.f148g.getDecorView(), this.W);
            this.U = true;
        }
    }

    private boolean p0() {
        if (!this.R && (this.f146e instanceof Activity)) {
            PackageManager packageManager = this.f147f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f147f, this.f146e.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private boolean u0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            t h0 = h0(i2, true);
            if (h0.o) {
                return false;
            }
            return E0(h0, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean x0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            b.a.o.b r0 = r4.p
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.g$t r2 = r4.h0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.m
            if (r5 == 0) goto L43
            boolean r5 = r5.g()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f147f
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.m
            boolean r5 = r5.c()
            if (r5 != 0) goto L3c
            boolean r5 = r4.N
            if (r5 != 0) goto L62
            boolean r5 = r4.E0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.c0 r5 = r4.m
            boolean r0 = r5.e()
            goto L68
        L3c:
            androidx.appcompat.widget.c0 r5 = r4.m
            boolean r0 = r5.d()
            goto L68
        L43:
            boolean r5 = r2.o
            if (r5 != 0) goto L64
            boolean r3 = r2.n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.m
            if (r5 == 0) goto L62
            boolean r5 = r2.r
            if (r5 == 0) goto L5b
            r2.m = r1
            boolean r5 = r4.E0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.B0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.S(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f147f
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.x0(int, android.view.KeyEvent):boolean");
    }

    void A0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f
    public boolean C(int i2) {
        int G0 = G0(i2);
        if (!this.F || G0 != 108) {
            if (this.B && G0 == 1) {
                this.B = false;
            }
            if (G0 == 1) {
                L0();
                this.F = true;
                return true;
            } else if (G0 == 2) {
                L0();
                this.z = true;
                return true;
            } else if (G0 == 5) {
                L0();
                this.A = true;
                return true;
            } else if (G0 == 10) {
                L0();
                this.D = true;
                return true;
            } else if (G0 == 108) {
                L0();
                this.B = true;
                return true;
            } else if (G0 != 109) {
                return this.f148g.requestFeature(G0);
            } else {
                L0();
                this.C = true;
                return true;
            }
        }
        return false;
    }

    final androidx.appcompat.app.a C0() {
        return this.j;
    }

    @Override // androidx.appcompat.app.f
    public void D(int i2) {
        a0();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f147f).inflate(i2, viewGroup);
        this.f149h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void E(View view) {
        a0();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f149h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void F(View view, ViewGroup.LayoutParams layoutParams) {
        a0();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f149h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void H(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (!(this.f146e instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a p2 = p();
        if (p2 instanceof androidx.appcompat.app.n) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.k = null;
        if (p2 != null) {
            p2.n();
        }
        if (toolbar != null) {
            androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(toolbar, i0(), this.f149h);
            this.j = kVar;
            window = this.f148g;
            callback = kVar.A();
        } else {
            this.j = null;
            window = this.f148g;
            callback = this.f149h;
        }
        window.setCallback(callback);
        r();
    }

    final boolean H0() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && b.g.l.t.O(viewGroup);
    }

    @Override // androidx.appcompat.app.f
    public void I(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.f
    public final void J(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (C0() != null) {
            C0().x(charSequence);
        } else {
            TextView textView = this.x;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public b.a.o.b J0(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            b.a.o.b bVar = this.p;
            if (bVar != null) {
                bVar.c();
            }
            j jVar = new j(aVar);
            androidx.appcompat.app.a p2 = p();
            if (p2 != null) {
                b.a.o.b y = p2.y(jVar);
                this.p = y;
                if (y != null && (eVar = this.i) != null) {
                    eVar.g(y);
                }
            }
            if (this.p == null) {
                this.p = K0(jVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    b.a.o.b K0(b.a.o.b.a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.K0(b.a.o.b$a):b.a.o.b");
    }

    void O(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.H;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.j;
            }
        }
        if ((tVar == null || tVar.o) && !this.N) {
            this.f149h.a().onPanelClosed(i2, menu);
        }
    }

    void P(androidx.appcompat.view.menu.g gVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.l();
        Window.Callback j0 = j0();
        if (j0 != null && !this.N) {
            j0.onPanelClosed(androidx.constraintlayout.widget.j.H0, gVar);
        }
        this.G = false;
    }

    final int P0(b0 b0Var, Rect rect) {
        boolean z;
        boolean z2;
        int i2 = 0;
        int i3 = b0Var != null ? b0Var.i() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            boolean z3 = true;
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect2 = this.Y;
                Rect rect3 = this.Z;
                if (b0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(b0Var.g(), b0Var.i(), b0Var.h(), b0Var.f());
                }
                c1.a(this.w, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                b0 F = b.g.l.t.F(this.w);
                int g2 = F == null ? 0 : F.g();
                int h2 = F == null ? 0 : F.h();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || this.y != null) {
                    View view = this.y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != g2 || marginLayoutParams2.rightMargin != h2) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = g2;
                            marginLayoutParams2.rightMargin = h2;
                            this.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f147f);
                    this.y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = g2;
                    layoutParams.rightMargin = h2;
                    this.w.addView(this.y, -1, layoutParams);
                }
                View view3 = this.y;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    Q0(this.y);
                }
                if (!this.D && z3) {
                    i3 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.y;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return i3;
    }

    void R(int i2) {
        S(h0(i2, true), true);
    }

    void S(t tVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && tVar.f171a == 0 && (c0Var = this.m) != null && c0Var.c()) {
            P(tVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f147f.getSystemService("window");
        if (windowManager != null && tVar.o && (viewGroup = tVar.f177g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                O(tVar.f171a, tVar, null);
            }
        }
        tVar.m = false;
        tVar.n = false;
        tVar.o = false;
        tVar.f178h = null;
        tVar.q = true;
        if (this.I != tVar) {
            return;
        }
        this.I = null;
    }

    public View V(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.i iVar;
        boolean z2 = false;
        if (this.a0 == null) {
            String string = this.f147f.obtainStyledAttributes(b.a.j.u0).getString(b.a.j.y0);
            if (string == null) {
                iVar = new androidx.appcompat.app.i();
            } else {
                try {
                    this.a0 = (androidx.appcompat.app.i) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    iVar = new androidx.appcompat.app.i();
                }
            }
            this.a0 = iVar;
        }
        boolean z3 = c0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = I0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.a0.q(view, str, context, attributeSet, z, z3, true, b1.b());
    }

    void W() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.r != null) {
            this.f148g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        Z();
        t h0 = h0(0, false);
        if (h0 == null || (gVar = h0.j) == null) {
            return;
        }
        gVar.close();
    }

    boolean X(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f146e;
        boolean z = true;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.f148g.getDecorView()) != null && b.g.l.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f149h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? t0(keyCode, keyEvent) : w0(keyCode, keyEvent);
    }

    void Y(int i2) {
        t h0;
        t h02 = h0(i2, true);
        if (h02.j != null) {
            Bundle bundle = new Bundle();
            h02.j.T(bundle);
            if (bundle.size() > 0) {
                h02.s = bundle;
            }
            h02.j.h0();
            h02.j.clear();
        }
        h02.r = true;
        h02.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (h0 = h0(0, false)) == null) {
            return;
        }
        h0.m = false;
        E0(h0, null);
    }

    void Z() {
        x xVar = this.t;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t c02;
        Window.Callback j0 = j0();
        if (j0 == null || this.N || (c02 = c0(gVar.F())) == null) {
            return false;
        }
        return j0.onMenuItemSelected(c02.f171a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        F0(true);
    }

    t c0(Menu menu) {
        t[] tVarArr = this.H;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        a0();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.f149h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public boolean e() {
        return K(true);
    }

    final Context e0() {
        androidx.appcompat.app.a p2 = p();
        Context k2 = p2 != null ? p2.k() : null;
        return k2 == null ? this.f147f : k2;
    }

    @Override // androidx.appcompat.app.f
    public Context h(Context context) {
        boolean z = true;
        this.K = true;
        int r0 = r0(context, N());
        Configuration configuration = null;
        if (f0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, T(context, r0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof b.a.o.d) {
            try {
                ((b.a.o.d) context).a(T(context, r0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!e0) {
            super.h(context);
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = d0(configuration2, configuration3);
            }
            Configuration T = T(context, r0, configuration);
            b.a.o.d dVar = new b.a.o.d(context, b.a.i.d_res_0x7f1101b7);
            dVar.a(T);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                f.b.a(dVar.getTheme());
            }
            super.h(dVar);
            return dVar;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    protected t h0(int i2, boolean z) {
        t[] tVarArr = this.H;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.H = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar == null) {
            t tVar2 = new t(i2);
            tVarArr[i2] = tVar2;
            return tVar2;
        }
        return tVar;
    }

    final CharSequence i0() {
        Object obj = this.f146e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    final Window.Callback j0() {
        return this.f148g.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T k(int i2) {
        a0();
        return (T) this.f148g.findViewById(i2);
    }

    @Override // androidx.appcompat.app.f
    public final androidx.appcompat.app.b m() {
        return new h();
    }

    @Override // androidx.appcompat.app.f
    public int n() {
        return this.O;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater o() {
        if (this.k == null) {
            k0();
            androidx.appcompat.app.a aVar = this.j;
            this.k = new b.a.o.g(aVar != null ? aVar.k() : this.f147f);
        }
        return this.k;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return V(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a p() {
        k0();
        return this.j;
    }

    @Override // androidx.appcompat.app.f
    public void q() {
        LayoutInflater from = LayoutInflater.from(this.f147f);
        if (from.getFactory() == null) {
            b.g.l.g.b(from, this);
        } else if (from.getFactory2() instanceof g) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean q0() {
        return this.u;
    }

    @Override // androidx.appcompat.app.f
    public void r() {
        androidx.appcompat.app.a p2 = p();
        if (p2 == null || !p2.l()) {
            o0(0);
        }
    }

    int r0(Context context, int i2) {
        m g02;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        g02 = f0(context);
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    g02 = g0(context);
                }
                return g02.c();
            }
            return i2;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.f
    public void s(Configuration configuration) {
        androidx.appcompat.app.a p2;
        if (this.B && this.v && (p2 = p()) != null) {
            p2.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f147f);
        K(false);
    }

    boolean s0() {
        b.a.o.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a p2 = p();
        return p2 != null && p2.h();
    }

    @Override // androidx.appcompat.app.f
    public void t(Bundle bundle) {
        this.K = true;
        K(false);
        b0();
        Object obj = this.f146e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a C0 = C0();
                if (C0 == null) {
                    this.X = true;
                } else {
                    C0.r(true);
                }
            }
            androidx.appcompat.app.f.c(this);
        }
        this.L = true;
    }

    boolean t0(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.J = z;
        } else if (i2 == 82) {
            u0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f146e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.A(r3)
        L9:
            boolean r0 = r3.U
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f148g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f146e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            b.d.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.b0
            java.lang.Object r1 = r3.f146e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            b.d.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.b0
            java.lang.Object r1 = r3.f146e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L5e
            r0.n()
        L5e:
            r3.Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.u():void");
    }

    @Override // androidx.appcompat.app.f
    public void v(Bundle bundle) {
        a0();
    }

    boolean v0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a p2 = p();
        if (p2 == null || !p2.o(i2, keyEvent)) {
            t tVar = this.I;
            if (tVar != null && D0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                t tVar2 = this.I;
                if (tVar2 != null) {
                    tVar2.n = true;
                }
                return true;
            }
            if (this.I == null) {
                t h0 = h0(0, true);
                E0(h0, keyEvent);
                boolean D0 = D0(h0, keyEvent.getKeyCode(), keyEvent, 1);
                h0.m = false;
                if (D0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void w() {
        androidx.appcompat.app.a p2 = p();
        if (p2 != null) {
            p2.v(true);
        }
    }

    boolean w0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            t h0 = h0(0, false);
            if (h0 != null && h0.o) {
                if (!z) {
                    S(h0, true);
                }
                return true;
            } else if (s0()) {
                return true;
            }
        } else if (i2 == 82) {
            x0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void x(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.f
    public void y() {
        this.M = true;
        e();
    }

    void y0(int i2) {
        androidx.appcompat.app.a p2;
        if (i2 != 108 || (p2 = p()) == null) {
            return;
        }
        p2.i(true);
    }

    @Override // androidx.appcompat.app.f
    public void z() {
        this.M = false;
        androidx.appcompat.app.a p2 = p();
        if (p2 != null) {
            p2.v(false);
        }
    }

    void z0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a p2 = p();
            if (p2 == null) {
                return;
            }
            p2.i(false);
        } else if (i2 != 0) {
        } else {
            t h0 = h0(i2, true);
            if (!h0.o) {
                return;
            }
            S(h0, false);
        }
    }
}
