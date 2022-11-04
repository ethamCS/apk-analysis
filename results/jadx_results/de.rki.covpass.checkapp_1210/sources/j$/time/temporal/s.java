package j$.time.temporal;

import j$.time.LocalTime;
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ s f13178a = new s();

    private /* synthetic */ s() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        ChronoField chronoField = ChronoField.NANO_OF_DAY;
        if (temporalAccessor.c(chronoField)) {
            return LocalTime.s(temporalAccessor.h(chronoField));
        }
        return null;
    }
}
