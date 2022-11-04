package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
/* loaded from: classes.dex */
public class b implements DrawerLayout.d {

    /* renamed from: a */
    private final AbstractC0030b f478a;

    /* renamed from: b */
    private final DrawerLayout f479b;

    /* renamed from: c */
    private a.a.l.a.d f480c;
    private boolean d;
    boolean e;
    private final int f;
    private final int g;
    View.OnClickListener h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            b.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.e) {
                bVar.c();
                return;
            }
            View.OnClickListener onClickListener = bVar.h;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0030b {
        void a(int i);

        void a(Drawable drawable, int i);

        boolean a();

        Context b();

        Drawable c();
    }

    /* loaded from: classes.dex */
    public interface c {
        AbstractC0030b d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements AbstractC0030b {

        /* renamed from: a */
        private final Activity f482a;

        /* renamed from: b */
        private c.a f483b;

        d(Activity activity) {
            this.f482a = activity;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(int i) {
            if (Build.VERSION.SDK_INT < 18) {
                this.f483b = androidx.appcompat.app.c.a(this.f483b, this.f482a, i);
                return;
            }
            ActionBar actionBar = this.f482a.getActionBar();
            if (actionBar == null) {
                return;
            }
            actionBar.setHomeActionContentDescription(i);
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.f482a.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(drawable);
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                actionBar.setDisplayShowHomeEnabled(true);
                this.f483b = androidx.appcompat.app.c.a(this.f482a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public boolean a() {
            ActionBar actionBar = this.f482a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Context b() {
            ActionBar actionBar = this.f482a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f482a;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Drawable c() {
            if (Build.VERSION.SDK_INT >= 18) {
                TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                return drawable;
            }
            return androidx.appcompat.app.c.a(this.f482a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements AbstractC0030b {

        /* renamed from: a */
        final Toolbar f484a;

        /* renamed from: b */
        final Drawable f485b;

        /* renamed from: c */
        final CharSequence f486c;

        e(Toolbar toolbar) {
            this.f484a = toolbar;
            this.f485b = toolbar.getNavigationIcon();
            this.f486c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(int i) {
            if (i == 0) {
                this.f484a.setNavigationContentDescription(this.f486c);
            } else {
                this.f484a.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public void a(Drawable drawable, int i) {
            this.f484a.setNavigationIcon(drawable);
            a(i);
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public boolean a() {
            return true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Context b() {
            return this.f484a.getContext();
        }

        @Override // androidx.appcompat.app.b.AbstractC0030b
        public Drawable c() {
            return this.f485b;
        }
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, a.a.l.a.d dVar, int i, int i2) {
        this.d = true;
        this.e = true;
        this.i = false;
        if (toolbar != null) {
            this.f478a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f478a = ((c) activity).d();
        } else {
            this.f478a = new d(activity);
        }
        this.f479b = drawerLayout;
        this.f = i;
        this.g = i2;
        if (dVar == null) {
            this.f480c = new a.a.l.a.d(this.f478a.b());
        } else {
            this.f480c = dVar;
        }
        a();
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    private void a(float f) {
        a.a.l.a.d dVar;
        boolean z;
        if (f != 1.0f) {
            if (f == 0.0f) {
                dVar = this.f480c;
                z = false;
            }
            this.f480c.c(f);
        }
        dVar = this.f480c;
        z = true;
        dVar.b(z);
        this.f480c.c(f);
    }

    Drawable a() {
        return this.f478a.c();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(int i) {
    }

    void a(Drawable drawable, int i) {
        if (!this.i && !this.f478a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.i = true;
        }
        this.f478a.a(drawable, i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view) {
        a(1.0f);
        if (this.e) {
            b(this.g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view, float f) {
        if (this.d) {
            a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            a(0.0f);
        }
    }

    public void b() {
        a(this.f479b.e(8388611) ? 1.0f : 0.0f);
        if (this.e) {
            a(this.f480c, this.f479b.e(8388611) ? this.g : this.f);
        }
    }

    void b(int i) {
        this.f478a.a(i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        a(0.0f);
        if (this.e) {
            b(this.f);
        }
    }

    void c() {
        int c2 = this.f479b.c(8388611);
        if (this.f479b.f(8388611) && c2 != 2) {
            this.f479b.a(8388611);
        } else if (c2 == 1) {
        } else {
            this.f479b.g(8388611);
        }
    }
}
