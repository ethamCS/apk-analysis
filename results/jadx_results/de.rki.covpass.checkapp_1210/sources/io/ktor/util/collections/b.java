package io.ktor.util.collections;

import fb.q;
import hb.i;
import hc.k0;
import hc.l;
import hc.t;
import hc.y;
import io.ktor.utils.io.s;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kc.d;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0016J\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0016\u0010\"\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0016J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010\u0016J\u0016\u0010,\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010\u001bJ\u0016\u0010.\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J \u0010/\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b/\u00100R\u0018\u00104\u001a\u00060\u000ej\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R7\u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000052\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010C\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lio/ktor/util/collections/b;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "index", "Ltb/e0;", "a", "targetCapacity", "e", "firstNull", "n", "gapSize", "k", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "toString", "element", "contains", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "elements", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "clear", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "listIterator", "fromIndex", "toIndex", "subList", "remove", "removeAll", "i", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "q", "Ljava/lang/Object;", "lock", "Lhb/i;", "<set-?>", "data$delegate", "Lkc/d;", "b", "()Lhb/i;", "l", "(Lhb/i;)V", "data", "size$delegate", "d", "()I", "m", "(I)V", "size", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b<T> implements List<T>, ic.c {

    /* renamed from: x */
    static final /* synthetic */ k<Object>[] f12742x = {k0.e(new y(b.class, "data", "getData()Lio/ktor/util/collections/internal/SharedList;", 0)), k0.e(new y(b.class, "size", "getSize()I", 0))};

    /* renamed from: c */
    private final d f12743c = new C0190b(new i(32));

    /* renamed from: d */
    private final d f12744d = new c(0);

    /* renamed from: q */
    private final Object f12745q = new Object();

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\b\u0010\f\u001a\u00020\tH\u0016J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR+\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"io/ktor/util/collections/b$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hasNext", "next", "()Ljava/lang/Object;", "Ltb/e0;", "remove", "hasPrevious", BuildConfig.FLAVOR, "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "<set-?>", "current$delegate", "Lkc/d;", "b", "()I", "d", "(I)V", "current", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, ic.a, Iterator {

        /* renamed from: x */
        static final /* synthetic */ k<Object>[] f12746x = {k0.e(new y(a.class, "current", "getCurrent()I", 0))};

        /* renamed from: c */
        private final d f12747c;

        /* renamed from: d */
        final /* synthetic */ int f12748d;

        /* renamed from: q */
        final /* synthetic */ b<T> f12749q;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* renamed from: io.ktor.util.collections.b$a$a */
        /* loaded from: classes.dex */
        public static final class C0189a implements d<Object, Integer> {

            /* renamed from: a */
            private Integer f12750a;

            /* renamed from: b */
            final /* synthetic */ Object f12751b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0189a(Object obj) {
                this.f12751b = obj;
                this.f12750a = obj;
            }

            @Override // kc.d, kc.c
            public Integer a(Object obj, k<?> kVar) {
                t.e(obj, "thisRef");
                t.e(kVar, "property");
                return this.f12750a;
            }

            @Override // kc.d
            public void b(Object obj, k<?> kVar, Integer num) {
                t.e(obj, "thisRef");
                t.e(kVar, "property");
                this.f12750a = num;
            }
        }

        a(int i10, b<T> bVar) {
            this.f12748d = i10;
            this.f12749q = bVar;
            this.f12747c = new C0189a(Integer.valueOf(i10));
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f12749q.add(b(), t10);
        }

        public final int b() {
            return ((Number) this.f12747c.a(this, f12746x[0])).intValue();
        }

        public final void d(int i10) {
            this.f12747c.b(this, f12746x[0], Integer.valueOf(i10));
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
            return b() < this.f12749q.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public T next() {
            b<T> bVar = this.f12749q;
            int b10 = b();
            d(b10 + 1);
            return bVar.get(b10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b() + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            b<T> bVar = this.f12749q;
            int b10 = b();
            d(b10 - 1);
            return bVar.get(b10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f12749q.remove(b() - 1);
            d(b() - 1);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f12749q.set(b() - 1, t10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: io.ktor.util.collections.b$b */
    /* loaded from: classes.dex */
    public static final class C0190b implements d<Object, i<T>> {

        /* renamed from: a */
        private i<T> f12752a;

        /* renamed from: b */
        final /* synthetic */ Object f12753b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0190b(Object obj) {
            this.f12753b = obj;
            this.f12752a = obj;
        }

        @Override // kc.d, kc.c
        public i<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f12752a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, i<T> iVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f12752a = iVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c implements d<Object, Integer> {

        /* renamed from: a */
        private Integer f12754a;

        /* renamed from: b */
        final /* synthetic */ Object f12755b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj) {
            this.f12755b = obj;
            this.f12754a = obj;
        }

        @Override // kc.d, kc.c
        public Integer a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f12754a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Integer num) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f12754a = num;
        }
    }

    public b() {
        s.a(this);
    }

    private final void a(int i10) {
        if (i10 >= size() || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    private final i<T> b() {
        return (i) this.f12743c.a(this, f12742x[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(int i10) {
        i iVar = new i(i10);
        int size = b().size();
        for (int i11 = 0; i11 < size; i11++) {
            iVar.b(i11, b().get(i11));
        }
        l(iVar);
    }

    static /* synthetic */ void f(b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.b().size() * 2;
        }
        bVar.e(i10);
    }

    private final void k(int i10, int i11) {
        int size = size() + i11;
        while (b().size() < size) {
            f(this, 0, 1, null);
        }
        for (int size2 = size() - 1; size2 >= i10; size2--) {
            b().b(size2 + i11, b().get(size2));
        }
        int i12 = i10 + i11;
        while (i10 < i12) {
            b().b(i10, null);
            i10++;
        }
        m(size() + i11);
    }

    private final void l(i<T> iVar) {
        this.f12743c.b(this, f12742x[0], iVar);
    }

    private void m(int i10) {
        this.f12744d.b(this, f12742x[1], Integer.valueOf(i10));
    }

    private final void n(int i10) {
        int i11 = i10 + 1;
        int size = size();
        while (i11 < size) {
            int i12 = i11 + 1;
            if (b().get(i11) != null) {
                b().b(i10, b().get(i11));
                i10++;
            }
            i11 = i12;
        }
        int size2 = size();
        for (int i13 = i10; i13 < size2; i13++) {
            b().b(i13, null);
        }
        m(i10);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        k(i10, 1);
        b().b(i10, t10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        synchronized (this.f12745q) {
            if (size() >= b().size()) {
                f(this, 0, 1, null);
            }
            b().b(size(), t10);
            m(size() + 1);
        }
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        t.e(collection, "elements");
        k(i10, collection.size());
        for (T t10 : collection) {
            b().b(i10, t10);
            i10++;
        }
        return !collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        t.e(collection, "elements");
        if (!collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext() && add(it.next())) {
            }
        }
        return !collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        synchronized (this.f12745q) {
            l(new i<>(32));
            m(0);
            e0 e0Var = e0.f22152a;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return ((Number) this.f12744d.a(this, f12742x[1])).intValue();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        boolean z10;
        synchronized (this.f12745q) {
            z10 = false;
            if (obj != null) {
                if ((obj instanceof List) && ((List) obj).size() == size()) {
                    java.util.Iterator<T> it = iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                            break;
                        }
                        T next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            u.r();
                        }
                        if (!t.a(((List) obj).get(i10), next)) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
        }
        return z10;
    }

    @Override // java.util.List
    public T get(int i10) {
        T t10;
        synchronized (this.f12745q) {
            if (i10 >= size()) {
                throw new NoSuchElementException();
            }
            t10 = b().get(i10);
            t.b(t10);
        }
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int i10;
        synchronized (this.f12745q) {
            i10 = 7;
            for (T t10 : this) {
                q qVar = q.f10134a;
                Object[] objArr = new Object[2];
                int i11 = 0;
                objArr[0] = Integer.valueOf(i10);
                if (t10 != null) {
                    i11 = t10.hashCode();
                }
                objArr[1] = Integer.valueOf(i11);
                i10 = qVar.a(objArr);
            }
        }
        return i10;
    }

    public T i(int i10) {
        T t10;
        synchronized (this.f12745q) {
            a(i10);
            t10 = b().get(i10);
            b().b(i10, null);
            n(i10);
            t.b(t10);
        }
        return t10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        synchronized (this.f12745q) {
            int i10 = 0;
            int size = size();
            while (i10 < size) {
                int i11 = i10 + 1;
                if (t.a(b().get(i10), obj)) {
                    return i10;
                }
                i10 = i11;
            }
            return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        synchronized (this.f12745q) {
            int size = size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (t.a(b().get(size), obj)) {
                        return size;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            return -1;
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new a(i10, this);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return i(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean z10;
        synchronized (this.f12745q) {
            int indexOf = indexOf(obj);
            if (indexOf < 0) {
                z10 = false;
            } else {
                remove(indexOf);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        t.e(collection, "elements");
        java.util.Iterator<T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean z10;
        t.e(collection, "elements");
        synchronized (this.f12745q) {
            int size = size();
            z10 = false;
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                T t10 = b().get(i11);
                t.b(t10);
                if (!collection.contains(t10)) {
                    b().b(i11, null);
                    if (i10 < 0) {
                        i10 = i11;
                    }
                    z10 = true;
                }
                i11 = i12;
            }
            if (z10) {
                n(i10);
            }
        }
        return z10;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        synchronized (this.f12745q) {
            a(i10);
            T t11 = b().get(i10);
            b().b(i10, t10);
            if (t11 != null) {
                t10 = t11;
            }
        }
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return new hb.a(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return l.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        t.e(tArr, "array");
        return (T[]) l.b(this, tArr);
    }

    public String toString() {
        String sb2;
        synchronized (this.f12745q) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            int i10 = 0;
            for (T t10 : this) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u.r();
                }
                sb3.append(String.valueOf(t10));
                if (i11 < size()) {
                    sb3.append(", ");
                }
                i10 = i11;
            }
            sb3.append(']');
            sb2 = sb3.toString();
            t.d(sb2, "StringBuilder().apply(builderAction).toString()");
        }
        return sb2;
    }
}
