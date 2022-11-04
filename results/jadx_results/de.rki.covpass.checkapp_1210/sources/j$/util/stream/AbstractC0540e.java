package j$.util.stream;
/* renamed from: j$.util.stream.e */
/* loaded from: classes2.dex */
abstract class AbstractC0540e {

    /* renamed from: a */
    protected final int f13675a;

    /* renamed from: b */
    protected int f13676b;

    /* renamed from: c */
    protected int f13677c;

    /* renamed from: d */
    protected long[] f13678d;

    public AbstractC0540e() {
        this.f13675a = 4;
    }

    public AbstractC0540e(int i10) {
        if (i10 >= 0) {
            this.f13675a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public final long count() {
        int i10 = this.f13677c;
        return i10 == 0 ? this.f13676b : this.f13678d[i10] + this.f13676b;
    }

    public final int s(int i10) {
        return 1 << ((i10 == 0 || i10 == 1) ? this.f13675a : Math.min((this.f13675a + i10) - 1, 30));
    }
}
