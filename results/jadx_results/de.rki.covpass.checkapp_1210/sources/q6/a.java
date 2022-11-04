package q6;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: j */
    public static final a f19675j;

    /* renamed from: m */
    public static final a f19678m;

    /* renamed from: n */
    public static final a f19679n;

    /* renamed from: o */
    public static final a f19680o;

    /* renamed from: a */
    private final int[] f19681a;

    /* renamed from: b */
    private final int[] f19682b;

    /* renamed from: c */
    private final b f19683c;

    /* renamed from: d */
    private final b f19684d;

    /* renamed from: e */
    private final int f19685e;

    /* renamed from: f */
    private final int f19686f;

    /* renamed from: g */
    private final int f19687g;

    /* renamed from: h */
    public static final a f19673h = new a(4201, 4096, 1);

    /* renamed from: i */
    public static final a f19674i = new a(1033, 1024, 1);

    /* renamed from: k */
    public static final a f19676k = new a(19, 16, 1);

    /* renamed from: l */
    public static final a f19677l = new a(285, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);

    static {
        a aVar = new a(67, 64, 1);
        f19675j = aVar;
        a aVar2 = new a(301, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1);
        f19678m = aVar2;
        f19679n = aVar2;
        f19680o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f19686f = i10;
        this.f19685e = i11;
        this.f19687g = i12;
        this.f19681a = new int[i11];
        this.f19682b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f19681a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f19682b[this.f19681a[i15]] = i15;
        }
        this.f19683c = new b(this, new int[]{0});
        this.f19684d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f19683c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public int c(int i10) {
        return this.f19681a[i10];
    }

    public int d() {
        return this.f19687g;
    }

    public b e() {
        return this.f19684d;
    }

    public int f() {
        return this.f19685e;
    }

    public b g() {
        return this.f19683c;
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f19681a[(this.f19685e - this.f19682b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i10) {
        if (i10 != 0) {
            return this.f19682b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f19681a;
        int[] iArr2 = this.f19682b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f19685e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f19686f) + ',' + this.f19685e + ')';
    }
}
