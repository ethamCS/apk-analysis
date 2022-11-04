package ye;

import hc.q0;
import hc.t;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.m;
import ub.y0;
/* loaded from: classes3.dex */
public final class f<T> extends AbstractSet<T> {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private Object f26251c;

    /* renamed from: d */
    private int f26252d;

    /* loaded from: classes3.dex */
    private static final class a<T> implements Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<T> f26253c;

        public a(T[] tArr) {
            t.e(tArr, "array");
            this.f26253c = hc.d.a(tArr);
        }

        /* renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
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
            return this.f26253c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            return this.f26253c.next();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final <T> f<T> a() {
            return new f<>(null);
        }

        @fc.c
        public final <T> f<T> b(Collection<? extends T> collection) {
            t.e(collection, "set");
            f<T> fVar = new f<>(null);
            fVar.addAll(collection);
            return fVar;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c<T> implements java.util.Iterator<T>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final T f26254c;

        /* renamed from: d */
        private boolean f26255d = true;

        public c(T t10) {
            this.f26254c = t10;
        }

        /* renamed from: b */
        public Void remove() {
            throw new UnsupportedOperationException();
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
            return this.f26255d;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f26255d) {
                this.f26255d = false;
                return this.f26254c;
            }
            throw new NoSuchElementException();
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @fc.c
    public static final <T> f<T> a() {
        return Companion.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        boolean v10;
        Object[] objArr;
        LinkedHashSet c10;
        if (size() == 0) {
            this.f26251c = t10;
        } else if (size() == 1) {
            if (t.a(this.f26251c, t10)) {
                return false;
            }
            this.f26251c = new Object[]{this.f26251c, t10};
        } else if (size() < 5) {
            Object obj = this.f26251c;
            t.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            v10 = m.v(objArr2, t10);
            if (v10) {
                return false;
            }
            if (size() == 4) {
                c10 = y0.c(Arrays.copyOf(objArr2, objArr2.length));
                c10.add(t10);
                objArr = c10;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                t.d(copyOf, "copyOf(this, newSize)");
                copyOf[copyOf.length - 1] = t10;
                objArr = copyOf;
            }
            this.f26251c = objArr;
        } else {
            Object obj2 = this.f26251c;
            t.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!q0.c(obj2).add(t10)) {
                return false;
            }
        }
        c(size() + 1);
        return true;
    }

    public int b() {
        return this.f26252d;
    }

    public void c(int i10) {
        this.f26252d = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26251c = null;
        c(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean v10;
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return t.a(this.f26251c, obj);
        }
        if (size() >= 5) {
            Object obj2 = this.f26251c;
            t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ((Set) obj2).contains(obj);
        }
        Object obj3 = this.f26251c;
        t.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
        v10 = m.v((Object[]) obj3, obj);
        return v10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        Set c10;
        if (size() == 0) {
            c10 = Collections.emptySet();
        } else if (size() == 1) {
            return new c(this.f26251c);
        } else {
            if (size() < 5) {
                Object obj = this.f26251c;
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                return new a((Object[]) obj);
            }
            Object obj2 = this.f26251c;
            t.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            c10 = q0.c(obj2);
        }
        return c10.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
