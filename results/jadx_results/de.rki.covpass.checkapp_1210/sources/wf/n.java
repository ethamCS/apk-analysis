package wf;

import hc.t;
import java.io.IOException;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwf/n;", "Ljava/io/IOException;", "Lwf/b;", "errorCode", "<init>", "(Lwf/b;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n extends IOException {

    /* renamed from: c */
    public final b f25078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(t.l("stream was reset: ", bVar));
        t.e(bVar, "errorCode");
        this.f25078c = bVar;
    }
}
