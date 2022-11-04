package pk;

import java.text.DecimalFormat;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
import rk.b0;
import rk.c0;
import rk.f0;
import rk.g;
import rk.n;
import rk.r;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    public static double f19262a = Math.pow(2.0d, -52.0d);

    /* renamed from: b */
    public static float f19263b = (float) Math.pow(2.0d, -21.0d);

    /* renamed from: c */
    public static double f19264c = 3.141592653589793d;

    /* renamed from: d */
    public static double f19265d = 6.283185307179586d;

    /* renamed from: e */
    public static double f19266e = 1.5707963267948966d;

    /* renamed from: f */
    public static float f19267f = 3.1415927f;

    /* renamed from: g */
    public static float f19268g = 6.2831855f;

    /* renamed from: h */
    public static float f19269h = 1.5707964f;

    /* renamed from: i */
    public static float f19270i = 5.0E-4f;

    /* renamed from: j */
    public static double f19271j = 1.0E-8d;

    /* renamed from: k */
    public static float f19272k = 1.0E-6f;

    /* renamed from: l */
    public static double f19273l = 1.0E-12d;

    /* renamed from: m */
    public static float f19274m = (float) Math.sqrt(5.0E-4f);

    /* renamed from: n */
    public static double f19275n = Math.sqrt(f19271j);

    /* renamed from: o */
    public static int f19276o = 5;

    /* renamed from: p */
    public static final int[] f19277p = new int[0];

    /* renamed from: q */
    public static final float[] f19278q = new float[0];

    /* renamed from: r */
    public static final double[] f19279r = new double[0];

    public static double[] a(g gVar, int i10) {
        if (gVar == null) {
            gVar = new g();
        }
        gVar.b(i10);
        return gVar.f21286a;
    }

    public static float[] b(r rVar, int i10) {
        if (rVar == null) {
            rVar = new r();
        }
        rVar.b(i10);
        return rVar.f21310a;
    }

    public static int[] c(b0 b0Var, int i10) {
        if (b0Var == null) {
            b0Var = new b0();
        }
        b0Var.b(i10);
        return b0Var.f21265a;
    }

    public static int[] d(b0 b0Var, int i10, int i11) {
        int[] c10 = c(b0Var, i10);
        Arrays.fill(c10, 0, i11, 0);
        return c10;
    }

    public static void e(int i10, int i11) {
        f(i10, i11, BuildConfig.FLAVOR);
    }

    public static void f(int i10, int i11, String str) {
        if (i10 == i11) {
            return;
        }
        throw new IllegalArgumentException(i10 + " != " + i11 + " " + str);
    }

    public static void g(int i10, int i11, String str) {
        if (i10 == i11) {
            return;
        }
        throw new c(i10 + " != " + i11 + " " + str);
    }

    public static void h(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void i(Object obj, Object obj2) {
        if (obj != obj2) {
            return;
        }
        throw new IllegalArgumentException("Can't pass in the same instance");
    }

    public static void j(int i10, int i11) {
        if (i10 * i11 == i10 * i11) {
            return;
        }
        throw new IllegalArgumentException("Matrix size exceeds the size of an integer");
    }

    public static void k(int i10, int i11) {
        if (i10 * 2 * i11 == i10 * i11 * 2) {
            return;
        }
        throw new IllegalArgumentException("Matrix size exceeds the size of an integer");
    }

    public static String l(double d10, DecimalFormat decimalFormat, int i10, int i11) {
        return m(d10, decimalFormat, true, i10, i11);
    }

    public static String m(double d10, DecimalFormat decimalFormat, boolean z10, int i10, int i11) {
        StringBuilder sb2;
        String format;
        boolean z11 = Double.doubleToRawLongBits(d10) < 0;
        if (d10 == 0.0d) {
            return z11 ? "-0" : z10 ? " 0" : "0";
        }
        int i12 = i10 - 1;
        String str = BuildConfig.FLAVOR;
        if (!z11 && z10) {
            str = " ";
        }
        int floor = (int) Math.floor(Math.log10(Math.abs(d10)));
        if (floor >= 0 && floor < i12) {
            decimalFormat.setMaximumFractionDigits((i12 - 2) - floor);
            sb2 = new StringBuilder();
        } else if (floor >= 0 || i12 + floor <= i11) {
            int min = Math.min(i11, (i12 - i11) - (((int) Math.log10(Math.abs(floor))) + 1));
            if (min <= 0) {
                return str + String.format("%.0E", Double.valueOf(d10));
            }
            sb2 = new StringBuilder();
            sb2.append(str);
            format = String.format("%." + min + "E", Double.valueOf(d10));
            sb2.append(format);
            return sb2.toString();
        } else {
            decimalFormat.setMaximumFractionDigits(i12 - 1);
            sb2 = new StringBuilder();
        }
        sb2.append(str);
        format = decimalFormat.format(d10);
        sb2.append(format);
        return sb2.toString();
    }

    public static n n(n nVar, int i10, int i11) {
        if (nVar == null) {
            return new n(i10, i11);
        }
        if (nVar.f21297d != i10 || nVar.f21298q != i11) {
            nVar.U(i10, i11);
        }
        return nVar;
    }

    public static <T extends f0> T o(T t10, T t11, int i10, int i11) {
        if (t10 == null) {
            return (T) t11.T(i10, i11);
        }
        if (t10.Z() != i10 || t10.w() != i11) {
            t10.U(i10, i11);
        }
        return t10;
    }

    public static String p(c0 c0Var, c0 c0Var2) {
        return "( " + c0Var.Z() + "x" + c0Var.w() + " ) ( " + c0Var2.Z() + "x" + c0Var2.w() + " )";
    }
}
