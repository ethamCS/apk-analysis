package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
/* loaded from: classes.dex */
public final class d implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25900a;

    /* renamed from: b */
    public final LottieAnimationView f25901b;

    /* renamed from: c */
    public final LinearLayout f25902c;

    /* renamed from: d */
    public final RecyclerView f25903d;

    /* renamed from: e */
    public final WebView f25904e;

    private d(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, RecyclerView recyclerView, WebView webView) {
        this.f25900a = constraintLayout;
        this.f25901b = lottieAnimationView;
        this.f25902c = linearLayout;
        this.f25903d = recyclerView;
        this.f25904e = webView;
    }

    public static d b(View view) {
        int i10 = x7.b.f25473g;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) s1.b.a(view, i10);
        if (lottieAnimationView != null) {
            i10 = x7.b.f25474h;
            LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
            if (linearLayout != null) {
                i10 = x7.b.k0_res_0x7f0901f9;
                RecyclerView recyclerView = (RecyclerView) s1.b.a(view, i10);
                if (recyclerView != null) {
                    i10 = x7.b.G0_res_0x7f0902b1;
                    WebView webView = (WebView) s1.b.a(view, i10);
                    if (webView != null) {
                        return new d((ConstraintLayout) view, lottieAnimationView, linearLayout, recyclerView, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.d_res_0x7f0c007e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25900a;
    }
}
