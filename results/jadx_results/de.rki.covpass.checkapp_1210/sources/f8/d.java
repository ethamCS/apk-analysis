package f8;

import de.rki.covpass.sdk.cert.models.CovCertificate;
import de.rki.covpass.sdk.cert.models.Name;
import de.rki.covpass.sdk.cert.models.Recovery;
import de.rki.covpass.sdk.cert.models.TestCert;
import de.rki.covpass.sdk.cert.models.Vaccination;
import f8.c;
import gc.p;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.x;
import tb.e0;
import tb.t;
import z9.o;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020\r\u0012\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0003R$\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u00062"}, d2 = {"Lf8/d;", "Ls4/i;", "Lf8/c;", "Lf8/j;", "certificateData2G", "Ltb/e0;", "h", "n", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "certificate", "Li8/a;", "validationResult", "o", BuildConfig.FLAVOR, "isTechnical", "p", "u", "x", "y", "m", "Lf8/i;", "firstCertType", "secondCertType", "i", "z", "q", "j$/time/ZonedDateTime", "sampleCollection", "s", "r", "t", "certData", "testData", "Lz9/f;", "j", "firstCertificateData2G", "Lf8/j;", "k", "()Lf8/j;", "v", "(Lf8/j;)V", "secondCertificateData2G", "l", "w", "Lkotlinx/coroutines/q0;", "scope", "isTwoGPlusOn", "isTwoGPlusBOn", "<init>", "(Lkotlinx/coroutines/q0;ZZ)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d extends s4.i<f8.c> {

    /* renamed from: d */
    private final boolean f9893d;

    /* renamed from: e */
    private final boolean f9894e;

    /* renamed from: f */
    private f8.j f9895f;

    /* renamed from: g */
    private f8.j f9896g;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$onDataPreparationFinish$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9897y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9897y == 0) {
                t.b(obj);
                ((f8.c) this.U3).O(d.this.k(), d.this.l());
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((a) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareData2gNullCert$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9898y;

        b(xb.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9898y == 0) {
                t.b(obj);
                ((f8.c) this.U3).R(true);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((b) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareData2gNullCert$2", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9899y;

        c(xb.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9899y == 0) {
                t.b(obj);
                c.a.a((f8.c) this.U3, null, true, 1, null);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((c) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnSuccess$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f8.d$d */
    /* loaded from: classes.dex */
    public static final class C0146d extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9900y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0146d(xb.d<? super C0146d> dVar) {
            super(2, dVar);
            d.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9900y == 0) {
                t.b(obj);
                f8.c cVar = (f8.c) this.U3;
                f8.j k10 = d.this.k();
                if (k10 != null) {
                    cVar.w(k10);
                }
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((C0146d) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            C0146d c0146d = new C0146d(dVar);
            c0146d.U3 = obj;
            return c0146d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnSuccess$2", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;

        /* renamed from: y */
        int f9901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CovCertificate covCertificate, xb.d<? super e> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9901y == 0) {
                t.b(obj);
                ((f8.c) this.U3).B(this.V3);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((e) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            e eVar = new e(this.V3, dVar);
            eVar.U3 = obj;
            return eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnValidAntigenTest$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;
        final /* synthetic */ ZonedDateTime W3;

        /* renamed from: y */
        int f9902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CovCertificate covCertificate, ZonedDateTime zonedDateTime, xb.d<? super f> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
            this.W3 = zonedDateTime;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9902y == 0) {
                t.b(obj);
                ((f8.c) this.U3).i(this.V3, this.W3);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((f) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            f fVar = new f(this.V3, this.W3, dVar);
            fVar.U3 = obj;
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnValidPcrTest$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;
        final /* synthetic */ ZonedDateTime W3;

        /* renamed from: y */
        int f9903y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CovCertificate covCertificate, ZonedDateTime zonedDateTime, xb.d<? super g> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
            this.W3 = zonedDateTime;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9903y == 0) {
                t.b(obj);
                ((f8.c) this.U3).J(this.V3, this.W3);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((g) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            g gVar = new g(this.V3, this.W3, dVar);
            gVar.U3 = obj;
            return gVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnValidationFailure3g$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9904y;

        h(xb.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9904y == 0) {
                t.b(obj);
                c.a.b((f8.c) this.U3, false, 1, null);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((h) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.U3 = obj;
            return hVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$prepareDataOnValidationFailure3g$2", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;

        /* renamed from: y */
        int f9905y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(CovCertificate covCertificate, xb.d<? super i> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9905y == 0) {
                t.b(obj);
                c.a.a((f8.c) this.U3, this.V3, false, 2, null);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((i) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            i iVar = new i(this.V3, dVar);
            iVar.U3 = obj;
            return iVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerDataViewModel$show2GError$1", f = "CovPassCheckQRScannerDataViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends zb.l implements p<f8.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f9906y;

        j(xb.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9906y == 0) {
                t.b(obj);
                ((f8.c) this.U3).P();
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(f8.c cVar, xb.d<? super e0> dVar) {
            return ((j) j(cVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            j jVar = new j(dVar);
            jVar.U3 = obj;
            return jVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q0 q0Var, boolean z10, boolean z11) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
        this.f9893d = z10;
        this.f9894e = z11;
    }

    private final void h(f8.j jVar) {
        if (this.f9895f == null) {
            this.f9895f = jVar;
        } else {
            this.f9896g = jVar;
        }
    }

    private final boolean i(f8.i iVar, f8.i iVar2) {
        f8.i iVar3 = f8.i.Vaccination;
        if (iVar == iVar3 && iVar2 == f8.i.Booster) {
            return false;
        }
        if (iVar2 == iVar3 && iVar == f8.i.Booster) {
            return false;
        }
        f8.i iVar4 = f8.i.PcrTest;
        if (iVar == iVar4 && iVar2 == f8.i.AntigenTest) {
            return false;
        }
        return ((iVar == f8.i.AntigenTest && iVar2 == iVar4) || iVar == iVar2) ? false : true;
    }

    private final boolean m(CovCertificate covCertificate) {
        f8.j jVar = this.f9895f;
        if (jVar != null) {
            if (jVar == null || this.f9896g != null) {
                return false;
            }
            if (!(jVar != null ? i(z(covCertificate), jVar.i()) : false)) {
                return false;
            }
        }
        return true;
    }

    private final void n(f8.j jVar) {
        h(jVar);
        f().f(new a(null));
    }

    private final void o(CovCertificate covCertificate, i8.a aVar) {
        f8.j jVar;
        de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
        if (d10 instanceof Recovery ? true : d10 instanceof Vaccination) {
            if (m(covCertificate)) {
                jVar = new f8.j(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), null, aVar, covCertificate.d().getId(), z(covCertificate), null, k.b(covCertificate.j()), false, 640, null);
                n(jVar);
                return;
            }
            x();
        } else if (!(d10 instanceof TestCert)) {
        } else {
            if (m(covCertificate)) {
                jVar = new f8.j(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), null, aVar, covCertificate.d().getId(), z(covCertificate), null, k.b(covCertificate.j()), false, 640, null);
                n(jVar);
                return;
            }
            x();
        }
    }

    private final void p(boolean z10, i8.a aVar) {
        f8.j jVar;
        x<f8.c> f10;
        p<? super f8.c, ? super xb.d<? super e0>, ? extends Object> cVar;
        f8.j jVar2 = this.f9895f;
        if (jVar2 == null && this.f9896g == null && z10) {
            f10 = f();
            cVar = new b(null);
        } else if (jVar2 != null || this.f9896g != null || z10) {
            if (jVar2 != null) {
                jVar = new f8.j(null, null, null, null, aVar, null, f8.i.NullCertificateOrUnknown, null, null, false, 640, null);
            } else if (this.f9896g == null) {
                return;
            } else {
                jVar = new f8.j(null, null, null, null, aVar, null, f8.i.NullCertificateOrUnknown, null, null, false, 640, null);
            }
            n(jVar);
            return;
        } else {
            f10 = f();
            cVar = new c(null);
        }
        f10.f(cVar);
    }

    private final void u(boolean z10, CovCertificate covCertificate) {
        if (z10) {
            f().f(new h(null));
        } else {
            f().f(new i(covCertificate, null));
        }
    }

    private final void x() {
        f().f(new j(null));
    }

    private final boolean y(CovCertificate covCertificate) {
        f8.j jVar = this.f9895f;
        if (jVar != null) {
            if ((jVar != null && jVar.u()) && !(covCertificate.d() instanceof Vaccination)) {
                return true;
            }
            if (covCertificate.q()) {
                f8.j jVar2 = this.f9895f;
                if (jVar2 != null && jVar2.q()) {
                    return true;
                }
                f8.j jVar3 = this.f9895f;
                if (jVar3 != null && jVar3.w()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final f8.i z(CovCertificate covCertificate) {
        if (covCertificate != null) {
            if (covCertificate.d() instanceof Vaccination) {
                de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
                Vaccination vaccination = d10 instanceof Vaccination ? (Vaccination) d10 : null;
                boolean z10 = true;
                if (vaccination == null || !vaccination.f()) {
                    z10 = false;
                }
                if (z10) {
                    return f8.i.Booster;
                }
            }
            if (covCertificate.d() instanceof Vaccination) {
                return f8.i.Vaccination;
            }
            if (covCertificate.d() instanceof Recovery) {
                return f8.i.Recovery;
            }
            if ((covCertificate.d() instanceof TestCert) && (covCertificate.d().getType() == de.rki.covpass.sdk.cert.models.j.NEGATIVE_PCR_TEST || covCertificate.d().getType() == de.rki.covpass.sdk.cert.models.j.POSITIVE_PCR_TEST)) {
                return f8.i.PcrTest;
            }
            if ((covCertificate.d() instanceof TestCert) && (covCertificate.d().getType() == de.rki.covpass.sdk.cert.models.j.NEGATIVE_ANTIGEN_TEST || covCertificate.d().getType() == de.rki.covpass.sdk.cert.models.j.POSITIVE_ANTIGEN_TEST)) {
                return f8.i.AntigenTest;
            }
        }
        return f8.i.NullCertificateOrUnknown;
    }

    public final z9.f j(f8.j jVar, f8.j jVar2) {
        l l10;
        l l11;
        boolean z10 = true;
        if (!(jVar != null && jVar.n())) {
            if (jVar2 == null || !jVar2.n()) {
                z10 = false;
            }
            if (!z10) {
                String str = null;
                Name a10 = (jVar == null || (l11 = jVar.l()) == null) ? null : k.a(l11);
                Name a11 = (jVar2 == null || (l10 = jVar2.l()) == null) ? null : k.a(l10);
                String a12 = jVar != null ? jVar.a() : null;
                if (jVar2 != null) {
                    str = jVar2.a();
                }
                return z9.g.f26548a.a(a10, a11, a12, str);
            }
        }
        return z9.f.HasInvalidData;
    }

    public final f8.j k() {
        return this.f9895f;
    }

    public final f8.j l() {
        return this.f9896g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
        r1 = r2.toInstant();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
        if (r2 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(de.rki.covpass.sdk.cert.models.CovCertificate r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.d.q(de.rki.covpass.sdk.cert.models.CovCertificate):void");
    }

    public final void r(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        hc.t.e(covCertificate, "certificate");
        if (!this.f9893d) {
            f().f(new f(covCertificate, zonedDateTime, null));
        } else if (!y(covCertificate) && m(covCertificate)) {
            n(new f8.j(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), zonedDateTime, i8.a.Success, covCertificate.d().getId(), f8.i.AntigenTest, null, k.b(covCertificate.j()), false, 640, null));
        } else {
            x();
        }
    }

    public final void s(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        hc.t.e(covCertificate, "certificate");
        if (!this.f9893d) {
            f().f(new g(covCertificate, zonedDateTime, null));
        } else if (!y(covCertificate) && m(covCertificate)) {
            n(new f8.j(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), zonedDateTime, i8.a.Success, covCertificate.d().getId(), f8.i.PcrTest, null, k.b(covCertificate.j()), false, 640, null));
        } else {
            x();
        }
    }

    public final void t(boolean z10, CovCertificate covCertificate) {
        i8.a aVar = z10 ? i8.a.TechnicalError : i8.a.ValidationError;
        if (!this.f9893d) {
            u(z10, covCertificate);
        } else if (covCertificate == null || z10) {
            p(z10, aVar);
        } else {
            o(covCertificate, aVar);
        }
    }

    public final void v(f8.j jVar) {
        this.f9895f = jVar;
    }

    public final void w(f8.j jVar) {
        this.f9896g = jVar;
    }
}
