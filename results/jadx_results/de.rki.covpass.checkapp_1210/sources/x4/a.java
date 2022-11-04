package x4;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ a f25388a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
