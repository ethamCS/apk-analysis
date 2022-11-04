package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import de.rki.covpass.commonapp.uielements.RoundImageButton;
/* loaded from: classes.dex */
public final class p implements s1.a {

    /* renamed from: a */
    private final RelativeLayout f14806a;

    /* renamed from: b */
    public final ConstraintLayout f14807b;

    /* renamed from: c */
    public final MaterialButton f14808c;

    /* renamed from: d */
    public final RoundImageButton f14809d;

    /* renamed from: e */
    public final TabLayout f14810e;

    /* renamed from: f */
    public final ViewPager2 f14811f;

    private p(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, MaterialButton materialButton, RoundImageButton roundImageButton, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f14806a = relativeLayout;
        this.f14807b = constraintLayout;
        this.f14808c = materialButton;
        this.f14809d = roundImageButton;
        this.f14810e = tabLayout;
        this.f14811f = viewPager2;
    }

    public static p b(View view) {
        int i10 = j8.k.g_res_0x7f090065;
        ConstraintLayout constraintLayout = (ConstraintLayout) s1.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = j8.k.r0_res_0x7f0901b2;
            MaterialButton materialButton = (MaterialButton) s1.b.a(view, i10);
            if (materialButton != null) {
                i10 = j8.k.w0_res_0x7f0901b7;
                RoundImageButton roundImageButton = (RoundImageButton) s1.b.a(view, i10);
                if (roundImageButton != null) {
                    i10 = j8.k.x0_res_0x7f0901b9;
                    TabLayout tabLayout = (TabLayout) s1.b.a(view, i10);
                    if (tabLayout != null) {
                        i10 = j8.k.z0_res_0x7f0901bb;
                        ViewPager2 viewPager2 = (ViewPager2) s1.b.a(view, i10);
                        if (viewPager2 != null) {
                            return new p((RelativeLayout) view, constraintLayout, materialButton, roundImageButton, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.q_res_0x7f0c0079, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout a() {
        return this.f14806a;
    }
}
