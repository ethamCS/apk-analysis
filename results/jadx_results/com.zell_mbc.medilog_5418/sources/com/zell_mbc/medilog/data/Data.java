package com.zell_mbc.medilog.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MediLogDB.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013¨\u00061"}, d2 = {"Lcom/zell_mbc/medilog/data/Data;", "", "_id", "", "timestamp", "", "comment", "", "type", "value1", "value2", "value3", "value4", "(IJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()I", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getType", "setType", "(I)V", "getValue1", "setValue1", "getValue2", "setValue2", "getValue3", "setValue3", "getValue4", "setValue4", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Data {
    public static final int $stable = 8;
    private final int _id;
    private String comment;
    private long timestamp;
    private int type;
    private String value1;
    private String value2;
    private String value3;
    private String value4;

    public final int component1() {
        return this._id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.comment;
    }

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.value1;
    }

    public final String component6() {
        return this.value2;
    }

    public final String component7() {
        return this.value3;
    }

    public final String component8() {
        return this.value4;
    }

    public final Data copy(int i, long j, String comment, int i2, String value1, String value2, String value3, String value4) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(value1, "value1");
        Intrinsics.checkNotNullParameter(value2, "value2");
        Intrinsics.checkNotNullParameter(value3, "value3");
        Intrinsics.checkNotNullParameter(value4, "value4");
        return new Data(i, j, comment, i2, value1, value2, value3, value4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return this._id == data._id && this.timestamp == data.timestamp && Intrinsics.areEqual(this.comment, data.comment) && this.type == data.type && Intrinsics.areEqual(this.value1, data.value1) && Intrinsics.areEqual(this.value2, data.value2) && Intrinsics.areEqual(this.value3, data.value3) && Intrinsics.areEqual(this.value4, data.value4);
    }

    public int hashCode() {
        return (((((((((((((this._id * 31) + Data$$ExternalSyntheticBackport0.m(this.timestamp)) * 31) + this.comment.hashCode()) * 31) + this.type) * 31) + this.value1.hashCode()) * 31) + this.value2.hashCode()) * 31) + this.value3.hashCode()) * 31) + this.value4.hashCode();
    }

    public String toString() {
        int i = this._id;
        long j = this.timestamp;
        String str = this.comment;
        int i2 = this.type;
        String str2 = this.value1;
        String str3 = this.value2;
        String str4 = this.value3;
        String str5 = this.value4;
        return "Data(_id=" + i + ", timestamp=" + j + ", comment=" + str + ", type=" + i2 + ", value1=" + str2 + ", value2=" + str3 + ", value3=" + str4 + ", value4=" + str5 + ")";
    }

    public Data(int i, long j, String comment, int i2, String value1, String value2, String value3, String value4) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(value1, "value1");
        Intrinsics.checkNotNullParameter(value2, "value2");
        Intrinsics.checkNotNullParameter(value3, "value3");
        Intrinsics.checkNotNullParameter(value4, "value4");
        this._id = i;
        this.timestamp = j;
        this.comment = comment;
        this.type = i2;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public /* synthetic */ Data(int i, long j, String str, int i2, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i3 & 4) != 0 ? "" : str, i2, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? "" : str5);
    }

    public final int get_id() {
        return this._id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.comment = str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String getValue1() {
        return this.value1;
    }

    public final void setValue1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value1 = str;
    }

    public final String getValue2() {
        return this.value2;
    }

    public final void setValue2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value2 = str;
    }

    public final String getValue3() {
        return this.value3;
    }

    public final void setValue3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value3 = str;
    }

    public final String getValue4() {
        return this.value4;
    }

    public final void setValue4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value4 = str;
    }
}
