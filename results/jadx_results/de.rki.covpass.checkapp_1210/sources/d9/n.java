package d9;

import bf.y;
import de.rki.covpass.sdk.cert.models.DscList;
import hc.k0;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlinx.serialization.SerializersKt;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Ld9/n;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "data", "Lde/rki/covpass/sdk/cert/models/DscList;", "a", "Ljava/security/PublicKey;", "publicKey", "<init>", "(Ljava/security/PublicKey;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    private final PublicKey f8449a;

    /* renamed from: b */
    private final lf.a f8450b = lf.l.b(null, a.f8451c, 1, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llf/c;", "Ltb/e0;", "b", "(Llf/c;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<lf.c, e0> {

        /* renamed from: c */
        public static final a f8451c = new a();

        a() {
            super(1);
        }

        public final void b(lf.c cVar) {
            hc.t.e(cVar, "$this$Json");
            cVar.e(true);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(lf.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    public n(PublicKey publicKey) {
        hc.t.e(publicKey, "publicKey");
        this.f8449a = publicKey;
    }

    public final DscList a(String str) {
        String P0;
        CharSequence S0;
        hc.t.e(str, "data");
        P0 = y.P0(str, "{", null, 2, null);
        byte[] a10 = bk.a.a(P0);
        String substring = str.substring(P0.length());
        hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
        S0 = y.S0(substring);
        String obj = S0.toString();
        PublicKey publicKey = this.f8449a;
        byte[] bytes = obj.getBytes(bf.d.f5986b);
        hc.t.d(bytes, "this as java.lang.String).getBytes(charset)");
        hc.t.d(a10, "signature");
        e9.d.b(publicKey, bytes, a10, "SHA256withECDSA");
        lf.a aVar = this.f8450b;
        return (DscList) aVar.c(SerializersKt.serializer(aVar.a(), k0.j(DscList.class)), obj);
    }
}
