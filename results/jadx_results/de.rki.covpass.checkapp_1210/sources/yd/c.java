package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import yd.d;
/* loaded from: classes3.dex */
public class c extends p {

    /* renamed from: x */
    private final int f26091x;

    /* renamed from: y */
    private final int f26092y;

    /* loaded from: classes3.dex */
    public class b implements d.a, Iterator {

        /* renamed from: c */
        private int f26093c;

        /* renamed from: d */
        private final int f26094d;

        private b() {
            c.this = r2;
            int J = r2.J();
            this.f26093c = J;
            this.f26094d = J + r2.size();
        }

        @Override // yd.d.a
        public byte a() {
            int i10 = this.f26093c;
            if (i10 < this.f26094d) {
                byte[] bArr = c.this.f26163d;
                this.f26093c = i10 + 1;
                return bArr[i10];
            }
            throw new NoSuchElementException();
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
            return this.f26093c < this.f26094d;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        } else if (i10 + i11 <= bArr.length) {
            this.f26091x = i10;
            this.f26092y = i11;
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("Offset+Length too large: ");
            sb4.append(i10);
            sb4.append("+");
            sb4.append(i11);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    @Override // yd.p
    public byte G(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        } else if (i10 < size()) {
            return this.f26163d[this.f26091x + i10];
        } else {
            int size = size();
            StringBuilder sb3 = new StringBuilder(41);
            sb3.append("Index too large: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(size);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    @Override // yd.p
    public int J() {
        return this.f26091x;
    }

    @Override // yd.p, yd.d
    public void k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f26163d, J() + i10, bArr, i11, i12);
    }

    @Override // yd.p, yd.d
    /* renamed from: o */
    public d.a iterator() {
        return new b();
    }

    @Override // yd.p, yd.d
    public int size() {
        return this.f26092y;
    }
}
