package j$.util.stream;

import j$.util.Spliterator;
import java.util.Objects;
/* loaded from: classes2.dex */
abstract class Z implements M3, N3 {

    /* renamed from: a */
    private final boolean f13586a;

    public Z(boolean z10) {
        this.f13586a = z10;
    }

    public /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.M3
    public final int b() {
        if (this.f13586a) {
            return 0;
        }
        return EnumC0539d3.f13665r;
    }

    public /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    public /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.stream.M3
    public final Object e(D0 d02, Spliterator spliterator) {
        (this.f13586a ? new C0521a0(d02, spliterator, this) : new C0526b0(d02, spliterator, d02.V0(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.M3
    public final Object f(D0 d02, Spliterator spliterator) {
        Objects.requireNonNull((Z) d02.U0(this, spliterator));
        return null;
    }

    @Override // j$.util.function.I
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void u(long j10) {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
