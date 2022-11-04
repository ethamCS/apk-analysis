package i0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {
    private static Object[] V3;
    private static int W3;
    private static Object[] X3;
    private static int Y3;

    /* renamed from: c */
    private int[] f12257c;

    /* renamed from: d */
    Object[] f12258d;

    /* renamed from: q */
    int f12259q;

    /* renamed from: x */
    private f<E, E> f12260x;

    /* renamed from: y */
    private static final int[] f12256y = new int[0];
    private static final Object[] U3 = new Object[0];

    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
            b.this = r1;
        }

        @Override // i0.f
        protected void a() {
            b.this.clear();
        }

        @Override // i0.f
        protected Object b(int i10, int i11) {
            return b.this.f12258d[i10];
        }

        @Override // i0.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // i0.f
        protected int d() {
            return b.this.f12259q;
        }

        @Override // i0.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // i0.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // i0.f
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // i0.f
        protected void h(int i10) {
            b.this.i(i10);
        }

        @Override // i0.f
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f12257c = f12256y;
            this.f12258d = U3;
        } else {
            a(i10);
        }
        this.f12259q = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = X3;
                if (objArr != null) {
                    this.f12258d = objArr;
                    X3 = (Object[]) objArr[0];
                    this.f12257c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Y3--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = V3;
                if (objArr2 != null) {
                    this.f12258d = objArr2;
                    V3 = (Object[]) objArr2[0];
                    this.f12257c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    W3--;
                    return;
                }
            }
        }
        this.f12257c = new int[i10];
        this.f12258d = new Object[i10];
    }

    private static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (Y3 < 10) {
                    objArr[0] = X3;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    X3 = objArr;
                    Y3++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (W3 < 10) {
                    objArr[0] = V3;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    V3 = objArr;
                    W3++;
                }
            }
        }
    }

    private f<E, E> d() {
        if (this.f12260x == null) {
            this.f12260x = new a();
        }
        return this.f12260x;
    }

    private int e(Object obj, int i10) {
        int i11 = this.f12259q;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f12257c, i11, i10);
        if (a10 < 0 || obj.equals(this.f12258d[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f12257c[i12] == i10) {
            if (obj.equals(this.f12258d[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.f12257c[i13] == i10; i13--) {
            if (obj.equals(this.f12258d[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private int f() {
        int i10 = this.f12259q;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f12257c, i10, 0);
        if (a10 < 0 || this.f12258d[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f12257c[i11] == 0) {
            if (this.f12258d[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f12257c[i12] == 0; i12--) {
            if (this.f12258d[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = e(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f12259q;
        int[] iArr = this.f12257c;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f12258d;
            a(i14);
            int[] iArr2 = this.f12257c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f12258d, 0, objArr.length);
            }
            c(iArr, objArr, this.f12259q);
        }
        int i15 = this.f12259q;
        if (i12 < i15) {
            int[] iArr3 = this.f12257c;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f12258d;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f12259q - i12);
        }
        this.f12257c[i12] = i10;
        this.f12258d[i12] = e10;
        this.f12259q++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f12259q + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public void b(int i10) {
        int[] iArr = this.f12257c;
        if (iArr.length < i10) {
            Object[] objArr = this.f12258d;
            a(i10);
            int i11 = this.f12259q;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f12257c, 0, i11);
                System.arraycopy(objArr, 0, this.f12258d, 0, this.f12259q);
            }
            c(iArr, objArr, this.f12259q);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f12259q;
        if (i10 != 0) {
            c(this.f12257c, this.f12258d, i10);
            this.f12257c = f12256y;
            this.f12258d = U3;
            this.f12259q = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f12259q; i10++) {
                try {
                    if (!set.contains(k(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f12257c;
        int i10 = this.f12259q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public E i(int i10) {
        Object[] objArr = this.f12258d;
        E e10 = (E) objArr[i10];
        int i11 = this.f12259q;
        if (i11 <= 1) {
            c(this.f12257c, objArr, i11);
            this.f12257c = f12256y;
            this.f12258d = U3;
            this.f12259q = 0;
        } else {
            int[] iArr = this.f12257c;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f12259q = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr2 = this.f12258d;
                    System.arraycopy(objArr2, i14, objArr2, i10, this.f12259q - i10);
                }
                this.f12258d[this.f12259q] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                a(i12);
                this.f12259q--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f12257c, 0, i10);
                    System.arraycopy(objArr, 0, this.f12258d, 0, i10);
                }
                int i15 = this.f12259q;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f12257c, i10, i15 - i10);
                    System.arraycopy(objArr, i16, this.f12258d, i10, this.f12259q - i10);
                }
            }
        }
        return e10;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f12259q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    public E k(int i10) {
        return (E) this.f12258d[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f12259q - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f12258d[i10])) {
                i(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f12259q;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f12259q;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f12258d, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f12259q) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f12259q));
        }
        System.arraycopy(this.f12258d, 0, tArr, 0, this.f12259q);
        int length = tArr.length;
        int i10 = this.f12259q;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12259q * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f12259q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
