package a.d;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {
    static Object[] e;
    static int f;
    static Object[] g;
    static int h;

    /* renamed from: b */
    int[] f95b;

    /* renamed from: c */
    Object[] f96c;
    int d;

    public g() {
        this.f95b = c.f77a;
        this.f96c = c.f79c;
        this.d = 0;
    }

    public g(int i) {
        if (i == 0) {
            this.f95b = c.f77a;
            this.f96c = c.f79c;
        } else {
            e(i);
        }
        this.d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            a((g) gVar);
        }
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (g.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f96c = objArr;
                    g = (Object[]) objArr[0];
                    this.f95b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (g.class) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.f96c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.f95b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.f95b = new int[i];
        this.f96c = new Object[i << 1];
    }

    int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a2 = a(this.f95b, i, 0);
        if (a2 < 0 || this.f96c[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.f95b[i2] == 0) {
            if (this.f96c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a2 - 1; i3 >= 0 && this.f95b[i3] == 0; i3--) {
            if (this.f96c[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.f95b, i2, i);
        if (a2 < 0 || obj.equals(this.f96c[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f95b[i3] == i) {
            if (obj.equals(this.f96c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f95b[i4] == i; i4--) {
            if (obj.equals(this.f96c[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f96c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public void a(int i) {
        int i2 = this.d;
        int[] iArr = this.f95b;
        if (iArr.length < i) {
            Object[] objArr = this.f96c;
            e(i);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.f95b, 0, i2);
                System.arraycopy(objArr, 0, this.f96c, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void a(g<? extends K, ? extends V> gVar) {
        int i = gVar.d;
        a(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.b(i2), gVar.d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f95b, 0, this.f95b, 0, i);
            System.arraycopy(gVar.f96c, 0, this.f96c, 0, i << 1);
            this.d = i;
        }
    }

    public int b(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.f96c;
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

    public K b(int i) {
        return (K) this.f96c[i << 1];
    }

    public V c(int i) {
        Object[] objArr = this.f96c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.d;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.f95b, objArr, i3);
            this.f95b = c.f77a;
            this.f96c = c.f79c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f95b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f95b;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr2 = this.f96c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f96c;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f95b;
                Object[] objArr4 = this.f96c;
                e(i6);
                if (i3 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f95b, 0, i);
                    System.arraycopy(objArr4, 0, this.f96c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f95b, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f96c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.d) {
            this.d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f95b;
            Object[] objArr = this.f96c;
            this.f95b = c.f77a;
            this.f96c = c.f79c;
            this.d = 0;
            a(iArr, objArr, i);
        }
        if (this.d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        return (V) this.f96c[(i << 1) + 1];
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
            for (int i = 0; i < this.d; i++) {
                try {
                    K b2 = b(i);
                    V d = d(i);
                    Object obj2 = gVar.get(b2);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
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
            for (int i2 = 0; i2 < this.d; i2++) {
                try {
                    K b3 = b(i2);
                    V d2 = d(i2);
                    Object obj3 = map.get(b3);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? (V) this.f96c[(a2 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f95b;
        Object[] objArr = this.f96c;
        int i = this.d;
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

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.d;
        if (k == null) {
            i2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = a(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f96c;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ (-1);
        if (i3 >= this.f95b.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f95b;
            Object[] objArr2 = this.f96c;
            e(i6);
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f95b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f96c, 0, objArr2.length);
            }
            a(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f95b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f96c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.d - i5) << 1);
        }
        int i8 = this.d;
        if (i3 == i8) {
            int[] iArr4 = this.f95b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f96c;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.d = i8 + 1;
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
        int a2 = a(obj);
        if (a2 >= 0) {
            return c(a2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 >= 0) {
            V d = d(a2);
            if (obj2 != d && (obj2 == null || !obj2.equals(d))) {
                return false;
            }
            c(a2);
            return true;
        }
        return false;
    }

    public V replace(K k, V v) {
        int a2 = a(k);
        if (a2 >= 0) {
            return a(a2, (int) v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a2 = a(k);
        if (a2 >= 0) {
            V d = d(a2);
            if (d != v && (v == null || !v.equals(d))) {
                return false;
            }
            a(a2, (int) v2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d = d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
