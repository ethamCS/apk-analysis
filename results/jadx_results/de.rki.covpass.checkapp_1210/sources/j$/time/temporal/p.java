package j$.time.temporal;

import j$.time.ZoneOffset;
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ p f13175a = new p();

    private /* synthetic */ p() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        if (temporalAccessor.c(chronoField)) {
            return ZoneOffset.u(temporalAccessor.get(chronoField));
        }
        return null;
    }
}
