package h4;

import java.util.List;
/* loaded from: classes.dex */
public class e extends g<l4.d> {

    /* renamed from: i */
    private final l4.d f11271i;

    public e(List<r4.a<l4.d>> list) {
        super(list);
        int i10 = 0;
        l4.d dVar = list.get(0).f20443b;
        i10 = dVar != null ? dVar.c() : i10;
        this.f11271i = new l4.d(new float[i10], new int[i10]);
    }

    /* renamed from: p */
    public l4.d i(r4.a<l4.d> aVar, float f10) {
        this.f11271i.d(aVar.f20443b, aVar.f20444c, f10);
        return this.f11271i;
    }
}
