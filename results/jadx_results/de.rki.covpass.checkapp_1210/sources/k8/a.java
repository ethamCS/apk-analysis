package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
/* loaded from: classes.dex */
public final class a implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14692a;

    /* renamed from: b */
    public final ExpertModeToggleElement f14693b;

    /* renamed from: c */
    public final TextView f14694c;

    /* renamed from: d */
    public final CenteredTitleToolbar f14695d;

    private a(LinearLayout linearLayout, ExpertModeToggleElement expertModeToggleElement, TextView textView, CenteredTitleToolbar centeredTitleToolbar) {
        this.f14692a = linearLayout;
        this.f14693b = expertModeToggleElement;
        this.f14694c = textView;
        this.f14695d = centeredTitleToolbar;
    }

    public static a b(View view) {
        int i10 = j8.k.a_res_0x7f090030;
        ExpertModeToggleElement expertModeToggleElement = (ExpertModeToggleElement) s1.b.a(view, i10);
        if (expertModeToggleElement != null) {
            i10 = j8.k.b_res_0x7f090031;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = j8.k.k0_res_0x7f090136;
                CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
                if (centeredTitleToolbar != null) {
                    return new a((LinearLayout) view, expertModeToggleElement, textView, centeredTitleToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.a_res_0x7f0c001c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14692a;
    }
}
