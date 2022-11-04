package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.f;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.r;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
public class ComponentActivity extends f implements i, w, androidx.savedstate.b, c {

    /* renamed from: e */
    private v f74e;

    /* renamed from: g */
    private int f76g;

    /* renamed from: c */
    private final j f72c = new j(this);

    /* renamed from: d */
    private final androidx.savedstate.a f73d = androidx.savedstate.a.a(this);

    /* renamed from: f */
    private final OnBackPressedDispatcher f75f = new OnBackPressedDispatcher(new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        Object f80a;

        /* renamed from: b */
        v f81b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                a().a(new g() { // from class: androidx.activity.ComponentActivity.2
                    @Override // androidx.lifecycle.g
                    public void d(i iVar, e.a aVar) {
                        if (aVar == e.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView == null) {
                                return;
                            }
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                });
            }
            a().a(new g() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.g
                public void d(i iVar, e.a aVar) {
                    if (aVar != e.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.h().a();
                }
            });
            if (19 > i || i > 23) {
                return;
            }
            a().a(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f72c;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher c() {
        return this.f75f;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry d() {
        return this.f73d.b();
    }

    @Override // androidx.lifecycle.w
    public v h() {
        if (getApplication() != null) {
            if (this.f74e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f74e = bVar.f81b;
                }
                if (this.f74e == null) {
                    this.f74e = new v();
                }
            }
            return this.f74e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object l() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f75f.c();
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73d.c(bundle);
        r.g(this);
        int i = this.f76g;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object l = l();
        v vVar = this.f74e;
        if (vVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            vVar = bVar.f81b;
        }
        if (vVar == null && l == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f80a = l;
        bVar2.f81b = vVar;
        return bVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e a2 = a();
        if (a2 instanceof j) {
            ((j) a2).p(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f73d.d(bundle);
    }
}
