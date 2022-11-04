package ra;

import bb.u;
import db.a;
import e.j;
import gc.p;
import io.ktor.utils.io.k;
import java.util.List;
import kotlin.Metadata;
import tb.e0;
import tb.t;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Ldb/a;", "Ljava/io/OutputStream;", "stream", "Lxb/g;", "callContext", "Ltb/e0;", "b", "(Ldb/a;Ljava/io/OutputStream;Lxb/g;Lxb/d;)Ljava/lang/Object;", "ktor-client-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final List<u> f20567a;

    @f(c = "io.ktor.client.engine.android.AndroidClientEngineKt", f = "AndroidClientEngine.kt", l = {120, 127}, m = "writeTo")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        int U3;

        /* renamed from: x */
        Object f20568x;

        /* renamed from: y */
        /* synthetic */ Object f20569y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f20569y = obj;
            this.U3 |= Integer.MIN_VALUE;
            return c.b(null, null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @f(c = "io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1", f = "AndroidClientEngine.kt", l = {j.K0}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<io.ktor.utils.io.u, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ db.a V3;

        /* renamed from: y */
        int f20570y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(db.a aVar, xb.d<? super b> dVar) {
            super(2, dVar);
            this.V3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f20570y;
            if (i10 == 0) {
                t.b(obj);
                k e10 = ((io.ktor.utils.io.u) this.U3).e();
                this.f20570y = 1;
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
        public final Object u(io.ktor.utils.io.u uVar, xb.d<? super e0> dVar) {
            return ((b) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    static {
        List<u> k10;
        u.a aVar = u.Companion;
        k10 = ub.u.k(aVar.a(), aVar.b());
        f20567a = k10;
    }

    public static final /* synthetic */ List a() {
        return f20567a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:2|(2:4|(8:6|8|53|(1:(1:(5:12|13|39|40|41)(2:14|15))(6:16|17|30|39|40|41))(8:20|50|21|(1:23)(2:24|(2:26|(1:28)(5:29|30|39|40|41))(2:31|(2:33|(1:35))(2:36|(2:42|43))))|38|39|40|41)|18|19|51|46))|7|8|53|(0)(0)|18|19|51|46|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Throwable, xb.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(db.a r16, java.io.OutputStream r17, xb.g r18, xb.d<? super tb.e0> r19) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.c.b(db.a, java.io.OutputStream, xb.g, xb.d):java.lang.Object");
    }
}
