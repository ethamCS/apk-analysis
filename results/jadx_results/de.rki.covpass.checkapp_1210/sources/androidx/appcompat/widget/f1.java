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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a */
    private final Context f1319a;

    /* renamed from: b */
    private final View f1320b;

    /* renamed from: c */
    private final TextView f1321c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1322d;

    /* renamed from: e */
    private final Rect f1323e = new Rect();

    /* renamed from: f */
    private final int[] f1324f = new int[2];

    /* renamed from: g */
    private final int[] f1325g = new int[2];

    public f1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1322d = layoutParams;
        this.f1319a = context;
        View inflate = LayoutInflater.from(context).inflate(e.g.s_res_0x7f0c001b, (ViewGroup) null);
        this.f1320b = inflate;
        this.f1321c = (TextView) inflate.findViewById(e.f.s_res_0x7f090176);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.a_res_0x7f110005;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1319a.getResources().getDimensionPixelOffset(e.d.m_res_0x7f06027a);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1319a.getResources().getDimensionPixelOffset(e.d.l_res_0x7f060279);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1319a.getResources().getDimensionPixelOffset(z10 ? e.d.o_res_0x7f06027d : e.d.n_res_0x7f06027c);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1323e);
        Rect rect = this.f1323e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1319a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1323e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1325g);
        view.getLocationOnScreen(this.f1324f);
        int[] iArr = this.f1324f;
        int i14 = iArr[0];
        int[] iArr2 = this.f1325g;
        iArr[0] = i14 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1320b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1320b.getMeasuredHeight();
        int[] iArr3 = this.f1324f;
        int i15 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i16 = iArr3[1] + i13 + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i16 > this.f1323e.height() : i15 >= 0) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i16;
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
        ((WindowManager) this.f1319a.getSystemService("window")).removeView(this.f1320b);
    }

    boolean d() {
        return this.f1320b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1321c.setText(charSequence);
        a(view, i10, i11, z10, this.f1322d);
        ((WindowManager) this.f1319a.getSystemService("window")).addView(this.f1320b, this.f1322d);
    }
}
