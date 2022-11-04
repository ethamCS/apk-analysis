package mi;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class i implements AlgorithmParameterSpec {

    /* renamed from: c */
    private static Map f16701c;

    /* renamed from: a */
    private byte[] f16702a;

    /* renamed from: b */
    private byte[] f16703b;

    static {
        HashMap hashMap = new HashMap();
        f16701c = hashMap;
        hashMap.put(lg.a.f16024h, "E-A");
        f16701c.put(lg.a.f16025i, "E-B");
        f16701c.put(lg.a.f16026j, "E-C");
        f16701c.put(lg.a.f16027k, "E-D");
        f16701c.put(ah.a.f539t, "Param-Z");
    }

    public i(gg.v vVar, byte[] bArr) {
        this(b(vVar));
        this.f16702a = ak.a.h(bArr);
    }

    public i(String str) {
        this.f16702a = null;
        this.f16703b = null;
        this.f16703b = qh.u.h(str);
    }

    public i(byte[] bArr) {
        this.f16702a = null;
        this.f16703b = null;
        byte[] bArr2 = new byte[bArr.length];
        this.f16703b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public i(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.f16702a = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }

    private static String b(gg.v vVar) {
        String str = (String) f16701c.get(vVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unknown OID: " + vVar);
    }

    public byte[] a() {
        return ak.a.h(this.f16702a);
    }

    public byte[] c() {
        return ak.a.h(this.f16703b);
    }

    public byte[] d() {
        return ak.a.h(this.f16703b);
    }
}
