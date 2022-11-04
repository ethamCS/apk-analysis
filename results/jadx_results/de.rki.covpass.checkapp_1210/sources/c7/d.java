package c7;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a */
    private final int f6328a;

    /* renamed from: b */
    private final int f6329b;

    /* renamed from: c */
    private final int f6330c;

    /* renamed from: d */
    private final int f6331d;

    /* renamed from: e */
    private int f6332e = -1;

    public d(int i10, int i11, int i12, int i13) {
        this.f6328a = i10;
        this.f6329b = i11;
        this.f6330c = i12;
        this.f6331d = i13;
    }

    public int a() {
        return this.f6330c;
    }

    public int b() {
        return this.f6329b;
    }

    public int c() {
        return this.f6332e;
    }

    public int d() {
        return this.f6328a;
    }

    public int e() {
        return this.f6331d;
    }

    public int f() {
        return this.f6329b - this.f6328a;
    }

    public boolean g() {
        return h(this.f6332e);
    }

    public boolean h(int i10) {
        return i10 != -1 && this.f6330c == (i10 % 3) * 3;
    }

    public void i(int i10) {
        this.f6332e = i10;
    }

    public void j() {
        this.f6332e = ((this.f6331d / 30) * 3) + (this.f6330c / 3);
    }

    public String toString() {
        return this.f6332e + "|" + this.f6331d;
    }
}
