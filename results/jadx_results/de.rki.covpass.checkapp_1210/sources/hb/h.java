package hb;

import hc.k0;
import hc.t;
import hc.y;
import io.ktor.utils.io.s;
import java.util.Iterator;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0010\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R;\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, d2 = {"Lhb/h;", BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "Lhb/e;", "d", "value", "a", "(Ljava/lang/Object;)Lhb/e;", "b", BuildConfig.FLAVOR, "iterator", "<set-?>", "head$delegate", "Lkc/d;", "e", "()Lhb/e;", "i", "(Lhb/e;)V", "head", "tail$delegate", "f", "k", "tail", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h<T> implements Iterable<T>, ic.a {

    /* renamed from: q */
    static final /* synthetic */ k<Object>[] f11729q = {k0.e(new y(h.class, "head", "getHead$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0)), k0.e(new y(h.class, "tail", "getTail$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0))};

    /* renamed from: c */
    private final kc.d f11730c = new a(null);

    /* renamed from: d */
    private final kc.d f11731d = new b(e());

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements kc.d<Object, e<T>> {

        /* renamed from: a */
        private e<T> f11732a;

        /* renamed from: b */
        final /* synthetic */ Object f11733b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.f11733b = obj;
            this.f11732a = obj;
        }

        @Override // kc.d, kc.c
        public e<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11732a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<T> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11732a = eVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements kc.d<Object, e<T>> {

        /* renamed from: a */
        private e<T> f11734a;

        /* renamed from: b */
        final /* synthetic */ Object f11735b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.f11735b = obj;
            this.f11734a = obj;
        }

        @Override // kc.d, kc.c
        public e<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11734a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<T> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11734a = eVar;
        }
    }

    public h() {
        s.a(this);
        i(new e<>(this, null, null, null));
        k(e());
    }

    public final e<T> a(T t10) {
        t.e(t10, "value");
        e<T> e10 = e();
        t.b(e10);
        e<T> d10 = e10.d(t10);
        if (t.a(e(), f())) {
            k(d10);
        }
        return d10;
    }

    public final e<T> b(T t10) {
        t.e(t10, "value");
        e<T> f10 = f();
        t.b(f10);
        k(f10.d(t10));
        e<T> f11 = f();
        t.b(f11);
        return f11;
    }

    public final e<T> d() {
        e<T> e10 = e();
        t.b(e10);
        return e10.b();
    }

    public final e<T> e() {
        return (e) this.f11730c.a(this, f11729q[0]);
    }

    public final e<T> f() {
        return (e) this.f11731d.a(this, f11729q[1]);
    }

    public final void i(e<T> eVar) {
        this.f11730c.b(this, f11729q[0], eVar);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        e<T> e10 = e();
        t.b(e10);
        return new d(e10);
    }

    public final void k(e<T> eVar) {
        this.f11731d.b(this, f11729q[1], eVar);
    }
}
