package h6;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    private final int f11346a;

    /* renamed from: b */
    private final int f11347b;

    public j(int i10, int i11) {
        this.f11346a = i10;
        this.f11347b = i11;
    }

    public final int a() {
        return this.f11347b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f11346a;
    }

    public j e() {
        return new i(this);
    }

    public boolean f() {
        return false;
    }

    public j g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f11346a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f11347b * (i10 + 1));
        for (int i11 = 0; i11 < this.f11347b; i11++) {
            bArr = c(i11, bArr);
            for (int i12 = 0; i12 < this.f11346a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
