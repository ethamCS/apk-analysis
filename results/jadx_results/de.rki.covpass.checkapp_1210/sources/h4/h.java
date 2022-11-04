package h4;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final List<a<l4.n, Path>> f11272a;

    /* renamed from: b */
    private final List<a<Integer, Integer>> f11273b;

    /* renamed from: c */
    private final List<l4.h> f11274c;

    public h(List<l4.h> list) {
        this.f11274c = list;
        this.f11272a = new ArrayList(list.size());
        this.f11273b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f11272a.add(list.get(i10).b().n());
            this.f11273b.add(list.get(i10).c().n());
        }
    }

    public List<a<l4.n, Path>> a() {
        return this.f11272a;
    }

    public List<l4.h> b() {
        return this.f11274c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f11273b;
    }
}
