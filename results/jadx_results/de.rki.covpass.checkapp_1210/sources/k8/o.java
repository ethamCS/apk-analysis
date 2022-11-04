package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.InfoElement;
/* loaded from: classes.dex */
public final class o implements s1.a {

    /* renamed from: a */
    private final ScrollView f14798a;

    /* renamed from: b */
    public final LinearLayout f14799b;

    /* renamed from: c */
    public final ImageView f14800c;

    /* renamed from: d */
    public final TextView f14801d;

    /* renamed from: e */
    public final TextView f14802e;

    /* renamed from: f */
    public final TextView f14803f;

    /* renamed from: g */
    public final ScrollView f14804g;

    /* renamed from: h */
    public final InfoElement f14805h;

    private o(ScrollView scrollView, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ScrollView scrollView2, InfoElement infoElement) {
        this.f14798a = scrollView;
        this.f14799b = linearLayout;
        this.f14800c = imageView;
        this.f14801d = textView;
        this.f14802e = textView2;
        this.f14803f = textView3;
        this.f14804g = scrollView2;
        this.f14805h = infoElement;
    }

    public static o b(View view) {
        int i10 = j8.k.z_res_0x7f0900a9;
        LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
        if (linearLayout != null) {
            i10 = j8.k.s0_res_0x7f0901b3;
            ImageView imageView = (ImageView) s1.b.a(view, i10);
            if (imageView != null) {
                i10 = j8.k.t0_res_0x7f0901b4;
                TextView textView = (TextView) s1.b.a(view, i10);
                if (textView != null) {
                    i10 = j8.k.u0_res_0x7f0901b5;
                    TextView textView2 = (TextView) s1.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = j8.k.v0_res_0x7f0901b6;
                        TextView textView3 = (TextView) s1.b.a(view, i10);
                        if (textView3 != null) {
                            ScrollView scrollView = (ScrollView) view;
                            i10 = j8.k.y0_res_0x7f0901ba;
                            InfoElement infoElement = (InfoElement) s1.b.a(view, i10);
                            if (infoElement != null) {
                                return new o(scrollView, linearLayout, imageView, textView, textView2, textView3, scrollView, infoElement);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.o_res_0x7f0c0077, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ScrollView a() {
        return this.f14798a;
    }
}
