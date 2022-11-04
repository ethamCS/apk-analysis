package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
public interface g0 {
    void a(Menu menu, j.a aVar);

    Context b();

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(j.a aVar, e.a aVar2);

    void k(int i10);

    void l(s0 s0Var);

    ViewGroup m();

    void n(boolean z10);

    boolean o();

    void p(int i10);

    int q();

    Menu r();

    void s(int i10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    int u();

    androidx.core.view.e0 v(int i10, long j10);

    void w();

    void x();

    void y(boolean z10);

    void z(int i10);
}
