package ta;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000f"}, d2 = {"Lta/n;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "c", "()Z", "setCheckHttpMethod", "(Z)V", "checkHttpMethod", "b", "setAllowHttpsDowngrade", "allowHttpsDowngrade", "<init>", "()V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public static final a f22092a = new a(null);

    /* renamed from: b */
    private static final fb.a<n> f22093b = new fb.a<>("HttpRedirect");
    private volatile /* synthetic */ int _checkHttpMethod = 1;
    private volatile /* synthetic */ int _allowHttpsDowngrade = 0;

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\n\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lta/n$a;", "Lta/k;", "Lta/n;", "Lta/y;", "Lya/c;", "context", "Loa/b;", "origin", BuildConfig.FLAVOR, "allowHttpsDowngrade", "d", "(Lta/y;Lya/c;Loa/b;ZLxb/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ltb/e0;", "block", "f", "feature", "Lna/a;", "scope", "e", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements k<n, n> {

        @zb.f(c = "io.ktor.client.features.HttpRedirect$Feature", f = "HttpRedirect.kt", l = {95}, m = "handleCall")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: ta.n$a$a */
        /* loaded from: classes.dex */
        public static final class C0384a extends zb.d {
            Object U3;
            Object V3;
            Object W3;
            Object X3;
            boolean Y3;
            /* synthetic */ Object Z3;

            /* renamed from: b4 */
            int f22095b4;

            /* renamed from: x */
            Object f22096x;

            /* renamed from: y */
            Object f22097y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0384a(xb.d<? super C0384a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.Z3 = obj;
                this.f22095b4 |= Integer.MIN_VALUE;
                return a.this.d(null, null, null, false, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lta/y;", "Loa/b;", "origin", "Lya/c;", "context", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpRedirect$Feature$install$1", f = "HttpRedirect.kt", l = {58}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zb.l implements gc.r<y, oa.b, ya.c, xb.d<? super oa.b>, Object> {
            private /* synthetic */ Object U3;
            /* synthetic */ Object V3;
            /* synthetic */ Object W3;
            final /* synthetic */ n X3;

            /* renamed from: y */
            int f22098y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n nVar, xb.d<? super b> dVar) {
                super(4, dVar);
                this.X3 = nVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                Set set;
                c10 = yb.d.c();
                int i10 = this.f22098y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    y yVar = (y) this.U3;
                    oa.b bVar = (oa.b) this.V3;
                    ya.c cVar = (ya.c) this.W3;
                    if (this.X3.c()) {
                        set = o.f22099a;
                        if (!set.contains(bVar.f().R0())) {
                            return bVar;
                        }
                    }
                    a aVar = n.f22092a;
                    boolean b10 = this.X3.b();
                    this.U3 = null;
                    this.V3 = null;
                    this.f22098y = 1;
                    obj = aVar.d(yVar, cVar, bVar, b10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
                return obj;
            }

            /* renamed from: d0 */
            public final Object M(y yVar, oa.b bVar, ya.c cVar, xb.d<? super oa.b> dVar) {
                b bVar2 = new b(this.X3, dVar);
                bVar2.U3 = yVar;
                bVar2.V3 = bVar;
                bVar2.W3 = cVar;
                return bVar2.B(e0.f22152a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, ya.c] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x011d -> B:35:0x0123). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object d(ta.y r11, ya.c r12, oa.b r13, boolean r14, xb.d<? super oa.b> r15) {
            /*
                Method dump skipped, instructions count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta.n.a.d(ta.y, ya.c, oa.b, boolean, xb.d):java.lang.Object");
        }

        /* renamed from: e */
        public void b(n nVar, na.a aVar) {
            hc.t.e(nVar, "feature");
            hc.t.e(aVar, "scope");
            ((s) l.b(aVar, s.f22105c)).d(new b(nVar, null));
        }

        /* renamed from: f */
        public n a(gc.l<? super n, e0> lVar) {
            hc.t.e(lVar, "block");
            n nVar = new n();
            lVar.invoke(nVar);
            return nVar;
        }

        @Override // ta.k
        public fb.a<n> getKey() {
            return n.f22093b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean b() {
        return this._allowHttpsDowngrade;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean c() {
        return this._checkHttpMethod;
    }
}
