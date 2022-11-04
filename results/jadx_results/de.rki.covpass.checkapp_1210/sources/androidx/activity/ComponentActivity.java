package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.k;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.m0;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import d.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.c;
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.f implements z0, l, k1.e, h, androidx.activity.result.d, androidx.core.content.b, androidx.core.content.c, androidx.core.app.i, androidx.core.app.j, androidx.core.view.i {
    final k1.d U3;
    private y0 V3;
    private final OnBackPressedDispatcher W3;
    private int X3;
    private final AtomicInteger Y3;
    private final ActivityResultRegistry Z3;

    /* renamed from: a4 */
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> f564a4;

    /* renamed from: b4 */
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> f565b4;

    /* renamed from: c4 */
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> f566c4;

    /* renamed from: d4 */
    private final CopyOnWriteArrayList<androidx.core.util.a<androidx.core.app.g>> f567d4;

    /* renamed from: e4 */
    private final CopyOnWriteArrayList<androidx.core.util.a<k>> f568e4;

    /* renamed from: q */
    final c.a f569q;

    /* renamed from: x */
    private final androidx.core.view.j f570x;

    /* renamed from: y */
    private final x f571y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f577c;

            /* renamed from: d */
            final /* synthetic */ a.C0117a f578d;

            a(int i10, a.C0117a c0117a) {
                b.this = r1;
                this.f577c = i10;
                this.f578d = c0117a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f577c, this.f578d.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class RunnableC0010b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f580c;

            /* renamed from: d */
            final /* synthetic */ IntentSender.SendIntentException f581d;

            RunnableC0010b(int i10, IntentSender.SendIntentException sendIntentException) {
                b.this = r1;
                this.f580c = i10;
                this.f581d = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f580c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f581d));
            }
        }

        b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, d.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0117a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.n(componentActivity, stringArrayExtra, i10);
            } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.core.app.b.o(componentActivity, a10, i10, bundle2);
            } else {
                androidx.activity.result.e eVar = (androidx.activity.result.e) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.p(componentActivity, eVar.e(), i10, eVar.a(), eVar.c(), eVar.d(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0010b(i10, e10));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        Object f583a;

        /* renamed from: b */
        y0 f584b;

        d() {
        }
    }

    public ComponentActivity() {
        this.f569q = new c.a();
        this.f570x = new androidx.core.view.j(new Runnable() { // from class: androidx.activity.c
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.b0();
            }
        });
        this.f571y = new x(this);
        k1.d a10 = k1.d.a(this);
        this.U3 = a10;
        this.W3 = new OnBackPressedDispatcher(new a());
        this.Y3 = new AtomicInteger();
        this.Z3 = new b();
        this.f564a4 = new CopyOnWriteArrayList<>();
        this.f565b4 = new CopyOnWriteArrayList<>();
        this.f566c4 = new CopyOnWriteArrayList<>();
        this.f567d4 = new CopyOnWriteArrayList<>();
        this.f568e4 = new CopyOnWriteArrayList<>();
        if (c() != null) {
            int i10 = Build.VERSION.SDK_INT;
            c().a(new s() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.s
                public void f(v vVar, m.b bVar) {
                    if (bVar == m.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView == null) {
                            return;
                        }
                        c.a(peekDecorView);
                    }
                }
            });
            c().a(new s() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.s
                public void f(v vVar, m.b bVar) {
                    if (bVar == m.b.ON_DESTROY) {
                        ComponentActivity.this.f569q.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.I().a();
                    }
                }
            });
            c().a(new s() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.s
                public void f(v vVar, m.b bVar) {
                    ComponentActivity.this.Z();
                    ComponentActivity.this.c().c(this);
                }
            });
            a10.c();
            m0.c(this);
            if (i10 <= 23) {
                c().a(new ImmLeaksCleaner(this));
            }
            g().h("android:support:activity-result", new c.AbstractC0210c() { // from class: androidx.activity.d
                @Override // k1.c.AbstractC0210c
                public final Bundle a() {
                    Bundle c02;
                    c02 = ComponentActivity.this.c0();
                    return c02;
                }
            });
            X(new c.b() { // from class: androidx.activity.b
                @Override // c.b
                public final void a(Context context) {
                    ComponentActivity.this.d0(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int i10) {
        this();
        this.X3 = i10;
    }

    private void a0() {
        a1.a(getWindow().getDecorView(), this);
        b1.a(getWindow().getDecorView(), this);
        k1.f.a(getWindow().getDecorView(), this);
        j.a(getWindow().getDecorView(), this);
    }

    public /* synthetic */ Bundle c0() {
        Bundle bundle = new Bundle();
        this.Z3.h(bundle);
        return bundle;
    }

    public /* synthetic */ void d0(Context context) {
        Bundle b10 = g().b("android:support:activity-result");
        if (b10 != null) {
            this.Z3.g(b10);
        }
    }

    @Override // androidx.core.view.i
    public void C(androidx.core.view.l lVar) {
        this.f570x.a(lVar);
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry D() {
        return this.Z3;
    }

    @Override // androidx.core.app.i
    public final void E(androidx.core.util.a<androidx.core.app.g> aVar) {
        this.f567d4.add(aVar);
    }

    @Override // androidx.lifecycle.z0
    public y0 I() {
        if (getApplication() != null) {
            Z();
            return this.V3;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.core.app.i
    public final void M(androidx.core.util.a<androidx.core.app.g> aVar) {
        this.f567d4.remove(aVar);
    }

    @Override // androidx.core.content.b
    public final void Q(androidx.core.util.a<Configuration> aVar) {
        this.f564a4.remove(aVar);
    }

    public final void X(c.b bVar) {
        this.f569q.a(bVar);
    }

    public final void Y(androidx.core.util.a<Intent> aVar) {
        this.f566c4.add(aVar);
    }

    void Z() {
        if (this.V3 == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.V3 = dVar.f584b;
            }
            if (this.V3 != null) {
                return;
            }
            this.V3 = new y0();
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        a0();
        super.addContentView(view, layoutParams);
    }

    public void b0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.f, androidx.lifecycle.v
    public m c() {
        return this.f571y;
    }

    @Deprecated
    public Object e0() {
        return null;
    }

    @Override // androidx.activity.h
    public final OnBackPressedDispatcher f() {
        return this.W3;
    }

    public final <I, O> androidx.activity.result.c<I> f0(d.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return g0(aVar, this.Z3, bVar);
    }

    @Override // k1.e
    public final k1.c g() {
        return this.U3.b();
    }

    public final <I, O> androidx.activity.result.c<I> g0(d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.Y3.getAndIncrement(), this, aVar, bVar);
    }

    @Override // androidx.core.view.i
    public void j(androidx.core.view.l lVar) {
        this.f570x.f(lVar);
    }

    @Override // androidx.core.content.b
    public final void m(androidx.core.util.a<Configuration> aVar) {
        this.f564a4.add(aVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.Z3.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.W3.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.f564a4.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.U3.d(bundle);
        this.f569q.c(this);
        super.onCreate(bundle);
        j0.g(this);
        int i10 = this.X3;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            this.f570x.b(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        return this.f570x.d(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        Iterator<androidx.core.util.a<androidx.core.app.g>> it = this.f567d4.iterator();
        while (it.hasNext()) {
            it.next().a(new androidx.core.app.g(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        Iterator<androidx.core.util.a<androidx.core.app.g>> it = this.f567d4.iterator();
        while (it.hasNext()) {
            it.next().a(new androidx.core.app.g(z10, configuration));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.f566c4.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f570x.c(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        Iterator<androidx.core.util.a<k>> it = this.f568e4.iterator();
        while (it.hasNext()) {
            it.next().a(new k(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        Iterator<androidx.core.util.a<k>> it = this.f568e4.iterator();
        while (it.hasNext()) {
            it.next().a(new k(z10, configuration));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            this.f570x.e(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.Z3.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object e02 = e0();
        y0 y0Var = this.V3;
        if (y0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            y0Var = dVar.f584b;
        }
        if (y0Var == null && e02 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f583a = e02;
        dVar2.f584b = y0Var;
        return dVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        m c10 = c();
        if (c10 instanceof x) {
            ((x) c10).o(m.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.U3.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.a<Integer>> it = this.f565b4.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i10));
        }
    }

    @Override // androidx.core.app.j
    public final void r(androidx.core.util.a<k> aVar) {
        this.f568e4.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (p1.a.d()) {
                p1.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            p1.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        a0();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        a0();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        a0();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // androidx.core.content.c
    public final void u(androidx.core.util.a<Integer> aVar) {
        this.f565b4.remove(aVar);
    }

    @Override // androidx.core.content.c
    public final void v(androidx.core.util.a<Integer> aVar) {
        this.f565b4.add(aVar);
    }

    @Override // androidx.lifecycle.l
    public e1.a x() {
        e1.d dVar = new e1.d();
        if (getApplication() != null) {
            dVar.c(v0.a.f4390e, getApplication());
        }
        dVar.c(m0.f4345a, this);
        dVar.c(m0.f4346b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(m0.f4347c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.core.app.j
    public final void y(androidx.core.util.a<k> aVar) {
        this.f568e4.add(aVar);
    }
}
