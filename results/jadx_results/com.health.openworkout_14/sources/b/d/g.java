package b.d;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: e */
    static Object[] f2160e;

    /* renamed from: f */
    static int f2161f;

    /* renamed from: g */
    static Object[] f2162g;

    /* renamed from: h */
    static int f2163h;

    /* renamed from: b */
    int[] f2164b;

    /* renamed from: c */
    Object[] f2165c;

    /* renamed from: d */
    int f2166d;

    public g() {
        this.f2164b = c.f2129a;
        this.f2165c = c.f2131c;
        this.f2166d = 0;
    }

    public g(int i) {
        if (i == 0) {
            this.f2164b = c.f2129a;
            this.f2165c = c.f2131c;
        } else {
            a(i);
        }
        this.f2166d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            j(gVar);
        }
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (g.class) {
                Object[] objArr = f2162g;
                if (objArr != null) {
                    this.f2165c = objArr;
                    f2162g = (Object[]) objArr[0];
                    this.f2164b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2163h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f2160e;
                if (objArr2 != null) {
                    this.f2165c = objArr2;
                    f2160e = (Object[]) objArr2[0];
                    this.f2164b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2161f--;
                    return;
                }
            }
        }
        this.f2164b = new int[i];
        this.f2165c = new Object[i << 1];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f2163h < 10) {
                    objArr[0] = f2162g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2162g = objArr;
                    f2163h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f2161f < 10) {
                    objArr[0] = f2160e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2160e = objArr;
                    f2161f++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.f2166d;
        int[] iArr = this.f2164b;
        if (iArr.length < i) {
            Object[] objArr = this.f2165c;
            a(i);
            if (this.f2166d > 0) {
                System.arraycopy(iArr, 0, this.f2164b, 0, i2);
                System.arraycopy(objArr, 0, this.f2165c, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.f2166d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f2166d;
        if (i > 0) {
            int[] iArr = this.f2164b;
            Object[] objArr = this.f2165c;
            this.f2164b = c.f2129a;
            this.f2165c = c.f2131c;
            this.f2166d = 0;
            d(iArr, objArr, i);
        }
        if (this.f2166d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i) {
        int i2 = this.f2166d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f2164b, i2, i);
        if (b2 < 0 || obj.equals(this.f2165c[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f2164b[i3] == i) {
            if (obj.equals(this.f2165c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f2164b[i4] == i; i4--) {
            if (obj.equals(this.f2165c[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f2166d; i++) {
                try {
                    K i2 = i(i);
                    V m = m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2166d; i3++) {
                try {
                    K i4 = i(i3);
                    V m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i = this.f2166d;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.f2164b, i, 0);
        if (b2 < 0 || this.f2165c[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.f2164b[i2] == 0) {
            if (this.f2165c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b2 - 1; i3 >= 0 && this.f2164b[i3] == 0; i3--) {
            if (this.f2165c[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.f2165c[(f2 << 1) + 1] : v;
    }

    public int h(Object obj) {
        int i = this.f2166d * 2;
        Object[] objArr = this.f2165c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f2164b;
        Object[] objArr = this.f2165c;
        int i = this.f2166d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return (K) this.f2165c[i << 1];
    }

    public boolean isEmpty() {
        return this.f2166d <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i = gVar.f2166d;
        c(this.f2166d + i);
        if (this.f2166d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.i(i2), gVar.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f2164b, 0, this.f2164b, 0, i);
            System.arraycopy(gVar.f2165c, 0, this.f2165c, 0, i << 1);
            this.f2166d = i;
        }
    }

    public V k(int i) {
        Object[] objArr = this.f2165c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2166d;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f2164b, objArr, i3);
            this.f2164b = c.f2129a;
            this.f2165c = c.f2131c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2164b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f2165c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f2165c;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 != this.f2166d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2164b, 0, i);
                    System.arraycopy(objArr, 0, this.f2165c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f2164b, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f2165c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f2166d) {
            this.f2166d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f2165c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V m(int i) {
        return (V) this.f2165c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2166d;
        if (k == null) {
            i2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f2165c;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f2164b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f2165c;
            a(i6);
            if (i3 != this.f2166d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2164b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2165c, 0, objArr2.length);
            }
            d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2164b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2165c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2166d - i5) << 1);
        }
        int i8 = this.f2166d;
        if (i3 == i8) {
            int[] iArr4 = this.f2164b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f2165c;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f2166d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            V m = m(f2);
            if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
                return false;
            }
            k(f2);
            return true;
        }
        return false;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 >= 0) {
            V m = m(f2);
            if (m != v && (v == null || !v.equals(m))) {
                return false;
            }
            l(f2, v2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.f2166d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2166d * 28);
        sb.append('{');
        for (int i = 0; i < this.f2166d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
