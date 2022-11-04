package q2;

import j$.util.function.IntConsumer;
import java.util.Objects;
import q2.s;
/* loaded from: classes.dex */
public class v extends s {
    public v(x3.b bVar, float f10, boolean z10, s.e eVar) {
        super(bVar, f10, z10, eVar);
    }

    public /* synthetic */ void f(c4.a aVar, c4.l lVar, int i10) {
        int i11 = this.f19574i.f6220q * i10;
        int i12 = aVar.f6218c + (aVar.f6219d * i10);
        int i13 = lVar.f6218c + (i10 * lVar.f6219d);
        int i14 = 0;
        while (i14 < aVar.f6220q) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar.V3[i13] = (byte) (aVar.V3[i12] <= this.f19579n.a(this.f19571f.V3[i11], this.f19574i.V3[i11]) ? 1 : 0);
            i14++;
            i11++;
            i13 = i15;
            i12 = i16;
        }
    }

    public /* synthetic */ void g(c4.a aVar, c4.l lVar, int i10) {
        int i11 = this.f19574i.f6220q * i10;
        int i12 = aVar.f6218c + (aVar.f6219d * i10);
        int i13 = lVar.f6218c + (i10 * lVar.f6219d);
        int i14 = 0;
        while (i14 < aVar.f6220q) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            lVar.V3[i13] = (byte) (aVar.V3[i12] >= this.f19579n.a(this.f19571f.V3[i11], this.f19574i.V3[i11]) ? 1 : 0);
            i14++;
            i11++;
            i13 = i15;
            i12 = i16;
        }
    }

    @Override // q2.s
    protected void b(final c4.a aVar, final c4.l lVar) {
        IntConsumer intConsumer;
        int i10;
        if (this.f19568c) {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: q2.u
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    v.this.f(aVar, lVar, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        } else {
            i10 = aVar.f6221x;
            intConsumer = new IntConsumer() { // from class: q2.t
                @Override // j$.util.function.IntConsumer
                public final void accept(int i11) {
                    v.this.g(aVar, lVar, i11);
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return Objects.requireNonNull(intConsumer2);
                }
            };
        }
        ll.b.f(0, i10, intConsumer);
    }
}
