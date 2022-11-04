package g6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
abstract class i implements p {

    /* renamed from: c */
    private static final int[] f10574c = m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f10575a;

    /* renamed from: b */
    private final int f10576b;

    public i(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.f10575a = m(bArr);
            this.f10576b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i10 = (remaining / 64) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer c10 = c(bArr, this.f10576b + i11);
            if (i11 == i10 - 1) {
                g.c(byteBuffer, byteBuffer2, c10, remaining % 64);
            } else {
                g.c(byteBuffer, byteBuffer2, c10, 64);
            }
        }
    }

    static void i(int[] iArr, int i10, int i11, int i12, int i13) {
        iArr[i10] = iArr[i10] + iArr[i11];
        iArr[i13] = j(iArr[i13] ^ iArr[i10], 16);
        iArr[i12] = iArr[i12] + iArr[i13];
        iArr[i11] = j(iArr[i11] ^ iArr[i12], 12);
        iArr[i10] = iArr[i10] + iArr[i11];
        iArr[i13] = j(iArr[i10] ^ iArr[i13], 8);
        iArr[i12] = iArr[i12] + iArr[i13];
        iArr[i11] = j(iArr[i11] ^ iArr[i12], 7);
    }

    private static int j(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static void k(int[] iArr, int[] iArr2) {
        int[] iArr3 = f10574c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void l(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            i(iArr, 0, 4, 8, 12);
            i(iArr, 1, 5, 9, 13);
            i(iArr, 2, 6, 10, 14);
            i(iArr, 3, 7, 11, 15);
            i(iArr, 0, 5, 10, 15);
            i(iArr, 1, 6, 11, 12);
            i(iArr, 2, 7, 8, 13);
            i(iArr, 3, 4, 9, 14);
        }
    }

    static int[] m(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // g6.p
    public byte[] a(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // g6.p
    public byte[] b(byte[] bArr) {
        return e(ByteBuffer.wrap(bArr));
    }

    public ByteBuffer c(byte[] bArr, int i10) {
        int[] d10 = d(m(bArr), i10);
        int[] iArr = (int[]) d10.clone();
        l(iArr);
        for (int i11 = 0; i11 < d10.length; i11++) {
            d10[i11] = d10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d10, 0, 16);
        return order;
    }

    abstract int[] d(int[] iArr, int i10);

    public byte[] e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= g()) {
            byte[] bArr = new byte[g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] c10 = u.c(g());
            byteBuffer.put(c10);
            h(c10, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int g();
}
