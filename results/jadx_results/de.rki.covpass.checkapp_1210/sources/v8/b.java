package v8;

import android.util.Base64;
import gc.p;
import hc.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.i;
import org.conscrypt.BuildConfig;
import s4.v0;
import s4.x0;
import tb.e0;
import tb.t;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lv8/b;", BuildConfig.FLAVOR, "Ls4/v0;", BuildConfig.FLAVOR, "checkContextNotificationVersionShown", "Ls4/v0;", "a", "()Ls4/v0;", BuildConfig.FLAVOR, "isDomesticRulesOn", "b", "isExpertModeOn", "c", "Lv9/a;", "store", "<init>", "(Lv9/a;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final v0<Integer> f23915a;

    /* renamed from: b */
    private final v0<Boolean> f23916b;

    /* renamed from: c */
    private final v0<Boolean> f23917c;

    /* renamed from: d */
    private final v0<Boolean> f23918d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lv8/b$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "CURRENT_CHECK_CONTEXT_NOTIFICATION_VERSION", "I", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: v8.b$b */
    /* loaded from: classes.dex */
    public static final class C0422b extends l implements p<Integer, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0422b(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23919y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Integer.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23919y = 1;
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
            return ((C0422b) j(num, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            C0422b c0422b = new C0422b(this.V3, this.W3, dVar);
            c0422b.U3 = obj;
            return c0422b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<Boolean, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23920y;

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
            int i10 = this.f23920y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Boolean.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23920y = 1;
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
        public final Object u(Boolean bool, xb.d<? super e0> dVar) {
            return ((c) j(bool, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(this.V3, this.W3, dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<Boolean, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23921y;

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
            int i10 = this.f23921y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Boolean.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23921y = 1;
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
        public final Object u(Boolean bool, xb.d<? super e0> dVar) {
            return ((d) j(bool, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            d dVar2 = new d(this.V3, this.W3, dVar);
            dVar2.U3 = obj;
            return dVar2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<Boolean, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23922y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23922y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Boolean.TYPE)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23922y = 1;
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
        public final Object u(Boolean bool, xb.d<? super e0> dVar) {
            return ((e) j(bool, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            e eVar = new e(this.V3, this.W3, dVar);
            eVar.U3 = obj;
            return eVar;
        }
    }

    public b(v9.a aVar) {
        hc.t.e(aVar, "store");
        int i10 = 0;
        v0<String> a10 = aVar.b().a("check_context_notification_version_shown", BuildConfig.FLAVOR);
        boolean z10 = true;
        try {
            if (!(a10.getValue().length() == 0)) {
                gf.b a11 = aVar.a();
                byte[] decode = Base64.decode(a10.getValue(), 0);
                hc.t.d(decode, "decode(flow.value, Base64.DEFAULT)");
                i10 = a11.e(SerializersKt.serializer(a11.a(), k0.j(Integer.TYPE)), decode);
            }
        } catch (i unused) {
        }
        this.f23915a = x0.a(i10, new C0422b(a10, aVar, null));
        Object obj = Boolean.FALSE;
        v0<String> a12 = aVar.b().a("is_domestic_rules_on", BuildConfig.FLAVOR);
        try {
            if (!(a12.getValue().length() == 0)) {
                gf.b a13 = aVar.a();
                byte[] decode2 = Base64.decode(a12.getValue(), 0);
                hc.t.d(decode2, "decode(flow.value, Base64.DEFAULT)");
                obj = a13.e(SerializersKt.serializer(a13.a(), k0.j(Boolean.TYPE)), decode2);
            }
        } catch (i unused2) {
        }
        this.f23916b = x0.a(obj, new c(a12, aVar, null));
        Object obj2 = Boolean.FALSE;
        v0<String> a14 = aVar.b().a("is_expert_mode_on", BuildConfig.FLAVOR);
        try {
            if (!(a14.getValue().length() == 0)) {
                gf.b a15 = aVar.a();
                byte[] decode3 = Base64.decode(a14.getValue(), 0);
                hc.t.d(decode3, "decode(flow.value, Base64.DEFAULT)");
                obj2 = a15.e(SerializersKt.serializer(a15.a(), k0.j(Boolean.TYPE)), decode3);
            }
        } catch (i unused3) {
        }
        this.f23917c = x0.a(obj2, new d(a14, aVar, null));
        Object obj3 = Boolean.FALSE;
        v0<String> a16 = aVar.b().a("is_offline_revocation_on", BuildConfig.FLAVOR);
        try {
            if (a16.getValue().length() != 0) {
                z10 = false;
            }
            if (!z10) {
                gf.b a17 = aVar.a();
                byte[] decode4 = Base64.decode(a16.getValue(), 0);
                hc.t.d(decode4, "decode(flow.value, Base64.DEFAULT)");
                obj3 = a17.e(SerializersKt.serializer(a17.a(), k0.j(Boolean.TYPE)), decode4);
            }
        } catch (i unused4) {
        }
        this.f23918d = x0.a(obj3, new e(a16, aVar, null));
    }

    public final v0<Integer> a() {
        return this.f23915a;
    }

    public final v0<Boolean> b() {
        return this.f23916b;
    }

    public final v0<Boolean> c() {
        return this.f23917c;
    }
}
