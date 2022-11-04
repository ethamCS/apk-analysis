package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ g f13135a = new g();

    private /* synthetic */ g() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalDate.s(temporalAccessor);
    }
}
