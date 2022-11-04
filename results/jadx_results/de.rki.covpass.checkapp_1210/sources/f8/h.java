package f8;

import d9.s;
import d9.u;
import de.rki.covpass.logging.Lumber;
import de.rki.covpass.sdk.cert.models.CovCertificate;
import de.rki.covpass.sdk.cert.models.Recovery;
import de.rki.covpass.sdk.cert.models.TestCert;
import de.rki.covpass.sdk.cert.models.Vaccination;
import f8.e;
import gc.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.b1;
import s4.l0;
import s4.m;
import s4.x;
import tb.e0;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lf8/h;", "Ls4/i;", "Lf8/e;", "Ld9/k;", "n", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "covCertificate", "Ltb/e0;", "p", "o", BuildConfig.FLAVOR, "qrContent", "q", "Ls4/l0;", BuildConfig.FLAVOR, "recoveryOlder90DaysValid", "Ls4/l0;", "m", "()Ls4/l0;", "Lkotlinx/coroutines/q0;", "scope", "Ld9/u;", "qrCoder", "euRulesValidator", "domesticRulesValidator", "Lh9/g;", "revocationRemoteListRepository", "Lv8/b;", "checkContextRepository", "<init>", "(Lkotlinx/coroutines/q0;Ld9/u;Ld9/k;Ld9/k;Lh9/g;Lv8/b;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h extends s4.i<e> {

    /* renamed from: d */
    private final u f9926d;

    /* renamed from: e */
    private final d9.k f9927e;

    /* renamed from: f */
    private final d9.k f9928f;

    /* renamed from: g */
    private final h9.g f9929g;

    /* renamed from: h */
    private final v8.b f9930h;

    /* renamed from: i */
    private final l0<Boolean> f9931i;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$handleNegativeAntigenResult$1", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<e, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;
        final /* synthetic */ TestCert W3;

        /* renamed from: y */
        int f9932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CovCertificate covCertificate, TestCert testCert, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
            this.W3 = testCert;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9932y == 0) {
                t.b(obj);
                ((e) this.U3).t(this.V3, this.W3.b());
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(e eVar, xb.d<? super e0> dVar) {
            return ((a) j(eVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, this.W3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$handleNegativePcrResult$1", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements p<e, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ CovCertificate V3;
        final /* synthetic */ TestCert W3;

        /* renamed from: y */
        int f9933y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CovCertificate covCertificate, TestCert testCert, xb.d<? super b> dVar) {
            super(2, dVar);
            this.V3 = covCertificate;
            this.W3 = testCert;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9933y == 0) {
                t.b(obj);
                ((e) this.U3).o(this.V3, this.W3.b());
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(e eVar, xb.d<? super e0> dVar) {
            return ((b) j(eVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, this.W3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$onQrContentReceived$1", f = "CovPassCheckQRScannerViewModel.kt", l = {61}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        Object U3;
        int V3;
        final /* synthetic */ String X3;

        /* renamed from: y */
        Object f9934y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$onQrContentReceived$1$1", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zb.l implements p<f8.e, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ CovCertificate V3;

            /* renamed from: y */
            int f9935y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CovCertificate covCertificate, xb.d<? super a> dVar) {
                super(2, dVar);
                this.V3 = covCertificate;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f9935y == 0) {
                    t.b(obj);
                    ((f8.e) this.U3).q(this.V3);
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(f8.e eVar, xb.d<? super e0> dVar) {
                return ((a) j(eVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                a aVar = new a(this.V3, dVar);
                aVar.U3 = obj;
                return aVar;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$onQrContentReceived$1$3", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zb.l implements p<f8.e, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ CovCertificate V3;

            /* renamed from: y */
            int f9936y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CovCertificate covCertificate, xb.d<? super b> dVar) {
                super(2, dVar);
                this.V3 = covCertificate;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f9936y == 0) {
                    t.b(obj);
                    ((f8.e) this.U3).n(true, this.V3);
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(f8.e eVar, xb.d<? super e0> dVar) {
                return ((b) j(eVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                b bVar = new b(this.V3, dVar);
                bVar.U3 = obj;
                return bVar;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$onQrContentReceived$1$4", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: f8.h$c$c */
        /* loaded from: classes.dex */
        public static final class C0148c extends zb.l implements p<f8.e, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ CovCertificate V3;

            /* renamed from: y */
            int f9937y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0148c(CovCertificate covCertificate, xb.d<? super C0148c> dVar) {
                super(2, dVar);
                this.V3 = covCertificate;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f9937y == 0) {
                    t.b(obj);
                    e.a.a((f8.e) this.U3, false, this.V3, 1, null);
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(f8.e eVar, xb.d<? super e0> dVar) {
                return ((C0148c) j(eVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                C0148c c0148c = new C0148c(this.V3, dVar);
                c0148c.U3 = obj;
                return c0148c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lf8/e;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.scanner.CovPassCheckQRScannerViewModel$onQrContentReceived$1$5", f = "CovPassCheckQRScannerViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends zb.l implements p<f8.e, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;

            /* renamed from: y */
            int f9938y;

            d(xb.d<? super d> dVar) {
                super(2, dVar);
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f9938y == 0) {
                    t.b(obj);
                    e.a.a((f8.e) this.U3, true, null, 2, null);
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(f8.e eVar, xb.d<? super e0> dVar) {
                return ((d) j(eVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                d dVar2 = new d(dVar);
                dVar2.U3 = obj;
                return dVar2;
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class e {

            /* renamed from: a */
            public static final /* synthetic */ int[] f9939a;

            static {
                int[] iArr = new int[i8.a.values().length];
                iArr[i8.a.Success.ordinal()] = 1;
                iArr[i8.a.TechnicalError.ordinal()] = 2;
                iArr[i8.a.ValidationError.ordinal()] = 3;
                f9939a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, xb.d<? super c> dVar) {
            super(2, dVar);
            h.this = r1;
            this.X3 = str;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            CovCertificate covCertificate;
            de.rki.covpass.sdk.cert.models.e eVar;
            int i10;
            x<f8.e> f10;
            p<? super f8.e, ? super xb.d<? super e0>, ? extends Object> aVar;
            c10 = yb.d.c();
            int i11 = this.V3;
            boolean z10 = true;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    covCertificate = u.c(h.this.f9926d, this.X3, false, 2, null);
                    de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
                    s.b(d10.a());
                    d9.k n10 = h.this.n();
                    h9.g gVar = h.this.f9929g;
                    boolean booleanValue = h.this.m().getValue().booleanValue();
                    this.f9934y = covCertificate;
                    this.U3 = d10;
                    this.V3 = 1;
                    Object a10 = i8.b.a(covCertificate, n10, gVar, booleanValue, this);
                    if (a10 == c10) {
                        return c10;
                    }
                    eVar = d10;
                    obj = a10;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    eVar = (de.rki.covpass.sdk.cert.models.e) this.U3;
                    covCertificate = (CovCertificate) this.f9934y;
                    t.b(obj);
                }
                i10 = e.f9939a[((i8.a) obj).ordinal()];
            } catch (Exception e10) {
                if (Lumber.Companion.getEnabled()) {
                    timber.log.a.f22457a.e(e10, null, new Object[0]);
                }
                h.this.f().f(new d(null));
            }
            if (i10 == 1) {
                if (!(eVar instanceof Vaccination)) {
                    z10 = eVar instanceof Recovery;
                }
                if (!z10) {
                    if (!(eVar instanceof TestCert)) {
                        throw new tb.p();
                    }
                    if (((TestCert) eVar).getType() == de.rki.covpass.sdk.cert.models.j.NEGATIVE_PCR_TEST) {
                        h.this.p(covCertificate);
                    } else {
                        h.this.o(covCertificate);
                    }
                    return e0.f22152a;
                }
                f10 = h.this.f();
                aVar = new a(covCertificate, null);
            } else if (i10 == 2) {
                f10 = h.this.f();
                aVar = new b(covCertificate, null);
            } else if (i10 != 3) {
                return e0.f22152a;
            } else {
                f10 = h.this.f();
                aVar = new C0148c(covCertificate, null);
            }
            f10.f(aVar);
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((c) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new c(this.X3, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q0 q0Var, u uVar, d9.k kVar, d9.k kVar2, h9.g gVar, v8.b bVar) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
        hc.t.e(uVar, "qrCoder");
        hc.t.e(kVar, "euRulesValidator");
        hc.t.e(kVar2, "domesticRulesValidator");
        hc.t.e(gVar, "revocationRemoteListRepository");
        hc.t.e(bVar, "checkContextRepository");
        this.f9926d = uVar;
        this.f9927e = kVar;
        this.f9928f = kVar2;
        this.f9929g = gVar;
        this.f9930h = bVar;
        this.f9931i = b1.b(Boolean.TRUE, null, 2, null);
    }

    public /* synthetic */ h(q0 q0Var, u uVar, d9.k kVar, d9.k kVar2, h9.g gVar, v8.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? f9.d.a().O0() : uVar, (i10 & 4) != 0 ? f9.d.a().I0() : kVar, (i10 & 8) != 0 ? f9.d.a().C0() : kVar2, (i10 & 16) != 0 ? f9.d.a().X0() : gVar, (i10 & 32) != 0 ? l8.b.a().b() : bVar);
    }

    public final d9.k n() {
        return this.f9930h.b().getValue().booleanValue() ? this.f9928f : this.f9927e;
    }

    public final void o(CovCertificate covCertificate) {
        de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
        hc.t.c(d10, "null cannot be cast to non-null type de.rki.covpass.sdk.cert.models.TestCert");
        f().f(new a(covCertificate, (TestCert) d10, null));
    }

    public final void p(CovCertificate covCertificate) {
        de.rki.covpass.sdk.cert.models.e d10 = covCertificate.d();
        hc.t.c(d10, "null cannot be cast to non-null type de.rki.covpass.sdk.cert.models.TestCert");
        f().f(new b(covCertificate, (TestCert) d10, null));
    }

    public final l0<Boolean> m() {
        return this.f9931i;
    }

    public final void q(String str) {
        hc.t.e(str, "qrContent");
        m.a.b(this, null, null, null, null, new c(str, null), 15, null);
    }
}
