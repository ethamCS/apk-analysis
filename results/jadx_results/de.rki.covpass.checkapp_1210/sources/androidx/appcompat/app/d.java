package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: c */
    private static int f714c = -100;

    /* renamed from: d */
    private static final i0.b<WeakReference<d>> f715d = new i0.b<>();

    /* renamed from: q */
    private static final Object f716q = new Object();

    public static void c(d dVar) {
        synchronized (f716q) {
            y(dVar);
            f715d.add(new WeakReference<>(dVar));
        }
    }

    public static d g(Activity activity, f.a aVar) {
        return new e(activity, aVar);
    }

    public static d h(Dialog dialog, f.a aVar) {
        return new e(dialog, aVar);
    }

    public static int j() {
        return f714c;
    }

    public static void x(d dVar) {
        synchronized (f716q) {
            y(dVar);
        }
    }

    private static void y(d dVar) {
        synchronized (f716q) {
            Iterator<WeakReference<d>> it = f715d.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i10);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(Toolbar toolbar);

    public void E(int i10) {
    }

    public abstract void F(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i10);

    public int k() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i10);
}
