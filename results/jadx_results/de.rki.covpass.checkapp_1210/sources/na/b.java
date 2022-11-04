package na;

import fb.u;
import gc.l;
import hc.k0;
import hc.t;
import hc.v;
import hc.y;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import oc.k;
import org.conscrypt.BuildConfig;
import qa.g;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b1\u00102J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004JD\u0010\r\u001a\u00020\u0005\"\b\b\u0001\u0010\b*\u00020\u0003\"\b\b\u0002\u0010\t*\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004J\"\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0010J\u0019\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002RC\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010$\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010(\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R+\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R+\u00100\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u00063"}, d2 = {"Lna/b;", "Lqa/g;", "T", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Ltb/e0;", "block", "b", "TBuilder", "TFeature", "Lta/k;", "feature", "configure", "j", BuildConfig.FLAVOR, "key", "Lna/a;", "h", "client", "i", "other", "l", "<set-?>", "engineConfig$delegate", "Lkc/d;", "d", "()Lgc/l;", "m", "(Lgc/l;)V", "engineConfig", BuildConfig.FLAVOR, "followRedirects$delegate", "f", "()Z", "o", "(Z)V", "followRedirects", "useDefaultTransformers$delegate", "g", "p", "useDefaultTransformers", "expectSuccess$delegate", "e", "n", "expectSuccess", "developmentMode$delegate", "c", "setDevelopmentMode", "developmentMode", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b<T extends qa.g> {

    /* renamed from: i */
    static final /* synthetic */ k<Object>[] f16914i = {k0.e(new y(b.class, "engineConfig", "getEngineConfig$ktor_client_core()Lkotlin/jvm/functions/Function1;", 0)), k0.e(new y(b.class, "followRedirects", "getFollowRedirects()Z", 0)), k0.e(new y(b.class, "useDefaultTransformers", "getUseDefaultTransformers()Z", 0)), k0.e(new y(b.class, "expectSuccess", "getExpectSuccess()Z", 0)), k0.e(new y(b.class, "developmentMode", "getDevelopmentMode()Z", 0))};

    /* renamed from: e */
    private final kc.d f16919e;

    /* renamed from: f */
    private final kc.d f16920f;

    /* renamed from: g */
    private final kc.d f16921g;

    /* renamed from: a */
    private final Map<fb.a<?>, l<na.a, e0>> f16915a = ab.g.b();

    /* renamed from: b */
    private final Map<fb.a<?>, l<Object, e0>> f16916b = ab.g.b();

    /* renamed from: c */
    private final Map<String, l<na.a, e0>> f16917c = ab.g.b();

    /* renamed from: d */
    private final kc.d f16918d = new f(C0261b.f16925c);

    /* renamed from: h */
    private final kc.d f16922h = new j(Boolean.valueOf(u.f10140a.b()));

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqa/g;", "T", "Ltb/e0;", "b", "(Lqa/g;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<T, e0> {

        /* renamed from: c */
        final /* synthetic */ l<T, e0> f16923c;

        /* renamed from: d */
        final /* synthetic */ l<T, e0> f16924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super T, e0> lVar, l<? super T, e0> lVar2) {
            super(1);
            this.f16923c = lVar;
            this.f16924d = lVar2;
        }

        public final void b(T t10) {
            t.e(t10, "$this$null");
            this.f16923c.invoke(t10);
            this.f16924d.invoke(t10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b((qa.g) obj);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqa/g;", "T", "Ltb/e0;", "b", "(Lqa/g;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: na.b$b */
    /* loaded from: classes.dex */
    public static final class C0261b extends v implements l<T, e0> {

        /* renamed from: c */
        public static final C0261b f16925c = new C0261b();

        C0261b() {
            super(1);
        }

        public final void b(T t10) {
            t.e(t10, "$this$shared");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b((qa.g) obj);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {BuildConfig.FLAVOR, "TBuilder", "TFeature", "Lqa/g;", "T", "Ltb/e0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements l {

        /* renamed from: c */
        public static final c f16926c = new c();

        c() {
            super(1);
        }

        public final void b(Object obj) {
            t.e(obj, "$this$null");
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {BuildConfig.FLAVOR, "TBuilder", "TFeature", "Lqa/g;", "T", "Ltb/e0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends v implements l<Object, e0> {

        /* renamed from: c */
        final /* synthetic */ l<Object, e0> f16927c;

        /* renamed from: d */
        final /* synthetic */ l<TBuilder, e0> f16928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: gc.l<? super TBuilder, tb.e0> */
        d(l<Object, e0> lVar, l<? super TBuilder, e0> lVar2) {
            super(1);
            this.f16927c = lVar;
            this.f16928d = lVar2;
        }

        public final void b(Object obj) {
            t.e(obj, "$this$null");
            l<Object, e0> lVar = this.f16927c;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.f16928d.invoke(obj);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b(obj);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {BuildConfig.FLAVOR, "TBuilder", "TFeature", "Lqa/g;", "T", "Lna/a;", "scope", "Ltb/e0;", "b", "(Lna/a;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e extends v implements l<na.a, e0> {

        /* renamed from: c */
        final /* synthetic */ ta.k<TBuilder, TFeature> f16929c;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {BuildConfig.FLAVOR, "TBuilder", "TFeature", "Lqa/g;", "T", "Lfb/b;", "b", "()Lfb/b;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a extends v implements gc.a<fb.b> {

            /* renamed from: c */
            public static final a f16930c = new a();

            a() {
                super(0);
            }

            /* renamed from: b */
            public final fb.b invoke() {
                return fb.d.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: ta.k<? extends TBuilder, TFeature> */
        /* JADX WARN: Unknown type variable: TFeature in type: ta.k<? extends TBuilder, TFeature> */
        e(ta.k<? extends TBuilder, TFeature> kVar) {
            super(1);
            this.f16929c = kVar;
        }

        public final void b(na.a aVar) {
            t.e(aVar, "scope");
            Object obj = ((b) aVar.j()).f16916b.get(this.f16929c.getKey());
            t.b(obj);
            Object a10 = this.f16929c.a((l) obj);
            this.f16929c.b(a10, aVar);
            ((fb.b) aVar.c1().d(ta.l.c(), a.f16930c)).a(this.f16929c.getKey(), a10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.a aVar) {
            b(aVar);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f implements kc.d<Object, l<? super T, ? extends e0>> {

        /* renamed from: a */
        private l<? super T, ? extends e0> f16931a;

        /* renamed from: b */
        final /* synthetic */ Object f16932b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj) {
            this.f16932b = obj;
            this.f16931a = obj;
        }

        @Override // kc.d, kc.c
        public l<? super T, ? extends e0> a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f16931a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, l<? super T, ? extends e0> lVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f16931a = lVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class g implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f16933a;

        /* renamed from: b */
        final /* synthetic */ Object f16934b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(Object obj) {
            this.f16934b = obj;
            this.f16933a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f16933a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f16933a = bool;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class h implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f16935a;

        /* renamed from: b */
        final /* synthetic */ Object f16936b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Object obj) {
            this.f16936b = obj;
            this.f16935a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f16935a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f16935a = bool;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class i implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f16937a;

        /* renamed from: b */
        final /* synthetic */ Object f16938b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj) {
            this.f16938b = obj;
            this.f16937a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f16937a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f16937a = bool;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"nb/b", "Lkc/d;", BuildConfig.FLAVOR, "thisRef", "Loc/k;", "property", "a", "(Ljava/lang/Object;Loc/k;)Ljava/lang/Object;", "value", "Ltb/e0;", "b", "(Ljava/lang/Object;Loc/k;Ljava/lang/Object;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class j implements kc.d<Object, Boolean> {

        /* renamed from: a */
        private Boolean f16939a;

        /* renamed from: b */
        final /* synthetic */ Object f16940b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Object obj) {
            this.f16940b = obj;
            this.f16939a = obj;
        }

        @Override // kc.d, kc.c
        public Boolean a(Object obj, k<?> kVar) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            return this.f16939a;
        }

        @Override // kc.d
        public void b(Object obj, k<?> kVar, Boolean bool) {
            t.e(obj, "thisRef");
            t.e(kVar, "property");
            this.f16939a = bool;
        }
    }

    public b() {
        Boolean bool = Boolean.TRUE;
        this.f16919e = new g(bool);
        this.f16920f = new h(bool);
        this.f16921g = new i(bool);
    }

    public static /* synthetic */ void k(b bVar, ta.k kVar, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = c.f16926c;
        }
        bVar.j(kVar, lVar);
    }

    public final void b(l<? super T, e0> lVar) {
        t.e(lVar, "block");
        m(new a(d(), lVar));
    }

    public final boolean c() {
        return ((Boolean) this.f16922h.a(this, f16914i[4])).booleanValue();
    }

    public final l<T, e0> d() {
        return (l) this.f16918d.a(this, f16914i[0]);
    }

    public final boolean e() {
        return ((Boolean) this.f16921g.a(this, f16914i[3])).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.f16919e.a(this, f16914i[1])).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.f16920f.a(this, f16914i[2])).booleanValue();
    }

    public final void h(String str, l<? super na.a, e0> lVar) {
        t.e(str, "key");
        t.e(lVar, "block");
        this.f16917c.put(str, lVar);
    }

    public final void i(na.a aVar) {
        t.e(aVar, "client");
        Iterator<T> it = this.f16915a.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(aVar);
        }
        Iterator<T> it2 = this.f16917c.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(aVar);
        }
    }

    public final <TBuilder, TFeature> void j(ta.k<? extends TBuilder, TFeature> kVar, l<? super TBuilder, e0> lVar) {
        t.e(kVar, "feature");
        t.e(lVar, "configure");
        this.f16916b.put(kVar.getKey(), new d(this.f16916b.get(kVar.getKey()), lVar));
        if (this.f16915a.containsKey(kVar.getKey())) {
            return;
        }
        this.f16915a.put(kVar.getKey(), new e(kVar));
    }

    public final void l(b<? extends T> bVar) {
        t.e(bVar, "other");
        o(bVar.f());
        p(bVar.g());
        n(bVar.e());
        this.f16915a.putAll(bVar.f16915a);
        this.f16916b.putAll(bVar.f16916b);
        this.f16917c.putAll(bVar.f16917c);
    }

    public final void m(l<? super T, e0> lVar) {
        t.e(lVar, "<set-?>");
        this.f16918d.b(this, f16914i[0], lVar);
    }

    public final void n(boolean z10) {
        this.f16921g.b(this, f16914i[3], Boolean.valueOf(z10));
    }

    public final void o(boolean z10) {
        this.f16919e.b(this, f16914i[1], Boolean.valueOf(z10));
    }

    public final void p(boolean z10) {
        this.f16920f.b(this, f16914i[2], Boolean.valueOf(z10));
    }
}
