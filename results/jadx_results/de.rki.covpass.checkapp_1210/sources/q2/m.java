package q2;

import c4.n;
import c4.q;
import j$.util.function.IntConsumer;
import java.util.Objects;
import q2.g;
/* loaded from: classes.dex */
public class m<T extends c4.q<T>, S extends c4.n<S>> extends g<T, S> {
    public m(g.a<T, S> aVar, x3.b bVar, boolean z10, Class<T> cls) {
        super(aVar, bVar, z10, cls);
    }

    public /* synthetic */ void j(c4.q qVar, c4.l lVar, int i10) {
        g.a<T, S> a10 = this.f19521h.a();
        a10.b(this.f19517d, this.f19518e, this.f19519f);
        int i11 = 0;
        while (true) {
            S s10 = this.f19515b;
            if (i11 < s10.f6220q) {
                a10.d(i11, i10, qVar, s10, lVar);
                i11++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ void k(int i10, int i11, int i12, c4.q qVar, int i13) {
        g.a<T, S> a10 = this.f19521h.a();
        a10.b(this.f19517d, this.f19518e, this.f19519f);
        int i14 = this.f19518e;
        int i15 = i13 * i14;
        int i16 = (i15 / i14) * i10;
        int i17 = 0;
        int i18 = i16;
        while (i17 < i11) {
            a10.c(i17, i15, this.f19517d, this.f19518e, i18, qVar, this.f19515b);
            i17 += this.f19517d;
            i18 += i12;
        }
        int i19 = qVar.f6220q;
        if (i11 != i19) {
            a10.c(i11, i15, i19 - i11, this.f19518e, i18, qVar, this.f19515b);
        }
        this.f19521h.b(a10);
    }

    @Override // q2.g
    protected void c(final T t10, final c4.l lVar) {
        ll.b.f(0, this.f19515b.f6221x, new IntConsumer() { // from class: q2.l
            @Override // j$.util.function.IntConsumer
            public final void accept(int i10) {
                m.this.j(t10, lVar, i10);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    @Override // q2.g
    protected void d(final T t10, final int i10, int i11) {
        int i12 = i10;
        final int h10 = this.f19515b.h().h();
        final int i13 = this.f19515b.f6219d;
        int i14 = this.f19518e;
        int i15 = i11 / i14;
        if (i14 * i15 < i11) {
            i15++;
        }
        int i16 = 0;
        ll.b.f(0, i15, new IntConsumer() { // from class: q2.k
            @Override // j$.util.function.IntConsumer
            public final void accept(int i17) {
                m.this.k(i13, i10, h10, t10, i17);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
        if (i11 != t10.f6221x) {
            g.a<T, S> a10 = this.f19521h.a();
            a10.b(this.f19517d, this.f19518e, this.f19519f);
            int i17 = (i11 / this.f19518e) * i13;
            int i18 = t10.f6221x - i11;
            while (i16 < i12) {
                a10.c(i16, i11, this.f19517d, i18, i17, t10, this.f19515b);
                i16 += this.f19517d;
                i17 += h10;
                i12 = i12;
            }
            int i19 = i12;
            int i20 = t10.f6220q;
            if (i19 == i20) {
                return;
            }
            a10.c(i10, i11, i20 - i19, i18, i17, t10, this.f19515b);
        }
    }
}
