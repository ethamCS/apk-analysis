package sk;

import pk.d;
import rk.j;
/* loaded from: classes3.dex */
public class a {
    public static double a(j jVar) {
        double abs = Math.abs(jVar.f21291c);
        double abs2 = Math.abs(jVar.f21292d);
        if (abs2 > abs) {
            abs = abs2;
        }
        double abs3 = Math.abs(jVar.f21293q);
        if (abs3 > abs) {
            abs = abs3;
        }
        double abs4 = Math.abs(jVar.f21294x);
        if (abs4 > abs) {
            abs = abs4;
        }
        double abs5 = Math.abs(jVar.f21295y);
        if (abs5 > abs) {
            abs = abs5;
        }
        double abs6 = Math.abs(jVar.U3);
        if (abs6 > abs) {
            abs = abs6;
        }
        double abs7 = Math.abs(jVar.V3);
        if (abs7 > abs) {
            abs = abs7;
        }
        double abs8 = Math.abs(jVar.W3);
        if (abs8 > abs) {
            abs = abs8;
        }
        double abs9 = Math.abs(jVar.X3);
        return abs9 > abs ? abs9 : abs;
    }

    public static boolean b(j jVar, j jVar2) {
        double a10 = 1.0d / a(jVar);
        double d10 = jVar.f21291c * a10;
        double d11 = jVar.f21292d * a10;
        double d12 = jVar.f21293q * a10;
        double d13 = jVar.f21294x * a10;
        double d14 = jVar.f21295y * a10;
        double d15 = jVar.U3 * a10;
        double d16 = jVar.V3 * a10;
        double d17 = jVar.W3 * a10;
        double d18 = jVar.X3 * a10;
        double d19 = (d14 * d18) - (d15 * d17);
        double d20 = -((d13 * d18) - (d15 * d16));
        double d21 = (d13 * d17) - (d14 * d16);
        double d22 = (((d10 * d19) + (d11 * d20)) + (d12 * d21)) / a10;
        jVar2.f21291c = d19 / d22;
        jVar2.f21292d = (-((d11 * d18) - (d12 * d17))) / d22;
        jVar2.f21293q = ((d11 * d15) - (d12 * d14)) / d22;
        jVar2.f21294x = d20 / d22;
        jVar2.f21295y = ((d10 * d18) - (d12 * d16)) / d22;
        jVar2.U3 = (-((d15 * d10) - (d12 * d13))) / d22;
        jVar2.V3 = d21 / d22;
        jVar2.W3 = (-((d10 * d17) - (d11 * d16))) / d22;
        jVar2.X3 = ((d14 * d10) - (d11 * d13)) / d22;
        return !Double.isNaN(d22) && !Double.isInfinite(d22);
    }

    public static void c(j jVar, j jVar2, j jVar3) {
        d.i(jVar, jVar3);
        d.i(jVar2, jVar3);
        double d10 = jVar.f21291c * jVar2.f21291c;
        double d11 = jVar.f21292d;
        double d12 = jVar2.f21294x;
        double d13 = jVar.f21293q;
        double d14 = jVar2.V3;
        jVar3.f21291c = d10 + (d11 * d12) + (d13 * d14);
        double d15 = jVar.f21291c;
        double d16 = jVar2.f21295y;
        double d17 = (jVar2.f21292d * d15) + (d11 * d16);
        double d18 = jVar2.W3;
        jVar3.f21292d = d17 + (d13 * d18);
        double d19 = d15 * jVar2.f21293q;
        double d20 = jVar.f21292d;
        double d21 = jVar2.U3;
        double d22 = d19 + (d20 * d21);
        double d23 = jVar2.X3;
        jVar3.f21293q = d22 + (d13 * d23);
        double d24 = jVar.f21294x;
        double d25 = jVar2.f21291c;
        double d26 = d24 * d25;
        double d27 = jVar.f21295y;
        double d28 = d26 + (d12 * d27);
        double d29 = jVar.U3;
        jVar3.f21294x = d28 + (d29 * d14);
        double d30 = jVar.f21294x;
        double d31 = jVar2.f21292d;
        jVar3.f21295y = (d30 * d31) + (d27 * d16) + (d29 * d18);
        double d32 = jVar2.f21293q;
        jVar3.U3 = (d30 * d32) + (jVar.f21295y * d21) + (d29 * d23);
        double d33 = jVar.W3;
        double d34 = (jVar.V3 * d25) + (jVar2.f21294x * d33);
        double d35 = jVar.X3;
        jVar3.V3 = d34 + (d35 * d14);
        double d36 = jVar.V3;
        jVar3.W3 = (d31 * d36) + (d33 * jVar2.f21295y) + (d35 * d18);
        jVar3.X3 = (d36 * d32) + (jVar.W3 * jVar2.U3) + (d35 * d23);
    }
}
