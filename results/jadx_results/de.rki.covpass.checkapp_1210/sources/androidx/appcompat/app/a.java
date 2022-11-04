package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import k.b;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0013a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f706a;

        public C0013a(int i10, int i11) {
            super(i10, i11);
            this.f706a = 8388627;
        }

        public C0013a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f706a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f9304t);
            this.f706a = obtainStyledAttributes.getInt(e.j.f9309u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0013a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f706a = 0;
        }

        public C0013a(C0013a c0013a) {
            super((ViewGroup.MarginLayoutParams) c0013a);
            this.f706a = 0;
            this.f706a = c0013a.f706a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
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

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(int i10);

    public abstract void w(boolean z10);

    public abstract void x(CharSequence charSequence);

    public k.b y(b.a aVar) {
        return null;
    }
}
