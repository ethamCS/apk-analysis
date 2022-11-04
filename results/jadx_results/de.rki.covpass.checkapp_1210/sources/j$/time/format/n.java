package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.DateTimeException;
/* loaded from: classes2.dex */
public final class n implements g {

    /* renamed from: a */
    private final g f13091a;

    /* renamed from: b */
    private final int f13092b;

    /* renamed from: c */
    private final char f13093c;

    public n(g gVar, int i10, char c10) {
        this.f13091a = gVar;
        this.f13092b = i10;
        this.f13093c = c10;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f13091a.b(zVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        if (length2 <= this.f13092b) {
            for (int i10 = 0; i10 < this.f13092b - length2; i10++) {
                sb2.insert(length, this.f13093c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f13092b);
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        boolean l10 = xVar.l();
        if (i10 <= charSequence.length()) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            int i11 = this.f13092b + i10;
            if (i11 > charSequence.length()) {
                if (l10) {
                    return ~i10;
                }
                i11 = charSequence.length();
            }
            int i12 = i10;
            while (i12 < i11 && xVar.b(charSequence.charAt(i12), this.f13093c)) {
                i12++;
            }
            int d10 = this.f13091a.d(xVar, charSequence.subSequence(0, i11), i12);
            return (d10 == i11 || !l10) ? d10 : ~(i10 + i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        StringBuilder b10 = AbstractC0484a.b("Pad(");
        b10.append(this.f13091a);
        b10.append(",");
        b10.append(this.f13092b);
        if (this.f13093c == ' ') {
            str = ")";
        } else {
            StringBuilder b11 = AbstractC0484a.b(",'");
            b11.append(this.f13093c);
            b11.append("')");
            str = b11.toString();
        }
        b10.append(str);
        return b10.toString();
    }
}
