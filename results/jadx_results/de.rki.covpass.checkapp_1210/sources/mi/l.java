package mi;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class l implements AlgorithmParameterSpec {

    /* renamed from: a */
    private final PublicKey f16710a;

    /* renamed from: b */
    private final PrivateKey f16711b;

    /* renamed from: c */
    private final PublicKey f16712c;

    /* renamed from: d */
    private final byte[] f16713d;

    public PrivateKey a() {
        return this.f16711b;
    }

    public PublicKey b() {
        return this.f16710a;
    }

    public PublicKey c() {
        return this.f16712c;
    }

    public byte[] d() {
        return ak.a.h(this.f16713d);
    }
}
