package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement;
/* loaded from: classes.dex */
public final class g implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25921a;

    /* renamed from: b */
    public final ValidationResult2gInfoElement f25922b;

    /* renamed from: c */
    public final TextView f25923c;

    /* renamed from: d */
    public final TextView f25924d;

    /* renamed from: e */
    public final ValidationResult2gInfoElement f25925e;

    /* renamed from: f */
    public final TextView f25926f;

    /* renamed from: g */
    public final TextView f25927g;

    /* renamed from: h */
    public final TextView f25928h;

    /* renamed from: i */
    public final TextView f25929i;

    private g(ConstraintLayout constraintLayout, ValidationResult2gInfoElement validationResult2gInfoElement, TextView textView, TextView textView2, ValidationResult2gInfoElement validationResult2gInfoElement2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f25921a = constraintLayout;
        this.f25922b = validationResult2gInfoElement;
        this.f25923c = textView;
        this.f25924d = textView2;
        this.f25925e = validationResult2gInfoElement2;
        this.f25926f = textView3;
        this.f25927g = textView4;
        this.f25928h = textView5;
        this.f25929i = textView6;
    }

    public static g b(View view) {
        int i10 = x7.b.t0_res_0x7f09029b;
        ValidationResult2gInfoElement validationResult2gInfoElement = (ValidationResult2gInfoElement) s1.b.a(view, i10);
        if (validationResult2gInfoElement != null) {
            i10 = x7.b.u0_res_0x7f09029c;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = x7.b.v0_res_0x7f09029d;
                TextView textView2 = (TextView) s1.b.a(view, i10);
                if (textView2 != null) {
                    i10 = x7.b.w0_res_0x7f09029e;
                    ValidationResult2gInfoElement validationResult2gInfoElement2 = (ValidationResult2gInfoElement) s1.b.a(view, i10);
                    if (validationResult2gInfoElement2 != null) {
                        i10 = x7.b.x0_res_0x7f09029f;
                        TextView textView3 = (TextView) s1.b.a(view, i10);
                        if (textView3 != null) {
                            i10 = x7.b.y0_res_0x7f0902a0;
                            TextView textView4 = (TextView) s1.b.a(view, i10);
                            if (textView4 != null) {
                                i10 = x7.b.z0_res_0x7f0902a1;
                                TextView textView5 = (TextView) s1.b.a(view, i10);
                                if (textView5 != null) {
                                    i10 = x7.b.A0_res_0x7f0902a2;
                                    TextView textView6 = (TextView) s1.b.a(view, i10);
                                    if (textView6 != null) {
                                        return new g((ConstraintLayout) view, validationResult2gInfoElement, textView, textView2, validationResult2gInfoElement2, textView3, textView4, textView5, textView6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.h_res_0x7f0c0098, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25921a;
    }
}
