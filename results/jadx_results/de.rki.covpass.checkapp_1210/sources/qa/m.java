package qa;

import hc.v;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "cause", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m extends v implements gc.l<Throwable, e0> {

    /* renamed from: c */
    final /* synthetic */ a2 f19772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a2 a2Var) {
        super(1);
        this.f19772c = a2Var;
    }

    public final void b(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.f19772c.r(new CancellationException(th2.getMessage()));
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
        b(th2);
        return e0.f22152a;
    }
}
