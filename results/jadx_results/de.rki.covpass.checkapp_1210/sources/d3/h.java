package d3;

import c4.a0;
import c4.b0;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes.dex */
public class h {
    public static void g(final c4.a aVar, final int i10, final c4.u uVar) {
        final int i11 = uVar.V3;
        ll.b.f(0, aVar.f6221x, new IntConsumer() { // from class: d3.b
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.r(c4.a.this, uVar, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void h(final c4.b bVar, final int i10, final c4.v vVar) {
        final int i11 = vVar.V3;
        ll.b.f(0, bVar.f6221x, new IntConsumer() { // from class: d3.c
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.m(c4.b.this, vVar, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void i(final c4.d dVar, final int i10, final c4.w wVar) {
        final int i11 = wVar.V3;
        ll.b.f(0, dVar.f6221x, new IntConsumer() { // from class: d3.d
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.n(c4.d.this, wVar, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void j(final c4.e eVar, final int i10, final c4.x xVar) {
        final int i11 = xVar.V3;
        ll.b.f(0, eVar.f6221x, new IntConsumer() { // from class: d3.e
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.p(c4.e.this, xVar, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void k(final c4.h hVar, final int i10, final a0 a0Var) {
        final int i11 = a0Var.V3;
        ll.b.f(0, hVar.f6221x, new IntConsumer() { // from class: d3.f
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.o(c4.h.this, a0Var, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static void l(final c4.i iVar, final int i10, final b0 b0Var) {
        final int i11 = b0Var.V3;
        ll.b.f(0, iVar.f6221x, new IntConsumer() { // from class: d3.g
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                h.q(c4.i.this, b0Var, i10, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }

    public static /* synthetic */ void m(c4.b bVar, c4.v vVar, int i10, int i11, int i12) {
        int j10 = bVar.j() + (bVar.k() * i12);
        int j11 = vVar.j() + (i12 * vVar.k()) + i10;
        int i13 = ((vVar.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            vVar.W3[j11] = bVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }

    public static /* synthetic */ void n(c4.d dVar, c4.w wVar, int i10, int i11, int i12) {
        int j10 = dVar.j() + (dVar.k() * i12);
        int j11 = wVar.j() + (i12 * wVar.k()) + i10;
        int i13 = ((wVar.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            wVar.W3[j11] = dVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }

    public static /* synthetic */ void o(c4.h hVar, a0 a0Var, int i10, int i11, int i12) {
        int j10 = hVar.j() + (hVar.k() * i12);
        int j11 = a0Var.j() + (i12 * a0Var.k()) + i10;
        int i13 = ((a0Var.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            a0Var.W3[j11] = hVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }

    public static /* synthetic */ void p(c4.e eVar, c4.x xVar, int i10, int i11, int i12) {
        int j10 = eVar.j() + (eVar.k() * i12);
        int j11 = xVar.j() + (i12 * xVar.k()) + i10;
        int i13 = ((xVar.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            xVar.W3[j11] = eVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }

    public static /* synthetic */ void q(c4.i iVar, b0 b0Var, int i10, int i11, int i12) {
        int j10 = iVar.j() + (iVar.k() * i12);
        int j11 = b0Var.j() + (i12 * b0Var.k()) + i10;
        int i13 = ((b0Var.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            b0Var.W3[j11] = iVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }

    public static /* synthetic */ void r(c4.a aVar, c4.u uVar, int i10, int i11, int i12) {
        int j10 = aVar.j() + (aVar.k() * i12);
        int j11 = uVar.j() + (i12 * uVar.k()) + i10;
        int i13 = ((uVar.f6220q * i11) + j11) - i10;
        while (j11 < i13) {
            uVar.W3[j11] = aVar.V3[j10];
            j11 += i11;
            j10++;
        }
    }
}
