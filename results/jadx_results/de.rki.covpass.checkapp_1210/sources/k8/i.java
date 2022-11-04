package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i implements s1.a {

    /* renamed from: a */
    private final TextView f14748a;

    /* renamed from: b */
    public final TextView f14749b;

    private i(TextView textView, TextView textView2) {
        this.f14748a = textView;
        this.f14749b = textView2;
    }

    public static i b(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new i(textView, textView);
    }

    public static i d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static i e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.i_res_0x7f0c003a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public TextView a() {
        return this.f14748a;
    }
}
