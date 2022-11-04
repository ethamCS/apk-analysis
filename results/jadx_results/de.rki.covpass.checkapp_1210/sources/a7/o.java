package a7;
/* loaded from: classes.dex */
final class o extends q {

    /* renamed from: b */
    private final String f206b;

    /* renamed from: c */
    private final int f207c;

    /* renamed from: d */
    private final boolean f208d;

    public o(int i10, String str) {
        super(i10);
        this.f206b = str;
        this.f208d = false;
        this.f207c = 0;
    }

    public o(int i10, String str, int i11) {
        super(i10);
        this.f208d = true;
        this.f207c = i11;
        this.f206b = str;
    }

    public String b() {
        return this.f206b;
    }

    public int c() {
        return this.f207c;
    }

    public boolean d() {
        return this.f208d;
    }
}
