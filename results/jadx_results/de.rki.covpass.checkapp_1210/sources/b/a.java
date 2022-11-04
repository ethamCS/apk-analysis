package b;

import android.os.CancellationSignal;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import hc.t;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.d;
import xb.i;
import yb.c;
import zb.h;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lb/a;", BuildConfig.FLAVOR, "Landroid/print/PrintDocumentAdapter;", "printAdapter", "Ljava/io/File;", "file", "Ltb/e0;", "a", "(Landroid/print/PrintDocumentAdapter;Ljava/io/File;Lxb/d;)Ljava/lang/Object;", "Landroid/print/PrintAttributes;", "attributes", "<init>", "(Landroid/print/PrintAttributes;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final PrintAttributes f5419a;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lb/a$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: b.a$a */
    /* loaded from: classes.dex */
    public static final class C0074a extends Exception {

        /* renamed from: c */
        private final String f5420c;

        public C0074a(String str) {
            this.f5420c = str;
        }

        public /* synthetic */ C0074a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f5420c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"b/a$b", "Landroid/print/PrintDocumentAdapter$LayoutResultCallback;", "Landroid/print/PrintDocumentInfo;", "info", BuildConfig.FLAVOR, "changed", "Ltb/e0;", "onLayoutFinished", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends PrintDocumentAdapter.LayoutResultCallback {

        /* renamed from: a */
        final /* synthetic */ PrintDocumentAdapter f5421a;

        /* renamed from: b */
        final /* synthetic */ File f5422b;

        /* renamed from: c */
        final /* synthetic */ d<e0> f5423c;

        @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"b/a$b$a", "Landroid/print/PrintDocumentAdapter$WriteResultCallback;", BuildConfig.FLAVOR, "Landroid/print/PageRange;", "pages", "Ltb/e0;", "onWriteFinished", "([Landroid/print/PageRange;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: b.a$b$a */
        /* loaded from: classes.dex */
        public static final class C0075a extends PrintDocumentAdapter.WriteResultCallback {

            /* renamed from: a */
            final /* synthetic */ d<e0> f5424a;

            /* JADX WARN: Multi-variable type inference failed */
            C0075a(d<? super e0> dVar) {
                this.f5424a = dVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
                if ((r4.length == 0) != false) goto L9;
             */
            @Override // android.print.PrintDocumentAdapter.WriteResultCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onWriteFinished(android.print.PageRange[] r4) {
                /*
                    r3 = this;
                    super.onWriteFinished(r4)
                    r0 = 0
                    r1 = 1
                    if (r4 == 0) goto Lf
                    int r4 = r4.length
                    if (r4 != 0) goto Lc
                    r4 = r1
                    goto Ld
                Lc:
                    r4 = r0
                Ld:
                    if (r4 == 0) goto L10
                Lf:
                    r0 = r1
                L10:
                    xb.d<tb.e0> r4 = r3.f5424a
                    if (r0 == 0) goto L21
                    tb.s$a r0 = tb.s.Companion
                    b.a$a r0 = new b.a$a
                    r2 = 0
                    r0.<init>(r2, r1, r2)
                    java.lang.Object r0 = tb.t.a(r0)
                    goto L25
                L21:
                    tb.s$a r0 = tb.s.Companion
                    tb.e0 r0 = tb.e0.f22152a
                L25:
                    java.lang.Object r0 = tb.s.c(r0)
                    r4.y(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: b.a.b.C0075a.onWriteFinished(android.print.PageRange[]):void");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(PrintDocumentAdapter printDocumentAdapter, File file, d<? super e0> dVar) {
            this.f5421a = printDocumentAdapter;
            this.f5422b = file;
            this.f5423c = dVar;
        }

        @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
        public void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z10) {
            this.f5421a.onWrite(new PageRange[]{PageRange.ALL_PAGES}, y8.a.a(this.f5422b), new CancellationSignal(), new C0075a(this.f5423c));
        }
    }

    public a(PrintAttributes printAttributes) {
        t.e(printAttributes, "attributes");
        this.f5419a = printAttributes;
    }

    public final Object a(PrintDocumentAdapter printDocumentAdapter, File file, d<? super e0> dVar) {
        d b10;
        Object c10;
        Object c11;
        b10 = c.b(dVar);
        i iVar = new i(b10);
        printDocumentAdapter.onLayout(null, this.f5419a, null, new b(printDocumentAdapter, file, iVar), null);
        Object a10 = iVar.a();
        c10 = yb.d.c();
        if (a10 == c10) {
            h.c(dVar);
        }
        c11 = yb.d.c();
        return a10 == c11 ? a10 : e0.f22152a;
    }
}
