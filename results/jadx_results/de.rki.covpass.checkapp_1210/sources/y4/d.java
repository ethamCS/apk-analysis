package y4;

import j$.time.OffsetDateTime;
import j$.util.function.ToIntFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ToIntFunction {

    /* renamed from: a */
    public static final /* synthetic */ d f25799a = new d();

    private /* synthetic */ d() {
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((OffsetDateTime) obj).getNano();
    }
}
