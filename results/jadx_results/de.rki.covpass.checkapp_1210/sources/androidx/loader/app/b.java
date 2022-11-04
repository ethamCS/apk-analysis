package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import i0.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c */
    static boolean f4409c = false;

    /* renamed from: a */
    private final v f4410a;

    /* renamed from: b */
    private final C0054b f4411b;

    /* loaded from: classes.dex */
    public static class a<D> extends d0<D> {

        /* renamed from: l */
        private final int f4412l;

        /* renamed from: m */
        private final Bundle f4413m;

        /* renamed from: n */
        private v f4414n;

        @Override // androidx.lifecycle.LiveData
        protected void i() {
            if (b.f4409c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.f4409c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void l(e0<? super D> e0Var) {
            super.l(e0Var);
            this.f4414n = null;
        }

        @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
        public void m(D d10) {
            super.m(d10);
        }

        f1.a<D> n(boolean z10) {
            if (b.f4409c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4412l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4413m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }

        void p() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4412l);
            sb2.append(" : ");
            androidx.core.util.b.a(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes.dex */
    public static class C0054b extends s0 {

        /* renamed from: f */
        private static final v0.b f4415f = new a();

        /* renamed from: d */
        private h<a> f4416d = new h<>();

        /* renamed from: e */
        private boolean f4417e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        /* loaded from: classes.dex */
        static class a implements v0.b {
            a() {
            }

            @Override // androidx.lifecycle.v0.b
            public <T extends s0> T a(Class<T> cls) {
                return new C0054b();
            }

            @Override // androidx.lifecycle.v0.b
            public /* synthetic */ s0 b(Class cls, e1.a aVar) {
                return w0.b(this, cls, aVar);
            }
        }

        C0054b() {
        }

        static C0054b g(y0 y0Var) {
            return (C0054b) new v0(y0Var, f4415f).a(C0054b.class);
        }

        @Override // androidx.lifecycle.s0
        public void d() {
            super.d();
            int k10 = this.f4416d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f4416d.l(i10).n(true);
            }
            this.f4416d.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4416d.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f4416d.k(); i10++) {
                    a l10 = this.f4416d.l(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4416d.i(i10));
                    printWriter.print(": ");
                    printWriter.println(l10.toString());
                    l10.o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void h() {
            int k10 = this.f4416d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f4416d.l(i10).p();
            }
        }
    }

    public b(v vVar, y0 y0Var) {
        this.f4410a = vVar;
        this.f4411b = C0054b.g(y0Var);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4411b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f4411b.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f4410a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
