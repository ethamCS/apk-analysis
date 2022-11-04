package j8;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.webkit.WebView;
import de.rki.covpass.logging.Lumber;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import m7.a0;
import m7.r;
import m7.s;
import org.conscrypt.BuildConfig;
import tb.e0;
import u1.t;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H&J\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lj8/g;", "Landroid/app/Application;", "Ltb/e0;", "c", "b", "onCreate", BuildConfig.FLAVOR, "a", "d", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class g extends Application {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"j8/g$a", "Lm7/r;", "Lj8/g;", "application", "Lj8/g;", "e", "()Lj8/g;", "Lm7/a0;", "defaultScreenOrientation", "Lm7/a0;", "c", "()Lm7/a0;", "Lm7/e;", "animationConfig", "Lm7/e;", "d", "()Lm7/e;", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends r {

        /* renamed from: c */
        private final g f14064c;

        /* renamed from: d */
        private final a0 f14065d = a0.PORTRAIT;

        /* renamed from: e */
        private final m7.e f14066e = new m7.e(250);

        a(g gVar) {
            this.f14064c = gVar;
        }

        @Override // m7.r
        public a0 c() {
            return this.f14065d;
        }

        /* renamed from: d */
        public m7.e a() {
            return this.f14066e;
        }

        /* renamed from: e */
        public g b() {
            return this.f14064c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j8/g$b", "Lk7/a;", "Landroidx/fragment/app/j;", "e", "Landroid/app/Application;", "application", "Landroid/app/Application;", "b", "()Landroid/app/Application;", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends k7.a {

        /* renamed from: c */
        private final m7.a f14067c = new m7.a();

        /* renamed from: d */
        private final Application f14068d;

        b(g gVar) {
            this.f14068d = gVar;
        }

        @Override // k7.a
        public Application b() {
            return this.f14068d;
        }

        /* renamed from: e */
        public androidx.fragment.app.j a() {
            Activity a10 = this.f14067c.a();
            if (a10 instanceof androidx.fragment.app.j) {
                return (androidx.fragment.app.j) a10;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"j8/g$c", "Lf9/c;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "K", "()Landroid/app/Application;", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends f9.c {
        private final Application G0;

        c(g gVar) {
            this.G0 = gVar;
        }

        @Override // f9.c
        public Application K() {
            return this.G0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.CommonApplication$prepopulateDb$1", f = "CommonApplication.kt", l = {91, 92, 93, 94, 95, 96, 98, 99, 103, 104, 108, 109, 113, 114, 118, 119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f14069y;

        d(xb.d<? super d> dVar) {
            super(2, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0134 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01ee A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01f3  */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r6) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.g.d.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((d) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new d(dVar);
        }
    }

    private final void b() {
        kotlinx.coroutines.k.b(null, new d(null), 1, null);
    }

    private final void c() {
        t d10 = t.d(this);
        d10.a("de.rki.covpass.sdk.worker.DscListWorker");
        d10.a("de.rki.covpass.sdk.worker.RulesWorker");
        d10.a("de.rki.covpass.sdk.worker.ValueSetsWorker");
        d10.a("de.rki.covpass.sdk.worker.BoosterRulesWorker");
        d10.a("de.rki.covpass.sdk.worker.CountriesWorker");
    }

    public abstract String a();

    public final void d() {
        f9.d.a().e1().g(d9.p.a(f9.d.a().G0().b().getValue()));
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        n7.a.b();
        if (k7.c.e(this)) {
            Lumber.Companion.plantDebugTreeIfNeeded();
            z8.a.a().d(z8.e.HEADERS);
            WebView.setWebContentsDebuggingEnabled(true);
        }
        z8.d a10 = z8.a.a();
        String a11 = a();
        String packageName = getPackageName();
        int i10 = Build.VERSION.SDK_INT;
        a10.b(a11 + " (" + packageName + "; Android " + i10 + ")");
        s.b(new a(this));
        k7.b.c(new b(this));
        f9.d.c(new c(this));
        b();
        c();
    }
}
