package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
/* loaded from: classes.dex */
public final class s implements s1.a {

    /* renamed from: a */
    private final LinearLayout f14820a;

    /* renamed from: b */
    public final RecyclerView f14821b;

    /* renamed from: c */
    public final CenteredTitleToolbar f14822c;

    private s(LinearLayout linearLayout, RecyclerView recyclerView, CenteredTitleToolbar centeredTitleToolbar) {
        this.f14820a = linearLayout;
        this.f14821b = recyclerView;
        this.f14822c = centeredTitleToolbar;
    }

    public static s b(View view) {
        int i10 = j8.k.A0_res_0x7f0901bc;
        RecyclerView recyclerView = (RecyclerView) s1.b.a(view, i10);
        if (recyclerView != null) {
            i10 = j8.k.B0_res_0x7f0901bd;
            CenteredTitleToolbar centeredTitleToolbar = (CenteredTitleToolbar) s1.b.a(view, i10);
            if (centeredTitleToolbar != null) {
                return new s((LinearLayout) view, recyclerView, centeredTitleToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.t_res_0x7f0c007c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f14820a;
    }
}
