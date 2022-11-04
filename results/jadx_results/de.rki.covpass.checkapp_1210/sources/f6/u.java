package f6;

import com.google.crypto.tink.shaded.protobuf.b0;
/* loaded from: classes.dex */
public enum u implements b0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final b0.d<u> W3 = new b0.d<u>() { // from class: f6.u.a
        /* renamed from: b */
        public u a(int i10) {
            return u.b(i10);
        }
    };

    /* renamed from: c */
    private final int f9844c;

    u(int i10) {
        this.f9844c = i10;
    }

    public static u b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return SHA1;
            }
            if (i10 == 2) {
                return SHA384;
            }
            if (i10 == 3) {
                return SHA256;
            }
            if (i10 == 4) {
                return SHA512;
            }
            return null;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.c
    public final int c() {
        if (this != UNRECOGNIZED) {
            return this.f9844c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
