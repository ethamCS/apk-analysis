package y4;

import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import j$.time.OffsetDateTime;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ f f25801a = new f();

    private /* synthetic */ f() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        long lambda$new$0;
        lambda$new$0 = OffsetDateTimeSerializer.lambda$new$0((OffsetDateTime) obj);
        return lambda$new$0;
    }
}
