package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class e implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f14718a;

    /* renamed from: b */
    public final AppCompatCheckBox f14719b;

    /* renamed from: c */
    public final TextView f14720c;

    /* renamed from: d */
    public final TextView f14721d;

    private e(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, TextView textView, TextView textView2) {
        this.f14718a = constraintLayout;
        this.f14719b = appCompatCheckBox;
        this.f14720c = textView;
        this.f14721d = textView2;
    }

    public static e b(View view) {
        int i10 = j8.k.u_res_0x7f090084;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) s1.b.a(view, i10);
        if (appCompatCheckBox != null) {
            i10 = j8.k.v_res_0x7f090085;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = j8.k.w_res_0x7f090086;
                TextView textView2 = (TextView) s1.b.a(view, i10);
                if (textView2 != null) {
                    return new e((ConstraintLayout) view, appCompatCheckBox, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static e e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.e_res_0x7f0c0021, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f14718a;
    }
}
