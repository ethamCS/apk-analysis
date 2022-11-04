package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
/* loaded from: classes.dex */
public interface d0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    CharSequence getTitle();

    void h();

    void i(m.a aVar, g.a aVar2);

    int j();

    void k(int i);

    Menu l();

    void m(int i);

    void n(p0 p0Var);

    ViewGroup o();

    void p(int i);

    void q(boolean z);

    Context r();

    int s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    b.g.l.x t(int i, long j);

    void u();

    boolean v();

    void w();

    void x(Drawable drawable);

    void y(boolean z);

    void z(int i);
}
