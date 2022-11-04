package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a,\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a$\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a$\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a$\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a$\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a(\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\u0014"}, d2 = {"Lbb/f0;", BuildConfig.FLAVOR, "urlString", "i", "j", BuildConfig.FLAVOR, "startIndex", "endIndex", "slashCount", "Ltb/e0;", "e", "g", "h", "f", "b", "c", BuildConfig.FLAVOR, "char", "a", "d", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k0 {
    private static final int a(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    private static final void b(f0 f0Var, String str, int i10, int i11) {
        Integer valueOf = Integer.valueOf(d(str, i10, i11));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf == null ? i11 : valueOf.intValue();
        String substring = str.substring(i10, intValue);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f0Var.o(substring);
        int i12 = intValue + 1;
        if (i12 >= i11) {
            f0Var.q(0);
            return;
        }
        String substring2 = str.substring(i12, i11);
        hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        f0Var.q(Integer.parseInt(substring2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int c(java.lang.String r12, int r13, int r14) {
        /*
            char r0 = r12.charAt(r13)
            r1 = 123(0x7b, float:1.72E-43)
            r2 = 97
            r3 = 1
            r4 = 0
            if (r2 > r0) goto L10
            if (r0 >= r1) goto L10
            r5 = r3
            goto L11
        L10:
            r5 = r4
        L11:
            r6 = 91
            r7 = 65
            r8 = -1
            if (r5 != 0) goto L24
            if (r7 > r0) goto L1e
            if (r0 >= r6) goto L1e
            r0 = r3
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 != 0) goto L24
            r0 = r13
            r5 = r0
            goto L26
        L24:
            r0 = r13
            r5 = r8
        L26:
            if (r0 >= r14) goto L80
            char r9 = r12.charAt(r0)
            r10 = 58
            if (r9 != r10) goto L44
            if (r5 != r8) goto L34
            int r0 = r0 - r13
            return r0
        L34:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            java.lang.String r14 = "Illegal character in scheme at position "
            java.lang.String r13 = hc.t.l(r14, r13)
            r12.<init>(r13)
            throw r12
        L44:
            r11 = 47
            if (r9 == r11) goto L80
            r11 = 63
            if (r9 == r11) goto L80
            r11 = 35
            if (r9 != r11) goto L51
            goto L80
        L51:
            if (r5 != r8) goto L7d
            if (r2 > r9) goto L59
            if (r9 >= r1) goto L59
            r11 = r3
            goto L5a
        L59:
            r11 = r4
        L5a:
            if (r11 != 0) goto L7d
            if (r7 > r9) goto L62
            if (r9 >= r6) goto L62
            r11 = r3
            goto L63
        L62:
            r11 = r4
        L63:
            if (r11 != 0) goto L7d
            r11 = 48
            if (r11 > r9) goto L6d
            if (r9 >= r10) goto L6d
            r10 = r3
            goto L6e
        L6d:
            r10 = r4
        L6e:
            if (r10 != 0) goto L7d
            r10 = 46
            if (r9 == r10) goto L7d
            r10 = 43
            if (r9 == r10) goto L7d
            r10 = 45
            if (r9 == r10) goto L7d
            r5 = r0
        L7d:
            int r0 = r0 + 1
            goto L26
        L80:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.k0.c(java.lang.String, int, int):int");
    }

    private static final int d(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt == '[') {
                z10 = true;
            } else if (charAt == ']') {
                z10 = false;
            } else if (charAt == ':' && !z10) {
                return i10;
            }
            i10 = i12;
        }
        return -1;
    }

    private static final void e(f0 f0Var, String str, int i10, int i11, int i12) {
        int Z;
        String substring;
        if (i12 == 2) {
            Z = bf.y.Z(str, '/', i10, false, 4, null);
            if (Z == -1 || Z == i11) {
                String substring2 = str.substring(i10, i11);
                hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                f0Var.o(substring2);
                return;
            }
            String substring3 = str.substring(i10, Z);
            hc.t.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            f0Var.o(substring3);
            substring = str.substring(Z, i11);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else if (i12 != 3) {
            throw new IllegalArgumentException(hc.t.l("Invalid file url: ", str));
        } else {
            f0Var.o(BuildConfig.FLAVOR);
            String substring4 = str.substring(i10, i11);
            hc.t.d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            substring = hc.t.l("/", substring4);
        }
        f0Var.m(substring);
    }

    private static final void f(f0 f0Var, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String substring = str.substring(i10 + 1, i11);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f0Var.n(substring);
    }

    private static final void g(f0 f0Var, String str, int i10, int i11) {
        int a02;
        a02 = bf.y.a0(str, "@", i10, false, 4, null);
        if (a02 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i10, a02);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        f0Var.t(b.i(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(a02 + 1, i11);
        hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        f0Var.o(substring2);
    }

    private static final int h(f0 f0Var, String str, int i10, int i11) {
        int Z;
        boolean z10 = true;
        int i12 = i10 + 1;
        if (i12 == i11) {
            f0Var.s(true);
            return i11;
        }
        Z = bf.y.Z(str, '#', i12, false, 4, null);
        Integer valueOf = Integer.valueOf(Z);
        if (valueOf.intValue() <= 0) {
            z10 = false;
        }
        if (!z10) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = valueOf.intValue();
        }
        c0 g10 = f0Var.g();
        String substring = str.substring(i12, i11);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        e0.d(g10, substring, 0, 0, 12, null);
        return i11;
    }

    public static final f0 i(f0 f0Var, String str) {
        hc.t.e(f0Var, "<this>");
        hc.t.e(str, "urlString");
        try {
            return j(f0Var, str);
        } catch (Throwable th2) {
            throw new j0(str, th2);
        }
    }

    public static final f0 j(f0 f0Var, String str) {
        int c02;
        int f02;
        int i10;
        int c03;
        boolean c10;
        boolean c11;
        hc.t.e(f0Var, "<this>");
        hc.t.e(str, "urlString");
        int length = str.length();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            int i12 = i11 + 1;
            c11 = bf.b.c(str.charAt(i11));
            if (!c11) {
                break;
            }
            i11 = i12;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i13 = length2 - 1;
                c10 = bf.b.c(str.charAt(length2));
                if (!c10) {
                    break;
                } else if (i13 < 0) {
                    break;
                } else {
                    length2 = i13;
                }
            }
        }
        length2 = -1;
        int i14 = length2 + 1;
        int c12 = c(str, i11, i14);
        if (c12 > 0) {
            String substring = str.substring(i11, i11 + c12);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            f0Var.r(l0.Companion.a(substring));
            i11 += c12 + 1;
        }
        int a10 = a(str, i11, i14, '/');
        int i15 = i11 + a10;
        if (hc.t.a(f0Var.j().e(), "file")) {
            e(f0Var, str, i15, i14, a10);
            return f0Var;
        } else if (hc.t.a(f0Var.j().e(), "mailto")) {
            if (a10 == 0) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            g(f0Var, str, i15, i14);
            return f0Var;
        } else {
            if (a10 >= 2) {
                int i16 = i15;
                while (true) {
                    i10 = i16;
                    c03 = bf.y.c0(str, fb.j.b("@/\\?#"), i16, false, 4, null);
                    Integer valueOf = Integer.valueOf(c03);
                    if (!(valueOf.intValue() > 0)) {
                        valueOf = null;
                    }
                    i15 = valueOf == null ? i14 : valueOf.intValue();
                    if (i15 >= i14 || str.charAt(i15) != '@') {
                        break;
                    }
                    int d10 = d(str, i10, i15);
                    if (d10 != -1) {
                        String substring2 = str.substring(i10, d10);
                        hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        f0Var.t(b.i(substring2, 0, 0, null, 7, null));
                        String substring3 = str.substring(d10 + 1, i15);
                        hc.t.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        f0Var.p(b.i(substring3, 0, 0, null, 7, null));
                    } else {
                        String substring4 = str.substring(i10, i15);
                        hc.t.d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                        f0Var.t(b.i(substring4, 0, 0, null, 7, null));
                    }
                    i16 = i15 + 1;
                }
                b(f0Var, str, i10, i15);
            }
            int i17 = i15;
            String str2 = "/";
            if (i17 >= i14) {
                if (str.charAt(i14 - 1) != '/') {
                    str2 = BuildConfig.FLAVOR;
                }
                f0Var.m(str2);
                return f0Var;
            }
            if (a10 == 0) {
                f02 = bf.y.f0(f0Var.d(), '/', 0, false, 6, null);
                if (f02 == f0Var.d().length() - 1) {
                    str2 = f0Var.d();
                } else if (f02 != -1) {
                    str2 = f0Var.d().substring(0, f02 + 1);
                    hc.t.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            } else {
                str2 = BuildConfig.FLAVOR;
            }
            f0Var.m(str2);
            c02 = bf.y.c0(str, fb.j.b("?#"), i17, false, 4, null);
            Integer valueOf2 = Integer.valueOf(c02);
            if (valueOf2.intValue() > 0) {
                z10 = true;
            }
            Integer num = z10 ? valueOf2 : null;
            int intValue = num == null ? i14 : num.intValue();
            String substring5 = str.substring(i17, intValue);
            hc.t.d(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            f0Var.m(hc.t.l(f0Var.d(), b.o(substring5)));
            if (intValue < i14 && str.charAt(intValue) == '?') {
                intValue = h(f0Var, str, intValue, i14);
            }
            f(f0Var, str, intValue, i14);
            return f0Var;
        }
    }
}
