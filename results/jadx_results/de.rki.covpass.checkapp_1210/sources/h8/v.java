package h8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.rki.covpass.commonapp.uielements.InfoElement;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.e0;
import hc.k0;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010IJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u001c\u0010)\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u001c\u0010,\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u001c\u0010.\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010#R\u001a\u00100\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u001bR\u001c\u00102\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u001c\u00104\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u001a\u00106\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010\u001bR\u001c\u00108\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010#R\u001c\u0010:\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010#R\u001a\u0010<\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010\u001bR\u001c\u0010>\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010#R\u001a\u0010@\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0016R\u001c\u0010D\u001a\u0004\u0018\u00010C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lh8/v;", "Lj8/e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "Ll7/b;", "m", "y2", "z2", "Ly7/j;", "binding$delegate", "Lkc/c;", "G2", "()Ly7/j;", "binding", BuildConfig.FLAVOR, "expertModeVisible$delegate", "Lkotlin/Lazy;", "I2", "()Z", "expertModeVisible", BuildConfig.FLAVOR, "heightLayoutParams$delegate", "x2", "()I", "heightLayoutParams", "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", BuildConfig.FLAVOR, "T2", "()Ljava/lang/String;", "title", "O2", "text", "M2", "imageRes", "titleInfo1", "Ljava/lang/String;", "U2", "subtitleInfo1", "N2", "textInfo1", "Q2", "imageInfo1Res", "J2", "titleInfo2", "V2", "textInfo2", "R2", "imageInfo2Res", "K2", "titleInfo3", "W2", "textInfo3", "S2", "imageInfo3Res", "L2", "textFooter", "P2", "isGermanCertificate", "Z", "X2", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "H2", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class v extends j8.e {

    /* renamed from: q5 */
    static final /* synthetic */ oc.k<Object>[] f11547q5 = {k0.g(new e0(v.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/ValidationResultBinding;", 0))};
    private final Lazy Z4;

    /* renamed from: a5 */
    private final int f11548a5 = x7.e.e_res_0x7f100097;

    /* renamed from: b5 */
    private final kc.c f11549b5 = k7.z.b(this, a.Y3, null, null, 6, null);

    /* renamed from: c5 */
    private final String f11550c5;

    /* renamed from: d5 */
    private final String f11551d5;

    /* renamed from: e5 */
    private final String f11552e5;

    /* renamed from: f5 */
    private final int f11553f5;

    /* renamed from: g5 */
    private final String f11554g5;

    /* renamed from: h5 */
    private final String f11555h5;

    /* renamed from: i5 */
    private final int f11556i5;

    /* renamed from: j5 */
    private final String f11557j5;

    /* renamed from: k5 */
    private final String f11558k5;

    /* renamed from: l5 */
    private final int f11559l5;

    /* renamed from: m5 */
    private final String f11560m5;

    /* renamed from: n5 */
    private final Lazy f11561n5;

    /* renamed from: o5 */
    private final boolean f11562o5;

    /* renamed from: p5 */
    private final ExpertModeData f11563p5;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.j> {
        public static final a Y3 = new a();

        a() {
            super(3, y7.j.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/ValidationResultBinding;", 0);
        }

        public final y7.j i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return y7.j.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.j s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            v.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(l8.b.b(v.this).b().c().getValue().booleanValue() && v.this.H2() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<Integer> {

        /* renamed from: c */
        public static final c f11565c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final Integer invoke() {
            return -1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<Object, w> {

        /* renamed from: c */
        public static final d f11566c = new d();

        public d() {
            super(1);
        }

        @Override // gc.l
        public final w invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof w)) {
                obj = null;
            }
            return (w) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<Object, c8.m> {

        /* renamed from: c */
        public static final e f11567c = new e();

        public e() {
            super(1);
        }

        @Override // gc.l
        public final c8.m invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof c8.m)) {
                obj = null;
            }
            return (c8.m) obj;
        }
    }

    public v() {
        Lazy a10;
        Lazy a11;
        a10 = tb.m.a(c.f11565c);
        this.Z4 = a10;
        a11 = tb.m.a(new b());
        this.f11561n5 = a11;
    }

    private final y7.j G2() {
        return (y7.j) this.f11549b5.a(this, f11547q5[0]);
    }

    private final boolean I2() {
        return ((Boolean) this.f11561n5.getValue()).booleanValue();
    }

    public static final void Y2(v vVar, View view) {
        hc.t.e(vVar, "this$0");
        ExpertModeData H2 = vVar.H2();
        if (H2 != null) {
            m7.v.w(m7.g.b(vVar, 0, 1, null), new e8.f(H2, vVar.X2()), false, 2, null);
        }
    }

    public ExpertModeData H2() {
        return this.f11563p5;
    }

    public int J2() {
        return this.f11553f5;
    }

    public int K2() {
        return this.f11556i5;
    }

    public int L2() {
        return this.f11559l5;
    }

    public abstract int M2();

    public String N2() {
        return this.f11551d5;
    }

    public abstract String O2();

    public String P2() {
        return this.f11560m5;
    }

    public String Q2() {
        return this.f11552e5;
    }

    public String R2() {
        return this.f11555h5;
    }

    public String S2() {
        return this.f11558k5;
    }

    public abstract String T2();

    public String U2() {
        return this.f11550c5;
    }

    public String V2() {
        return this.f11554g5;
    }

    public String W2() {
        return this.f11557j5;
    }

    public boolean X2() {
        return this.f11562o5;
    }

    @Override // j8.f, m7.z
    public l7.b m() {
        w wVar = (w) m7.g.b(this, 0, 1, null).t(false, d.f11566c);
        if (wVar != null) {
            wVar.l();
        }
        return l7.a.f15852a;
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f11548a5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        G2().f25943b.setImageResource(M2());
        G2().f25959r.setText(T2());
        G2().f25958q.setText(O2());
        LinearLayout linearLayout = G2().f25948g;
        hc.t.d(linearLayout, "binding.resultInfoLayout1");
        boolean z10 = true;
        int i10 = 0;
        linearLayout.setVisibility(Q2() != null ? 0 : 8);
        ImageView imageView = G2().f25945d;
        hc.t.d(imageView, "binding.resultInfoImage1");
        imageView.setVisibility(J2() != 0 ? 0 : 8);
        TextView textView = G2().f25951j;
        hc.t.d(textView, "binding.resultInfoSubtitle1");
        textView.setVisibility(N2() != null ? 0 : 8);
        String Q2 = Q2();
        if (Q2 != null) {
            G2().f25945d.setImageResource(J2());
            G2().f25955n.setText(U2());
            G2().f25951j.setText(N2());
            G2().f25952k.setText(Q2);
        }
        LinearLayout linearLayout2 = G2().f25949h;
        hc.t.d(linearLayout2, "binding.resultInfoLayout2");
        linearLayout2.setVisibility(R2() != null ? 0 : 8);
        ImageView imageView2 = G2().f25946e;
        hc.t.d(imageView2, "binding.resultInfoImage2");
        imageView2.setVisibility(R2() != null ? 0 : 8);
        if (R2() != null) {
            G2().f25946e.setImageResource(K2());
            G2().f25956o.setText(V2());
            G2().f25953l.setText(R2());
        }
        LinearLayout linearLayout3 = G2().f25950i;
        hc.t.d(linearLayout3, "binding.resultInfoLayout3");
        linearLayout3.setVisibility(S2() != null ? 0 : 8);
        ImageView imageView3 = G2().f25947f;
        hc.t.d(imageView3, "binding.resultInfoImage3");
        imageView3.setVisibility(S2() != null ? 0 : 8);
        if (S2() != null) {
            G2().f25947f.setImageResource(L2());
            G2().f25957p.setText(W2());
            G2().f25954m.setText(S2());
        }
        TextView textView2 = G2().f25944c;
        hc.t.d(textView2, "binding.resultInfoFooter");
        if (P2() == null) {
            z10 = false;
        }
        textView2.setVisibility(z10 ? 0 : 8);
        if (P2() != null) {
            G2().f25944c.setText(P2());
        }
        InfoElement infoElement = G2().f25960s;
        hc.t.d(infoElement, "binding.revocationLegalNotification");
        if (!I2()) {
            i10 = 8;
        }
        infoElement.setVisibility(i10);
        InfoElement infoElement2 = G2().f25960s;
        String u02 = u0(x7.e.f25487g0);
        String u03 = u0(x7.e.A0);
        int i11 = x7.a.a_res_0x7f0700a3;
        String u04 = u0(x7.e.B0);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: h8.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v.Y2(v.this, view2);
            }
        };
        int i12 = x7.f.f25498a;
        hc.t.d(infoElement2, "revocationLegalNotification");
        hc.t.d(u02, "getString(R.string.revocation_headline)");
        w8.a.c(infoElement2, u02, u03, null, u04, Integer.valueOf(i11), onClickListener, Integer.valueOf(i12), null, null, null, null, null, 3972, null);
        j8.e.E2(this, 0L, 0L, 3, null);
    }

    @Override // j8.e
    public int x2() {
        return ((Number) this.Z4.getValue()).intValue();
    }

    @Override // j8.e
    protected void y2() {
        m7.d.a(this);
    }

    @Override // j8.e
    public void z2() {
        m7.g.b(this, 0, 1, null).t(false, e.f11567c);
    }
}
