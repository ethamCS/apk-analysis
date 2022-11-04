package o8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import de.rki.covpass.commonapp.license.models.OpenSourceItem;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import hc.k0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.SerializersKt;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lo8/u;", "Lj8/f;", "Ltb/e0;", "t2", "u2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Lk8/s;", "binding$delegate", "Lkc/c;", "s2", "()Lk8/s;", "binding", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class u extends j8.f {
    static final /* synthetic */ oc.k<Object>[] X4 = {k0.g(new hc.e0(u.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/OpenSourceLicenseBinding;", 0))};
    private final lf.a U4 = lf.l.b(null, b.f17706c, 1, null);
    private final kc.c V4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int W4 = j8.n.h_res_0x7f100080;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.s> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.s.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/OpenSourceLicenseBinding;", 0);
        }

        public final k8.s i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.s.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.s s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llf/c;", "Ltb/e0;", "b", "(Llf/c;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.l<lf.c, tb.e0> {

        /* renamed from: c */
        public static final b f17706c = new b();

        b() {
            super(1);
        }

        public final void b(lf.c cVar) {
            hc.t.e(cVar, "$this$Json");
            cVar.e(true);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(lf.c cVar) {
            b(cVar);
            return tb.e0.f22152a;
        }
    }

    public u() {
        super(0, 1, null);
    }

    private final k8.s s2() {
        return (k8.s) this.V4.a(this, X4[0]);
    }

    private final void t2() {
        CenteredTitleToolbar centeredTitleToolbar = s2().f14822c;
        hc.t.d(centeredTitleToolbar, "binding.openSourceLicenseToolbar");
        k7.j.b(this, centeredTitleToolbar);
        androidx.fragment.app.j F = F();
        androidx.appcompat.app.c cVar = F instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F : null;
        if (cVar != null) {
            androidx.appcompat.app.a x02 = cVar.x0();
            if (x02 != null) {
                x02.t(false);
                x02.s(true);
                x02.v(j8.j.a_res_0x7f07005e);
                x02.u(j8.n.d_res_0x7f10007c);
            }
            s2().f14822c.setTitle(cVar.getString(j8.n.P_res_0x7f1000d2));
        }
    }

    private final void u2() {
        CharSequence S0;
        List<OpenSourceItem> n10;
        S0 = bf.y.S0(z9.a.a(k7.b.b(this).b(), "open_source_licenses.json"));
        String obj = S0.toString();
        n10 = ub.u.n(new OpenSourceItem(null, u0(j8.n.C_res_0x7f1000b4), null, null, null, null, null, null));
        lf.a aVar = this.U4;
        n10.addAll((Collection) aVar.c(SerializersKt.serializer(aVar.a(), k0.k(Collection.class, oc.p.Companion.d(k0.j(OpenSourceItem.class)))), obj));
        q8.a aVar2 = new q8.a(this);
        aVar2.z(n10);
        RecyclerView recyclerView = s2().f14821b;
        hc.t.d(recyclerView, "binding.openSourceLicenseRecyclerView");
        aVar2.w(recyclerView);
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.W4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        t2();
        u2();
    }
}
