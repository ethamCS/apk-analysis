package d9;

import bf.y;
import de.rki.covpass.sdk.cert.models.CovCertificate;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u0012"}, d2 = {"Ld9/u;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "qr", BuildConfig.FLAVOR, "d", "(Ljava/lang/String;)[B", "La/u;", "a", "qrContent", BuildConfig.FLAVOR, "allowExpiredCertificates", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "b", "Ld9/f;", "validator", "<init>", "(Ld9/f;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class u {
    private static final a Companion = new a(null);

    /* renamed from: a */
    private final f f8459a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ld9/u$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "TICKETING_PROTOCOL", "Ljava/lang/String;", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u(f fVar) {
        hc.t.e(fVar, "validator");
        this.f8459a = fVar;
    }

    public static /* synthetic */ CovCertificate c(u uVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return uVar.b(str, z10);
    }

    public final a.u a(String str) {
        hc.t.e(str, "qr");
        a.q i10 = a.q.i(d(str));
        a.u uVar = i10 instanceof a.u ? (a.u) i10 : null;
        if (uVar != null) {
            return uVar;
        }
        throw new a.f("Not a cose-sign1 message");
    }

    public final CovCertificate b(String str, boolean z10) {
        hc.t.e(str, "qrContent");
        return this.f8459a.c(a(str), z10);
    }

    public final byte[] d(String str) {
        String p02;
        hc.t.e(str, "qr");
        p02 = y.p0(str, "HC1:");
        byte[] bytes = p02.getBytes(bf.d.f5986b);
        hc.t.d(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            return z9.p.f26559a.a(w7.a.f24692a.c(bytes));
        } catch (IOException unused) {
            throw new m("Not a valid zlib compressed DCC");
        }
    }
}
