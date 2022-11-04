package c7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final Map<Integer, Integer> f6318a = new HashMap();

    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f6318a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return b7.a.b(arrayList);
    }

    public void b(int i10) {
        Integer num = this.f6318a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f6318a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
