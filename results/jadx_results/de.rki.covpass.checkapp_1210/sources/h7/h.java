package h7;
/* loaded from: classes.dex */
public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: c */
    private final int[] f11402c;

    /* renamed from: d */
    private final int f11403d;

    h(int[] iArr, int i10) {
        this.f11402c = iArr;
        this.f11403d = i10;
    }

    public static h b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return NUMERIC;
            }
            if (i10 == 2) {
                return ALPHANUMERIC;
            }
            if (i10 == 3) {
                return STRUCTURED_APPEND;
            }
            if (i10 == 4) {
                return BYTE;
            }
            if (i10 == 5) {
                return FNC1_FIRST_POSITION;
            }
            if (i10 == 7) {
                return ECI;
            }
            if (i10 == 8) {
                return KANJI;
            }
            if (i10 == 9) {
                return FNC1_SECOND_POSITION;
            }
            if (i10 != 13) {
                throw new IllegalArgumentException();
            }
            return HANZI;
        }
        return TERMINATOR;
    }

    public int g() {
        return this.f11403d;
    }

    public int h(j jVar) {
        int j10 = jVar.j();
        return this.f11402c[j10 <= 9 ? (char) 0 : j10 <= 26 ? (char) 1 : (char) 2];
    }
}
