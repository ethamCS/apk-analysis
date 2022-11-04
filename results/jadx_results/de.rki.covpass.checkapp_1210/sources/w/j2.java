package w;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class j2 {

    /* renamed from: b */
    private static final j2 f24484b = new j2(new ArrayMap());

    /* renamed from: a */
    protected final Map<String, Object> f24485a;

    public j2(Map<String, Object> map) {
        this.f24485a = map;
    }

    public static j2 a() {
        return f24484b;
    }

    public static j2 b(j2 j2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : j2Var.d()) {
            arrayMap.put(str, j2Var.c(str));
        }
        return new j2(arrayMap);
    }

    public Object c(String str) {
        return this.f24485a.get(str);
    }

    public Set<String> d() {
        return this.f24485a.keySet();
    }
}
