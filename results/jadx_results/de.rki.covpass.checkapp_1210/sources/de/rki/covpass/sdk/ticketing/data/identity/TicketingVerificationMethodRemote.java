package de.rki.covpass.sdk.ticketing.data.identity;

import android.os.Parcel;
import android.os.Parcelable;
import fc.c;
import hc.t;
import java.util.List;
import jf.d;
import kf.f;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B=\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010'¢\u0006\u0004\b-\u0010.BS\b\u0017\u0012\u0006\u0010/\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010!\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010'\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00065"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "d", "getType", "type", "q", "getController", "controller", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", "x", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", "getPublicKeyJwk", "()Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", "publicKeyJwk", BuildConfig.FLAVOR, "y", "Ljava/util/List;", "getVerificationMethods", "()Ljava/util/List;", "verificationMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;Ljava/util/List;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;Ljava/util/List;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingVerificationMethodRemote implements Parcelable {

    /* renamed from: c */
    private final String f8870c;

    /* renamed from: d */
    private final String f8871d;

    /* renamed from: q */
    private final String f8872q;

    /* renamed from: x */
    private final TicketingPublicKeyJwkRemote f8873x;

    /* renamed from: y */
    private final List<String> f8874y;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TicketingVerificationMethodRemote> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingVerificationMethodRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingVerificationMethodRemote> serializer() {
            return TicketingVerificationMethodRemote$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<TicketingVerificationMethodRemote> {
        /* renamed from: a */
        public final TicketingVerificationMethodRemote createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new TicketingVerificationMethodRemote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TicketingPublicKeyJwkRemote.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final TicketingVerificationMethodRemote[] newArray(int i10) {
            return new TicketingVerificationMethodRemote[i10];
        }
    }

    public /* synthetic */ TicketingVerificationMethodRemote(int i10, String str, String str2, String str3, TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote, List list, h1 h1Var) {
        if (7 != (i10 & 7)) {
            w0.a(i10, 7, TicketingVerificationMethodRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8870c = str;
        this.f8871d = str2;
        this.f8872q = str3;
        if ((i10 & 8) == 0) {
            this.f8873x = null;
        } else {
            this.f8873x = ticketingPublicKeyJwkRemote;
        }
        if ((i10 & 16) == 0) {
            this.f8874y = null;
        } else {
            this.f8874y = list;
        }
    }

    public TicketingVerificationMethodRemote(String str, String str2, String str3, TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote, List<String> list) {
        t.e(str, "id");
        t.e(str2, "type");
        t.e(str3, "controller");
        this.f8870c = str;
        this.f8871d = str2;
        this.f8872q = str3;
        this.f8873x = ticketingPublicKeyJwkRemote;
        this.f8874y = list;
    }

    @c
    public static final void a(TicketingVerificationMethodRemote ticketingVerificationMethodRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingVerificationMethodRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        dVar.E(serialDescriptor, 0, ticketingVerificationMethodRemote.f8870c);
        dVar.E(serialDescriptor, 1, ticketingVerificationMethodRemote.f8871d);
        dVar.E(serialDescriptor, 2, ticketingVerificationMethodRemote.f8872q);
        if (dVar.p(serialDescriptor, 3) || ticketingVerificationMethodRemote.f8873x != null) {
            dVar.m(serialDescriptor, 3, TicketingPublicKeyJwkRemote$$serializer.INSTANCE, ticketingVerificationMethodRemote.f8873x);
        }
        if (dVar.p(serialDescriptor, 4) || ticketingVerificationMethodRemote.f8874y != null) {
            z10 = true;
        }
        if (z10) {
            dVar.m(serialDescriptor, 4, new f(k1.f15181a), ticketingVerificationMethodRemote.f8874y);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingVerificationMethodRemote)) {
            return false;
        }
        TicketingVerificationMethodRemote ticketingVerificationMethodRemote = (TicketingVerificationMethodRemote) obj;
        return t.a(this.f8870c, ticketingVerificationMethodRemote.f8870c) && t.a(this.f8871d, ticketingVerificationMethodRemote.f8871d) && t.a(this.f8872q, ticketingVerificationMethodRemote.f8872q) && t.a(this.f8873x, ticketingVerificationMethodRemote.f8873x) && t.a(this.f8874y, ticketingVerificationMethodRemote.f8874y);
    }

    public int hashCode() {
        int hashCode = ((((this.f8870c.hashCode() * 31) + this.f8871d.hashCode()) * 31) + this.f8872q.hashCode()) * 31;
        TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote = this.f8873x;
        int i10 = 0;
        int hashCode2 = (hashCode + (ticketingPublicKeyJwkRemote == null ? 0 : ticketingPublicKeyJwkRemote.hashCode())) * 31;
        List<String> list = this.f8874y;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f8870c;
        String str2 = this.f8871d;
        String str3 = this.f8872q;
        TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote = this.f8873x;
        List<String> list = this.f8874y;
        return "TicketingVerificationMethodRemote(id=" + str + ", type=" + str2 + ", controller=" + str3 + ", publicKeyJwk=" + ticketingPublicKeyJwkRemote + ", verificationMethods=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(this.f8870c);
        parcel.writeString(this.f8871d);
        parcel.writeString(this.f8872q);
        TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote = this.f8873x;
        if (ticketingPublicKeyJwkRemote == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ticketingPublicKeyJwkRemote.writeToParcel(parcel, i10);
        }
        parcel.writeStringList(this.f8874y);
    }
}
