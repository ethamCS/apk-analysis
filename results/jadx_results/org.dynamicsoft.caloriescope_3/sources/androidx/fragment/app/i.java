package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: c */
    static final g f898c = new g();

    /* renamed from: b */
    private g f899b = null;

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(i iVar, Fragment fragment);

        public abstract void a(i iVar, Fragment fragment, Context context);

        public abstract void a(i iVar, Fragment fragment, Bundle bundle);

        public abstract void a(i iVar, Fragment fragment, View view, Bundle bundle);

        public abstract void b(i iVar, Fragment fragment);

        public abstract void b(i iVar, Fragment fragment, Context context);

        public abstract void b(i iVar, Fragment fragment, Bundle bundle);

        public abstract void c(i iVar, Fragment fragment);

        public abstract void c(i iVar, Fragment fragment, Bundle bundle);

        public abstract void d(i iVar, Fragment fragment);

        public abstract void d(i iVar, Fragment fragment, Bundle bundle);

        public abstract void e(i iVar, Fragment fragment);

        public abstract void f(i iVar, Fragment fragment);

        public abstract void g(i iVar, Fragment fragment);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public g a() {
        if (this.f899b == null) {
            this.f899b = f898c;
        }
        return this.f899b;
    }

    public void a(g gVar) {
        this.f899b = gVar;
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract List<Fragment> b();

    public abstract boolean c();
}
