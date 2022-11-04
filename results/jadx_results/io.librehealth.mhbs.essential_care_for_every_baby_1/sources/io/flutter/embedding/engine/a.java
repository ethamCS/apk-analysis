package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.i.e;
import io.flutter.embedding.engine.i.f;
import io.flutter.embedding.engine.i.g;
import io.flutter.embedding.engine.i.h;
import io.flutter.embedding.engine.i.i;
import io.flutter.embedding.engine.i.k;
import io.flutter.embedding.engine.i.l;
import io.flutter.embedding.engine.i.m;
import io.flutter.embedding.engine.i.n;
import io.flutter.plugin.platform.j;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final FlutterJNI f926a;

    /* renamed from: b */
    private final io.flutter.embedding.engine.renderer.a f927b;

    /* renamed from: c */
    private final io.flutter.embedding.engine.e.a f928c;

    /* renamed from: d */
    private final c f929d;

    /* renamed from: e */
    private final d.a.c.b.a f930e;
    private final io.flutter.embedding.engine.i.b f;
    private final io.flutter.embedding.engine.i.c g;
    private final io.flutter.embedding.engine.i.d h;
    private final e i;
    private final f j;
    private final g k;
    private final h l;
    private final k m;
    private final i n;
    private final l o;
    private final m p;
    private final n q;
    private final j r;
    private final Set<b> s;
    private final b t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.a$a */
    /* loaded from: classes.dex */
    public class C0046a implements b {
        C0046a() {
            a.this = r1;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            d.a.b.e("FlutterEngine", "onPreEngineRestart()");
            for (b bVar : a.this.s) {
                bVar.a();
            }
            a.this.r.T();
            a.this.m.g();
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public a(Context context, io.flutter.embedding.engine.g.c cVar, FlutterJNI flutterJNI, j jVar, String[] strArr, boolean z, boolean z2) {
        AssetManager assetManager;
        this.s = new HashSet();
        this.t = new C0046a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        io.flutter.embedding.engine.e.a aVar = new io.flutter.embedding.engine.e.a(flutterJNI, assetManager);
        this.f928c = aVar;
        aVar.j();
        io.flutter.embedding.engine.f.a a2 = d.a.a.c().a();
        this.f = new io.flutter.embedding.engine.i.b(aVar, flutterJNI);
        io.flutter.embedding.engine.i.c cVar2 = new io.flutter.embedding.engine.i.c(aVar);
        this.g = cVar2;
        this.h = new io.flutter.embedding.engine.i.d(aVar);
        this.i = new e(aVar);
        f fVar = new f(aVar);
        this.j = fVar;
        this.k = new g(aVar);
        this.l = new h(aVar);
        this.n = new i(aVar);
        this.m = new k(aVar, z2);
        this.o = new l(aVar);
        this.p = new m(aVar);
        this.q = new n(aVar);
        if (a2 != null) {
            a2.f(cVar2);
        }
        d.a.c.b.a aVar2 = new d.a.c.b.a(context, fVar);
        this.f930e = aVar2;
        this.f926a = flutterJNI;
        cVar = cVar == null ? d.a.a.c().b() : cVar;
        if (!flutterJNI.isAttached()) {
            cVar.i(context.getApplicationContext());
            cVar.d(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.t);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(d.a.a.c().a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.f927b = new io.flutter.embedding.engine.renderer.a(flutterJNI);
        this.r = jVar;
        jVar.N();
        this.f929d = new c(context.getApplicationContext(), this, cVar);
        if (!z || !cVar.c()) {
            return;
        }
        w();
    }

    public a(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, null, new FlutterJNI(), new j(), strArr, z, z2);
    }

    private void d() {
        d.a.b.e("FlutterEngine", "Attaching to JNI.");
        this.f926a.attachToNative(false);
        if (v()) {
            return;
        }
        throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
    }

    private boolean v() {
        return this.f926a.isAttached();
    }

    private void w() {
        try {
            Class.forName("io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", a.class).invoke(null, this);
        } catch (Exception unused) {
            d.a.b.f("FlutterEngine", "Tried to automatically register plugins with FlutterEngine (" + this + ") but could not find and invoke the GeneratedPluginRegistrant.");
        }
    }

    public void e() {
        d.a.b.e("FlutterEngine", "Destroying.");
        for (b bVar : this.s) {
            bVar.b();
        }
        this.f929d.m();
        this.r.P();
        this.f928c.k();
        this.f926a.removeEngineLifecycleListener(this.t);
        this.f926a.setDeferredComponentManager(null);
        this.f926a.detachFromNativeAndReleaseResources();
        if (d.a.a.c().a() != null) {
            d.a.a.c().a().d();
            this.g.c(null);
        }
    }

    public io.flutter.embedding.engine.i.b f() {
        return this.f;
    }

    public io.flutter.embedding.engine.h.c.b g() {
        return this.f929d;
    }

    public io.flutter.embedding.engine.e.a h() {
        return this.f928c;
    }

    public io.flutter.embedding.engine.i.d i() {
        return this.h;
    }

    public e j() {
        return this.i;
    }

    public d.a.c.b.a k() {
        return this.f930e;
    }

    public g l() {
        return this.k;
    }

    public h m() {
        return this.l;
    }

    public i n() {
        return this.n;
    }

    public j o() {
        return this.r;
    }

    public io.flutter.embedding.engine.h.b p() {
        return this.f929d;
    }

    public io.flutter.embedding.engine.renderer.a q() {
        return this.f927b;
    }

    public k r() {
        return this.m;
    }

    public l s() {
        return this.o;
    }

    public m t() {
        return this.p;
    }

    public n u() {
        return this.q;
    }
}
