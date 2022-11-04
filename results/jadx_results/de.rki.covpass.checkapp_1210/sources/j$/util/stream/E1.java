package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
public abstract class E1 extends CountedCompleter {

    /* renamed from: a */
    protected final P0 f13442a;

    /* renamed from: b */
    protected final int f13443b;

    public E1(E1 e12, P0 p02, int i10) {
        super(e12);
        this.f13442a = p02;
        this.f13443b = i10;
    }

    public E1(P0 p02) {
        this.f13442a = p02;
        this.f13443b = 0;
    }

    abstract void a();

    abstract E1 b(int i10, int i11);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        E1 e12 = this;
        while (e12.f13442a.p() != 0) {
            e12.setPendingCount(e12.f13442a.p() - 1);
            int i10 = 0;
            int i11 = 0;
            while (i10 < e12.f13442a.p() - 1) {
                E1 b10 = e12.b(i10, e12.f13443b + i11);
                i11 = (int) (i11 + b10.f13442a.count());
                b10.fork();
                i10++;
            }
            e12 = e12.b(i10, e12.f13443b + i11);
        }
        e12.a();
        e12.propagateCompletion();
    }
}
