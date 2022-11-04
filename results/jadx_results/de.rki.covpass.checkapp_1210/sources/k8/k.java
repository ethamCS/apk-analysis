package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
/* loaded from: classes.dex */
public final class k implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f14754a;

    /* renamed from: b */
    public final SwitchMaterial f14755b;

    /* renamed from: c */
    public final TextView f14756c;

    private k(ConstraintLayout constraintLayout, SwitchMaterial switchMaterial, TextView textView) {
        this.f14754a = constraintLayout;
        this.f14755b = switchMaterial;
        this.f14756c = textView;
    }

    public static k b(View view) {
        int i10 = j8.k.I_res_0x7f0900ed;
        SwitchMaterial switchMaterial = (SwitchMaterial) s1.b.a(view, i10);
        if (switchMaterial != null) {
            i10 = j8.k.J_res_0x7f0900ee;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                return new k((ConstraintLayout) view, switchMaterial, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static k d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static k e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.k_res_0x7f0c003c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f14754a;
    }
}
