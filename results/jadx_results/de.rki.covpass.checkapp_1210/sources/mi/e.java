package mi;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class e implements AlgorithmParameterSpec {

    /* renamed from: a */
    private final PublicKey f16691a;

    /* renamed from: b */
    private final PrivateKey f16692b;

    /* renamed from: c */
    private final PublicKey f16693c;

    /* renamed from: d */
    private final byte[] f16694d;

    public PrivateKey a() {
        return this.f16692b;
    }

    public PublicKey b() {
        return this.f16691a;
    }

    public PublicKey c() {
        return this.f16693c;
    }

    public byte[] d() {
        return ak.a.h(this.f16694d);
    }
}
