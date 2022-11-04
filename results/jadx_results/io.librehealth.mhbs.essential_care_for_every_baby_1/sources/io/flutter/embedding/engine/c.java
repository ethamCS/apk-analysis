package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import d.a.c.a.k;
import d.a.c.a.l;
import d.a.c.a.m;
import d.a.c.a.n;
import io.flutter.embedding.engine.h.a;
import io.flutter.embedding.engine.h.c.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class c implements io.flutter.embedding.engine.h.b, io.flutter.embedding.engine.h.c.b {

    /* renamed from: b */
    private final io.flutter.embedding.engine.a f935b;

    /* renamed from: c */
    private final a.b f936c;
    @Deprecated

    /* renamed from: e */
    private Activity f938e;
    private io.flutter.embedding.android.d<Activity> f;
    private C0047c g;
    private Service j;
    private f k;
    private BroadcastReceiver m;
    private d n;
    private ContentProvider p;
    private e q;

    /* renamed from: a */
    private final Map<Class<? extends io.flutter.embedding.engine.h.a>, io.flutter.embedding.engine.h.a> f934a = new HashMap();

    /* renamed from: d */
    private final Map<Class<? extends io.flutter.embedding.engine.h.a>, io.flutter.embedding.engine.h.c.a> f937d = new HashMap();
    private boolean h = false;
    private final Map<Class<? extends io.flutter.embedding.engine.h.a>, io.flutter.embedding.engine.h.f.a> i = new HashMap();
    private final Map<Class<? extends io.flutter.embedding.engine.h.a>, io.flutter.embedding.engine.h.d.a> l = new HashMap();
    private final Map<Class<? extends io.flutter.embedding.engine.h.a>, io.flutter.embedding.engine.h.e.a> o = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements a.AbstractC0051a {
        private b(io.flutter.embedding.engine.g.c cVar) {
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c */
    /* loaded from: classes.dex */
    public static class C0047c implements io.flutter.embedding.engine.h.c.c {

        /* renamed from: a */
        private final Activity f939a;

        /* renamed from: b */
        private final Set<m> f940b = new HashSet();

        /* renamed from: c */
        private final Set<k> f941c = new HashSet();

        /* renamed from: d */
        private final Set<l> f942d = new HashSet();

        /* renamed from: e */
        private final Set<n> f943e = new HashSet();
        private final Set<c.a> f = new HashSet();

        public C0047c(Activity activity, androidx.lifecycle.e eVar) {
            this.f939a = activity;
            new HiddenLifecycleReference(eVar);
        }

        @Override // io.flutter.embedding.engine.h.c.c
        public void a(l lVar) {
            this.f942d.add(lVar);
        }

        @Override // io.flutter.embedding.engine.h.c.c
        public Activity b() {
            return this.f939a;
        }

        boolean c(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.f941c).iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((k) it.next()).c(i, i2, intent) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        void d(Intent intent) {
            for (l lVar : this.f942d) {
                lVar.d(intent);
            }
        }

        boolean e(int i, String[] strArr, int[] iArr) {
            while (true) {
                boolean z = false;
                for (m mVar : this.f940b) {
                    if (mVar.b(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        void f(Bundle bundle) {
            for (c.a aVar : this.f) {
                aVar.a(bundle);
            }
        }

        void g(Bundle bundle) {
            for (c.a aVar : this.f) {
                aVar.e(bundle);
            }
        }

        void h() {
            for (n nVar : this.f943e) {
                nVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d implements io.flutter.embedding.engine.h.d.b {
    }

    /* loaded from: classes.dex */
    private static class e implements io.flutter.embedding.engine.h.e.b {
    }

    /* loaded from: classes.dex */
    private static class f implements io.flutter.embedding.engine.h.f.b {
    }

    public c(Context context, io.flutter.embedding.engine.a aVar, io.flutter.embedding.engine.g.c cVar) {
        this.f935b = aVar;
        this.f936c = new a.b(context, aVar, aVar.h(), aVar.q(), aVar.o().H(), new b(cVar));
    }

    private void k(Activity activity, androidx.lifecycle.e eVar) {
        this.g = new C0047c(activity, eVar);
        this.f935b.o().t(activity, this.f935b.q(), this.f935b.h());
        for (io.flutter.embedding.engine.h.c.a aVar : this.f937d.values()) {
            if (this.h) {
                aVar.c(this.g);
            } else {
                aVar.b(this.g);
            }
        }
        this.h = false;
    }

    private Activity l() {
        io.flutter.embedding.android.d<Activity> dVar = this.f;
        return dVar != null ? dVar.d() : this.f938e;
    }

    private void n() {
        this.f935b.o().B();
        this.f = null;
        this.f938e = null;
        this.g = null;
    }

    private void o() {
        if (t()) {
            h();
        } else if (w()) {
            r();
        } else if (u()) {
            p();
        } else if (!v()) {
        } else {
            q();
        }
    }

    private boolean t() {
        return (this.f938e == null && this.f == null) ? false : true;
    }

    private boolean u() {
        return this.m != null;
    }

    private boolean v() {
        return this.p != null;
    }

    private boolean w() {
        return this.j != null;
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void a(Bundle bundle) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onRestoreInstanceState() to plugins.");
        if (t()) {
            this.g.f(bundle);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public boolean b(int i, String[] strArr, int[] iArr) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onRequestPermissionsResult() to plugins.");
        if (t()) {
            return this.g.e(i, strArr, iArr);
        }
        d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public boolean c(int i, int i2, Intent intent) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onActivityResult() to plugins.");
        if (t()) {
            return this.g.c(i, i2, intent);
        }
        d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void d(Intent intent) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onNewIntent() to plugins.");
        if (t()) {
            this.g.d(intent);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void e(Bundle bundle) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onSaveInstanceState() to plugins.");
        if (t()) {
            this.g.g(bundle);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void f() {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onUserLeaveHint() to plugins.");
        if (t()) {
            this.g.h();
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void g(io.flutter.embedding.android.d<Activity> dVar, androidx.lifecycle.e eVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Attaching to an exclusive Activity: ");
        sb.append(dVar.d());
        String str2 = "";
        if (t()) {
            str = " evicting previous activity " + l();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(".");
        if (this.h) {
            str2 = " This is after a config change.";
        }
        sb.append(str2);
        d.a.b.e("FlutterEngineCxnRegstry", sb.toString());
        io.flutter.embedding.android.d<Activity> dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.c();
        }
        o();
        if (this.f938e == null) {
            this.f = dVar;
            k(dVar.d(), eVar);
            return;
        }
        throw new AssertionError("Only activity or exclusiveActivity should be set");
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void h() {
        if (!t()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from an Activity: " + l());
        for (io.flutter.embedding.engine.h.c.a aVar : this.f937d.values()) {
            aVar.a();
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.h.b
    public void i(io.flutter.embedding.engine.h.a aVar) {
        if (s(aVar.getClass())) {
            d.a.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f935b + ").");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
        this.f934a.put(aVar.getClass(), aVar);
        aVar.h(this.f936c);
        if (aVar instanceof io.flutter.embedding.engine.h.c.a) {
            io.flutter.embedding.engine.h.c.a aVar2 = (io.flutter.embedding.engine.h.c.a) aVar;
            this.f937d.put(aVar.getClass(), aVar2);
            if (t()) {
                aVar2.b(this.g);
            }
        }
        if (aVar instanceof io.flutter.embedding.engine.h.f.a) {
            io.flutter.embedding.engine.h.f.a aVar3 = (io.flutter.embedding.engine.h.f.a) aVar;
            this.i.put(aVar.getClass(), aVar3);
            if (w()) {
                aVar3.a(this.k);
            }
        }
        if (aVar instanceof io.flutter.embedding.engine.h.d.a) {
            io.flutter.embedding.engine.h.d.a aVar4 = (io.flutter.embedding.engine.h.d.a) aVar;
            this.l.put(aVar.getClass(), aVar4);
            if (u()) {
                aVar4.a(this.n);
            }
        }
        if (!(aVar instanceof io.flutter.embedding.engine.h.e.a)) {
            return;
        }
        io.flutter.embedding.engine.h.e.a aVar5 = (io.flutter.embedding.engine.h.e.a) aVar;
        this.o.put(aVar.getClass(), aVar5);
        if (!v()) {
            return;
        }
        aVar5.a(this.q);
    }

    @Override // io.flutter.embedding.engine.h.c.b
    public void j() {
        if (!t()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from an Activity for config changes: " + l());
        this.h = true;
        for (io.flutter.embedding.engine.h.c.a aVar : this.f937d.values()) {
            aVar.f();
        }
        n();
    }

    public void m() {
        d.a.b.e("FlutterEngineCxnRegstry", "Destroying.");
        o();
        z();
    }

    public void p() {
        if (!u()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from BroadcastReceiver: " + this.m);
        for (io.flutter.embedding.engine.h.d.a aVar : this.l.values()) {
            aVar.b();
        }
    }

    public void q() {
        if (!v()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from ContentProvider: " + this.p);
        for (io.flutter.embedding.engine.h.e.a aVar : this.o.values()) {
            aVar.b();
        }
    }

    public void r() {
        if (!w()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from a Service: " + this.j);
        for (io.flutter.embedding.engine.h.f.a aVar : this.i.values()) {
            aVar.b();
        }
        this.j = null;
    }

    public boolean s(Class<? extends io.flutter.embedding.engine.h.a> cls) {
        return this.f934a.containsKey(cls);
    }

    public void x(Class<? extends io.flutter.embedding.engine.h.a> cls) {
        io.flutter.embedding.engine.h.a aVar = this.f934a.get(cls);
        if (aVar != null) {
            d.a.b.e("FlutterEngineCxnRegstry", "Removing plugin: " + aVar);
            if (aVar instanceof io.flutter.embedding.engine.h.c.a) {
                if (t()) {
                    ((io.flutter.embedding.engine.h.c.a) aVar).a();
                }
                this.f937d.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.h.f.a) {
                if (w()) {
                    ((io.flutter.embedding.engine.h.f.a) aVar).b();
                }
                this.i.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.h.d.a) {
                if (u()) {
                    ((io.flutter.embedding.engine.h.d.a) aVar).b();
                }
                this.l.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.h.e.a) {
                if (v()) {
                    ((io.flutter.embedding.engine.h.e.a) aVar).b();
                }
                this.o.remove(cls);
            }
            aVar.e(this.f936c);
            this.f934a.remove(cls);
        }
    }

    public void y(Set<Class<? extends io.flutter.embedding.engine.h.a>> set) {
        for (Class<? extends io.flutter.embedding.engine.h.a> cls : set) {
            x(cls);
        }
    }

    public void z() {
        y(new HashSet(this.f934a.keySet()));
        this.f934a.clear();
    }
}
