package f8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import k7.z;
import kotlin.Metadata;
import m7.v;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0014R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lf8/a;", "Lj8/e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "y2", "Lk8/d;", "binding$delegate", "Lkc/c;", "F2", "()Lk8/d;", "binding", BuildConfig.FLAVOR, "buttonTextRes", "I", "w2", "()Ljava/lang/Integer;", "announcementAccessibilityRes", "n2", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a extends j8.e {

    /* renamed from: c5 */
    static final /* synthetic */ oc.k<Object>[] f9890c5 = {k0.g(new e0(a.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/CameraDisclosurePopupContentBinding;", 0))};
    private final kc.c Z4 = z.b(this, C0145a.Y3, null, null, 6, null);

    /* renamed from: a5 */
    private final int f9891a5 = x7.e.h0_res_0x7f1001af;

    /* renamed from: b5 */
    private final int f9892b5 = x7.e.d_res_0x7f100095;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: f8.a$a */
    /* loaded from: classes.dex */
    /* synthetic */ class C0145a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.d> {
        public static final C0145a Y3 = new C0145a();

        C0145a() {
            super(3, k8.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/CameraDisclosurePopupContentBinding;", 0);
        }

        public final k8.d i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return k8.d.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.d s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    private final k8.d F2() {
        return (k8.d) this.Z4.a(this, f9890c5[0]);
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f9892b5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        v2().f14711p.setText(u0(x7.e.j0_res_0x7f1001b1));
        F2().f14716b.setText(u0(x7.e.i0_res_0x7f1001b0));
    }

    @Override // j8.e
    public Integer w2() {
        return Integer.valueOf(this.f9891a5);
    }

    @Override // j8.e
    protected void y2() {
        v.q(m7.g.b(this, 0, 1, null), false, 1, null);
        v.w(m7.g.b(this, 0, 1, null), new g(), false, 2, null);
    }
}
