package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class t implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f14823a;

    /* renamed from: b */
    public final TextView f14824b;

    /* renamed from: c */
    public final View f14825c;

    /* renamed from: d */
    public final TextView f14826d;

    private t(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2) {
        this.f14823a = constraintLayout;
        this.f14824b = textView;
        this.f14825c = view;
        this.f14826d = textView2;
    }

    public static t b(View view) {
        View a10;
        int i10 = j8.k.C_res_0x7f0900b9;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null && (a10 = s1.b.a(view, (i10 = j8.k.E_res_0x7f0900cf))) != null) {
            i10 = j8.k.W0;
            TextView textView2 = (TextView) s1.b.a(view, i10);
            if (textView2 != null) {
                return new t((ConstraintLayout) view, textView, a10, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.f14087u, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f14823a;
    }
}
