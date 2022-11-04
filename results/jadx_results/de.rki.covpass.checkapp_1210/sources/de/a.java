package de;

import hc.t;
/* loaded from: classes3.dex */
public abstract class a implements Comparable<a> {
    /* renamed from: a */
    public int compareTo(a aVar) {
        t.e(aVar, "other");
        int compareTo = b().compareTo(aVar.b());
        if (compareTo != 0 || d() || !aVar.d()) {
            return compareTo;
        }
        return 1;
    }

    public abstract b b();

    public abstract boolean d();
}
