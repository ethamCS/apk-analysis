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
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(BI\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006/"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", BuildConfig.FLAVOR, "c", "Ljava/util/List;", "getX5c", "()Ljava/util/List;", "x5c", "d", "Ljava/lang/String;", "getKid", "()Ljava/lang/String;", "kid", "q", "getAlg", "alg", "x", "getUse", "use", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingPublicKeyJwkRemote implements Parcelable {

    /* renamed from: c */
    private final List<String> f8860c;

    /* renamed from: d */
    private final String f8861d;

    /* renamed from: q */
    private final String f8862q;

    /* renamed from: x */
    private final String f8863x;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TicketingPublicKeyJwkRemote> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/identity/TicketingPublicKeyJwkRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingPublicKeyJwkRemote> serializer() {
            return TicketingPublicKeyJwkRemote$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<TicketingPublicKeyJwkRemote> {
        /* renamed from: a */
        public final TicketingPublicKeyJwkRemote createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new TicketingPublicKeyJwkRemote(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final TicketingPublicKeyJwkRemote[] newArray(int i10) {
            return new TicketingPublicKeyJwkRemote[i10];
        }
    }

    public /* synthetic */ TicketingPublicKeyJwkRemote(int i10, List list, String str, String str2, String str3, h1 h1Var) {
        if (15 != (i10 & 15)) {
            w0.a(i10, 15, TicketingPublicKeyJwkRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8860c = list;
        this.f8861d = str;
        this.f8862q = str2;
        this.f8863x = str3;
    }

    public TicketingPublicKeyJwkRemote(List<String> list, String str, String str2, String str3) {
        t.e(list, "x5c");
        t.e(str, "kid");
        t.e(str2, "alg");
        t.e(str3, "use");
        this.f8860c = list;
        this.f8861d = str;
        this.f8862q = str2;
        this.f8863x = str3;
    }

    @c
    public static final void a(TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingPublicKeyJwkRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.t(serialDescriptor, 0, new f(k1.f15181a), ticketingPublicKeyJwkRemote.f8860c);
        dVar.E(serialDescriptor, 1, ticketingPublicKeyJwkRemote.f8861d);
        dVar.E(serialDescriptor, 2, ticketingPublicKeyJwkRemote.f8862q);
        dVar.E(serialDescriptor, 3, ticketingPublicKeyJwkRemote.f8863x);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingPublicKeyJwkRemote)) {
            return false;
        }
        TicketingPublicKeyJwkRemote ticketingPublicKeyJwkRemote = (TicketingPublicKeyJwkRemote) obj;
        return t.a(this.f8860c, ticketingPublicKeyJwkRemote.f8860c) && t.a(this.f8861d, ticketingPublicKeyJwkRemote.f8861d) && t.a(this.f8862q, ticketingPublicKeyJwkRemote.f8862q) && t.a(this.f8863x, ticketingPublicKeyJwkRemote.f8863x);
    }

    public int hashCode() {
        return (((((this.f8860c.hashCode() * 31) + this.f8861d.hashCode()) * 31) + this.f8862q.hashCode()) * 31) + this.f8863x.hashCode();
    }

    public String toString() {
        List<String> list = this.f8860c;
        String str = this.f8861d;
        String str2 = this.f8862q;
        String str3 = this.f8863x;
        return "TicketingPublicKeyJwkRemote(x5c=" + list + ", kid=" + str + ", alg=" + str2 + ", use=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeStringList(this.f8860c);
        parcel.writeString(this.f8861d);
        parcel.writeString(this.f8862q);
        parcel.writeString(this.f8863x);
    }
}
