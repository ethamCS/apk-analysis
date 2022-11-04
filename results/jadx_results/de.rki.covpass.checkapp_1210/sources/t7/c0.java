package t7;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    private final ArrayList<ArrayList<o>> f21940a;

    public c0() {
        ArrayList<ArrayList<o>> arrayList = new ArrayList<>();
        this.f21940a = arrayList;
        arrayList.add(new ArrayList<>());
    }

    public void a(o oVar, int i10) {
        ArrayList<ArrayList<o>> arrayList = this.f21940a;
        boolean z10 = true;
        ArrayList<o> arrayList2 = arrayList.get(arrayList.size() - 1);
        if (arrayList2.size() >= 24 ? arrayList2.size() >= 256 ? arrayList2.size() >= 65536 ? i10 < 7 : i10 < 5 : i10 < 4 : i10 < 3) {
            z10 = false;
        }
        if (z10 || false) {
            arrayList2.add(oVar);
        }
    }

    public o b(u7.f fVar) {
        if (fVar.I1() >= 0) {
            if (!fVar.B()) {
                throw new h("Index " + fVar + " is bigger than supported ");
            }
            int s12 = fVar.s1();
            ArrayList<ArrayList<o>> arrayList = this.f21940a;
            ArrayList<o> arrayList2 = arrayList.get(arrayList.size() - 1);
            if (s12 < arrayList2.size()) {
                o oVar = arrayList2.get(s12);
                return oVar.s1() == q.ByteString ? o.b0(oVar.j0()) : oVar;
            }
            throw new h("Index " + s12 + " is not valid");
        }
        throw new h("Unexpected index");
    }

    public void c() {
        ArrayList<ArrayList<o>> arrayList = this.f21940a;
        arrayList.remove(arrayList.size() - 1);
    }

    public void d() {
        this.f21940a.add(new ArrayList<>());
    }
}
