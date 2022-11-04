package de.rki.covpass.sdk.cert.models;

import android.os.Parcel;
import android.os.Parcelable;
import hc.t;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b(\u0010)BW\b\u0017\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019¨\u00060"}, d2 = {"Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "i", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "c", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "transactionNumber", "d", "kid", "q", "getRValueSignature", "rValueSignature", "x", "issuingCountry", "y", "a", "dateOfIssue", "U3", "e", "technicalExpiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class ExpertModeData implements Parcelable {
    private final String U3;

    /* renamed from: c */
    private final String f8670c;

    /* renamed from: d */
    private final String f8671d;

    /* renamed from: q */
    private final String f8672q;

    /* renamed from: x */
    private final String f8673x;

    /* renamed from: y */
    private final String f8674y;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExpertModeData> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/ExpertModeData$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExpertModeData> serializer() {
            return ExpertModeData$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<ExpertModeData> {
        /* renamed from: a */
        public final ExpertModeData createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new ExpertModeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ExpertModeData[] newArray(int i10) {
            return new ExpertModeData[i10];
        }
    }

    public /* synthetic */ ExpertModeData(int i10, String str, String str2, String str3, String str4, String str5, String str6, h1 h1Var) {
        if (63 != (i10 & 63)) {
            w0.a(i10, 63, ExpertModeData$$serializer.INSTANCE.getDescriptor());
        }
        this.f8670c = str;
        this.f8671d = str2;
        this.f8672q = str3;
        this.f8673x = str4;
        this.f8674y = str5;
        this.U3 = str6;
    }

    public ExpertModeData(String str, String str2, String str3, String str4, String str5, String str6) {
        t.e(str, "transactionNumber");
        t.e(str2, "kid");
        t.e(str3, "rValueSignature");
        t.e(str4, "issuingCountry");
        t.e(str5, "dateOfIssue");
        t.e(str6, "technicalExpiryDate");
        this.f8670c = str;
        this.f8671d = str2;
        this.f8672q = str3;
        this.f8673x = str4;
        this.f8674y = str5;
        this.U3 = str6;
    }

    @fc.c
    public static final void i(ExpertModeData expertModeData, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(expertModeData, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, expertModeData.f8670c);
        dVar.E(serialDescriptor, 1, expertModeData.f8671d);
        dVar.E(serialDescriptor, 2, expertModeData.f8672q);
        dVar.E(serialDescriptor, 3, expertModeData.f8673x);
        dVar.E(serialDescriptor, 4, expertModeData.f8674y);
        dVar.E(serialDescriptor, 5, expertModeData.U3);
    }

    public final String a() {
        return this.f8674y;
    }

    public final String c() {
        return this.f8673x;
    }

    public final String d() {
        return this.f8671d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.U3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpertModeData)) {
            return false;
        }
        ExpertModeData expertModeData = (ExpertModeData) obj;
        return t.a(this.f8670c, expertModeData.f8670c) && t.a(this.f8671d, expertModeData.f8671d) && t.a(this.f8672q, expertModeData.f8672q) && t.a(this.f8673x, expertModeData.f8673x) && t.a(this.f8674y, expertModeData.f8674y) && t.a(this.U3, expertModeData.U3);
    }

    public final String f() {
        return this.f8670c;
    }

    public int hashCode() {
        return (((((((((this.f8670c.hashCode() * 31) + this.f8671d.hashCode()) * 31) + this.f8672q.hashCode()) * 31) + this.f8673x.hashCode()) * 31) + this.f8674y.hashCode()) * 31) + this.U3.hashCode();
    }

    public String toString() {
        String str = this.f8670c;
        String str2 = this.f8671d;
        String str3 = this.f8672q;
        String str4 = this.f8673x;
        String str5 = this.f8674y;
        String str6 = this.U3;
        return "ExpertModeData(transactionNumber=" + str + ", kid=" + str2 + ", rValueSignature=" + str3 + ", issuingCountry=" + str4 + ", dateOfIssue=" + str5 + ", technicalExpiryDate=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(this.f8670c);
        parcel.writeString(this.f8671d);
        parcel.writeString(this.f8672q);
        parcel.writeString(this.f8673x);
        parcel.writeString(this.f8674y);
        parcel.writeString(this.U3);
    }
}
