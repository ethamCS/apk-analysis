package s8;

import gc.p;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import s4.i;
import s4.m;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Ls8/e;", "Ls4/i;", "Ls8/c;", "Ljava/io/InputStream;", "inputStream", "Ljava/io/OutputStream;", "outputStream", "Ltb/e0;", "h", "Lkotlinx/coroutines/q0;", "scope", "<init>", "(Lkotlinx/coroutines/q0;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e extends i<c> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.pdfexport.SavePdfViewModel$copyFile$1", f = "SavePdfViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ OutputStream U3;
        final /* synthetic */ e V3;
        final /* synthetic */ InputStream W3;

        /* renamed from: y */
        int f21538y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ls8/c;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.commonapp.pdfexport.SavePdfViewModel$copyFile$1$2", f = "SavePdfViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: s8.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0361a extends l implements p<c, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;

            /* renamed from: y */
            int f21539y;

            C0361a(xb.d<? super C0361a> dVar) {
                super(2, dVar);
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f21539y == 0) {
                    t.b(obj);
                    ((c) this.U3).A();
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object u(c cVar, xb.d<? super e0> dVar) {
                return ((C0361a) j(cVar, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                C0361a c0361a = new C0361a(dVar);
                c0361a.U3 = obj;
                return c0361a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, e eVar, InputStream inputStream, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = outputStream;
            this.V3 = eVar;
            this.W3 = inputStream;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Throwable, xb.d, java.lang.Object] */
        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f21538y == 0) {
                t.b(obj);
                InputStream inputStream = this.U3;
                th = 0;
                try {
                    dc.a.b(this.W3, inputStream, 0, 2, th);
                    dc.b.a(inputStream, th);
                    this.V3.f().f(new C0361a(th));
                    return e0.f22152a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        dc.b.a(inputStream, th2);
                    }
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, this.V3, this.W3, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q0 q0Var) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
    }

    public final void h(InputStream inputStream, OutputStream outputStream) {
        hc.t.e(inputStream, "inputStream");
        hc.t.e(outputStream, "outputStream");
        m.a.b(this, s4.l.a().a(), null, null, null, new a(outputStream, this, inputStream, null), 14, null);
    }
}
