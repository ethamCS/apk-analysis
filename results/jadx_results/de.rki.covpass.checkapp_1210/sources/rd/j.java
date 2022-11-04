package rd;

import yd.j;
/* loaded from: classes.dex */
public enum j implements j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    
    private static j.b<j> U3 = new j.b<j>() { // from class: rd.j.a
        /* renamed from: b */
        public j a(int i10) {
            return j.b(i10);
        }
    };

    /* renamed from: c */
    private final int f20951c;

    j(int i10, int i11) {
        this.f20951c = i11;
    }

    public static j b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i10 == 2) {
                return DELEGATION;
            }
            if (i10 == 3) {
                return SYNTHESIZED;
            }
            return null;
        }
        return DECLARATION;
    }

    @Override // yd.j.a
    public final int c() {
        return this.f20951c;
    }
}
