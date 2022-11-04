package de.rki.covpass.sdk.ticketing.data.validate;

import android.os.Parcel;
import android.os.Parcelable;
import fc.c;
import hc.t;
import jf.d;
import kf.h1;
import kf.s;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b#\u0010$BC\b\u0017\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006+"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/BookingPortalValidationResponseResultItem;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "d", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "q", "getDetails", "details", "x", "getType", "type", "Lx9/a;", "result", "<init>", "(Lx9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILx9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class BookingPortalValidationResponseResultItem implements Parcelable {

    /* renamed from: c */
    private final x9.a f8875c;

    /* renamed from: d */
    private final String f8876d;

    /* renamed from: q */
    private final String f8877q;

    /* renamed from: x */
    private final String f8878x;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BookingPortalValidationResponseResultItem> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/BookingPortalValidationResponseResultItem$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/validate/BookingPortalValidationResponseResultItem;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BookingPortalValidationResponseResultItem> serializer() {
            return BookingPortalValidationResponseResultItem$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<BookingPortalValidationResponseResultItem> {
        /* renamed from: a */
        public final BookingPortalValidationResponseResultItem createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new BookingPortalValidationResponseResultItem(x9.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BookingPortalValidationResponseResultItem[] newArray(int i10) {
            return new BookingPortalValidationResponseResultItem[i10];
        }
    }

    public /* synthetic */ BookingPortalValidationResponseResultItem(int i10, x9.a aVar, String str, String str2, String str3, h1 h1Var) {
        if (15 != (i10 & 15)) {
            w0.a(i10, 15, BookingPortalValidationResponseResultItem$$serializer.INSTANCE.getDescriptor());
        }
        this.f8875c = aVar;
        this.f8876d = str;
        this.f8877q = str2;
        this.f8878x = str3;
    }

    public BookingPortalValidationResponseResultItem(x9.a aVar, String str, String str2, String str3) {
        t.e(aVar, "result");
        t.e(str, "identifier");
        t.e(str2, "details");
        t.e(str3, "type");
        this.f8875c = aVar;
        this.f8876d = str;
        this.f8877q = str2;
        this.f8878x = str3;
    }

    @c
    public static final void a(BookingPortalValidationResponseResultItem bookingPortalValidationResponseResultItem, d dVar, SerialDescriptor serialDescriptor) {
        t.e(bookingPortalValidationResponseResultItem, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.t(serialDescriptor, 0, new s("de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResult", x9.a.values()), bookingPortalValidationResponseResultItem.f8875c);
        dVar.E(serialDescriptor, 1, bookingPortalValidationResponseResultItem.f8876d);
        dVar.E(serialDescriptor, 2, bookingPortalValidationResponseResultItem.f8877q);
        dVar.E(serialDescriptor, 3, bookingPortalValidationResponseResultItem.f8878x);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingPortalValidationResponseResultItem)) {
            return false;
        }
        BookingPortalValidationResponseResultItem bookingPortalValidationResponseResultItem = (BookingPortalValidationResponseResultItem) obj;
        return this.f8875c == bookingPortalValidationResponseResultItem.f8875c && t.a(this.f8876d, bookingPortalValidationResponseResultItem.f8876d) && t.a(this.f8877q, bookingPortalValidationResponseResultItem.f8877q) && t.a(this.f8878x, bookingPortalValidationResponseResultItem.f8878x);
    }

    public int hashCode() {
        return (((((this.f8875c.hashCode() * 31) + this.f8876d.hashCode()) * 31) + this.f8877q.hashCode()) * 31) + this.f8878x.hashCode();
    }

    public String toString() {
        x9.a aVar = this.f8875c;
        String str = this.f8876d;
        String str2 = this.f8877q;
        String str3 = this.f8878x;
        return "BookingPortalValidationResponseResultItem(result=" + aVar + ", identifier=" + str + ", details=" + str2 + ", type=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(this.f8875c.name());
        parcel.writeString(this.f8876d);
        parcel.writeString(this.f8877q);
        parcel.writeString(this.f8878x);
    }
}
