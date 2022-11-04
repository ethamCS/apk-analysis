package de.rki.covpass.sdk.ticketing.data.identity;

import fc.c;
import hc.t;
import java.util.List;
import jf.d;
import kf.f;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('BI\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0014\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b \u0010\u001b\u001a\u0004\b\u001f\u0010\u0019¨\u0006)"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingIdentityDocumentResponse;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote;", "b", "Ljava/util/List;", "getVerificationMethods", "()Ljava/util/List;", "getVerificationMethods$annotations", "()V", "verificationMethods", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingServiceRemote;", "c", "getServiceRemoteTicketing", "getServiceRemoteTicketing$annotations", "serviceRemoteTicketing", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingIdentityDocumentResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8857a;

    /* renamed from: b */
    private final List<TicketingVerificationMethodRemote> f8858b;

    /* renamed from: c */
    private final List<TicketingServiceRemote> f8859c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingIdentityDocumentResponse$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingIdentityDocumentResponse;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingIdentityDocumentResponse> serializer() {
            return TicketingIdentityDocumentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketingIdentityDocumentResponse(int i10, String str, List list, List list2, h1 h1Var) {
        if (7 != (i10 & 7)) {
            w0.a(i10, 7, TicketingIdentityDocumentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f8857a = str;
        this.f8858b = list;
        this.f8859c = list2;
    }

    @c
    public static final void a(TicketingIdentityDocumentResponse ticketingIdentityDocumentResponse, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingIdentityDocumentResponse, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, ticketingIdentityDocumentResponse.f8857a);
        dVar.t(serialDescriptor, 1, new f(TicketingVerificationMethodRemote$$serializer.INSTANCE), ticketingIdentityDocumentResponse.f8858b);
        dVar.t(serialDescriptor, 2, new f(TicketingServiceRemote$$serializer.INSTANCE), ticketingIdentityDocumentResponse.f8859c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingIdentityDocumentResponse)) {
            return false;
        }
        TicketingIdentityDocumentResponse ticketingIdentityDocumentResponse = (TicketingIdentityDocumentResponse) obj;
        return t.a(this.f8857a, ticketingIdentityDocumentResponse.f8857a) && t.a(this.f8858b, ticketingIdentityDocumentResponse.f8858b) && t.a(this.f8859c, ticketingIdentityDocumentResponse.f8859c);
    }

    public int hashCode() {
        return (((this.f8857a.hashCode() * 31) + this.f8858b.hashCode()) * 31) + this.f8859c.hashCode();
    }

    public String toString() {
        String str = this.f8857a;
        List<TicketingVerificationMethodRemote> list = this.f8858b;
        List<TicketingServiceRemote> list2 = this.f8859c;
        return "TicketingIdentityDocumentResponse(id=" + str + ", verificationMethods=" + list + ", serviceRemoteTicketing=" + list2 + ")";
    }
}
