package zd;

import hc.t;
import java.util.List;
/* loaded from: classes3.dex */
public final class n {
    public static final String a(wd.d dVar) {
        t.e(dVar, "<this>");
        List<wd.f> h10 = dVar.h();
        t.d(h10, "pathSegments()");
        return c(h10);
    }

    public static final String b(wd.f fVar) {
        t.e(fVar, "<this>");
        if (!d(fVar)) {
            String b10 = fVar.b();
            t.d(b10, "asString()");
            return b10;
        }
        StringBuilder sb2 = new StringBuilder();
        String b11 = fVar.b();
        t.d(b11, "asString()");
        sb2.append('`' + b11);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List<wd.f> list) {
        t.e(list, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (wd.f fVar : list) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final boolean d(wd.f fVar) {
        boolean z10;
        String b10 = fVar.b();
        t.d(b10, "asString()");
        if (!i.f26693a.contains(b10)) {
            int i10 = 0;
            while (true) {
                if (i10 >= b10.length()) {
                    z10 = false;
                    break;
                }
                char charAt = b10.charAt(i10);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
