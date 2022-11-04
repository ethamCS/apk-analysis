package j$.time.temporal;
/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal b(i iVar);

    Temporal d(TemporalField temporalField, long j10);

    Temporal i(long j10, TemporalUnit temporalUnit);

    long l(Temporal temporal, TemporalUnit temporalUnit);
}
