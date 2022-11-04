package x6;

import java.util.EnumMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c */
    private static final int[] f25440c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f25441a = new int[4];

    /* renamed from: b */
    private final StringBuilder f25442b = new StringBuilder();

    private int a(o6.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25441a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < l10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f25450h);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = aVar.k(aVar.j(i10));
            }
        }
        if (sb2.length() == 5) {
            if (d(sb2.toString()) != c(i11)) {
                throw h6.m.b();
            }
            return i10;
        }
        throw h6.m.b();
    }

    private static int c(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f25440c[i11]) {
                return i11;
            }
        }
        throw h6.m.b();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r5.equals("90000") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            if (r1 == r2) goto L15
            goto L4f
        L15:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r1
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r4
            goto L3e
        L35:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r3 = "$"
            goto L4f
        L4d:
            java.lang.String r3 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.w.e(java.lang.String):java.lang.String");
    }

    private static Map<h6.r, Object> f(String str) {
        String e10;
        if (str.length() == 5 && (e10 = e(str)) != null) {
            EnumMap enumMap = new EnumMap(h6.r.class);
            enumMap.put((EnumMap) h6.r.SUGGESTED_PRICE, (h6.r) e10);
            return enumMap;
        }
        return null;
    }

    public h6.q b(int i10, o6.a aVar, int[] iArr) {
        StringBuilder sb2 = this.f25442b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<h6.r, Object> f10 = f(sb3);
        float f11 = i10;
        h6.q qVar = new h6.q(sb3, null, new h6.s[]{new h6.s((iArr[0] + iArr[1]) / 2.0f, f11), new h6.s(a10, f11)}, h6.a.UPC_EAN_EXTENSION);
        if (f10 != null) {
            qVar.g(f10);
        }
        return qVar;
    }
}
