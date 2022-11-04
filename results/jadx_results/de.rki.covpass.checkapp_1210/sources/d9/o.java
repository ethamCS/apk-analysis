package d9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Ld9/o;", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/DscList;", "dscList", "a", "(Lde/rki/covpass/sdk/cert/models/DscList;Lxb/d;)Ljava/lang/Object;", "Lna/a;", "httpClient", BuildConfig.FLAVOR, "host", "Ld9/n;", "dscListDecoder", "<init>", "(Lna/a;Ljava/lang/String;Ld9/n;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    private final n f8452a;

    /* renamed from: b */
    private final na.a f8453b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<na.b<?>, e0> {

        /* renamed from: c */
        final /* synthetic */ String f8454c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: d9.o$a$a */
        /* loaded from: classes.dex */
        public static final class C0129a extends hc.v implements gc.l<ya.c, e0> {

            /* renamed from: c */
            final /* synthetic */ String f8455c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129a(String str) {
                super(1);
                this.f8455c = str;
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                ya.i.c(cVar, this.f8455c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(ya.c cVar) {
                b(cVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f8454c = str;
        }

        public final void b(na.b<?> bVar) {
            hc.t.e(bVar, "$this$config");
            ta.e.a(bVar, new C0129a(this.f8454c));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.cert.DscListService", f = "DscListService.kt", l = {78, 80, 83, 94}, m = "getTrustedList")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f8456x;

        /* renamed from: y */
        Object f8457y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            o.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(na.a aVar, String str, n nVar) {
        hc.t.e(aVar, "httpClient");
        hc.t.e(str, "host");
        hc.t.e(nVar, "dscListDecoder");
        this.f8452a = nVar;
        this.f8453b = aVar.f(new a(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[Catch: w -> 0x01a9, TryCatch #1 {w -> 0x01a9, blocks: (B:27:0x007c, B:29:0x0089, B:31:0x0091, B:33:0x00c4, B:35:0x00ca, B:40:0x00d5, B:41:0x00da, B:43:0x00ef, B:44:0x00f4, B:46:0x00fe, B:51:0x010e, B:52:0x0111, B:53:0x0116, B:54:0x0117, B:58:0x0125, B:64:0x0150, B:65:0x0154, B:70:0x0181, B:73:0x018f, B:74:0x0195, B:75:0x019c, B:79:0x01a5, B:80:0x01a8), top: B:90:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: w -> 0x01a9, TryCatch #1 {w -> 0x01a9, blocks: (B:27:0x007c, B:29:0x0089, B:31:0x0091, B:33:0x00c4, B:35:0x00ca, B:40:0x00d5, B:41:0x00da, B:43:0x00ef, B:44:0x00f4, B:46:0x00fe, B:51:0x010e, B:52:0x0111, B:53:0x0116, B:54:0x0117, B:58:0x0125, B:64:0x0150, B:65:0x0154, B:70:0x0181, B:73:0x018f, B:74:0x0195, B:75:0x019c, B:79:0x01a5, B:80:0x01a8), top: B:90:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #2 {all -> 0x019d, blocks: (B:59:0x0128, B:63:0x014e, B:77:0x019f, B:78:0x01a4), top: B:91:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181 A[Catch: w -> 0x01a9, TryCatch #1 {w -> 0x01a9, blocks: (B:27:0x007c, B:29:0x0089, B:31:0x0091, B:33:0x00c4, B:35:0x00ca, B:40:0x00d5, B:41:0x00da, B:43:0x00ef, B:44:0x00f4, B:46:0x00fe, B:51:0x010e, B:52:0x0111, B:53:0x0116, B:54:0x0117, B:58:0x0125, B:64:0x0150, B:65:0x0154, B:70:0x0181, B:73:0x018f, B:74:0x0195, B:75:0x019c, B:79:0x01a5, B:80:0x01a8), top: B:90:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195 A[Catch: w -> 0x01a9, TryCatch #1 {w -> 0x01a9, blocks: (B:27:0x007c, B:29:0x0089, B:31:0x0091, B:33:0x00c4, B:35:0x00ca, B:40:0x00d5, B:41:0x00da, B:43:0x00ef, B:44:0x00f4, B:46:0x00fe, B:51:0x010e, B:52:0x0111, B:53:0x0116, B:54:0x0117, B:58:0x0125, B:64:0x0150, B:65:0x0154, B:70:0x0181, B:73:0x018f, B:74:0x0195, B:75:0x019c, B:79:0x01a5, B:80:0x01a8), top: B:90:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #2 {all -> 0x019d, blocks: (B:59:0x0128, B:63:0x014e, B:77:0x019f, B:78:0x01a4), top: B:91:0x0128 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(de.rki.covpass.sdk.cert.models.DscList r23, xb.d<? super de.rki.covpass.sdk.cert.models.DscList> r24) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.o.a(de.rki.covpass.sdk.cert.models.DscList, xb.d):java.lang.Object");
    }
}
