package x6;

import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: d */
    static final char[] f25389d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f25390e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f25391f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f25392a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f25393b = new int[80];

    /* renamed from: c */
    private int f25394c = 0;

    public static boolean h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(int i10) {
        int[] iArr = this.f25393b;
        int i11 = this.f25394c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f25394c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f25393b = iArr2;
        }
    }

    private int j() {
        for (int i10 = 1; i10 < this.f25394c; i10 += 2) {
            int l10 = l(i10);
            if (l10 != -1 && h(f25391f, f25389d[l10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f25393b[i12];
                }
                if (i10 == 1 || this.f25393b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw h6.m.b();
    }

    private void k(o6.a aVar) {
        int i10 = 0;
        this.f25394c = 0;
        int k10 = aVar.k(0);
        int l10 = aVar.l();
        if (k10 < l10) {
            boolean z10 = true;
            while (k10 < l10) {
                if (aVar.h(k10) != z10) {
                    i10++;
                } else {
                    i(i10);
                    z10 = !z10;
                    i10 = 1;
                }
                k10++;
            }
            i(i10);
            return;
        }
        throw h6.m.b();
    }

    private int l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f25394c) {
            return -1;
        }
        int[] iArr = this.f25393b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f25390e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw h6.m.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m(int r15) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.a.m(int):void");
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        Arrays.fill(this.f25393b, 0);
        k(aVar);
        int j10 = j();
        this.f25392a.setLength(0);
        int i11 = j10;
        do {
            int l10 = l(i11);
            if (l10 == -1) {
                throw h6.m.b();
            }
            this.f25392a.append((char) l10);
            i11 += 8;
            if (this.f25392a.length() > 1 && h(f25391f, f25389d[l10])) {
                break;
            }
        } while (i11 < this.f25394c);
        int i12 = i11 - 1;
        int i13 = this.f25393b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f25393b[i11 + i15];
        }
        if (i11 >= this.f25394c || i13 >= i14 / 2) {
            m(j10);
            for (int i16 = 0; i16 < this.f25392a.length(); i16++) {
                StringBuilder sb2 = this.f25392a;
                sb2.setCharAt(i16, f25389d[sb2.charAt(i16)]);
            }
            char charAt = this.f25392a.charAt(0);
            char[] cArr = f25391f;
            if (!h(cArr, charAt)) {
                throw h6.m.b();
            }
            StringBuilder sb3 = this.f25392a;
            if (!h(cArr, sb3.charAt(sb3.length() - 1))) {
                throw h6.m.b();
            }
            if (this.f25392a.length() <= 3) {
                throw h6.m.b();
            }
            if (map == null || !map.containsKey(h6.e.RETURN_CODABAR_START_END)) {
                StringBuilder sb4 = this.f25392a;
                sb4.deleteCharAt(sb4.length() - 1);
                this.f25392a.deleteCharAt(0);
            }
            int i17 = 0;
            for (int i18 = 0; i18 < j10; i18++) {
                i17 += this.f25393b[i18];
            }
            float f10 = i17;
            while (j10 < i12) {
                i17 += this.f25393b[j10];
                j10++;
            }
            float f11 = i10;
            return new h6.q(this.f25392a.toString(), null, new h6.s[]{new h6.s(f10, f11), new h6.s(i17, f11)}, h6.a.CODABAR);
        }
        throw h6.m.b();
    }
}
