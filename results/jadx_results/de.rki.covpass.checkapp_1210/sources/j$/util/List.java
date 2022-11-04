package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public interface List<E> extends AbstractC0491a {

    /* renamed from: j$.util.List$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.List list) {
            Objects.requireNonNull(list);
            return new S(list, 16);
        }
    }

    /* renamed from: j$.util.List$-EL */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class EL {
        public static void sort(java.util.List list, java.util.Comparator comparator) {
            if (list instanceof List) {
                ((List) list).sort(comparator);
            } else if (DesugarCollections.f13231b.isInstance(list)) {
                DesugarCollections.e(list, comparator);
            } else {
                Object[] array = list.toArray();
                Arrays.sort(array, comparator);
                ListIterator<E> listIterator = list.listIterator();
                for (Object obj : array) {
                    listIterator.next();
                    listIterator.set(obj);
                }
            }
        }
    }

    void add(int i10, E e10);

    boolean add(E e10);

    boolean addAll(int i10, Collection<? extends E> collection);

    boolean addAll(Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    boolean equals(Object obj);

    @Override // j$.util.AbstractC0491a, j$.lang.Iterable
    /* synthetic */ void forEach(Consumer<? super E> consumer);

    E get(int i10);

    int hashCode();

    int indexOf(Object obj);

    boolean isEmpty();

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.lang.Iterable
    java.util.Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i10);

    /* synthetic */ Stream<E> parallelStream();

    E remove(int i10);

    boolean remove(Object obj);

    boolean removeAll(Collection<?> collection);

    @Override // j$.util.AbstractC0491a
    /* synthetic */ boolean removeIf(Predicate<? super E> predicate);

    void replaceAll(UnaryOperator<E> unaryOperator);

    boolean retainAll(Collection<?> collection);

    E set(int i10, E e10);

    int size();

    void sort(java.util.Comparator<? super E> comparator);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.AbstractC0491a, j$.lang.Iterable
    /* renamed from: spliterator */
    Spliterator<E> mo23spliterator();

    @Override // j$.util.List, j$.util.AbstractC0491a
    /* synthetic */ Stream<E> stream();

    java.util.List<E> subList(int i10, int i11);

    Object[] toArray();

    /* synthetic */ <T> T[] toArray(j$.util.function.q qVar);

    <T> T[] toArray(T[] tArr);
}
