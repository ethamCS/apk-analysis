package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class a0 extends c<Integer> implements b0.g, RandomAccess, b1 {

    /* renamed from: x */
    private static final a0 f7818x;

    /* renamed from: d */
    private int[] f7819d;

    /* renamed from: q */
    private int f7820q;

    static {
        a0 a0Var = new a0(new int[0], 0);
        f7818x = a0Var;
        a0Var.p();
    }

    public a0() {
        this(new int[10], 0);
    }

    private a0(int[] iArr, int i10) {
        this.f7819d = iArr;
        this.f7820q = i10;
    }

    private void e(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f7820q)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f7819d;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7819d, i10, iArr2, i10 + 1, this.f7820q - i10);
            this.f7819d = iArr2;
        }
        this.f7819d[i10] = i11;
        this.f7820q++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f7820q) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7820q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        b0.a(collection);
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i10 = a0Var.f7820q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7820q;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f7819d;
        if (i12 > iArr.length) {
            this.f7819d = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(a0Var.f7819d, 0, this.f7819d, this.f7820q, a0Var.f7820q);
        this.f7820q = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public void add(int i10, Integer num) {
        e(i10, num.intValue());
    }

    /* renamed from: c */
    public boolean add(Integer num) {
        d(num.intValue());
        return true;
    }

    public void d(int i10) {
        a();
        int i11 = this.f7820q;
        int[] iArr = this.f7819d;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7819d = iArr2;
        }
        int[] iArr3 = this.f7819d;
        int i12 = this.f7820q;
        this.f7820q = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f7820q != a0Var.f7820q) {
            return false;
        }
        int[] iArr = a0Var.f7819d;
        for (int i10 = 0; i10 < this.f7820q; i10++) {
            if (this.f7819d[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7820q; i11++) {
            i10 = (i10 * 31) + this.f7819d[i11];
        }
        return i10;
    }

    /* renamed from: i */
    public Integer get(int i10) {
        return Integer.valueOf(k(i10));
    }

    public int k(int i10) {
        f(i10);
        return this.f7819d[i10];
    }

    /* renamed from: m */
    public b0.g t(int i10) {
        if (i10 >= this.f7820q) {
            return new a0(Arrays.copyOf(this.f7819d, i10), this.f7820q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Integer remove(int i10) {
        int i11;
        a();
        f(i10);
        int[] iArr = this.f7819d;
        int i12 = iArr[i10];
        if (i10 < this.f7820q - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f7820q--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    /* renamed from: o */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(q(i10, num.intValue()));
    }

    public int q(int i10, int i11) {
        a();
        f(i10);
        int[] iArr = this.f7819d;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f7820q; i10++) {
            if (obj.equals(Integer.valueOf(this.f7819d[i10]))) {
                int[] iArr = this.f7819d;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f7820q - i10) - 1);
                this.f7820q--;
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
            int[] iArr = this.f7819d;
            System.arraycopy(iArr, i11, iArr, i10, this.f7820q - i11);
            this.f7820q -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7820q;
    }
}
