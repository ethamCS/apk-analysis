package de.rki.covpass.sdk.ticketing;

import android.os.Parcel;
import android.os.Parcelable;
import hc.t;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BG\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101Bk\b\u0017\u0012\u0006\u00102\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010\t\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019¨\u00068"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingDataInitialization;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "c", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "protocol", "d", "getProtocolVersion", "protocolVersion", "q", "getServiceIdentity", "serviceIdentity", "x", "getPrivacyUrl", "privacyUrl", "y", "getToken", "token", "U3", "getConsent", "consent", "V3", "getSubject", "subject", "W3", "getServiceProvider", "serviceProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingDataInitialization implements Parcelable {
    private final String U3;
    private final String V3;
    private final String W3;

    /* renamed from: c */
    private final String f8813c;

    /* renamed from: d */
    private final String f8814d;

    /* renamed from: q */
    private final String f8815q;

    /* renamed from: x */
    private final String f8816x;

    /* renamed from: y */
    private final String f8817y;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TicketingDataInitialization> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/TicketingDataInitialization$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/TicketingDataInitialization;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingDataInitialization> serializer() {
            return TicketingDataInitialization$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<TicketingDataInitialization> {
        /* renamed from: a */
        public final TicketingDataInitialization createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new TicketingDataInitialization(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final TicketingDataInitialization[] newArray(int i10) {
            return new TicketingDataInitialization[i10];
        }
    }

    public /* synthetic */ TicketingDataInitialization(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, h1 h1Var) {
        if (255 != (i10 & 255)) {
            w0.a(i10, 255, TicketingDataInitialization$$serializer.INSTANCE.getDescriptor());
        }
        this.f8813c = str;
        this.f8814d = str2;
        this.f8815q = str3;
        this.f8816x = str4;
        this.f8817y = str5;
        this.U3 = str6;
        this.V3 = str7;
        this.W3 = str8;
    }

    public TicketingDataInitialization(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        t.e(str, "protocol");
        t.e(str2, "protocolVersion");
        t.e(str3, "serviceIdentity");
        t.e(str4, "privacyUrl");
        t.e(str5, "token");
        t.e(str6, "consent");
        t.e(str7, "subject");
        t.e(str8, "serviceProvider");
        this.f8813c = str;
        this.f8814d = str2;
        this.f8815q = str3;
        this.f8816x = str4;
        this.f8817y = str5;
        this.U3 = str6;
        this.V3 = str7;
        this.W3 = str8;
    }

    @fc.c
    public static final void a(TicketingDataInitialization ticketingDataInitialization, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingDataInitialization, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, ticketingDataInitialization.f8813c);
        dVar.E(serialDescriptor, 1, ticketingDataInitialization.f8814d);
        dVar.E(serialDescriptor, 2, ticketingDataInitialization.f8815q);
        dVar.E(serialDescriptor, 3, ticketingDataInitialization.f8816x);
        dVar.E(serialDescriptor, 4, ticketingDataInitialization.f8817y);
        dVar.E(serialDescriptor, 5, ticketingDataInitialization.U3);
        dVar.E(serialDescriptor, 6, ticketingDataInitialization.V3);
        dVar.E(serialDescriptor, 7, ticketingDataInitialization.W3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingDataInitialization)) {
            return false;
        }
        TicketingDataInitialization ticketingDataInitialization = (TicketingDataInitialization) obj;
        return t.a(this.f8813c, ticketingDataInitialization.f8813c) && t.a(this.f8814d, ticketingDataInitialization.f8814d) && t.a(this.f8815q, ticketingDataInitialization.f8815q) && t.a(this.f8816x, ticketingDataInitialization.f8816x) && t.a(this.f8817y, ticketingDataInitialization.f8817y) && t.a(this.U3, ticketingDataInitialization.U3) && t.a(this.V3, ticketingDataInitialization.V3) && t.a(this.W3, ticketingDataInitialization.W3);
    }

    public int hashCode() {
        return (((((((((((((this.f8813c.hashCode() * 31) + this.f8814d.hashCode()) * 31) + this.f8815q.hashCode()) * 31) + this.f8816x.hashCode()) * 31) + this.f8817y.hashCode()) * 31) + this.U3.hashCode()) * 31) + this.V3.hashCode()) * 31) + this.W3.hashCode();
    }

    public String toString() {
        String str = this.f8813c;
        String str2 = this.f8814d;
        String str3 = this.f8815q;
        String str4 = this.f8816x;
        String str5 = this.f8817y;
        String str6 = this.U3;
        String str7 = this.V3;
        String str8 = this.W3;
        return "TicketingDataInitialization(protocol=" + str + ", protocolVersion=" + str2 + ", serviceIdentity=" + str3 + ", privacyUrl=" + str4 + ", token=" + str5 + ", consent=" + str6 + ", subject=" + str7 + ", serviceProvider=" + str8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(this.f8813c);
        parcel.writeString(this.f8814d);
        parcel.writeString(this.f8815q);
        parcel.writeString(this.f8816x);
        parcel.writeString(this.f8817y);
        parcel.writeString(this.U3);
        parcel.writeString(this.V3);
        parcel.writeString(this.W3);
    }
}
