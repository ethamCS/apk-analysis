package t7;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a */
    private final List<o> f21930a = new ArrayList();

    public void a(o oVar) {
        this.f21930a.add(oVar);
    }

    public o b(u7.f fVar) {
        if (fVar.I1() >= 0) {
            if (!fVar.B()) {
                throw new h("Index " + fVar + " is bigger than supported ");
            }
            int s12 = fVar.s1();
            if (s12 < this.f21930a.size()) {
                return this.f21930a.get(s12);
            }
            throw new h("Index " + s12 + " is not valid");
        }
        throw new h("Unexpected index");
    }
}
