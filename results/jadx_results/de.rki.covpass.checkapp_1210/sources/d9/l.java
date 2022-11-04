package d9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ua.c;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ld9/l;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetIdentifierRemote;", "b", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "hash", "Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote;", "a", "(Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "Lna/a;", "httpClient", "host", "<init>", "(Lna/a;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private final na.a f8441a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<na.b<?>, e0> {

        /* renamed from: c */
        final /* synthetic */ String f8442c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: d9.l$a$a */
        /* loaded from: classes.dex */
        public static final class C0128a extends hc.v implements gc.l<ya.c, e0> {

            /* renamed from: c */
            final /* synthetic */ String f8443c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0128a(String str) {
                super(1);
                this.f8443c = str;
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                ya.i.c(cVar, this.f8443c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(ya.c cVar) {
                b(cVar);
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lua/c$a;", "Ltb/e0;", "b", "(Lua/c$a;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.l<c.a, e0> {

            /* renamed from: c */
            public static final b f8444c = new b();

            b() {
                super(1);
            }

            public final void b(c.a aVar) {
                hc.t.e(aVar, "$this$install");
                aVar.d(new va.a(f9.b.c()));
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(c.a aVar) {
                b(aVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f8442c = str;
        }

        public final void b(na.b<?> bVar) {
            hc.t.e(bVar, "$this$config");
            ta.e.a(bVar, new C0128a(this.f8442c));
            bVar.j(ua.c.f23330d, b.f8444c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.cert.CovPassValueSetsRemoteDataSource", f = "CovPassValueSetsRemoteDataSource.kt", l = {60, 62, 65}, m = "getValueSet")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        int V3;

        /* renamed from: x */
        Object f8445x;

        /* renamed from: y */
        /* synthetic */ Object f8446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            l.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f8446y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.cert.CovPassValueSetsRemoteDataSource", f = "CovPassValueSetsRemoteDataSource.kt", l = {60, 62, 65}, m = "getValueSetIdentifiers")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        int V3;

        /* renamed from: x */
        Object f8447x;

        /* renamed from: y */
        /* synthetic */ Object f8448y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            l.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f8448y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return l.this.b(this);
        }
    }

    public l(na.a aVar, String str) {
        hc.t.e(aVar, "httpClient");
        hc.t.e(str, "host");
        this.f8441a = aVar.f(new a(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:38:0x0102, B:41:0x0109, B:42:0x010e), top: B:47:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:38:0x0102, B:41:0x0109, B:42:0x010e), top: B:47:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, xb.d<? super de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetRemote> r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.l.a(java.lang.String, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:38:0x00f9, B:41:0x0100, B:42:0x0105), top: B:49:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:38:0x00f9, B:41:0x0100, B:42:0x0105), top: B:49:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xb.d<? super java.util.List<de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetIdentifierRemote>> r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.l.b(xb.d):java.lang.Object");
    }
}
