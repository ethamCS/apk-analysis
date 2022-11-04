package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.a2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0523a2 implements M3 {

    /* renamed from: a */
    private final int f13619a;

    public AbstractC0523a2(int i10) {
        this.f13619a = i10;
    }

    public abstract Y1 a();

    @Override // j$.util.stream.M3
    public /* synthetic */ int b() {
        return 0;
    }

    @Override // j$.util.stream.M3
    public final Object e(D0 d02, Spliterator spliterator) {
        return ((Y1) new C0528b2(this, d02, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.M3
    public final Object f(D0 d02, Spliterator spliterator) {
        Y1 a10 = a();
        d02.U0(a10, spliterator);
        return a10.get();
    }
}
