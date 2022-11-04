package af;

import hc.t;
import hc.v;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u001a?\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e¨\u0006\u001c"}, d2 = {"T", BuildConfig.FLAVOR, "Laf/h;", "c", BuildConfig.FLAVOR, "elements", "l", "([Ljava/lang/Object;)Laf/h;", "e", "f", BuildConfig.FLAVOR, "h", "(Laf/h;)Laf/h;", "R", "Lkotlin/Function1;", "iterator", "g", "(Laf/h;Lgc/l;)Laf/h;", "d", BuildConfig.FLAVOR, "Lkotlin/Function0;", "nextFunction", "i", "seed", "k", "(Ljava/lang/Object;Lgc/l;)Laf/h;", "seedFunction", "j", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
public class n extends m {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"af/n$a", "Laf/h;", BuildConfig.FLAVOR, "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a implements h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f501a;

        public a(Iterator it) {
            this.f501a = it;
        }

        @Override // af.h
        public Iterator<T> iterator() {
            return this.f501a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Laf/h;", "it", BuildConfig.FLAVOR, "b", "(Laf/h;)Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class b extends v implements gc.l<h<? extends T>, Iterator<? extends T>> {

        /* renamed from: c */
        public static final b f502c = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final Iterator<T> invoke(h<? extends T> hVar) {
            t.e(hVar, "it");
            return hVar.iterator();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Iterable;)Ljava/util/Iterator;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class c extends v implements gc.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: c */
        public static final c f503c = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final Iterator<T> invoke(Iterable<? extends T> iterable) {
            t.e(iterable, "it");
            return iterable.iterator();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends v implements gc.l<T, T> {

        /* renamed from: c */
        public static final d f504c = new d();

        d() {
            super(1);
        }

        @Override // gc.l
        public final T invoke(T t10) {
            return t10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends v implements gc.l<T, T> {

        /* renamed from: c */
        final /* synthetic */ gc.a<T> f505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(gc.a<? extends T> aVar) {
            super(1);
            this.f505c = aVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
        @Override // gc.l
        public final T invoke(T t10) {
            t.e(t10, "it");
            return this.f505c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ T f506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t10) {
            super(0);
            this.f506c = t10;
        }

        @Override // gc.a
        public final T invoke() {
            return this.f506c;
        }
    }

    public static <T> h<T> c(Iterator<? extends T> it) {
        t.e(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> d(h<? extends T> hVar) {
        t.e(hVar, "<this>");
        return hVar instanceof af.a ? hVar : new af.a(hVar);
    }

    public static <T> h<T> e() {
        return af.d.f477a;
    }

    public static final <T> h<T> f(h<? extends h<? extends T>> hVar) {
        t.e(hVar, "<this>");
        return g(hVar, b.f502c);
    }

    private static final <T, R> h<R> g(h<? extends T> hVar, gc.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return hVar instanceof r ? ((r) hVar).d(lVar) : new af.f(hVar, d.f504c, lVar);
    }

    public static <T> h<T> h(h<? extends Iterable<? extends T>> hVar) {
        t.e(hVar, "<this>");
        return g(hVar, c.f503c);
    }

    public static <T> h<T> i(gc.a<? extends T> aVar) {
        t.e(aVar, "nextFunction");
        return d(new g(aVar, new e(aVar)));
    }

    public static <T> h<T> j(gc.a<? extends T> aVar, gc.l<? super T, ? extends T> lVar) {
        t.e(aVar, "seedFunction");
        t.e(lVar, "nextFunction");
        return new g(aVar, lVar);
    }

    public static <T> h<T> k(T t10, gc.l<? super T, ? extends T> lVar) {
        t.e(lVar, "nextFunction");
        return t10 == null ? af.d.f477a : new g(new f(t10), lVar);
    }

    public static final <T> h<T> l(T... tArr) {
        h<T> t10;
        h<T> e10;
        t.e(tArr, "elements");
        if (tArr.length == 0) {
            e10 = e();
            return e10;
        }
        t10 = ub.m.t(tArr);
        return t10;
    }
}
