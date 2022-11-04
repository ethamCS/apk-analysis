package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.b2 */
/* loaded from: classes2.dex */
public final class C0528b2 extends AbstractC0545f {

    /* renamed from: h */
    private final AbstractC0523a2 f13630h;

    public C0528b2(AbstractC0523a2 abstractC0523a2, D0 d02, Spliterator spliterator) {
        super(d02, spliterator);
        this.f13630h = abstractC0523a2;
    }

    C0528b2(C0528b2 c0528b2, Spliterator spliterator) {
        super(c0528b2, spliterator);
        this.f13630h = c0528b2.f13630h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0545f
    public final Object a() {
        D0 d02 = this.f13685a;
        Y1 a10 = this.f13630h.a();
        d02.U0(a10, this.f13686b);
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0545f
    public final AbstractC0545f f(Spliterator spliterator) {
        return new C0528b2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            Y1 y12 = (Y1) ((C0528b2) this.f13688d).b();
            y12.l((Y1) ((C0528b2) this.f13689e).b());
            g(y12);
        }
        super.onCompletion(countedCompleter);
    }
}
