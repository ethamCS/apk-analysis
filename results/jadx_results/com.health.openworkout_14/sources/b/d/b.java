package b.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f2121f = new int[0];

    /* renamed from: g */
    private static final Object[] f2122g = new Object[0];

    /* renamed from: h */
    private static Object[] f2123h;
    private static int i;
    private static Object[] j;
    private static int k;

    /* renamed from: b */
    private int[] f2124b;

    /* renamed from: c */
    Object[] f2125c;

    /* renamed from: d */
    int f2126d;

    /* renamed from: e */
    private f<E, E> f2127e;

    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
            b.this = r1;
        }

        @Override // b.d.f
        protected void a() {
            b.this.clear();
        }

        @Override // b.d.f
        protected Object b(int i, int i2) {
            return b.this.f2125c[i];
        }

        @Override // b.d.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // b.d.f
        protected int d() {
            return b.this.f2126d;
        }

        @Override // b.d.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // b.d.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // b.d.f
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // b.d.f
        protected void h(int i) {
            b.this.g(i);
        }

        @Override // b.d.f
        protected E i(int i, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f2124b = f2121f;
            this.f2125c = f2122g;
        } else {
            a(i2);
        }
        this.f2126d = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = j;
                if (objArr != null) {
                    this.f2125c = objArr;
                    j = (Object[]) objArr[0];
                    this.f2124b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2123h;
                if (objArr2 != null) {
                    this.f2125c = objArr2;
                    f2123h = (Object[]) objArr2[0];
                    this.f2124b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f2124b = new int[i2];
        this.f2125c = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (i < 10) {
                    objArr[0] = f2123h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2123h = objArr;
                    i++;
                }
            }
        }
    }

    private f<E, E> d() {
        if (this.f2127e == null) {
            this.f2127e = new a();
        }
        return this.f2127e;
    }

    private int e(Object obj, int i2) {
        int i3 = this.f2126d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f2124b, i3, i2);
        if (a2 < 0 || obj.equals(this.f2125c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f2124b[i4] == i2) {
            if (obj.equals(this.f2125c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f2124b[i5] == i2; i5--) {
            if (obj.equals(this.f2125c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int f() {
        int i2 = this.f2126d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f2124b, i2, 0);
        if (a2 < 0 || this.f2125c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f2124b[i3] == 0) {
            if (this.f2125c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f2124b[i4] == 0; i4--) {
            if (this.f2125c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = e(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f2126d;
        int[] iArr = this.f2124b;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f2125c;
            a(i6);
            int[] iArr2 = this.f2124b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2125c, 0, objArr.length);
            }
            c(iArr, objArr, this.f2126d);
        }
        int i7 = this.f2126d;
        if (i4 < i7) {
            int[] iArr3 = this.f2124b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f2125c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f2126d - i4);
        }
        this.f2124b[i4] = i2;
        this.f2125c[i4] = e2;
        this.f2126d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f2126d + collection.size());
        boolean z = false;
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    public void b(int i2) {
        int[] iArr = this.f2124b;
        if (iArr.length < i2) {
            Object[] objArr = this.f2125c;
            a(i2);
            int i3 = this.f2126d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f2124b, 0, i3);
                System.arraycopy(objArr, 0, this.f2125c, 0, this.f2126d);
            }
            c(iArr, objArr, this.f2126d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f2126d;
        if (i2 != 0) {
            c(this.f2124b, this.f2125c, i2);
            this.f2124b = f2121f;
            this.f2125c = f2122g;
            this.f2126d = 0;
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
            for (int i2 = 0; i2 < this.f2126d; i2++) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i2) {
        Object[] objArr = this.f2125c;
        E e2 = (E) objArr[i2];
        int i3 = this.f2126d;
        if (i3 <= 1) {
            c(this.f2124b, objArr, i3);
            this.f2124b = f2121f;
            this.f2125c = f2122g;
            this.f2126d = 0;
        } else {
            int[] iArr = this.f2124b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f2126d = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f2125c;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f2126d - i2);
                }
                this.f2125c[this.f2126d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f2126d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2124b, 0, i2);
                    System.arraycopy(objArr, 0, this.f2125c, 0, i2);
                }
                int i7 = this.f2126d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f2124b, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f2125c, i2, this.f2126d - i2);
                }
            }
        }
        return e2;
    }

    public E h(int i2) {
        return (E) this.f2125c[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2124b;
        int i2 = this.f2126d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2126d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f2126d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2125c[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2126d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f2126d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2125c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2126d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2126d));
        }
        System.arraycopy(this.f2125c, 0, tArr, 0, this.f2126d);
        int length = tArr.length;
        int i2 = this.f2126d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2126d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2126d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
