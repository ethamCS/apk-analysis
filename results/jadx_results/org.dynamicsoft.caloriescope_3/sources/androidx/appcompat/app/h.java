package androidx.appcompat.app;

import a.a.n.b;
import a.a.n.f;
import a.g.l.a0;
import a.g.l.d;
import a.g.l.u;
import a.g.l.y;
import a.g.l.z;
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
import androidx.appcompat.app.b;
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
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> b0 = new a.d.a();
    private static final boolean c0;
    private static final int[] d0;
    private static boolean e0;
    private static final boolean f0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private p[] H;
    private p I;
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
    private AppCompatViewInflater a0;
    final Object e;
    final Context f;
    Window g;
    private k h;
    final androidx.appcompat.app.f i;
    androidx.appcompat.app.a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private i n;
    private q o;
    a.a.n.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    y t;
    private boolean u;
    private boolean v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    /* loaded from: classes.dex */
    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f495a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f495a = uncaughtExceptionHandler;
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
                this.f495a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f495a.uncaughtException(thread, notFoundException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.V & 1) != 0) {
                hVar.f(0);
            }
            h hVar2 = h.this;
            if ((hVar2.V & 4096) != 0) {
                hVar2.f(108);
            }
            h hVar3 = h.this;
            hVar3.U = false;
            hVar3.V = 0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.g.l.q {
        c() {
            h.this = r1;
        }

        @Override // a.g.l.q
        public a.g.l.c0 a(View view, a.g.l.c0 c0Var) {
            int e = c0Var.e();
            int j = h.this.j(e);
            if (e != j) {
                c0Var = c0Var.a(c0Var.c(), j, c0Var.d(), c0Var.b());
            }
            return u.b(view, c0Var);
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0.a {
        d() {
            h.this = r1;
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = h.this.j(rect.top);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
            h.this = r1;
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends a0 {
            a() {
                f.this = r1;
            }

            @Override // a.g.l.z
            public void a(View view) {
                h.this.q.setAlpha(1.0f);
                h.this.t.a((z) null);
                h.this.t = null;
            }

            @Override // a.g.l.a0, a.g.l.z
            public void b(View view) {
                h.this.q.setVisibility(0);
            }
        }

        f() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.r.showAtLocation(hVar.q, 55, 0, 0);
            h.this.n();
            if (!h.this.v()) {
                h.this.q.setAlpha(1.0f);
                h.this.q.setVisibility(0);
                return;
            }
            h.this.q.setAlpha(0.0f);
            h hVar2 = h.this;
            y a2 = u.a(hVar2.q);
            a2.a(1.0f);
            hVar2.t = a2;
            h.this.t.a(new a());
        }
    }

    /* loaded from: classes.dex */
    public class g extends a0 {
        g() {
            h.this = r1;
        }

        @Override // a.g.l.z
        public void a(View view) {
            h.this.q.setAlpha(1.0f);
            h.this.t.a((z) null);
            h.this.t = null;
        }

        @Override // a.g.l.a0, a.g.l.z
        public void b(View view) {
            h.this.q.setVisibility(0);
            h.this.q.sendAccessibilityEvent(32);
            if (h.this.q.getParent() instanceof View) {
                u.I((View) h.this.q.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    private class C0031h implements b.AbstractC0030b {
        C0031h() {
            h.this = r1;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(int i) {
            androidx.appcompat.app.a d = h.this.d();
            if (d != null) {
                d.b(i);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(Drawable drawable, int i) {
            androidx.appcompat.app.a d = h.this.d();
            if (d != null) {
                d.a(drawable);
                d.b(i);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public boolean a() {
            androidx.appcompat.app.a d = h.this.d();
            return (d == null || (d.g() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Context b() {
            return h.this.o();
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Drawable c() {
            w0 a2 = w0.a(b(), (AttributeSet) null, new int[]{a.a.a.homeAsUpIndicator});
            Drawable b2 = a2.b(0);
            a2.a();
            return b2;
        }
    }

    /* loaded from: classes.dex */
    public final class i implements m.a {
        i() {
            h.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            h.this.b(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback r = h.this.r();
            if (r != null) {
                r.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class j implements b.a {

        /* renamed from: a */
        private b.a f505a;

        /* loaded from: classes.dex */
        class a extends a0 {
            a() {
                j.this = r1;
            }

            @Override // a.g.l.z
            public void a(View view) {
                h.this.q.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.q.getParent() instanceof View) {
                    u.I((View) h.this.q.getParent());
                }
                h.this.q.removeAllViews();
                h.this.t.a((z) null);
                h.this.t = null;
            }
        }

        public j(b.a aVar) {
            h.this = r1;
            this.f505a = aVar;
        }

        @Override // a.a.n.b.a
        public void a(a.a.n.b bVar) {
            this.f505a.a(bVar);
            h hVar = h.this;
            if (hVar.r != null) {
                hVar.g.getDecorView().removeCallbacks(h.this.s);
            }
            h hVar2 = h.this;
            if (hVar2.q != null) {
                hVar2.n();
                h hVar3 = h.this;
                y a2 = u.a(hVar3.q);
                a2.a(0.0f);
                hVar3.t = a2;
                h.this.t.a(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.f fVar = hVar4.i;
            if (fVar != null) {
                fVar.b(hVar4.p);
            }
            h.this.p = null;
        }

        @Override // a.a.n.b.a
        public boolean a(a.a.n.b bVar, Menu menu) {
            return this.f505a.a(bVar, menu);
        }

        @Override // a.a.n.b.a
        public boolean a(a.a.n.b bVar, MenuItem menuItem) {
            return this.f505a.a(bVar, menuItem);
        }

        @Override // a.a.n.b.a
        public boolean b(a.a.n.b bVar, Menu menu) {
            return this.f505a.b(bVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public class k extends a.a.n.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Window.Callback callback) {
            super(callback);
            h.this = r1;
        }

        final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f, callback);
            a.a.n.b a2 = h.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            h.this.h(i);
            return true;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            h.this.i(i);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.c(false);
            }
            return onPreparePanel;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            p a2 = h.this.a(0, true);
            if (a2 == null || (gVar = a2.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return h.this.s() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!h.this.s() || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    /* loaded from: classes.dex */
    public class l extends m {

        /* renamed from: c */
        private final PowerManager f509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super();
            h.this = r1;
            this.f509c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.m
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.h.m
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f509c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.h.m
        public void d() {
            h.this.l();
        }
    }

    /* loaded from: classes.dex */
    public abstract class m {

        /* renamed from: a */
        private BroadcastReceiver f510a;

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
            h.this = r1;
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f510a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f510a = null;
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
            if (this.f510a == null) {
                this.f510a = new a();
            }
            h.this.f.registerReceiver(this.f510a, b2);
        }
    }

    /* loaded from: classes.dex */
    public class n extends m {

        /* renamed from: c */
        private final androidx.appcompat.app.m f513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.appcompat.app.m mVar) {
            super();
            h.this = r1;
            this.f513c = mVar;
        }

        @Override // androidx.appcompat.app.h.m
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.m
        public int c() {
            return this.f513c.a() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.m
        public void d() {
            h.this.l();
        }
    }

    /* loaded from: classes.dex */
    public class o extends ContentFrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context) {
            super(context);
            h.this = r1;
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.e(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.a.k.a.a.c(getContext(), i));
        }
    }

    /* loaded from: classes.dex */
    public static final class p {

        /* renamed from: a */
        int f514a;

        /* renamed from: b */
        int f515b;

        /* renamed from: c */
        int f516c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
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

        p(int i) {
            this.f514a = i;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, a.a.g.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.a(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(a.a.a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = a.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            a.a.n.d dVar = new a.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.a.j.AppCompatTheme);
            this.f515b = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_panelBackground, 0);
            this.f = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        void a(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.b(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.a(eVar);
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }
    }

    /* loaded from: classes.dex */
    public final class q implements m.a {
        q() {
            h.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g m = gVar.m();
            boolean z2 = m != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = m;
            }
            p a2 = hVar.a((Menu) gVar);
            if (a2 != null) {
                if (!z2) {
                    h.this.a(a2, z);
                    return;
                }
                h.this.a(a2.f514a, a2, m);
                h.this.a(a2, true);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback r;
            if (gVar == null) {
                h hVar = h.this;
                if (!hVar.B || (r = hVar.r()) == null || h.this.N) {
                    return true;
                }
                r.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        c0 = Build.VERSION.SDK_INT < 21;
        d0 = new int[]{16842836};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        f0 = z;
        if (!c0 || e0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        e0 = true;
    }

    public h(Activity activity, androidx.appcompat.app.f fVar) {
        this(activity, null, fVar, activity);
    }

    public h(Dialog dialog, androidx.appcompat.app.f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    private h(Context context, Window window, androidx.appcompat.app.f fVar, Object obj) {
        Integer num;
        androidx.appcompat.app.e G;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f = context;
        this.i = fVar;
        this.e = obj;
        if (this.O == -100 && (obj instanceof Dialog) && (G = G()) != null) {
            this.O = G.k().b();
        }
        if (this.O == -100 && (num = b0.get(this.e.getClass())) != null) {
            this.O = num.intValue();
            b0.remove(this.e.getClass());
        }
        if (window != null) {
            a(window);
        }
        androidx.appcompat.widget.j.c();
    }

    private void A() {
        if (!this.v) {
            this.w = z();
            CharSequence q2 = q();
            if (!TextUtils.isEmpty(q2)) {
                c0 c0Var = this.m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(q2);
                } else if (u() != null) {
                    u().a(q2);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(q2);
                    }
                }
            }
            w();
            a(this.w);
            this.v = true;
            p a2 = a(0, false);
            if (this.N) {
                return;
            }
            if (a2 != null && a2.j != null) {
                return;
            }
            k(108);
        }
    }

    private void B() {
        if (this.g == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.g != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private m C() {
        if (this.T == null) {
            this.T = new l(this.f);
        }
        return this.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D() {
        /*
            r3 = this;
            r3.A()
            boolean r0 = r3.B
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.e
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
            java.lang.Object r1 = r3.e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L37
            boolean r1 = r3.X
            r0.c(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.D():void");
    }

    private boolean E() {
        if (!this.R && (this.e instanceof Activity)) {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.e.getClass()), 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private void F() {
        if (!this.v) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private androidx.appcompat.app.e G() {
        for (Context context = this.f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.e) {
                return (androidx.appcompat.app.e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a(Window window) {
        if (this.g == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof k) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            k kVar = new k(callback);
            this.h = kVar;
            window.setCallback(kVar);
            w0 a2 = w0.a(this.f, (AttributeSet) null, d0);
            Drawable c2 = a2.c(0);
            if (c2 != null) {
                window.setBackgroundDrawable(c2);
            }
            a2.a();
            this.g = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void a(p pVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (pVar.o || this.N) {
            return;
        }
        if (pVar.f514a == 0) {
            if ((this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback r = r();
        if (r != null && !r.onMenuOpened(pVar.f514a, pVar.j)) {
            a(pVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager == null || !b(pVar, keyEvent)) {
            return;
        }
        if (pVar.g == null || pVar.q) {
            ViewGroup viewGroup = pVar.g;
            if (viewGroup == null) {
                if (!b(pVar) || pVar.g == null) {
                    return;
                }
            } else if (pVar.q && viewGroup.getChildCount() > 0) {
                pVar.g.removeAllViews();
            }
            if (!a(pVar) || !pVar.a()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = pVar.h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            pVar.g.setBackgroundResource(pVar.f515b);
            ViewParent parent = pVar.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(pVar.h);
            }
            pVar.g.addView(pVar.h, layoutParams2);
            if (!pVar.h.hasFocus()) {
                pVar.h.requestFocus();
            }
        } else {
            View view = pVar.i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
                pVar.n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, pVar.d, pVar.e, 1002, 8519680, -3);
                layoutParams3.gravity = pVar.f516c;
                layoutParams3.windowAnimations = pVar.f;
                windowManager.addView(pVar.g, layoutParams3);
                pVar.o = true;
            }
        }
        i2 = -2;
        pVar.n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, pVar.d, pVar.e, 1002, 8519680, -3);
        layoutParams32.gravity = pVar.f516c;
        layoutParams32.windowAnimations = pVar.f;
        windowManager.addView(pVar.g, layoutParams32);
        pVar.o = true;
    }

    private void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.e() || (ViewConfiguration.get(this.f).hasPermanentMenuKey() && !this.m.b())) {
            p a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback r = r();
        if (this.m.d() && z) {
            this.m.f();
            if (this.N) {
                return;
            }
            r.onPanelClosed(108, a(0, true).j);
        } else if (r == null || this.N) {
        } else {
            if (this.U && (this.V & 1) != 0) {
                this.g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            p a3 = a(0, true);
            androidx.appcompat.view.menu.g gVar2 = a3.j;
            if (gVar2 == null || a3.r || !r.onPreparePanel(0, a3.i, gVar2)) {
                return;
            }
            r.onMenuOpened(108, a3.j);
            this.m.a();
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || u.C((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(p pVar) {
        View view = pVar.i;
        if (view != null) {
            pVar.h = view;
            return true;
        } else if (pVar.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new q();
            }
            View view2 = (View) pVar.a(this.o);
            pVar.h = view2;
            return view2 != null;
        }
    }

    private boolean a(p pVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pVar.m || b(pVar, keyEvent)) && (gVar = pVar.j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.m == null) {
            a(pVar, true);
        }
        return z;
    }

    private boolean a(boolean z) {
        if (this.N) {
            return false;
        }
        int x = x();
        boolean b2 = b(g(x), z);
        if (x == 0) {
            p().e();
        } else {
            m mVar = this.S;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (x == 3) {
            C().e();
        } else {
            m mVar2 = this.T;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return b2;
    }

    private boolean b(int i2, boolean z) {
        int i3 = this.f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean E = E();
        boolean z3 = false;
        if ((f0 || i4 != i3) && !E && Build.VERSION.SDK_INT >= 17 && !this.K && (this.e instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i4;
            try {
                ((ContextThemeWrapper) this.e).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i5 != i4 && z && !E && this.K && (Build.VERSION.SDK_INT >= 17 || this.L)) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                androidx.core.app.a.b((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i5 == i4) {
            z2 = z3;
        } else {
            c(i4, E);
        }
        if (z2) {
            Object obj2 = this.e;
            if (obj2 instanceof androidx.appcompat.app.e) {
                ((androidx.appcompat.app.e) obj2).c(i2);
            }
        }
        return z2;
    }

    private boolean b(p pVar) {
        pVar.a(o());
        pVar.g = new o(pVar.l);
        pVar.f516c = 81;
        return true;
    }

    private boolean b(p pVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (pVar.m) {
            return true;
        }
        p pVar2 = this.I;
        if (pVar2 != null && pVar2 != pVar) {
            a(pVar2, false);
        }
        Window.Callback r = r();
        if (r != null) {
            pVar.i = r.onCreatePanelView(pVar.f514a);
        }
        int i2 = pVar.f514a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.m) != null) {
            c0Var3.c();
        }
        if (pVar.i == null && (!z || !(u() instanceof androidx.appcompat.app.k))) {
            if (pVar.j == null || pVar.r) {
                if (pVar.j == null && (!c(pVar) || pVar.j == null)) {
                    return false;
                }
                if (z && this.m != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    this.m.a(pVar.j, this.n);
                }
                pVar.j.s();
                if (!r.onCreatePanelMenu(pVar.f514a, pVar.j)) {
                    pVar.a((androidx.appcompat.view.menu.g) null);
                    if (z && (c0Var2 = this.m) != null) {
                        c0Var2.a(null, this.n);
                    }
                    return false;
                }
                pVar.r = false;
            }
            pVar.j.s();
            Bundle bundle = pVar.s;
            if (bundle != null) {
                pVar.j.a(bundle);
                pVar.s = null;
            }
            if (!r.onPreparePanel(0, pVar.i, pVar.j)) {
                if (z && (c0Var = this.m) != null) {
                    c0Var.a(null, this.n);
                }
                pVar.j.r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            pVar.p = z2;
            pVar.j.setQwertyMode(z2);
            pVar.j.r();
        }
        pVar.m = true;
        pVar.n = false;
        this.I = pVar;
        return true;
    }

    private void c(int i2, boolean z) {
        Resources resources = this.f.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.e;
            if (!(obj instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) obj;
            if (activity instanceof androidx.lifecycle.h) {
                if (!((androidx.lifecycle.h) activity).a().a().a(e.b.STARTED)) {
                    return;
                }
            } else if (!this.M) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private boolean c(p pVar) {
        Context context = this.f;
        int i2 = pVar.f514a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                a.a.n.d dVar = new a.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.a(this);
        pVar.a(gVar);
        return true;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            p a2 = a(i2, true);
            if (a2.o) {
                return false;
            }
            return b(a2, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            a.a.n.b r0 = r3.p
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$p r2 = r3.a(r4, r0)
            if (r4 != 0) goto L43
            androidx.appcompat.widget.c0 r4 = r3.m
            if (r4 == 0) goto L43
            boolean r4 = r4.e()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.f
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r4 = r4.d()
            if (r4 != 0) goto L3c
            boolean r4 = r3.N
            if (r4 != 0) goto L62
            boolean r4 = r3.b(r2, r5)
            if (r4 == 0) goto L62
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r0 = r4.a()
            goto L6a
        L3c:
            androidx.appcompat.widget.c0 r4 = r3.m
            boolean r0 = r4.f()
            goto L6a
        L43:
            boolean r4 = r2.o
            if (r4 != 0) goto L64
            boolean r4 = r2.n
            if (r4 == 0) goto L4c
            goto L64
        L4c:
            boolean r4 = r2.m
            if (r4 == 0) goto L62
            boolean r4 = r2.r
            if (r4 == 0) goto L5b
            r2.m = r1
            boolean r4 = r3.b(r2, r5)
            goto L5c
        L5b:
            r4 = 1
        L5c:
            if (r4 == 0) goto L62
            r3.a(r2, r5)
            goto L6a
        L62:
            r0 = 0
            goto L6a
        L64:
            boolean r4 = r2.o
            r3.a(r2, r0)
            r0 = r4
        L6a:
            if (r0 == 0) goto L83
            android.content.Context r4 = r3.f
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L7c
            r4.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.e(int, android.view.KeyEvent):boolean");
    }

    private void k(int i2) {
        this.V = (1 << i2) | this.V;
        if (!this.U) {
            u.a(this.g.getDecorView(), this.W);
            this.U = true;
        }
    }

    private int l(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private void w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.g.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int x() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.g.k();
    }

    private void y() {
        m mVar = this.S;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.T;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    private ViewGroup z() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowNoTitle, false)) {
            b(1);
        } else if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBar, false)) {
            b(108);
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            b(109);
        }
        if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            b(10);
        }
        this.E = obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        B();
        this.g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f);
        if (this.F) {
            viewGroup = (ViewGroup) from.inflate(this.D ? a.a.g.abc_screen_simple_overlay_action_mode : a.a.g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                u.a(viewGroup, new c());
            } else {
                ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
            }
        } else if (this.E) {
            viewGroup = (ViewGroup) from.inflate(a.a.g.abc_dialog_title_material, (ViewGroup) null);
            this.C = false;
            this.B = false;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f.getTheme().resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.a.n.d(this.f, typedValue.resourceId) : this.f).inflate(a.a.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(a.a.f.decor_content_parent);
            this.m = c0Var;
            c0Var.setWindowCallback(r());
            if (this.C) {
                this.m.a(109);
            }
            if (this.z) {
                this.m.a(2);
            }
            if (this.A) {
                this.m.a(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (this.m == null) {
            this.x = (TextView) viewGroup.findViewById(a.a.f.title);
        }
        c1.b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.a.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(16908290);
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
        this.g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    public a.a.n.b a(b.a aVar) {
        androidx.appcompat.app.f fVar;
        if (aVar != null) {
            a.a.n.b bVar = this.p;
            if (bVar != null) {
                bVar.a();
            }
            j jVar = new j(aVar);
            androidx.appcompat.app.a d2 = d();
            if (d2 != null) {
                a.a.n.b a2 = d2.a(jVar);
                this.p = a2;
                if (a2 != null && (fVar = this.i) != null) {
                    fVar.a(a2);
                }
            }
            if (this.p == null) {
                this.p = b(jVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.g
    public <T extends View> T a(int i2) {
        A();
        return (T) this.g.findViewById(i2);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.a0 == null) {
            String string = this.f.obtainStyledAttributes(a.a.j.AppCompatTheme).getString(a.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.a0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.a0 = appCompatViewInflater;
        }
        if (c0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.a0.createView(view, str, context, attributeSet, z, c0, true, b1.b());
    }

    @Override // androidx.appcompat.app.g
    public final b.AbstractC0030b a() {
        return new C0031h();
    }

    protected p a(int i2, boolean z) {
        p[] pVarArr = this.H;
        if (pVarArr == null || pVarArr.length <= i2) {
            p[] pVarArr2 = new p[i2 + 1];
            if (pVarArr != null) {
                System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            }
            this.H = pVarArr2;
            pVarArr = pVarArr2;
        }
        p pVar = pVarArr[i2];
        if (pVar == null) {
            p pVar2 = new p(i2);
            pVarArr[i2] = pVar2;
            return pVar2;
        }
        return pVar;
    }

    p a(Menu menu) {
        p[] pVarArr = this.H;
        int length = pVarArr != null ? pVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            p pVar = pVarArr[i2];
            if (pVar != null && pVar.j == menu) {
                return pVar;
            }
        }
        return null;
    }

    void a(int i2, p pVar, Menu menu) {
        if (menu == null) {
            if (pVar == null && i2 >= 0) {
                p[] pVarArr = this.H;
                if (i2 < pVarArr.length) {
                    pVar = pVarArr[i2];
                }
            }
            if (pVar != null) {
                menu = pVar.j;
            }
        }
        if ((pVar == null || pVar.o) && !this.N) {
            this.h.a().onPanelClosed(i2, menu);
        }
    }

    @Override // androidx.appcompat.app.g
    public void a(Context context) {
        a(false);
        this.K = true;
    }

    @Override // androidx.appcompat.app.g
    public void a(Configuration configuration) {
        androidx.appcompat.app.a d2;
        if (this.B && this.v && (d2 = d()) != null) {
            d2.a(configuration);
        }
        androidx.appcompat.widget.j.b().a(this.f);
        a(false);
    }

    @Override // androidx.appcompat.app.g
    public void a(Bundle bundle) {
        this.K = true;
        a(false);
        B();
        Object obj = this.e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.e.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a u = u();
                if (u == null) {
                    this.X = true;
                } else {
                    u.c(true);
                }
            }
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.g
    public void a(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    void a(ViewGroup viewGroup) {
    }

    void a(p pVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && pVar.f514a == 0 && (c0Var = this.m) != null && c0Var.d()) {
            b(pVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && pVar.o && (viewGroup = pVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                a(pVar.f514a, pVar, null);
            }
        }
        pVar.m = false;
        pVar.n = false;
        pVar.o = false;
        pVar.h = null;
        pVar.q = true;
        if (this.I != pVar) {
            return;
        }
        this.I = null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        a(gVar, true);
    }

    @Override // androidx.appcompat.app.g
    public void a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (!(this.e instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a d2 = d();
        if (d2 instanceof androidx.appcompat.app.n) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.k = null;
        if (d2 != null) {
            d2.j();
        }
        if (toolbar != null) {
            androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(toolbar, q(), this.h);
            this.j = kVar;
            window = this.g;
            callback = kVar.l();
        } else {
            this.j = null;
            window = this.g;
            callback = this.h;
        }
        window.setCallback(callback);
        f();
    }

    @Override // androidx.appcompat.app.g
    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (u() != null) {
            u().a(charSequence);
        } else {
            TextView textView = this.x;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    boolean a(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.J = z;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.e;
        boolean z = true;
        if (((obj instanceof d.a) || (obj instanceof androidx.appcompat.app.i)) && (decorView = this.g.getDecorView()) != null && a.g.l.d.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        p a2;
        Window.Callback r = r();
        if (r == null || this.N || (a2 = a((Menu) gVar.m())) == null) {
            return false;
        }
        return r.onMenuItemSelected(a2.f514a, menuItem);
    }

    @Override // androidx.appcompat.app.g
    public int b() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    a.a.n.b b(a.a.n.b.a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b(a.a.n.b$a):a.a.n.b");
    }

    @Override // androidx.appcompat.app.g
    public void b(Bundle bundle) {
        A();
    }

    @Override // androidx.appcompat.app.g
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    void b(androidx.appcompat.view.menu.g gVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.g();
        Window.Callback r = r();
        if (r != null && !this.N) {
            r.onPanelClosed(108, gVar);
        }
        this.G = false;
    }

    @Override // androidx.appcompat.app.g
    public boolean b(int i2) {
        int l2 = l(i2);
        if (!this.F || l2 != 108) {
            if (this.B && l2 == 1) {
                this.B = false;
            }
            if (l2 == 1) {
                F();
                this.F = true;
                return true;
            } else if (l2 == 2) {
                F();
                this.z = true;
                return true;
            } else if (l2 == 5) {
                F();
                this.A = true;
                return true;
            } else if (l2 == 10) {
                F();
                this.D = true;
                return true;
            } else if (l2 == 108) {
                F();
                this.B = true;
                return true;
            } else if (l2 != 109) {
                return this.g.requestFeature(l2);
            } else {
                F();
                this.C = true;
                return true;
            }
        }
        return false;
    }

    boolean b(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a d2 = d();
        if (d2 == null || !d2.a(i2, keyEvent)) {
            p pVar = this.I;
            if (pVar != null && a(pVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                p pVar2 = this.I;
                if (pVar2 != null) {
                    pVar2.n = true;
                }
                return true;
            }
            if (this.I == null) {
                p a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater c() {
        if (this.k == null) {
            D();
            androidx.appcompat.app.a aVar = this.j;
            this.k = new a.a.n.g(aVar != null ? aVar.h() : this.f);
        }
        return this.k;
    }

    @Override // androidx.appcompat.app.g
    public void c(int i2) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i2, viewGroup);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void c(Bundle bundle) {
        if (this.O != -100) {
            b0.put(this.e.getClass(), Integer.valueOf(this.O));
        }
    }

    boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            p a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z) {
                    a(a2, true);
                }
                return true;
            } else if (t()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a d() {
        D();
        return this.j;
    }

    @Override // androidx.appcompat.app.g
    public void d(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.g
    public void e() {
        LayoutInflater from = LayoutInflater.from(this.f);
        if (from.getFactory() == null) {
            a.g.l.e.b(from, this);
        } else if (from.getFactory2() instanceof h) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    void e(int i2) {
        a(a(i2, true), true);
    }

    @Override // androidx.appcompat.app.g
    public void f() {
        androidx.appcompat.app.a d2 = d();
        if (d2 == null || !d2.i()) {
            k(0);
        }
    }

    void f(int i2) {
        p a2;
        p a3 = a(i2, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.c(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.s();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (a2 = a(0, false)) == null) {
            return;
        }
        a2.m = false;
        b(a2, (KeyEvent) null);
    }

    int g(int i2) {
        m p2;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        p2 = C();
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    p2 = p();
                }
                return p2.c();
            }
            return i2;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.g
    public void g() {
        androidx.appcompat.app.g.b(this);
        if (this.U) {
            this.g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        androidx.appcompat.app.a aVar = this.j;
        if (aVar != null) {
            aVar.j();
        }
        y();
    }

    @Override // androidx.appcompat.app.g
    public void h() {
        androidx.appcompat.app.a d2 = d();
        if (d2 != null) {
            d2.d(true);
        }
    }

    void h(int i2) {
        androidx.appcompat.app.a d2;
        if (i2 != 108 || (d2 = d()) == null) {
            return;
        }
        d2.b(true);
    }

    @Override // androidx.appcompat.app.g
    public void i() {
        this.M = true;
        l();
        androidx.appcompat.app.g.a(this);
    }

    void i(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a d2 = d();
            if (d2 == null) {
                return;
            }
            d2.b(false);
        } else if (i2 != 0) {
        } else {
            p a2 = a(i2, true);
            if (!a2.o) {
                return;
            }
            a(a2, false);
        }
    }

    int j(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.q;
        int i3 = 0;
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
                Rect rect = this.Y;
                Rect rect2 = this.Z;
                rect.set(0, i2, 0, 0);
                c1.a(this.w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.y;
                    if (view == null) {
                        View view2 = new View(this.f);
                        this.y = view2;
                        view2.setBackgroundColor(this.f.getResources().getColor(a.a.c.abc_input_method_navigation_guard));
                        this.w.addView(this.y, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.y.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.y == null) {
                    z3 = false;
                }
                if (!this.D && z3) {
                    i2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
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
        View view3 = this.y;
        if (view3 != null) {
            if (!z) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    @Override // androidx.appcompat.app.g
    public void j() {
        this.M = false;
        androidx.appcompat.app.g.b(this);
        androidx.appcompat.app.a d2 = d();
        if (d2 != null) {
            d2.d(false);
        }
        if (this.e instanceof Dialog) {
            y();
        }
    }

    public boolean l() {
        return a(true);
    }

    void m() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.g();
        }
        if (this.r != null) {
            this.g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        n();
        p a2 = a(0, false);
        if (a2 == null || (gVar = a2.j) == null) {
            return;
        }
        gVar.close();
    }

    void n() {
        y yVar = this.t;
        if (yVar != null) {
            yVar.a();
        }
    }

    final Context o() {
        androidx.appcompat.app.a d2 = d();
        Context h = d2 != null ? d2.h() : null;
        return h == null ? this.f : h;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    final m p() {
        if (this.S == null) {
            this.S = new n(androidx.appcompat.app.m.a(this.f));
        }
        return this.S;
    }

    final CharSequence q() {
        Object obj = this.e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    final Window.Callback r() {
        return this.g.getCallback();
    }

    public boolean s() {
        return this.u;
    }

    boolean t() {
        a.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        androidx.appcompat.app.a d2 = d();
        return d2 != null && d2.f();
    }

    final androidx.appcompat.app.a u() {
        return this.j;
    }

    final boolean v() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && u.D(viewGroup);
    }
}
