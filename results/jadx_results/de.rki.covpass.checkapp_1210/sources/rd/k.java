package rd;

import yd.j;
/* loaded from: classes.dex */
public enum k implements j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    
    private static j.b<k> U3 = new j.b<k>() { // from class: rd.k.a
        /* renamed from: b */
        public k a(int i10) {
            return k.b(i10);
        }
    };

    /* renamed from: c */
    private final int f20956c;

    k(int i10, int i11) {
        this.f20956c = i11;
    }

    public static k b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 == 2) {
                return ABSTRACT;
            }
            if (i10 == 3) {
                return SEALED;
            }
            return null;
        }
        return FINAL;
    }

    @Override // yd.j.a
    public final int c() {
        return this.f20956c;
    }
}
