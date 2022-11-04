package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import de.rki.covpass.commonapp.uielements.RoundImageButton;
/* loaded from: classes.dex */
public final class l implements s1.a {

    /* renamed from: a */
    private final RelativeLayout f14757a;

    /* renamed from: b */
    public final PreviewView f14758b;

    /* renamed from: c */
    public final LottieAnimationView f14759c;

    /* renamed from: d */
    public final LinearLayout f14760d;

    /* renamed from: e */
    public final RoundImageButton f14761e;

    /* renamed from: f */
    public final RoundImageButton f14762f;

    /* renamed from: g */
    public final FrameLayout f14763g;

    /* renamed from: h */
    public final ConstraintLayout f14764h;

    /* renamed from: i */
    public final ToggleButton f14765i;

    /* renamed from: j */
    public final ToggleButton f14766j;

    /* renamed from: k */
    public final ImageView f14767k;

    /* renamed from: l */
    public final ToggleButton f14768l;

    private l(RelativeLayout relativeLayout, PreviewView previewView, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, RoundImageButton roundImageButton, RoundImageButton roundImageButton2, FrameLayout frameLayout, ConstraintLayout constraintLayout, ToggleButton toggleButton, ToggleButton toggleButton2, ImageView imageView, ToggleButton toggleButton3) {
        this.f14757a = relativeLayout;
        this.f14758b = previewView;
        this.f14759c = lottieAnimationView;
        this.f14760d = linearLayout;
        this.f14761e = roundImageButton;
        this.f14762f = roundImageButton2;
        this.f14763g = frameLayout;
        this.f14764h = constraintLayout;
        this.f14765i = toggleButton;
        this.f14766j = toggleButton2;
        this.f14767k = imageView;
        this.f14768l = toggleButton3;
    }

    public static l b(View view) {
        int i10 = j8.k.c_res_0x7f09005a;
        PreviewView previewView = (PreviewView) s1.b.a(view, i10);
        if (previewView != null) {
            i10 = j8.k.f14081l0;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) s1.b.a(view, i10);
            if (lottieAnimationView != null) {
                i10 = j8.k.f14083m0;
                LinearLayout linearLayout = (LinearLayout) s1.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = j8.k.D0_res_0x7f090207;
                    RoundImageButton roundImageButton = (RoundImageButton) s1.b.a(view, i10);
                    if (roundImageButton != null) {
                        i10 = j8.k.E0_res_0x7f090208;
                        RoundImageButton roundImageButton2 = (RoundImageButton) s1.b.a(view, i10);
                        if (roundImageButton2 != null) {
                            i10 = j8.k.F0_res_0x7f090209;
                            FrameLayout frameLayout = (FrameLayout) s1.b.a(view, i10);
                            if (frameLayout != null) {
                                i10 = j8.k.G0_res_0x7f09020a;
                                ConstraintLayout constraintLayout = (ConstraintLayout) s1.b.a(view, i10);
                                if (constraintLayout != null) {
                                    i10 = j8.k.H0;
                                    ToggleButton toggleButton = (ToggleButton) s1.b.a(view, i10);
                                    if (toggleButton != null) {
                                        i10 = j8.k.I0;
                                        ToggleButton toggleButton2 = (ToggleButton) s1.b.a(view, i10);
                                        if (toggleButton2 != null) {
                                            i10 = j8.k.J0;
                                            ImageView imageView = (ImageView) s1.b.a(view, i10);
                                            if (imageView != null) {
                                                i10 = j8.k.K0;
                                                ToggleButton toggleButton3 = (ToggleButton) s1.b.a(view, i10);
                                                if (toggleButton3 != null) {
                                                    return new l((RelativeLayout) view, previewView, lottieAnimationView, linearLayout, roundImageButton, roundImageButton2, frameLayout, constraintLayout, toggleButton, toggleButton2, imageView, toggleButton3);
                                                }
                                            }
                                        }
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

    public static l d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(j8.l.l_res_0x7f0c003d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout a() {
        return this.f14757a;
    }
}
