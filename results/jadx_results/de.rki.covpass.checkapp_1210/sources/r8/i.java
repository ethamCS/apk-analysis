package r8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.y;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import k7.z;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lr8/i;", "Lj8/f;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "Lk8/q;", "binding$delegate", "Lkc/c;", "s2", "()Lk8/q;", "binding", BuildConfig.FLAVOR, "w2", "()I", "titleRes", "v2", "textRes", "u2", "imageRes", "t2", "buttonTextRes", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class i extends j8.f {
    static final /* synthetic */ oc.k<Object>[] V4 = {k0.g(new e0(i.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/OnboardingInfoBinding;", 0))};
    private final kc.c U4 = z.b(this, a.Y3, null, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.q> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.q.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/OnboardingInfoBinding;", 0);
        }

        public final k8.q i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return k8.q.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.q s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"r8/i$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
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

    public i() {
        super(0, 1, null);
    }

    private final k8.q s2() {
        return (k8.q) this.U4.a(this, V4[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        y.o0(s2().f14814c, new b());
        s2().f14814c.setText(w2());
        s2().f14815d.setText(v2());
        s2().f14813b.setImageResource(u2());
    }

    public abstract int t2();

    public abstract int u2();

    public abstract int v2();

    public abstract int w2();
}
