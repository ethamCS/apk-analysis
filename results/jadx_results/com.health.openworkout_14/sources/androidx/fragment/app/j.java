package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public abstract class j<E> extends f {

    /* renamed from: b */
    private final Activity f1065b;

    /* renamed from: c */
    private final Context f1066c;

    /* renamed from: d */
    private final Handler f1067d;

    /* renamed from: e */
    final m f1068e;

    j(Activity activity, Context context, Handler handler, int i) {
        this.f1068e = new n();
        this.f1065b = activity;
        b.g.k.h.d(context, "context == null");
        this.f1066c = context;
        b.g.k.h.d(handler, "handler == null");
        this.f1067d = handler;
    }

    public j(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.f
    public View e(int i) {
        return null;
    }

    @Override // androidx.fragment.app.f
    public boolean f() {
        return true;
    }

    public Activity g() {
        return this.f1065b;
    }

    public Context i() {
        return this.f1066c;
    }

    public Handler j() {
        return this.f1067d;
    }

    public void k(Fragment fragment) {
    }

    public abstract E l();

    public LayoutInflater m() {
        return LayoutInflater.from(this.f1066c);
    }

    public void n(Fragment fragment, String[] strArr, int i) {
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1066c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q() {
    }
}
