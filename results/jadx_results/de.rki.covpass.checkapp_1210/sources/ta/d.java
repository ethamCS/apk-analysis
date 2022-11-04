package ta;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lta/d;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lya/c;", "Ltb/e0;", "builder", "<init>", "(Lgc/l;)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b */
    public static final a f22041b = new a(null);

    /* renamed from: c */
    private static final fb.a<d> f22042c = new fb.a<>("DefaultRequest");

    /* renamed from: a */
    private final gc.l<ya.c, e0> f22043a;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lta/d$a;", "Lta/k;", "Lya/c;", "Lta/d;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements k<ya.c, d> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.DefaultRequest$Feature$install$1", f = "DefaultRequest.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ta.d$a$a */
        /* loaded from: classes.dex */
        public static final class C0376a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ d V3;

            /* renamed from: y */
            int f22044y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0376a(d dVar, xb.d<? super C0376a> dVar2) {
                super(3, dVar2);
                this.V3 = dVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f22044y == 0) {
                    tb.t.b(obj);
                    this.V3.f22043a.invoke(((jb.e) this.U3).b());
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                C0376a c0376a = new C0376a(this.V3, dVar);
                c0376a.U3 = eVar;
                return c0376a.B(e0.f22152a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(d dVar, na.a aVar) {
            hc.t.e(dVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.a(), new C0376a(dVar, null));
        }

        /* renamed from: d */
        public d a(gc.l<? super ya.c, e0> lVar) {
            hc.t.e(lVar, "block");
            return new d(lVar);
        }

        @Override // ta.k
        public fb.a<d> getKey() {
            return d.f22042c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(gc.l<? super ya.c, e0> lVar) {
        hc.t.e(lVar, "builder");
        this.f22043a = lVar;
    }
}
