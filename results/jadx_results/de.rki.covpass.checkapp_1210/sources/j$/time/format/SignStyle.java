package j$.time.format;
/* loaded from: classes2.dex */
public enum SignStyle {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    public final boolean b(boolean z10, boolean z11, boolean z12) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return !z10 || !z11;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            return !z11 && !z12;
        }
    }
}
