package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.o.b;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0006a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f139a;

        public C0006a(int i, int i2) {
            super(i, i2);
            this.f139a = 0;
            this.f139a = 8388627;
        }

        public C0006a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f139a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.t);
            this.f139a = obtainStyledAttributes.getInt(b.a.j.u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0006a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f139a = 0;
        }

        public C0006a(C0006a c0006a) {
            super((ViewGroup.MarginLayoutParams) c0006a);
            this.f139a = 0;
            this.f139a = c0006a.f139a;
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

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    public void n() {
    }

    public abstract boolean o(int i, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public abstract void u(Drawable drawable);

    public abstract void v(boolean z);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public b.a.o.b y(b.a aVar) {
        return null;
    }
}
