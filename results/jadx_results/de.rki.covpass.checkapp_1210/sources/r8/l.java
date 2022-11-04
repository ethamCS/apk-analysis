package r8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import hc.v;
import j8.n;
import k7.z;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0014R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lr8/l;", "Lj8/e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "y2", "Lk8/h;", "binding$delegate", "Lkc/c;", "F2", "()Lk8/h;", "binding", BuildConfig.FLAVOR, "heightLayoutParams$delegate", "Lkotlin/Lazy;", "x2", "()I", "heightLayoutParams", "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l extends j8.e {

    /* renamed from: c5 */
    static final /* synthetic */ oc.k<Object>[] f20502c5 = {k0.g(new e0(l.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/DataProtectionBinding;", 0))};
    private final Lazy Z4;

    /* renamed from: a5 */
    private final kc.c f20503a5 = z.b(this, a.Y3, null, null, 6, null);

    /* renamed from: b5 */
    private final int f20504b5 = n.f14090b;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.h> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/DataProtectionBinding;", 0);
        }

        public final k8.h i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return k8.h.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.h s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.a<Integer> {

        /* renamed from: c */
        public static final b f20505c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Integer invoke() {
            return -1;
        }
    }

    public l() {
        Lazy a10;
        a10 = tb.m.a(b.f20505c);
        this.Z4 = a10;
    }

    private final k8.h F2() {
        return (k8.h) this.f20503a5.a(this, f20502c5[0]);
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f20504b5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        v2().f14711p.setText(u0(n.N));
        MaterialButton materialButton = v2().f14698c;
        t.d(materialButton, "bottomSheetBinding.bottomSheetActionButton");
        materialButton.setVisibility(8);
        F2().f14747b.loadUrl(u0(n.Z));
    }

    @Override // j8.e
    public int x2() {
        return ((Number) this.Z4.getValue()).intValue();
    }

    @Override // j8.e
    protected void y2() {
    }
}
