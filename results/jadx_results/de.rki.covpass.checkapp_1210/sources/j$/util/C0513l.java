package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.l */
/* loaded from: classes2.dex */
public final class C0513l {

    /* renamed from: c */
    private static final C0513l f13387c = new C0513l();

    /* renamed from: a */
    private final boolean f13388a;

    /* renamed from: b */
    private final int f13389b;

    private C0513l() {
        this.f13388a = false;
        this.f13389b = 0;
    }

    private C0513l(int i10) {
        this.f13388a = true;
        this.f13389b = i10;
    }

    public static C0513l a() {
        return f13387c;
    }

    public static C0513l d(int i10) {
        return new C0513l(i10);
    }

    public final int b() {
        if (this.f13388a) {
            return this.f13389b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f13388a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0513l)) {
            return false;
        }
        C0513l c0513l = (C0513l) obj;
        boolean z10 = this.f13388a;
        if (!z10 || !c0513l.f13388a) {
            if (z10 == c0513l.f13388a) {
                return true;
            }
        } else if (this.f13389b == c0513l.f13389b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13388a) {
            return this.f13389b;
        }
        return 0;
    }

    public final String toString() {
        return this.f13388a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f13389b)) : "OptionalInt.empty";
    }
}
