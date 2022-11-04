package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import yd.d;
/* loaded from: classes3.dex */
public class p extends d {

    /* renamed from: d */
    protected final byte[] f26163d;

    /* renamed from: q */
    private int f26164q = 0;

    /* loaded from: classes3.dex */
    public class b implements d.a, Iterator {

        /* renamed from: c */
        private int f26165c;

        /* renamed from: d */
        private final int f26166d;

        private b() {
            p.this = r2;
            this.f26165c = 0;
            this.f26166d = r2.size();
        }

        @Override // yd.d.a
        public byte a() {
            try {
                byte[] bArr = p.this.f26163d;
                int i10 = this.f26165c;
                this.f26165c = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        /* renamed from: b */
        public Byte next() {
            return Byte.valueOf(a());
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Byte> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f26165c < this.f26166d;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p(byte[] bArr) {
        this.f26163d = bArr;
    }

    static int K(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // yd.d
    public String C(String str) {
        return new String(this.f26163d, J(), size(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // yd.d
    public void F(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f26163d, J() + i10, i11);
    }

    public byte G(int i10) {
        return this.f26163d[i10];
    }

    public boolean H(p pVar, int i10, int i11) {
        if (i11 > pVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i10 + i11 > pVar.size()) {
            int size2 = pVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            byte[] bArr = this.f26163d;
            byte[] bArr2 = pVar.f26163d;
            int J = J() + i11;
            int J2 = J();
            int J3 = pVar.J() + i10;
            while (J2 < J) {
                if (bArr[J2] != bArr2[J3]) {
                    return false;
                }
                J2++;
                J3++;
            }
            return true;
        }
    }

    public int J() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p) {
            return H((p) obj, 0, size());
        }
        if (obj instanceof u) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i10 = this.f26164q;
        if (i10 == 0) {
            int size = size();
            i10 = s(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f26164q = i10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public void k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f26163d, i10, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int l() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public boolean m() {
        return true;
    }

    @Override // yd.d
    public boolean n() {
        int J = J();
        return y.f(this.f26163d, J, size() + J);
    }

    @Override // yd.d
    /* renamed from: o */
    public d.a iterator() {
        return new b();
    }

    @Override // yd.d
    public e q() {
        return e.h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int s(int i10, int i11, int i12) {
        return K(i10, this.f26163d, J() + i11, i12);
    }

    @Override // yd.d
    public int size() {
        return this.f26163d.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int u(int i10, int i11, int i12) {
        int J = J() + i11;
        return y.g(i10, this.f26163d, J, i12 + J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int w() {
        return this.f26164q;
    }
}
