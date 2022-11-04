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
public final class e {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: a */
        final long[] f396a;

        /* renamed from: b */
        final int f397b;

        /* renamed from: c */
        final int f398c;

        a(long[] jArr, int i, int i2) {
            this.f396a = jArr;
            this.f397b = i;
            this.f398c = i2;
        }

        /* renamed from: a */
        public Long get(int i) {
            i.f(i, size());
            return Long.valueOf(this.f396a[this.f397b + i]);
        }

        /* renamed from: b */
        public Long set(int i, Long l) {
            i.f(i, size());
            long[] jArr = this.f396a;
            int i2 = this.f397b;
            long j = jArr[i2 + i];
            i.h(l);
            jArr[i2 + i] = l.longValue();
            return Long.valueOf(j);
        }

        long[] c() {
            return Arrays.copyOfRange(this.f396a, this.f397b, this.f398c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && e.d(this.f396a, ((Long) obj).longValue(), this.f397b, this.f398c) != -1;
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
                if (this.f396a[this.f397b + i] != aVar.f396a[aVar.f397b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f397b; i2 < this.f398c; i2++) {
                i = (i * 31) + e.c(this.f396a[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int d2;
            if (!(obj instanceof Long) || (d2 = e.d(this.f396a, ((Long) obj).longValue(), this.f397b, this.f398c)) < 0) {
                return -1;
            }
            return d2 - this.f397b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int e2;
            if (!(obj instanceof Long) || (e2 = e.e(this.f396a, ((Long) obj).longValue(), this.f397b, this.f398c)) < 0) {
                return -1;
            }
            return e2 - this.f397b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f398c - this.f397b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            i.j(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.f396a;
            int i3 = this.f397b;
            return new a(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f396a[this.f397b]);
            int i = this.f397b;
            while (true) {
                i++;
                if (i >= this.f398c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f396a[i]);
            }
        }
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int d(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int e(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static long[] f(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            i.h(obj);
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
