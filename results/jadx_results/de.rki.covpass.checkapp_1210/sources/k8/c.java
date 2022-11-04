package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public final class c implements s1.a {

    /* renamed from: a */
    private final RelativeLayout f14712a;

    /* renamed from: b */
    public final RelativeLayout f14713b;

    /* renamed from: c */
    public final ImageView f14714c;

    private c(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView) {
        this.f14712a = relativeLayout;
        this.f14713b = relativeLayout2;
        this.f14714c = imageView;
    }

    public static c b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = j8.k.C0_res_0x7f090200;
        ImageView imageView = (ImageView) s1.b.a(view, i10);
        if (imageView != null) {
            return new c(relativeLayout, relativeLayout, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static c e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.c_res_0x7f0c001f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout a() {
        return this.f14712a;
    }
}
