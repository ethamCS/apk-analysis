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
    a.g.l.y a(int i, long j);

    void a(int i);

    void a(Drawable drawable);

    void a(Menu menu, m.a aVar);

    void a(m.a aVar, g.a aVar2);

    void a(p0 p0Var);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(boolean z);

    boolean b();

    void c();

    void c(int i);

    void collapseActionView();

    void d(int i);

    boolean d();

    boolean e();

    boolean f();

    void g();

    CharSequence getTitle();

    int h();

    void i();

    Menu j();

    boolean k();

    ViewGroup l();

    void m();

    Context n();

    int o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
