package d9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ua.c;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Ld9/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleIdentifierRemote;", "b", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "country", "hash", "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "Lna/a;", "httpClient", "host", "urlString", "<init>", "(Lna/a;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final String f8425a;

    /* renamed from: b */
    private final na.a f8426b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<na.b<?>, e0> {

        /* renamed from: c */
        final /* synthetic */ String f8427c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: d9.j$a$a */
        /* loaded from: classes.dex */
        public static final class C0127a extends hc.v implements gc.l<ya.c, e0> {

            /* renamed from: c */
            final /* synthetic */ String f8428c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0127a(String str) {
                super(1);
                this.f8428c = str;
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                ya.i.c(cVar, this.f8428c);
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
            public static final b f8429c = new b();

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
            this.f8427c = str;
        }

        public final void b(na.b<?> bVar) {
            hc.t.e(bVar, "$this$config");
            ta.e.a(bVar, new C0127a(this.f8427c));
            bVar.j(ua.c.f23330d, b.f8429c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.cert.CovPassRulesRemoteDataSource", f = "CovPassRulesRemoteDataSource.kt", l = {64, 66, 69}, m = "getRule")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        int V3;

        /* renamed from: x */
        Object f8430x;

        /* renamed from: y */
        /* synthetic */ Object f8431y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            j.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f8431y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.cert.CovPassRulesRemoteDataSource", f = "CovPassRulesRemoteDataSource.kt", l = {64, 66, 69}, m = "getRuleIdentifiers")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        int V3;

        /* renamed from: x */
        Object f8432x;

        /* renamed from: y */
        /* synthetic */ Object f8433y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            j.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f8433y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return j.this.b(this);
        }
    }

    public j(na.a aVar, String str, String str2) {
        hc.t.e(aVar, "httpClient");
        hc.t.e(str, "host");
        hc.t.e(str2, "urlString");
        this.f8425a = str2;
        this.f8426b = aVar.f(new a(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:38:0x010f, B:41:0x0116, B:42:0x011b), top: B:49:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0037, B:38:0x010f, B:41:0x0116, B:42:0x011b), top: B:49:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, java.lang.String r22, xb.d<? super de.rki.covpass.sdk.rules.remote.rules.eu.CovPassRuleRemote> r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.j.a(java.lang.String, java.lang.String, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:38:0x00fe, B:41:0x0105, B:42:0x010a), top: B:47:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0035, B:38:0x00fe, B:41:0x0105, B:42:0x010a), top: B:47:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xb.d<? super java.util.List<de.rki.covpass.sdk.rules.remote.rules.eu.CovPassRuleIdentifierRemote>> r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.j.b(xb.d):java.lang.Object");
    }
}
