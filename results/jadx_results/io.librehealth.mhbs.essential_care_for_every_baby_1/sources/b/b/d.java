package b.b;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class d<K, V> {

    /* renamed from: d */
    static Object[] f338d;

    /* renamed from: e */
    static int f339e;
    static Object[] f;
    static int g;

    /* renamed from: a */
    int[] f340a = b.f321a;

    /* renamed from: b */
    Object[] f341b = b.f322b;

    /* renamed from: c */
    int f342c = 0;

    private void a(int i) {
        if (i == 8) {
            synchronized (d.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f341b = objArr;
                    f = (Object[]) objArr[0];
                    this.f340a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f338d;
                if (objArr2 != null) {
                    this.f341b = objArr2;
                    f338d = (Object[]) objArr2[0];
                    this.f340a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f339e--;
                    return;
                }
            }
        }
        this.f340a = new int[i];
        this.f341b = new Object[i << 1];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return b.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f339e < 10) {
                    objArr[0] = f338d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f338d = objArr;
                    f339e++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.f342c;
        int[] iArr = this.f340a;
        if (iArr.length < i) {
            Object[] objArr = this.f341b;
            a(i);
            if (this.f342c > 0) {
                System.arraycopy(iArr, 0, this.f340a, 0, i2);
                System.arraycopy(objArr, 0, this.f341b, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.f342c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f342c;
        if (i > 0) {
            int[] iArr = this.f340a;
            Object[] objArr = this.f341b;
            this.f340a = b.f321a;
            this.f341b = b.f322b;
            this.f342c = 0;
            d(iArr, objArr, i);
        }
        if (this.f342c <= 0) {
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
        int i2 = this.f342c;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f340a, i2, i);
        if (b2 < 0 || obj.equals(this.f341b[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f340a[i3] == i) {
            if (obj.equals(this.f341b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f340a[i4] == i; i4--) {
            if (obj.equals(this.f341b[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (size() != dVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f342c; i++) {
                try {
                    K i2 = i(i);
                    V l = l(i);
                    Object obj2 = dVar.get(i2);
                    if (l == null) {
                        if (obj2 != null || !dVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
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
            for (int i3 = 0; i3 < this.f342c; i3++) {
                try {
                    K i4 = i(i3);
                    V l2 = l(i3);
                    Object obj3 = map.get(i4);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
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
        int i = this.f342c;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.f340a, i, 0);
        if (b2 < 0 || this.f341b[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.f340a[i2] == 0) {
            if (this.f341b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b2 - 1; i3 >= 0 && this.f340a[i3] == 0; i3--) {
            if (this.f341b[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.f341b[(f2 << 1) + 1] : v;
    }

    public int h(Object obj) {
        int i = this.f342c * 2;
        Object[] objArr = this.f341b;
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
        int[] iArr = this.f340a;
        Object[] objArr = this.f341b;
        int i = this.f342c;
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
        return (K) this.f341b[i << 1];
    }

    public boolean isEmpty() {
        return this.f342c <= 0;
    }

    public V j(int i) {
        Object[] objArr = this.f341b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f342c;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f340a, objArr, i3);
            this.f340a = b.f321a;
            this.f341b = b.f322b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f340a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f341b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f341b;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 != this.f342c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f340a, 0, i);
                    System.arraycopy(objArr, 0, this.f341b, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f340a, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f341b, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f342c) {
            this.f342c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f341b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V l(int i) {
        return (V) this.f341b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f342c;
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
            Object[] objArr = this.f341b;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ (-1);
        int[] iArr = this.f340a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f341b;
            a(i6);
            if (i3 != this.f342c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f340a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f341b, 0, objArr2.length);
            }
            d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f340a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f341b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f342c - i5) << 1);
        }
        int i8 = this.f342c;
        if (i3 == i8) {
            int[] iArr4 = this.f340a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f341b;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f342c = i8 + 1;
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
            return j(f2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            V l = l(f2);
            if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
                return false;
            }
            j(f2);
            return true;
        }
        return false;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return k(f2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 >= 0) {
            V l = l(f2);
            if (l != v && (v == null || !v.equals(l))) {
                return false;
            }
            k(f2, v2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.f342c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f342c * 28);
        sb.append('{');
        for (int i = 0; i < this.f342c; i++) {
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
            V l = l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
