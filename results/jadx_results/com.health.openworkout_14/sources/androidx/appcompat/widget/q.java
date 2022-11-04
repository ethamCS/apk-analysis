package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b */
    private static final boolean f607b;

    /* renamed from: a */
    private boolean f608a;

    static {
        f607b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        w0 v = w0.v(context, attributeSet, b.a.j.Z1, i, i2);
        int i3 = b.a.j.b2;
        if (v.s(i3)) {
            b(v.a(i3, false));
        }
        setBackgroundDrawable(v.g(b.a.j.a2));
        v.w();
    }

    private void b(boolean z) {
        if (f607b) {
            this.f608a = z;
        } else {
            androidx.core.widget.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f607b && this.f608a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f607b && this.f608a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f607b && this.f608a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
