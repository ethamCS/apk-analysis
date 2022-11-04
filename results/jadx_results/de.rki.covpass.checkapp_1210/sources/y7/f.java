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
public final class f implements s1.a {

    /* renamed from: a */
    private final FrameLayout f25912a;

    /* renamed from: b */
    public final LinearLayout f25913b;

    /* renamed from: c */
    public final TextView f25914c;

    /* renamed from: d */
    public final MaterialCardView f25915d;

    /* renamed from: e */
    public final ImageView f25916e;

    /* renamed from: f */
    public final LinearLayout f25917f;

    /* renamed from: g */
    public final TextView f25918g;

    /* renamed from: h */
    public final TextView f25919h;

    /* renamed from: i */
    public final TextView f25920i;

    private f(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, MaterialCardView materialCardView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4) {
        this.f25912a = frameLayout;
        this.f25913b = linearLayout;
        this.f25914c = textView;
        this.f25915d = materialCardView;
        this.f25916e = imageView;
        this.f25917f = linearLayout2;
        this.f25918g = textView2;
        this.f25919h = textView3;
        this.f25920i = textView4;
    }

    public static f b(View view) {
        int i10 = x7.b.D_res_0x7f0901d6;
        LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
        if (linearLayout != null) {
            i10 = x7.b.E_res_0x7f0901d7;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = x7.b.F_res_0x7f0901d8;
                MaterialCardView materialCardView = (MaterialCardView) s1.b.a(view, i10);
                if (materialCardView != null) {
                    i10 = x7.b.G_res_0x7f0901d9;
                    ImageView imageView = (ImageView) s1.b.a(view, i10);
                    if (imageView != null) {
                        i10 = x7.b.H_res_0x7f0901da;
                        LinearLayout linearLayout2 = (LinearLayout) s1.b.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = x7.b.I_res_0x7f0901db;
                            TextView textView2 = (TextView) s1.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = x7.b.J_res_0x7f0901dc;
                                TextView textView3 = (TextView) s1.b.a(view, i10);
                                if (textView3 != null) {
                                    i10 = x7.b.K_res_0x7f0901dd;
                                    TextView textView4 = (TextView) s1.b.a(view, i10);
                                    if (textView4 != null) {
                                        return new f((FrameLayout) view, linearLayout, textView, materialCardView, imageView, linearLayout2, textView2, textView3, textView4);
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

    public static f d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static f e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.g_res_0x7f0c0097, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public FrameLayout a() {
        return this.f25912a;
    }
}
