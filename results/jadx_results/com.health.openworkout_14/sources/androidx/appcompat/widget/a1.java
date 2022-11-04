package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* loaded from: classes.dex */
class a1 {

    /* renamed from: a */
    private final Context f466a;

    /* renamed from: b */
    private final View f467b;

    /* renamed from: c */
    private final TextView f468c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f469d;

    /* renamed from: e */
    private final Rect f470e = new Rect();

    /* renamed from: f */
    private final int[] f471f = new int[2];

    /* renamed from: g */
    private final int[] f472g = new int[2];

    public a1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f469d = layoutParams;
        this.f466a = context;
        View inflate = LayoutInflater.from(context).inflate(b.a.g.s, (ViewGroup) null);
        this.f467b = inflate;
        this.f468c = (TextView) inflate.findViewById(b.a.f.s_res_0x7f090106);
        layoutParams.setTitle(a1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = b.a.i.a_res_0x7f110005;
        layoutParams.flags = 24;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f466a.getResources().getDimensionPixelOffset(b.a.d.j_res_0x7f070166);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f466a.getResources().getDimensionPixelOffset(b.a.d.i_res_0x7f070165);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f466a.getResources().getDimensionPixelOffset(z ? b.a.d.l_res_0x7f070169 : b.a.d.k_res_0x7f070168);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f470e);
        Rect rect = this.f470e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f466a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f470e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.f472g);
        view.getLocationOnScreen(this.f471f);
        int[] iArr = this.f471f;
        int i5 = iArr[0];
        int[] iArr2 = this.f472g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f467b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f467b.getMeasuredHeight();
        int[] iArr3 = this.f471f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f470e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
            return rootView;
        }
        return rootView;
    }

    public void c() {
        if (!d()) {
            return;
        }
        ((WindowManager) this.f466a.getSystemService("window")).removeView(this.f467b);
    }

    boolean d() {
        return this.f467b.getParent() != null;
    }

    public void e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f468c.setText(charSequence);
        a(view, i, i2, z, this.f469d);
        ((WindowManager) this.f466a.getSystemService("window")).addView(this.f467b, this.f469d);
    }
}
