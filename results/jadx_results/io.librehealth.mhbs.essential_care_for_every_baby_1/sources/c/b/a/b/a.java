package c.b.a.b;

import c.b.a.a.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.b.a.b.a$a */
    /* loaded from: classes.dex */
    public static class C0021a extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: a */
        final double[] f390a;

        /* renamed from: b */
        final int f391b;

        /* renamed from: c */
        final int f392c;

        C0021a(double[] dArr, int i, int i2) {
            this.f390a = dArr;
            this.f391b = i;
            this.f392c = i2;
        }

        /* renamed from: a */
        public Double get(int i) {
            i.f(i, size());
            return Double.valueOf(this.f390a[this.f391b + i]);
        }

        /* renamed from: b */
        public Double set(int i, Double d2) {
            i.f(i, size());
            double[] dArr = this.f390a;
            int i2 = this.f391b;
            double d3 = dArr[i2 + i];
            i.h(d2);
            dArr[i2 + i] = d2.doubleValue();
            return Double.valueOf(d3);
        }

        double[] c() {
            return Arrays.copyOfRange(this.f390a, this.f391b, this.f392c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && a.e(this.f390a, ((Double) obj).doubleValue(), this.f391b, this.f392c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0021a)) {
                return super.equals(obj);
            }
            C0021a c0021a = (C0021a) obj;
            int size = size();
            if (c0021a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f390a[this.f391b + i] != c0021a.f390a[c0021a.f391b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f391b; i2 < this.f392c; i2++) {
                i = (i * 31) + a.d(this.f390a[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int e2;
            if (!(obj instanceof Double) || (e2 = a.e(this.f390a, ((Double) obj).doubleValue(), this.f391b, this.f392c)) < 0) {
                return -1;
            }
            return e2 - this.f391b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int f;
            if (!(obj instanceof Double) || (f = a.f(this.f390a, ((Double) obj).doubleValue(), this.f391b, this.f392c)) < 0) {
                return -1;
            }
            return f - this.f391b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f392c - this.f391b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            i.j(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.f390a;
            int i3 = this.f391b;
            return new C0021a(dArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f390a[this.f391b]);
            int i = this.f391b;
            while (true) {
                i++;
                if (i >= this.f392c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f390a[i]);
            }
        }
    }

    static {
        c();
    }

    private static Pattern c() {
        String concat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append(concat);
        sb3.append("|");
        sb3.append(sb2);
        sb3.append(")");
        return Pattern.compile(sb3.toString().replace("#", "+"));
    }

    public static int d(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    public static int e(double[] dArr, double d2, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int f(double[] dArr, double d2, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d2) {
                return i3;
            }
        }
        return -1;
    }

    public static double[] g(Collection<? extends Number> collection) {
        if (collection instanceof C0021a) {
            return ((C0021a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            i.h(obj);
            dArr[i] = ((Number) obj).doubleValue();
        }
        return dArr;
    }
}
