package rd;

import yd.j;
/* loaded from: classes.dex */
public enum x implements j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    
    private static j.b<x> W3 = new j.b<x>() { // from class: rd.x.a
        /* renamed from: b */
        public x a(int i10) {
            return x.b(i10);
        }
    };

    /* renamed from: c */
    private final int f21127c;

    x(int i10, int i11) {
        this.f21127c = i11;
    }

    public static x b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return PRIVATE;
            }
            if (i10 == 2) {
                return PROTECTED;
            }
            if (i10 == 3) {
                return PUBLIC;
            }
            if (i10 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i10 == 5) {
                return LOCAL;
            }
            return null;
        }
        return INTERNAL;
    }

    @Override // yd.j.a
    public final int c() {
        return this.f21127c;
    }
}
