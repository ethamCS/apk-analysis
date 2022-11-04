package r8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import de.rki.covpass.commonapp.uielements.RoundImageButton;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import hc.v;
import k7.z;
import k8.p;
import kotlin.Metadata;
import s4.r0;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H$R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lr8/h;", "Lj8/f;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "Ll7/b;", "m", "w2", "Lk8/p;", "binding$delegate", "Lkc/c;", "x2", "()Lk8/p;", "binding", "Ly8/d;", "y2", "()Ly8/d;", "fragmentStateAdapter", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class h extends j8.f {
    static final /* synthetic */ oc.k<Object>[] V4 = {k0.g(new e0(h.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/OnboardingContainerBinding;", 0))};
    private final kc.c U4 = z.b(this, a.Y3, null, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, p> {
        public static final a Y3 = new a();

        a() {
            super(3, p.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/OnboardingContainerBinding;", 0);
        }

        public final p i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return p.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ p s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            h.this = r1;
        }

        public final void b(r0 r0Var) {
            MaterialButton materialButton;
            int i10;
            t.e(r0Var, "$this$autoRun");
            Fragment fragment = (Fragment) s4.d.a(r0Var, h.this.y2().T());
            int i11 = 4;
            if (fragment instanceof d) {
                d dVar = (d) fragment;
                Object a10 = s4.d.a(r0Var, dVar.H2());
                h hVar = h.this;
                boolean booleanValue = ((Boolean) a10).booleanValue();
                MaterialButton materialButton2 = hVar.x2().f14808c;
                t.d(materialButton2, "binding.onboardingContinueButton");
                materialButton2.setVisibility(booleanValue ^ true ? 4 : 0);
                RoundImageButton roundImageButton = hVar.x2().f14809d;
                t.d(roundImageButton, "binding.onboardingScrollDownButton");
                if (!booleanValue) {
                    i11 = 0;
                }
                roundImageButton.setVisibility(i11);
                materialButton = h.this.x2().f14808c;
                i10 = dVar.x2();
            } else if (!(fragment instanceof i)) {
                return;
            } else {
                MaterialButton materialButton3 = h.this.x2().f14808c;
                t.d(materialButton3, "binding.onboardingContinueButton");
                materialButton3.setVisibility(0);
                RoundImageButton roundImageButton2 = h.this.x2().f14809d;
                t.d(roundImageButton2, "binding.onboardingScrollDownButton");
                roundImageButton2.setVisibility(4);
                materialButton = h.this.x2().f14808c;
                i10 = ((i) fragment).t2();
            }
            materialButton.setText(i10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    public h() {
        super(0, 1, null);
    }

    public static final void A2(h hVar, View view) {
        t.e(hVar, "this$0");
        int currentItem = hVar.x2().f14811f.getCurrentItem();
        if (currentItem < hVar.y2().e() - 1) {
            hVar.x2().f14811f.setCurrentItem(currentItem + 1);
        } else {
            hVar.w2();
        }
    }

    public static final void B2(h hVar, View view) {
        t.e(hVar, "this$0");
        Fragment value = hVar.y2().T().getValue();
        d dVar = value instanceof d ? (d) value : null;
        if (dVar != null) {
            dVar.K2();
        }
    }

    public final p x2() {
        return (p) this.U4.a(this, V4[0]);
    }

    public static final void z2(TabLayout.f fVar, int i10) {
        t.e(fVar, "<anonymous parameter 0>");
    }

    @Override // j8.f, m7.z
    public l7.b m() {
        int currentItem = x2().f14811f.getCurrentItem();
        if (currentItem > 0) {
            x2().f14811f.setCurrentItem(currentItem - 1);
            return l7.a.f15852a;
        }
        return l7.c.f15853a;
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        y8.d y22 = y2();
        ViewPager2 viewPager2 = x2().f14811f;
        t.d(viewPager2, "binding.onboardingViewPager");
        y22.Q(viewPager2);
        new com.google.android.material.tabs.d(x2().f14810e, x2().f14811f, g.f20499a).a();
        com.ensody.reactivestate.android.a.b(this, null, null, new b(), 3, null);
        x2().f14808c.setOnClickListener(new View.OnClickListener() { // from class: r8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.A2(h.this, view2);
            }
        });
        x2().f14809d.setOnClickListener(new View.OnClickListener() { // from class: r8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.B2(h.this, view2);
            }
        });
    }

    protected abstract void w2();

    protected abstract y8.d y2();
}
