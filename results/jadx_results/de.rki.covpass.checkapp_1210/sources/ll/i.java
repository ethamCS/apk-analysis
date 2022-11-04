package ll;

import java.util.Objects;
import java.util.concurrent.ForkJoinTask;
/* loaded from: classes3.dex */
public class i<T> extends ForkJoinTask<Void> {
    final d<T> U3;
    i<T> V3;

    /* renamed from: c */
    final int f16112c;

    /* renamed from: d */
    final int f16113d;

    /* renamed from: q */
    final int f16114q;

    /* renamed from: x */
    final int f16115x;

    /* renamed from: y */
    final h<T> f16116y;

    public i(int i10, int i11, int i12, int i13, d<T> dVar, h<T> hVar) {
        this.f16115x = i10;
        this.f16112c = i11;
        this.f16113d = i12;
        this.f16114q = i13;
        this.f16116y = hVar;
        this.U3 = dVar;
    }

    public i(int i10, int i11, int i12, d<T> dVar, h<T> hVar) {
        this(-1, i10, i11, i12, dVar, hVar);
    }

    /* renamed from: c */
    public Void getRawResult() {
        return null;
    }

    /* renamed from: e */
    public void setRawResult(Void r12) {
    }

    @Override // java.util.concurrent.ForkJoinTask
    protected boolean exec() {
        int i10;
        int i11 = this.f16113d;
        int i12 = this.f16112c;
        int i13 = this.f16114q;
        int i14 = (i11 - i12) / i13;
        int i15 = this.f16115x;
        if (i15 == -1) {
            this.U3.g(i14);
            int i16 = 0;
            i<T> iVar = null;
            i<T> iVar2 = null;
            while (true) {
                i10 = i14 - 1;
                if (i16 >= i10) {
                    break;
                }
                i<T> iVar3 = new i<>(i16, this.f16112c, this.f16113d, this.f16114q, this.U3, this.f16116y);
                if (iVar == null) {
                    iVar = iVar3;
                } else {
                    Objects.requireNonNull(iVar2);
                    iVar2.V3 = iVar3;
                }
                iVar3.fork();
                i16++;
                iVar2 = iVar3;
            }
            this.f16116y.a(this.U3.c(i10), (i16 * this.f16114q) + this.f16112c, this.f16113d);
            while (iVar != null) {
                iVar.join();
                iVar = iVar.V3;
            }
        } else {
            int i17 = (i15 * i13) + i12;
            this.f16116y.a(this.U3.c(i15), i17, i13 + i17);
        }
        return true;
    }
}
