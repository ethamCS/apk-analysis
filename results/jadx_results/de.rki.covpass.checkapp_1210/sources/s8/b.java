package s8;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import androidx.core.content.FileProvider;
import h6.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.y;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.i;
import s4.m;
import tb.e0;
import tb.t;
import tb.x;
import ub.p0;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002J\b\u0010\f\u001a\u00020\nH&J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\n\u0010\u0011\u001a\u00020\n*\u00020\nR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Ls8/b;", "Ls4/i;", "Ls8/f;", "Landroid/content/Context;", "context", "Ljava/io/File;", "file", "Landroid/net/Uri;", "o", "Landroid/graphics/Bitmap;", BuildConfig.FLAVOR, "i", "k", "Landroid/print/PrintDocumentAdapter;", "printDocumentAdapter", "Ltb/e0;", "m", "n", "applicationContext", "Landroid/content/Context;", "j", "()Landroid/content/Context;", "Lkotlinx/coroutines/flow/p;", "pdfString", "Lkotlinx/coroutines/flow/p;", "l", "()Lkotlinx/coroutines/flow/p;", "Lkotlinx/coroutines/q0;", "scope", "providerAuthority", "<init>", "(Lkotlinx/coroutines/q0;Landroid/content/Context;Ljava/lang/String;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class b extends i<f> {

    /* renamed from: d */
    private final Context f21532d;

    /* renamed from: e */
    private final String f21533e;

    /* renamed from: f */
    private final p<String> f21534f;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.pdfexport.BaseExportPdfViewModel$onShareStart$1", f = "BaseExportPdfViewModel.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements gc.p<q0, xb.d<? super e0>, Object> {
        int U3;
        final /* synthetic */ PrintDocumentAdapter W3;

        /* renamed from: y */
        Object f21535y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ls8/f;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.commonapp.pdfexport.BaseExportPdfViewModel$onShareStart$1$1", f = "BaseExportPdfViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: s8.b$a$a */
        /* loaded from: classes.dex */
        public static final class C0360a extends l implements gc.p<f, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ b V3;
            final /* synthetic */ File W3;

            /* renamed from: y */
            int f21536y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0360a(b bVar, File file, xb.d<? super C0360a> dVar) {
                super(2, dVar);
                this.V3 = bVar;
                this.W3 = file;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f21536y == 0) {
                    t.b(obj);
                    b bVar = this.V3;
                    ((f) this.U3).s(bVar.o(bVar.j(), this.W3));
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(f fVar, xb.d<? super e0> dVar) {
                return ((C0360a) j(fVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                C0360a c0360a = new C0360a(this.V3, this.W3, dVar);
                c0360a.U3 = obj;
                return c0360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PrintDocumentAdapter printDocumentAdapter, xb.d<? super a> dVar) {
            super(2, dVar);
            b.this = r1;
            this.W3 = printDocumentAdapter;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            File file;
            c10 = yb.d.c();
            int i10 = this.U3;
            if (i10 == 0) {
                t.b(obj);
                PrintAttributes build = new PrintAttributes.Builder().setMinMargins(PrintAttributes.Margins.NO_MARGINS).setMediaSize(PrintAttributes.MediaSize.ISO_A4).setResolution(new PrintAttributes.Resolution("pdf", "pdf", 600, 600)).build();
                hc.t.d(build, "Builder()\n              …\n                .build()");
                File file2 = new File(b.this.j().getCacheDir(), b.this.k());
                b.a aVar = new b.a(build);
                PrintDocumentAdapter printDocumentAdapter = this.W3;
                this.f21535y = file2;
                this.U3 = 1;
                if (aVar.a(printDocumentAdapter, file2, this) == c10) {
                    return c10;
                }
                file = file2;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                file = (File) this.f21535y;
                t.b(obj);
            }
            b.this.f().f(new C0360a(b.this, file, null));
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.W3, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q0 q0Var, Context context, String str) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
        hc.t.e(context, "applicationContext");
        hc.t.e(str, "providerAuthority");
        this.f21532d = context;
        this.f21533e = str;
        this.f21534f = y.a(BuildConfig.FLAVOR);
    }

    public /* synthetic */ b(q0 q0Var, Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? k7.b.a().b() : context, (i10 & 4) != 0 ? l8.b.a().d() : str);
    }

    private final String i(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        hc.t.d(byteArray, "outputStream.toByteArray()");
        return fb.f.c(byteArray);
    }

    public final Uri o(Context context, File file) {
        String str;
        Uri uri;
        if (Build.VERSION.SDK_INT >= 24) {
            uri = FileProvider.f(context, this.f21533e, file);
            str = "{\n        FileProvider.g…derAuthority, file)\n    }";
        } else {
            uri = Uri.fromFile(file);
            str = "{\n        Uri.fromFile(file)\n    }";
        }
        hc.t.d(uri, str);
        return uri;
    }

    public final Context j() {
        return this.f21532d;
    }

    public abstract String k();

    public final p<String> l() {
        return this.f21534f;
    }

    public final void m(PrintDocumentAdapter printDocumentAdapter) {
        hc.t.e(printDocumentAdapter, "printDocumentAdapter");
        m.a.b(this, null, null, null, null, new a(printDocumentAdapter, null), 15, null);
    }

    public final String n(String str) {
        Map<g, ?> e10;
        hc.t.e(str, "<this>");
        o7.b bVar = new o7.b();
        h6.a aVar = h6.a.QR_CODE;
        e10 = p0.e(x.a(g.MARGIN, 0));
        Bitmap c10 = bVar.c(str, aVar, 619, 619, e10);
        hc.t.d(c10, "BarcodeEncoder().encodeB…e.MARGIN to 0),\n        )");
        return i(c10);
    }
}
