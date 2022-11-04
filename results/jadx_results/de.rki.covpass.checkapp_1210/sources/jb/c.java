package jb;

import gc.q;
import hc.k0;
import hc.t;
import hc.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\nBV\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 \u0012:\u0010\u001a\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\fø\u0001\u0000¢\u0006\u0004\b2\u00103B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b2\u00104J\b\u0010\u0005\u001a\u00020\u0004H\u0002JF\u0010\n\u001a\u00020\u000424\u0010\t\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u000e\u001a\u00020\u00042:\u0010\r\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\fø\u0001\u0000J=\u0010\u000f\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\fø\u0001\u0000J=\u0010\u0010\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\fø\u0001\u0000J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0096\u0001\u0010\u001a\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\f2:\u0010\u0013\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\f8B@BX\u0082\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010+\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Ljb/c;", BuildConfig.FLAVOR, "TSubject", "Call", "Ltb/e0;", "d", "Lkotlin/Function3;", "Ljb/e;", "Lxb/d;", "interceptor", "a", "(Lgc/q;)V", BuildConfig.FLAVOR, "destination", "b", "m", "c", BuildConfig.FLAVOR, "toString", "<set-?>", "interceptors$delegate", "Lkc/d;", "e", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "interceptors", "Ljb/h;", "phase", "Ljb/h;", "f", "()Ljb/h;", "Ljb/i;", "relation", "Ljb/i;", "g", "()Ljb/i;", BuildConfig.FLAVOR, "shared$delegate", "h", "()Z", "l", "(Z)V", "shared", "j", "isEmpty", BuildConfig.FLAVOR, "i", "()I", "size", "<init>", "(Ljb/h;Ljb/i;Ljava/util/List;)V", "(Ljb/h;Ljb/i;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c<TSubject, Call> {

    /* renamed from: a */
    private final h f14251a;

    /* renamed from: b */
    private final i f14252b;

    /* renamed from: c */
    private final kc.d f14253c;

    /* renamed from: d */
    private final kc.d f14254d;

    /* renamed from: e */
    static final /* synthetic */ oc.k<Object>[] f14249e = {k0.e(new y(c.class, "interceptors", "getInterceptors()Ljava/util/List;", 0)), k0.e(new y(c.class, "shared", "getShared()Z", 0))};
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static final List<Object> f14250f = io.ktor.util.collections.a.a(new Object[0]);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljb/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements kc.d<Object, List<q<? super e<TSubject, Call>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>>> {

        /* renamed from: a */
        private List<q<? super e<TSubject, Call>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> f14255a;

        /* renamed from: b */
        final /* synthetic */ Object f14256b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj) {
            this.f14256b = obj;
            this.f14255a = obj;
        }

        @Override // kc.d, kc.c
        public List<q<? super e<TSubject, Call>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> a(Object obj, oc.k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f14255a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, List<q<? super e<TSubject, Call>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f14255a = list;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: jb.c$c */
    /* loaded from: classes.dex */
    public static final class C0207c implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f14257a;

        /* renamed from: b */
        final /* synthetic */ Object f14258b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0207c(Object obj) {
            this.f14258b = obj;
            this.f14257a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, oc.k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f14257a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f14257a = bool;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(jb.h r3, jb.i r4) {
        /*
            r2 = this;
            java.lang.String r0 = "phase"
            hc.t.e(r3, r0)
            java.lang.String r0 = "relation"
            hc.t.e(r4, r0)
            java.util.List<java.lang.Object> r0 = jb.c.f14250f
            java.util.List r1 = hc.q0.b(r0)
            r2.<init>(r3, r4, r1)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1a
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The shared empty array list has been modified"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.c.<init>(jb.h, jb.i):void");
    }

    public c(h hVar, i iVar, List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> list) {
        t.e(hVar, "phase");
        t.e(iVar, "relation");
        t.e(list, "interceptors");
        this.f14251a = hVar;
        this.f14252b = iVar;
        this.f14253c = new b(list);
        this.f14254d = new C0207c(Boolean.TRUE);
    }

    private final void d() {
        k(c());
        l(false);
    }

    private final List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> e() {
        return (List) this.f14253c.a(this, f14249e[0]);
    }

    private final void k(List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> list) {
        this.f14253c.b(this, f14249e[0], list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q<? super e<TSubject, Call>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object> qVar) {
        t.e(qVar, "interceptor");
        if (h()) {
            d();
        }
        e().add(qVar);
    }

    public final void b(List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> list) {
        t.e(list, "destination");
        List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> e10 = e();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + e10.size());
        }
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.add(e10.get(i10));
        }
    }

    public final List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> c() {
        List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> a10 = io.ktor.util.collections.a.a(new q[0]);
        a10.addAll(e());
        return a10;
    }

    public final h f() {
        return this.f14251a;
    }

    public final i g() {
        return this.f14252b;
    }

    public final boolean h() {
        return ((Boolean) this.f14254d.a(this, f14249e[1])).booleanValue();
    }

    public final int i() {
        return e().size();
    }

    public final boolean j() {
        return e().isEmpty();
    }

    public final void l(boolean z10) {
        this.f14254d.b(this, f14249e[1], Boolean.valueOf(z10));
    }

    public final List<q<e<TSubject, Call>, TSubject, xb.d<? super e0>, Object>> m() {
        l(true);
        return e();
    }

    public String toString() {
        return "Phase `" + this.f14251a.a() + "`, " + i() + " handlers";
    }
}
