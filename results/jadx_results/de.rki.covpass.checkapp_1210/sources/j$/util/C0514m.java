package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.m */
/* loaded from: classes2.dex */
public final class C0514m {

    /* renamed from: c */
    private static final C0514m f13390c = new C0514m();

    /* renamed from: a */
    private final boolean f13391a;

    /* renamed from: b */
    private final long f13392b;

    private C0514m() {
        this.f13391a = false;
        this.f13392b = 0L;
    }

    private C0514m(long j10) {
        this.f13391a = true;
        this.f13392b = j10;
    }

    public static C0514m a() {
        return f13390c;
    }

    public static C0514m d(long j10) {
        return new C0514m(j10);
    }

    public final long b() {
        if (this.f13391a) {
            return this.f13392b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f13391a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0514m)) {
            return false;
        }
        C0514m c0514m = (C0514m) obj;
        boolean z10 = this.f13391a;
        if (!z10 || !c0514m.f13391a) {
            if (z10 == c0514m.f13391a) {
                return true;
            }
        } else if (this.f13392b == c0514m.f13392b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13391a) {
            long j10 = this.f13392b;
            return (int) (j10 ^ (j10 >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f13391a ? String.format("OptionalLong[%s]", Long.valueOf(this.f13392b)) : "OptionalLong.empty";
    }
}
