package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public final class r implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f14816a;

    /* renamed from: b */
    public final TextView f14817b;

    /* renamed from: c */
    public final TextView f14818c;

    /* renamed from: d */
    public final TextView f14819d;

    private r(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f14816a = constraintLayout;
        this.f14817b = textView;
        this.f14818c = textView2;
        this.f14819d = textView3;
    }

    public static r b(View view) {
        int i10 = j8.k.B_res_0x7f0900b1;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = j8.k.D_res_0x7f0900c1;
            TextView textView2 = (TextView) s1.b.a(view, i10);
            if (textView2 != null) {
                i10 = j8.k.W0;
                TextView textView3 = (TextView) s1.b.a(view, i10);
                if (textView3 != null) {
                    return new r((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.s_res_0x7f0c007b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f14816a;
    }
}
