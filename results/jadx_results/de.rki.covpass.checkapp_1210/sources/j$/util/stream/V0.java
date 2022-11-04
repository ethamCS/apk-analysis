package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BinaryOperator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
public class V0 extends AbstractC0545f {

    /* renamed from: h */
    protected final D0 f13565h;

    /* renamed from: i */
    protected final j$.util.function.y f13566i;

    /* renamed from: j */
    protected final BinaryOperator f13567j;

    public V0(D0 d02, Spliterator spliterator, j$.util.function.y yVar, BinaryOperator binaryOperator) {
        super(d02, spliterator);
        this.f13565h = d02;
        this.f13566i = yVar;
        this.f13567j = binaryOperator;
    }

    V0(V0 v02, Spliterator spliterator) {
        super(v02, spliterator);
        this.f13565h = v02.f13565h;
        this.f13566i = v02.f13566i;
        this.f13567j = v02.f13567j;
    }

    @Override // j$.util.stream.AbstractC0545f
    public final Object a() {
        H0 h02 = (H0) this.f13566i.p(this.f13565h.x0(this.f13686b));
        this.f13565h.U0(h02, this.f13686b);
        return h02.mo22a();
    }

    @Override // j$.util.stream.AbstractC0545f
    public final AbstractC0545f f(Spliterator spliterator) {
        return new V0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            g((P0) this.f13567j.apply((P0) ((V0) this.f13688d).b(), (P0) ((V0) this.f13689e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
