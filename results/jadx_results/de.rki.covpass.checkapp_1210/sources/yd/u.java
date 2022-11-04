package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;
import yd.d;
/* loaded from: classes3.dex */
public class u extends yd.d {
    private static final int[] W3;
    private final int U3;
    private int V3;

    /* renamed from: d */
    private final int f26168d;

    /* renamed from: q */
    private final yd.d f26169q;

    /* renamed from: x */
    private final yd.d f26170x;

    /* renamed from: y */
    private final int f26171y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final Stack<yd.d> f26172a;

        private b() {
            this.f26172a = new Stack<>();
        }

        public yd.d b(yd.d dVar, yd.d dVar2) {
            c(dVar);
            c(dVar2);
            yd.d pop = this.f26172a.pop();
            while (!this.f26172a.isEmpty()) {
                pop = new u(this.f26172a.pop(), pop);
            }
            return pop;
        }

        private void c(yd.d dVar) {
            if (dVar.m()) {
                e(dVar);
            } else if (dVar instanceof u) {
                u uVar = (u) dVar;
                c(uVar.f26169q);
                c(uVar.f26170x);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(u.W3, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(yd.d dVar) {
            int d10 = d(dVar.size());
            int i10 = u.W3[d10 + 1];
            if (this.f26172a.isEmpty() || this.f26172a.peek().size() >= i10) {
                this.f26172a.push(dVar);
                return;
            }
            int i11 = u.W3[d10];
            yd.d pop = this.f26172a.pop();
            while (!this.f26172a.isEmpty() && this.f26172a.peek().size() < i11) {
                pop = new u(this.f26172a.pop(), pop);
            }
            u uVar = new u(pop, dVar);
            while (!this.f26172a.isEmpty()) {
                if (this.f26172a.peek().size() >= u.W3[d(uVar.size()) + 1]) {
                    break;
                }
                uVar = new u(this.f26172a.pop(), uVar);
            }
            this.f26172a.push(uVar);
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Iterator<p>, j$.util.Iterator {

        /* renamed from: c */
        private final Stack<u> f26173c;

        /* renamed from: d */
        private p f26174d;

        private c(yd.d dVar) {
            this.f26173c = new Stack<>();
            this.f26174d = b(dVar);
        }

        private p b(yd.d dVar) {
            while (dVar instanceof u) {
                u uVar = (u) dVar;
                this.f26173c.push(uVar);
                dVar = uVar.f26169q;
            }
            return (p) dVar;
        }

        private p c() {
            while (!this.f26173c.isEmpty()) {
                p b10 = b(this.f26173c.pop().f26170x);
                if (!b10.isEmpty()) {
                    return b10;
                }
            }
            return null;
        }

        /* renamed from: d */
        public p next() {
            p pVar = this.f26174d;
            if (pVar != null) {
                this.f26174d = c();
                return pVar;
            }
            throw new NoSuchElementException();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super p> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f26174d != null;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements d.a, j$.util.Iterator {

        /* renamed from: c */
        private final c f26175c;

        /* renamed from: d */
        private d.a f26176d;

        /* renamed from: q */
        int f26177q;

        private d() {
            u.this = r3;
            c cVar = new c(r3);
            this.f26175c = cVar;
            this.f26176d = cVar.next().iterator();
            this.f26177q = r3.size();
        }

        @Override // yd.d.a
        public byte a() {
            if (!this.f26176d.hasNext()) {
                this.f26176d = this.f26175c.next().iterator();
            }
            this.f26177q--;
            return this.f26176d.a();
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
            return this.f26177q > 0;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    private class e extends InputStream {
        private int U3;

        /* renamed from: c */
        private c f26179c;

        /* renamed from: d */
        private p f26180d;

        /* renamed from: q */
        private int f26181q;

        /* renamed from: x */
        private int f26182x;

        /* renamed from: y */
        private int f26183y;

        public e() {
            u.this = r1;
            e();
        }

        private void b() {
            if (this.f26180d != null) {
                int i10 = this.f26182x;
                int i11 = this.f26181q;
                if (i10 != i11) {
                    return;
                }
                this.f26183y += i11;
                int i12 = 0;
                this.f26182x = 0;
                if (this.f26179c.hasNext()) {
                    p next = this.f26179c.next();
                    this.f26180d = next;
                    i12 = next.size();
                } else {
                    this.f26180d = null;
                }
                this.f26181q = i12;
            }
        }

        private void e() {
            c cVar = new c(u.this);
            this.f26179c = cVar;
            p next = cVar.next();
            this.f26180d = next;
            this.f26181q = next.size();
            this.f26182x = 0;
            this.f26183y = 0;
        }

        private int f(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (true) {
                if (i12 <= 0) {
                    break;
                }
                b();
                if (this.f26180d != null) {
                    int min = Math.min(this.f26181q - this.f26182x, i12);
                    if (bArr != null) {
                        this.f26180d.i(bArr, this.f26182x, i10, min);
                        i10 += min;
                    }
                    this.f26182x += min;
                    i12 -= min;
                } else if (i12 == i11) {
                    return -1;
                }
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() {
            return u.this.size() - (this.f26183y + this.f26182x);
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.U3 = this.f26183y + this.f26182x;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            b();
            p pVar = this.f26180d;
            if (pVar == null) {
                return -1;
            }
            int i10 = this.f26182x;
            this.f26182x = i10 + 1;
            return pVar.G(i10) & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            Objects.requireNonNull(bArr);
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return f(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            e();
            f(null, 0, this.U3);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 >= 0) {
                if (j10 > 2147483647L) {
                    j10 = 2147483647L;
                }
                return f(null, 0, (int) j10);
            }
            throw new IndexOutOfBoundsException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        W3 = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = W3;
            if (i13 < iArr.length) {
                iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                i13++;
            } else {
                return;
            }
        }
    }

    private u(yd.d dVar, yd.d dVar2) {
        this.V3 = 0;
        this.f26169q = dVar;
        this.f26170x = dVar2;
        int size = dVar.size();
        this.f26171y = size;
        this.f26168d = size + dVar2.size();
        this.U3 = Math.max(dVar.l(), dVar2.l()) + 1;
    }

    public static yd.d K(yd.d dVar, yd.d dVar2) {
        u uVar = dVar instanceof u ? (u) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return L(dVar, dVar2);
            }
            if (uVar != null && uVar.f26170x.size() + dVar2.size() < 128) {
                dVar2 = new u(uVar.f26169q, L(uVar.f26170x, dVar2));
            } else if (uVar == null || uVar.f26169q.l() <= uVar.f26170x.l() || uVar.l() <= dVar2.l()) {
                return size >= W3[Math.max(dVar.l(), dVar2.l()) + 1] ? new u(dVar, dVar2) : new b().b(dVar, dVar2);
            } else {
                dVar2 = new u(uVar.f26169q, new u(uVar.f26170x, dVar2));
            }
        }
        return dVar2;
    }

    private static p L(yd.d dVar, yd.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.i(bArr, 0, 0, size);
        dVar2.i(bArr, 0, size, size2);
        return new p(bArr);
    }

    private boolean M(yd.d dVar) {
        c cVar = new c(this);
        p next = cVar.next();
        c cVar2 = new c(dVar);
        p next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int min = Math.min(size, size2);
            if (!(i10 == 0 ? next.H(next2, i11, min) : next2.H(next, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f26168d;
            if (i12 >= i13) {
                if (i12 != i13) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if (min == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // yd.d
    public String C(String str) {
        return new String(z(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // yd.d
    public void F(OutputStream outputStream, int i10, int i11) {
        yd.d dVar;
        int i12 = i10 + i11;
        int i13 = this.f26171y;
        if (i12 <= i13) {
            dVar = this.f26169q;
        } else if (i10 < i13) {
            int i14 = i13 - i10;
            this.f26169q.F(outputStream, i10, i14);
            this.f26170x.F(outputStream, 0, i11 - i14);
            return;
        } else {
            dVar = this.f26170x;
            i10 -= i13;
        }
        dVar.F(outputStream, i10, i11);
    }

    public boolean equals(Object obj) {
        int w9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yd.d)) {
            return false;
        }
        yd.d dVar = (yd.d) obj;
        if (this.f26168d != dVar.size()) {
            return false;
        }
        if (this.f26168d == 0) {
            return true;
        }
        if (this.V3 != 0 && (w9 = dVar.w()) != 0 && this.V3 != w9) {
            return false;
        }
        return M(dVar);
    }

    public int hashCode() {
        int i10 = this.V3;
        if (i10 == 0) {
            int i11 = this.f26168d;
            i10 = s(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.V3 = i10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public void k(byte[] bArr, int i10, int i11, int i12) {
        yd.d dVar;
        int i13 = i10 + i12;
        int i14 = this.f26171y;
        if (i13 <= i14) {
            dVar = this.f26169q;
        } else if (i10 < i14) {
            int i15 = i14 - i10;
            this.f26169q.k(bArr, i10, i11, i15);
            this.f26170x.k(bArr, 0, i11 + i15, i12 - i15);
            return;
        } else {
            dVar = this.f26170x;
            i10 -= i14;
        }
        dVar.k(bArr, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int l() {
        return this.U3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public boolean m() {
        return this.f26168d >= W3[this.U3];
    }

    @Override // yd.d
    public boolean n() {
        int u10 = this.f26169q.u(0, 0, this.f26171y);
        yd.d dVar = this.f26170x;
        return dVar.u(u10, 0, dVar.size()) == 0;
    }

    @Override // yd.d
    /* renamed from: o */
    public d.a iterator() {
        return new d();
    }

    @Override // yd.d
    public yd.e q() {
        return yd.e.g(new e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int s(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f26171y;
        if (i13 <= i14) {
            return this.f26169q.s(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f26170x.s(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f26170x.s(this.f26169q.s(i10, i11, i15), 0, i12 - i15);
    }

    @Override // yd.d
    public int size() {
        return this.f26168d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f26171y;
        if (i13 <= i14) {
            return this.f26169q.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f26170x.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f26170x.u(this.f26169q.u(i10, i11, i15), 0, i12 - i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.d
    public int w() {
        return this.V3;
    }
}
