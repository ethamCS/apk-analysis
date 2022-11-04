package c.b.a.b;

import c.b.a.a.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends AbstractList<Float> implements RandomAccess, Serializable {

        /* renamed from: a */
        final float[] f393a;

        /* renamed from: b */
        final int f394b;

        /* renamed from: c */
        final int f395c;

        a(float[] fArr, int i, int i2) {
            this.f393a = fArr;
            this.f394b = i;
            this.f395c = i2;
        }

        /* renamed from: a */
        public Float get(int i) {
            i.f(i, size());
            return Float.valueOf(this.f393a[this.f394b + i]);
        }

        /* renamed from: b */
        public Float set(int i, Float f) {
            i.f(i, size());
            float[] fArr = this.f393a;
            int i2 = this.f394b;
            float f2 = fArr[i2 + i];
            i.h(f);
            fArr[i2 + i] = f.floatValue();
            return Float.valueOf(f2);
        }

        float[] c() {
            return Arrays.copyOfRange(this.f393a, this.f394b, this.f395c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && c.d(this.f393a, ((Float) obj).floatValue(), this.f394b, this.f395c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f393a[this.f394b + i] != aVar.f393a[aVar.f394b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f394b; i2 < this.f395c; i2++) {
                i = (i * 31) + c.c(this.f393a[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int d2;
            if (!(obj instanceof Float) || (d2 = c.d(this.f393a, ((Float) obj).floatValue(), this.f394b, this.f395c)) < 0) {
                return -1;
            }
            return d2 - this.f394b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int e2;
            if (!(obj instanceof Float) || (e2 = c.e(this.f393a, ((Float) obj).floatValue(), this.f394b, this.f395c)) < 0) {
                return -1;
            }
            return e2 - this.f394b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f395c - this.f394b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i, int i2) {
            i.j(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.f393a;
            int i3 = this.f394b;
            return new a(fArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f393a[this.f394b]);
            int i = this.f394b;
            while (true) {
                i++;
                if (i >= this.f395c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f393a[i]);
            }
        }
    }

    public static int c(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static int d(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static float[] f(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            i.h(obj);
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
