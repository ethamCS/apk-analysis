package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class m implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f14769a;

    /* renamed from: b */
    public final TextView f14770b;

    /* renamed from: c */
    public final ImageView f14771c;

    /* renamed from: d */
    public final TextView f14772d;

    /* renamed from: e */
    public final TextView f14773e;

    private m(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f14769a = constraintLayout;
        this.f14770b = textView;
        this.f14771c = imageView;
        this.f14772d = textView2;
        this.f14773e = textView3;
    }

    public static m b(View view) {
        int i10 = j8.k.L_res_0x7f09011d;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = j8.k.M_res_0x7f09011e;
            ImageView imageView = (ImageView) s1.b.a(view, i10);
            if (imageView != null) {
                i10 = j8.k.N_res_0x7f09011f;
                TextView textView2 = (TextView) s1.b.a(view, i10);
                if (textView2 != null) {
                    i10 = j8.k.O_res_0x7f090120;
                    TextView textView3 = (TextView) s1.b.a(view, i10);
                    if (textView3 != null) {
                        return new m((ConstraintLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static m e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.m_res_0x7f0c003e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f14769a;
    }
}
