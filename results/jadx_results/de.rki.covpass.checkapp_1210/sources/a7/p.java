package a7;
/* loaded from: classes.dex */
final class p extends q {

    /* renamed from: b */
    private final int f209b;

    /* renamed from: c */
    private final int f210c;

    public p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw h6.h.b();
        }
        this.f209b = i11;
        this.f210c = i12;
    }

    public int b() {
        return this.f209b;
    }

    public int c() {
        return this.f210c;
    }

    public boolean d() {
        return this.f209b == 10;
    }

    public boolean e() {
        return this.f210c == 10;
    }
}
