package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: b */
    private final Activity f896b;

    /* renamed from: c */
    private final Context f897c;
    private final Handler d;
    private final int e;
    final j f;

    h(Activity activity, Context context, Handler handler, int i) {
        this.f = new j();
        this.f896b = activity;
        a.g.k.h.a(context, "context == null");
        this.f897c = context;
        a.g.k.h.a(handler, "handler == null");
        this.d = handler;
        this.e = i;
    }

    public h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View a(int i) {
        return null;
    }

    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b(Fragment fragment) {
        return true;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    public Activity f() {
        return this.f896b;
    }

    public Context g() {
        return this.f897c;
    }

    public Handler h() {
        return this.d;
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f897c);
    }

    public int k() {
        return this.e;
    }

    public boolean l() {
        return true;
    }

    public void m() {
    }
}
