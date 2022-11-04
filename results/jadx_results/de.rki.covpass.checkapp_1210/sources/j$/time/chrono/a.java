package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class a implements e {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    public final void b(Map map, ChronoField chronoField, long j10) {
        Long l10 = (Long) map.get(chronoField);
        if (l10 == null || l10.longValue() == j10) {
            map.put(chronoField, Long.valueOf(j10));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l10 + " differs from " + chronoField + " " + j10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Objects.requireNonNull((e) obj);
        return 0;
    }

    public final ChronoLocalDate d(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12) {
        long j13;
        LocalDate i10 = ((LocalDate) chronoLocalDate).i(j10, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        LocalDate i11 = i10.i(j11, chronoUnit);
        if (j12 <= 7) {
            if (j12 < 1) {
                i11 = i11.i(j$.time.c.f(j12, 7L) / 7, chronoUnit);
                j13 = j12 + 6;
            }
            return i11.H(k.f(j$.time.d.p((int) j12)));
        }
        j13 = j12 - 1;
        i11 = i11.i(j13 / 7, chronoUnit);
        j12 = (j13 % 7) + 1;
        return i11.H(k.f(j$.time.d.p((int) j12)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        Objects.requireNonNull((a) obj);
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
