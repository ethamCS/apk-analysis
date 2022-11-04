package androidx.camera.core.impl.utils;
/* loaded from: classes.dex */
final class j {

    /* renamed from: a */
    private final long f2378a;

    /* renamed from: b */
    private final long f2379b;

    public j(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }

    public j(long j10, long j11) {
        this.f2378a = j10;
        this.f2379b = j11;
    }

    public long a() {
        return this.f2379b;
    }

    public long b() {
        return this.f2378a;
    }

    public String toString() {
        return this.f2378a + "/" + this.f2379b;
    }
}
