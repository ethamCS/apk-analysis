package androidx.work;

import androidx.work.a;
import java.util.HashMap;
import java.util.List;
import u1.i;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // u1.i
    public a b(List<a> list) {
        a.C0069a c0069a = new a.C0069a();
        HashMap hashMap = new HashMap();
        for (a aVar : list) {
            hashMap.putAll(aVar.h());
        }
        c0069a.d(hashMap);
        return c0069a.a();
    }
}
