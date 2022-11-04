package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class n extends c<Double> implements b0.b, RandomAccess, b1 {

    /* renamed from: x */
    private static final n f7956x;

    /* renamed from: d */
    private double[] f7957d;

    /* renamed from: q */
    private int f7958q;

    static {
        n nVar = new n(new double[0], 0);
        f7956x = nVar;
        nVar.p();
    }

    public n() {
        this(new double[10], 0);
    }

    private n(double[] dArr, int i10) {
        this.f7957d = dArr;
        this.f7958q = i10;
    }

    private void e(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7958q)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        double[] dArr = this.f7957d;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f7957d, i10, dArr2, i10 + 1, this.f7958q - i10);
            this.f7957d = dArr2;
        }
        this.f7957d[i10] = d10;
        this.f7958q++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f7958q) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7958q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        b0.a(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i10 = nVar.f7958q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7958q;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f7957d;
        if (i12 > dArr.length) {
            this.f7957d = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(nVar.f7957d, 0, this.f7957d, this.f7958q, nVar.f7958q);
        this.f7958q = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public void add(int i10, Double d10) {
        e(i10, d10.doubleValue());
    }

    /* renamed from: c */
    public boolean add(Double d10) {
        d(d10.doubleValue());
        return true;
    }

    public void d(double d10) {
        a();
        int i10 = this.f7958q;
        double[] dArr = this.f7957d;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f7957d = dArr2;
        }
        double[] dArr3 = this.f7957d;
        int i11 = this.f7958q;
        this.f7958q = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f7958q != nVar.f7958q) {
            return false;
        }
        double[] dArr = nVar.f7957d;
        for (int i10 = 0; i10 < this.f7958q; i10++) {
            if (Double.doubleToLongBits(this.f7957d[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7958q; i11++) {
            i10 = (i10 * 31) + b0.f(Double.doubleToLongBits(this.f7957d[i11]));
        }
        return i10;
    }

    /* renamed from: i */
    public Double get(int i10) {
        return Double.valueOf(k(i10));
    }

    public double k(int i10) {
        f(i10);
        return this.f7957d[i10];
    }

    /* renamed from: m */
    public b0.b t(int i10) {
        if (i10 >= this.f7958q) {
            return new n(Arrays.copyOf(this.f7957d, i10), this.f7958q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Double remove(int i10) {
        int i11;
        a();
        f(i10);
        double[] dArr = this.f7957d;
        double d10 = dArr[i10];
        if (i10 < this.f7958q - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f7958q--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: o */
    public Double set(int i10, Double d10) {
        return Double.valueOf(q(i10, d10.doubleValue()));
    }

    public double q(int i10, double d10) {
        a();
        f(i10);
        double[] dArr = this.f7957d;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f7958q; i10++) {
            if (obj.equals(Double.valueOf(this.f7957d[i10]))) {
                double[] dArr = this.f7957d;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f7958q - i10) - 1);
                this.f7958q--;
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
            double[] dArr = this.f7957d;
            System.arraycopy(dArr, i11, dArr, i10, this.f7958q - i11);
            this.f7958q -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7958q;
    }
}
