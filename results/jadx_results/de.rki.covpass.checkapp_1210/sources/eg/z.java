package eg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, d2 = {"Leg/z;", "Leg/a;", "Ljava/io/IOException;", "cause", "v", "Ltb/e0;", "z", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class z extends a {

    /* renamed from: k */
    private final Socket f9663k;

    public z(Socket socket) {
        hc.t.e(socket, "socket");
        this.f9663k = socket;
    }

    @Override // eg.a
    protected IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.AssertionError] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.logging.Logger] */
    @Override // eg.a
    protected void z() {
        ?? e10;
        ?? r22;
        try {
            this.f9663k.close();
        } catch (AssertionError e11) {
            e10 = e11;
            if (!n.e(e10)) {
                throw e10;
            }
            r22 = o.f9633a;
            r22.log(Level.WARNING, hc.t.l("Failed to close timed out socket ", this.f9663k), e10);
        } catch (Exception e12) {
            e10 = e12;
            r22 = o.f9633a;
            r22.log(Level.WARNING, hc.t.l("Failed to close timed out socket ", this.f9663k), e10);
        }
    }
}
