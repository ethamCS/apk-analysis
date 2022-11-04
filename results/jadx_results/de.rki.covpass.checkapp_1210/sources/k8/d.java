package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class d implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14715a;

    /* renamed from: b */
    public final TextView f14716b;

    /* renamed from: c */
    public final ImageView f14717c;

    private d(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f14715a = linearLayout;
        this.f14716b = textView;
        this.f14717c = imageView;
    }

    public static d b(View view) {
        int i10 = j8.k.r_res_0x7f090078;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = j8.k.s_res_0x7f090079;
            ImageView imageView = (ImageView) s1.b.a(view, i10);
            if (imageView != null) {
                return new d((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.d_res_0x7f0c0020, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14715a;
    }
}
