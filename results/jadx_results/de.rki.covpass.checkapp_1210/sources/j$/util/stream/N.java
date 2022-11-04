package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N implements M3 {

    /* renamed from: a */
    private final int f13505a;

    /* renamed from: b */
    final boolean f13506b;

    /* renamed from: c */
    final Object f13507c;

    /* renamed from: d */
    final Predicate f13508d;

    /* renamed from: e */
    final j$.util.function.I f13509e;

    public N(boolean z10, int i10, Object obj, Predicate predicate, j$.util.function.I i11) {
        this.f13506b = z10;
        this.f13505a = i10;
        this.f13507c = obj;
        this.f13508d = predicate;
        this.f13509e = i11;
    }

    @Override // j$.util.stream.M3
    public final int b() {
        return EnumC0539d3.f13668u | (this.f13506b ? 0 : EnumC0539d3.f13665r);
    }

    @Override // j$.util.stream.M3
    public final Object e(D0 d02, Spliterator spliterator) {
        return new U(this, d02, spliterator).invoke();
    }

    @Override // j$.util.stream.M3
    public final Object f(D0 d02, Spliterator spliterator) {
        N3 n32 = (N3) this.f13509e.get();
        d02.U0(n32, spliterator);
        Object obj = n32.get();
        return obj != null ? obj : this.f13507c;
    }
}
