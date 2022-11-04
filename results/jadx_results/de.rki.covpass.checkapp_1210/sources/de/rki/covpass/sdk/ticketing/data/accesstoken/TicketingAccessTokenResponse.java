package de.rki.covpass.sdk.ticketing.data.accesstoken;

import fc.c;
import hc.t;
import jf.d;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bw\b\u0017\u0012\u0006\u00107\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010(\u001a\u00020\u0017\u0012\b\b\u0001\u0010,\u001a\u00020\u0017\u0012\b\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u000100\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R \u0010$\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0010\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0012R \u0010(\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0019\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u001bR \u0010,\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0019\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u001bR\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R \u00106\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010#\u001a\u0004\b3\u00104¨\u0006>"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingAccessTokenResponse;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getJti", "()Ljava/lang/String;", "jti", "b", "getIss", "iss", BuildConfig.FLAVOR, "c", "J", "getIat", "()J", "iat", "d", "getSub", "sub", "e", "getValidationUrl", "getValidationUrl$annotations", "()V", "validationUrl", "f", "getExp", "getExp$annotations", "exp", "g", "getType", "getType$annotations", "type", "h", "getV", "v", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", "i", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", "getCertificateData", "()Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", "getCertificateData$annotations", "certificateData", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingAccessTokenResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8826a;

    /* renamed from: b */
    private final String f8827b;

    /* renamed from: c */
    private final long f8828c;

    /* renamed from: d */
    private final String f8829d;

    /* renamed from: e */
    private final String f8830e;

    /* renamed from: f */
    private final long f8831f;

    /* renamed from: g */
    private final long f8832g;

    /* renamed from: h */
    private final String f8833h;

    /* renamed from: i */
    private final TicketingCertificateDataRemote f8834i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingAccessTokenResponse$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingAccessTokenResponse;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingAccessTokenResponse> serializer() {
            return TicketingAccessTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketingAccessTokenResponse(int i10, String str, String str2, long j10, String str3, String str4, long j11, long j12, String str5, TicketingCertificateDataRemote ticketingCertificateDataRemote, h1 h1Var) {
        if (510 != (i10 & 510)) {
            w0.a(i10, 510, TicketingAccessTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8826a = null;
        } else {
            this.f8826a = str;
        }
        this.f8827b = str2;
        this.f8828c = j10;
        this.f8829d = str3;
        this.f8830e = str4;
        this.f8831f = j11;
        this.f8832g = j12;
        this.f8833h = str5;
        this.f8834i = ticketingCertificateDataRemote;
    }

    @c
    public static final void a(TicketingAccessTokenResponse ticketingAccessTokenResponse, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingAccessTokenResponse, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        if (dVar.p(serialDescriptor, 0) || ticketingAccessTokenResponse.f8826a != null) {
            dVar.m(serialDescriptor, 0, k1.f15181a, ticketingAccessTokenResponse.f8826a);
        }
        dVar.E(serialDescriptor, 1, ticketingAccessTokenResponse.f8827b);
        dVar.A(serialDescriptor, 2, ticketingAccessTokenResponse.f8828c);
        dVar.E(serialDescriptor, 3, ticketingAccessTokenResponse.f8829d);
        dVar.E(serialDescriptor, 4, ticketingAccessTokenResponse.f8830e);
        dVar.A(serialDescriptor, 5, ticketingAccessTokenResponse.f8831f);
        dVar.A(serialDescriptor, 6, ticketingAccessTokenResponse.f8832g);
        dVar.E(serialDescriptor, 7, ticketingAccessTokenResponse.f8833h);
        dVar.t(serialDescriptor, 8, TicketingCertificateDataRemote$$serializer.INSTANCE, ticketingAccessTokenResponse.f8834i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingAccessTokenResponse)) {
            return false;
        }
        TicketingAccessTokenResponse ticketingAccessTokenResponse = (TicketingAccessTokenResponse) obj;
        return t.a(this.f8826a, ticketingAccessTokenResponse.f8826a) && t.a(this.f8827b, ticketingAccessTokenResponse.f8827b) && this.f8828c == ticketingAccessTokenResponse.f8828c && t.a(this.f8829d, ticketingAccessTokenResponse.f8829d) && t.a(this.f8830e, ticketingAccessTokenResponse.f8830e) && this.f8831f == ticketingAccessTokenResponse.f8831f && this.f8832g == ticketingAccessTokenResponse.f8832g && t.a(this.f8833h, ticketingAccessTokenResponse.f8833h) && t.a(this.f8834i, ticketingAccessTokenResponse.f8834i);
    }

    public int hashCode() {
        String str = this.f8826a;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f8827b.hashCode()) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f8828c)) * 31) + this.f8829d.hashCode()) * 31) + this.f8830e.hashCode()) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f8831f)) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f8832g)) * 31) + this.f8833h.hashCode()) * 31) + this.f8834i.hashCode();
    }

    public String toString() {
        String str = this.f8826a;
        String str2 = this.f8827b;
        long j10 = this.f8828c;
        String str3 = this.f8829d;
        String str4 = this.f8830e;
        long j11 = this.f8831f;
        long j12 = this.f8832g;
        String str5 = this.f8833h;
        TicketingCertificateDataRemote ticketingCertificateDataRemote = this.f8834i;
        return "TicketingAccessTokenResponse(jti=" + str + ", iss=" + str2 + ", iat=" + j10 + ", sub=" + str3 + ", validationUrl=" + str4 + ", exp=" + j11 + ", type=" + j12 + ", v=" + str5 + ", certificateData=" + ticketingCertificateDataRemote + ")";
    }
}
