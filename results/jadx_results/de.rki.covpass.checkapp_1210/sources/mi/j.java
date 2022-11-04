package mi;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class j implements AlgorithmParameterSpec {

    /* renamed from: c */
    private static Map f16704c;

    /* renamed from: a */
    private byte[] f16705a;

    /* renamed from: b */
    private byte[] f16706b;

    static {
        HashMap hashMap = new HashMap();
        f16704c = hashMap;
        hashMap.put(lg.a.f16024h, "E-A");
        f16704c.put(lg.a.f16025i, "E-B");
        f16704c.put(lg.a.f16026j, "E-C");
        f16704c.put(lg.a.f16027k, "E-D");
        f16704c.put(ah.a.f539t, "Param-Z");
    }

    public byte[] a() {
        return ak.a.h(this.f16706b);
    }

    public byte[] b() {
        return ak.a.h(this.f16705a);
    }
}
