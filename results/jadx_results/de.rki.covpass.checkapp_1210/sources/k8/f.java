package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.CheckContextCheckboxElement;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
/* loaded from: classes.dex */
public final class f implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14722a;

    /* renamed from: b */
    public final MaterialButton f14723b;

    /* renamed from: c */
    public final CheckContextCheckboxElement f14724c;

    /* renamed from: d */
    public final CheckContextCheckboxElement f14725d;

    /* renamed from: e */
    public final LinearLayout f14726e;

    /* renamed from: f */
    public final TextView f14727f;

    /* renamed from: g */
    public final TextView f14728g;

    /* renamed from: h */
    public final ExpertModeToggleElement f14729h;

    /* renamed from: i */
    public final LottieAnimationView f14730i;

    /* renamed from: j */
    public final LinearLayout f14731j;

    /* renamed from: k */
    public final RecyclerView f14732k;

    /* renamed from: l */
    public final LinearLayout f14733l;

    /* renamed from: m */
    public final TextView f14734m;

    /* renamed from: n */
    public final TextView f14735n;

    /* renamed from: o */
    public final CenteredTitleToolbar f14736o;

    /* renamed from: p */
    public final TextView f14737p;

    /* renamed from: q */
    public final MaterialButton f14738q;

    private f(LinearLayout linearLayout, MaterialButton materialButton, CheckContextCheckboxElement checkContextCheckboxElement, CheckContextCheckboxElement checkContextCheckboxElement2, LinearLayout linearLayout2, TextView textView, TextView textView2, ExpertModeToggleElement expertModeToggleElement, LottieAnimationView lottieAnimationView, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, TextView textView3, TextView textView4, CenteredTitleToolbar centeredTitleToolbar, TextView textView5, MaterialButton materialButton2) {
        this.f14722a = linearLayout;
        this.f14723b = materialButton;
        this.f14724c = checkContextCheckboxElement;
        this.f14725d = checkContextCheckboxElement2;
        this.f14726e = linearLayout2;
        this.f14727f = textView;
        this.f14728g = textView2;
        this.f14729h = expertModeToggleElement;
        this.f14730i = lottieAnimationView;
        this.f14731j = linearLayout3;
        this.f14732k = recyclerView;
        this.f14733l = linearLayout4;
        this.f14734m = textView3;
        this.f14735n = textView4;
        this.f14736o = centeredTitleToolbar;
        this.f14737p = textView5;
        this.f14738q = materialButton2;
    }

    public static f b(View view) {
        int i10 = j8.k.f14086t;
        MaterialButton materialButton = (MaterialButton) s1.b.a(view, i10);
        if (materialButton != null) {
            i10 = j8.k.x_res_0x7f090091;
            CheckContextCheckboxElement checkContextCheckboxElement = (CheckContextCheckboxElement) s1.b.a(view, i10);
            if (checkContextCheckboxElement != null) {
                i10 = j8.k.y_res_0x7f090092;
                CheckContextCheckboxElement checkContextCheckboxElement2 = (CheckContextCheckboxElement) s1.b.a(view, i10);
                if (checkContextCheckboxElement2 != null) {
                    i10 = j8.k.f14085n0;
                    LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = j8.k.o0_res_0x7f0901ad;
                        TextView textView = (TextView) s1.b.a(view, i10);
                        if (textView != null) {
                            i10 = j8.k.p0_res_0x7f0901ae;
                            TextView textView2 = (TextView) s1.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = j8.k.q0_res_0x7f0901af;
                                ExpertModeToggleElement expertModeToggleElement = (ExpertModeToggleElement) s1.b.a(view, i10);
                                if (expertModeToggleElement != null) {
                                    i10 = j8.k.L0;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) s1.b.a(view, i10);
                                    if (lottieAnimationView != null) {
                                        i10 = j8.k.M0;
                                        LinearLayout linearLayout2 = (LinearLayout) s1.b.a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = j8.k.N0;
                                            RecyclerView recyclerView = (RecyclerView) s1.b.a(view, i10);
                                            if (recyclerView != null) {
                                                i10 = j8.k.O0;
                                                LinearLayout linearLayout3 = (LinearLayout) s1.b.a(view, i10);
                                                if (linearLayout3 != null) {
                                                    i10 = j8.k.P0;
                                                    TextView textView3 = (TextView) s1.b.a(view, i10);
                                                    if (textView3 != null) {
                                                        i10 = j8.k.Q0;
                                                        TextView textView4 = (TextView) s1.b.a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = j8.k.R0;
                                                            CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
                                                            if (centeredTitleToolbar != null) {
                                                                i10 = j8.k.S0;
                                                                TextView textView5 = (TextView) s1.b.a(view, i10);
                                                                if (textView5 != null) {
                                                                    i10 = j8.k.Z0;
                                                                    MaterialButton materialButton2 = (MaterialButton) s1.b.a(view, i10);
                                                                    if (materialButton2 != null) {
                                                                        return new f((LinearLayout) view, materialButton, checkContextCheckboxElement, checkContextCheckboxElement2, linearLayout, textView, textView2, expertModeToggleElement, lottieAnimationView, linearLayout2, recyclerView, linearLayout3, textView3, textView4, centeredTitleToolbar, textView5, materialButton2);
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

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.f_res_0x7f0c0024, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14722a;
    }
}
