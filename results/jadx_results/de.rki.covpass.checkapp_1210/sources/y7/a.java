package y7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.rki.covpass.commonapp.uielements.CheckContextCheckboxElement;
/* loaded from: classes.dex */
public final class a implements s1.a {

    /* renamed from: a */
    private final ConstraintLayout f25866a;

    /* renamed from: b */
    public final CheckContextCheckboxElement f25867b;

    /* renamed from: c */
    public final TextView f25868c;

    /* renamed from: d */
    public final ImageView f25869d;

    /* renamed from: e */
    public final CheckContextCheckboxElement f25870e;

    /* renamed from: f */
    public final TextView f25871f;

    /* renamed from: g */
    public final TextView f25872g;

    private a(ConstraintLayout constraintLayout, CheckContextCheckboxElement checkContextCheckboxElement, TextView textView, ImageView imageView, CheckContextCheckboxElement checkContextCheckboxElement2, TextView textView2, TextView textView3) {
        this.f25866a = constraintLayout;
        this.f25867b = checkContextCheckboxElement;
        this.f25868c = textView;
        this.f25869d = imageView;
        this.f25870e = checkContextCheckboxElement2;
        this.f25871f = textView2;
        this.f25872g = textView3;
    }

    public static a b(View view) {
        int i10 = x7.b.a_res_0x7f090087;
        CheckContextCheckboxElement checkContextCheckboxElement = (CheckContextCheckboxElement) s1.b.a(view, i10);
        if (checkContextCheckboxElement != null) {
            i10 = x7.b.b_res_0x7f090088;
            TextView textView = (TextView) s1.b.a(view, i10);
            if (textView != null) {
                i10 = x7.b.c_res_0x7f090089;
                ImageView imageView = (ImageView) s1.b.a(view, i10);
                if (imageView != null) {
                    i10 = x7.b.d_res_0x7f09008a;
                    CheckContextCheckboxElement checkContextCheckboxElement2 = (CheckContextCheckboxElement) s1.b.a(view, i10);
                    if (checkContextCheckboxElement2 != null) {
                        i10 = x7.b.e_res_0x7f09008b;
                        TextView textView2 = (TextView) s1.b.a(view, i10);
                        if (textView2 != null) {
                            i10 = x7.b.f_res_0x7f09008c;
                            TextView textView3 = (TextView) s1.b.a(view, i10);
                            if (textView3 != null) {
                                return new a((ConstraintLayout) view, checkContextCheckboxElement, textView, imageView, checkContextCheckboxElement2, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(x7.c.a_res_0x7f0c0022, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout a() {
        return this.f25866a;
    }
}
