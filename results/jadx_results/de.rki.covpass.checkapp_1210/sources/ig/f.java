package ig;

import ak.a;
import gg.a0;
import gg.d0;
import gg.t;
import gg.x1;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class f extends t implements Iterable {

    /* renamed from: c */
    private final gg.g[] f12602c;

    private f(d0 d0Var) {
        this.f12602c = new gg.g[d0Var.size()];
        int i10 = 0;
        while (true) {
            gg.g[] gVarArr = this.f12602c;
            if (i10 != gVarArr.length) {
                gVarArr[i10] = e.o(d0Var.G(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public f(e[] eVarArr) {
        gg.g[] gVarArr = new gg.g[eVarArr.length];
        this.f12602c = gVarArr;
        System.arraycopy(eVarArr, 0, gVarArr, 0, eVarArr.length);
    }

    public static f l(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return new x1(this.f12602c);
    }

    @Override // java.lang.Iterable
    public Iterator<gg.g> iterator() {
        return new a.C0009a(this.f12602c);
    }
}
