package o8;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
import hc.k0;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lo8/h0;", "Lj8/f;", "Ltb/e0;", "x2", "w2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Lk8/v;", "binding$delegate", "Lkc/c;", "u2", "()Lk8/v;", "binding", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h0 extends j8.f {
    static final /* synthetic */ oc.k<Object>[] W4 = {k0.g(new hc.e0(h0.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/WhatsNewSettingsBinding;", 0))};
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int V4 = j8.n.i_res_0x7f100084;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.v> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.v.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/WhatsNewSettingsBinding;", 0);
        }

        public final k8.v i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.v.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.v s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"o8/h0$b", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", BuildConfig.FLAVOR, "url", "Ltb/e0;", "onPageFinished", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends WebViewClient {
        b() {
            h0.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            hc.t.e(webView, "view");
            hc.t.e(str, "url");
            LinearLayout linearLayout = h0.this.u2().f14839c;
            hc.t.d(linearLayout, "binding.loadingLayout");
            linearLayout.setVisibility(8);
            WebView webView2 = h0.this.u2().f14840d;
            hc.t.d(webView2, "binding.updateInfoWebView");
            webView2.setVisibility(0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.WhatsNewSettingsFragment$updatePopupNotificationSettings$1", f = "WhatsNewSettingsFragment.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17694y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            h0.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17694y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<Boolean> a10 = l8.b.b(h0.this).i().a();
                Boolean a11 = zb.b.a(h0.this.u2().f14842f.b());
                this.f17694y = 1;
                if (v0.a.a(a10, a11, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((c) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new c(dVar);
        }
    }

    public h0() {
        super(0, 1, null);
    }

    public final k8.v u2() {
        return (k8.v) this.U4.a(this, W4[0]);
    }

    public static final void v2(ExpertModeToggleElement expertModeToggleElement, h0 h0Var, View view) {
        hc.t.e(expertModeToggleElement, "$this_apply");
        hc.t.e(h0Var, "this$0");
        expertModeToggleElement.d(!h0Var.u2().f14842f.b());
        h0Var.x2();
    }

    private final void w2() {
        CenteredTitleToolbar centeredTitleToolbar = u2().f14843g;
        hc.t.d(centeredTitleToolbar, "binding.whatsNewSettingsToolbar");
        k7.j.b(this, centeredTitleToolbar);
        androidx.fragment.app.j F = F();
        androidx.appcompat.app.c cVar = F instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F : null;
        if (cVar != null) {
            androidx.appcompat.app.a x02 = cVar.x0();
            if (x02 != null) {
                x02.t(false);
                x02.s(true);
                x02.v(j8.j.a_res_0x7f07005e);
                x02.u(j8.n.a_res_0x7f100078);
            }
            u2().f14843g.setTitle(j8.n.R_res_0x7f1000d4);
        }
    }

    private final void x2() {
        o2(new c(null));
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.V4);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid"})
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        w2();
        boolean booleanValue = l8.b.b(this).i().a().getValue().booleanValue();
        u2().f14841e.setText(j8.n.v_res_0x7f1000ac);
        final ExpertModeToggleElement expertModeToggleElement = u2().f14842f;
        expertModeToggleElement.c(Integer.valueOf(j8.n.T_res_0x7f1000d6));
        expertModeToggleElement.d(booleanValue);
        expertModeToggleElement.setOnClickListener(new View.OnClickListener() { // from class: o8.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h0.v2(ExpertModeToggleElement.this, this, view2);
            }
        });
        u2().f14844h.setText(v0(j8.n.S_res_0x7f1000d5, k7.c.a()));
        LinearLayout linearLayout = u2().f14839c;
        hc.t.d(linearLayout, "binding.loadingLayout");
        linearLayout.setVisibility(0);
        WebView webView = u2().f14840d;
        hc.t.d(webView, "binding.updateInfoWebView");
        webView.setVisibility(8);
        u2().f14840d.setWebViewClient(new b());
        u2().f14840d.loadUrl(u0(j8.n.y0_res_0x7f1001da));
    }
}
