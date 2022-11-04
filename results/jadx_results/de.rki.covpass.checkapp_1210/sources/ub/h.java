package ub;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001;B\t\b\u0016¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010!J\u0016\u0010*\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010+\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J)\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010.\"\u0004\b\u0001\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020.H\u0016¢\u0006\u0004\b0\u00103R$\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lub/h;", "E", "Lub/e;", BuildConfig.FLAVOR, "minCapacity", "Ltb/e0;", "s", "newCapacity", "n", "index", "G", "z", "u", "r", "internalIndex", BuildConfig.FLAVOR, "elements", "k", BuildConfig.FLAVOR, "isEmpty", "element", "f", "(Ljava/lang/Object;)V", "i", "M", "()Ljava/lang/Object;", "N", "V", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "e", "removeAll", "retainAll", "clear", "T", BuildConfig.FLAVOR, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "()[Ljava/lang/Object;", "<set-?>", "size", "I", "b", "()I", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h<E> extends e<E> {
    public static final a Companion = new a(null);

    /* renamed from: x */
    private static final Object[] f23372x = new Object[0];

    /* renamed from: c */
    private int f23373c;

    /* renamed from: d */
    private Object[] f23374d = f23372x;

    /* renamed from: q */
    private int f23375q;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lub/h$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", BuildConfig.FLAVOR, "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    private final int G(int i10) {
        Object[] objArr = this.f23374d;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void k(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f23374d.length;
        while (i10 < length && it.hasNext()) {
            this.f23374d[i10] = it.next();
            i10++;
        }
        int i11 = this.f23373c;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f23374d[i12] = it.next();
        }
        this.f23375q = size() + collection.size();
    }

    private final void n(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f23374d;
        l.f(objArr2, objArr, 0, this.f23373c, objArr2.length);
        Object[] objArr3 = this.f23374d;
        int length = objArr3.length;
        int i11 = this.f23373c;
        l.f(objArr3, objArr, length - i11, 0, i11);
        this.f23373c = 0;
        this.f23374d = objArr;
    }

    private final int r(int i10) {
        int E;
        if (i10 == 0) {
            E = m.E(this.f23374d);
            return E;
        }
        return i10 - 1;
    }

    private final void s(int i10) {
        int b10;
        if (i10 >= 0) {
            Object[] objArr = this.f23374d;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr != f23372x) {
                n(Companion.a(objArr.length, i10));
                return;
            }
            b10 = nc.m.b(i10, 10);
            this.f23374d = new Object[b10];
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int u(int i10) {
        int E;
        E = m.E(this.f23374d);
        if (i10 == E) {
            return 0;
        }
        return i10 + 1;
    }

    private final int z(int i10) {
        return i10 < 0 ? i10 + this.f23374d.length : i10;
    }

    public final E M() {
        if (!isEmpty()) {
            Object[] objArr = this.f23374d;
            int i10 = this.f23373c;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f23373c = u(i10);
            this.f23375q = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E N() {
        int j10;
        if (!isEmpty()) {
            int i10 = this.f23373c;
            j10 = u.j(this);
            int G = G(i10 + j10);
            Object[] objArr = this.f23374d;
            E e10 = (E) objArr[G];
            objArr[G] = null;
            this.f23375q = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E V() {
        if (isEmpty()) {
            return null;
        }
        return N();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.Companion.c(i10, size());
        if (i10 == size()) {
            i(e10);
        } else if (i10 == 0) {
            f(e10);
        } else {
            s(size() + 1);
            int G = G(this.f23373c + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int r10 = r(G);
                int r11 = r(this.f23373c);
                int i11 = this.f23373c;
                if (r10 >= i11) {
                    Object[] objArr = this.f23374d;
                    objArr[r11] = objArr[i11];
                    l.f(objArr, objArr, i11, i11 + 1, r10 + 1);
                } else {
                    Object[] objArr2 = this.f23374d;
                    l.f(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f23374d;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    l.f(objArr3, objArr3, 0, 1, r10 + 1);
                }
                this.f23374d[r10] = e10;
                this.f23373c = r11;
            } else {
                int G2 = G(this.f23373c + size());
                Object[] objArr4 = this.f23374d;
                if (G < G2) {
                    l.f(objArr4, objArr4, G + 1, G, G2);
                } else {
                    l.f(objArr4, objArr4, 1, 0, G2);
                    Object[] objArr5 = this.f23374d;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    l.f(objArr5, objArr5, G + 1, G, objArr5.length - 1);
                }
                this.f23374d[G] = e10;
            }
            this.f23375q = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        i(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        hc.t.e(collection, "elements");
        c.Companion.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        s(size() + collection.size());
        int G = G(this.f23373c + size());
        int G2 = G(this.f23373c + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f23373c;
            int i12 = i11 - size;
            if (G2 < i11) {
                Object[] objArr = this.f23374d;
                l.f(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f23374d;
                if (size >= G2) {
                    l.f(objArr2, objArr2, objArr2.length - size, 0, G2);
                } else {
                    l.f(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f23374d;
                    l.f(objArr3, objArr3, 0, size, G2);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f23374d;
                l.f(objArr4, objArr4, i12, i11, G2);
            } else {
                Object[] objArr5 = this.f23374d;
                i12 += objArr5.length;
                int i13 = G2 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    l.f(objArr5, objArr5, i12, i11, G2);
                } else {
                    l.f(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f23374d;
                    l.f(objArr6, objArr6, 0, this.f23373c + length, G2);
                }
            }
            this.f23373c = i12;
            k(z(G2 - size), collection);
        } else {
            int i14 = G2 + size;
            if (G2 < G) {
                int i15 = size + G;
                Object[] objArr7 = this.f23374d;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = G - (i15 - objArr7.length);
                        l.f(objArr7, objArr7, 0, length2, G);
                        Object[] objArr8 = this.f23374d;
                        l.f(objArr8, objArr8, i14, G2, length2);
                    }
                }
                l.f(objArr7, objArr7, i14, G2, G);
            } else {
                Object[] objArr9 = this.f23374d;
                l.f(objArr9, objArr9, size, 0, G);
                Object[] objArr10 = this.f23374d;
                if (i14 >= objArr10.length) {
                    l.f(objArr10, objArr10, i14 - objArr10.length, G2, objArr10.length);
                } else {
                    l.f(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f23374d;
                    l.f(objArr11, objArr11, i14, G2, objArr11.length - size);
                }
            }
            k(G2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        hc.t.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        s(size() + collection.size());
        k(G(this.f23373c + size()), collection);
        return true;
    }

    @Override // ub.e
    public int b() {
        return this.f23375q;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int G = G(this.f23373c + size());
        int i10 = this.f23373c;
        if (i10 < G) {
            l.l(this.f23374d, null, i10, G);
        } else if (!isEmpty()) {
            Object[] objArr = this.f23374d;
            l.l(objArr, null, this.f23373c, objArr.length);
            l.l(this.f23374d, null, 0, G);
        }
        this.f23373c = 0;
        this.f23375q = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ub.e
    public E e(int i10) {
        int j10;
        int j11;
        c.Companion.b(i10, size());
        j10 = u.j(this);
        if (i10 == j10) {
            return N();
        }
        if (i10 == 0) {
            return M();
        }
        int G = G(this.f23373c + i10);
        E e10 = (E) this.f23374d[G];
        if (i10 < (size() >> 1)) {
            int i11 = this.f23373c;
            if (G >= i11) {
                Object[] objArr = this.f23374d;
                l.f(objArr, objArr, i11 + 1, i11, G);
            } else {
                Object[] objArr2 = this.f23374d;
                l.f(objArr2, objArr2, 1, 0, G);
                Object[] objArr3 = this.f23374d;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f23373c;
                l.f(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f23374d;
            int i13 = this.f23373c;
            objArr4[i13] = null;
            this.f23373c = u(i13);
        } else {
            int i14 = this.f23373c;
            j11 = u.j(this);
            int G2 = G(i14 + j11);
            Object[] objArr5 = this.f23374d;
            if (G <= G2) {
                l.f(objArr5, objArr5, G, G + 1, G2 + 1);
            } else {
                l.f(objArr5, objArr5, G, G + 1, objArr5.length);
                Object[] objArr6 = this.f23374d;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.f(objArr6, objArr6, 0, 1, G2 + 1);
            }
            this.f23374d[G2] = null;
        }
        this.f23375q = size() - 1;
        return e10;
    }

    public final void f(E e10) {
        s(size() + 1);
        int r10 = r(this.f23373c);
        this.f23373c = r10;
        this.f23374d[r10] = e10;
        this.f23375q = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.Companion.b(i10, size());
        return (E) this.f23374d[G(this.f23373c + i10)];
    }

    public final void i(E e10) {
        s(size() + 1);
        this.f23374d[G(this.f23373c + size())] = e10;
        this.f23375q = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int G = G(this.f23373c + size());
        int i10 = this.f23373c;
        if (i10 < G) {
            while (i10 < G) {
                if (!hc.t.a(obj, this.f23374d[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < G) {
            return -1;
        } else {
            int length = this.f23374d.length;
            while (true) {
                if (i10 >= length) {
                    for (int i11 = 0; i11 < G; i11++) {
                        if (hc.t.a(obj, this.f23374d[i11])) {
                            i10 = i11 + this.f23374d.length;
                        }
                    }
                    return -1;
                } else if (hc.t.a(obj, this.f23374d[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - this.f23373c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int E;
        int G = G(this.f23373c + size());
        int i10 = this.f23373c;
        if (i10 < G) {
            E = G - 1;
            if (i10 <= E) {
                while (!hc.t.a(obj, this.f23374d[E])) {
                    if (E != i10) {
                        E--;
                    }
                }
                return E - this.f23373c;
            }
            return -1;
        }
        if (i10 > G) {
            int i11 = G - 1;
            while (true) {
                if (-1 >= i11) {
                    E = m.E(this.f23374d);
                    int i12 = this.f23373c;
                    if (i12 <= E) {
                        while (!hc.t.a(obj, this.f23374d[E])) {
                            if (E != i12) {
                                E--;
                            }
                        }
                    }
                } else if (hc.t.a(obj, this.f23374d[i11])) {
                    E = i11 + this.f23374d.length;
                    break;
                } else {
                    i11--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        hc.t.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f23374d.length == 0 ? 1 : null) == null) {
                int G = G(this.f23373c + size());
                int i11 = this.f23373c;
                if (i11 < G) {
                    i10 = i11;
                    while (i11 < G) {
                        Object obj = this.f23374d[i11];
                        if (!collection.contains(obj)) {
                            this.f23374d[i10] = obj;
                            i10++;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    l.l(this.f23374d, null, i10, G);
                } else {
                    int length = this.f23374d.length;
                    boolean z11 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f23374d;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (!collection.contains(obj2)) {
                            this.f23374d[i12] = obj2;
                            i12++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i10 = G(i12);
                    for (int i13 = 0; i13 < G; i13++) {
                        Object[] objArr2 = this.f23374d;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (!collection.contains(obj3)) {
                            this.f23374d[i10] = obj3;
                            i10 = u(i10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f23375q = z(i10 - this.f23373c);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        hc.t.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f23374d.length == 0 ? 1 : null) == null) {
                int G = G(this.f23373c + size());
                int i11 = this.f23373c;
                if (i11 < G) {
                    i10 = i11;
                    while (i11 < G) {
                        Object obj = this.f23374d[i11];
                        if (collection.contains(obj)) {
                            this.f23374d[i10] = obj;
                            i10++;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    l.l(this.f23374d, null, i10, G);
                } else {
                    int length = this.f23374d.length;
                    boolean z11 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f23374d;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (collection.contains(obj2)) {
                            this.f23374d[i12] = obj2;
                            i12++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i10 = G(i12);
                    for (int i13 = 0; i13 < G; i13++) {
                        Object[] objArr2 = this.f23374d;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (collection.contains(obj3)) {
                            this.f23374d[i10] = obj3;
                            i10 = u(i10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f23375q = z(i10 - this.f23373c);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.Companion.b(i10, size());
        int G = G(this.f23373c + i10);
        Object[] objArr = this.f23374d;
        E e11 = (E) objArr[G];
        objArr[G] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        hc.t.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) j.a(tArr, size());
        }
        hc.t.c(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int G = G(this.f23373c + size());
        int i10 = this.f23373c;
        if (i10 < G) {
            l.h(this.f23374d, tArr, 0, i10, G, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f23374d;
            l.f(objArr, tArr, 0, this.f23373c, objArr.length);
            Object[] objArr2 = this.f23374d;
            l.f(objArr2, tArr, objArr2.length - this.f23373c, 0, G);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
