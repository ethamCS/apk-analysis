package e.m0.i;

import e.i0;
import e.q;
import e.r;
import e.y;
import e.z;
import java.util.List;
/* loaded from: classes.dex */
public final class e {
    static {
        f.f.j("\"\\");
        f.f.j("\t ,=");
    }

    public static long a(y yVar) {
        return h(yVar.c("Content-Length"));
    }

    public static long b(i0 i0Var) {
        return a(i0Var.g0());
    }

    public static boolean c(i0 i0Var) {
        if (i0Var.m0().f().equals("HEAD")) {
            return false;
        }
        int k = i0Var.k();
        return (((k >= 100 && k < 200) || k == 204 || k == 304) && b(i0Var) == -1 && !"chunked".equalsIgnoreCase(i0Var.N("Transfer-Encoding"))) ? false : true;
    }

    public static int d(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void e(r rVar, z zVar, y yVar) {
        if (rVar == r.f4387a) {
            return;
        }
        List<q> f2 = q.f(zVar, yVar);
        if (f2.isEmpty()) {
            return;
        }
        rVar.b(zVar, f2);
    }

    public static int f(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int g(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    private static long h(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
