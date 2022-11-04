package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes.dex */
public final class b implements s1.a {

    /* renamed from: a */
    private final FrameLayout f14696a;

    /* renamed from: b */
    public final ConstraintLayout f14697b;

    /* renamed from: c */
    public final MaterialButton f14698c;

    /* renamed from: d */
    public final ConstraintLayout f14699d;

    /* renamed from: e */
    public final ConstraintLayout f14700e;

    /* renamed from: f */
    public final MaterialButton f14701f;

    /* renamed from: g */
    public final ImageView f14702g;

    /* renamed from: h */
    public final FrameLayout f14703h;

    /* renamed from: i */
    public final NestedScrollView f14704i;

    /* renamed from: j */
    public final TextView f14705j;

    /* renamed from: k */
    public final ConstraintLayout f14706k;

    /* renamed from: l */
    public final LinearLayout f14707l;

    /* renamed from: m */
    public final MaterialButton f14708m;

    /* renamed from: n */
    public final TextView f14709n;

    /* renamed from: o */
    public final Button f14710o;

    /* renamed from: p */
    public final TextView f14711p;

    private b(FrameLayout frameLayout, ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, MaterialButton materialButton2, ImageView imageView, FrameLayout frameLayout2, NestedScrollView nestedScrollView, TextView textView, ConstraintLayout constraintLayout4, LinearLayout linearLayout, MaterialButton materialButton3, TextView textView2, Button button, TextView textView3) {
        this.f14696a = frameLayout;
        this.f14697b = constraintLayout;
        this.f14698c = materialButton;
        this.f14699d = constraintLayout2;
        this.f14700e = constraintLayout3;
        this.f14701f = materialButton2;
        this.f14702g = imageView;
        this.f14703h = frameLayout2;
        this.f14704i = nestedScrollView;
        this.f14705j = textView;
        this.f14706k = constraintLayout4;
        this.f14707l = linearLayout;
        this.f14708m = materialButton3;
        this.f14709n = textView2;
        this.f14710o = button;
        this.f14711p = textView3;
    }

    public static b b(View view) {
        int i10 = j8.k.d_res_0x7f090062;
        ConstraintLayout constraintLayout = (ConstraintLayout) s1.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = j8.k.e_res_0x7f090063;
            MaterialButton materialButton = (MaterialButton) s1.b.a(view, i10);
            if (materialButton != null) {
                i10 = j8.k.f_res_0x7f090064;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) s1.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = j8.k.g_res_0x7f090065;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) s1.b.a(view, i10);
                    if (constraintLayout3 != null) {
                        i10 = j8.k.h_res_0x7f090066;
                        MaterialButton materialButton2 = (MaterialButton) s1.b.a(view, i10);
                        if (materialButton2 != null) {
                            i10 = j8.k.i_res_0x7f090067;
                            ImageView imageView = (ImageView) s1.b.a(view, i10);
                            if (imageView != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                i10 = j8.k.j_res_0x7f090069;
                                NestedScrollView nestedScrollView = (NestedScrollView) s1.b.a(view, i10);
                                if (nestedScrollView != null) {
                                    i10 = j8.k.k_res_0x7f09006a;
                                    TextView textView = (TextView) s1.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = j8.k.l_res_0x7f09006b;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) s1.b.a(view, i10);
                                        if (constraintLayout4 != null) {
                                            i10 = j8.k.m_res_0x7f09006c;
                                            LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = j8.k.n_res_0x7f09006d;
                                                MaterialButton materialButton3 = (MaterialButton) s1.b.a(view, i10);
                                                if (materialButton3 != null) {
                                                    i10 = j8.k.o_res_0x7f09006e;
                                                    TextView textView2 = (TextView) s1.b.a(view, i10);
                                                    if (textView2 != null) {
                                                        i10 = j8.k.p_res_0x7f09006f;
                                                        Button button = (Button) s1.b.a(view, i10);
                                                        if (button != null) {
                                                            i10 = j8.k.q_res_0x7f090070;
                                                            TextView textView3 = (TextView) s1.b.a(view, i10);
                                                            if (textView3 != null) {
                                                                return new b(frameLayout, constraintLayout, materialButton, constraintLayout2, constraintLayout3, materialButton2, imageView, frameLayout, nestedScrollView, textView, constraintLayout4, linearLayout, materialButton3, textView2, button, textView3);
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
        View inflate = layoutInflater.inflate(j8.l.b_res_0x7f0c001e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public FrameLayout a() {
        return this.f14696a;
    }
}
