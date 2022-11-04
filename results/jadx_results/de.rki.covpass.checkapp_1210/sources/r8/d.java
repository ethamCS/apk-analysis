package r8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.y;
import de.rki.covpass.commonapp.uielements.InfoElement;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import j8.n;
import java.util.List;
import k7.z;
import k8.o;
import kotlin.Metadata;
import m7.v;
import org.conscrypt.BuildConfig;
import s4.b1;
import s4.l0;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\t\u001a\u00020\u0002R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020+008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lr8/d;", "Lj8/f;", "Ltb/e0;", "v2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "K2", "Lk8/o;", "binding$delegate", "Lkc/c;", "w2", "()Lk8/o;", "binding", BuildConfig.FLAVOR, "G2", "()I", "titleRes", "z2", "imageRes", "x2", "buttonTextRes", BuildConfig.FLAVOR, "y2", "()Ljava/util/List;", "contentItemsRes", "termsOfUseTitle", "Ljava/lang/Integer;", "F2", "()Ljava/lang/Integer;", "termsOfUseIcon", "B2", "termsOfUseMessage", "E2", "termsOfUseLink", "C2", "Landroid/view/View$OnClickListener;", "termsOfUseLinkEvent", "Landroid/view/View$OnClickListener;", "D2", "()Landroid/view/View$OnClickListener;", BuildConfig.FLAVOR, "showTermsOfUse", "Z", "A2", "()Z", "Ls4/l0;", "isScrolledToBottom", "Ls4/l0;", "H2", "()Ls4/l0;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class d extends j8.f {

    /* renamed from: c5 */
    static final /* synthetic */ oc.k<Object>[] f20494c5 = {k0.g(new e0(d.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/OnboardingConsentBinding;", 0))};
    private final Integer U4;
    private final Integer V4;
    private final Integer W4;
    private final Integer X4;
    private final View.OnClickListener Y4;
    private final boolean Z4;

    /* renamed from: a5 */
    private final kc.c f20495a5 = z.b(this, a.Y3, null, null, 6, null);

    /* renamed from: b5 */
    private final l0<Boolean> f20496b5 = b1.b(Boolean.FALSE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, o> {
        public static final a Y3 = new a();

        a() {
            super(3, o.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/OnboardingConsentBinding;", 0);
        }

        public final o i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return o.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ o s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"r8/d$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            t.e(view, "host");
            t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    public d() {
        super(0, 1, null);
    }

    public static final void I2(d dVar, View view) {
        t.e(dVar, "this$0");
        v.w(m7.g.b(dVar, 0, 1, null), new m(), false, 2, null);
    }

    public static final void J2(d dVar, ScrollView scrollView) {
        t.e(dVar, "this$0");
        t.e(scrollView, "$this_run");
        l0<Boolean> l0Var = dVar.f20496b5;
        boolean z10 = false;
        if (scrollView.getChildAt(0).getBottom() <= scrollView.getHeight() + scrollView.getScrollY()) {
            z10 = true;
        }
        l0Var.setValue(Boolean.valueOf(z10));
    }

    public static final void L2(ScrollView scrollView) {
        t.e(scrollView, "$this_run");
        scrollView.fullScroll(130);
    }

    private final void v2() {
        for (Number number : y2()) {
            int intValue = number.intValue();
            View inflate = d0().inflate(j8.l.p_res_0x7f0c0078, (ViewGroup) w2().f14799b, false);
            ((TextView) inflate.findViewById(j8.k.A)).setText(u0(intValue));
            w2().f14799b.addView(inflate);
        }
    }

    private final o w2() {
        return (o) this.f20495a5.a(this, f20494c5[0]);
    }

    public boolean A2() {
        return this.Z4;
    }

    public Integer B2() {
        return this.V4;
    }

    public Integer C2() {
        return this.X4;
    }

    public View.OnClickListener D2() {
        return this.Y4;
    }

    public Integer E2() {
        return this.W4;
    }

    public Integer F2() {
        return this.U4;
    }

    public abstract int G2();

    public final l0<Boolean> H2() {
        return this.f20496b5;
    }

    public final void K2() {
        final ScrollView scrollView = w2().f14804g;
        scrollView.post(new Runnable() { // from class: r8.c
            @Override // java.lang.Runnable
            public final void run() {
                d.L2(scrollView);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        String str;
        t.e(view, "view");
        super.o1(view, bundle);
        y.o0(w2().f14802e, new b());
        w2().f14802e.setText(G2());
        w2().f14800c.setImageResource(z2());
        v2();
        TextView textView = w2().f14801d;
        textView.setText(u0(n.N));
        textView.setOnClickListener(new View.OnClickListener() { // from class: r8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.I2(d.this, view2);
            }
        });
        final ScrollView scrollView = w2().f14804g;
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: r8.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                d.J2(d.this, scrollView);
            }
        });
        if (A2()) {
            InfoElement infoElement = w2().f14805h;
            t.d(infoElement, "binding.onboardingTermsOfUse");
            infoElement.setVisibility(0);
            InfoElement infoElement2 = w2().f14805h;
            t.d(infoElement2, "binding.onboardingTermsOfUse");
            Integer F2 = F2();
            if (F2 == null || (str = u0(F2.intValue())) == null) {
                str = BuildConfig.FLAVOR;
            }
            String str2 = str;
            Integer E2 = E2();
            String u02 = E2 != null ? u0(E2.intValue()) : null;
            Integer valueOf = Integer.valueOf(j8.o.a_res_0x7f110118);
            Integer C2 = C2();
            w8.a.c(infoElement2, str2, u02, valueOf, C2 != null ? u0(C2.intValue()) : null, B2(), D2(), Integer.valueOf(j8.o.f14096c), null, null, null, null, null, 3968, null);
        }
    }

    public abstract int x2();

    public abstract List<Integer> y2();

    public abstract int z2();
}
