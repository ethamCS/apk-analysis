package vb;

import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.h;
import ub.l;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001UBO\b\u0002\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000:\u0012\u0006\u0010K\u001a\u00020\b\u0012\u0006\u0010L\u001a\u00020\b\u0012\u0006\u0010M\u001a\u00020\u0011\u0012\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bP\u0010QB\t\b\u0016¢\u0006\u0004\bP\u0010RB\u0011\b\u0016\u0012\u0006\u0010S\u001a\u00020\b¢\u0006\u0004\bP\u0010TJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0014\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\r\u001a\u00020\bH\u0002J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002J.\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\b\u0010\"\u001a\u00020\u0011H\u0016J\u0018\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b$\u0010\u001bJ \u0010%\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010#\u001a\u00020\bH\u0016J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\n2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\u0017J\u0016\u00100\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u001e\u00100\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0017\u00102\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010/J\u0016\u00104\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u00105\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016J)\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010:\"\u0004\b\u0001\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0:H\u0016¢\u0006\u0004\b<\u0010?J\u0013\u0010@\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010>H\u0096\u0002J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010C\u001a\u00020BH\u0016R\u0014\u0010F\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006V"}, d2 = {"Lvb/b;", "E", BuildConfig.FLAVOR, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lub/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "minCapacity", "Ltb/e0;", "G", "u", "n", "M", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "z", "i", "N", "element", "r", "(ILjava/lang/Object;)V", BuildConfig.FLAVOR, "elements", "W", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "b0", "retain", "c0", "s", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "e", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", BuildConfig.FLAVOR, "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "V", "()Z", "isEffectivelyReadOnly", "b", "()I", "size", "array", "offset", "length", "isReadOnly", "backing", "root", "<init>", "([Ljava/lang/Object;IIZLvb/b;Lvb/b;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b<E> extends ub.e<E> implements RandomAccess, Serializable {
    private final b<E> U3;

    /* renamed from: c */
    private E[] f23957c;

    /* renamed from: d */
    private int f23958d;

    /* renamed from: q */
    private int f23959q;

    /* renamed from: x */
    private boolean f23960x;

    /* renamed from: y */
    private final b<E> f23961y;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016¨\u0006\u0017"}, d2 = {"Lvb/b$a;", "E", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasPrevious", "hasNext", BuildConfig.FLAVOR, "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "Ltb/e0;", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lvb/b;", "list", "index", "<init>", "(Lvb/b;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a<E> implements ListIterator<E>, ic.a, Iterator {

        /* renamed from: c */
        private final b<E> f23962c;

        /* renamed from: d */
        private int f23963d;

        /* renamed from: q */
        private int f23964q = -1;

        public a(b<E> bVar, int i10) {
            t.e(bVar, "list");
            this.f23962c = bVar;
            this.f23963d = i10;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b<E> bVar = this.f23962c;
            int i10 = this.f23963d;
            this.f23963d = i10 + 1;
            bVar.add(i10, e10);
            this.f23964q = -1;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f23963d < ((b) this.f23962c).f23959q;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23963d > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public E next() {
            if (this.f23963d < ((b) this.f23962c).f23959q) {
                int i10 = this.f23963d;
                this.f23963d = i10 + 1;
                this.f23964q = i10;
                return (E) ((b) this.f23962c).f23957c[((b) this.f23962c).f23958d + this.f23964q];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23963d;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f23963d;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f23963d = i11;
                this.f23964q = i11;
                return (E) ((b) this.f23962c).f23957c[((b) this.f23962c).f23958d + this.f23964q];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23963d - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            int i10 = this.f23964q;
            if (i10 != -1) {
                this.f23962c.remove(i10);
                this.f23963d = this.f23964q;
                this.f23964q = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f23964q;
            if (i10 != -1) {
                this.f23962c.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public b() {
        this(10);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, null, null);
    }

    private b(E[] eArr, int i10, int i11, boolean z10, b<E> bVar, b<E> bVar2) {
        this.f23957c = eArr;
        this.f23958d = i10;
        this.f23959q = i11;
        this.f23960x = z10;
        this.f23961y = bVar;
        this.U3 = bVar2;
    }

    private final void G(int i10) {
        if (this.f23961y == null) {
            if (i10 < 0) {
                throw new OutOfMemoryError();
            }
            E[] eArr = this.f23957c;
            if (i10 <= eArr.length) {
                return;
            }
            this.f23957c = (E[]) c.e(this.f23957c, h.Companion.a(eArr.length, i10));
            return;
        }
        throw new IllegalStateException();
    }

    private final void M(int i10) {
        G(this.f23959q + i10);
    }

    private final void N(int i10, int i11) {
        M(i11);
        E[] eArr = this.f23957c;
        l.f(eArr, eArr, i10 + i11, i10, this.f23958d + this.f23959q);
        this.f23959q += i11;
    }

    private final boolean V() {
        b<E> bVar;
        return this.f23960x || ((bVar = this.U3) != null && bVar.f23960x);
    }

    private final E W(int i10) {
        b<E> bVar = this.f23961y;
        if (bVar != null) {
            this.f23959q--;
            return bVar.W(i10);
        }
        E[] eArr = this.f23957c;
        E e10 = eArr[i10];
        l.f(eArr, eArr, i10, i10 + 1, this.f23958d + this.f23959q);
        c.f(this.f23957c, (this.f23958d + this.f23959q) - 1);
        this.f23959q--;
        return e10;
    }

    private final void b0(int i10, int i11) {
        b<E> bVar = this.f23961y;
        if (bVar != null) {
            bVar.b0(i10, i11);
        } else {
            E[] eArr = this.f23957c;
            l.f(eArr, eArr, i10, i10 + i11, this.f23959q);
            E[] eArr2 = this.f23957c;
            int i12 = this.f23959q;
            c.g(eArr2, i12 - i11, i12);
        }
        this.f23959q -= i11;
    }

    private final int c0(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        b<E> bVar = this.f23961y;
        if (bVar != null) {
            int c02 = bVar.c0(i10, i11, collection, z10);
            this.f23959q -= c02;
            return c02;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f23957c[i14]) == z10) {
                E[] eArr = this.f23957c;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f23957c;
        l.f(eArr2, eArr2, i10 + i13, i11 + i10, this.f23959q);
        E[] eArr3 = this.f23957c;
        int i16 = this.f23959q;
        c.g(eArr3, i16 - i15, i16);
        this.f23959q -= i15;
        return i15;
    }

    private final void n(int i10, Collection<? extends E> collection, int i11) {
        b<E> bVar = this.f23961y;
        if (bVar != null) {
            bVar.n(i10, collection, i11);
            this.f23957c = this.f23961y.f23957c;
            this.f23959q += i11;
            return;
        }
        N(i10, i11);
        java.util.Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f23957c[i10 + i12] = it.next();
        }
    }

    private final void r(int i10, E e10) {
        b<E> bVar = this.f23961y;
        if (bVar == null) {
            N(i10, 1);
            this.f23957c[i10] = e10;
            return;
        }
        bVar.r(i10, e10);
        this.f23957c = this.f23961y.f23957c;
        this.f23959q++;
    }

    private final void u() {
        if (!V()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean z(List<?> list) {
        boolean h10;
        h10 = c.h(this.f23957c, this.f23958d, this.f23959q, list);
        return h10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        u();
        ub.c.Companion.c(i10, this.f23959q);
        r(this.f23958d + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        u();
        r(this.f23958d + this.f23959q, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        t.e(collection, "elements");
        u();
        ub.c.Companion.c(i10, this.f23959q);
        int size = collection.size();
        n(this.f23958d + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        t.e(collection, "elements");
        u();
        int size = collection.size();
        n(this.f23958d + this.f23959q, collection, size);
        return size > 0;
    }

    @Override // ub.e
    public int b() {
        return this.f23959q;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        u();
        b0(this.f23958d, this.f23959q);
    }

    @Override // ub.e
    public E e(int i10) {
        u();
        ub.c.Companion.b(i10, this.f23959q);
        return W(this.f23958d + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && z((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        ub.c.Companion.b(i10, this.f23959q);
        return this.f23957c[this.f23958d + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        i10 = c.i(this.f23957c, this.f23958d, this.f23959q);
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f23959q; i10++) {
            if (t.a(this.f23957c[this.f23958d + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f23959q == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f23959q - 1; i10 >= 0; i10--) {
            if (t.a(this.f23957c[this.f23958d + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        ub.c.Companion.c(i10, this.f23959q);
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        u();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        u();
        return c0(this.f23958d, this.f23959q, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        u();
        return c0(this.f23958d, this.f23959q, collection, true) > 0;
    }

    public final List<E> s() {
        if (this.f23961y == null) {
            u();
            this.f23960x = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        u();
        ub.c.Companion.b(i10, this.f23959q);
        E[] eArr = this.f23957c;
        int i11 = this.f23958d;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        ub.c.Companion.d(i10, i11, this.f23959q);
        E[] eArr = this.f23957c;
        int i12 = this.f23958d + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f23960x;
        b<E> bVar = this.U3;
        return new b(eArr, i12, i13, z10, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] j10;
        E[] eArr = this.f23957c;
        int i10 = this.f23958d;
        j10 = l.j(eArr, i10, this.f23959q + i10);
        t.c(j10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f23959q;
        if (length < i10) {
            E[] eArr = this.f23957c;
            int i11 = this.f23958d;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            t.d(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f23957c;
        t.c(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i12 = this.f23958d;
        l.f(eArr2, tArr, 0, i12, this.f23959q + i12);
        int length2 = tArr.length;
        int i13 = this.f23959q;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j10;
        j10 = c.j(this.f23957c, this.f23958d, this.f23959q);
        return j10;
    }
}
