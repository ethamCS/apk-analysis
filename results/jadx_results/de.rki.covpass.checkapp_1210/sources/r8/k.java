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
import k8.u;
import kotlin.Metadata;
import m7.v;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH$J\b\u0010\n\u001a\u00020\bH$J\b\u0010\u000b\u001a\u00020\bH$J\b\u0010\f\u001a\u00020\bH$J\b\u0010\r\u001a\u00020\bH$J\b\u0010\u000f\u001a\u00020\u000eH$R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lr8/k;", "Lj8/f;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", BuildConfig.FLAVOR, "w2", "z2", "u2", "v2", "x2", "Lm7/j;", "y2", "Lk8/u;", "binding$delegate", "Lkc/c;", "t2", "()Lk8/u;", "binding", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class k extends j8.f {
    static final /* synthetic */ oc.k<Object>[] V4 = {k0.g(new e0(k.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/WelcomeBinding;", 0))};
    private final kc.c U4 = z.b(this, a.Y3, null, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, u> {
        public static final a Y3 = new a();

        a() {
            super(3, u.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/WelcomeBinding;", 0);
        }

        public final u i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return u.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ u s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"r8/k$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
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

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"r8/k$c", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            t.e(view, "host");
            t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    public k() {
        super(0, 1, null);
    }

    public static final void A2(k kVar, View view) {
        t.e(kVar, "this$0");
        v.w(m7.g.b(kVar, 0, 1, null), kVar.y2(), false, 2, null);
    }

    private final u t2() {
        return (u) this.U4.a(this, V4[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        y.o0(t2().f14832f, new b());
        y.o0(t2().f14829c, new c());
        t2().f14832f.setText(w2());
        t2().f14836j.setText(z2());
        t2().f14829c.setText(u2());
        t2().f14831e.setText(v2());
        t2().f14833g.setImageResource(x2());
        t2().f14835i.setOnClickListener(new View.OnClickListener() { // from class: r8.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.A2(k.this, view2);
            }
        });
    }

    protected abstract int u2();

    protected abstract int v2();

    protected abstract int w2();

    protected abstract int x2();

    protected abstract m7.j y2();

    protected abstract int z2();
}
