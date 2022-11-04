package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
/* loaded from: classes.dex */
public final class g implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14739a;

    /* renamed from: b */
    public final CenteredTitleToolbar f14740b;

    /* renamed from: c */
    public final TextView f14741c;

    /* renamed from: d */
    public final TextView f14742d;

    /* renamed from: e */
    public final TextView f14743e;

    /* renamed from: f */
    public final TextView f14744f;

    /* renamed from: g */
    public final TextView f14745g;

    private g(LinearLayout linearLayout, CenteredTitleToolbar centeredTitleToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f14739a = linearLayout;
        this.f14740b = centeredTitleToolbar;
        this.f14741c = textView;
        this.f14742d = textView2;
        this.f14743e = textView3;
        this.f14744f = textView4;
        this.f14745g = textView5;
    }

    public static g b(View view) {
        int i10 = j8.k.k0_res_0x7f090136;
        CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
        if (centeredTitleToolbar != null) {
            i10 = j8.k.T0;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = j8.k.U0;
                TextView textView2 = (TextView) s1.b.a(view, i10);
                if (textView2 != null) {
                    i10 = j8.k.V0;
                    TextView textView3 = (TextView) s1.b.a(view, i10);
                    if (textView3 != null) {
                        i10 = j8.k.X0;
                        TextView textView4 = (TextView) s1.b.a(view, i10);
                        if (textView4 != null) {
                            i10 = j8.k.Y0;
                            TextView textView5 = (TextView) s1.b.a(view, i10);
                            if (textView5 != null) {
                                return new g((LinearLayout) view, centeredTitleToolbar, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.g_res_0x7f0c0025, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14739a;
    }
}
