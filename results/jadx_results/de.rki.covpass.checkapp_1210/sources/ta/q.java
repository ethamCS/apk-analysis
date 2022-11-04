package ta;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.h1;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/b0;", "requestJob", "Lkotlinx/coroutines/a2;", "clientEngineJob", "Ltb/e0;", "b", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class q {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ h1 f22103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1 h1Var) {
            super(1);
            this.f22103c = h1Var;
        }

        public final void b(Throwable th2) {
            this.f22103c.g();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "cause", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ b0 f22104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var) {
            super(1);
            this.f22104c = b0Var;
        }

        public final void b(Throwable th2) {
            if (th2 != null) {
                e2.c(this.f22104c, "Engine failed", th2);
            } else {
                this.f22104c.V();
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    public static final void b(b0 b0Var, a2 a2Var) {
        io.ktor.utils.io.s.a(a2Var);
        b0Var.D0(new a(a2Var.D0(new b(b0Var))));
    }
}
