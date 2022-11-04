package j$.util.stream;

import j$.util.function.AbstractC0501c;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
public final class J1 extends AbstractC0523a2 {

    /* renamed from: b */
    public final /* synthetic */ int f13475b;

    /* renamed from: c */
    final /* synthetic */ Object f13476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J1(int i10, Object obj, int i11) {
        super(i10);
        this.f13475b = i11;
        this.f13476c = obj;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        switch (this.f13475b) {
            case 0:
                return new K1((AbstractC0501c) this.f13476c);
            case 1:
                return new N1((BinaryOperator) this.f13476c);
            case 2:
                return new T1((j$.util.function.m) this.f13476c);
            default:
                return new X1((j$.util.function.v) this.f13476c);
        }
    }
}
