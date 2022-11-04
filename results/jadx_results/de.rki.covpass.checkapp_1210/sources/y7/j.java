package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.rki.covpass.commonapp.uielements.InfoElement;
/* loaded from: classes.dex */
public final class j implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25942a;

    /* renamed from: b */
    public final ImageView f25943b;

    /* renamed from: c */
    public final TextView f25944c;

    /* renamed from: d */
    public final ImageView f25945d;

    /* renamed from: e */
    public final ImageView f25946e;

    /* renamed from: f */
    public final ImageView f25947f;

    /* renamed from: g */
    public final LinearLayout f25948g;

    /* renamed from: h */
    public final LinearLayout f25949h;

    /* renamed from: i */
    public final LinearLayout f25950i;

    /* renamed from: j */
    public final TextView f25951j;

    /* renamed from: k */
    public final TextView f25952k;

    /* renamed from: l */
    public final TextView f25953l;

    /* renamed from: m */
    public final TextView f25954m;

    /* renamed from: n */
    public final TextView f25955n;

    /* renamed from: o */
    public final TextView f25956o;

    /* renamed from: p */
    public final TextView f25957p;

    /* renamed from: q */
    public final TextView f25958q;

    /* renamed from: r */
    public final TextView f25959r;

    /* renamed from: s */
    public final InfoElement f25960s;

    private j(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, InfoElement infoElement) {
        this.f25942a = constraintLayout;
        this.f25943b = imageView;
        this.f25944c = textView;
        this.f25945d = imageView2;
        this.f25946e = imageView3;
        this.f25947f = imageView4;
        this.f25948g = linearLayout;
        this.f25949h = linearLayout2;
        this.f25950i = linearLayout3;
        this.f25951j = textView2;
        this.f25952k = textView3;
        this.f25953l = textView4;
        this.f25954m = textView5;
        this.f25955n = textView6;
        this.f25956o = textView7;
        this.f25957p = textView8;
        this.f25958q = textView9;
        this.f25959r = textView10;
        this.f25960s = infoElement;
    }

    public static j b(View view) {
        int i10 = x7.b.L_res_0x7f0901de;
        ImageView imageView = (ImageView) s1.b.a(view, i10);
        if (imageView != null) {
            i10 = x7.b.N_res_0x7f0901e0;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = x7.b.P_res_0x7f0901e2;
                ImageView imageView2 = (ImageView) s1.b.a(view, i10);
                if (imageView2 != null) {
                    i10 = x7.b.Q_res_0x7f0901e3;
                    ImageView imageView3 = (ImageView) s1.b.a(view, i10);
                    if (imageView3 != null) {
                        i10 = x7.b.R_res_0x7f0901e4;
                        ImageView imageView4 = (ImageView) s1.b.a(view, i10);
                        if (imageView4 != null) {
                            i10 = x7.b.T_res_0x7f0901e6;
                            LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                            if (linearLayout != null) {
                                i10 = x7.b.U_res_0x7f0901e7;
                                LinearLayout linearLayout2 = (LinearLayout) s1.b.a(view, i10);
                                if (linearLayout2 != null) {
                                    i10 = x7.b.V_res_0x7f0901e8;
                                    LinearLayout linearLayout3 = (LinearLayout) s1.b.a(view, i10);
                                    if (linearLayout3 != null) {
                                        i10 = x7.b.X_res_0x7f0901ea;
                                        TextView textView2 = (TextView) s1.b.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = x7.b.Z_res_0x7f0901ec;
                                            TextView textView3 = (TextView) s1.b.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = x7.b.a0_res_0x7f0901ed;
                                                TextView textView4 = (TextView) s1.b.a(view, i10);
                                                if (textView4 != null) {
                                                    i10 = x7.b.b0_res_0x7f0901ee;
                                                    TextView textView5 = (TextView) s1.b.a(view, i10);
                                                    if (textView5 != null) {
                                                        i10 = x7.b.d0_res_0x7f0901f0;
                                                        TextView textView6 = (TextView) s1.b.a(view, i10);
                                                        if (textView6 != null) {
                                                            i10 = x7.b.e0_res_0x7f0901f1;
                                                            TextView textView7 = (TextView) s1.b.a(view, i10);
                                                            if (textView7 != null) {
                                                                i10 = x7.b.f0_res_0x7f0901f2;
                                                                TextView textView8 = (TextView) s1.b.a(view, i10);
                                                                if (textView8 != null) {
                                                                    i10 = x7.b.g0_res_0x7f0901f3;
                                                                    TextView textView9 = (TextView) s1.b.a(view, i10);
                                                                    if (textView9 != null) {
                                                                        i10 = x7.b.h0_res_0x7f0901f4;
                                                                        TextView textView10 = (TextView) s1.b.a(view, i10);
                                                                        if (textView10 != null) {
                                                                            i10 = x7.b.f25475l0;
                                                                            InfoElement infoElement = (InfoElement) s1.b.a(view, i10);
                                                                            if (infoElement != null) {
                                                                                return new j((ConstraintLayout) view, imageView, textView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, infoElement);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.e_res_0x7f0c0095, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25942a;
    }
}
