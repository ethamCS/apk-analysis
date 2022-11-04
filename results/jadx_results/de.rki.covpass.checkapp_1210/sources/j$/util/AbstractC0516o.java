package j$.util;

import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.o */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0516o {
    public static void a(z zVar, Consumer consumer) {
        if (consumer instanceof AbstractC0503e) {
            zVar.k((AbstractC0503e) consumer);
        } else if (X.f13281a) {
            X.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            zVar.k(new C0515n(consumer));
        }
    }

    public static void c(B b10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b10.f((IntConsumer) consumer);
        } else if (X.f13281a) {
            X.a(b10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            b10.f(new r(consumer));
        }
    }

    public static void d(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.x) {
            d10.g((j$.util.function.x) consumer);
        } else if (X.f13281a) {
            X.a(d10.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            d10.g(new C0640u(consumer));
        }
    }

    public static long h(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean l(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static boolean m(z zVar, Consumer consumer) {
        if (consumer instanceof AbstractC0503e) {
            return zVar.j((AbstractC0503e) consumer);
        }
        if (!X.f13281a) {
            Objects.requireNonNull(consumer);
            return zVar.j(new C0515n(consumer));
        }
        X.a(zVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean n(B b10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return b10.e((IntConsumer) consumer);
        }
        if (!X.f13281a) {
            Objects.requireNonNull(consumer);
            return b10.e(new r(consumer));
        }
        X.a(b10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean o(D d10, Consumer consumer) {
        if (consumer instanceof j$.util.function.x) {
            return d10.i((j$.util.function.x) consumer);
        }
        if (!X.f13281a) {
            Objects.requireNonNull(consumer);
            return d10.i(new C0640u(consumer));
        }
        X.a(d10.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static boolean p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object q(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).putIfAbsent(obj, obj2);
        }
        Object obj3 = map.get(obj);
        return obj3 == null ? map.put(obj, obj2) : obj3;
    }

    public static /* synthetic */ java.util.Comparator r(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Objects.requireNonNull(comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
