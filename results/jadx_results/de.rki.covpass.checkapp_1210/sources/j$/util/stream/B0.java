package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
public final class B0 implements M3 {

    /* renamed from: a */
    private final int f13417a;

    /* renamed from: b */
    final A0 f13418b;

    /* renamed from: c */
    final j$.util.function.I f13419c;

    public B0(int i10, A0 a02, j$.util.function.I i11) {
        this.f13417a = i10;
        this.f13418b = a02;
        this.f13419c = i11;
    }

    @Override // j$.util.stream.M3
    public final int b() {
        return EnumC0539d3.f13668u | EnumC0539d3.f13665r;
    }

    @Override // j$.util.stream.M3
    public final Object e(D0 d02, Spliterator spliterator) {
        return (Boolean) new C0(this, d02, spliterator).invoke();
    }

    @Override // j$.util.stream.M3
    public final Object f(D0 d02, Spliterator spliterator) {
        return Boolean.valueOf(((AbstractC0636z0) d02.U0((AbstractC0636z0) this.f13419c.get(), spliterator)).f13841b);
    }
}
