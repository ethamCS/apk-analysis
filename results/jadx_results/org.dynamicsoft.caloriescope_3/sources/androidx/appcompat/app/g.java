package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b */
    private static int f493b = -100;

    /* renamed from: c */
    private static final a.d.b<WeakReference<g>> f494c = new a.d.b<>();
    private static final Object d = new Object();

    public static g a(Activity activity, f fVar) {
        return new h(activity, fVar);
    }

    public static g a(Dialog dialog, f fVar) {
        return new h(dialog, fVar);
    }

    public static void a(g gVar) {
        synchronized (d) {
            c(gVar);
            f494c.add(new WeakReference<>(gVar));
        }
    }

    public static void b(g gVar) {
        synchronized (d) {
            c(gVar);
        }
    }

    private static void c(g gVar) {
        synchronized (d) {
            Iterator<WeakReference<g>> it = f494c.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static int k() {
        return f493b;
    }

    public abstract <T extends View> T a(int i);

    public abstract b.AbstractC0030b a();

    public void a(Context context) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public int b() {
        return -100;
    }

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public abstract MenuInflater c();

    public abstract void c(int i);

    public abstract void c(Bundle bundle);

    public abstract a d();

    public void d(int i) {
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();
}
