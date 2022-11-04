package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.i;
import j$.time.temporal.l;
/* loaded from: classes2.dex */
public interface ChronoLocalDate extends Temporal, i, Comparable<ChronoLocalDate> {
    void a();

    @Override // j$.time.temporal.TemporalAccessor
    boolean c(TemporalField temporalField);

    boolean equals(Object obj);

    b j(LocalTime localTime);

    ChronoLocalDate n(l lVar);

    long toEpochDay();
}
