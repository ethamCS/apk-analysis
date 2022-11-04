package y4;

import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import j$.time.ZonedDateTime;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ h f25803a = new h();

    private /* synthetic */ h() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        long lambda$new$0;
        lambda$new$0 = ZonedDateTimeSerializer.lambda$new$0((ZonedDateTime) obj);
        return lambda$new$0;
    }
}
