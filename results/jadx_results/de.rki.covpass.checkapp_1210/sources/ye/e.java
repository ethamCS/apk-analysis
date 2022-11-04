package ye;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* loaded from: classes3.dex */
public class e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: c */
    private int f26245c;

    /* renamed from: d */
    private Object f26246d;

    /* loaded from: classes3.dex */
    private static class b<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: c */
        private static final b f26247c = new b();

        private b() {
        }

        public static <T> b<T> b() {
            return f26247c;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    private class c extends d<E> implements j$.util.Iterator {

        /* renamed from: d */
        private final int f26248d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super();
            e.this = r2;
            this.f26248d = ((AbstractList) r2).modCount;
        }

        @Override // ye.e.d
        protected void b() {
            if (((AbstractList) e.this).modCount == this.f26248d) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) e.this).modCount + "; expected: " + this.f26248d);
        }

        @Override // ye.e.d
        protected E c() {
            return (E) e.this.f26246d;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            b();
            e.this.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class d<T> implements java.util.Iterator<T> {

        /* renamed from: c */
        private boolean f26250c;

        private d() {
        }

        protected abstract void b();

        protected abstract T c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f26250c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f26250c) {
                this.f26250c = true;
                b();
                return c();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f26245c)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f26245c);
        }
        if (i11 == 0) {
            this.f26246d = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.f26246d = new Object[]{e10, this.f26246d};
        } else {
            Object[] objArr = new Object[i11 + 1];
            if (i11 == 1) {
                objArr[0] = this.f26246d;
            } else {
                Object[] objArr2 = (Object[]) this.f26246d;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f26245c - i10);
            }
            objArr[i10] = e10;
            this.f26246d = objArr;
        }
        this.f26245c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f26245c;
        if (i10 == 0) {
            this.f26246d = e10;
        } else if (i10 == 1) {
            this.f26246d = new Object[]{this.f26246d, e10};
        } else {
            Object[] objArr = (Object[]) this.f26246d;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f26246d = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f26245c] = e10;
        }
        this.f26245c++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f26246d = null;
        this.f26245c = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f26245c)) {
            return i11 == 1 ? (E) this.f26246d : (E) ((Object[]) this.f26246d)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f26245c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        int i10 = this.f26245c;
        if (i10 == 0) {
            b b10 = b.b();
            if (b10 == null) {
                a(2);
            }
            return b10;
        } else if (i10 == 1) {
            return new c();
        } else {
            java.util.Iterator<E> it = super.iterator();
            if (it == null) {
                a(3);
            }
            return it;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f26245c)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f26245c);
        }
        if (i11 == 1) {
            e10 = (E) this.f26246d;
            this.f26246d = null;
        } else {
            Object[] objArr = (Object[]) this.f26246d;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f26246d = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f26245c - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f26245c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f26245c)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f26245c);
        } else if (i11 == 1) {
            E e11 = (E) this.f26246d;
            this.f26246d = e10;
            return e11;
        } else {
            Object[] objArr = (Object[]) this.f26246d;
            E e12 = (E) objArr[i10];
            objArr[i10] = e10;
            return e12;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26245c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i10 = this.f26245c;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f26246d;
                return tArr2;
            }
            tArr[0] = this.f26246d;
        } else if (length < i10) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f26246d, i10, tArr.getClass());
            if (tArr3 == null) {
                a(6);
            }
            return tArr3;
        } else if (i10 != 0) {
            System.arraycopy(this.f26246d, 0, tArr, 0, i10);
        }
        int i11 = this.f26245c;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }
}
