package s8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.print.PrintDocumentAdapter;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.m;
import de.rki.covpass.commonapp.pdfexport.ExportPdfSaveOptionActivity;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import m7.g;
import org.conscrypt.BuildConfig;
import s4.r0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0004J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H&R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Ls8/a;", "Lj8/e;", "Ls8/f;", "Ltb/e0;", "I2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "Landroid/net/Uri;", "uri", "s", "K2", BuildConfig.FLAVOR, "pdfString", "J2", BuildConfig.FLAVOR, "isLoading", "L2", "Ls8/b;", "G2", "()Ls8/b;", "viewModel", BuildConfig.FLAVOR, "F2", "()I", "shareIntentTitle", "Landroid/webkit/WebView;", "H2", "()Landroid/webkit/WebView;", "webView", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a extends j8.e implements f {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"s8/a$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", BuildConfig.FLAVOR, "url", "Ltb/e0;", "onPageFinished", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: s8.a$a */
    /* loaded from: classes.dex */
    public static final class C0359a extends WebViewClient {
        C0359a() {
            a.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView != null) {
                s8.b G2 = a.this.G2();
                PrintDocumentAdapter createPrintDocumentAdapter = webView.createPrintDocumentAdapter("Certificate PDF");
                t.d(createPrintDocumentAdapter, "it.createPrintDocumentAdapter(\"Certificate PDF\")");
                G2.m(createPrintDocumentAdapter);
            }
            a.this.G2().l().setValue(BuildConfig.FLAVOR);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<r0, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            a.this = r1;
        }

        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            a aVar = a.this;
            aVar.L2(((Number) s4.d.a(r0Var, aVar.b())).intValue() > 0);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(r0 r0Var) {
            b(r0Var);
            return e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements l<r0, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            a.this = r1;
        }

        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            a aVar = a.this;
            aVar.J2((String) s4.d.a(r0Var, aVar.G2().l()));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(r0 r0Var) {
            b(r0Var);
            return e0.f22152a;
        }
    }

    private final void I2() {
        H2().setWebViewClient(new C0359a());
    }

    public abstract int F2();

    public abstract s8.b G2();

    public abstract WebView H2();

    protected final void J2(String str) {
        t.e(str, "pdfString");
        if (str.length() > 0) {
            H2().loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
        }
    }

    public final void K2(Uri uri) {
        t.e(uri, "uri");
        Intent c10 = new m(S1()).e("application/pdf").d(uri).c();
        t.d(c10, "IntentBuilder(requireCon…(uri)\n            .intent");
        Intent intent = new Intent(S1(), ExportPdfSaveOptionActivity.class);
        intent.setData(uri);
        Intent createChooser = Intent.createChooser(c10, u0(F2()));
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
        k2(createChooser);
    }

    public abstract void L2(boolean z10);

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        I2();
        com.ensody.reactivestate.android.a.b(this, null, null, new b(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new c(), 3, null);
    }

    public void s(Uri uri) {
        t.e(uri, "uri");
        K2(uri);
        m7.v.q(g.b(this, 0, 1, null), false, 1, null);
    }
}
