package j$.time.temporal;

import j$.time.LocalDate;
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ r f13177a = new r();

    private /* synthetic */ r() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (temporalAccessor.c(chronoField)) {
            return LocalDate.ofEpochDay(temporalAccessor.h(chronoField));
        }
        return null;
    }
}
