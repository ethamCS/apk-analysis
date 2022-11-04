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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.h1;
import androidx.core.content.res.h;
import androidx.core.view.e0;
import androidx.core.view.f;
import androidx.core.view.g0;
import androidx.core.view.j0;
import androidx.core.view.y;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import java.util.List;
import k.b;
import k.f;
/* loaded from: classes.dex */
public class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {
    private static final i0.g<String, Integer> Q4 = new i0.g<>();
    private static final boolean R4 = false;
    private static final int[] S4 = {16842836};
    private static final boolean T4 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean U4 = true;
    boolean A4;
    private Configuration B4;
    private int C4;
    private int D4;
    private boolean E4;
    private boolean F4;
    private o G4;
    private o H4;
    boolean I4;
    int J4;
    private final Runnable K4;
    private boolean L4;
    private Rect M4;
    private Rect N4;
    private androidx.appcompat.app.f O4;
    private androidx.appcompat.app.g P4;
    Window U3;
    private m V3;
    final f.a W3;
    androidx.appcompat.app.a X3;
    MenuInflater Y3;
    private CharSequence Z3;

    /* renamed from: a4 */
    private f0 f717a4;

    /* renamed from: b4 */
    private g f718b4;

    /* renamed from: c4 */
    private t f719c4;

    /* renamed from: d4 */
    k.b f720d4;

    /* renamed from: e4 */
    ActionBarContextView f721e4;

    /* renamed from: f4 */
    PopupWindow f722f4;

    /* renamed from: g4 */
    Runnable f723g4;

    /* renamed from: h4 */
    e0 f724h4;

    /* renamed from: i4 */
    private boolean f725i4;

    /* renamed from: j4 */
    private boolean f726j4;

    /* renamed from: k4 */
    ViewGroup f727k4;

    /* renamed from: l4 */
    private TextView f728l4;

    /* renamed from: m4 */
    private View f729m4;

    /* renamed from: n4 */
    private boolean f730n4;

    /* renamed from: o4 */
    private boolean f731o4;

    /* renamed from: p4 */
    boolean f732p4;

    /* renamed from: q4 */
    boolean f733q4;

    /* renamed from: r4 */
    boolean f734r4;

    /* renamed from: s4 */
    boolean f735s4;

    /* renamed from: t4 */
    boolean f736t4;

    /* renamed from: u4 */
    private boolean f737u4;

    /* renamed from: v4 */
    private s[] f738v4;

    /* renamed from: w4 */
    private s f739w4;

    /* renamed from: x */
    final Object f740x;

    /* renamed from: x4 */
    private boolean f741x4;

    /* renamed from: y */
    final Context f742y;

    /* renamed from: y4 */
    private boolean f743y4;

    /* renamed from: z4 */
    private boolean f744z4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.J4 & 1) != 0) {
                eVar.V(0);
            }
            e eVar2 = e.this;
            if ((eVar2.J4 & 4096) != 0) {
                eVar2.V(108);
            }
            e eVar3 = e.this;
            eVar3.I4 = false;
            eVar3.J4 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.core.view.s {
        b() {
            e.this = r1;
        }

        @Override // androidx.core.view.s
        public j0 a(View view, j0 j0Var) {
            int k10 = j0Var.k();
            int M0 = e.this.M0(j0Var, null);
            if (k10 != M0) {
                j0Var = j0Var.o(j0Var.i(), M0, j0Var.j(), j0Var.h());
            }
            return y.a0(view, j0Var);
        }
    }

    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
            e.this = r1;
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.T();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* loaded from: classes.dex */
        class a extends g0 {
            a() {
                d.this = r1;
            }

            @Override // androidx.core.view.f0
            public void b(View view) {
                e.this.f721e4.setAlpha(1.0f);
                e.this.f724h4.h(null);
                e.this.f724h4 = null;
            }

            @Override // androidx.core.view.g0, androidx.core.view.f0
            public void c(View view) {
                e.this.f721e4.setVisibility(0);
            }
        }

        d() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f722f4.showAtLocation(eVar.f721e4, 55, 0, 0);
            e.this.W();
            if (!e.this.E0()) {
                e.this.f721e4.setAlpha(1.0f);
                e.this.f721e4.setVisibility(0);
                return;
            }
            e.this.f721e4.setAlpha(0.0f);
            e eVar2 = e.this;
            eVar2.f724h4 = y.e(eVar2.f721e4).b(1.0f);
            e.this.f724h4.h(new a());
        }
    }

    /* renamed from: androidx.appcompat.app.e$e */
    /* loaded from: classes.dex */
    public class C0014e extends g0 {
        C0014e() {
            e.this = r1;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            e.this.f721e4.setAlpha(1.0f);
            e.this.f724h4.h(null);
            e.this.f724h4 = null;
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            e.this.f721e4.setVisibility(0);
            if (e.this.f721e4.getParent() instanceof View) {
                y.l0((View) e.this.f721e4.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* loaded from: classes.dex */
    public final class g implements j.a {
        g() {
            e.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.M(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback g02 = e.this.g0();
            if (g02 != null) {
                g02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements b.a {

        /* renamed from: a */
        private b.a f752a;

        /* loaded from: classes.dex */
        class a extends g0 {
            a() {
                h.this = r1;
            }

            @Override // androidx.core.view.f0
            public void b(View view) {
                e.this.f721e4.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f722f4;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f721e4.getParent() instanceof View) {
                    y.l0((View) e.this.f721e4.getParent());
                }
                e.this.f721e4.k();
                e.this.f724h4.h(null);
                e eVar2 = e.this;
                eVar2.f724h4 = null;
                y.l0(eVar2.f727k4);
            }
        }

        public h(b.a aVar) {
            e.this = r1;
            this.f752a = aVar;
        }

        @Override // k.b.a
        public boolean a(k.b bVar, MenuItem menuItem) {
            return this.f752a.a(bVar, menuItem);
        }

        @Override // k.b.a
        public boolean b(k.b bVar, Menu menu) {
            return this.f752a.b(bVar, menu);
        }

        @Override // k.b.a
        public boolean c(k.b bVar, Menu menu) {
            y.l0(e.this.f727k4);
            return this.f752a.c(bVar, menu);
        }

        @Override // k.b.a
        public void d(k.b bVar) {
            this.f752a.d(bVar);
            e eVar = e.this;
            if (eVar.f722f4 != null) {
                eVar.U3.getDecorView().removeCallbacks(e.this.f723g4);
            }
            e eVar2 = e.this;
            if (eVar2.f721e4 != null) {
                eVar2.W();
                e eVar3 = e.this;
                eVar3.f724h4 = y.e(eVar3.f721e4).b(0.0f);
                e.this.f724h4.h(new a());
            }
            e eVar4 = e.this;
            f.a aVar = eVar4.W3;
            if (aVar != null) {
                aVar.k(eVar4.f720d4);
            }
            e eVar5 = e.this;
            eVar5.f720d4 = null;
            y.l0(eVar5.f727k4);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* loaded from: classes.dex */
    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* loaded from: classes.dex */
    public static class k {
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
    public static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    public class m extends k.i {

        /* renamed from: d */
        private f f755d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Window.Callback callback) {
            super(callback);
            e.this = r1;
        }

        void b(f fVar) {
            this.f755d = fVar;
        }

        final ActionMode c(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f742y, callback);
            k.b G0 = e.this.G0(aVar);
            if (G0 != null) {
                return aVar.e(G0);
            }
            return null;
        }

        @Override // k.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // k.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.s0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // k.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            f fVar = this.f755d;
            return (fVar == null || (onCreatePanelView = fVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.v0(i10);
            return true;
        }

        @Override // k.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            e.this.w0(i10);
        }

        @Override // k.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z10 = true;
            if (eVar != null) {
                eVar.a0(true);
            }
            f fVar = this.f755d;
            if (fVar == null || !fVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z10;
        }

        @Override // k.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s e02 = e.this.e0(0, true);
            if (e02 == null || (eVar = e02.f773j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // k.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (!e.this.n0() || i10 != 0) ? super.onWindowStartingActionMode(callback, i10) : c(callback);
        }
    }

    /* loaded from: classes.dex */
    public class n extends o {

        /* renamed from: c */
        private final PowerManager f757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context) {
            super();
            e.this = r1;
            this.f757c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.o
        public int c() {
            return j.a(this.f757c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.o
        public void d() {
            e.this.G();
        }
    }

    /* loaded from: classes.dex */
    public abstract class o {

        /* renamed from: a */
        private BroadcastReceiver f759a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
                o.this = r1;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
            e.this = r1;
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f759a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f742y.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f759a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f759a == null) {
                this.f759a = new a();
            }
            e.this.f742y.registerReceiver(this.f759a, b10);
        }
    }

    /* loaded from: classes.dex */
    public class p extends o {

        /* renamed from: c */
        private final androidx.appcompat.app.k f762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(androidx.appcompat.app.k kVar) {
            super();
            e.this = r1;
            this.f762c = kVar;
        }

        @Override // androidx.appcompat.app.e.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.o
        public int c() {
            return this.f762c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.o
        public void d() {
            e.this.G();
        }
    }

    /* loaded from: classes.dex */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class r extends ContentFrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Context context) {
            super(context);
            e.this = r1;
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.O(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class s {

        /* renamed from: a */
        int f764a;

        /* renamed from: b */
        int f765b;

        /* renamed from: c */
        int f766c;

        /* renamed from: d */
        int f767d;

        /* renamed from: e */
        int f768e;

        /* renamed from: f */
        int f769f;

        /* renamed from: g */
        ViewGroup f770g;

        /* renamed from: h */
        View f771h;

        /* renamed from: i */
        View f772i;

        /* renamed from: j */
        androidx.appcompat.view.menu.e f773j;

        /* renamed from: k */
        androidx.appcompat.view.menu.c f774k;

        /* renamed from: l */
        Context f775l;

        /* renamed from: m */
        boolean f776m;

        /* renamed from: n */
        boolean f777n;

        /* renamed from: o */
        boolean f778o;

        /* renamed from: p */
        public boolean f779p;

        /* renamed from: q */
        boolean f780q = false;

        /* renamed from: r */
        boolean f781r;

        /* renamed from: s */
        Bundle f782s;

        s(int i10) {
            this.f764a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f773j == null) {
                return null;
            }
            if (this.f774k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f775l, e.g.j_res_0x7f0c0010);
                this.f774k = cVar;
                cVar.k(aVar);
                this.f773j.b(this.f774k);
            }
            return this.f774k.c(this.f770g);
        }

        public boolean b() {
            if (this.f771h == null) {
                return false;
            }
            return this.f772i != null || this.f774k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f773j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f774k);
            }
            this.f773j = eVar;
            if (eVar == null || (cVar = this.f774k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.a_res_0x7f030004, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(e.a.F_res_0x7f030316, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = e.i.b_res_0x7f11022d;
            }
            newTheme.applyStyle(i11, true);
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f775l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f9330y0);
            this.f765b = obtainStyledAttributes.getResourceId(e.j.B0, 0);
            this.f769f = obtainStyledAttributes.getResourceId(e.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class t implements j.a {
        t() {
            e.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = D;
            }
            s Z = eVar2.Z(eVar);
            if (Z != null) {
                if (!z11) {
                    e.this.P(Z, z10);
                    return;
                }
                e.this.L(Z.f764a, Z, D);
                e.this.P(Z, true);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback g02;
            if (eVar == eVar.D()) {
                e eVar2 = e.this;
                if (!eVar2.f732p4 || (g02 = eVar2.g0()) == null || e.this.A4) {
                    return true;
                }
                g02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    public e(Activity activity, f.a aVar) {
        this(activity, null, aVar, activity);
    }

    public e(Dialog dialog, f.a aVar) {
        this(dialog.getContext(), dialog.getWindow(), aVar, dialog);
    }

    private e(Context context, Window window, f.a aVar, Object obj) {
        i0.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c J0;
        this.f724h4 = null;
        this.f725i4 = true;
        this.C4 = -100;
        this.K4 = new a();
        this.f742y = context;
        this.W3 = aVar;
        this.f740x = obj;
        if (this.C4 == -100 && (obj instanceof Dialog) && (J0 = J0()) != null) {
            this.C4 = J0.w0().k();
        }
        if (this.C4 == -100 && (num = (gVar = Q4).get(obj.getClass().getName())) != null) {
            this.C4 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            J(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f776m || B0(sVar, keyEvent)) && (eVar = sVar.f773j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f717a4 == null) {
            P(sVar, true);
        }
        return z10;
    }

    private boolean B0(s sVar, KeyEvent keyEvent) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        if (this.A4) {
            return false;
        }
        if (sVar.f776m) {
            return true;
        }
        s sVar2 = this.f739w4;
        if (sVar2 != null && sVar2 != sVar) {
            P(sVar2, false);
        }
        Window.Callback g02 = g0();
        if (g02 != null) {
            sVar.f772i = g02.onCreatePanelView(sVar.f764a);
        }
        int i10 = sVar.f764a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (f0Var3 = this.f717a4) != null) {
            f0Var3.d();
        }
        if (sVar.f772i == null && (!z10 || !(z0() instanceof androidx.appcompat.app.i))) {
            androidx.appcompat.view.menu.e eVar = sVar.f773j;
            if (eVar == null || sVar.f781r) {
                if (eVar == null && (!k0(sVar) || sVar.f773j == null)) {
                    return false;
                }
                if (z10 && this.f717a4 != null) {
                    if (this.f718b4 == null) {
                        this.f718b4 = new g();
                    }
                    this.f717a4.a(sVar.f773j, this.f718b4);
                }
                sVar.f773j.d0();
                if (!g02.onCreatePanelMenu(sVar.f764a, sVar.f773j)) {
                    sVar.c(null);
                    if (z10 && (f0Var2 = this.f717a4) != null) {
                        f0Var2.a(null, this.f718b4);
                    }
                    return false;
                }
                sVar.f781r = false;
            }
            sVar.f773j.d0();
            Bundle bundle = sVar.f782s;
            if (bundle != null) {
                sVar.f773j.P(bundle);
                sVar.f782s = null;
            }
            if (!g02.onPreparePanel(0, sVar.f772i, sVar.f773j)) {
                if (z10 && (f0Var = this.f717a4) != null) {
                    f0Var.a(null, this.f718b4);
                }
                sVar.f773j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f779p = z11;
            sVar.f773j.setQwertyMode(z11);
            sVar.f773j.c0();
        }
        sVar.f776m = true;
        sVar.f777n = false;
        this.f739w4 = sVar;
        return true;
    }

    private void C0(boolean z10) {
        f0 f0Var = this.f717a4;
        if (f0Var == null || !f0Var.h() || (ViewConfiguration.get(this.f742y).hasPermanentMenuKey() && !this.f717a4.e())) {
            s e02 = e0(0, true);
            e02.f780q = true;
            P(e02, false);
            y0(e02, null);
            return;
        }
        Window.Callback g02 = g0();
        if (this.f717a4.c() && z10) {
            this.f717a4.f();
            if (this.A4) {
                return;
            }
            g02.onPanelClosed(108, e0(0, true).f773j);
        } else if (g02 == null || this.A4) {
        } else {
            if (this.I4 && (this.J4 & 1) != 0) {
                this.U3.getDecorView().removeCallbacks(this.K4);
                this.K4.run();
            }
            s e03 = e0(0, true);
            androidx.appcompat.view.menu.e eVar = e03.f773j;
            if (eVar == null || e03.f781r || !g02.onPreparePanel(0, e03.f772i, eVar)) {
                return;
            }
            g02.onMenuOpened(108, e03.f773j);
            this.f717a4.g();
        }
    }

    private int D0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean F0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.U3.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || y.R((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean H(boolean z10) {
        if (this.A4) {
            return false;
        }
        int K = K();
        boolean K0 = K0(o0(this.f742y, K), z10);
        if (K == 0) {
            d0(this.f742y).e();
        } else {
            o oVar = this.G4;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (K == 3) {
            c0(this.f742y).e();
        } else {
            o oVar2 = this.H4;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return K0;
    }

    private void I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f727k4.findViewById(16908290);
        View decorView = this.U3.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f742y.obtainStyledAttributes(e.j.f9330y0);
        obtainStyledAttributes.getValue(e.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = e.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = e.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = e.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = e.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void I0() {
        if (!this.f726j4) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private void J(Window window) {
        if (this.U3 == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof m) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            m mVar = new m(callback);
            this.V3 = mVar;
            window.setCallback(mVar);
            a1 u10 = a1.u(this.f742y, null, S4);
            Drawable h10 = u10.h(0);
            if (h10 != null) {
                window.setBackgroundDrawable(h10);
            }
            u10.w();
            this.U3 = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private androidx.appcompat.app.c J0() {
        for (Context context = this.f742y; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int K() {
        int i10 = this.C4;
        return i10 != -100 ? i10 : androidx.appcompat.app.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean K0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f742y
            r1 = 0
            android.content.res.Configuration r0 = r6.Q(r0, r7, r1)
            boolean r2 = r6.m0()
            android.content.res.Configuration r3 = r6.B4
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.f742y
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.f743y4
            if (r8 == 0) goto L4b
            boolean r8 = androidx.appcompat.app.e.T4
            if (r8 != 0) goto L34
            boolean r8 = r6.f744z4
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f740x
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f740x
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.m(r8)
            r8 = r4
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.L0(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f740x
            boolean r0 = r8 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto L62
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.A0(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.K0(int, boolean):boolean");
    }

    private void L0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f742y.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.h.a(resources);
        }
        int i11 = this.D4;
        if (i11 != 0) {
            this.f742y.setTheme(i11);
            this.f742y.getTheme().applyStyle(this.D4, true);
        }
        if (z10) {
            Object obj = this.f740x;
            if (!(obj instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) obj;
            if (activity instanceof v) {
                if (!((v) activity).c().b().b(m.c.CREATED)) {
                    return;
                }
            } else if (!this.f744z4 || this.A4) {
                return;
            }
            activity.onConfigurationChanged(configuration2);
        }
    }

    private void N() {
        o oVar = this.G4;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.H4;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private void N0(View view) {
        int i10;
        Context context;
        if ((y.K(view) & 8192) != 0) {
            context = this.f742y;
            i10 = e.c.b_res_0x7f050006;
        } else {
            context = this.f742y;
            i10 = e.c.a_res_0x7f050005;
        }
        view.setBackgroundColor(androidx.core.content.a.b(context, i10));
    }

    private Configuration Q(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup R() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f742y.obtainStyledAttributes(e.j.f9330y0);
        int i10 = e.j.D0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(e.j.M0, false)) {
            z(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            z(108);
        }
        if (obtainStyledAttributes.getBoolean(e.j.E0, false)) {
            z(109);
        }
        if (obtainStyledAttributes.getBoolean(e.j.F0, false)) {
            z(10);
        }
        this.f735s4 = obtainStyledAttributes.getBoolean(e.j.f9335z0, false);
        obtainStyledAttributes.recycle();
        Y();
        this.U3.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f742y);
        if (this.f736t4) {
            viewGroup = (ViewGroup) from.inflate(this.f734r4 ? e.g.o_res_0x7f0c0016 : e.g.n_res_0x7f0c0015, (ViewGroup) null);
        } else if (this.f735s4) {
            viewGroup = (ViewGroup) from.inflate(e.g.f_res_0x7f0c000c, (ViewGroup) null);
            this.f733q4 = false;
            this.f732p4 = false;
        } else if (this.f732p4) {
            TypedValue typedValue = new TypedValue();
            this.f742y.getTheme().resolveAttribute(e.a.f_res_0x7f03000b, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(this.f742y, typedValue.resourceId) : this.f742y).inflate(e.g.p_res_0x7f0c0017, (ViewGroup) null);
            f0 f0Var = (f0) viewGroup.findViewById(e.f.p_res_0x7f0900bd);
            this.f717a4 = f0Var;
            f0Var.setWindowCallback(g0());
            if (this.f733q4) {
                this.f717a4.k(109);
            }
            if (this.f730n4) {
                this.f717a4.k(2);
            }
            if (this.f731o4) {
                this.f717a4.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f732p4 + ", windowActionBarOverlay: " + this.f733q4 + ", android:windowIsFloating: " + this.f735s4 + ", windowActionModeOverlay: " + this.f734r4 + ", windowNoTitle: " + this.f736t4 + " }");
        }
        y.A0(viewGroup, new b());
        if (this.f717a4 == null) {
            this.f728l4 = (TextView) viewGroup.findViewById(e.f.M);
        }
        h1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.f.b_res_0x7f090036);
        ViewGroup viewGroup2 = (ViewGroup) this.U3.findViewById(16908290);
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
        this.U3.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void X() {
        if (!this.f726j4) {
            this.f727k4 = R();
            CharSequence f02 = f0();
            if (!TextUtils.isEmpty(f02)) {
                f0 f0Var = this.f717a4;
                if (f0Var != null) {
                    f0Var.setWindowTitle(f02);
                } else if (z0() != null) {
                    z0().x(f02);
                } else {
                    TextView textView = this.f728l4;
                    if (textView != null) {
                        textView.setText(f02);
                    }
                }
            }
            I();
            x0(this.f727k4);
            this.f726j4 = true;
            s e02 = e0(0, false);
            if (this.A4) {
                return;
            }
            if (e02 != null && e02.f773j != null) {
                return;
            }
            l0(108);
        }
    }

    private void Y() {
        if (this.U3 == null) {
            Object obj = this.f740x;
            if (obj instanceof Activity) {
                J(((Activity) obj).getWindow());
            }
        }
        if (this.U3 != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private static Configuration a0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private o c0(Context context) {
        if (this.H4 == null) {
            this.H4 = new n(context);
        }
        return this.H4;
    }

    private o d0(Context context) {
        if (this.G4 == null) {
            this.G4 = new p(androidx.appcompat.app.k.a(context));
        }
        return this.G4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h0() {
        /*
            r3 = this;
            r3.X()
            boolean r0 = r3.f732p4
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.X3
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f740x
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.f740x
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f733q4
            r0.<init>(r1, r2)
        L1d:
            r3.X3 = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.f740x
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.X3
            if (r0 == 0) goto L37
            boolean r1 = r3.L4
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.h0():void");
    }

    private boolean i0(s sVar) {
        View view = sVar.f772i;
        if (view != null) {
            sVar.f771h = view;
            return true;
        } else if (sVar.f773j == null) {
            return false;
        } else {
            if (this.f719c4 == null) {
                this.f719c4 = new t();
            }
            View view2 = (View) sVar.a(this.f719c4);
            sVar.f771h = view2;
            return view2 != null;
        }
    }

    private boolean j0(s sVar) {
        sVar.d(b0());
        sVar.f770g = new r(sVar.f775l);
        sVar.f766c = 81;
        return true;
    }

    private boolean k0(s sVar) {
        Context context = this.f742y;
        int i10 = sVar.f764a;
        if ((i10 == 0 || i10 == 108) && this.f717a4 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.f_res_0x7f03000b, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(e.a.g_res_0x7f03000c, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.g_res_0x7f03000c, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                k.d dVar = new k.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        sVar.c(eVar);
        return true;
    }

    private void l0(int i10) {
        this.J4 = (1 << i10) | this.J4;
        if (!this.I4) {
            y.g0(this.U3.getDecorView(), this.K4);
            this.I4 = true;
        }
    }

    private boolean m0() {
        if (!this.F4 && (this.f740x instanceof Activity)) {
            PackageManager packageManager = this.f742y.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f742y, this.f740x.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.E4 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.E4 = false;
            }
        }
        this.F4 = true;
        return this.E4;
    }

    private boolean r0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            s e02 = e0(i10, true);
            if (e02.f778o) {
                return false;
            }
            return B0(e02, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean u0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            k.b r0 = r4.f720d4
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.e$s r2 = r4.e0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.f0 r5 = r4.f717a4
            if (r5 == 0) goto L43
            boolean r5 = r5.h()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f742y
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.f0 r5 = r4.f717a4
            boolean r5 = r5.c()
            if (r5 != 0) goto L3c
            boolean r5 = r4.A4
            if (r5 != 0) goto L62
            boolean r5 = r4.B0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.f0 r5 = r4.f717a4
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.f0 r5 = r4.f717a4
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f778o
            if (r5 != 0) goto L64
            boolean r3 = r2.f777n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f776m
            if (r5 == 0) goto L62
            boolean r5 = r2.f781r
            if (r5 == 0) goto L5b
            r2.f776m = r1
            boolean r5 = r4.B0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.y0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.P(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f742y
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.u0(int, android.view.KeyEvent):boolean");
    }

    private void y0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f778o || this.A4) {
            return;
        }
        if (sVar.f764a == 0) {
            if ((this.f742y.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback g02 = g0();
        if (g02 != null && !g02.onMenuOpened(sVar.f764a, sVar.f773j)) {
            P(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f742y.getSystemService("window");
        if (windowManager == null || !B0(sVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = sVar.f770g;
        if (viewGroup == null || sVar.f780q) {
            if (viewGroup == null) {
                if (!j0(sVar) || sVar.f770g == null) {
                    return;
                }
            } else if (sVar.f780q && viewGroup.getChildCount() > 0) {
                sVar.f770g.removeAllViews();
            }
            if (!i0(sVar) || !sVar.b()) {
                sVar.f780q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = sVar.f771h.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f770g.setBackgroundResource(sVar.f765b);
            ViewParent parent = sVar.f771h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f771h);
            }
            sVar.f770g.addView(sVar.f771h, layoutParams2);
            if (!sVar.f771h.hasFocus()) {
                sVar.f771h.requestFocus();
            }
        } else {
            View view = sVar.f772i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i10 = -1;
                sVar.f777n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f767d, sVar.f768e, 1002, 8519680, -3);
                layoutParams3.gravity = sVar.f766c;
                layoutParams3.windowAnimations = sVar.f769f;
                windowManager.addView(sVar.f770g, layoutParams3);
                sVar.f778o = true;
            }
        }
        i10 = -2;
        sVar.f777n = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f767d, sVar.f768e, 1002, 8519680, -3);
        layoutParams32.gravity = sVar.f766c;
        layoutParams32.windowAnimations = sVar.f769f;
        windowManager.addView(sVar.f770g, layoutParams32);
        sVar.f778o = true;
    }

    @Override // androidx.appcompat.app.d
    public void A(int i10) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f727k4.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f742y).inflate(i10, viewGroup);
        this.V3.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void B(View view) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f727k4.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.V3.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f727k4.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.V3.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void D(Toolbar toolbar) {
        if (!(this.f740x instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a m10 = m();
        if (m10 instanceof androidx.appcompat.app.l) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.Y3 = null;
        if (m10 != null) {
            m10.n();
        }
        this.X3 = null;
        if (toolbar != null) {
            androidx.appcompat.app.i iVar = new androidx.appcompat.app.i(toolbar, f0(), this.V3);
            this.X3 = iVar;
            this.V3.b(iVar.f807c);
        } else {
            this.V3.b(null);
        }
        o();
    }

    @Override // androidx.appcompat.app.d
    public void E(int i10) {
        this.D4 = i10;
    }

    final boolean E0() {
        ViewGroup viewGroup;
        return this.f726j4 && (viewGroup = this.f727k4) != null && y.S(viewGroup);
    }

    @Override // androidx.appcompat.app.d
    public final void F(CharSequence charSequence) {
        this.Z3 = charSequence;
        f0 f0Var = this.f717a4;
        if (f0Var != null) {
            f0Var.setWindowTitle(charSequence);
        } else if (z0() != null) {
            z0().x(charSequence);
        } else {
            TextView textView = this.f728l4;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public boolean G() {
        return H(true);
    }

    public k.b G0(b.a aVar) {
        f.a aVar2;
        if (aVar != null) {
            k.b bVar = this.f720d4;
            if (bVar != null) {
                bVar.c();
            }
            h hVar = new h(aVar);
            androidx.appcompat.app.a m10 = m();
            if (m10 != null) {
                k.b y10 = m10.y(hVar);
                this.f720d4 = y10;
                if (y10 != null && (aVar2 = this.W3) != null) {
                    aVar2.H(y10);
                }
            }
            if (this.f720d4 == null) {
                this.f720d4 = H0(hVar);
            }
            return this.f720d4;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    k.b H0(k.b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.H0(k.b$a):k.b");
    }

    void L(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.f738v4;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f773j;
            }
        }
        if ((sVar == null || sVar.f778o) && !this.A4) {
            this.V3.a().onPanelClosed(i10, menu);
        }
    }

    void M(androidx.appcompat.view.menu.e eVar) {
        if (this.f737u4) {
            return;
        }
        this.f737u4 = true;
        this.f717a4.l();
        Window.Callback g02 = g0();
        if (g02 != null && !this.A4) {
            g02.onPanelClosed(108, eVar);
        }
        this.f737u4 = false;
    }

    final int M0(j0 j0Var, Rect rect) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        int k10 = j0Var != null ? j0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f721e4;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f721e4.getLayoutParams();
            boolean z12 = true;
            if (this.f721e4.isShown()) {
                if (this.M4 == null) {
                    this.M4 = new Rect();
                    this.N4 = new Rect();
                }
                Rect rect2 = this.M4;
                Rect rect3 = this.N4;
                if (j0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j0Var.i(), j0Var.k(), j0Var.j(), j0Var.h());
                }
                h1.a(this.f727k4, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                j0 H = y.H(this.f727k4);
                int i14 = H == null ? 0 : H.i();
                int j10 = H == null ? 0 : H.j();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 <= 0 || this.f729m4 != null) {
                    View view = this.f729m4;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != i14 || marginLayoutParams2.rightMargin != j10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = i14;
                            marginLayoutParams2.rightMargin = j10;
                            this.f729m4.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f742y);
                    this.f729m4 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i14;
                    layoutParams.rightMargin = j10;
                    this.f727k4.addView(this.f729m4, -1, layoutParams);
                }
                View view3 = this.f729m4;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    N0(this.f729m4);
                }
                if (!this.f734r4 && z12) {
                    k10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f721e4.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f729m4;
        if (view4 != null) {
            if (!z10) {
                i10 = 8;
            }
            view4.setVisibility(i10);
        }
        return k10;
    }

    void O(int i10) {
        P(e0(i10, true), true);
    }

    void P(s sVar, boolean z10) {
        ViewGroup viewGroup;
        f0 f0Var;
        if (z10 && sVar.f764a == 0 && (f0Var = this.f717a4) != null && f0Var.c()) {
            M(sVar.f773j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f742y.getSystemService("window");
        if (windowManager != null && sVar.f778o && (viewGroup = sVar.f770g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                L(sVar.f764a, sVar, null);
            }
        }
        sVar.f776m = false;
        sVar.f777n = false;
        sVar.f778o = false;
        sVar.f771h = null;
        sVar.f780q = true;
        if (this.f739w4 != sVar) {
            return;
        }
        this.f739w4 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View S(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.f r0 = r11.O4
            r1 = 0
            if (r0 != 0) goto L5a
            android.content.Context r0 = r11.f742y
            int[] r2 = e.j.f9330y0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = e.j.C0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            androidx.appcompat.app.f r0 = new androidx.appcompat.app.f
            r0.<init>()
        L1a:
            r11.O4 = r0
            goto L5a
        L1d:
            android.content.Context r2 = r11.f742y     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L38
            androidx.appcompat.app.f r2 = (androidx.appcompat.app.f) r2     // Catch: java.lang.Throwable -> L38
            r11.O4 = r2     // Catch: java.lang.Throwable -> L38
            goto L5a
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.f r0 = new androidx.appcompat.app.f
            r0.<init>()
            goto L1a
        L5a:
            boolean r8 = androidx.appcompat.app.e.R4
            r0 = 1
            if (r8 == 0) goto L8a
            androidx.appcompat.app.g r2 = r11.P4
            if (r2 != 0) goto L6a
            androidx.appcompat.app.g r2 = new androidx.appcompat.app.g
            r2.<init>()
            r11.P4 = r2
        L6a:
            androidx.appcompat.app.g r2 = r11.P4
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L74
            r7 = r0
            goto L8b
        L74:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L82
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L8a
            goto L89
        L82:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.F0(r0)
        L89:
            r1 = r0
        L8a:
            r7 = r1
        L8b:
            androidx.appcompat.app.f r2 = r11.O4
            r9 = 1
            boolean r10 = androidx.appcompat.widget.g1.c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.S(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    void T() {
        androidx.appcompat.view.menu.e eVar;
        f0 f0Var = this.f717a4;
        if (f0Var != null) {
            f0Var.l();
        }
        if (this.f722f4 != null) {
            this.U3.getDecorView().removeCallbacks(this.f723g4);
            if (this.f722f4.isShowing()) {
                try {
                    this.f722f4.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f722f4 = null;
        }
        W();
        s e02 = e0(0, false);
        if (e02 == null || (eVar = e02.f773j) == null) {
            return;
        }
        eVar.close();
    }

    boolean U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f740x;
        boolean z10 = true;
        if (((obj instanceof f.a) || (obj instanceof f.b)) && (decorView = this.U3.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.V3.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? q0(keyCode, keyEvent) : t0(keyCode, keyEvent);
    }

    void V(int i10) {
        s e02;
        s e03 = e0(i10, true);
        if (e03.f773j != null) {
            Bundle bundle = new Bundle();
            e03.f773j.Q(bundle);
            if (bundle.size() > 0) {
                e03.f782s = bundle;
            }
            e03.f773j.d0();
            e03.f773j.clear();
        }
        e03.f781r = true;
        e03.f780q = true;
        if ((i10 != 108 && i10 != 0) || this.f717a4 == null || (e02 = e0(0, false)) == null) {
            return;
        }
        e02.f776m = false;
        B0(e02, null);
    }

    void W() {
        e0 e0Var = this.f724h4;
        if (e0Var != null) {
            e0Var.c();
        }
    }

    s Z(Menu menu) {
        s[] sVarArr = this.f738v4;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f773j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s Z;
        Window.Callback g02 = g0();
        if (g02 == null || this.A4 || (Z = Z(eVar.D())) == null) {
            return false;
        }
        return g02.onMenuItemSelected(Z.f764a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        C0(true);
    }

    final Context b0() {
        androidx.appcompat.app.a m10 = m();
        Context k10 = m10 != null ? m10.k() : null;
        return k10 == null ? this.f742y : k10;
    }

    @Override // androidx.appcompat.app.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ((ViewGroup) this.f727k4.findViewById(16908290)).addView(view, layoutParams);
        this.V3.a().onContentChanged();
    }

    protected s e0(int i10, boolean z10) {
        s[] sVarArr = this.f738v4;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f738v4 = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar == null) {
            s sVar2 = new s(i10);
            sVarArr[i10] = sVar2;
            return sVar2;
        }
        return sVar;
    }

    @Override // androidx.appcompat.app.d
    public Context f(Context context) {
        boolean z10 = true;
        this.f743y4 = true;
        int o02 = o0(context, K());
        Configuration configuration = null;
        if (U4 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, Q(context, o02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof k.d) {
            try {
                ((k.d) context).a(Q(context, o02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!T4) {
            return super.f(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = i.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = a0(configuration3, configuration4);
        }
        Configuration Q = Q(context, o02, configuration);
        k.d dVar = new k.d(context, e.i.c_res_0x7f110239);
        dVar.a(Q);
        boolean z11 = false;
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            h.f.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    final CharSequence f0() {
        Object obj = this.f740x;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.Z3;
    }

    final Window.Callback g0() {
        return this.U3.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public <T extends View> T i(int i10) {
        X();
        return (T) this.U3.findViewById(i10);
    }

    @Override // androidx.appcompat.app.d
    public int k() {
        return this.C4;
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater l() {
        if (this.Y3 == null) {
            h0();
            androidx.appcompat.app.a aVar = this.X3;
            this.Y3 = new k.g(aVar != null ? aVar.k() : this.f742y);
        }
        return this.Y3;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a m() {
        h0();
        return this.X3;
    }

    @Override // androidx.appcompat.app.d
    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f742y);
        if (from.getFactory() == null) {
            androidx.core.view.g.a(from, this);
        } else if (from.getFactory2() instanceof e) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean n0() {
        return this.f725i4;
    }

    @Override // androidx.appcompat.app.d
    public void o() {
        if (z0() == null || m().l()) {
            return;
        }
        l0(0);
    }

    int o0(Context context, int i10) {
        o d02;
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        d02 = c0(context);
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    d02 = d0(context);
                }
                return d02.c();
            }
            return i10;
        }
        return -1;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return S(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public void p(Configuration configuration) {
        androidx.appcompat.app.a m10;
        if (this.f732p4 && this.f726j4 && (m10 = m()) != null) {
            m10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f742y);
        this.B4 = new Configuration(this.f742y.getResources().getConfiguration());
        H(false);
    }

    boolean p0() {
        k.b bVar = this.f720d4;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a m10 = m();
        return m10 != null && m10.h();
    }

    @Override // androidx.appcompat.app.d
    public void q(Bundle bundle) {
        this.f743y4 = true;
        H(false);
        Y();
        Object obj = this.f740x;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a z02 = z0();
                if (z02 == null) {
                    this.L4 = true;
                } else {
                    z02.r(true);
                }
            }
            androidx.appcompat.app.d.c(this);
        }
        this.B4 = new Configuration(this.f742y.getResources().getConfiguration());
        this.f744z4 = true;
    }

    boolean q0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.f741x4 = z10;
        } else if (i10 == 82) {
            r0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f740x
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.d.x(r3)
        L9:
            boolean r0 = r3.I4
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.U3
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.K4
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.A4 = r0
            int r0 = r3.C4
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f740x
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            i0.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.Q4
            java.lang.Object r1 = r3.f740x
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.C4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            i0.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.e.Q4
            java.lang.Object r1 = r3.f740x
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.X3
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.r():void");
    }

    @Override // androidx.appcompat.app.d
    public void s(Bundle bundle) {
        X();
    }

    boolean s0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a m10 = m();
        if (m10 == null || !m10.o(i10, keyEvent)) {
            s sVar = this.f739w4;
            if (sVar != null && A0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                s sVar2 = this.f739w4;
                if (sVar2 != null) {
                    sVar2.f777n = true;
                }
                return true;
            }
            if (this.f739w4 == null) {
                s e02 = e0(0, true);
                B0(e02, keyEvent);
                boolean A0 = A0(e02, keyEvent.getKeyCode(), keyEvent, 1);
                e02.f776m = false;
                if (A0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.d
    public void t() {
        androidx.appcompat.app.a m10 = m();
        if (m10 != null) {
            m10.w(true);
        }
    }

    boolean t0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.f741x4;
            this.f741x4 = false;
            s e02 = e0(0, false);
            if (e02 != null && e02.f778o) {
                if (!z10) {
                    P(e02, true);
                }
                return true;
            } else if (p0()) {
                return true;
            }
        } else if (i10 == 82) {
            u0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void u(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.d
    public void v() {
        G();
    }

    void v0(int i10) {
        androidx.appcompat.app.a m10;
        if (i10 != 108 || (m10 = m()) == null) {
            return;
        }
        m10.i(true);
    }

    @Override // androidx.appcompat.app.d
    public void w() {
        androidx.appcompat.app.a m10 = m();
        if (m10 != null) {
            m10.w(false);
        }
    }

    void w0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a m10 = m();
            if (m10 == null) {
                return;
            }
            m10.i(false);
        } else if (i10 != 0) {
        } else {
            s e02 = e0(i10, true);
            if (!e02.f778o) {
                return;
            }
            P(e02, false);
        }
    }

    void x0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.d
    public boolean z(int i10) {
        int D0 = D0(i10);
        if (!this.f736t4 || D0 != 108) {
            if (this.f732p4 && D0 == 1) {
                this.f732p4 = false;
            }
            if (D0 == 1) {
                I0();
                this.f736t4 = true;
                return true;
            } else if (D0 == 2) {
                I0();
                this.f730n4 = true;
                return true;
            } else if (D0 == 5) {
                I0();
                this.f731o4 = true;
                return true;
            } else if (D0 == 10) {
                I0();
                this.f734r4 = true;
                return true;
            } else if (D0 == 108) {
                I0();
                this.f732p4 = true;
                return true;
            } else if (D0 != 109) {
                return this.U3.requestFeature(D0);
            } else {
                I0();
                this.f733q4 = true;
                return true;
            }
        }
        return false;
    }

    final androidx.appcompat.app.a z0() {
        return this.X3;
    }
}
