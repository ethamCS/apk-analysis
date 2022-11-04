package androidx.appcompat.app;

import a.a.n.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0029a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f477a;

        public C0029a(int i, int i2) {
            super(i, i2);
            this.f477a = 0;
            this.f477a = 8388627;
        }

        public C0029a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f477a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a.j.ActionBarLayout);
            this.f477a = obtainStyledAttributes.getInt(a.a.j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0029a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f477a = 0;
        }

        public C0029a(C0029a c0029a) {
            super((ViewGroup.MarginLayoutParams) c0029a);
            this.f477a = 0;
            this.f477a = c0029a.f477a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public a.a.n.b a(b.a aVar) {
        return null;
    }

    public void a(Configuration configuration) {
    }

    public abstract void a(Drawable drawable);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public abstract int g();

    public abstract Context h();

    public boolean i() {
        return false;
    }

    public void j() {
    }

    public boolean k() {
        return false;
    }
}
