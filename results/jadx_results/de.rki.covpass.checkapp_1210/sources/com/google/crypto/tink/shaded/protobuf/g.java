package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class g extends c<Boolean> implements b0.a, RandomAccess, b1 {

    /* renamed from: x */
    private static final g f7872x;

    /* renamed from: d */
    private boolean[] f7873d;

    /* renamed from: q */
    private int f7874q;

    static {
        g gVar = new g(new boolean[0], 0);
        f7872x = gVar;
        gVar.p();
    }

    public g() {
        this(new boolean[10], 0);
    }

    private g(boolean[] zArr, int i10) {
        this.f7873d = zArr;
        this.f7874q = i10;
    }

    private void d(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7874q)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        boolean[] zArr = this.f7873d;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f7873d, i10, zArr2, i10 + 1, this.f7874q - i10);
            this.f7873d = zArr2;
        }
        this.f7873d[i10] = z10;
        this.f7874q++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f7874q) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7874q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        b0.a(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f7874q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7874q;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f7873d;
        if (i12 > zArr.length) {
            this.f7873d = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(gVar.f7873d, 0, this.f7873d, this.f7874q, gVar.f7874q);
        this.f7874q = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public void add(int i10, Boolean bool) {
        d(i10, bool.booleanValue());
    }

    /* renamed from: c */
    public boolean add(Boolean bool) {
        e(bool.booleanValue());
        return true;
    }

    public void e(boolean z10) {
        a();
        int i10 = this.f7874q;
        boolean[] zArr = this.f7873d;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f7873d = zArr2;
        }
        boolean[] zArr3 = this.f7873d;
        int i11 = this.f7874q;
        this.f7874q = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f7874q != gVar.f7874q) {
            return false;
        }
        boolean[] zArr = gVar.f7873d;
        for (int i10 = 0; i10 < this.f7874q; i10++) {
            if (this.f7873d[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7874q; i11++) {
            i10 = (i10 * 31) + b0.c(this.f7873d[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public Boolean get(int i10) {
        return Boolean.valueOf(k(i10));
    }

    public boolean k(int i10) {
        f(i10);
        return this.f7873d[i10];
    }

    /* renamed from: m */
    public b0.a t(int i10) {
        if (i10 >= this.f7874q) {
            return new g(Arrays.copyOf(this.f7873d, i10), this.f7874q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Boolean remove(int i10) {
        int i11;
        a();
        f(i10);
        boolean[] zArr = this.f7873d;
        boolean z10 = zArr[i10];
        if (i10 < this.f7874q - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f7874q--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    /* renamed from: o */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(q(i10, bool.booleanValue()));
    }

    public boolean q(int i10, boolean z10) {
        a();
        f(i10);
        boolean[] zArr = this.f7873d;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f7874q; i10++) {
            if (obj.equals(Boolean.valueOf(this.f7873d[i10]))) {
                boolean[] zArr = this.f7873d;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f7874q - i10) - 1);
                this.f7874q--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f7873d;
            System.arraycopy(zArr, i11, zArr, i10, this.f7874q - i11);
            this.f7874q -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7874q;
    }
}
