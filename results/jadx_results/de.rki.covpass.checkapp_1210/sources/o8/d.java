package o8;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lo8/d;", "Lj8/f;", "Ltb/e0;", "t2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Lk8/g;", "binding$delegate", "Lkc/c;", "s2", "()Lk8/g;", "binding", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d extends j8.f {
    static final /* synthetic */ oc.k<Object>[] W4 = {k0.g(new hc.e0(d.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/ContactsBinding;", 0))};
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int V4 = j8.n.e_res_0x7f10007d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.g> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/ContactsBinding;", 0);
        }

        public final k8.g i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.g.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.g s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public d() {
        super(0, 1, null);
    }

    private final k8.g s2() {
        return (k8.g) this.U4.a(this, W4[0]);
    }

    private final void t2() {
        CenteredTitleToolbar centeredTitleToolbar = s2().f14740b;
        hc.t.d(centeredTitleToolbar, "binding.informationToolbar");
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
            s2().f14740b.setTitle(j8.n.M_res_0x7f1000ca);
        }
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.V4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        t2();
        s2().f14745g.setText(j8.n.z_res_0x7f1000b1);
        TextView textView = s2().f14742d;
        textView.setText(k7.w.d(j8.n.A_res_0x7f1000b2, new Object[0], false, 4, null));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        hc.t.d(textView, BuildConfig.FLAVOR);
        y8.e.a(textView);
        TextView textView2 = s2().f14743e;
        textView2.setText(k7.w.d(j8.n.B_res_0x7f1000b3, new Object[0], false, 4, null));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        hc.t.d(textView2, BuildConfig.FLAVOR);
        y8.e.a(textView2);
        s2().f14744f.setText(j8.n.x_res_0x7f1000af);
        TextView textView3 = s2().f14741c;
        textView3.setText(k7.w.d(j8.n.y_res_0x7f1000b0, new Object[0], false, 4, null));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        hc.t.d(textView3, BuildConfig.FLAVOR);
        y8.e.a(textView3);
    }
}
