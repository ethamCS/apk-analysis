package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class c implements s1.a {

    /* renamed from: a */
    private final LinearLayout f25897a;

    /* renamed from: b */
    public final TextView f25898b;

    /* renamed from: c */
    public final TextView f25899c;

    private c(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f25897a = linearLayout;
        this.f25898b = textView;
        this.f25899c = textView2;
    }

    public static c b(View view) {
        int i10 = x7.b.i0_res_0x7f0901f7;
        TextView textView = (TextView) s1.b.a(view, i10);
        if (textView != null) {
            i10 = x7.b.j0_res_0x7f0901f8;
            TextView textView2 = (TextView) s1.b.a(view, i10);
            if (textView2 != null) {
                return new c((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.c_res_0x7f0c007d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public LinearLayout a() {
        return this.f25897a;
    }
}
