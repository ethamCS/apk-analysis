package ib;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004BQ\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\bHÖ\u0003¨\u0006\u0019"}, d2 = {"Lib/b;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "toString", "hashCode", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "equals", "seconds", "minutes", "hours", "Lib/d;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lib/c;", "month", "year", BuildConfig.FLAVOR, "timestamp", "<init>", "(IIILib/d;IILib/c;IJ)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements Comparable<b> {
    public static final a Companion = new a(null);
    private static final b Y3 = ib.a.a(0L);
    private final int U3;
    private final c V3;
    private final int W3;
    private final long X3;

    /* renamed from: c */
    private final int f12469c;

    /* renamed from: d */
    private final int f12470d;

    /* renamed from: q */
    private final int f12471q;

    /* renamed from: x */
    private final d f12472x;

    /* renamed from: y */
    private final int f12473y;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lib/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(int i10, int i11, int i12, d dVar, int i13, int i14, c cVar, int i15, long j10) {
        t.e(dVar, "dayOfWeek");
        t.e(cVar, "month");
        this.f12469c = i10;
        this.f12470d = i11;
        this.f12471q = i12;
        this.f12472x = dVar;
        this.f12473y = i13;
        this.U3 = i14;
        this.V3 = cVar;
        this.W3 = i15;
        this.X3 = j10;
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        t.e(bVar, "other");
        return t.g(this.X3, bVar.X3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12469c == bVar.f12469c && this.f12470d == bVar.f12470d && this.f12471q == bVar.f12471q && this.f12472x == bVar.f12472x && this.f12473y == bVar.f12473y && this.U3 == bVar.U3 && this.V3 == bVar.V3 && this.W3 == bVar.W3 && this.X3 == bVar.X3;
    }

    public int hashCode() {
        return (((((((((((((((this.f12469c * 31) + this.f12470d) * 31) + this.f12471q) * 31) + this.f12472x.hashCode()) * 31) + this.f12473y) * 31) + this.U3) * 31) + this.V3.hashCode()) * 31) + this.W3) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.X3);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.f12469c + ", minutes=" + this.f12470d + ", hours=" + this.f12471q + ", dayOfWeek=" + this.f12472x + ", dayOfMonth=" + this.f12473y + ", dayOfYear=" + this.U3 + ", month=" + this.V3 + ", year=" + this.W3 + ", timestamp=" + this.X3 + ')';
    }
}
