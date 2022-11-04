package h4;

import android.graphics.Path;
import g4.s;
import java.util.List;
/* loaded from: classes.dex */
public class m extends a<l4.n, Path> {

    /* renamed from: i */
    private final l4.n f11283i = new l4.n();

    /* renamed from: j */
    private final Path f11284j = new Path();

    /* renamed from: k */
    private List<s> f11285k;

    public m(List<r4.a<l4.n>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path i(r4.a<l4.n> aVar, float f10) {
        this.f11283i.c(aVar.f20443b, aVar.f20444c, f10);
        l4.n nVar = this.f11283i;
        List<s> list = this.f11285k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVar = this.f11285k.get(size).f(nVar);
            }
        }
        q4.g.h(nVar, this.f11284j);
        return this.f11284j;
    }

    public void q(List<s> list) {
        this.f11285k = list;
    }
}
