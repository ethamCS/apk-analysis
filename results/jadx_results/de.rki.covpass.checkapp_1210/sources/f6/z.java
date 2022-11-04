package f6;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum z implements b0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final b0.d<z> V3 = new b0.d<z>() { // from class: f6.z.a
        /* renamed from: b */
        public z a(int i10) {
            return z.b(i10);
        }
    };

    /* renamed from: c */
    private final int f9858c;

    z(int i10) {
        this.f9858c = i10;
    }

    public static z b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return ENABLED;
            }
            if (i10 == 2) {
                return DISABLED;
            }
            if (i10 == 3) {
                return DESTROYED;
            }
            return null;
        }
        return UNKNOWN_STATUS;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int c() {
        if (this != UNRECOGNIZED) {
            return this.f9858c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
