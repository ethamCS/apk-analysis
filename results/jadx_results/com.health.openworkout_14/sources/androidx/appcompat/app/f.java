package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b */
    private static int f143b = -100;

    /* renamed from: c */
    private static final b.d.b<WeakReference<f>> f144c = new b.d.b<>();

    /* renamed from: d */
    private static final Object f145d = new Object();

    public static void A(f fVar) {
        synchronized (f145d) {
            B(fVar);
        }
    }

    private static void B(f fVar) {
        synchronized (f145d) {
            Iterator<WeakReference<f>> it = f144c.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void G(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f143b == i) {
        } else {
            f143b = i;
            f();
        }
    }

    public static void c(f fVar) {
        synchronized (f145d) {
            B(fVar);
            f144c.add(new WeakReference<>(fVar));
        }
    }

    private static void f() {
        synchronized (f145d) {
            Iterator<WeakReference<f>> it = f144c.iterator();
            while (it.hasNext()) {
                f fVar = it.next().get();
                if (fVar != null) {
                    fVar.e();
                }
            }
        }
    }

    public static f i(Activity activity, e eVar) {
        return new g(activity, eVar);
    }

    public static f j(Dialog dialog, e eVar) {
        return new g(dialog, eVar);
    }

    public static int l() {
        return f143b;
    }

    public abstract boolean C(int i);

    public abstract void D(int i);

    public abstract void E(View view);

    public abstract void F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void H(Toolbar toolbar);

    public void I(int i) {
    }

    public abstract void J(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    public Context h(Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i);

    public abstract b m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract a p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
