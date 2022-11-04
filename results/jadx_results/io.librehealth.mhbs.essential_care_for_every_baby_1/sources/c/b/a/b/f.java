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
public final class f extends g {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends AbstractList<Short> implements RandomAccess, Serializable {

        /* renamed from: a */
        final short[] f399a;

        /* renamed from: b */
        final int f400b;

        /* renamed from: c */
        final int f401c;

        a(short[] sArr, int i, int i2) {
            this.f399a = sArr;
            this.f400b = i;
            this.f401c = i2;
        }

        /* renamed from: a */
        public Short get(int i) {
            i.f(i, size());
            return Short.valueOf(this.f399a[this.f400b + i]);
        }

        /* renamed from: b */
        public Short set(int i, Short sh) {
            i.f(i, size());
            short[] sArr = this.f399a;
            int i2 = this.f400b;
            short s = sArr[i2 + i];
            i.h(sh);
            sArr[i2 + i] = sh.shortValue();
            return Short.valueOf(s);
        }

        short[] c() {
            return Arrays.copyOfRange(this.f399a, this.f400b, this.f401c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Short) && f.d(this.f399a, ((Short) obj).shortValue(), this.f400b, this.f401c) != -1;
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
                if (this.f399a[this.f400b + i] != aVar.f399a[aVar.f400b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f400b; i2 < this.f401c; i2++) {
                short s = this.f399a[i2];
                f.c(s);
                i = (i * 31) + s;
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int d2;
            if (!(obj instanceof Short) || (d2 = f.d(this.f399a, ((Short) obj).shortValue(), this.f400b, this.f401c)) < 0) {
                return -1;
            }
            return d2 - this.f400b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int e2;
            if (!(obj instanceof Short) || (e2 = f.e(this.f399a, ((Short) obj).shortValue(), this.f400b, this.f401c)) < 0) {
                return -1;
            }
            return e2 - this.f400b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f401c - this.f400b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i, int i2) {
            i.j(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            short[] sArr = this.f399a;
            int i3 = this.f400b;
            return new a(sArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.f399a[this.f400b]);
            int i = this.f400b;
            while (true) {
                i++;
                if (i >= this.f401c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.f399a[i]);
            }
        }
    }

    public static int c(short s) {
        return s;
    }

    public static int d(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    public static short[] f(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            i.h(obj);
            sArr[i] = ((Number) obj).shortValue();
        }
        return sArr;
    }
}
