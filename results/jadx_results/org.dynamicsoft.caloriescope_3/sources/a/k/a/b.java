package a.k.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class b extends a.k.a.a {

    /* renamed from: c */
    static boolean f321c = false;

    /* renamed from: a */
    private final h f322a;

    /* renamed from: b */
    private final c f323b;

    /* loaded from: classes.dex */
    public static class a<D> extends m<D> {
        private final int j;
        private final Bundle k;
        private final a.k.b.a<D> l;
        private h m;
        private C0023b<D> n;
        private a.k.b.a<D> o;

        a.k.b.a<D> a(boolean z) {
            if (b.f321c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void a() {
            if (b.f321c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.c();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(n<? super D> nVar) {
            super.a((n) nVar);
            this.m = null;
            this.n = null;
        }

        @Override // androidx.lifecycle.m, androidx.lifecycle.LiveData
        public void a(D d) {
            super.a((a<D>) d);
            a.k.b.a<D> aVar = this.o;
            if (aVar == null) {
                return;
            }
            aVar.b();
            throw null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            a.k.b.a<D> aVar = this.l;
            aVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void b() {
            if (b.f321c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.d();
            throw null;
        }

        void c() {
            h hVar = this.m;
            C0023b<D> c0023b = this.n;
            if (hVar == null || c0023b == null) {
                return;
            }
            super.a((n) c0023b);
            a(hVar, c0023b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            a.g.k.a.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.k.a.b$b */
    /* loaded from: classes.dex */
    public static class C0023b<D> implements n<D> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends q {

        /* renamed from: c */
        private static final r.a f324c = new a();

        /* renamed from: b */
        private a.d.h<a> f325b = new a.d.h<>();

        /* loaded from: classes.dex */
        static class a implements r.a {
            a() {
            }

            @Override // androidx.lifecycle.r.a
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c a(s sVar) {
            return (c) new r(sVar, f324c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f325b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f325b.b() <= 0) {
                    return;
                }
                a d = this.f325b.d(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f325b.b(0));
                printWriter.print(": ");
                printWriter.println(d.toString());
                d.a(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        @Override // androidx.lifecycle.q
        public void b() {
            super.b();
            if (this.f325b.b() <= 0) {
                this.f325b.a();
            } else {
                this.f325b.d(0).a(true);
                throw null;
            }
        }

        void c() {
            int b2 = this.f325b.b();
            for (int i = 0; i < b2; i++) {
                this.f325b.d(i).c();
            }
        }
    }

    public b(h hVar, s sVar) {
        this.f322a = hVar;
        this.f323b = c.a(sVar);
    }

    @Override // a.k.a.a
    public void a() {
        this.f323b.c();
    }

    @Override // a.k.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f323b.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.g.k.a.a(this.f322a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
