package de.rki.covpass.sdk.ticketing.data.validate;

import fc.c;
import hc.t;
import jf.d;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(BW\b\u0017\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012¨\u0006*"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/TicketingValidationRequest;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getKid", "()Ljava/lang/String;", "kid", "b", "getDcc", "dcc", "c", "getSig", "sig", "d", "getEncKey", "encKey", "e", "getEncScheme", "encScheme", "f", "getSigAlg", "sigAlg", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingValidationRequest {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8884a;

    /* renamed from: b */
    private final String f8885b;

    /* renamed from: c */
    private final String f8886c;

    /* renamed from: d */
    private final String f8887d;

    /* renamed from: e */
    private final String f8888e;

    /* renamed from: f */
    private final String f8889f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/TicketingValidationRequest$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/validate/TicketingValidationRequest;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingValidationRequest> serializer() {
            return TicketingValidationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketingValidationRequest(int i10, String str, String str2, String str3, String str4, String str5, String str6, h1 h1Var) {
        if (15 != (i10 & 15)) {
            w0.a(i10, 15, TicketingValidationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f8884a = str;
        this.f8885b = str2;
        this.f8886c = str3;
        this.f8887d = str4;
        if ((i10 & 16) == 0) {
            this.f8888e = "RSAOAEPWithSHA256AESGCM";
        } else {
            this.f8888e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f8889f = "SHA256withECDSA";
        } else {
            this.f8889f = str6;
        }
    }

    @c
    public static final void a(TicketingValidationRequest ticketingValidationRequest, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingValidationRequest, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        dVar.E(serialDescriptor, 0, ticketingValidationRequest.f8884a);
        dVar.E(serialDescriptor, 1, ticketingValidationRequest.f8885b);
        dVar.E(serialDescriptor, 2, ticketingValidationRequest.f8886c);
        dVar.E(serialDescriptor, 3, ticketingValidationRequest.f8887d);
        if (dVar.p(serialDescriptor, 4) || !t.a(ticketingValidationRequest.f8888e, "RSAOAEPWithSHA256AESGCM")) {
            dVar.E(serialDescriptor, 4, ticketingValidationRequest.f8888e);
        }
        if (dVar.p(serialDescriptor, 5) || !t.a(ticketingValidationRequest.f8889f, "SHA256withECDSA")) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 5, ticketingValidationRequest.f8889f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingValidationRequest)) {
            return false;
        }
        TicketingValidationRequest ticketingValidationRequest = (TicketingValidationRequest) obj;
        return t.a(this.f8884a, ticketingValidationRequest.f8884a) && t.a(this.f8885b, ticketingValidationRequest.f8885b) && t.a(this.f8886c, ticketingValidationRequest.f8886c) && t.a(this.f8887d, ticketingValidationRequest.f8887d) && t.a(this.f8888e, ticketingValidationRequest.f8888e) && t.a(this.f8889f, ticketingValidationRequest.f8889f);
    }

    public int hashCode() {
        return (((((((((this.f8884a.hashCode() * 31) + this.f8885b.hashCode()) * 31) + this.f8886c.hashCode()) * 31) + this.f8887d.hashCode()) * 31) + this.f8888e.hashCode()) * 31) + this.f8889f.hashCode();
    }

    public String toString() {
        String str = this.f8884a;
        String str2 = this.f8885b;
        String str3 = this.f8886c;
        String str4 = this.f8887d;
        String str5 = this.f8888e;
        String str6 = this.f8889f;
        return "TicketingValidationRequest(kid=" + str + ", dcc=" + str2 + ", sig=" + str3 + ", encKey=" + str4 + ", encScheme=" + str5 + ", sigAlg=" + str6 + ")";
    }
}
