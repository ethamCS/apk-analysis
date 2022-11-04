package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class x extends c<Float> implements b0.f, RandomAccess, b1 {

    /* renamed from: x */
    private static final x f8104x;

    /* renamed from: d */
    private float[] f8105d;

    /* renamed from: q */
    private int f8106q;

    static {
        x xVar = new x(new float[0], 0);
        f8104x = xVar;
        xVar.p();
    }

    public x() {
        this(new float[10], 0);
    }

    private x(float[] fArr, int i10) {
        this.f8105d = fArr;
        this.f8106q = i10;
    }

    private void e(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8106q)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        float[] fArr = this.f8105d;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f8105d, i10, fArr2, i10 + 1, this.f8106q - i10);
            this.f8105d = fArr2;
        }
        this.f8105d[i10] = f10;
        this.f8106q++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8106q) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8106q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        b0.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f8106q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8106q;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f8105d;
        if (i12 > fArr.length) {
            this.f8105d = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(xVar.f8105d, 0, this.f8105d, this.f8106q, xVar.f8106q);
        this.f8106q = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public void add(int i10, Float f10) {
        e(i10, f10.floatValue());
    }

    /* renamed from: c */
    public boolean add(Float f10) {
        d(f10.floatValue());
        return true;
    }

    public void d(float f10) {
        a();
        int i10 = this.f8106q;
        float[] fArr = this.f8105d;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f8105d = fArr2;
        }
        float[] fArr3 = this.f8105d;
        int i11 = this.f8106q;
        this.f8106q = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f8106q != xVar.f8106q) {
            return false;
        }
        float[] fArr = xVar.f8105d;
        for (int i10 = 0; i10 < this.f8106q; i10++) {
            if (Float.floatToIntBits(this.f8105d[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8106q; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f8105d[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public Float get(int i10) {
        return Float.valueOf(k(i10));
    }

    public float k(int i10) {
        f(i10);
        return this.f8105d[i10];
    }

    /* renamed from: m */
    public b0.f t(int i10) {
        if (i10 >= this.f8106q) {
            return new x(Arrays.copyOf(this.f8105d, i10), this.f8106q);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Float remove(int i10) {
        int i11;
        a();
        f(i10);
        float[] fArr = this.f8105d;
        float f10 = fArr[i10];
        if (i10 < this.f8106q - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8106q--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: o */
    public Float set(int i10, Float f10) {
        return Float.valueOf(q(i10, f10.floatValue()));
    }

    public float q(int i10, float f10) {
        a();
        f(i10);
        float[] fArr = this.f8105d;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f8106q; i10++) {
            if (obj.equals(Float.valueOf(this.f8105d[i10]))) {
                float[] fArr = this.f8105d;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f8106q - i10) - 1);
                this.f8106q--;
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
            float[] fArr = this.f8105d;
            System.arraycopy(fArr, i11, fArr, i10, this.f8106q - i11);
            this.f8106q -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8106q;
    }
}
