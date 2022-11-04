package ta;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e2;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lta/p;", BuildConfig.FLAVOR, "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static final a f22100a = new a(null);

    /* renamed from: b */
    private static final fb.a<p> f22101b = new fb.a<>("RequestLifecycle");

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lta/p$a;", "Lta/k;", "Ltb/e0;", "Lta/p;", "Lkotlin/Function1;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements k<e0, p> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpRequestLifecycle$Feature$install$1", f = "HttpRequestLifecycle.kt", l = {37}, m = "invokeSuspend")
        /* renamed from: ta.p$a$a */
        /* loaded from: classes.dex */
        public static final class C0385a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            private /* synthetic */ Object U3;
            final /* synthetic */ na.a V3;

            /* renamed from: y */
            int f22102y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0385a(na.a aVar, xb.d<? super C0385a> dVar) {
                super(3, dVar);
                this.V3 = aVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                Throwable th2;
                b0 b0Var;
                c10 = yb.d.c();
                int i10 = this.f22102y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    jb.e eVar = (jb.e) this.U3;
                    b0 a10 = e2.a(((ya.c) eVar.b()).f());
                    io.ktor.utils.io.s.a(a10);
                    g.b i11 = this.V3.h().i(a2.W0);
                    hc.t.b(i11);
                    q.b(a10, (a2) i11);
                    try {
                        ((ya.c) eVar.b()).j(a10);
                        this.U3 = a10;
                        this.f22102y = 1;
                        if (eVar.f0(this) == c10) {
                            return c10;
                        }
                        b0Var = a10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        b0Var = a10;
                        b0Var.n(th2);
                        throw th2;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    b0Var = (b0) this.U3;
                    try {
                        tb.t.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            b0Var.n(th2);
                            throw th2;
                        } catch (Throwable th5) {
                            b0Var.V();
                            throw th5;
                        }
                    }
                }
                b0Var.V();
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                C0385a c0385a = new C0385a(this.V3, dVar);
                c0385a.U3 = eVar;
                return c0385a.B(e0.f22152a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(p pVar, na.a aVar) {
            hc.t.e(pVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.a(), new C0385a(aVar, null));
        }

        /* renamed from: d */
        public p a(gc.l<? super e0, e0> lVar) {
            hc.t.e(lVar, "block");
            return new p();
        }

        @Override // ta.k
        public fb.a<p> getKey() {
            return p.f22101b;
        }
    }
}
