package ta;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"Lta/a;", BuildConfig.FLAVOR, "Lna/a;", "scope", "Ltb/e0;", "c", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final C0375a f22029a = new C0375a(null);

    /* renamed from: b */
    private static final fb.a<a> f22030b = new fb.a<>("BodyProgress");

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lta/a$a;", "Lta/k;", "Ltb/e0;", "Lta/a;", "Lkotlin/Function1;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: ta.a$a */
    /* loaded from: classes.dex */
    public static final class C0375a implements k<e0, a> {
        private C0375a() {
        }

        public /* synthetic */ C0375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(a aVar, na.a aVar2) {
            hc.t.e(aVar, "feature");
            hc.t.e(aVar2, "scope");
            aVar.c(aVar2);
        }

        /* renamed from: d */
        public a a(gc.l<? super e0, e0> lVar) {
            hc.t.e(lVar, "block");
            return new a();
        }

        @Override // ta.k
        public fb.a<a> getKey() {
            return a.f22030b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "content", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.features.BodyProgress$handle$1", f = "BodyProgress.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        /* synthetic */ Object V3;

        /* renamed from: y */
        int f22031y;

        b(xb.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            fb.a aVar;
            c10 = yb.d.c();
            int i10 = this.f22031y;
            if (i10 == 0) {
                tb.t.b(obj);
                jb.e eVar = (jb.e) this.U3;
                Object obj2 = this.V3;
                fb.b c11 = ((ya.c) eVar.b()).c();
                aVar = ta.b.f22038a;
                gc.q qVar = (gc.q) c11.e(aVar);
                if (qVar == null) {
                    return e0.f22152a;
                }
                pa.a aVar2 = new pa.a((db.a) obj2, ((ya.c) eVar.b()).f(), qVar);
                this.U3 = null;
                this.f22031y = 1;
                if (eVar.O0(aVar2, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
            b bVar = new b(dVar);
            bVar.U3 = eVar;
            bVar.V3 = obj;
            return bVar.B(e0.f22152a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", "Lza/c;", "Loa/b;", "response", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "io.ktor.client.features.BodyProgress$handle$2", f = "BodyProgress.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements gc.q<jb.e<za.c, oa.b>, za.c, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f22032y;

        c(xb.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            fb.a aVar;
            c10 = yb.d.c();
            int i10 = this.f22032y;
            if (i10 == 0) {
                tb.t.b(obj);
                jb.e eVar = (jb.e) this.U3;
                fb.b c12 = ((oa.b) eVar.b()).f().c1();
                aVar = ta.b.f22039b;
                gc.q qVar = (gc.q) c12.e(aVar);
                if (qVar == null) {
                    return e0.f22152a;
                }
                oa.b c11 = ta.b.c((oa.b) eVar.b(), qVar);
                ((oa.b) eVar.b()).n(c11.g());
                ((oa.b) eVar.b()).m(c11.f());
                za.c g10 = ((oa.b) eVar.b()).g();
                this.f22032y = 1;
                if (eVar.O0(g10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object s(jb.e<za.c, oa.b> eVar, za.c cVar, xb.d<? super e0> dVar) {
            c cVar2 = new c(dVar);
            cVar2.U3 = eVar;
            return cVar2.B(e0.f22152a);
        }
    }

    public final void c(na.a aVar) {
        jb.h hVar = new jb.h("ObservableContent");
        aVar.s().m(ya.f.f25994i.b(), hVar);
        aVar.s().o(hVar, new b(null));
        aVar.r().o(za.b.f26565i.a(), new c(null));
    }
}
