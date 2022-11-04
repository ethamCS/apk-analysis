package kotlinx.serialization.json;

import hc.l;
import hc.t;
import ic.a;
import j$.lang.Iterable;
import j$.util.Collection$CC;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.h;
import lf.b;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001$B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", BuildConfig.FLAVOR, "element", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "elements", "containsAll", BuildConfig.FLAVOR, "index", "b", "e", "isEmpty", BuildConfig.FLAVOR, "iterator", "f", BuildConfig.FLAVOR, "listIterator", "fromIndex", "toIndex", "subList", BuildConfig.FLAVOR, "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "c", "Ljava/util/List;", "content", "d", "()I", "size", "<init>", "(Ljava/util/List;)V", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
@h(with = b.class)
/* loaded from: classes3.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, a, j$.util.List {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private final List<JsonElement> f15602c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonArray> serializer() {
            return b.f15965a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        super(null);
        t.e(list, "content");
        this.f15602c = list;
    }

    public boolean a(JsonElement jsonElement) {
        t.e(jsonElement, "element");
        return this.f15602c.contains(jsonElement);
    }

    @Override // java.util.List, j$.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public boolean addAll(int i10, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public JsonElement get(int i10) {
        return this.f15602c.get(i10);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return a((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        return this.f15602c.containsAll(collection);
    }

    public int d() {
        return this.f15602c.size();
    }

    public int e(JsonElement jsonElement) {
        t.e(jsonElement, "element");
        return this.f15602c.indexOf(jsonElement);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean equals(Object obj) {
        return t.a(this.f15602c, obj);
    }

    public int f(JsonElement jsonElement) {
        t.e(jsonElement, "element");
        return this.f15602c.lastIndexOf(jsonElement);
    }

    @Override // j$.util.List, j$.util.AbstractC0491a, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public int hashCode() {
        return this.f15602c.hashCode();
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return e((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean isEmpty() {
        return this.f15602c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f15602c.iterator();
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return f((JsonElement) obj);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.f15602c.listIterator();
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<JsonElement> listIterator(int i10) {
        return this.f15602c.listIterator(i10);
    }

    @Override // java.util.List, j$.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.List, j$.util.AbstractC0491a
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // j$.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator<JsonElement> unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public List<JsonElement> subList(int i10, int i11) {
        return this.f15602c.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "array");
        return (T[]) l.b(this, tArr);
    }

    public String toString() {
        String e02;
        e02 = c0.e0(this.f15602c, ",", "[", "]", 0, null, null, 56, null);
        return e02;
    }
}
