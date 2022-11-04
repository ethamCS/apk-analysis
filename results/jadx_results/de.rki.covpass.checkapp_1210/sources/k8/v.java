package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
/* loaded from: classes.dex */
public final class v implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14837a;

    /* renamed from: b */
    public final LottieAnimationView f14838b;

    /* renamed from: c */
    public final LinearLayout f14839c;

    /* renamed from: d */
    public final WebView f14840d;

    /* renamed from: e */
    public final TextView f14841e;

    /* renamed from: f */
    public final ExpertModeToggleElement f14842f;

    /* renamed from: g */
    public final CenteredTitleToolbar f14843g;

    /* renamed from: h */
    public final TextView f14844h;

    private v(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, LinearLayout linearLayout2, WebView webView, TextView textView, ExpertModeToggleElement expertModeToggleElement, CenteredTitleToolbar centeredTitleToolbar, TextView textView2) {
        this.f14837a = linearLayout;
        this.f14838b = lottieAnimationView;
        this.f14839c = linearLayout2;
        this.f14840d = webView;
        this.f14841e = textView;
        this.f14842f = expertModeToggleElement;
        this.f14843g = centeredTitleToolbar;
        this.f14844h = textView2;
    }

    public static v b(View view) {
        int i10 = j8.k.f14081l0;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) s1.b.a(view, i10);
        if (lottieAnimationView != null) {
            i10 = j8.k.f14083m0;
            LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
            if (linearLayout != null) {
                i10 = j8.k.f14070a1;
                WebView webView = (WebView) s1.b.a(view, i10);
                if (webView != null) {
                    i10 = j8.k.f14079j1;
                    TextView textView = (TextView) s1.b.a(view, i10);
                    if (textView != null) {
                        i10 = j8.k.f14080k1;
                        ExpertModeToggleElement expertModeToggleElement = (ExpertModeToggleElement) s1.b.a(view, i10);
                        if (expertModeToggleElement != null) {
                            i10 = j8.k.f14082l1;
                            CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
                            if (centeredTitleToolbar != null) {
                                i10 = j8.k.f14084m1;
                                TextView textView2 = (TextView) s1.b.a(view, i10);
                                if (textView2 != null) {
                                    return new v((LinearLayout) view, lottieAnimationView, linearLayout, webView, textView, expertModeToggleElement, centeredTitleToolbar, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.f14089w, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14837a;
    }
}
