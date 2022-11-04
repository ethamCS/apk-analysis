package org.bouncycastle.jcajce.provider.util;

import ak.g;
import gg.v;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import ug.b;
import wg.a;
import zg.q;
/* loaded from: classes3.dex */
public class SecretKeyUtil {
    private static Map keySizes;

    static {
        HashMap hashMap = new HashMap();
        keySizes = hashMap;
        hashMap.put(q.B1.H(), g.e(192));
        keySizes.put(b.f23668y, g.e(128));
        keySizes.put(b.G, g.e(192));
        keySizes.put(b.O, g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        keySizes.put(a.f25079a, g.e(128));
        keySizes.put(a.f25080b, g.e(192));
        keySizes.put(a.f25081c, g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
    }

    public static int getKeySize(v vVar) {
        Integer num = (Integer) keySizes.get(vVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
