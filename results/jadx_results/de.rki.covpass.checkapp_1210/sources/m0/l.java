package m0;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class l extends e {
    public ArrayList<e> L0 = new ArrayList<>();

    public void a(e eVar) {
        this.L0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).q1(eVar);
        }
        eVar.Z0(this);
    }

    public ArrayList<e> o1() {
        return this.L0;
    }

    public void p1() {
        ArrayList<e> arrayList = this.L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            if (eVar instanceof l) {
                ((l) eVar).p1();
            }
        }
    }

    public void q1(e eVar) {
        this.L0.remove(eVar);
        eVar.r0();
    }

    @Override // m0.e
    public void r0() {
        this.L0.clear();
        super.r0();
    }

    public void r1() {
        this.L0.clear();
    }

    @Override // m0.e
    public void t0(j0.c cVar) {
        super.t0(cVar);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).t0(cVar);
        }
    }
}
