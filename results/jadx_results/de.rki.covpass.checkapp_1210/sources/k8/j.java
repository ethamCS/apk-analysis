package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
/* loaded from: classes.dex */
public final class j implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14750a;

    /* renamed from: b */
    public final TextView f14751b;

    /* renamed from: c */
    public final ExpertModeToggleElement f14752c;

    /* renamed from: d */
    public final CenteredTitleToolbar f14753d;

    private j(LinearLayout linearLayout, TextView textView, ExpertModeToggleElement expertModeToggleElement, CenteredTitleToolbar centeredTitleToolbar) {
        this.f14750a = linearLayout;
        this.f14751b = textView;
        this.f14752c = expertModeToggleElement;
        this.f14753d = centeredTitleToolbar;
    }

    public static j b(View view) {
        int i10 = j8.k.G_res_0x7f0900eb;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = j8.k.H_res_0x7f0900ec;
            ExpertModeToggleElement expertModeToggleElement = (ExpertModeToggleElement) s1.b.a(view, i10);
            if (expertModeToggleElement != null) {
                i10 = j8.k.K_res_0x7f0900ef;
                CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
                if (centeredTitleToolbar != null) {
                    return new j((LinearLayout) view, textView, expertModeToggleElement, centeredTitleToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.j_res_0x7f0c003b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14750a;
    }
}
