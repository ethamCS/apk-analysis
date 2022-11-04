package g;

import java.util.Objects;
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public j(t<?> tVar) {
        super(a(tVar));
        tVar.b();
        tVar.e();
    }

    private static String a(t<?> tVar) {
        Objects.requireNonNull(tVar, "response == null");
        return "HTTP " + tVar.b() + " " + tVar.e();
    }
}
