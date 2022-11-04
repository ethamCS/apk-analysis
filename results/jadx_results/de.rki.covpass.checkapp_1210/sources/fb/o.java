package fb;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B=\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004*\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0016\u0010\u0011\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u001a\u0010\u001e\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lfb/o;", "From", "To", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "e", "element", BuildConfig.FLAVOR, "add", "(Ljava/lang/Object;)Z", "elements", "addAll", "Ltb/e0;", "clear", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", "equals", BuildConfig.FLAVOR, "toString", "size", "I", "f", "()I", "delegate", "Lkotlin/Function1;", "convertTo", "convert", "<init>", "(Ljava/util/Set;Lgc/l;Lgc/l;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class o<From, To> implements Set<To>, ic.e {

    /* renamed from: c */
    private final Set<From> f10126c;

    /* renamed from: d */
    private final gc.l<From, To> f10127d;

    /* renamed from: q */
    private final gc.l<To, From> f10128q;

    /* renamed from: x */
    private final int f10129x;

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"fb/o$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "remove", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements Iterator<To>, ic.a, j$.util.Iterator {

        /* renamed from: c */
        private final Iterator<From> f10130c;

        /* renamed from: d */
        final /* synthetic */ o<From, To> f10131d;

        a(o<From, To> oVar) {
            this.f10131d = oVar;
            this.f10130c = ((o) oVar).f10126c.iterator();
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
            return this.f10130c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public To next() {
            return (To) ((o) this.f10131d).f10127d.invoke(this.f10130c.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f10130c.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(Set<From> set, gc.l<? super From, ? extends To> lVar, gc.l<? super To, ? extends From> lVar2) {
        hc.t.e(set, "delegate");
        hc.t.e(lVar, "convertTo");
        hc.t.e(lVar2, "convert");
        this.f10126c = set;
        this.f10127d = lVar;
        this.f10128q = lVar2;
        this.f10129x = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to) {
        return this.f10126c.add(this.f10128q.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends To> collection) {
        hc.t.e(collection, "elements");
        return this.f10126c.addAll(d(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f10126c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f10126c.contains(this.f10128q.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        hc.t.e(collection, "elements");
        return this.f10126c.containsAll(d(collection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Collection<From> d(Collection<? extends To> collection) {
        int s10;
        hc.t.e(collection, "<this>");
        s10 = ub.v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f10128q.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Collection<To> e(Collection<? extends From> collection) {
        int s10;
        hc.t.e(collection, "<this>");
        s10 = ub.v.s(collection, 10);
        ArrayList arrayList = new ArrayList(s10);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f10127d.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        Collection<To> e10 = e(this.f10126c);
        return ((Set) obj).containsAll(e10) && e10.containsAll((Collection) obj);
    }

    public int f() {
        return this.f10129x;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f10126c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f10126c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<To> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f10126c.remove(this.f10128q.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        hc.t.e(collection, "elements");
        return this.f10126c.removeAll(d(collection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        hc.t.e(collection, "elements");
        return this.f10126c.retainAll(d(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return hc.l.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        hc.t.e(tArr, "array");
        return (T[]) hc.l.b(this, tArr);
    }

    public String toString() {
        return e(this.f10126c).toString();
    }
}
