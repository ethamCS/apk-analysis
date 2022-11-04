package j$.time.format;
/* loaded from: classes2.dex */
public enum s implements g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            xVar.m(true);
        } else if (ordinal == 1) {
            xVar.m(false);
        } else if (ordinal == 2) {
            xVar.q(true);
        } else if (ordinal == 3) {
            xVar.q(false);
        }
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal != 3) {
                throw new IllegalStateException("Unreachable");
            }
            return "ParseStrict(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
