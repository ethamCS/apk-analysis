package q6;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final a f19691a;

    /* renamed from: b */
    private final List<b> f19692b;

    public d(a aVar) {
        this.f19691a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f19692b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i10) {
        if (i10 >= this.f19692b.size()) {
            List<b> list = this.f19692b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.f19692b.size(); size <= i10; size++) {
                a aVar = this.f19691a;
                bVar = bVar.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f19692b.add(bVar);
            }
        }
        return this.f19692b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            b a10 = a(i10);
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            int[] e10 = new b(this.f19691a, iArr2).j(i10, 1).b(a10)[1].e();
            int length2 = i10 - e10.length;
            for (int i11 = 0; i11 < length2; i11++) {
                iArr[length + i11] = 0;
            }
            System.arraycopy(e10, 0, iArr, length + length2, e10.length);
            return;
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
