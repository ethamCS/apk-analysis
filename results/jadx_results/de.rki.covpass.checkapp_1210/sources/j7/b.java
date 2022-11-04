package j7;

import java.lang.reflect.Array;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final byte[][] f14035a;

    /* renamed from: b */
    private final int f14036b;

    /* renamed from: c */
    private final int f14037c;

    public b(int i10, int i11) {
        this.f14035a = (byte[][]) Array.newInstance(byte.class, i11, i10);
        this.f14036b = i10;
        this.f14037c = i11;
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f14035a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f14035a[i11][i10];
    }

    public byte[][] c() {
        return this.f14035a;
    }

    public int d() {
        return this.f14037c;
    }

    public int e() {
        return this.f14036b;
    }

    public void f(int i10, int i11, int i12) {
        this.f14035a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f14035a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f14036b * 2 * this.f14037c) + 2);
        for (int i10 = 0; i10 < this.f14037c; i10++) {
            byte[] bArr = this.f14035a[i10];
            for (int i11 = 0; i11 < this.f14036b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? "  " : " 1" : " 0");
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
