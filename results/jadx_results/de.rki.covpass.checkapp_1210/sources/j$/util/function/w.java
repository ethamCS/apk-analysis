package j$.util.function;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements x {

    /* renamed from: a */
    final /* synthetic */ LongConsumer f13381a;

    private /* synthetic */ w(LongConsumer longConsumer) {
        this.f13381a = longConsumer;
    }

    public static /* synthetic */ x b(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new w(longConsumer);
    }

    @Override // j$.util.function.x
    public final /* synthetic */ void d(long j10) {
        this.f13381a.accept(j10);
    }
}
