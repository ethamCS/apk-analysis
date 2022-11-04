package wd;

import hc.t;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final g f24809a = new g();

    /* renamed from: b */
    private static final bf.k f24810b = new bf.k("[^\\p{L}\\p{Digit}]");

    private g() {
    }

    @fc.c
    public static final String a(String str) {
        t.e(str, "name");
        return f24810b.j(str, "_");
    }
}
