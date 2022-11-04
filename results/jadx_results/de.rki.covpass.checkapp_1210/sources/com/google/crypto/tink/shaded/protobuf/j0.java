package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class j0 extends c<Long> implements b0.h, RandomAccess, b1 {

    /* renamed from: x */
    private static final j0 f7905x;

    /* renamed from: d */
    private long[] f7906d;

    /* renamed from: q */
    private int f7907q;

    static {
        j0 j0Var = new j0(new long[0], 0);
        f7905x = j0Var;
        j0Var.p();
    }

    public j0() {
        this(new long[10], 0);
    }

    private j0(long[] jArr, int i10) {
        this.f7906d = jArr;
        this.f7907q = i10;
    }

    private void d(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7907q)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        long[] jArr = this.f7906d;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f7906d, i10, jArr2, i10 + 1, this.f7907q - i10);
            this.f7906d = jArr2;
        }
        this.f7906d[i10] = j10;
        this.f7907q++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f7907q) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7907q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        b0.a(collection);
        if (!(collection instanceof j0)) {
            return super.addAll(collection);
        }
        j0 j0Var = (j0) collection;
        int i10 = j0Var.f7907q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7907q;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f7906d;
        if (i12 > jArr.length) {
            this.f7906d = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(j0Var.f7906d, 0, this.f7906d, this.f7907q, j0Var.f7907q);
        this.f7907q = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public void add(int i10, Long l10) {
        d(i10, l10.longValue());
    }

    /* renamed from: c */
    public boolean add(Long l10) {
        e(l10.longValue());
        return true;
    }

    public void e(long j10) {
        a();
        int i10 = this.f7907q;
        long[] jArr = this.f7906d;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f7906d = jArr2;
        }
        long[] jArr3 = this.f7906d;
        int i11 = this.f7907q;
        this.f7907q = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return super.equals(obj);
        }
        j0 j0Var = (j0) obj;
        if (this.f7907q != j0Var.f7907q) {
            return false;
        }
        long[] jArr = j0Var.f7906d;
        for (int i10 = 0; i10 < this.f7907q; i10++) {
            if (this.f7906d[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7907q; i11++) {
            i10 = (i10 * 31) + b0.f(this.f7906d[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public Long get(int i10) {
        return Long.valueOf(k(i10));
    }

    public long k(int i10) {
        f(i10);
        return this.f7906d[i10];
    }

    /* renamed from: m */
    public b0.h t(int i10) {
        if (i10 >= this.f7907q) {
            return new j0(Arrays.copyOf(this.f7906d, i10), this.f7907q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Long remove(int i10) {
        int i11;
        a();
        f(i10);
        long[] jArr = this.f7906d;
        long j10 = jArr[i10];
        if (i10 < this.f7907q - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f7907q--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: o */
    public Long set(int i10, Long l10) {
        return Long.valueOf(q(i10, l10.longValue()));
    }

    public long q(int i10, long j10) {
        a();
        f(i10);
        long[] jArr = this.f7906d;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f7907q; i10++) {
            if (obj.equals(Long.valueOf(this.f7906d[i10]))) {
                long[] jArr = this.f7906d;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f7907q - i10) - 1);
                this.f7907q--;
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
            long[] jArr = this.f7906d;
            System.arraycopy(jArr, i11, jArr, i10, this.f7907q - i11);
            this.f7907q -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7907q;
    }
}
