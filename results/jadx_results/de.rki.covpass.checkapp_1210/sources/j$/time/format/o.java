package j$.time.format;

import org.conscrypt.BuildConfig;
/* loaded from: classes2.dex */
public final class o extends p {
    public o() {
        super(BuildConfig.FLAVOR, null, null, null);
    }

    private o(String str, String str2, p pVar) {
        super(str, str2, pVar, null);
    }

    @Override // j$.time.format.p
    protected final boolean c(char c10, char c11) {
        return x.c(c10, c11);
    }

    @Override // j$.time.format.p
    protected final p e(String str, String str2, p pVar) {
        return new o(str, str2, pVar);
    }

    @Override // j$.time.format.p
    protected final boolean h(CharSequence charSequence, int i10, int i11) {
        int length = this.f13094a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!x.c(this.f13094a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
