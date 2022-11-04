package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: x */
    private static final e1<Object> f7853x;

    /* renamed from: d */
    private E[] f7854d;

    /* renamed from: q */
    private int f7855q;

    static {
        e1<Object> e1Var = new e1<>(new Object[0], 0);
        f7853x = e1Var;
        e1Var.p();
    }

    private e1(E[] eArr, int i10) {
        this.f7854d = eArr;
        this.f7855q = i10;
    }

    private static <E> E[] b(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> e1<E> c() {
        return (e1<E>) f7853x;
    }

    private void d(int i10) {
        if (i10 < 0 || i10 >= this.f7855q) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    private String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7855q;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7855q)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        E[] eArr = this.f7854d;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f7854d, 0, eArr2, 0, i10);
            System.arraycopy(this.f7854d, i10, eArr2, i10 + 1, this.f7855q - i10);
            this.f7854d = eArr2;
        }
        this.f7854d[i10] = e10;
        this.f7855q++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f7855q;
        E[] eArr = this.f7854d;
        if (i10 == eArr.length) {
            this.f7854d = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7854d;
        int i11 = this.f7855q;
        this.f7855q = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: f */
    public e1<E> t(int i10) {
        if (i10 >= this.f7855q) {
            return new e1<>(Arrays.copyOf(this.f7854d, i10), this.f7855q);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d(i10);
        return this.f7854d[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        a();
        d(i10);
        E[] eArr = this.f7854d;
        E e10 = eArr[i10];
        if (i10 < this.f7855q - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f7855q--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        d(i10);
        E[] eArr = this.f7854d;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7855q;
    }
}
