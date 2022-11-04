package ak;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: ak.a$a */
    /* loaded from: classes3.dex */
    public static class C0009a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: c */
        private final T[] f548c;

        /* renamed from: d */
        private int f549d = 0;

        public C0009a(T[] tArr) {
            this.f548c = tArr;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f549d < this.f548c.length;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            int i10 = this.f549d;
            T[] tArr = this.f548c;
            if (i10 != tArr.length) {
                this.f549d = i10 + 1;
                return tArr[i10];
            }
            throw new NoSuchElementException("Out of elements: " + this.f549d);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static void A(char[] cArr, char c10) {
        Arrays.fill(cArr, c10);
    }

    public static void B(int[] iArr, int i10) {
        Arrays.fill(iArr, i10);
    }

    public static void C(long[] jArr, long j10) {
        Arrays.fill(jArr, j10);
    }

    public static void D(short[] sArr, short s10) {
        Arrays.fill(sArr, s10);
    }

    private static int E(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0) {
            return i12;
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        stringBuffer.append(" > ");
        stringBuffer.append(i11);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int F(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ bArr[length];
        }
    }

    public static int G(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * 257) ^ bArr[i10 + i11];
        }
    }

    public static int H(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ cArr[length];
        }
    }

    public static int I(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ iArr[length];
        }
    }

    public static int J(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * 257) ^ iArr[i10 + i11];
        }
    }

    public static int K(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            long j10 = jArr[i10 + i11];
            i12 = (((i12 * 257) ^ ((int) j10)) * 257) ^ ((int) (j10 >>> 32));
        }
    }

    public static int L(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ (sArr[length] & 255);
        }
    }

    public static int M(short[][] sArr) {
        int i10 = 0;
        for (int i11 = 0; i11 != sArr.length; i11++) {
            i10 = (i10 * 257) + L(sArr[i11]);
        }
        return i10;
    }

    public static int N(short[][][] sArr) {
        int i10 = 0;
        for (int i11 = 0; i11 != sArr.length; i11++) {
            i10 = (i10 * 257) + M(sArr[i11]);
        }
        return i10;
    }

    public static boolean O(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] P(byte[] bArr, byte b10) {
        if (bArr == null) {
            return new byte[]{b10};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b10;
        return bArr2;
    }

    public static byte[] Q(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i10 = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i10];
            i10++;
        }
    }

    public static byte[] R(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length];
            bArr[length] = b10;
            length--;
        }
        return bArr;
    }

    public static int[] S(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[length];
            iArr[length] = i11;
            length--;
        }
        return iArr;
    }

    public static boolean a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 |= bArr[i10 + i13];
        }
        return i12 == 0;
    }

    public static boolean b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = i11 - i10;
        if (i14 != i13 - i12) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (bArr[i10 + i15] != bArr2[i12 + i15]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean f(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static void g(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return h(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static char[] j(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static int[] k(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static long[] l(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static long[] m(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return l(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static short[] n(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static boolean[] o(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return h(bArr2);
        }
        if (bArr2 == null) {
            return h(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] q(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return p(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return p(bArr, bArr3);
        }
        if (bArr3 == null) {
            return p(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] r(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return q(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return q(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return q(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return q(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static short[] s(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            return n(sArr2);
        }
        if (sArr2 == null) {
            return n(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean t(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        Objects.requireNonNull(bArr, "'a' cannot be null");
        Objects.requireNonNull(bArr2, "'b' cannot be null");
        if (i10 >= 0) {
            if (i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
            }
            if (i12 > bArr2.length - i10) {
                throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= bArr[i11 + i14] ^ bArr2[i12 + i14];
            }
            return i13 == 0;
        }
        throw new IllegalArgumentException("'len' cannot be negative");
    }

    public static boolean u(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        int length2 = bArr.length ^ bArr2.length;
        for (int i10 = 0; i10 != length; i10++) {
            length2 |= bArr[i10] ^ bArr2[i10];
        }
        while (length < bArr2.length) {
            length2 |= bArr2[length] ^ (~bArr2[length]);
            length++;
        }
        return length2 == 0;
    }

    public static byte[] v(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
        return bArr2;
    }

    public static byte[] w(byte[] bArr, int i10, int i11) {
        int E = E(i10, i11);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i10, bArr2, 0, Math.min(bArr.length - i10, E));
        return bArr2;
    }

    public static int[] x(int[] iArr, int i10, int i11) {
        int E = E(i10, i11);
        int[] iArr2 = new int[E];
        System.arraycopy(iArr, i10, iArr2, 0, Math.min(iArr.length - i10, E));
        return iArr2;
    }

    public static void y(byte[] bArr, byte b10) {
        Arrays.fill(bArr, b10);
    }

    public static void z(byte[] bArr, int i10, int i11, byte b10) {
        Arrays.fill(bArr, i10, i11, b10);
    }
}
