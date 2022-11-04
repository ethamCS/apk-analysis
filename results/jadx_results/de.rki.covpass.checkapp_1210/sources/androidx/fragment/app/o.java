package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class o<E> extends l {

    /* renamed from: c */
    private final Activity f4176c;

    /* renamed from: d */
    private final Context f4177d;

    /* renamed from: q */
    private final Handler f4178q;

    /* renamed from: x */
    private final int f4179x;

    /* renamed from: y */
    final w f4180y;

    o(Activity activity, Context context, Handler handler, int i10) {
        this.f4180y = new x();
        this.f4176c = activity;
        this.f4177d = (Context) androidx.core.util.h.h(context, "context == null");
        this.f4178q = (Handler) androidx.core.util.h.h(handler, "handler == null");
        this.f4179x = i10;
    }

    public o(j jVar) {
        this(jVar, jVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.l
    public View d(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.l
    public boolean e() {
        return true;
    }

    public Activity h() {
        return this.f4176c;
    }

    public Context i() {
        return this.f4177d;
    }

    public Handler k() {
        return this.f4178q;
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E n();

    public LayoutInflater o() {
        return LayoutInflater.from(this.f4177d);
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.content.a.i(this.f4177d, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q() {
    }
}
