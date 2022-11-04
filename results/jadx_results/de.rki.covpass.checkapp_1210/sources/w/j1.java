package w;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class j1 implements androidx.camera.core.q {

    /* renamed from: b */
    private int f24483b;

    public j1(int i10) {
        this.f24483b = i10;
    }

    @Override // androidx.camera.core.q
    public /* synthetic */ y0 a() {
        return androidx.camera.core.p.a(this);
    }

    @Override // androidx.camera.core.q
    public List<androidx.camera.core.r> b(List<androidx.camera.core.r> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.r rVar : list) {
            androidx.core.util.h.b(rVar instanceof b0, "The camera info doesn't contain internal implementation.");
            Integer a10 = ((b0) rVar).a();
            if (a10 != null && a10.intValue() == this.f24483b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f24483b;
    }
}
