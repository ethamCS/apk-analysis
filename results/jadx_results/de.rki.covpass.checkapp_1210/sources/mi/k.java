package mi;

import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class k implements AlgorithmParameterSpec {

    /* renamed from: a */
    private final gg.v f16707a;

    /* renamed from: b */
    private final gg.v f16708b;

    /* renamed from: c */
    private final gg.v f16709c;

    public k(gg.v vVar, gg.v vVar2, gg.v vVar3) {
        this.f16707a = vVar;
        this.f16708b = vVar2;
        this.f16709c = vVar3;
    }

    public k(String str) {
        this(d(str), a(str), null);
    }

    private static gg.v a(String str) {
        return str.indexOf("12-512") > 0 ? ah.a.f523d : str.indexOf("12-256") > 0 ? ah.a.f522c : lg.a.f16032p;
    }

    private static gg.v d(String str) {
        return lg.b.i(str);
    }

    public gg.v b() {
        return this.f16708b;
    }

    public gg.v c() {
        return this.f16709c;
    }

    public gg.v e() {
        return this.f16707a;
    }
}
