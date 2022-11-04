package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.Objects;
/* loaded from: classes.dex */
public final class h implements s1.a {

    /* renamed from: a */
    private final WebView f14746a;

    /* renamed from: b */
    public final WebView f14747b;

    private h(WebView webView, WebView webView2) {
        this.f14746a = webView;
        this.f14747b = webView2;
    }

    public static h b(View view) {
        Objects.requireNonNull(view, "rootView");
        WebView webView = (WebView) view;
        return new h(webView, webView);
    }

    public static h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.h_res_0x7f0c002a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public WebView a() {
        return this.f14746a;
    }
}
