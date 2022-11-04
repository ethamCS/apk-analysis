package dj;

import gg.v;
import hh.n0;
import ih.o;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import ni.b;
import ni.c;
import zg.q;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b */
    private static final Map f9159b;

    /* renamed from: a */
    private c f9160a = new b();

    static {
        HashMap hashMap = new HashMap();
        f9159b = hashMap;
        hashMap.put(o.Q, "ECDSA");
        hashMap.put(q.Z0, "RSA");
        hashMap.put(o.A0, "DSA");
    }

    private KeyFactory a(hh.b bVar) {
        v l10 = bVar.l();
        String str = (String) f9159b.get(l10);
        if (str == null) {
            str = l10.H();
        }
        try {
            return this.f9160a.h(str);
        } catch (NoSuchAlgorithmException e10) {
            if (!str.equals("ECDSA")) {
                throw e10;
            }
            return this.f9160a.h("EC");
        }
    }

    public PublicKey b(n0 n0Var) {
        try {
            return a(n0Var.l()).generatePublic(new X509EncodedKeySpec(n0Var.getEncoded()));
        } catch (Exception e10) {
            throw new cj.c("unable to convert key pair: " + e10.getMessage(), e10);
        }
    }
}
