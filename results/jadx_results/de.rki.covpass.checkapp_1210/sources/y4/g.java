package y4;

import j$.time.ZonedDateTime;
import j$.util.function.ToIntFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ToIntFunction {

    /* renamed from: a */
    public static final /* synthetic */ g f25802a = new g();

    private /* synthetic */ g() {
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((ZonedDateTime) obj).getNano();
    }
}
