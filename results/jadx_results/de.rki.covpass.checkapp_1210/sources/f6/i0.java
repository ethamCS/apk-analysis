package f6;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum i0 implements b0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final b0.d<i0> W3 = new b0.d<i0>() { // from class: f6.i0.a
        /* renamed from: b */
        public i0 a(int i10) {
            return i0.b(i10);
        }
    };

    /* renamed from: c */
    private final int f9825c;

    i0(int i10) {
        this.f9825c = i10;
    }

    public static i0 b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return TINK;
            }
            if (i10 == 2) {
                return LEGACY;
            }
            if (i10 == 3) {
                return RAW;
            }
            if (i10 == 4) {
                return CRUNCHY;
            }
            return null;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int c() {
        if (this != UNRECOGNIZED) {
            return this.f9825c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
