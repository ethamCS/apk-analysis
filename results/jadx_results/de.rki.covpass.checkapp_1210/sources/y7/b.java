package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.tabs.TabLayout;
import de.rki.covpass.commonapp.uielements.InfoElement;
/* loaded from: classes.dex */
public final class b implements s1.a {

    /* renamed from: a */
    private final ScrollView f25873a;

    /* renamed from: b */
    public final TextView f25874b;

    /* renamed from: c */
    public final ImageView f25875c;

    /* renamed from: d */
    public final MaterialCardView f25876d;

    /* renamed from: e */
    public final View f25877e;

    /* renamed from: f */
    public final TextView f25878f;

    /* renamed from: g */
    public final TextView f25879g;

    /* renamed from: h */
    public final TextView f25880h;

    /* renamed from: i */
    public final ConstraintLayout f25881i;

    /* renamed from: j */
    public final TextView f25882j;

    /* renamed from: k */
    public final ConstraintLayout f25883k;

    /* renamed from: l */
    public final SwitchMaterial f25884l;

    /* renamed from: m */
    public final TextView f25885m;

    /* renamed from: n */
    public final MaterialButton f25886n;

    /* renamed from: o */
    public final MaterialCardView f25887o;

    /* renamed from: p */
    public final TextView f25888p;

    /* renamed from: q */
    public final TextView f25889q;

    /* renamed from: r */
    public final Space f25890r;

    /* renamed from: s */
    public final TabLayout f25891s;

    /* renamed from: t */
    public final InfoElement f25892t;

    /* renamed from: u */
    public final TextView f25893u;

    /* renamed from: v */
    public final ImageButton f25894v;

    /* renamed from: w */
    public final TextView f25895w;

    /* renamed from: x */
    public final TextView f25896x;

    private b(ScrollView scrollView, TextView textView, ImageView imageView, MaterialCardView materialCardView, View view, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, TextView textView5, ConstraintLayout constraintLayout2, SwitchMaterial switchMaterial, TextView textView6, MaterialButton materialButton, MaterialCardView materialCardView2, TextView textView7, TextView textView8, Space space, TabLayout tabLayout, InfoElement infoElement, TextView textView9, ImageButton imageButton, TextView textView10, TextView textView11) {
        this.f25873a = scrollView;
        this.f25874b = textView;
        this.f25875c = imageView;
        this.f25876d = materialCardView;
        this.f25877e = view;
        this.f25878f = textView2;
        this.f25879g = textView3;
        this.f25880h = textView4;
        this.f25881i = constraintLayout;
        this.f25882j = textView5;
        this.f25883k = constraintLayout2;
        this.f25884l = switchMaterial;
        this.f25885m = textView6;
        this.f25886n = materialButton;
        this.f25887o = materialCardView2;
        this.f25888p = textView7;
        this.f25889q = textView8;
        this.f25890r = space;
        this.f25891s = tabLayout;
        this.f25892t = infoElement;
        this.f25893u = textView9;
        this.f25894v = imageButton;
        this.f25895w = textView10;
        this.f25896x = textView11;
    }

    public static b b(View view) {
        View a10;
        int i10 = x7.b.i_res_0x7f09014a;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = x7.b.j_res_0x7f09014b;
            ImageView imageView = (ImageView) s1.b.a(view, i10);
            if (imageView != null) {
                i10 = x7.b.k_res_0x7f09014c;
                MaterialCardView materialCardView = (MaterialCardView) s1.b.a(view, i10);
                if (materialCardView != null && (a10 = s1.b.a(view, (i10 = x7.b.l_res_0x7f09014d))) != null) {
                    i10 = x7.b.m_res_0x7f09014e;
                    TextView textView2 = (TextView) s1.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = x7.b.n_res_0x7f09014f;
                        TextView textView3 = (TextView) s1.b.a(view, i10);
                        if (textView3 != null) {
                            i10 = x7.b.o_res_0x7f090150;
                            TextView textView4 = (TextView) s1.b.a(view, i10);
                            if (textView4 != null) {
                                i10 = x7.b.p_res_0x7f090151;
                                ConstraintLayout constraintLayout = (ConstraintLayout) s1.b.a(view, i10);
                                if (constraintLayout != null) {
                                    i10 = x7.b.q_res_0x7f090152;
                                    TextView textView5 = (TextView) s1.b.a(view, i10);
                                    if (textView5 != null) {
                                        i10 = x7.b.r_res_0x7f090153;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) s1.b.a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = x7.b.s_res_0x7f090154;
                                            SwitchMaterial switchMaterial = (SwitchMaterial) s1.b.a(view, i10);
                                            if (switchMaterial != null) {
                                                i10 = x7.b.t_res_0x7f090155;
                                                TextView textView6 = (TextView) s1.b.a(view, i10);
                                                if (textView6 != null) {
                                                    i10 = x7.b.u_res_0x7f090156;
                                                    MaterialButton materialButton = (MaterialButton) s1.b.a(view, i10);
                                                    if (materialButton != null) {
                                                        i10 = x7.b.v_res_0x7f090157;
                                                        MaterialCardView materialCardView2 = (MaterialCardView) s1.b.a(view, i10);
                                                        if (materialCardView2 != null) {
                                                            i10 = x7.b.w_res_0x7f090158;
                                                            TextView textView7 = (TextView) s1.b.a(view, i10);
                                                            if (textView7 != null) {
                                                                i10 = x7.b.x_res_0x7f090159;
                                                                TextView textView8 = (TextView) s1.b.a(view, i10);
                                                                if (textView8 != null) {
                                                                    i10 = x7.b.y_res_0x7f09015a;
                                                                    Space space = (Space) s1.b.a(view, i10);
                                                                    if (space != null) {
                                                                        i10 = x7.b.z_res_0x7f09015b;
                                                                        TabLayout tabLayout = (TabLayout) s1.b.a(view, i10);
                                                                        if (tabLayout != null) {
                                                                            i10 = x7.b.A_res_0x7f09015c;
                                                                            InfoElement infoElement = (InfoElement) s1.b.a(view, i10);
                                                                            if (infoElement != null) {
                                                                                i10 = x7.b.B_res_0x7f09015d;
                                                                                TextView textView9 = (TextView) s1.b.a(view, i10);
                                                                                if (textView9 != null) {
                                                                                    i10 = x7.b.C_res_0x7f09015e;
                                                                                    ImageButton imageButton = (ImageButton) s1.b.a(view, i10);
                                                                                    if (imageButton != null) {
                                                                                        i10 = x7.b.f25476m0;
                                                                                        TextView textView10 = (TextView) s1.b.a(view, i10);
                                                                                        if (textView10 != null) {
                                                                                            i10 = x7.b.f25477n0;
                                                                                            TextView textView11 = (TextView) s1.b.a(view, i10);
                                                                                            if (textView11 != null) {
                                                                                                return new b((ScrollView) view, textView, imageView, materialCardView, a10, textView2, textView3, textView4, constraintLayout, textView5, constraintLayout2, switchMaterial, textView6, materialButton, materialCardView2, textView7, textView8, space, tabLayout, infoElement, textView9, imageButton, textView10, textView11);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.b_res_0x7f0c0026, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ScrollView a() {
        return this.f25873a;
    }
}
