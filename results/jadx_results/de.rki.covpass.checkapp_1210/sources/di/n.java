package di;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a */
    private static final Map<String, Integer> f9127a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("RIPEMD128", ak.g.e(13004));
        hashMap.put("RIPEMD160", ak.g.e(12748));
        hashMap.put("SHA-1", ak.g.e(13260));
        hashMap.put("SHA-224", ak.g.e(14540));
        hashMap.put("SHA-256", ak.g.e(13516));
        hashMap.put("SHA-384", ak.g.e(14028));
        hashMap.put("SHA-512", ak.g.e(13772));
        hashMap.put("SHA-512/224", ak.g.e(14796));
        hashMap.put("SHA-512/256", ak.g.e(15052));
        hashMap.put("Whirlpool", ak.g.e(14284));
        f9127a = Collections.unmodifiableMap(hashMap);
    }

    public static Integer a(org.bouncycastle.crypto.r rVar) {
        return f9127a.get(rVar.getAlgorithmName());
    }
}
