package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.temporal.ChronoField;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class m implements g {

    /* renamed from: c */
    static final String[] f13086c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final m f13087d = new m("+HH:MM:ss", "Z");

    /* renamed from: e */
    static final m f13088e = new m("+HH:MM:ss", "0");

    /* renamed from: a */
    private final String f13089a;

    /* renamed from: b */
    private final int f13090b;

    public m(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        int i10 = 0;
        while (true) {
            String[] strArr = f13086c;
            if (i10 >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i10].equals(str)) {
                this.f13090b = i10;
                this.f13089a = str2;
                return;
            } else {
                i10++;
            }
        }
    }

    private boolean a(int[] iArr, int i10, CharSequence charSequence, boolean z10) {
        int i11 = this.f13090b;
        if ((i11 + 3) / 2 < i10) {
            return false;
        }
        int i12 = iArr[0];
        if (i11 % 2 == 0 && i10 > 1) {
            int i13 = i12 + 1;
            if (i13 > charSequence.length() || charSequence.charAt(i12) != ':') {
                return z10;
            }
            i12 = i13;
        }
        if (i12 + 2 > charSequence.length()) {
            return z10;
        }
        int i14 = i12 + 1;
        char charAt = charSequence.charAt(i12);
        int i15 = i14 + 1;
        char charAt2 = charSequence.charAt(i14);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i16 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i16 >= 0 && i16 <= 59) {
                iArr[i10] = i16;
                iArr[0] = i15;
                return false;
            }
        }
        return z10;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        Long e10 = zVar.e(ChronoField.OFFSET_SECONDS);
        if (e10 == null) {
            return false;
        }
        int a10 = j$.time.c.a(e10.longValue());
        if (a10 != 0) {
            int abs = Math.abs((a10 / 3600) % 100);
            int abs2 = Math.abs((a10 / 60) % 60);
            int abs3 = Math.abs(a10 % 60);
            int length = sb2.length();
            sb2.append(a10 < 0 ? "-" : "+");
            sb2.append((char) ((abs / 10) + 48));
            sb2.append((char) ((abs % 10) + 48));
            int i10 = this.f13090b;
            if (i10 >= 3 || (i10 >= 1 && abs2 > 0)) {
                String str = ":";
                sb2.append(i10 % 2 == 0 ? str : BuildConfig.FLAVOR);
                sb2.append((char) ((abs2 / 10) + 48));
                sb2.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                int i11 = this.f13090b;
                if (i11 >= 7 || (i11 >= 5 && abs3 > 0)) {
                    if (i11 % 2 != 0) {
                        str = BuildConfig.FLAVOR;
                    }
                    sb2.append(str);
                    sb2.append((char) ((abs3 / 10) + 48));
                    sb2.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb2.setLength(length);
            }
            return true;
        }
        sb2.append(this.f13089a);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r16.s(r17, r18, r15.f13089a, 0, r9) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(j$.time.format.x r16, java.lang.CharSequence r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r7 = r17
            r8 = r18
            int r1 = r17.length()
            java.lang.String r2 = r0.f13089a
            int r9 = r2.length()
            r10 = 0
            if (r9 != 0) goto L1c
            if (r8 != r1) goto L31
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.OFFSET_SECONDS
            r2 = r1
            r6 = r8
            r3 = r10
            goto L8f
        L1c:
            if (r8 != r1) goto L20
            int r1 = ~r8
            return r1
        L20:
            java.lang.String r4 = r0.f13089a
            r5 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r9
            boolean r1 = r1.s(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L31
            goto L88
        L31:
            char r1 = r17.charAt(r18)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L3d
            if (r1 != r3) goto L86
        L3d:
            r2 = 1
            if (r1 != r3) goto L42
            r1 = -1
            goto L43
        L42:
            r1 = r2
        L43:
            r3 = 4
            int[] r3 = new int[r3]
            int r4 = r8 + 1
            r5 = 0
            r3[r5] = r4
            boolean r4 = r15.a(r3, r2, r7, r2)
            r6 = 2
            r12 = 3
            if (r4 != 0) goto L69
            int r4 = r0.f13090b
            if (r4 < r12) goto L59
            r4 = r2
            goto L5a
        L59:
            r4 = r5
        L5a:
            boolean r4 = r15.a(r3, r6, r7, r4)
            if (r4 != 0) goto L69
            boolean r4 = r15.a(r3, r12, r7, r5)
            if (r4 == 0) goto L67
            goto L69
        L67:
            r4 = r5
            goto L6a
        L69:
            r4 = r2
        L6a:
            if (r4 != 0) goto L86
            long r9 = (long) r1
            r1 = r3[r2]
            long r1 = (long) r1
            r13 = 3600(0xe10, double:1.7786E-320)
            long r1 = r1 * r13
            r4 = r3[r6]
            long r6 = (long) r4
            r13 = 60
            long r6 = r6 * r13
            long r6 = r6 + r1
            r1 = r3[r12]
            long r1 = (long) r1
            long r6 = r6 + r1
            long r6 = r6 * r9
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.OFFSET_SECONDS
            r2 = r3[r5]
            r3 = r6
            r6 = r2
            goto L8e
        L86:
            if (r9 != 0) goto L98
        L88:
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.OFFSET_SECONDS
            int r2 = r8 + r9
            r6 = r2
            r3 = r10
        L8e:
            r2 = r1
        L8f:
            r1 = r16
            r5 = r18
            int r1 = r1.o(r2, r3, r5, r6)
            return r1
        L98:
            int r1 = ~r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.m.d(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        String replace = this.f13089a.replace("'", "''");
        StringBuilder b10 = AbstractC0484a.b("Offset(");
        b10.append(f13086c[this.f13090b]);
        b10.append(",'");
        b10.append(replace);
        b10.append("')");
        return b10.toString();
    }
}
