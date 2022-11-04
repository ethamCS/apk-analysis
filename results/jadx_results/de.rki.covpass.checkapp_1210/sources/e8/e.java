package e8;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.ensody.reactivestate.android.l;
import com.google.android.material.button.MaterialButton;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import hc.v;
import java.util.List;
import k7.z;
import kotlin.Lazy;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
import tb.m;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u0002008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Le8/e;", "Ls8/a;", "Ltb/e0;", "O2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Landroid/net/Uri;", "uri", "s", "y2", BuildConfig.FLAVOR, "isLoading", "L2", "Ly7/d;", "binding$delegate", "Lkc/c;", "Q2", "()Ly7/d;", "binding", "Le8/f;", "args$delegate", "Lkotlin/Lazy;", "P2", "()Le8/f;", "args", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "revocationExportData$delegate", "R2", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "revocationExportData", BuildConfig.FLAVOR, "buttonTextRes", "I", "w2", "()Ljava/lang/Integer;", "announcementAccessibilityRes", "n2", "Le8/g;", "viewModel$delegate", "S2", "()Le8/g;", "viewModel", "shareIntentTitle", "F2", "()I", "Landroid/webkit/WebView;", "webView$delegate", "H2", "()Landroid/webkit/WebView;", "webView", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e extends s8.a {

    /* renamed from: h5 */
    static final /* synthetic */ k<Object>[] f9515h5 = {k0.g(new e0(e.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/RevocationExportPdfBinding;", 0))};

    /* renamed from: b5 */
    private final Lazy f9517b5;

    /* renamed from: d5 */
    private final Lazy f9519d5;

    /* renamed from: f5 */
    private final Lazy f9521f5;

    /* renamed from: g5 */
    private final Lazy f9522g5;
    private final int Z4 = x7.e.Z;

    /* renamed from: a5 */
    private final int f9516a5 = x7.e.b_res_0x7f10008f;

    /* renamed from: c5 */
    private final int f9518c5 = x7.e.e0_res_0x7f1001aa;

    /* renamed from: e5 */
    private final kc.c f9520e5 = z.b(this, b.Y3, null, null, 6, null);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le8/f;", "b", "()Le8/f;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends v implements gc.a<e8.f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final e8.f invoke() {
            return (e8.f) m7.k.a(e.this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class b extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.d> {
        public static final b Y3 = new b();

        b() {
            super(3, y7.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/RevocationExportPdfBinding;", 0);
        }

        public final y7.d i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return y7.d.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.d s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "b", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends v implements gc.a<ExpertModeData> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final ExpertModeData invoke() {
            return e.this.P2().a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9525c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(Fragment fragment) {
                super(fragment, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                t.e(str, "key");
                t.e(cls, "modelClass");
                t.e(l0Var, "handle");
                return new l(new com.ensody.reactivestate.android.h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f9525c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f9525c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: e8.e$e */
    /* loaded from: classes.dex */
    public static final class C0138e extends v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9526c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0138e(Fragment fragment) {
            super(0);
            this.f9526c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f9526c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f9527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(gc.a aVar) {
            super(0);
            this.f9527c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f9527c.invoke()).I();
            t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.l<Object, e8.g> {

        /* renamed from: c */
        public static final g f9528c = new g();

        public g() {
            super(1);
        }

        @Override // gc.l
        public final e8.g invoke(Object obj) {
            if (!(obj instanceof e8.g)) {
                obj = null;
            }
            return (e8.g) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends v implements gc.l<com.ensody.reactivestate.android.b, e8.g> {
        public h() {
            super(1);
        }

        /* renamed from: b */
        public final e8.g invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return new e8.g(bVar.a(), null, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/webkit/WebView;", "b", "()Landroid/webkit/WebView;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class i extends v implements gc.a<WebView> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            e.this = r1;
        }

        /* renamed from: b */
        public final WebView invoke() {
            return e.this.Q2().f25904e;
        }
    }

    public e() {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy b10 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(l.class), new f(new C0138e(this)), new d(this)), k0.b(e8.g.class), g.f9528c, new h());
        com.ensody.reactivestate.android.f.a(b10, this, this);
        this.f9517b5 = b10;
        a10 = m.a(new i());
        this.f9519d5 = a10;
        a11 = m.a(new a());
        this.f9521f5 = a11;
        a12 = m.a(new c());
        this.f9522g5 = a12;
    }

    private final void O2() {
        List<e8.d> n10;
        n10 = u.n(new e8.d(x7.e.f0_res_0x7f1001ab, R2().f()), new e8.d(x7.e.c0_res_0x7f1001a7, R2().d()), new e8.d(x7.e.a0_res_0x7f1001a5, R2().c()), new e8.d(x7.e.f25483d0, R2().e()), new e8.d(x7.e.b0_res_0x7f1001a6, R2().a()));
        e8.c cVar = new e8.c(this);
        cVar.z(n10);
        RecyclerView recyclerView = Q2().f25903d;
        t.d(recyclerView, "binding.revocationExportPdfRecyclerview");
        cVar.w(recyclerView);
    }

    public final e8.f P2() {
        return (e8.f) this.f9521f5.getValue();
    }

    public final y7.d Q2() {
        return (y7.d) this.f9520e5.a(this, f9515h5[0]);
    }

    private final ExpertModeData R2() {
        return (ExpertModeData) this.f9522g5.getValue();
    }

    @Override // s8.a
    public int F2() {
        return this.f9518c5;
    }

    @Override // s8.a
    public WebView H2() {
        return (WebView) this.f9519d5.getValue();
    }

    @Override // s8.a
    public void L2(boolean z10) {
        RecyclerView recyclerView = Q2().f25903d;
        t.d(recyclerView, "binding.revocationExportPdfRecyclerview");
        int i10 = 8;
        recyclerView.setVisibility(z10 ? 8 : 0);
        MaterialButton materialButton = v2().f14698c;
        t.d(materialButton, "bottomSheetBinding.bottomSheetActionButton");
        materialButton.setVisibility(z10 ? 8 : 0);
        LinearLayout linearLayout = Q2().f25902c;
        t.d(linearLayout, "binding.loadingLayout");
        if (z10) {
            i10 = 0;
        }
        linearLayout.setVisibility(i10);
    }

    /* renamed from: S2 */
    public e8.g G2() {
        return (e8.g) this.f9517b5.getValue();
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f9516a5);
    }

    @Override // s8.a, androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        v2().f14711p.setText(u0(x7.e.e0_res_0x7f1001aa));
        v2().f14698c.setEnabled(P2().c());
        O2();
    }

    @Override // s8.a, s8.f
    public void s(Uri uri) {
        t.e(uri, "uri");
        K2(uri);
    }

    @Override // j8.e
    public Integer w2() {
        return Integer.valueOf(this.Z4);
    }

    @Override // j8.e
    protected void y2() {
        G2().r(P2().a());
    }
}
