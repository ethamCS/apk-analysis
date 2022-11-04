package ua;

import bb.c;
import bb.p;
import bb.s;
import gc.q;
import io.ktor.utils.io.h;
import io.ktor.utils.io.j;
import java.util.Collection;
import java.util.List;
import jb.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob.z;
import org.conscrypt.BuildConfig;
import ta.k;
import tb.e0;
import tb.t;
import ub.c0;
import ub.u;
import ya.i;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0015\u0005B1\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lua/c;", BuildConfig.FLAVOR, "Lbb/c;", "contentType", BuildConfig.FLAVOR, "b", "(Lbb/c;)Z", "Lua/d;", "serializer", "Lua/d;", "d", "()Lua/d;", BuildConfig.FLAVOR, "acceptContentTypes", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lbb/d;", "receiveContentTypeMatchers", "<init>", "(Lua/d;Ljava/util/List;Ljava/util/List;)V", "a", "ktor-client-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d */
    public static final b f23330d = new b(null);

    /* renamed from: e */
    private static final fb.a<c> f23331e = new fb.a<>("Json");

    /* renamed from: a */
    private final d f23332a;

    /* renamed from: b */
    private final List<bb.c> f23333b;

    /* renamed from: c */
    private final List<bb.d> f23334c;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lua/c$a;", BuildConfig.FLAVOR, "Lua/d;", "serializer", "Lua/d;", "c", "()Lua/d;", "d", "(Lua/d;)V", BuildConfig.FLAVOR, "Lbb/c;", "value", "a", "()Ljava/util/List;", "setAcceptContentTypes", "(Ljava/util/List;)V", "acceptContentTypes", "Lbb/d;", "b", "setReceiveContentTypeMatchers", "receiveContentTypeMatchers", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private d f23335a;

        /* renamed from: b */
        private final List<bb.c> f23336b;

        /* renamed from: c */
        private final List<bb.d> f23337c;

        public a() {
            List<bb.c> n10;
            List<bb.d> n11;
            n10 = u.n(c.a.f5792a.a());
            this.f23336b = n10;
            n11 = u.n(new ua.b());
            this.f23337c = n11;
        }

        public final List<bb.c> a() {
            return this.f23336b;
        }

        public final List<bb.d> b() {
            return this.f23337c;
        }

        public final d c() {
            return this.f23335a;
        }

        public final void d(d dVar) {
            this.f23335a = dVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lua/c$b;", "Lta/k;", "Lua/c$a;", "Lua/c;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements k<a, c> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "payload", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @f(c = "io.ktor.client.features.json.JsonFeature$Feature$install$1", f = "JsonFeature.kt", l = {152}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements q<e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            final /* synthetic */ c W3;

            /* renamed from: y */
            int f23338y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, xb.d<? super a> dVar) {
                super(3, dVar);
                this.W3 = cVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f23338y;
                if (i10 == 0) {
                    t.b(obj);
                    e eVar = (e) this.U3;
                    Object obj2 = this.V3;
                    for (bb.c cVar : this.W3.c()) {
                        i.a((ya.c) eVar.b(), cVar);
                    }
                    bb.c d10 = bb.t.d((s) eVar.b());
                    if (d10 != null && this.W3.b(d10)) {
                        ((ya.c) eVar.b()).a().l(p.f5855a.g());
                        db.a c11 = (!hc.t.a(obj2, e0.f22152a) && !(obj2 instanceof ab.d)) ? this.W3.d().c(obj2, d10) : ab.d.f240a;
                        this.U3 = null;
                        this.f23338y = 1;
                        if (eVar.O0(c11, this) == c10) {
                            return c10;
                        }
                    }
                    return e0.f22152a;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    t.b(obj);
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                a aVar = new a(this.W3, dVar);
                aVar.U3 = eVar;
                aVar.V3 = obj;
                return aVar.B(e0.f22152a);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/d;", "Loa/b;", "<name for destructuring parameter 0>", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @f(c = "io.ktor.client.features.json.JsonFeature$Feature$install$2", f = "JsonFeature.kt", l = {161, 163}, m = "invokeSuspend")
        /* renamed from: ua.c$b$b */
        /* loaded from: classes.dex */
        public static final class C0404b extends l implements q<e<za.d, oa.b>, za.d, xb.d<? super e0>, Object> {
            Object U3;
            int V3;
            private /* synthetic */ Object W3;
            /* synthetic */ Object X3;
            final /* synthetic */ c Y3;

            /* renamed from: y */
            Object f23339y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0404b(c cVar, xb.d<? super C0404b> dVar) {
                super(3, dVar);
                this.Y3 = cVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                e eVar;
                oa.i iVar;
                d dVar;
                oa.i iVar2;
                bb.c c11;
                c10 = yb.d.c();
                int i10 = this.V3;
                if (i10 == 0) {
                    t.b(obj);
                    eVar = (e) this.W3;
                    za.d dVar2 = (za.d) this.X3;
                    iVar2 = dVar2.a();
                    Object b10 = dVar2.b();
                    if ((b10 instanceof h) && (c11 = bb.t.c(((oa.b) eVar.b()).g())) != null && this.Y3.b(c11)) {
                        d d10 = this.Y3.d();
                        this.W3 = eVar;
                        this.X3 = iVar2;
                        this.f23339y = d10;
                        this.U3 = iVar2;
                        this.V3 = 1;
                        obj = j.f((h) b10, this);
                        if (obj == c10) {
                            return c10;
                        }
                        dVar = d10;
                        iVar = iVar2;
                    }
                    return e0.f22152a;
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return e0.f22152a;
                } else {
                    iVar2 = (oa.i) this.U3;
                    dVar = (d) this.f23339y;
                    iVar = (oa.i) this.X3;
                    eVar = (e) this.W3;
                    t.b(obj);
                }
                za.d dVar3 = new za.d(iVar, dVar.a(iVar2, (z) obj));
                this.W3 = null;
                this.X3 = null;
                this.f23339y = null;
                this.U3 = null;
                this.V3 = 2;
                if (eVar.O0(dVar3, this) == c10) {
                    return c10;
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(e<za.d, oa.b> eVar, za.d dVar, xb.d<? super e0> dVar2) {
                C0404b c0404b = new C0404b(this.Y3, dVar2);
                c0404b.W3 = eVar;
                c0404b.X3 = dVar;
                return c0404b.B(e0.f22152a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(c cVar, na.a aVar) {
            hc.t.e(cVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.e(), new a(cVar, null));
            aVar.u().o(za.f.f26572i.c(), new C0404b(cVar, null));
        }

        /* renamed from: d */
        public c a(gc.l<? super a, e0> lVar) {
            List F0;
            hc.t.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            d c10 = aVar.c();
            if (c10 == null) {
                c10 = ua.a.a();
            }
            F0 = c0.F0(aVar.a());
            return new c(c10, F0, aVar.b());
        }

        @Override // ta.k
        public fb.a<c> getKey() {
            return c.f23331e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, List<bb.c> list, List<? extends bb.d> list2) {
        hc.t.e(dVar, "serializer");
        hc.t.e(list, "acceptContentTypes");
        hc.t.e(list2, "receiveContentTypeMatchers");
        this.f23332a = dVar;
        this.f23333b = list;
        this.f23334c = list2;
    }

    public final boolean b(bb.c cVar) {
        boolean z10;
        boolean z11;
        hc.t.e(cVar, "contentType");
        List<bb.c> list = this.f23333b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (bb.c cVar2 : list) {
                if (cVar.g(cVar2)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        List<bb.d> list2 = this.f23334c;
        if (!z10) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (bb.d dVar : list2) {
                    if (dVar.a(cVar)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            return z11;
        }
        return true;
    }

    public final List<bb.c> c() {
        return this.f23333b;
    }

    public final d d() {
        return this.f23332a;
    }
}
