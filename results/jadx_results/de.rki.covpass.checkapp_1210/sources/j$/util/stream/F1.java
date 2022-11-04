package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
public final class F1 extends AbstractC0523a2 {

    /* renamed from: b */
    public final /* synthetic */ int f13447b;

    /* renamed from: c */
    final /* synthetic */ Object f13448c;

    /* renamed from: d */
    final /* synthetic */ Object f13449d;

    /* renamed from: e */
    final /* synthetic */ Object f13450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        super(i10);
        this.f13447b = i11;
        this.f13448c = obj;
        this.f13450e = obj2;
        this.f13449d = obj3;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        switch (this.f13447b) {
            case 0:
                return new G1((j$.util.function.I) this.f13449d, (j$.util.function.F) this.f13450e, (BinaryOperator) this.f13448c);
            case 1:
                return new L1((j$.util.function.I) this.f13449d, (j$.util.function.D) this.f13450e, (BinaryOperator) this.f13448c);
            case 2:
                return new M1(this.f13449d, (BiFunction) this.f13450e, (BinaryOperator) this.f13448c);
            case 3:
                return new Q1((j$.util.function.I) this.f13449d, (BiConsumer) this.f13450e, (BiConsumer) this.f13448c);
            default:
                return new U1((j$.util.function.I) this.f13449d, (j$.util.function.E) this.f13450e, (BinaryOperator) this.f13448c);
        }
    }
}
