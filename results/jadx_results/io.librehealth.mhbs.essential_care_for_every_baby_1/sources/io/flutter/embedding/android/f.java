package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.embedding.engine.e.a;
import io.flutter.plugin.platform.d;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements d<Activity> {

    /* renamed from: a */
    private b f868a;

    /* renamed from: b */
    private io.flutter.embedding.engine.a f869b;

    /* renamed from: c */
    private FlutterSplashView f870c;

    /* renamed from: d */
    private k f871d;

    /* renamed from: e */
    private io.flutter.plugin.platform.d f872e;
    private boolean f;
    private final io.flutter.embedding.engine.renderer.b g = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements io.flutter.embedding.engine.renderer.b {
        a() {
            f.this = r1;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            f.this.f868a.e();
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            f.this.f868a.f();
        }
    }

    /* loaded from: classes.dex */
    public interface b extends d.c {
        void A(i iVar);

        androidx.lifecycle.e a();

        Activity b();

        void c();

        void e();

        void f();

        String g();

        io.flutter.embedding.engine.d h();

        String k();

        io.flutter.embedding.engine.a l(Context context);

        boolean m();

        m n();

        boolean o();

        boolean p();

        p q();

        void r(j jVar);

        String s();

        void t(io.flutter.embedding.engine.a aVar);

        boolean u();

        String v();

        void w(io.flutter.embedding.engine.a aVar);

        o x();

        io.flutter.plugin.platform.d y(Activity activity, io.flutter.embedding.engine.a aVar);

        Context z();
    }

    public f(b bVar) {
        this.f868a = bVar;
    }

    private void b() {
        if (this.f868a.s() == null && !this.f869b.h().h()) {
            String g = this.f868a.g();
            if (g == null && (g = i(this.f868a.b().getIntent())) == null) {
                g = "/";
            }
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + this.f868a.v() + ", and sending initial route: " + g);
            this.f869b.m().c(g);
            String k = this.f868a.k();
            if (k == null || k.isEmpty()) {
                k = d.a.a.c().b().e();
            }
            this.f869b.h().f(new a.b(k, this.f868a.v()));
        }
    }

    private void e() {
        if (this.f868a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    private String i(Intent intent) {
        Uri data;
        if (!this.f868a.p() || (data = intent.getData()) == null || data.getPath().isEmpty()) {
            return null;
        }
        String path = data.getPath();
        if (data.getQuery() == null || data.getQuery().isEmpty()) {
            return path;
        }
        return path + "?" + data.getQuery();
    }

    public void A() {
        this.f868a = null;
        this.f869b = null;
        this.f871d = null;
        this.f872e = null;
    }

    void B() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String s = this.f868a.s();
        if (s != null) {
            io.flutter.embedding.engine.a a2 = io.flutter.embedding.engine.b.b().a(s);
            this.f869b = a2;
            this.f = true;
            if (a2 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + s + "'");
        }
        b bVar = this.f868a;
        io.flutter.embedding.engine.a l = bVar.l(bVar.z());
        this.f869b = l;
        if (l != null) {
            this.f = true;
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f869b = new io.flutter.embedding.engine.a(this.f868a.z(), this.f868a.h().b(), false, this.f868a.u());
        this.f = false;
    }

    @Override // io.flutter.embedding.android.d
    public void c() {
        if (!this.f868a.o()) {
            this.f868a.c();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f868a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: f */
    public Activity d() {
        Activity b2 = this.f868a.b();
        if (b2 != null) {
            return b2;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a g() {
        return this.f869b;
    }

    public boolean h() {
        return this.f;
    }

    public void j(int i, int i2, Intent intent) {
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
        this.f869b.g().c(i, i2, intent);
    }

    public void k(Context context) {
        e();
        if (this.f869b == null) {
            B();
        }
        if (this.f868a.m()) {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f869b.g().g(this, this.f868a.a());
        }
        b bVar = this.f868a;
        this.f872e = bVar.y(bVar.b(), this.f869b);
        this.f868a.t(this.f869b);
    }

    public void l() {
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
        this.f869b.m().a();
    }

    public View m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar;
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        e();
        if (this.f868a.n() == m.surface) {
            i iVar = new i(this.f868a.b(), this.f868a.q() == p.transparent);
            this.f868a.A(iVar);
            kVar = new k(this.f868a.b(), iVar);
        } else {
            j jVar = new j(this.f868a.b());
            this.f868a.r(jVar);
            kVar = new k(this.f868a.b(), jVar);
        }
        this.f871d = kVar;
        this.f871d.i(this.g);
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f868a.z());
        this.f870c = flutterSplashView;
        flutterSplashView.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : 486947586);
        this.f870c.g(this.f871d, this.f868a.x());
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f871d.k(this.f869b);
        return this.f870c;
    }

    public void n() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        e();
        this.f871d.o();
        this.f871d.u(this.g);
    }

    public void o() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        e();
        this.f868a.w(this.f869b);
        if (this.f868a.m()) {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f868a.b().isChangingConfigurations()) {
                this.f869b.g().j();
            } else {
                this.f869b.g().h();
            }
        }
        io.flutter.plugin.platform.d dVar = this.f872e;
        if (dVar != null) {
            dVar.j();
            this.f872e = null;
        }
        this.f869b.j().a();
        if (this.f868a.o()) {
            this.f869b.e();
            if (this.f868a.s() != null) {
                io.flutter.embedding.engine.b.b().d(this.f868a.s());
            }
            this.f869b = null;
        }
    }

    public void p(Intent intent) {
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f869b.g().d(intent);
        String i = i(intent);
        if (i == null || i.isEmpty()) {
            return;
        }
        this.f869b.m().b(i);
    }

    public void q() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        e();
        this.f869b.j().b();
    }

    public void r() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.flutter.plugin.platform.d dVar = this.f872e;
        if (dVar == null) {
            return;
        }
        dVar.t();
    }

    public void s(int i, String[] strArr, int[] iArr) {
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f869b.g().b(i, strArr, iArr);
    }

    public void t(Bundle bundle) {
        Bundle bundle2;
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        e();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f868a.u()) {
            this.f869b.r().j(bArr);
        }
        if (this.f868a.m()) {
            this.f869b.g().a(bundle2);
        }
    }

    public void u() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        e();
        this.f869b.j().d();
    }

    public void v(Bundle bundle) {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        e();
        if (this.f868a.u()) {
            bundle.putByteArray("framework", this.f869b.r().h());
        }
        if (this.f868a.m()) {
            Bundle bundle2 = new Bundle();
            this.f869b.g().e(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    public void w() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        e();
        b();
    }

    public void x() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        e();
        this.f869b.j().c();
    }

    public void y(int i) {
        e();
        io.flutter.embedding.engine.a aVar = this.f869b;
        if (aVar == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        aVar.h().i();
        if (i != 10) {
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i);
        this.f869b.t().a();
    }

    public void z() {
        e();
        if (this.f869b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
        this.f869b.g().f();
    }
}
