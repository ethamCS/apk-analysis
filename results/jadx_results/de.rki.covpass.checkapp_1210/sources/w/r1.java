package w;

import android.util.ArrayMap;
import java.util.Map;
/* loaded from: classes.dex */
public class r1 extends j2 {
    private r1(Map<String, Object> map) {
        super(map);
    }

    public static r1 f() {
        return new r1(new ArrayMap());
    }

    public static r1 g(j2 j2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : j2Var.d()) {
            arrayMap.put(str, j2Var.c(str));
        }
        return new r1(arrayMap);
    }

    public void e(j2 j2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f24485a;
        if (map2 == null || (map = j2Var.f24485a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void h(String str, Object obj) {
        this.f24485a.put(str, obj);
    }
}
