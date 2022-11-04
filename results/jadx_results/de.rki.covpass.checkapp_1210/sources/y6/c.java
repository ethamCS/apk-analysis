package y6;

import h6.s;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final int f25852a;

    /* renamed from: b */
    private final int[] f25853b;

    /* renamed from: c */
    private final s[] f25854c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f25852a = i10;
        this.f25853b = iArr;
        float f10 = i13;
        this.f25854c = new s[]{new s(i11, f10), new s(i12, f10)};
    }

    public s[] a() {
        return this.f25854c;
    }

    public int[] b() {
        return this.f25853b;
    }

    public int c() {
        return this.f25852a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f25852a == ((c) obj).f25852a;
    }

    public int hashCode() {
        return this.f25852a;
    }
}
