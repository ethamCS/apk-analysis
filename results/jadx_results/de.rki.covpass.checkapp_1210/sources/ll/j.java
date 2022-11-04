package ll;

import java.util.Objects;
import java.util.concurrent.ForkJoinTask;
/* loaded from: classes3.dex */
public class j extends ForkJoinTask<Void> {
    j U3;

    /* renamed from: c */
    final int f16117c;

    /* renamed from: d */
    final int f16118d;

    /* renamed from: q */
    final int f16119q;

    /* renamed from: x */
    final int f16120x;

    /* renamed from: y */
    final g f16121y;

    public j(int i10, int i11, int i12, int i13, g gVar) {
        this.f16120x = i10;
        this.f16117c = i11;
        this.f16118d = i12;
        this.f16119q = i13;
        this.f16121y = gVar;
    }

    public j(int i10, int i11, int i12, g gVar) {
        this(-1, i10, i11, i12, gVar);
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
        int i10 = this.f16118d;
        int i11 = this.f16117c;
        int i12 = this.f16119q;
        int i13 = (i10 - i11) / i12;
        int i14 = this.f16120x;
        if (i14 == -1) {
            int i15 = 0;
            j jVar = null;
            j jVar2 = null;
            while (i15 < i13 - 1) {
                j jVar3 = new j(i15, this.f16117c, this.f16118d, this.f16119q, this.f16121y);
                if (jVar == null) {
                    jVar = jVar3;
                } else {
                    Objects.requireNonNull(jVar2);
                    jVar2.U3 = jVar3;
                }
                jVar3.fork();
                i15++;
                jVar2 = jVar3;
            }
            this.f16121y.a((i15 * this.f16119q) + this.f16117c, this.f16118d);
            while (jVar != null) {
                jVar.join();
                jVar = jVar.U3;
            }
        } else {
            int i16 = (i14 * i12) + i11;
            this.f16121y.a(i16, i12 + i16);
        }
        return true;
    }
}
