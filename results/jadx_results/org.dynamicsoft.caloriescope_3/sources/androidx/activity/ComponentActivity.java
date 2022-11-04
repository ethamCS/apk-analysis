package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.d;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
public class ComponentActivity extends d implements h, t, androidx.savedstate.b, c {
    private s e;
    private int g;

    /* renamed from: c */
    private final i f432c = new i(this);
    private final androidx.savedstate.a d = androidx.savedstate.a.a(this);
    private final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

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
        s f436a;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new f() { // from class: androidx.activity.ComponentActivity.2
                    @Override // androidx.lifecycle.f
                    public void a(h hVar, e.a aVar) {
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
            a().a(new f() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.f
                public void a(h hVar, e.a aVar) {
                    if (aVar != e.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.e().a();
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 > i || i > 23) {
                return;
            }
            a().a(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // androidx.lifecycle.h
    public e a() {
        return this.f432c;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.f;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.d.a();
    }

    @Override // androidx.lifecycle.t
    public s e() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f436a;
                }
                if (this.e == null) {
                    this.e = new s();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object g() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f.a();
    }

    @Override // androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
        p.a(this);
        int i = this.g;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object g = g();
        s sVar = this.e;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f436a;
        }
        if (sVar == null && g == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f436a = sVar;
        return bVar2;
    }

    @Override // androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e a2 = a();
        if (a2 instanceof i) {
            ((i) a2).b(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }
}
