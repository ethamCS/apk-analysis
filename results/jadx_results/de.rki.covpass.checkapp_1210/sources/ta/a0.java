package ta;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\t\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lta/a0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "agent", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b */
    public static final b f22033b = new b(null);

    /* renamed from: c */
    private static final fb.a<a0> f22034c = new fb.a<>("UserAgent");

    /* renamed from: a */
    private final String f22035a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lta/a0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "agent", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "<init>", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f22036a;

        public a() {
            this(null, 1, null);
        }

        public a(String str) {
            hc.t.e(str, "agent");
            this.f22036a = str;
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "Ktor http-client" : str);
        }

        public final String a() {
            return this.f22036a;
        }

        public final void b(String str) {
            hc.t.e(str, "<set-?>");
            this.f22036a = str;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lta/a0$b;", "Lta/k;", "Lta/a0$a;", "Lta/a0;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements k<a, a0> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.UserAgent$Feature$install$1", f = "UserAgent.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ a0 V3;

            /* renamed from: y */
            int f22037y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, xb.d<? super a> dVar) {
                super(3, dVar);
                this.V3 = a0Var;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                yb.d.c();
                if (this.f22037y == 0) {
                    tb.t.b(obj);
                    ya.i.b((ya.c) ((jb.e) this.U3).b(), bb.p.f5855a.l(), this.V3.b());
                    return e0.f22152a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                a aVar = new a(this.V3, dVar);
                aVar.U3 = eVar;
                return aVar.B(e0.f22152a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(a0 a0Var, na.a aVar) {
            hc.t.e(a0Var, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.d(), new a(a0Var, null));
        }

        /* renamed from: d */
        public a0 a(gc.l<? super a, e0> lVar) {
            hc.t.e(lVar, "block");
            a aVar = new a(null, 1, null);
            lVar.invoke(aVar);
            return new a0(aVar.a());
        }

        @Override // ta.k
        public fb.a<a0> getKey() {
            return a0.f22034c;
        }
    }

    public a0(String str) {
        hc.t.e(str, "agent");
        this.f22035a = str;
    }

    public final String b() {
        return this.f22035a;
    }
}
