package de.rki.covpass.commonapp.pdfexport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import bf.y;
import com.ensody.reactivestate.android.f;
import com.ensody.reactivestate.android.h;
import com.ensody.reactivestate.android.l;
import de.rki.covpass.commonapp.pdfexport.ExportPdfSaveOptionActivity;
import hc.k0;
import hc.t;
import hc.v;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.m;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0003H\u0016R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lde/rki/covpass/commonapp/pdfexport/ExportPdfSaveOptionActivity;", "Lj8/b;", "Ls8/c;", "Ltb/e0;", "M0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "A", "Landroid/net/Uri;", "p4", "Lkotlin/Lazy;", "K0", "()Landroid/net/Uri;", "data", "Landroidx/activity/result/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "q4", "Landroidx/activity/result/c;", "startForResult", "Ls8/e;", "r4", "L0", "()Ls8/e;", "detailSavePdfViewModel", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExportPdfSaveOptionActivity extends j8.b implements s8.c {

    /* renamed from: p4 */
    private final Lazy f8558p4;

    /* renamed from: q4 */
    private final androidx.activity.result.c<Intent> f8559q4;

    /* renamed from: r4 */
    private final Lazy f8560r4;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/net/Uri;", "b", "()Landroid/net/Uri;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends v implements gc.a<Uri> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            ExportPdfSaveOptionActivity.this = r1;
        }

        /* renamed from: b */
        public final Uri invoke() {
            return ExportPdfSaveOptionActivity.this.getIntent().getData();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ ComponentActivity f8562c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$1$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(ComponentActivity componentActivity) {
                super(componentActivity, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                t.e(str, "key");
                t.e(cls, "modelClass");
                t.e(l0Var, "handle");
                return new l(new h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f8562c = componentActivity;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f8562c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ ComponentActivity f8563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f8563c = componentActivity;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = this.f8563c.I();
            t.d(I, "viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.l<Object, s8.e> {

        /* renamed from: c */
        public static final d f8564c = new d();

        public d() {
            super(1);
        }

        @Override // gc.l
        public final s8.e invoke(Object obj) {
            if (!(obj instanceof s8.e)) {
                obj = null;
            }
            return (s8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.l<com.ensody.reactivestate.android.b, s8.e> {
        public e() {
            super(1);
        }

        /* renamed from: b */
        public final s8.e invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return new s8.e(bVar.a());
        }
    }

    public ExportPdfSaveOptionActivity() {
        super(0, 1, null);
        Lazy a10;
        a10 = m.a(new a());
        this.f8558p4 = a10;
        androidx.activity.result.c<Intent> f02 = f0(new d.d(), new androidx.activity.result.b() { // from class: s8.d
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ExportPdfSaveOptionActivity.N0(ExportPdfSaveOptionActivity.this, (androidx.activity.result.a) obj);
            }
        });
        t.d(f02, "registerForActivityResul…)\n            }\n        }");
        this.f8559q4 = f02;
        Lazy b10 = f.b(new u0(k0.b(l.class), new c(this), new b(this)), k0.b(s8.e.class), d.f8564c, new e());
        f.a(b10, this, this);
        this.f8560r4 = b10;
    }

    private final Uri K0() {
        return (Uri) this.f8558p4.getValue();
    }

    private final s8.e L0() {
        return (s8.e) this.f8560r4.getValue();
    }

    private final void M0() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/pdf");
        Uri K0 = K0();
        t.c(K0, "null cannot be cast to non-null type android.net.Uri");
        String encodedPath = K0.getEncodedPath();
        intent.putExtra("android.intent.extra.TITLE", encodedPath != null ? y.p0(encodedPath, "/tempfile/") : null);
        this.f8559q4.a(new Intent(intent));
    }

    public static final void N0(ExportPdfSaveOptionActivity exportPdfSaveOptionActivity, androidx.activity.result.a aVar) {
        Uri data;
        t.e(exportPdfSaveOptionActivity, "this$0");
        t.e(aVar, "result");
        if (aVar.c() != -1) {
            exportPdfSaveOptionActivity.finish();
            return;
        }
        Intent a10 = aVar.a();
        InputStream inputStream = null;
        OutputStream openOutputStream = (a10 == null || (data = a10.getData()) == null) ? null : exportPdfSaveOptionActivity.getContentResolver().openOutputStream(data);
        Uri K0 = exportPdfSaveOptionActivity.K0();
        if (K0 != null) {
            inputStream = exportPdfSaveOptionActivity.getContentResolver().openInputStream(K0);
        }
        if (inputStream == null || openOutputStream == null) {
            return;
        }
        exportPdfSaveOptionActivity.L0().h(inputStream, openOutputStream);
    }

    @Override // s8.c
    public void A() {
        finish();
    }

    @Override // j8.b, k7.e, androidx.fragment.app.j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M0();
    }
}
