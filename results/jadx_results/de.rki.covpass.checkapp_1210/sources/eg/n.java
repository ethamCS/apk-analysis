package eg;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"eg/o", "eg/p"}, d2 = {}, k = 4, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class n {
    public static final y a(File file) {
        return o.b(file);
    }

    public static final y b() {
        return p.a();
    }

    public static final d c(y yVar) {
        return p.b(yVar);
    }

    public static final e d(a0 a0Var) {
        return p.c(a0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return o.c(assertionError);
    }

    public static final y f(File file, boolean z10) {
        return o.d(file, z10);
    }

    public static final y g(OutputStream outputStream) {
        return o.e(outputStream);
    }

    public static final y h(Socket socket) {
        return o.f(socket);
    }

    public static final a0 j(File file) {
        return o.h(file);
    }

    public static final a0 k(InputStream inputStream) {
        return o.i(inputStream);
    }

    public static final a0 l(Socket socket) {
        return o.j(socket);
    }
}
