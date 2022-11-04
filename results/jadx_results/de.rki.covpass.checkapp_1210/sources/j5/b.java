package j5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.b;
import androidx.core.view.y;
import b5.k;
import k.d;
import t5.g;
/* loaded from: classes.dex */
public class b extends b.a {

    /* renamed from: e */
    private static final int f14016e = b5.b.f5456a;

    /* renamed from: f */
    private static final int f14017f = k.b_res_0x7f110140;

    /* renamed from: g */
    private static final int f14018g = b5.b.s_res_0x7f0302a0;

    /* renamed from: c */
    private Drawable f14019c;

    /* renamed from: d */
    private final Rect f14020d;

    public b(Context context, int i10) {
        super(n(context), p(context, i10));
        Context b10 = b();
        Resources.Theme theme = b10.getTheme();
        int i11 = f14016e;
        int i12 = f14017f;
        this.f14020d = c.a(b10, i11, i12);
        int c10 = i5.a.c(b10, b5.b.m_res_0x7f0300fb, getClass().getCanonicalName());
        g gVar = new g(b10, null, i11, i12);
        gVar.O(b10);
        gVar.Z(ColorStateList.valueOf(c10));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gVar.W(dimension);
            }
        }
        this.f14019c = gVar;
    }

    private static Context n(Context context) {
        int o10 = o(context);
        Context c10 = v5.a.c(context, null, f14016e, f14017f);
        return o10 == 0 ? c10 : new d(c10, o10);
    }

    private static int o(Context context) {
        TypedValue a10 = q5.b.a(context, f14018g);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    private static int p(Context context, int i10) {
        return i10 == 0 ? o(context) : i10;
    }

    /* renamed from: A */
    public b m(CharSequence charSequence) {
        return (b) super.m(charSequence);
    }

    @Override // androidx.appcompat.app.b.a
    public androidx.appcompat.app.b a() {
        androidx.appcompat.app.b a10 = super.a();
        Window window = a10.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f14019c;
        if (drawable instanceof g) {
            ((g) drawable).Y(y.w(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f14019c, this.f14020d));
        decorView.setOnTouchListener(new a(a10, this.f14020d));
        return a10;
    }

    /* renamed from: q */
    public b c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    public b r(boolean z10) {
        return (b) super.d(z10);
    }

    /* renamed from: s */
    public b e(View view) {
        return (b) super.e(view);
    }

    /* renamed from: t */
    public b f(Drawable drawable) {
        return (b) super.f(drawable);
    }

    public b u(CharSequence charSequence) {
        return (b) super.g(charSequence);
    }

    public b v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.h(charSequence, onClickListener);
    }

    public b w(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.i(charSequence, onClickListener);
    }

    /* renamed from: x */
    public b j(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.j(onKeyListener);
    }

    public b y(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(charSequence, onClickListener);
    }

    /* renamed from: z */
    public b l(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(listAdapter, i10, onClickListener);
    }
}
