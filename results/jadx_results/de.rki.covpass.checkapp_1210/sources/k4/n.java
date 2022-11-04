package k4;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a */
    final List<r4.a<V>> f14625a;

    public n(List<r4.a<V>> list) {
        this.f14625a = list;
    }

    @Override // k4.m
    public boolean m() {
        return this.f14625a.isEmpty() || (this.f14625a.size() == 1 && this.f14625a.get(0).h());
    }

    @Override // k4.m
    public List<r4.a<V>> o() {
        return this.f14625a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f14625a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f14625a.toArray()));
        }
        return sb2.toString();
    }
}
