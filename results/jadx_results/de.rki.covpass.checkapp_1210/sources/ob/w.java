package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lob/w;", "Lob/v;", "Lpb/a;", "head", BuildConfig.FLAVOR, "remaining", "Lrb/f;", "pool", "<init>", "(Lpb/a;JLrb/f;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class w extends v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pb.a aVar, long j10, rb.f<pb.a> fVar) {
        super(aVar, j10, fVar);
        hc.t.e(aVar, "head");
        hc.t.e(fVar, "pool");
    }
}
