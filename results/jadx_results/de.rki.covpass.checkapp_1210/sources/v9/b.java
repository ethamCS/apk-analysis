package v9;

import android.util.Base64;
import de.rki.covpass.sdk.cert.models.DscList;
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
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lv9/b;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/DscList;", "newDscList", "Ltb/e0;", "d", "(Lde/rki/covpass/sdk/cert/models/DscList;Lxb/d;)Ljava/lang/Object;", "Ls4/v0;", "j$/time/Instant", "lastUpdate", "Ls4/v0;", "c", "()Ls4/v0;", "dscList", "b", "Lv9/a;", "store", "<init>", "(Lv9/a;Lde/rki/covpass/sdk/cert/models/DscList;)V", "a", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final Instant f23927c;

    /* renamed from: a */
    private final v0<Instant> f23928a;

    /* renamed from: b */
    private final v0<DscList> f23929b;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lv9/b$a;", BuildConfig.FLAVOR, "j$/time/Instant", "NO_UPDATE_YET", "Lj$/time/Instant;", "a", "()Lj$/time/Instant;", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Instant a() {
            return b.f23927c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: v9.b$b */
    /* loaded from: classes.dex */
    public static final class C0423b extends l implements p<Instant, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23930y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0423b(v0 v0Var, v9.a aVar, xb.d dVar) {
            super(2, dVar);
            this.V3 = v0Var;
            this.W3 = aVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23930y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(Instant.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23930y = 1;
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
            return ((C0423b) j(instant, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            C0423b c0423b = new C0423b(this.V3, this.W3, dVar);
            c0423b.U3 = obj;
            return c0423b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {BuildConfig.FLAVOR, "T", "it", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.storage.CborSharedPrefsStore$getData$1", f = "CborSharedPrefsStore.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<DscList, xb.d<? super e0>, Object> {
        /* synthetic */ Object U3;
        final /* synthetic */ v0 V3;
        final /* synthetic */ v9.a W3;

        /* renamed from: y */
        int f23931y;

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
            int i10 = this.f23931y;
            if (i10 == 0) {
                t.b(obj);
                Object obj2 = this.U3;
                v0 v0Var = this.V3;
                gf.b a10 = this.W3.a();
                String encodeToString = Base64.encodeToString(a10.b(SerializersKt.serializer(a10.a(), k0.j(DscList.class)), obj2), 0);
                hc.t.d(encodeToString, "encodeToString(cbor.enco…rray(it), Base64.DEFAULT)");
                this.f23931y = 1;
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
        public final Object u(DscList dscList, xb.d<? super e0> dVar) {
            return ((c) j(dscList, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(this.V3, this.W3, dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.storage.DscRepository", f = "DscRepository.kt", l = {27, 28}, m = "updateDscList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        int V3;

        /* renamed from: x */
        Object f23932x;

        /* renamed from: y */
        /* synthetic */ Object f23933y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f23933y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    static {
        Instant instant = Instant.EPOCH;
        hc.t.d(instant, "EPOCH");
        f23927c = instant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(v9.a aVar, DscList dscList) {
        hc.t.e(aVar, "store");
        hc.t.e(dscList, "dscList");
        Object obj = f23927c;
        v0<String> a10 = aVar.b().a("last_update", BuildConfig.FLAVOR);
        boolean z10 = true;
        try {
            if (!(a10.getValue().length() == 0)) {
                gf.b a11 = aVar.a();
                byte[] decode = Base64.decode(a10.getValue(), 0);
                hc.t.d(decode, "decode(flow.value, Base64.DEFAULT)");
                obj = a11.e(SerializersKt.serializer(a11.a(), k0.j(Instant.class)), decode);
            }
        } catch (i unused) {
        }
        this.f23928a = x0.a(obj, new C0423b(a10, aVar, null));
        v0<String> a12 = aVar.b().a("dcs_list", BuildConfig.FLAVOR);
        try {
            if (a12.getValue().length() != 0) {
                z10 = false;
            }
            if (!z10) {
                gf.b a13 = aVar.a();
                byte[] decode2 = Base64.decode(a12.getValue(), 0);
                hc.t.d(decode2, "decode(flow.value, Base64.DEFAULT)");
                dscList = a13.e(SerializersKt.serializer(a13.a(), k0.j(DscList.class)), decode2);
            }
        } catch (i unused2) {
        }
        this.f23929b = x0.a(dscList, new c(a12, aVar, null));
    }

    public final v0<DscList> b() {
        return this.f23929b;
    }

    public final v0<Instant> c() {
        return this.f23928a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(de.rki.covpass.sdk.cert.models.DscList r10, xb.d<? super tb.e0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof v9.b.d
            if (r0 == 0) goto L13
            r0 = r11
            v9.b$d r0 = (v9.b.d) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            v9.b$d r0 = new v9.b$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23933y
            java.lang.Object r7 = yb.b.c()
            int r1 = r0.V3
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L34
            if (r1 != r8) goto L2c
            tb.t.b(r11)
            goto L6d
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r0.f23932x
            v9.b r10 = (v9.b) r10
            tb.t.b(r11)
            goto L52
        L3c:
            tb.t.b(r11)
            s4.v0<de.rki.covpass.sdk.cert.models.DscList> r1 = r9.f23929b
            r3 = 0
            r5 = 2
            r6 = 0
            r0.f23932x = r9
            r0.V3 = r2
            r2 = r10
            r4 = r0
            java.lang.Object r10 = s4.v0.a.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L51
            return r7
        L51:
            r10 = r9
        L52:
            s4.v0<j$.time.Instant> r1 = r10.f23928a
            j$.time.Instant r2 = j$.time.Instant.now()
            java.lang.String r10 = "now()"
            hc.t.d(r2, r10)
            r3 = 0
            r5 = 2
            r6 = 0
            r10 = 0
            r0.f23932x = r10
            r0.V3 = r8
            r4 = r0
            java.lang.Object r10 = s4.v0.a.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L6d
            return r7
        L6d:
            tb.e0 r10 = tb.e0.f22152a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.b.d(de.rki.covpass.sdk.cert.models.DscList, xb.d):java.lang.Object");
    }
}
