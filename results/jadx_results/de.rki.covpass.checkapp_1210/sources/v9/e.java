package v9;

import android.util.Base64;
import gc.p;
import hc.k0;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.i;
import org.conscrypt.BuildConfig;
import s4.v0;
import s4.x0;
import tb.e0;
import tb.t;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lv9/e;", BuildConfig.FLAVOR, "Ltb/e0;", "h", "(Lxb/d;)Ljava/lang/Object;", "g", "i", "f", "j", "Ls4/v0;", "j$/time/Instant", "lastEuRulesUpdate", "Ls4/v0;", "c", "()Ls4/v0;", "lastDomesticRulesUpdate", "b", "lastValueSetsUpdate", "d", "lastCountryListUpdate", "a", BuildConfig.FLAVOR, "localDatabaseVersion", "e", "Lv9/a;", "store", "<init>", "(Lv9/a;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final v0<Instant> f23936a;

    /* renamed from: b */
    private final v0<Instant> f23937b;

    /* renamed from: c */
    private final v0<Instant> f23938c;

    /* renamed from: d */
    private final v0<Instant> f23939d;

    /* renamed from: e */
    private final v0<Instant> f23940e;

    /* renamed from: f */
    private final v0<Integer> f23941f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lv9/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "CURRENT_LOCAL_DATABASE_VERSION", "I", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23942y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23942y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23942y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((b) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            b bVar = new b(this.V3, this.W3, dVar);
            bVar.U3 = obj;
            return bVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23943y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23943y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23943y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((c) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(this.V3, this.W3, dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23944y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23944y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23944y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((d) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            d dVar2 = new d(this.V3, this.W3, dVar);
            dVar2.U3 = obj;
            return dVar2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: v9.e$e */
    /* loaded from: classes.dex */
    public static final class C0424e extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23945y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0424e(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23945y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23945y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((C0424e) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            C0424e c0424e = new C0424e(this.V3, this.W3, dVar);
            c0424e.U3 = obj;
            return c0424e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23946y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23946y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Instant instant, xb.d<? super e0> dVar) {
            return ((f) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            f fVar = new f(this.V3, this.W3, dVar);
            fVar.U3 = obj;
            return fVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends l implements p<Integer, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23947y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23947y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Integer.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23947y = 1;
                if (v0.a.a(v0Var, encodeToString, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(Integer num, xb.d<? super e0> dVar) {
            return ((g) j(num, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            g gVar = new g(this.V3, this.W3, dVar);
            gVar.U3 = obj;
            return gVar;
        }
    }

    public e(v9.a aVar) {
        hc.t.e(aVar, "store");
        Object a10 = v9.b.Companion.a();
        v0<String> a11 = aVar.b().a("last_rules_update", BuildConfig.FLAVOR);
        boolean z10 = true;
        try {
            if (!(a11.getValue().length() == 0)) {
                gf.b a12 = aVar.a();
                byte[] decode = Base64.decode(a11.getValue(), 0);
                hc.t.d(decode, "decode(flow.value, Base64.DEFAULT)");
                a10 = a12.e(SerializersKt.serializer(a12.a(), k0.j(Instant.class)), decode);
            }
        } catch (i unused) {
        }
        this.f23936a = x0.a(a10, new b(a11, aVar, null));
        Object a13 = v9.b.Companion.a();
        v0<String> a14 = aVar.b().a("last_domestic_rules_update", BuildConfig.FLAVOR);
        try {
            if (!(a14.getValue().length() == 0)) {
                gf.b a15 = aVar.a();
                byte[] decode2 = Base64.decode(a14.getValue(), 0);
                hc.t.d(decode2, "decode(flow.value, Base64.DEFAULT)");
                a13 = a15.e(SerializersKt.serializer(a15.a(), k0.j(Instant.class)), decode2);
            }
        } catch (i unused2) {
        }
        this.f23937b = x0.a(a13, new c(a14, aVar, null));
        Object a16 = v9.b.Companion.a();
        v0<String> a17 = aVar.b().a("last_value_sets_update", BuildConfig.FLAVOR);
        try {
            if (!(a17.getValue().length() == 0)) {
                gf.b a18 = aVar.a();
                byte[] decode3 = Base64.decode(a17.getValue(), 0);
                hc.t.d(decode3, "decode(flow.value, Base64.DEFAULT)");
                a16 = a18.e(SerializersKt.serializer(a18.a(), k0.j(Instant.class)), decode3);
            }
        } catch (i unused3) {
        }
        this.f23938c = x0.a(a16, new d(a17, aVar, null));
        Object a19 = v9.b.Companion.a();
        v0<String> a20 = aVar.b().a("last_country_list_update", BuildConfig.FLAVOR);
        try {
            if (!(a20.getValue().length() == 0)) {
                gf.b a21 = aVar.a();
                byte[] decode4 = Base64.decode(a20.getValue(), 0);
                hc.t.d(decode4, "decode(flow.value, Base64.DEFAULT)");
                a19 = a21.e(SerializersKt.serializer(a21.a(), k0.j(Instant.class)), decode4);
            }
        } catch (i unused4) {
        }
        this.f23939d = x0.a(a19, new C0424e(a20, aVar, null));
        Object a22 = v9.b.Companion.a();
        v0<String> a23 = aVar.b().a("last_booster_rules_update", BuildConfig.FLAVOR);
        try {
            if (!(a23.getValue().length() == 0)) {
                gf.b a24 = aVar.a();
                byte[] decode5 = Base64.decode(a23.getValue(), 0);
                hc.t.d(decode5, "decode(flow.value, Base64.DEFAULT)");
                a22 = a24.e(SerializersKt.serializer(a24.a(), k0.j(Instant.class)), decode5);
            }
        } catch (i unused5) {
        }
        this.f23940e = x0.a(a22, new f(a23, aVar, null));
        Object obj = 0;
        v0<String> a25 = aVar.b().a("local_database_update_version", BuildConfig.FLAVOR);
        try {
            if (a25.getValue().length() != 0) {
                z10 = false;
            }
            if (!z10) {
                gf.b a26 = aVar.a();
                byte[] decode6 = Base64.decode(a25.getValue(), 0);
                hc.t.d(decode6, "decode(flow.value, Base64.DEFAULT)");
                obj = a26.e(SerializersKt.serializer(a26.a(), k0.j(Integer.TYPE)), decode6);
            }
        } catch (i unused6) {
        }
        this.f23941f = x0.a(obj, new g(a25, aVar, null));
    }

    public final v0<Instant> a() {
        return this.f23939d;
    }

    public final v0<Instant> b() {
        return this.f23937b;
    }

    public final v0<Instant> c() {
        return this.f23936a;
    }

    public final v0<Instant> d() {
        return this.f23938c;
    }

    public final v0<Integer> e() {
        return this.f23941f;
    }

    public final Object f(xb.d<? super e0> dVar) {
        Object c10;
        v0<Instant> v0Var = this.f23939d;
        Instant now = Instant.now();
        hc.t.d(now, "now()");
        Object a10 = v0.a.a(v0Var, now, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }

    public final Object g(xb.d<? super e0> dVar) {
        Object c10;
        v0<Instant> v0Var = this.f23937b;
        Instant now = Instant.now();
        hc.t.d(now, "now()");
        Object a10 = v0.a.a(v0Var, now, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }

    public final Object h(xb.d<? super e0> dVar) {
        Object c10;
        v0<Instant> v0Var = this.f23936a;
        Instant now = Instant.now();
        hc.t.d(now, "now()");
        Object a10 = v0.a.a(v0Var, now, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }

    public final Object i(xb.d<? super e0> dVar) {
        Object c10;
        v0<Instant> v0Var = this.f23938c;
        Instant now = Instant.now();
        hc.t.d(now, "now()");
        Object a10 = v0.a.a(v0Var, now, false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }

    public final Object j(xb.d<? super e0> dVar) {
        Object c10;
        Object a10 = v0.a.a(this.f23941f, zb.b.c(5), false, dVar, 2, null);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }
}
