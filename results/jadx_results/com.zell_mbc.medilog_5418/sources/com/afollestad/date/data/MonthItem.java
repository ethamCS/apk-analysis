package com.afollestad.date.data;

import com.afollestad.date.data.snapshot.MonthSnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DayOfMonth.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/afollestad/date/data/MonthItem;", "", "()V", "DayOfMonth", "WeekHeader", "Lcom/afollestad/date/data/MonthItem$WeekHeader;", "Lcom/afollestad/date/data/MonthItem$DayOfMonth;", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public abstract class MonthItem {
    private MonthItem() {
    }

    public /* synthetic */ MonthItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DayOfMonth.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/afollestad/date/data/MonthItem$WeekHeader;", "Lcom/afollestad/date/data/MonthItem;", "dayOfWeek", "Lcom/afollestad/date/data/DayOfWeek;", "(Lcom/afollestad/date/data/DayOfWeek;)V", "getDayOfWeek", "()Lcom/afollestad/date/data/DayOfWeek;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes2.dex */
    public static final class WeekHeader extends MonthItem {
        private final DayOfWeek dayOfWeek;

        public static /* synthetic */ WeekHeader copy$default(WeekHeader weekHeader, DayOfWeek dayOfWeek, int i, Object obj) {
            if ((i & 1) != 0) {
                dayOfWeek = weekHeader.dayOfWeek;
            }
            return weekHeader.copy(dayOfWeek);
        }

        public final DayOfWeek component1() {
            return this.dayOfWeek;
        }

        public final WeekHeader copy(DayOfWeek dayOfWeek) {
            Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
            return new WeekHeader(dayOfWeek);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof WeekHeader) && Intrinsics.areEqual(this.dayOfWeek, ((WeekHeader) obj).dayOfWeek);
            }
            return true;
        }

        public int hashCode() {
            DayOfWeek dayOfWeek = this.dayOfWeek;
            if (dayOfWeek != null) {
                return dayOfWeek.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WeekHeader(dayOfWeek=" + this.dayOfWeek + ")";
        }

        public final DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeekHeader(DayOfWeek dayOfWeek) {
            super(null);
            Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
            this.dayOfWeek = dayOfWeek;
        }
    }

    /* compiled from: DayOfMonth.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/afollestad/date/data/MonthItem$DayOfMonth;", "Lcom/afollestad/date/data/MonthItem;", "dayOfWeek", "Lcom/afollestad/date/data/DayOfWeek;", "month", "Lcom/afollestad/date/data/snapshot/MonthSnapshot;", "date", "", "isSelected", "", "(Lcom/afollestad/date/data/DayOfWeek;Lcom/afollestad/date/data/snapshot/MonthSnapshot;IZ)V", "getDate", "()I", "getDayOfWeek", "()Lcom/afollestad/date/data/DayOfWeek;", "()Z", "getMonth", "()Lcom/afollestad/date/data/snapshot/MonthSnapshot;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes2.dex */
    public static final class DayOfMonth extends MonthItem {
        private final int date;
        private final DayOfWeek dayOfWeek;
        private final boolean isSelected;
        private final MonthSnapshot month;

        public static /* synthetic */ DayOfMonth copy$default(DayOfMonth dayOfMonth, DayOfWeek dayOfWeek, MonthSnapshot monthSnapshot, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                dayOfWeek = dayOfMonth.dayOfWeek;
            }
            if ((i2 & 2) != 0) {
                monthSnapshot = dayOfMonth.month;
            }
            if ((i2 & 4) != 0) {
                i = dayOfMonth.date;
            }
            if ((i2 & 8) != 0) {
                z = dayOfMonth.isSelected;
            }
            return dayOfMonth.copy(dayOfWeek, monthSnapshot, i, z);
        }

        public final DayOfWeek component1() {
            return this.dayOfWeek;
        }

        public final MonthSnapshot component2() {
            return this.month;
        }

        public final int component3() {
            return this.date;
        }

        public final boolean component4() {
            return this.isSelected;
        }

        public final DayOfMonth copy(DayOfWeek dayOfWeek, MonthSnapshot month, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
            Intrinsics.checkParameterIsNotNull(month, "month");
            return new DayOfMonth(dayOfWeek, month, i, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DayOfMonth) {
                    DayOfMonth dayOfMonth = (DayOfMonth) obj;
                    if (Intrinsics.areEqual(this.dayOfWeek, dayOfMonth.dayOfWeek) && Intrinsics.areEqual(this.month, dayOfMonth.month)) {
                        if (this.date == dayOfMonth.date) {
                            if (this.isSelected == dayOfMonth.isSelected) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            DayOfWeek dayOfWeek = this.dayOfWeek;
            int i = 0;
            int hashCode = (dayOfWeek != null ? dayOfWeek.hashCode() : 0) * 31;
            MonthSnapshot monthSnapshot = this.month;
            if (monthSnapshot != null) {
                i = monthSnapshot.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + this.date) * 31;
            boolean z = this.isSelected;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            return "DayOfMonth(dayOfWeek=" + this.dayOfWeek + ", month=" + this.month + ", date=" + this.date + ", isSelected=" + this.isSelected + ")";
        }

        public final DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final MonthSnapshot getMonth() {
            return this.month;
        }

        public final int getDate() {
            return this.date;
        }

        public /* synthetic */ DayOfMonth(DayOfWeek dayOfWeek, MonthSnapshot monthSnapshot, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(dayOfWeek, monthSnapshot, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayOfMonth(DayOfWeek dayOfWeek, MonthSnapshot month, int i, boolean z) {
            super(null);
            Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
            Intrinsics.checkParameterIsNotNull(month, "month");
            this.dayOfWeek = dayOfWeek;
            this.month = month;
            this.date = i;
            this.isSelected = z;
        }
    }
}
