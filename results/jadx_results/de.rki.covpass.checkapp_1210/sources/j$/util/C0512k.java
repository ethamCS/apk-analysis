package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.k */
/* loaded from: classes2.dex */
public final class C0512k {

    /* renamed from: c */
    private static final C0512k f13384c = new C0512k();

    /* renamed from: a */
    private final boolean f13385a;

    /* renamed from: b */
    private final double f13386b;

    private C0512k() {
        this.f13385a = false;
        this.f13386b = Double.NaN;
    }

    private C0512k(double d10) {
        this.f13385a = true;
        this.f13386b = d10;
    }

    public static C0512k a() {
        return f13384c;
    }

    public static C0512k d(double d10) {
        return new C0512k(d10);
    }

    public final double b() {
        if (this.f13385a) {
            return this.f13386b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f13385a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0512k)) {
            return false;
        }
        C0512k c0512k = (C0512k) obj;
        boolean z10 = this.f13385a;
        if (!z10 || !c0512k.f13385a) {
            if (z10 == c0512k.f13385a) {
                return true;
            }
        } else if (Double.compare(this.f13386b, c0512k.f13386b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13385a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f13386b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f13385a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f13386b)) : "OptionalDouble.empty";
    }
}
