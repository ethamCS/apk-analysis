package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes.dex */
public final class u implements s1.a {

    /* renamed from: a */
    private final RelativeLayout f14827a;

    /* renamed from: b */
    public final FrameLayout f14828b;

    /* renamed from: c */
    public final TextView f14829c;

    /* renamed from: d */
    public final ImageView f14830d;

    /* renamed from: e */
    public final TextView f14831e;

    /* renamed from: f */
    public final TextView f14832f;

    /* renamed from: g */
    public final ImageView f14833g;

    /* renamed from: h */
    public final ScrollView f14834h;

    /* renamed from: i */
    public final MaterialButton f14835i;

    /* renamed from: j */
    public final TextView f14836j;

    private u(RelativeLayout relativeLayout, FrameLayout frameLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, ScrollView scrollView, MaterialButton materialButton, TextView textView4) {
        this.f14827a = relativeLayout;
        this.f14828b = frameLayout;
        this.f14829c = textView;
        this.f14830d = imageView;
        this.f14831e = textView2;
        this.f14832f = textView3;
        this.f14833g = imageView2;
        this.f14834h = scrollView;
        this.f14835i = materialButton;
        this.f14836j = textView4;
    }

    public static u b(View view) {
        int i10 = j8.k.g_res_0x7f090065;
        FrameLayout frameLayout = (FrameLayout) s1.b.a(view, i10);
        if (frameLayout != null) {
            i10 = j8.k.f14071b1;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = j8.k.f14072c1;
                ImageView imageView = (ImageView) s1.b.a(view, i10);
                if (imageView != null) {
                    i10 = j8.k.f14073d1;
                    TextView textView2 = (TextView) s1.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = j8.k.f14074e1;
                        TextView textView3 = (TextView) s1.b.a(view, i10);
                        if (textView3 != null) {
                            i10 = j8.k.f14075f1;
                            ImageView imageView2 = (ImageView) s1.b.a(view, i10);
                            if (imageView2 != null) {
                                i10 = j8.k.f14076g1;
                                ScrollView scrollView = (ScrollView) s1.b.a(view, i10);
                                if (scrollView != null) {
                                    i10 = j8.k.f14077h1;
                                    MaterialButton materialButton = (MaterialButton) s1.b.a(view, i10);
                                    if (materialButton != null) {
                                        i10 = j8.k.f14078i1;
                                        TextView textView4 = (TextView) s1.b.a(view, i10);
                                        if (textView4 != null) {
                                            return new u((RelativeLayout) view, frameLayout, textView, imageView, textView2, textView3, imageView2, scrollView, materialButton, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static u d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.f14088v, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout a() {
        return this.f14827a;
    }
}
