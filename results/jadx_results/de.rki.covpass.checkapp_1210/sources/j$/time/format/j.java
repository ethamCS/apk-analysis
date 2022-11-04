package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.temporal.ChronoField;
/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a */
    public final /* synthetic */ int f13075a;

    /* renamed from: b */
    private final Object f13076b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f13075a = i10;
        this.f13076b = obj;
    }

    private static StringBuilder a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
        return sb2;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        switch (this.f13075a) {
            case 0:
                Long e10 = zVar.e(ChronoField.OFFSET_SECONDS);
                if (e10 == null) {
                    return false;
                }
                sb2.append("GMT");
                int a10 = j$.time.c.a(e10.longValue());
                if (a10 == 0) {
                    return true;
                }
                int abs = Math.abs((a10 / 3600) % 100);
                int abs2 = Math.abs((a10 / 60) % 60);
                int abs3 = Math.abs(a10 % 60);
                sb2.append(a10 < 0 ? "-" : "+");
                if (((E) this.f13076b) == E.FULL) {
                    a(sb2, abs);
                    sb2.append(':');
                    a(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                } else {
                    if (abs >= 10) {
                        sb2.append((char) ((abs / 10) + 48));
                    }
                    sb2.append((char) ((abs % 10) + 48));
                    if (abs2 == 0 && abs3 == 0) {
                        return true;
                    }
                    sb2.append(':');
                    a(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                }
                sb2.append(':');
                a(sb2, abs3);
                return true;
            default:
                sb2.append((String) this.f13076b);
                return true;
        }
    }

    final int c(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r13 >= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
        if (r13 >= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
        r7 = r7 + 3;
        r4 = (r0 * 10) + r13;
     */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(j$.time.format.x r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.d(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        switch (this.f13075a) {
            case 0:
                StringBuilder b10 = AbstractC0484a.b("LocalizedOffset(");
                b10.append((E) this.f13076b);
                b10.append(")");
                return b10.toString();
            default:
                String replace = ((String) this.f13076b).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
