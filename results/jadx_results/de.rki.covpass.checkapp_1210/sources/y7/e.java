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
public final class e implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25905a;

    /* renamed from: b */
    public final ValidationResult2gCertificateElement f25906b;

    /* renamed from: c */
    public final ValidationResult2gInfoElement f25907c;

    /* renamed from: d */
    public final LinearLayout f25908d;

    /* renamed from: e */
    public final TextView f25909e;

    /* renamed from: f */
    public final ValidationResult2gCertificateElement f25910f;

    /* renamed from: g */
    public final TextView f25911g;

    private e(ConstraintLayout constraintLayout, ValidationResult2gCertificateElement validationResult2gCertificateElement, ValidationResult2gInfoElement validationResult2gInfoElement, LinearLayout linearLayout, TextView textView, ValidationResult2gCertificateElement validationResult2gCertificateElement2, TextView textView2) {
        this.f25905a = constraintLayout;
        this.f25906b = validationResult2gCertificateElement;
        this.f25907c = validationResult2gInfoElement;
        this.f25908d = linearLayout;
        this.f25909e = textView;
        this.f25910f = validationResult2gCertificateElement2;
        this.f25911g = textView2;
    }

    public static e b(View view) {
        int i10 = x7.b.s0_res_0x7f09029a;
        ValidationResult2gCertificateElement validationResult2gCertificateElement = (ValidationResult2gCertificateElement) s1.b.a(view, i10);
        if (validationResult2gCertificateElement != null) {
            i10 = x7.b.B0_res_0x7f0902a3;
            ValidationResult2gInfoElement validationResult2gInfoElement = (ValidationResult2gInfoElement) s1.b.a(view, i10);
            if (validationResult2gInfoElement != null) {
                i10 = x7.b.C0_res_0x7f0902a4;
                LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = x7.b.D0_res_0x7f0902a5;
                    TextView textView = (TextView) s1.b.a(view, i10);
                    if (textView != null) {
                        i10 = x7.b.E0_res_0x7f0902a6;
                        ValidationResult2gCertificateElement validationResult2gCertificateElement2 = (ValidationResult2gCertificateElement) s1.b.a(view, i10);
                        if (validationResult2gCertificateElement2 != null) {
                            i10 = x7.b.F0_res_0x7f0902a7;
                            TextView textView2 = (TextView) s1.b.a(view, i10);
                            if (textView2 != null) {
                                return new e((ConstraintLayout) view, validationResult2gCertificateElement, validationResult2gInfoElement, linearLayout, textView, validationResult2gCertificateElement2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.f_res_0x7f0c0096, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25905a;
    }
}
