package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class c implements Collection, Serializable {

    /* renamed from: a */
    final ConcurrentHashMap f13304a;

    public c(ConcurrentHashMap concurrentHashMap) {
        this.f13304a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f13304a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L1a
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L18
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
        L18:
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.c.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13304a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13304a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long mappingCount = this.f13304a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i10 = (int) mappingCount;
            Object[] objArr = new Object[i10];
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == i10) {
                    int i12 = 2147483639;
                    if (i10 >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    if (i10 < 1073741819) {
                        i12 = (i10 >>> 1) + 1 + i10;
                    }
                    objArr = Arrays.copyOf(objArr, i12);
                    i10 = i12;
                }
                objArr[i11] = next;
                i11++;
            }
            return i11 == i10 ? objArr : Arrays.copyOf(objArr, i11);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long mappingCount = this.f13304a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i10 = (int) mappingCount;
            Object[] objArr2 = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            int length = objArr2.length;
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == length) {
                    int i12 = 2147483639;
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    if (length < 1073741819) {
                        i12 = (length >>> 1) + 1 + length;
                    }
                    objArr2 = Arrays.copyOf(objArr2, i12);
                    length = i12;
                }
                objArr2[i11] = next;
                i11++;
            }
            if (objArr != objArr2 || i11 >= length) {
                return i11 == length ? objArr2 : Arrays.copyOf(objArr2, i11);
            }
            objArr2[i11] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
