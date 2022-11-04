package j$.time.format;

import j$.time.AbstractC0484a;
/* renamed from: j$.time.format.e */
/* loaded from: classes2.dex */
public final class C0489e implements g {

    /* renamed from: a */
    private final char f13068a;

    public C0489e(char c10) {
        this.f13068a = c10;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        sb2.append(this.f13068a);
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        return (charAt == this.f13068a || (!xVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.f13068a) || Character.toLowerCase(charAt) == Character.toLowerCase(this.f13068a)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        if (this.f13068a == '\'') {
            return "''";
        }
        StringBuilder b10 = AbstractC0484a.b("'");
        b10.append(this.f13068a);
        b10.append("'");
        return b10.toString();
    }
}
