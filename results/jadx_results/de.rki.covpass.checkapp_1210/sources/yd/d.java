package yd;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes3.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: c */
    public static final d f26096c = new p(new byte[0]);

    /* loaded from: classes3.dex */
    public interface a extends Iterator<Byte> {
        byte a();
    }

    /* loaded from: classes3.dex */
    public static final class b extends OutputStream {
        private static final byte[] U3 = new byte[0];

        /* renamed from: c */
        private final int f26097c;

        /* renamed from: d */
        private final ArrayList<d> f26098d;

        /* renamed from: q */
        private int f26099q;

        /* renamed from: x */
        private byte[] f26100x;

        /* renamed from: y */
        private int f26101y;

        b(int i10) {
            if (i10 >= 0) {
                this.f26097c = i10;
                this.f26098d = new ArrayList<>();
                this.f26100x = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] b(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void e(int i10) {
            this.f26098d.add(new p(this.f26100x));
            int length = this.f26099q + this.f26100x.length;
            this.f26099q = length;
            this.f26100x = new byte[Math.max(this.f26097c, Math.max(i10, length >>> 1))];
            this.f26101y = 0;
        }

        private void f() {
            int i10 = this.f26101y;
            byte[] bArr = this.f26100x;
            if (i10 >= bArr.length) {
                this.f26098d.add(new p(this.f26100x));
                this.f26100x = U3;
            } else if (i10 > 0) {
                this.f26098d.add(new p(b(bArr, i10)));
            }
            this.f26099q += this.f26101y;
            this.f26101y = 0;
        }

        public synchronized int h() {
            return this.f26099q + this.f26101y;
        }

        public synchronized d i() {
            f();
            return d.c(this.f26098d);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.f26101y == this.f26100x.length) {
                e(1);
            }
            byte[] bArr = this.f26100x;
            int i11 = this.f26101y;
            this.f26101y = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.f26100x;
            int length = bArr2.length;
            int i12 = this.f26101y;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f26101y += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                e(i13);
                System.arraycopy(bArr, i10 + length2, this.f26100x, 0, i13);
                this.f26101y = i13;
            }
        }
    }

    private static d a(Iterator<d> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).b(a(it, i10 - i11));
    }

    public static d c(Iterable<d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (d dVar : iterable) {
                collection.add(dVar);
            }
        } else {
            collection = (Collection) iterable;
        }
        return collection.isEmpty() ? f26096c : a(collection.iterator(), collection.size());
    }

    public static d d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static d e(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new p(bArr2);
    }

    public static d f(String str) {
        try {
            return new p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b r() {
        return new b(128);
    }

    public abstract String C(String str);

    public String D() {
        try {
            return C("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public void E(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            int i12 = i10 + i11;
            if (i12 <= size()) {
                if (i11 <= 0) {
                    return;
                }
                F(outputStream, i10, i11);
                return;
            }
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public abstract void F(OutputStream outputStream, int i10, int i11);

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return u.K(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void i(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        } else {
            int i13 = i10 + i12;
            if (i13 > size()) {
                StringBuilder sb5 = new StringBuilder(34);
                sb5.append("Source end offset < 0: ");
                sb5.append(i13);
                throw new IndexOutOfBoundsException(sb5.toString());
            }
            int i14 = i11 + i12;
            if (i14 <= bArr.length) {
                if (i12 <= 0) {
                    return;
                }
                k(bArr, i10, i11, i12);
                return;
            }
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract void k(byte[] bArr, int i10, int i11, int i12);

    public abstract int l();

    public abstract boolean m();

    public abstract boolean n();

    /* renamed from: o */
    public abstract a iterator();

    public abstract e q();

    public abstract int s(int i10, int i11, int i12);

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u(int i10, int i11, int i12);

    public abstract int w();

    public byte[] z() {
        int size = size();
        if (size == 0) {
            return j.f26151a;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }
}
