package b.m.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import b.d.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class b extends b.m.a.a {

    /* renamed from: c */
    static boolean f2645c = false;

    /* renamed from: a */
    private final i f2646a;

    /* renamed from: b */
    private final c f2647b;

    /* loaded from: classes.dex */
    public static class a<D> extends n<D> {
        private final int j;
        private final Bundle k;
        private final b.m.b.a<D> l;
        private i m;
        private C0059b<D> n;
        private b.m.b.a<D> o;

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f2645c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.d();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f2645c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(o<? super D> oVar) {
            super.g(oVar);
            this.m = null;
        }

        @Override // androidx.lifecycle.n, androidx.lifecycle.LiveData
        public void h(D d2) {
            super.h(d2);
            b.m.b.a<D> aVar = this.o;
            if (aVar == null) {
                return;
            }
            aVar.c();
            throw null;
        }

        b.m.b.a<D> i(boolean z) {
            if (b.f2645c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            b.m.b.a<D> aVar = this.l;
            aVar.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        void k() {
            i iVar = this.m;
            C0059b<D> c0059b = this.n;
            if (iVar == null || c0059b == null) {
                return;
            }
            super.g(c0059b);
            d(iVar, c0059b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            b.g.k.a.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: b.m.a.b$b */
    /* loaded from: classes.dex */
    public static class C0059b<D> implements o<D> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends t {

        /* renamed from: c */
        private static final u.a f2648c = new a();

        /* renamed from: b */
        private h<a> f2649b = new h<>();

        /* loaded from: classes.dex */
        static class a implements u.a {
            a() {
            }

            @Override // androidx.lifecycle.u.a
            public <T extends t> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c f(v vVar) {
            return (c) new u(vVar, f2648c).a(c.class);
        }

        @Override // androidx.lifecycle.t
        public void d() {
            super.d();
            if (this.f2649b.p() <= 0) {
                this.f2649b.d();
            } else {
                this.f2649b.q(0).i(true);
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2649b.p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f2649b.p() <= 0) {
                    return;
                }
                a q = this.f2649b.q(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f2649b.l(0));
                printWriter.print(": ");
                printWriter.println(q.toString());
                q.j(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        void g() {
            int p = this.f2649b.p();
            for (int i = 0; i < p; i++) {
                this.f2649b.q(i).k();
            }
        }
    }

    public b(i iVar, v vVar) {
        this.f2646a = iVar;
        this.f2647b = c.f(vVar);
    }

    @Override // b.m.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2647b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // b.m.a.a
    public void c() {
        this.f2647b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.g.k.a.a(this.f2646a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
