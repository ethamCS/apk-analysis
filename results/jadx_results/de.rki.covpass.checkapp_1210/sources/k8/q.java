package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class q implements s1.a {

    /* renamed from: a */
    private final ScrollView f14812a;

    /* renamed from: b */
    public final ImageView f14813b;

    /* renamed from: c */
    public final TextView f14814c;

    /* renamed from: d */
    public final TextView f14815d;

    private q(ScrollView scrollView, ImageView imageView, TextView textView, TextView textView2) {
        this.f14812a = scrollView;
        this.f14813b = imageView;
        this.f14814c = textView;
        this.f14815d = textView2;
    }

    public static q b(View view) {
        int i10 = j8.k.s0_res_0x7f0901b3;
        ImageView imageView = (ImageView) s1.b.a(view, i10);
        if (imageView != null) {
            i10 = j8.k.u0_res_0x7f0901b5;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = j8.k.v0_res_0x7f0901b6;
                TextView textView2 = (TextView) s1.b.a(view, i10);
                if (textView2 != null) {
                    return new q((ScrollView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.r_res_0x7f0c007a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ScrollView a() {
        return this.f14812a;
    }
}
