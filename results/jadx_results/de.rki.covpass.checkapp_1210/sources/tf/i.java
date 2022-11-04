package tf;

import hc.t;
import java.io.IOException;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0004\u0010\n¨\u0006\u000f"}, d2 = {"Ltf/i;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Ltb/e0;", "b", "firstConnectException", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* renamed from: c */
    private final IOException f22306c;

    /* renamed from: d */
    private IOException f22307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException iOException) {
        super(iOException);
        t.e(iOException, "firstConnectException");
        this.f22306c = iOException;
        this.f22307d = iOException;
    }

    public final void b(IOException iOException) {
        t.e(iOException, "e");
        tb.f.a(this.f22306c, iOException);
        this.f22307d = iOException;
    }

    public final IOException c() {
        return this.f22306c;
    }

    public final IOException e() {
        return this.f22307d;
    }
}
