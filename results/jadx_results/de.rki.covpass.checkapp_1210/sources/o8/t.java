package o8;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import hc.k0;
import java.util.Locale;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010\n\u001a\u00020\tH$J\b\u0010\u000b\u001a\u00020\tH$J\b\u0010\f\u001a\u00020\tH$J\b\u0010\u000e\u001a\u00020\rH$R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lo8/t;", "Lj8/f;", "Ltb/e0;", "T2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", BuildConfig.FLAVOR, "F2", "G2", "E2", BuildConfig.FLAVOR, "H2", "Lk8/n;", "binding$delegate", "Lkc/c;", "D2", "()Lk8/n;", "binding", "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class t extends j8.f {
    static final /* synthetic */ oc.k<Object>[] W4 = {k0.g(new hc.e0(t.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/InformationBinding;", 0))};
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final int V4 = j8.n.f_res_0x7f10007e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.n> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.n.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/InformationBinding;", 0);
        }

        public final k8.n i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.n.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.n s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public t() {
        super(0, 1, null);
    }

    private final k8.n D2() {
        return (k8.n) this.U4.a(this, W4[0]);
    }

    public static final void I2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        tVar.k2(new Intent("android.intent.action.VIEW", Uri.parse(tVar.u0(tVar.E2()))));
    }

    public static final void J2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new e(), false, 2, null);
    }

    public static final void K2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new e0(tVar.H2()), false, 2, null);
    }

    public static final void L2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        tVar.k2(new Intent("android.intent.action.VIEW", Uri.parse(tVar.u0(j8.n.j0_res_0x7f100123))));
    }

    public static final void M2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new h(), false, 2, null);
    }

    public static final void N2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new c(), false, 2, null);
    }

    public static final void O2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new i0(), false, 2, null);
    }

    public static final void P2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        tVar.k2(new Intent("android.intent.action.VIEW", Uri.parse(tVar.u0(tVar.F2()))));
    }

    public static final void Q2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new r8.m(), false, 2, null);
    }

    public static final void R2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        tVar.k2(new Intent("android.intent.action.VIEW", Uri.parse(tVar.u0(tVar.G2()))));
    }

    public static final void S2(t tVar, View view) {
        hc.t.e(tVar, "this$0");
        m7.v.w(m7.g.b(tVar, 0, 1, null), new v(), false, 2, null);
    }

    private final void T2() {
        CenteredTitleToolbar centeredTitleToolbar = D2().f14797x;
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
                x02.u(j8.n.c_res_0x7f10007b);
            }
            D2().f14797x.setTitle(j8.n.I_res_0x7f1000c2);
        }
    }

    protected abstract int E2();

    protected abstract int F2();

    protected abstract int G2();

    protected abstract boolean H2();

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.V4);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid", "SetTextI18n"})
    public void o1(View view, Bundle bundle) {
        String E;
        int i10;
        TextView textView;
        hc.t.e(view, "view");
        super.o1(view, bundle);
        T2();
        TextView textView2 = D2().f14776c;
        int i11 = j8.n.U_res_0x7f1000d7;
        textView2.setText(v0(i11, k7.c.a()));
        TextView textView3 = D2().f14776c;
        String a10 = k7.c.a();
        String u02 = u0(j8.n.j_res_0x7f100085);
        hc.t.d(u02, "getString(R.string.acces…version_number_delimiter)");
        E = bf.x.E(a10, ".", u02, false, 4, null);
        textView3.setContentDescription(v0(i11, E));
        if (hc.t.a(Locale.getDefault().getLanguage(), Locale.GERMAN.getLanguage())) {
            TextView textView4 = D2().f14790q;
            textView4.setText(j8.n.L_res_0x7f1000c8);
            textView4.setOnClickListener(new View.OnClickListener() { // from class: o8.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    t.I2(t.this, view2);
                }
            });
            TextView textView5 = D2().f14790q;
            hc.t.d(textView5, "binding.informationFieldEasyLanguage");
            textView5.setVisibility(0);
            View view2 = D2().f14775b;
            hc.t.d(view2, "binding.dividerEasyLanguage");
            view2.setVisibility(0);
        }
        TextView textView6 = D2().f14794u;
        textView6.setText(j8.n.O_res_0x7f1000cc);
        textView6.setOnClickListener(new View.OnClickListener() { // from class: o8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.P2(t.this, view3);
            }
        });
        TextView textView7 = D2().f14789p;
        textView7.setText(u0(j8.n.N));
        textView7.setOnClickListener(new View.OnClickListener() { // from class: o8.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.Q2(t.this, view3);
            }
        });
        TextView textView8 = D2().f14795v;
        textView8.setText(j8.n.K_res_0x7f1000c6);
        textView8.setOnClickListener(new View.OnClickListener() { // from class: o8.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.R2(t.this, view3);
            }
        });
        TextView textView9 = D2().f14796w;
        textView9.setText(u0(j8.n.P_res_0x7f1000d2));
        textView9.setOnClickListener(new View.OnClickListener() { // from class: o8.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.S2(t.this, view3);
            }
        });
        TextView textView10 = D2().f14783j;
        textView10.setText(j8.n.M_res_0x7f1000ca);
        textView10.setOnClickListener(new View.OnClickListener() { // from class: o8.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.J2(t.this, view3);
            }
        });
        TextView textView11 = D2().f14782i;
        textView11.setText(j8.n.Q_res_0x7f1000d3);
        textView11.setOnClickListener(new View.OnClickListener() { // from class: o8.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.K2(t.this, view3);
            }
        });
        TextView textView12 = D2().f14777d;
        textView12.setText(j8.n.J_res_0x7f1000c3);
        textView12.setOnClickListener(new View.OnClickListener() { // from class: o8.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                t.L2(t.this, view3);
            }
        });
        if (H2()) {
            LinearLayout linearLayout = D2().f14784k;
            hc.t.d(linearLayout, "binding.informationField…assCheckSettingsContainer");
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = D2().f14785l;
            hc.t.d(linearLayout2, "binding.informationField…WhatsNewSettingsContainer");
            linearLayout2.setVisibility(8);
            D2().f14791r.setOnClickListener(new View.OnClickListener() { // from class: o8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    t.M2(t.this, view3);
                }
            });
            D2().f14793t.setText(j8.n.s_res_0x7f1000a9);
            D2().f14792s.setText(l8.b.b(this).b().c().getValue().booleanValue() ? j8.n.r_res_0x7f1000a8 : j8.n.q_res_0x7f1000a7);
            LinearLayout linearLayout3 = D2().f14778e;
            hc.t.d(linearLayout3, "binding.informationFieldAcousticFeedbackContainer");
            linearLayout3.setVisibility(0);
            D2().f14779f.setOnClickListener(new View.OnClickListener() { // from class: o8.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    t.N2(t.this, view3);
                }
            });
            D2().f14781h.setText(j8.n.f14095u);
            textView = D2().f14780g;
            i10 = l8.b.b(this).a().a().getValue().booleanValue() ? j8.n.l0_res_0x7f10017c : j8.n.k0_res_0x7f10017a;
        } else {
            ConstraintLayout constraintLayout = D2().f14779f;
            hc.t.d(constraintLayout, "binding.informationFieldAcousticFeedbackLayout");
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout4 = D2().f14784k;
            hc.t.d(linearLayout4, "binding.informationField…assCheckSettingsContainer");
            linearLayout4.setVisibility(8);
            LinearLayout linearLayout5 = D2().f14785l;
            hc.t.d(linearLayout5, "binding.informationField…WhatsNewSettingsContainer");
            linearLayout5.setVisibility(0);
            D2().f14786m.setOnClickListener(new View.OnClickListener() { // from class: o8.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    t.O2(t.this, view3);
                }
            });
            D2().f14788o.setText(j8.n.w_res_0x7f1000ad);
            textView = D2().f14787n;
            i10 = l8.b.b(this).i().a().getValue().booleanValue() ? j8.n.r0_res_0x7f1001b4 : j8.n.q0_res_0x7f1001b3;
        }
        textView.setText(i10);
    }
}
