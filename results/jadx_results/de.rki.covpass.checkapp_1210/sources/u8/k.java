package u8;

import androidx.camera.core.n1;
import gc.p;
import hc.q;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.m;
import tb.e0;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lu8/k;", "Ls4/i;", BuildConfig.FLAVOR, "Landroidx/camera/core/n1;", "image", "Ltb/e0;", "k", "Lkotlinx/coroutines/flow/o;", BuildConfig.FLAVOR, "scanResults", "Lkotlinx/coroutines/flow/o;", "j", "()Lkotlinx/coroutines/flow/o;", "Lkotlinx/coroutines/q0;", "scope", "<init>", "(Lkotlinx/coroutines/q0;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k extends s4.i<Object> {

    /* renamed from: d */
    private final o<n1> f23322d = u.b(0, 1, null, 5, null);

    /* renamed from: e */
    private final o<String> f23323e = u.b(0, 1, df.h.DROP_OLDEST, 1, null);

    /* renamed from: f */
    private final List<gc.l<c4.l, List<String>>> f23324f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerViewModel$1", f = "QRScannerViewModel.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f23325y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/camera/core/n1;", "it", "Ltb/e0;", "a", "(Landroidx/camera/core/n1;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: u8.k$a$a */
        /* loaded from: classes.dex */
        public static final class C0402a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ k f23326c;

            @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Function1;", "Lc4/l;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "detector", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerViewModel$1$1$1$1", f = "QRScannerViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: u8.k$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0403a extends zb.l implements p<gc.l<? super c4.l, ? extends List<? extends String>>, xb.d<? super e0>, Object> {
                /* synthetic */ Object U3;
                final /* synthetic */ c4.l V3;
                final /* synthetic */ k W3;

                /* renamed from: y */
                int f23327y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0403a(c4.l lVar, k kVar, xb.d<? super C0403a> dVar) {
                    super(2, dVar);
                    this.V3 = lVar;
                    this.W3 = kVar;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    yb.d.c();
                    if (this.f23327y == 0) {
                        t.b(obj);
                        for (String str : (List) ((gc.l) this.U3).invoke(this.V3)) {
                            this.W3.j().e(str);
                        }
                        return e0.f22152a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: d0 */
                public final Object u(gc.l<? super c4.l, ? extends List<String>> lVar, xb.d<? super e0> dVar) {
                    return ((C0403a) j(lVar, dVar)).B(e0.f22152a);
                }

                @Override // zb.a
                public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                    C0403a c0403a = new C0403a(this.V3, this.W3, dVar);
                    c0403a.U3 = obj;
                    return c0403a;
                }
            }

            @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerViewModel$1$1", f = "QRScannerViewModel.kt", l = {30}, m = "emit")
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: u8.k$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends zb.d {
                final /* synthetic */ C0402a<T> U3;
                int V3;

                /* renamed from: x */
                Object f23328x;

                /* renamed from: y */
                /* synthetic */ Object f23329y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0402a<? super T> c0402a, xb.d<? super b> dVar) {
                    super(dVar);
                    this.U3 = c0402a;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    this.f23329y = obj;
                    this.V3 |= Integer.MIN_VALUE;
                    return this.U3.c(null, this);
                }
            }

            C0402a(k kVar) {
                this.f23326c = kVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.AutoCloseable] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Throwable, xb.d] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(androidx.camera.core.n1 r10, xb.d<? super tb.e0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof u8.k.a.C0402a.b
                    if (r0 == 0) goto L13
                    r0 = r11
                    u8.k$a$a$b r0 = (u8.k.a.C0402a.b) r0
                    int r1 = r0.V3
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.V3 = r1
                    goto L18
                L13:
                    u8.k$a$a$b r0 = new u8.k$a$a$b
                    r0.<init>(r9, r11)
                L18:
                    r4 = r0
                    java.lang.Object r11 = r4.f23329y
                    java.lang.Object r0 = yb.b.c()
                    int r1 = r4.V3
                    r7 = 0
                    r2 = 1
                    if (r1 == 0) goto L39
                    if (r1 != r2) goto L31
                    java.lang.Object r10 = r4.f23328x
                    java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
                    tb.t.b(r11)     // Catch: java.lang.Throwable -> L2f
                    goto L5e
                L2f:
                    r11 = move-exception
                    goto L64
                L31:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L39:
                    tb.t.b(r11)
                    u8.k r11 = r9.f23326c
                    c4.l r1 = u8.l.c(r10)     // Catch: java.lang.Throwable -> L2f
                    java.util.List r3 = u8.k.h(r11)     // Catch: java.lang.Throwable -> L2f
                    r5 = 0
                    u8.k$a$a$a r6 = new u8.k$a$a$a     // Catch: java.lang.Throwable -> L2f
                    r6.<init>(r1, r11, r7)     // Catch: java.lang.Throwable -> L2f
                    r11 = 1
                    r8 = 0
                    r4.f23328x = r10     // Catch: java.lang.Throwable -> L2f
                    r4.V3 = r2     // Catch: java.lang.Throwable -> L2f
                    r1 = r3
                    r2 = r5
                    r3 = r6
                    r5 = r11
                    r6 = r8
                    java.lang.Object r11 = z9.e.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
                    if (r11 != r0) goto L5e
                    return r0
                L5e:
                    tb.e0 r11 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L2f
                    ec.a.a(r10, r7)
                    return r11
                L64:
                    throw r11     // Catch: java.lang.Throwable -> L65
                L65:
                    r0 = move-exception
                    ec.a.a(r10, r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: u8.k.a.C0402a.c(androidx.camera.core.n1, xb.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            k.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23325y;
            if (i10 == 0) {
                t.b(obj);
                o oVar = k.this.f23322d;
                C0402a c0402a = new C0402a(k.this);
                this.f23325y = 1;
                if (oVar.a(c0402a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            throw new tb.i();
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends q implements gc.l<c4.l, List<? extends String>> {
        public static final b Y3 = new b();

        b() {
            super(1, l.class, "detectQr", "detectQr(Lboofcv/struct/image/GrayU8;)Ljava/util/List;", 1);
        }

        /* renamed from: i0 */
        public final List<String> invoke(c4.l lVar) {
            hc.t.e(lVar, "p0");
            return l.a(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class c extends q implements gc.l<c4.l, List<? extends String>> {
        public static final c Y3 = new c();

        c() {
            super(1, l.class, "detectQrTransposed", "detectQrTransposed(Lboofcv/struct/image/GrayU8;)Ljava/util/List;", 1);
        }

        /* renamed from: i0 */
        public final List<String> invoke(c4.l lVar) {
            hc.t.e(lVar, "p0");
            return l.b(lVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q0 q0Var) {
        super(q0Var);
        List<gc.l<c4.l, List<String>>> k10;
        hc.t.e(q0Var, "scope");
        k10 = ub.u.k(b.Y3, c.Y3);
        this.f23324f = k10;
        m.a.b(this, s4.l.a().b(), null, null, null, new a(null), 10, null);
    }

    public final o<String> j() {
        return this.f23323e;
    }

    public final void k(n1 n1Var) {
        hc.t.e(n1Var, "image");
        if (!this.f23322d.e(n1Var)) {
            n1Var.close();
        }
    }
}
