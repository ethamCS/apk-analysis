package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.rki.covpass.checkapp.uielements.ValidationResult2gCertificateElement;
import de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement;
/* loaded from: classes.dex */
public final class i implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25937a;

    /* renamed from: b */
    public final ValidationResult2gCertificateElement f25938b;

    /* renamed from: c */
    public final ValidationResult2gInfoElement f25939c;

    /* renamed from: d */
    public final LinearLayout f25940d;

    /* renamed from: e */
    public final TextView f25941e;

    private i(ConstraintLayout constraintLayout, ValidationResult2gCertificateElement validationResult2gCertificateElement, ValidationResult2gInfoElement validationResult2gInfoElement, LinearLayout linearLayout, TextView textView) {
        this.f25937a = constraintLayout;
        this.f25938b = validationResult2gCertificateElement;
        this.f25939c = validationResult2gInfoElement;
        this.f25940d = linearLayout;
        this.f25941e = textView;
    }

    public static i b(View view) {
        int i10 = x7.b.o0_res_0x7f090296;
        ValidationResult2gCertificateElement validationResult2gCertificateElement = (ValidationResult2gCertificateElement) s1.b.a(view, i10);
        if (validationResult2gCertificateElement != null) {
            i10 = x7.b.p0_res_0x7f090297;
            ValidationResult2gInfoElement validationResult2gInfoElement = (ValidationResult2gInfoElement) s1.b.a(view, i10);
            if (validationResult2gInfoElement != null) {
                i10 = x7.b.q0_res_0x7f090298;
                LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = x7.b.r0_res_0x7f090299;
                    TextView textView = (TextView) s1.b.a(view, i10);
                    if (textView != null) {
                        return new i((ConstraintLayout) view, validationResult2gCertificateElement, validationResult2gInfoElement, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.j_res_0x7f0c009a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25937a;
    }
}
