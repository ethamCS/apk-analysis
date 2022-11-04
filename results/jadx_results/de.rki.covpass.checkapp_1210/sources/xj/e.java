package xj;

import gg.v;
/* loaded from: classes3.dex */
class e {
    public static v a(String str) {
        if (str.equals("SHA-256")) {
            return ug.b.f23635c;
        }
        if (str.equals("SHA-512")) {
            return ug.b.f23639e;
        }
        if (str.equals("SHAKE128")) {
            return ug.b.f23655m;
        }
        if (str.equals("SHAKE256")) {
            return ug.b.f23657n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
