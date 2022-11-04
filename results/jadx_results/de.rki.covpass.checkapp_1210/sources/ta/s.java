package ta;

import hc.k0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0012J@\u0010\t\u001a\u00020\b2.\u0010\u0007\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lta/s;", BuildConfig.FLAVOR, "Lkotlin/Function4;", "Lta/y;", "Loa/b;", "Lya/c;", "Lxb/d;", "block", "Ltb/e0;", "d", "(Lgc/r;)V", BuildConfig.FLAVOR, "<set-?>", "maxSendCount$delegate", "Lkc/d;", "c", "()I", "setMaxSendCount", "(I)V", "maxSendCount", "<init>", "a", "b", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private final kc.d f22108a;

    /* renamed from: b */
    private final List<gc.r<y, oa.b, ya.c, xb.d<? super oa.b>, Object>> f22109b;

    /* renamed from: d */
    static final /* synthetic */ oc.k<Object>[] f22106d = {k0.e(new hc.y(s.class, "maxSendCount", "getMaxSendCount()I", 0))};

    /* renamed from: c */
    public static final b f22105c = new b(null);

    /* renamed from: e */
    private static final fb.a<s> f22107e = new fb.a<>("HttpSend");

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lta/s$a;", "Lta/y;", "Lya/c;", "requestBuilder", "Loa/b;", "a", "(Lya/c;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "maxSendCount", "Lna/a;", "client", "<init>", "(ILna/a;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a implements y {

        /* renamed from: a */
        private final int f22110a;

        /* renamed from: b */
        private final na.a f22111b;

        /* renamed from: c */
        private int f22112c;

        /* renamed from: d */
        private oa.b f22113d;

        @zb.f(c = "io.ktor.client.features.HttpSend$DefaultSender", f = "HttpSend.kt", l = {128}, m = "execute")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: ta.s$a$a */
        /* loaded from: classes.dex */
        public static final class C0386a extends zb.d {
            int V3;

            /* renamed from: x */
            Object f22114x;

            /* renamed from: y */
            /* synthetic */ Object f22115y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0386a(xb.d<? super C0386a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.f22115y = obj;
                this.V3 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(int i10, na.a aVar) {
            hc.t.e(aVar, "client");
            this.f22110a = i10;
            this.f22111b = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
        @Override // ta.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(ya.c r6, xb.d<? super oa.b> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof ta.s.a.C0386a
                if (r0 == 0) goto L13
                r0 = r7
                ta.s$a$a r0 = (ta.s.a.C0386a) r0
                int r1 = r0.V3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.V3 = r1
                goto L18
            L13:
                ta.s$a$a r0 = new ta.s$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f22115y
                java.lang.Object r1 = yb.b.c()
                int r2 = r0.V3
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.f22114x
                ta.s$a r6 = (ta.s.a) r6
                tb.t.b(r7)
                goto L60
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                tb.t.b(r7)
                oa.b r7 = r5.f22113d
                if (r7 != 0) goto L3e
                goto L41
            L3e:
                kotlinx.coroutines.r0.e(r7, r3, r4, r3)
            L41:
                int r7 = r5.f22112c
                int r2 = r5.f22110a
                if (r7 >= r2) goto L7c
                int r7 = r7 + r4
                r5.f22112c = r7
                na.a r7 = r5.f22111b
                ya.h r7 = r7.z()
                java.lang.Object r2 = r6.d()
                r0.f22114x = r5
                r0.V3 = r4
                java.lang.Object r7 = r7.d(r6, r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r6 = r5
            L60:
                boolean r0 = r7 instanceof oa.b
                if (r0 == 0) goto L67
                r3 = r7
                oa.b r3 = (oa.b) r3
            L67:
                if (r3 == 0) goto L6c
                r6.f22113d = r3
                return r3
            L6c:
                java.lang.String r6 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                java.lang.String r6 = hc.t.l(r6, r7)
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            L7c:
                ta.x r6 = new ta.x
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f22110a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ta.s.a.a(ya.c, xb.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lta/s$b;", "Lta/k;", "Lta/s;", "Lkotlin/Function1;", "Ltb/e0;", "block", "d", "feature", "Lna/a;", "scope", "c", "Lfb/a;", "key", "Lfb/a;", "getKey", "()Lfb/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b implements k<s, s> {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Ljb/e;", BuildConfig.FLAVOR, "Lya/c;", "content", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @zb.f(c = "io.ktor.client.features.HttpSend$Feature$install$1", f = "HttpSend.kt", l = {89, 96, 105}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zb.l implements gc.q<jb.e<Object, ya.c>, Object, xb.d<? super e0>, Object> {
            Object U3;
            int V3;
            int W3;
            private /* synthetic */ Object X3;
            /* synthetic */ Object Y3;
            final /* synthetic */ s Z3;

            /* renamed from: a4 */
            final /* synthetic */ na.a f22116a4;

            /* renamed from: y */
            Object f22117y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, na.a aVar, xb.d<? super a> dVar) {
                super(3, dVar);
                this.Z3 = sVar;
                this.f22116a4 = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b6 -> B:24:0x00b9). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c2 -> B:28:0x00c3). Please submit an issue!!! */
            @Override // zb.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object B(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ta.s.b.a.B(java.lang.Object):java.lang.Object");
            }

            /* renamed from: d0 */
            public final Object s(jb.e<Object, ya.c> eVar, Object obj, xb.d<? super e0> dVar) {
                a aVar = new a(this.Z3, this.f22116a4, dVar);
                aVar.X3 = eVar;
                aVar.Y3 = obj;
                return aVar.B(e0.f22152a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(s sVar, na.a aVar) {
            hc.t.e(sVar, "feature");
            hc.t.e(aVar, "scope");
            aVar.s().o(ya.f.f25994i.c(), new a(sVar, aVar, null));
        }

        /* renamed from: d */
        public s a(gc.l<? super s, e0> lVar) {
            hc.t.e(lVar, "block");
            s sVar = new s(0, 1, null);
            lVar.invoke(sVar);
            return sVar;
        }

        @Override // ta.k
        public fb.a<s> getKey() {
            return s.f22107e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c implements kc.d<Object, Integer> {

        /* renamed from: a */
        private Integer f22118a;

        /* renamed from: b */
        final /* synthetic */ Object f22119b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj) {
            this.f22119b = obj;
            this.f22118a = obj;
        }

        @Override // kc.d, kc.c
        public Integer a(Object obj, oc.k<?> kVar) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            return this.f22118a;
        }

        @Override // kc.d
        public void b(Object obj, oc.k<?> kVar, Integer num) {
            hc.t.e(obj, "thisRef");
            hc.t.e(kVar, "property");
            this.f22118a = num;
        }
    }

    public s() {
        this(0, 1, null);
    }

    public s(int i10) {
        this.f22108a = new c(Integer.valueOf(i10));
        this.f22109b = ab.g.a();
        io.ktor.utils.io.s.a(this);
    }

    public /* synthetic */ s(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 20 : i10);
    }

    public final int c() {
        return ((Number) this.f22108a.a(this, f22106d[0])).intValue();
    }

    public final void d(gc.r<? super y, ? super oa.b, ? super ya.c, ? super xb.d<? super oa.b>, ? extends Object> rVar) {
        hc.t.e(rVar, "block");
        this.f22109b.add(rVar);
    }
}
