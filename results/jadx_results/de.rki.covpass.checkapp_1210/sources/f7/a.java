package f7;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final b[] f9859a;

    /* renamed from: b */
    private int f9860b;

    /* renamed from: c */
    private final int f9861c;

    /* renamed from: d */
    private final int f9862d;

    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f9859a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f9859a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f9862d = i11 * 17;
        this.f9861c = i10;
        this.f9860b = -1;
    }

    public b a() {
        return this.f9859a[this.f9860b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.f9861c * i11, this.f9862d * i10);
        int i12 = this.f9861c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f9859a[i13 / i11].b(i10);
        }
        return bArr;
    }

    public void c() {
        this.f9860b++;
    }
}
