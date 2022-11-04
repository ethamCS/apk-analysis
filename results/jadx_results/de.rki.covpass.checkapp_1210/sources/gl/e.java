package gl;

import java.io.PrintStream;
import java.util.Arrays;
import rk.a0;
import rk.c0;
import rk.d0;
import rk.e0;
import rk.f;
import rk.g0;
import rk.k;
import rk.o;
import rk.p;
import rk.v;
import rk.z;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    public static String f11068a = "%.8E";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11069a;

        static {
            int[] iArr = new int[e0.values().length];
            f11069a = iArr;
            try {
                iArr[e0.DDRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11069a[e0.FDRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11069a[e0.ZDRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11069a[e0.CDRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11069a[e0.DSCC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11069a[e0.DTRIPLET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11069a[e0.FSCC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11069a[e0.FTRIPLET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static String a(c0 c0Var) {
        return c0Var.getType() == e0.UNSPECIFIED ? c0Var.getClass().getSimpleName() : c0Var.getType().name();
    }

    public static void b(PrintStream printStream, rk.b bVar, String str) {
        q(printStream, bVar);
        String str2 = str + " ";
        rk.e eVar = new rk.e();
        for (int i10 = 0; i10 < bVar.Z(); i10++) {
            for (int i11 = 0; i11 < bVar.w(); i11++) {
                bVar.P(i10, i11, eVar);
                printStream.printf(str2, Float.valueOf(eVar.f21270a), Float.valueOf(eVar.f21271b));
                if (i11 < bVar.w() - 1) {
                    printStream.print(" , ");
                }
            }
            printStream.println();
        }
    }

    public static void c(PrintStream printStream, k kVar) {
        d(printStream, kVar, "%11.4E");
    }

    public static void d(PrintStream printStream, k kVar, String str) {
        if (str.equalsIgnoreCase("matlab")) {
            o(printStream, kVar);
        } else if (str.equalsIgnoreCase("java")) {
            m(printStream, kVar, str);
        } else {
            q(printStream, kVar);
            String str2 = str + " ";
            for (int i10 = 0; i10 < kVar.Z(); i10++) {
                for (int i11 = 0; i11 < kVar.w(); i11++) {
                    printStream.printf(str2, Double.valueOf(kVar.d(i10, i11)));
                }
                printStream.println();
            }
        }
    }

    public static void e(PrintStream printStream, o oVar, String str) {
        if (str.equalsIgnoreCase("matlab")) {
            o(printStream, oVar);
            return;
        }
        q(printStream, oVar);
        int length = String.format(str, Double.valueOf(-1.1123d)).length();
        char[] cArr = new char[length];
        Arrays.fill(cArr, ' ');
        cArr[length / 2] = '*';
        for (int i10 = 0; i10 < oVar.f21304y; i10++) {
            for (int i11 = 0; i11 < oVar.U3; i11++) {
                int f10 = oVar.f(i10, i11);
                if (f10 >= 0) {
                    printStream.printf(str, Double.valueOf(oVar.f21300c[f10]));
                } else {
                    printStream.print(cArr);
                }
                if (i11 != oVar.U3 - 1) {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }
    }

    public static void f(PrintStream printStream, p pVar, String str) {
        q(printStream, pVar);
        for (int i10 = 0; i10 < pVar.f21308x; i10++) {
            for (int i11 = 0; i11 < pVar.f21309y; i11++) {
                int c10 = pVar.c(i10, i11);
                if (c10 >= 0) {
                    printStream.printf(str, Double.valueOf(pVar.f21306d.f21286a[c10]));
                } else {
                    printStream.print("   *  ");
                }
                if (i11 != pVar.f21309y - 1) {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }
    }

    public static void g(PrintStream printStream, v vVar) {
        h(printStream, vVar, "%11.4E");
    }

    public static void h(PrintStream printStream, v vVar, String str) {
        if (str.equalsIgnoreCase("matlab")) {
            p(printStream, vVar);
        } else if (str.equalsIgnoreCase("java")) {
            n(printStream, vVar, str);
        } else {
            q(printStream, vVar);
            String str2 = str + " ";
            for (int i10 = 0; i10 < vVar.Z(); i10++) {
                for (int i11 = 0; i11 < vVar.w(); i11++) {
                    printStream.printf(str2, Float.valueOf(vVar.d(i10, i11)));
                }
                printStream.println();
            }
        }
    }

    public static void i(PrintStream printStream, z zVar, String str) {
        if (str.equalsIgnoreCase("matlab")) {
            p(printStream, zVar);
            return;
        }
        q(printStream, zVar);
        int length = String.format(str, Double.valueOf(-1.1123d)).length();
        char[] cArr = new char[length];
        Arrays.fill(cArr, ' ');
        cArr[length / 2] = '*';
        for (int i10 = 0; i10 < zVar.f21325y; i10++) {
            for (int i11 = 0; i11 < zVar.U3; i11++) {
                int f10 = zVar.f(i10, i11);
                if (f10 >= 0) {
                    printStream.printf(str, Float.valueOf(zVar.f21321c[f10]));
                } else {
                    printStream.print(cArr);
                }
                if (i11 != zVar.U3 - 1) {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }
    }

    public static void j(PrintStream printStream, a0 a0Var, String str) {
        q(printStream, a0Var);
        for (int i10 = 0; i10 < a0Var.f21263x; i10++) {
            for (int i11 = 0; i11 < a0Var.f21264y; i11++) {
                int c10 = a0Var.c(i10, i11);
                if (c10 >= 0) {
                    printStream.printf(str, Float.valueOf(a0Var.f21261d.f21310a[c10]));
                } else {
                    printStream.print("   *  ");
                }
                if (i11 != a0Var.f21264y - 1) {
                    printStream.print(" ");
                }
            }
            printStream.println();
        }
    }

    public static void k(PrintStream printStream, c0 c0Var) {
        switch (a.f11069a[c0Var.getType().ordinal()]) {
            case 1:
                d(printStream, (k) c0Var, "%11.4E");
                return;
            case 2:
                h(printStream, (v) c0Var, "%11.4E");
                return;
            case 3:
                l(printStream, (g0) c0Var, "%11.4E");
                return;
            case 4:
                b(printStream, (rk.b) c0Var, "%11.4E");
                return;
            case 5:
                e(printStream, (o) c0Var, "%11.4E");
                return;
            case 6:
                f(printStream, (p) c0Var, "%11.4E");
                return;
            case 7:
                i(printStream, (z) c0Var, "%11.4E");
                return;
            case 8:
                j(printStream, (a0) c0Var, "%11.4E");
                return;
            default:
                throw new RuntimeException("Unknown type " + c0Var.getType());
        }
    }

    public static void l(PrintStream printStream, g0 g0Var, String str) {
        q(printStream, g0Var);
        String str2 = str + " + " + str + "i";
        f fVar = new f();
        for (int i10 = 0; i10 < g0Var.Z(); i10++) {
            for (int i11 = 0; i11 < g0Var.w(); i11++) {
                g0Var.Q(i10, i11, fVar);
                printStream.printf(str2, Double.valueOf(fVar.f21284a), Double.valueOf(fVar.f21285b));
                if (i11 < g0Var.w() - 1) {
                    printStream.print(" , ");
                }
            }
            printStream.println();
        }
    }

    public static void m(PrintStream printStream, k kVar, String str) {
        printStream.println("new " + (kVar.getType().g() == 64 ? "double" : "float") + "[][]{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        String sb3 = sb2.toString();
        int i10 = 0;
        while (i10 < kVar.Z()) {
            printStream.print("{");
            int i11 = 0;
            while (i11 < kVar.w()) {
                printStream.printf(sb3, Double.valueOf(kVar.d(i10, i11)));
                i11++;
                if (i11 < kVar.w()) {
                    printStream.print(", ");
                }
            }
            i10++;
            printStream.println(i10 < kVar.Z() ? "}," : "}};");
        }
    }

    public static void n(PrintStream printStream, v vVar, String str) {
        printStream.println("new " + (vVar.getType().g() == 64 ? "double" : "float") + "[][]{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        String sb3 = sb2.toString();
        int i10 = 0;
        while (i10 < vVar.Z()) {
            printStream.print("{");
            int i11 = 0;
            while (i11 < vVar.w()) {
                printStream.printf(sb3, Float.valueOf(vVar.d(i10, i11)));
                i11++;
                if (i11 < vVar.w()) {
                    printStream.print(", ");
                }
            }
            i10++;
            printStream.println(i10 < vVar.Z() ? "}," : "}};");
        }
    }

    public static void o(PrintStream printStream, k kVar) {
        printStream.print("[ ");
        int i10 = 0;
        while (i10 < kVar.Z()) {
            int i11 = 0;
            while (i11 < kVar.w()) {
                printStream.printf("%.12E", Double.valueOf(kVar.d(i10, i11)));
                i11++;
                if (i11 < kVar.w()) {
                    printStream.print(" , ");
                }
            }
            i10++;
            printStream.println(i10 < kVar.Z() ? " ;" : " ]");
        }
    }

    public static void p(PrintStream printStream, v vVar) {
        printStream.print("[ ");
        int i10 = 0;
        while (i10 < vVar.Z()) {
            int i11 = 0;
            while (i11 < vVar.w()) {
                printStream.printf(f11068a, Float.valueOf(vVar.d(i10, i11)));
                i11++;
                if (i11 < vVar.w()) {
                    printStream.print(" , ");
                }
            }
            i10++;
            printStream.println(i10 < vVar.Z() ? " ;" : " ]");
        }
    }

    private static void q(PrintStream printStream, c0 c0Var) {
        String str;
        if (c0Var instanceof d0) {
            str = "Type = " + a(c0Var) + " , rows = " + c0Var.Z() + " , cols = " + c0Var.w() + " , nz_length = " + ((d0) c0Var).a0();
        } else {
            str = "Type = " + a(c0Var) + " , rows = " + c0Var.Z() + " , cols = " + c0Var.w();
        }
        printStream.println(str);
    }
}
