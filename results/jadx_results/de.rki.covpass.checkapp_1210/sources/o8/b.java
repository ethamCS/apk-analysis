package o8;

import android.media.MediaPlayer;
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
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lo8/b;", "Lj8/f;", "Ltb/e0;", "y2", "x2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Lk8/a;", "binding$delegate", "Lkc/c;", "v2", "()Lk8/a;", "binding", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends j8.f {
    static final /* synthetic */ oc.k<Object>[] X4 = {k0.g(new hc.e0(b.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/AcousticFeedbackStatusBinding;", 0))};
    private MediaPlayer V4;
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int W4 = j8.n.o_res_0x7f10009c;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.a> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/AcousticFeedbackStatusBinding;", 0);
        }

        public final k8.a i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.a.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.a s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.AcousticFeedbackFragment$updateAcousticFeedbackState$1", f = "AcousticFeedbackFragment.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: o8.b$b */
    /* loaded from: classes.dex */
    public static final class C0270b extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0270b(xb.d<? super C0270b> dVar) {
            super(2, dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17655y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<Boolean> a10 = l8.b.b(b.this).a().a();
                Boolean a11 = zb.b.a(b.this.v2().f14693b.b());
                this.f17655y = 1;
                if (v0.a.a(a10, a11, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            if (b.this.v2().f14693b.b()) {
                MediaPlayer mediaPlayer = b.this.V4;
                if (mediaPlayer == null) {
                    hc.t.s("mp");
                    mediaPlayer = null;
                }
                mediaPlayer.start();
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((C0270b) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new C0270b(dVar);
        }
    }

    public b() {
        super(0, 1, null);
    }

    public final k8.a v2() {
        return (k8.a) this.U4.a(this, X4[0]);
    }

    public static final void w2(ExpertModeToggleElement expertModeToggleElement, b bVar, View view) {
        hc.t.e(expertModeToggleElement, "$this_apply");
        hc.t.e(bVar, "this$0");
        expertModeToggleElement.d(!bVar.v2().f14693b.b());
        bVar.y2();
    }

    private final void x2() {
        CenteredTitleToolbar centeredTitleToolbar = v2().f14695d;
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
                x02.u(j8.n.p_res_0x7f10009d);
            }
            v2().f14695d.setTitle(j8.n.f14095u);
        }
    }

    private final void y2() {
        o2(new C0270b(null));
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.W4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        x2();
        v2().f14694c.setText(u0(j8.n.t_res_0x7f1000aa));
        final ExpertModeToggleElement expertModeToggleElement = v2().f14693b;
        expertModeToggleElement.c(Integer.valueOf(j8.n.f14095u));
        expertModeToggleElement.d(l8.b.b(this).a().a().getValue().booleanValue());
        expertModeToggleElement.setOnClickListener(new View.OnClickListener() { // from class: o8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.w2(ExpertModeToggleElement.this, this, view2);
            }
        });
        MediaPlayer create = MediaPlayer.create(S1(), j8.m.a_res_0x7f0f0000);
        hc.t.d(create, "create(requireContext(),…ck_certificate_activated)");
        this.V4 = create;
    }
}
