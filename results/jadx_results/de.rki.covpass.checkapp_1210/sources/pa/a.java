package pa;

import bb.c;
import db.a;
import gc.p;
import gc.q;
import io.ktor.utils.io.h;
import io.ktor.utils.io.k;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlinx.coroutines.t1;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import xb.d;
import xb.g;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012(\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lpa/a;", "Ldb/a$c;", "Lio/ktor/utils/io/h;", "d", "Lbb/c;", "b", "()Lbb/c;", "contentType", BuildConfig.FLAVOR, "a", "()Ljava/lang/Long;", "contentLength", "Lbb/l;", "c", "()Lbb/l;", "headers", "Ldb/a;", "delegate", "Lxb/g;", "callContext", "Lkotlin/Function3;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "listener", "<init>", "(Ldb/a;Lxb/g;Lgc/q;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a extends a.c {

    /* renamed from: a */
    private final g f19021a;

    /* renamed from: b */
    private final q<Long, Long, d<? super e0>, Object> f19022b;

    /* renamed from: c */
    private final h f19023c;

    /* renamed from: d */
    private final db.a f19024d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @f(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: pa.a$a */
    /* loaded from: classes.dex */
    public static final class C0299a extends l implements p<u, d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ db.a V3;

        /* renamed from: y */
        int f19025y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0299a(db.a aVar, d<? super C0299a> dVar) {
            super(2, dVar);
            this.V3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f19025y;
            if (i10 == 0) {
                t.b(obj);
                k e10 = ((u) this.U3).e();
                this.f19025y = 1;
                if (((a.d) this.V3).d(e10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(u uVar, d<? super e0> dVar) {
            return ((C0299a) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final d<e0> j(Object obj, d<?> dVar) {
            C0299a c0299a = new C0299a(this.V3, dVar);
            c0299a.U3 = obj;
            return c0299a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(db.a aVar, g gVar, q<? super Long, ? super Long, ? super d<? super e0>, ? extends Object> qVar) {
        h hVar;
        hc.t.e(aVar, "delegate");
        hc.t.e(gVar, "callContext");
        hc.t.e(qVar, "listener");
        this.f19021a = gVar;
        this.f19022b = qVar;
        if (aVar instanceof a.AbstractC0130a) {
            hVar = io.ktor.utils.io.d.a(((a.AbstractC0130a) aVar).d());
        } else if (aVar instanceof a.b) {
            hVar = h.Companion.a();
        } else if (aVar instanceof a.c) {
            hVar = ((a.c) aVar).d();
        } else if (!(aVar instanceof a.d)) {
            throw new tb.p();
        } else {
            hVar = io.ktor.utils.io.p.c(t1.f15571c, gVar, true, new C0299a(aVar, null)).e();
        }
        this.f19023c = hVar;
        this.f19024d = aVar;
    }

    @Override // db.a
    public Long a() {
        return this.f19024d.a();
    }

    @Override // db.a
    public c b() {
        return this.f19024d.b();
    }

    @Override // db.a
    public bb.l c() {
        return this.f19024d.c();
    }

    @Override // db.a.c
    public h d() {
        return ab.a.a(this.f19023c, this.f19021a, a(), this.f19022b);
    }
}
