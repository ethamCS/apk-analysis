package j$.util.stream;
/* loaded from: classes2.dex */
abstract class R0 implements P0 {

    /* renamed from: a */
    protected final P0 f13534a;

    /* renamed from: b */
    protected final P0 f13535b;

    /* renamed from: c */
    private final long f13536c;

    public R0(P0 p02, P0 p03) {
        this.f13534a = p02;
        this.f13535b = p03;
        this.f13536c = p02.count() + p03.count();
    }

    @Override // j$.util.stream.P0
    public final P0 b(int i10) {
        if (i10 == 0) {
            return this.f13534a;
        }
        if (i10 != 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.f13535b;
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13536c;
    }

    @Override // j$.util.stream.P0
    public final int p() {
        return 2;
    }
}
