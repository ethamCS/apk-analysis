package eg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\"\u001c\u0010\u0013\u001a\u00020\n*\u00060\u000fj\u0002`\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljava/io/OutputStream;", "Leg/y;", "e", "Ljava/io/InputStream;", "Leg/a0;", "i", "Ljava/net/Socket;", "f", "j", "Ljava/io/File;", BuildConfig.FLAVOR, "append", "d", "b", "h", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 5, 1}, xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class o {

    /* renamed from: a */
    private static final Logger f9633a = Logger.getLogger("okio.Okio");

    public static final y b(File file) {
        hc.t.e(file, "<this>");
        return n.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        hc.t.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message == null ? false : bf.y.N(message, "getsockname failed", false, 2, null);
        }
        return false;
    }

    public static final y d(File file, boolean z10) {
        hc.t.e(file, "<this>");
        return n.g(new FileOutputStream(file, z10));
    }

    public static final y e(OutputStream outputStream) {
        hc.t.e(outputStream, "<this>");
        return new r(outputStream, new b0());
    }

    public static final y f(Socket socket) {
        hc.t.e(socket, "<this>");
        z zVar = new z(socket);
        OutputStream outputStream = socket.getOutputStream();
        hc.t.d(outputStream, "getOutputStream()");
        return zVar.x(new r(outputStream, zVar));
    }

    public static /* synthetic */ y g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return n.f(file, z10);
    }

    public static final a0 h(File file) {
        hc.t.e(file, "<this>");
        return new m(new FileInputStream(file), b0.f9596d);
    }

    public static final a0 i(InputStream inputStream) {
        hc.t.e(inputStream, "<this>");
        return new m(inputStream, new b0());
    }

    public static final a0 j(Socket socket) {
        hc.t.e(socket, "<this>");
        z zVar = new z(socket);
        InputStream inputStream = socket.getInputStream();
        hc.t.d(inputStream, "getInputStream()");
        return zVar.y(new m(inputStream, zVar));
    }
}
