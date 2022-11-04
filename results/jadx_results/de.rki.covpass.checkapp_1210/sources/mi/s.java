package mi;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class s implements AlgorithmParameterSpec {

    /* renamed from: a */
    private Map f16725a;

    public s() {
        this(new HashMap());
    }

    private s(Map map) {
        this.f16725a = Collections.unmodifiableMap(map);
    }

    public Map a() {
        return this.f16725a;
    }
}
