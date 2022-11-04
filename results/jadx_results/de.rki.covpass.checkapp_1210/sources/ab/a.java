package ab;

import gc.p;
import gc.q;
import hc.t;
import io.ktor.utils.io.h;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlinx.coroutines.t1;
import org.conscrypt.BuildConfig;
import tb.e0;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aR\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/h;", "Lxb/g;", "context", BuildConfig.FLAVOR, "contentLength", "Lkotlin/Function3;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "listener", "a", "(Lio/ktor/utils/io/h;Lxb/g;Ljava/lang/Long;Lgc/q;)Lio/ktor/utils/io/h;", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lio/ktor/utils/io/u;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {22, 23, 25, 30}, m = "invokeSuspend")
    /* renamed from: ab.a$a */
    /* loaded from: classes.dex */
    public static final class C0002a extends l implements p<u, xb.d<? super e0>, Object> {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        long Y3;
        long Z3;

        /* renamed from: a4 */
        int f230a4;

        /* renamed from: b4 */
        int f231b4;

        /* renamed from: c4 */
        private /* synthetic */ Object f232c4;

        /* renamed from: d4 */
        final /* synthetic */ Long f233d4;

        /* renamed from: e4 */
        final /* synthetic */ h f234e4;

        /* renamed from: f4 */
        final /* synthetic */ q<Long, Long, xb.d<? super e0>, Object> f235f4;

        /* renamed from: y */
        Object f236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0002a(Long l10, h hVar, q<? super Long, ? super Long, ? super xb.d<? super e0>, ? extends Object> qVar, xb.d<? super C0002a> dVar) {
            super(2, dVar);
            this.f233d4 = l10;
            this.f234e4 = hVar;
            this.f235f4 = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:34:0x00e5, B:36:0x00eb, B:39:0x0104, B:51:0x016e, B:55:0x0181, B:58:0x01a0), top: B:67:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0159 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x016e A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:34:0x00e5, B:36:0x00eb, B:39:0x0104, B:51:0x016e, B:55:0x0181, B:58:0x01a0), top: B:67:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015a -> B:48:0x0164). Please submit an issue!!! */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ab.a.C0002a.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(u uVar, xb.d<? super e0> dVar) {
            return ((C0002a) j(uVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            C0002a c0002a = new C0002a(this.f233d4, this.f234e4, this.f235f4, dVar);
            c0002a.f232c4 = obj;
            return c0002a;
        }
    }

    public static final h a(h hVar, xb.g gVar, Long l10, q<? super Long, ? super Long, ? super xb.d<? super e0>, ? extends Object> qVar) {
        t.e(hVar, "<this>");
        t.e(gVar, "context");
        t.e(qVar, "listener");
        return io.ktor.utils.io.p.c(t1.f15571c, gVar, true, new C0002a(l10, hVar, qVar, null)).e();
    }
}
