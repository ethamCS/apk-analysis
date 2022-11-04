package hb;

import hc.k0;
import hc.t;
import hc.y;
import io.ktor.utils.io.s;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B?\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R;\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001d"}, d2 = {"Lhb/e;", BuildConfig.FLAVOR, "T", "value", "d", "(Ljava/lang/Object;)Lhb/e;", "Ltb/e0;", "f", "e", "item", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<set-?>", "next$delegate", "Lkc/d;", "b", "()Lhb/e;", "g", "(Lhb/e;)V", "next", "previous$delegate", "c", "h", "previous", "Lhb/h;", "list", "<init>", "(Lhb/h;Lhb/e;Ljava/lang/Object;Lhb/e;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: e */
    static final /* synthetic */ k<Object>[] f11708e = {k0.e(new y(e.class, "next", "getNext()Lio/ktor/util/collections/internal/ForwardListNode;", 0)), k0.e(new y(e.class, "previous", "getPrevious()Lio/ktor/util/collections/internal/ForwardListNode;", 0))};

    /* renamed from: a */
    private final h<T> f11709a;

    /* renamed from: b */
    private final T f11710b;

    /* renamed from: c */
    private final kc.d f11711c;

    /* renamed from: d */
    private final kc.d f11712d;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements kc.d<Object, e<T>> {

        /* renamed from: a */
        private e<T> f11713a;

        /* renamed from: b */
        final /* synthetic */ Object f11714b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj) {
            this.f11714b = obj;
            this.f11713a = obj;
        }

        @Override // kc.d, kc.c
        public e<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11713a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<T> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11713a = eVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements kc.d<Object, e<T>> {

        /* renamed from: a */
        private e<T> f11715a;

        /* renamed from: b */
        final /* synthetic */ Object f11716b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.f11716b = obj;
            this.f11715a = obj;
        }

        @Override // kc.d, kc.c
        public e<T> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f11715a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, e<T> eVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f11715a = eVar;
        }
    }

    public e(h<T> hVar, e<T> eVar, T t10, e<T> eVar2) {
        t.e(hVar, "list");
        this.f11709a = hVar;
        this.f11710b = t10;
        this.f11711c = new a(eVar);
        this.f11712d = new b(eVar2);
        s.a(this);
    }

    public final T a() {
        return this.f11710b;
    }

    public final e<T> b() {
        return (e) this.f11711c.a(this, f11708e[0]);
    }

    public final e<T> c() {
        return (e) this.f11712d.a(this, f11708e[1]);
    }

    public final e<T> d(T t10) {
        t.e(t10, "value");
        e<T> eVar = new e<>(this.f11709a, b(), t10, this);
        e<T> b10 = b();
        if (b10 != null) {
            b10.h(eVar);
        }
        g(eVar);
        return eVar;
    }

    public final void e() {
        e<T> c10 = c();
        t.b(c10);
        c10.f();
    }

    public final void f() {
        if (t.a(b(), this.f11709a.f())) {
            this.f11709a.k(this);
        }
        e<T> b10 = b();
        g(b10 == null ? null : b10.b());
        e<T> b11 = b();
        if (b11 == null) {
            return;
        }
        b11.h(this);
    }

    public final void g(e<T> eVar) {
        this.f11711c.b(this, f11708e[0], eVar);
    }

    public final void h(e<T> eVar) {
        this.f11712d.b(this, f11708e[1], eVar);
    }
}
