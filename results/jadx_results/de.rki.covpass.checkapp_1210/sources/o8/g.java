package o8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
import hc.k0;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lo8/g;", "Lj8/f;", "Ltb/e0;", "x2", "w2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Lk8/j;", "binding$delegate", "Lkc/c;", "u2", "()Lk8/j;", "binding", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g extends j8.f {
    static final /* synthetic */ oc.k<Object>[] W4 = {k0.g(new hc.e0(g.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/ExpertModeSettingsBinding;", 0))};
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int V4 = j8.n.k_res_0x7f100090;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.j> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.j.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/ExpertModeSettingsBinding;", 0);
        }

        public final k8.j i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.j.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.j s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.ExpertModeSettingsFragment$updateRulesState$1", f = "ExpertModeSettingsFragment.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17690y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17690y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<Boolean> c11 = l8.b.b(g.this).b().c();
                Boolean a10 = zb.b.a(g.this.u2().f14752c.b());
                this.f17690y = 1;
                if (v0.a.a(c11, a10, false, this, 2, null) == c10) {
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
            return ((b) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    public g() {
        super(0, 1, null);
    }

    public final k8.j u2() {
        return (k8.j) this.U4.a(this, W4[0]);
    }

    public static final void v2(ExpertModeToggleElement expertModeToggleElement, g gVar, View view) {
        hc.t.e(expertModeToggleElement, "$this_apply");
        hc.t.e(gVar, "this$0");
        expertModeToggleElement.d(!gVar.u2().f14752c.b());
        gVar.x2();
    }

    private final void w2() {
        CenteredTitleToolbar centeredTitleToolbar = u2().f14753d;
        hc.t.d(centeredTitleToolbar, "binding.expertModeToolbar");
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
            u2().f14753d.setTitle(j8.n.f14094o0);
        }
    }

    private final void x2() {
        o2(new b(null));
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.V4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        w2();
        boolean booleanValue = l8.b.b(this).b().c().getValue().booleanValue();
        u2().f14751b.setText(j8.n.n0_res_0x7f1001a3);
        final ExpertModeToggleElement expertModeToggleElement = u2().f14752c;
        expertModeToggleElement.c(Integer.valueOf(j8.n.p0_res_0x7f1001ae));
        expertModeToggleElement.d(booleanValue);
        expertModeToggleElement.setOnClickListener(new View.OnClickListener() { // from class: o8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.v2(ExpertModeToggleElement.this, this, view2);
            }
        });
    }
}
