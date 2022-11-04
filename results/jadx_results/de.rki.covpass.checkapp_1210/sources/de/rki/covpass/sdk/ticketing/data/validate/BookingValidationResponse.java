package de.rki.covpass.sdk.ticketing.data.validate;

import android.os.Parcel;
import android.os.Parcelable;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B[\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010#\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u00100\u001a\u00020\u000b\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002010#¢\u0006\u0004\b9\u0010:Bw\b\u0017\u0012\u0006\u0010;\u001a\u00020\u000b\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010#\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\u0006\u00100\u001a\u00020\u000b\u0012\u0010\b\u0001\u00106\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010#\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019R\u0017\u00100\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\b\u0012\u0004\u0012\u0002010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010%\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010'¨\u0006A"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/BookingValidationResponse;", "Landroid/os/Parcelable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "d", "Ljava/lang/String;", "getSub", "()Ljava/lang/String;", "sub", "q", "getIss", "iss", "x", "Ljava/lang/Integer;", "getExp", "()Ljava/lang/Integer;", "exp", BuildConfig.FLAVOR, "y", "Ljava/util/List;", "getCategory", "()Ljava/util/List;", "category", "U3", "getConfirmation", "confirmation", "V3", "I", "getIat", "()I", "iat", "Lde/rki/covpass/sdk/ticketing/data/validate/BookingPortalValidationResponseResultItem;", "W3", "getResultValidations", "getResultValidations$annotations", "()V", "resultValidations", "Lx9/a;", "result", "<init>", "(Lx9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ILjava/util/List;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILx9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ILjava/util/List;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class BookingValidationResponse implements Parcelable {
    private final String U3;
    private final int V3;
    private final List<BookingPortalValidationResponseResultItem> W3;

    /* renamed from: c */
    private final x9.a f8879c;

    /* renamed from: d */
    private final String f8880d;

    /* renamed from: q */
    private final String f8881q;

    /* renamed from: x */
    private final Integer f8882x;

    /* renamed from: y */
    private final List<String> f8883y;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BookingValidationResponse> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/validate/BookingValidationResponse$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/validate/BookingValidationResponse;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BookingValidationResponse> serializer() {
            return BookingValidationResponse$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<BookingValidationResponse> {
        /* renamed from: a */
        public final BookingValidationResponse createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            x9.a valueOf = x9.a.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i10 = 0; i10 != readInt2; i10++) {
                arrayList.add(BookingPortalValidationResponseResultItem.CREATOR.createFromParcel(parcel));
            }
            return new BookingValidationResponse(valueOf, readString, readString2, valueOf2, createStringArrayList, readString3, readInt, arrayList);
        }

        /* renamed from: b */
        public final BookingValidationResponse[] newArray(int i10) {
            return new BookingValidationResponse[i10];
        }
    }

    public /* synthetic */ BookingValidationResponse(int i10, x9.a aVar, String str, String str2, Integer num, List list, String str3, int i11, List list2, h1 h1Var) {
        List<String> h10;
        if (231 != (i10 & 231)) {
            w0.a(i10, 231, BookingValidationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f8879c = aVar;
        this.f8880d = str;
        this.f8881q = str2;
        if ((i10 & 8) == 0) {
            this.f8882x = null;
        } else {
            this.f8882x = num;
        }
        if ((i10 & 16) == 0) {
            h10 = u.h();
            this.f8883y = h10;
        } else {
            this.f8883y = list;
        }
        this.U3 = str3;
        this.V3 = i11;
        this.W3 = list2;
    }

    public BookingValidationResponse(x9.a aVar, String str, String str2, Integer num, List<String> list, String str3, int i10, List<BookingPortalValidationResponseResultItem> list2) {
        t.e(aVar, "result");
        t.e(str, "sub");
        t.e(str2, "iss");
        t.e(str3, "confirmation");
        t.e(list2, "resultValidations");
        this.f8879c = aVar;
        this.f8880d = str;
        this.f8881q = str2;
        this.f8882x = num;
        this.f8883y = list;
        this.U3 = str3;
        this.V3 = i10;
        this.W3 = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (hc.t.a(r3, r4) == false) goto L12;
     */
    @fc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(de.rki.covpass.sdk.ticketing.data.validate.BookingValidationResponse r5, jf.d r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            hc.t.e(r5, r0)
            java.lang.String r0 = "output"
            hc.t.e(r6, r0)
            java.lang.String r0 = "serialDesc"
            hc.t.e(r7, r0)
            kf.s r0 = new kf.s
            x9.a[] r1 = x9.a.values()
            java.lang.String r2 = "de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResult"
            r0.<init>(r2, r1)
            x9.a r1 = r5.f8879c
            r2 = 0
            r6.t(r7, r2, r0, r1)
            java.lang.String r0 = r5.f8880d
            r1 = 1
            r6.E(r7, r1, r0)
            java.lang.String r0 = r5.f8881q
            r3 = 2
            r6.E(r7, r3, r0)
            r0 = 3
            boolean r3 = r6.p(r7, r0)
            if (r3 == 0) goto L35
        L33:
            r3 = r1
            goto L3b
        L35:
            java.lang.Integer r3 = r5.f8882x
            if (r3 == 0) goto L3a
            goto L33
        L3a:
            r3 = r2
        L3b:
            if (r3 == 0) goto L44
            kf.d0 r3 = kf.d0.f15152a
            java.lang.Integer r4 = r5.f8882x
            r6.m(r7, r0, r3, r4)
        L44:
            r0 = 4
            boolean r3 = r6.p(r7, r0)
            if (r3 == 0) goto L4d
        L4b:
            r2 = r1
            goto L5a
        L4d:
            java.util.List<java.lang.String> r3 = r5.f8883y
            java.util.List r4 = ub.s.h()
            boolean r3 = hc.t.a(r3, r4)
            if (r3 != 0) goto L5a
            goto L4b
        L5a:
            if (r2 == 0) goto L68
            kf.f r1 = new kf.f
            kf.k1 r2 = kf.k1.f15181a
            r1.<init>(r2)
            java.util.List<java.lang.String> r2 = r5.f8883y
            r6.m(r7, r0, r1, r2)
        L68:
            r0 = 5
            java.lang.String r1 = r5.U3
            r6.E(r7, r0, r1)
            r0 = 6
            int r1 = r5.V3
            r6.z(r7, r0, r1)
            r0 = 7
            kf.f r1 = new kf.f
            de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResultItem$$serializer r2 = de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResultItem$$serializer.INSTANCE
            r1.<init>(r2)
            java.util.List<de.rki.covpass.sdk.ticketing.data.validate.BookingPortalValidationResponseResultItem> r5 = r5.W3
            r6.t(r7, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.ticketing.data.validate.BookingValidationResponse.a(de.rki.covpass.sdk.ticketing.data.validate.BookingValidationResponse, jf.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingValidationResponse)) {
            return false;
        }
        BookingValidationResponse bookingValidationResponse = (BookingValidationResponse) obj;
        return this.f8879c == bookingValidationResponse.f8879c && t.a(this.f8880d, bookingValidationResponse.f8880d) && t.a(this.f8881q, bookingValidationResponse.f8881q) && t.a(this.f8882x, bookingValidationResponse.f8882x) && t.a(this.f8883y, bookingValidationResponse.f8883y) && t.a(this.U3, bookingValidationResponse.U3) && this.V3 == bookingValidationResponse.V3 && t.a(this.W3, bookingValidationResponse.W3);
    }

    public int hashCode() {
        int hashCode = ((((this.f8879c.hashCode() * 31) + this.f8880d.hashCode()) * 31) + this.f8881q.hashCode()) * 31;
        Integer num = this.f8882x;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.f8883y;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + this.U3.hashCode()) * 31) + this.V3) * 31) + this.W3.hashCode();
    }

    public String toString() {
        x9.a aVar = this.f8879c;
        String str = this.f8880d;
        String str2 = this.f8881q;
        Integer num = this.f8882x;
        List<String> list = this.f8883y;
        String str3 = this.U3;
        int i10 = this.V3;
        List<BookingPortalValidationResponseResultItem> list2 = this.W3;
        return "BookingValidationResponse(result=" + aVar + ", sub=" + str + ", iss=" + str2 + ", exp=" + num + ", category=" + list + ", confirmation=" + str3 + ", iat=" + i10 + ", resultValidations=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        t.e(parcel, "out");
        parcel.writeString(this.f8879c.name());
        parcel.writeString(this.f8880d);
        parcel.writeString(this.f8881q);
        Integer num = this.f8882x;
        if (num == null) {
            i11 = 0;
        } else {
            parcel.writeInt(1);
            i11 = num.intValue();
        }
        parcel.writeInt(i11);
        parcel.writeStringList(this.f8883y);
        parcel.writeString(this.U3);
        parcel.writeInt(this.V3);
        List<BookingPortalValidationResponseResultItem> list = this.W3;
        parcel.writeInt(list.size());
        for (BookingPortalValidationResponseResultItem bookingPortalValidationResponseResultItem : list) {
            bookingPortalValidationResponseResultItem.writeToParcel(parcel, i10);
        }
    }
}
