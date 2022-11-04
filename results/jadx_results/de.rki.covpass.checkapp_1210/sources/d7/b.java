package d7;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f */
    public static final b f8378f = new b(929, 3);

    /* renamed from: a */
    private final int[] f8379a;

    /* renamed from: b */
    private final int[] f8380b;

    /* renamed from: c */
    private final c f8381c;

    /* renamed from: d */
    private final c f8382d;

    /* renamed from: e */
    private final int f8383e;

    private b(int i10, int i11) {
        this.f8383e = i10;
        this.f8379a = new int[i10];
        this.f8380b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f8379a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f8380b[this.f8379a[i14]] = i14;
        }
        this.f8381c = new c(this, new int[]{0});
        this.f8382d = new c(this, new int[]{1});
    }

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f8383e;
    }

    public c b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f8381c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new c(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public int c(int i10) {
        return this.f8379a[i10];
    }

    public c d() {
        return this.f8382d;
    }

    public int e() {
        return this.f8383e;
    }

    public c f() {
        return this.f8381c;
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.f8379a[(this.f8383e - this.f8380b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f8380b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f8379a;
        int[] iArr2 = this.f8380b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f8383e - 1)];
    }

    public int j(int i10, int i11) {
        int i12 = this.f8383e;
        return ((i10 + i12) - i11) % i12;
    }
}
