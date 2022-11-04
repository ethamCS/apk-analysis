package de.rki.covpass.sdk.ticketing.data.identity;

import android.os.Parcel;
import android.os.Parcelable;
import fc.c;
import hc.t;
import java.util.ArrayList;
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
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b$\u0010%B7\b\u0017\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingValidationServiceIdentityResponse;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote;", "d", "Ljava/util/List;", "getVerificationMethods", "()Ljava/util/List;", "getVerificationMethods$annotations", "()V", "verificationMethods", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingValidationServiceIdentityResponse implements Parcelable {

    /* renamed from: c */
    private final String f8868c;

    /* renamed from: d */
    private final List<TicketingVerificationMethodRemote> f8869d;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TicketingValidationServiceIdentityResponse> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingValidationServiceIdentityResponse$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingValidationServiceIdentityResponse;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingValidationServiceIdentityResponse> serializer() {
            return TicketingValidationServiceIdentityResponse$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<TicketingValidationServiceIdentityResponse> {
        /* renamed from: a */
        public final TicketingValidationServiceIdentityResponse createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(TicketingVerificationMethodRemote.CREATOR.createFromParcel(parcel));
            }
            return new TicketingValidationServiceIdentityResponse(readString, arrayList);
        }

        /* renamed from: b */
        public final TicketingValidationServiceIdentityResponse[] newArray(int i10) {
            return new TicketingValidationServiceIdentityResponse[i10];
        }
    }

    public /* synthetic */ TicketingValidationServiceIdentityResponse(int i10, String str, List list, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, TicketingValidationServiceIdentityResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f8868c = str;
        this.f8869d = list;
    }

    public TicketingValidationServiceIdentityResponse(String str, List<TicketingVerificationMethodRemote> list) {
        t.e(str, "id");
        t.e(list, "verificationMethods");
        this.f8868c = str;
        this.f8869d = list;
    }

    @c
    public static final void a(TicketingValidationServiceIdentityResponse ticketingValidationServiceIdentityResponse, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingValidationServiceIdentityResponse, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, ticketingValidationServiceIdentityResponse.f8868c);
        dVar.t(serialDescriptor, 1, new f(TicketingVerificationMethodRemote$$serializer.INSTANCE), ticketingValidationServiceIdentityResponse.f8869d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingValidationServiceIdentityResponse)) {
            return false;
        }
        TicketingValidationServiceIdentityResponse ticketingValidationServiceIdentityResponse = (TicketingValidationServiceIdentityResponse) obj;
        return t.a(this.f8868c, ticketingValidationServiceIdentityResponse.f8868c) && t.a(this.f8869d, ticketingValidationServiceIdentityResponse.f8869d);
    }

    public int hashCode() {
        return (this.f8868c.hashCode() * 31) + this.f8869d.hashCode();
    }

    public String toString() {
        String str = this.f8868c;
        List<TicketingVerificationMethodRemote> list = this.f8869d;
        return "TicketingValidationServiceIdentityResponse(id=" + str + ", verificationMethods=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(this.f8868c);
        List<TicketingVerificationMethodRemote> list = this.f8869d;
        parcel.writeInt(list.size());
        for (TicketingVerificationMethodRemote ticketingVerificationMethodRemote : list) {
            ticketingVerificationMethodRemote.writeToParcel(parcel, i10);
        }
    }
}
