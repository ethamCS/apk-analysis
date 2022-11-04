package y4;

import j$.time.Instant;
import j$.util.function.ToIntFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ToIntFunction {

    /* renamed from: a */
    public static final /* synthetic */ a f25796a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Instant) obj).getNano();
    }
}
