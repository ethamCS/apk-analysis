package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
/* loaded from: classes.dex */
public final class h implements s1.a {

    /* renamed from: a */
    private final FrameLayout f25930a;

    /* renamed from: b */
    public final MaterialCardView f25931b;

    /* renamed from: c */
    public final ImageView f25932c;

    /* renamed from: d */
    public final LinearLayout f25933d;

    /* renamed from: e */
    public final TextView f25934e;

    /* renamed from: f */
    public final TextView f25935f;

    /* renamed from: g */
    public final TextView f25936g;

    private h(FrameLayout frameLayout, MaterialCardView materialCardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f25930a = frameLayout;
        this.f25931b = materialCardView;
        this.f25932c = imageView;
        this.f25933d = linearLayout;
        this.f25934e = textView;
        this.f25935f = textView2;
        this.f25936g = textView3;
    }

    public static h b(View view) {
        int i10 = x7.b.M_res_0x7f0901df;
        MaterialCardView materialCardView = (MaterialCardView) s1.b.a(view, i10);
        if (materialCardView != null) {
            i10 = x7.b.O_res_0x7f0901e1;
            ImageView imageView = (ImageView) s1.b.a(view, i10);
            if (imageView != null) {
                i10 = x7.b.S_res_0x7f0901e5;
                LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = x7.b.W_res_0x7f0901e9;
                    TextView textView = (TextView) s1.b.a(view, i10);
                    if (textView != null) {
                        i10 = x7.b.Y_res_0x7f0901eb;
                        TextView textView2 = (TextView) s1.b.a(view, i10);
                        if (textView2 != null) {
                            i10 = x7.b.c0_res_0x7f0901ef;
                            TextView textView3 = (TextView) s1.b.a(view, i10);
                            if (textView3 != null) {
                                return new h((FrameLayout) view, materialCardView, imageView, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static h e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.i_res_0x7f0c0099, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public FrameLayout a() {
        return this.f25930a;
    }
}
