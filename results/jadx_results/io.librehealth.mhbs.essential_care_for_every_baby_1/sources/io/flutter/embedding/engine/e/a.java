package io.flutter.embedding.engine.e;

import android.content.res.AssetManager;
import d.a.c.a.b;
import d.a.c.a.q;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class a implements d.a.c.a.b {

    /* renamed from: a */
    private final FlutterJNI f945a;

    /* renamed from: b */
    private final AssetManager f946b;

    /* renamed from: c */
    private final io.flutter.embedding.engine.e.b f947c;

    /* renamed from: d */
    private final d.a.c.a.b f948d;

    /* renamed from: e */
    private boolean f949e;
    private String f;
    private d g;
    private final b.a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.e.a$a */
    /* loaded from: classes.dex */
    public class C0048a implements b.a {
        C0048a() {
            a.this = r1;
        }

        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
            a.this.f = q.f712b.a(byteBuffer);
            if (a.this.g != null) {
                a.this.g.a(a.this.f);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f951a;

        /* renamed from: b */
        public final String f952b = null;

        /* renamed from: c */
        public final String f953c;

        public b(String str, String str2) {
            this.f951a = str;
            this.f953c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f951a.equals(bVar.f951a)) {
                return this.f953c.equals(bVar.f953c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f951a.hashCode() * 31) + this.f953c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f951a + ", function: " + this.f953c + " )";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements d.a.c.a.b {

        /* renamed from: a */
        private final io.flutter.embedding.engine.e.b f954a;

        private c(io.flutter.embedding.engine.e.b bVar) {
            this.f954a = bVar;
        }

        /* synthetic */ c(io.flutter.embedding.engine.e.b bVar, C0048a c0048a) {
            this(bVar);
        }

        @Override // d.a.c.a.b
        public void a(String str, ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
            this.f954a.a(str, byteBuffer, abstractC0039b);
        }

        @Override // d.a.c.a.b
        public void d(String str, b.a aVar) {
            this.f954a.d(str, aVar);
        }
    }

    /* loaded from: classes.dex */
    interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f949e = false;
        C0048a c0048a = new C0048a();
        this.h = c0048a;
        this.f945a = flutterJNI;
        this.f946b = assetManager;
        io.flutter.embedding.engine.e.b bVar = new io.flutter.embedding.engine.e.b(flutterJNI);
        this.f947c = bVar;
        bVar.d("flutter/isolate", c0048a);
        this.f948d = new c(bVar, null);
        if (flutterJNI.isAttached()) {
            this.f949e = true;
        }
    }

    @Override // d.a.c.a.b
    @Deprecated
    public void a(String str, ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
        this.f948d.a(str, byteBuffer, abstractC0039b);
    }

    @Override // d.a.c.a.b
    @Deprecated
    public void d(String str, b.a aVar) {
        this.f948d.d(str, aVar);
    }

    public void f(b bVar) {
        if (this.f949e) {
            d.a.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        d.a.b.e("DartExecutor", "Executing Dart entrypoint: " + bVar);
        this.f945a.runBundleAndSnapshotFromLibrary(bVar.f951a, bVar.f953c, bVar.f952b, this.f946b);
        this.f949e = true;
    }

    public String g() {
        return this.f;
    }

    public boolean h() {
        return this.f949e;
    }

    public void i() {
        if (this.f945a.isAttached()) {
            this.f945a.notifyLowMemoryWarning();
        }
    }

    public void j() {
        d.a.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f945a.setPlatformMessageHandler(this.f947c);
    }

    public void k() {
        d.a.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f945a.setPlatformMessageHandler(null);
    }
}
