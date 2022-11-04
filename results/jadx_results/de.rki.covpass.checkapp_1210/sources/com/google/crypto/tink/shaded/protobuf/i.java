package com.google.crypto.tink.shaded.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: d */
    public static final i f7878d = new j(b0.f7824c);

    /* renamed from: q */
    private static final f f7879q;

    /* renamed from: x */
    private static final Comparator<i> f7880x;

    /* renamed from: c */
    private int f7881c = 0;

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: c */
        private int f7882c = 0;

        /* renamed from: d */
        private final int f7883d;

        a() {
            i.this = r2;
            this.f7883d = r2.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.g
        public byte a() {
            int i10 = this.f7882c;
            if (i10 < this.f7883d) {
                this.f7882c = i10 + 1;
                return i.this.s(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f7882c < this.f7883d;
        }
    }

    /* loaded from: classes.dex */
    class b implements Comparator<i> {
        b() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            g it = iVar.iterator();
            g it2 = iVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(i.c0(it.a()), i.c0(it2.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(iVar.size(), iVar2.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c implements g, Iterator {
        c() {
        }

        /* renamed from: b */
        public final Byte next() {
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
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends j {
        private final int U3;
        private final int V3;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.f(i10, i10 + i11, bArr.length);
            this.U3 = i10;
            this.V3 = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public byte c(int i10) {
            i.e(i10, size());
            return this.f7887y[this.U3 + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j
        protected int l0() {
            return this.U3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        protected void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7887y, l0() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        byte s(int i10) {
            return this.f7887y[this.U3 + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.V3;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface g extends java.util.Iterator<Byte> {
        byte a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        private final l f7885a;

        /* renamed from: b */
        private final byte[] f7886b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f7886b = bArr;
            this.f7885a = l.d0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public i a() {
            this.f7885a.c();
            return new j(this.f7886b);
        }

        public l b() {
            return this.f7885a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0114i extends i {
        AbstractC0114i() {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends AbstractC0114i {

        /* renamed from: y */
        protected final byte[] f7887y;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f7887y = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final com.google.crypto.tink.shaded.protobuf.j M() {
            return com.google.crypto.tink.shaded.protobuf.j.h(this.f7887y, l0(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final int N(int i10, int i11, int i12) {
            return b0.i(i10, this.f7887y, l0() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final i W(int i10, int i11) {
            int f10 = i.f(i10, i11, size());
            return f10 == 0 ? i.f7878d : new e(this.f7887y, l0() + i10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public byte c(int i10) {
            return this.f7887y[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final String e0(Charset charset) {
            return new String(this.f7887y, l0(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int V = V();
            int V2 = jVar.V();
            if (V != 0 && V2 != 0 && V != V2) {
                return false;
            }
            return k0(jVar, 0, size());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final void j0(com.google.crypto.tink.shaded.protobuf.h hVar) {
            hVar.a(this.f7887y, l0(), size());
        }

        final boolean k0(i iVar, int i10, int i11) {
            if (i11 > iVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > iVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
            } else if (!(iVar instanceof j)) {
                return iVar.W(i10, i12).equals(W(0, i11));
            } else {
                j jVar = (j) iVar;
                byte[] bArr = this.f7887y;
                byte[] bArr2 = jVar.f7887y;
                int l02 = l0() + i11;
                int l03 = l0();
                int l04 = jVar.l0() + i10;
                while (l03 < l02) {
                    if (bArr[l03] != bArr2[l04]) {
                        return false;
                    }
                    l03++;
                    l04++;
                }
                return true;
            }
        }

        protected int l0() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7887y, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        byte s(int i10) {
            return this.f7887y[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.f7887y.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean u() {
            int l02 = l0();
            return t1.n(this.f7887y, l02, size() + l02);
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f7879q = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(null) : new d(null);
        f7880x = new b();
    }

    i() {
    }

    public static h G(int i10) {
        return new h(i10, null);
    }

    public static int c0(byte b10) {
        return b10 & 255;
    }

    static void e(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int f(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    private String g0() {
        if (size() <= 50) {
            return m1.a(this);
        }
        return m1.a(W(0, 47)) + "...";
    }

    public static i h0(byte[] bArr) {
        return new j(bArr);
    }

    public static i i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static i i0(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static i k(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new j(f7879q.a(bArr, i10, i11));
    }

    public static i n(String str) {
        return new j(str.getBytes(b0.f7822a));
    }

    public abstract com.google.crypto.tink.shaded.protobuf.j M();

    protected abstract int N(int i10, int i11, int i12);

    protected final int V() {
        return this.f7881c;
    }

    public abstract i W(int i10, int i11);

    public final byte[] b0() {
        int size = size();
        if (size == 0) {
            return b0.f7824c;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    public abstract byte c(int i10);

    public final String d0(Charset charset) {
        return size() == 0 ? BuildConfig.FLAVOR : e0(charset);
    }

    protected abstract String e0(Charset charset);

    public abstract boolean equals(Object obj);

    public final String f0() {
        return d0(b0.f7822a);
    }

    public final int hashCode() {
        int i10 = this.f7881c;
        if (i10 == 0) {
            int size = size();
            i10 = N(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7881c = i10;
        }
        return i10;
    }

    public abstract void j0(com.google.crypto.tink.shaded.protobuf.h hVar);

    protected abstract void r(byte[] bArr, int i10, int i11, int i12);

    abstract byte s(int i10);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), g0());
    }

    public abstract boolean u();

    /* renamed from: z */
    public g iterator() {
        return new a();
    }
}
