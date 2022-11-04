package ji;

import javax.crypto.interfaces.PBEKey;
/* loaded from: classes3.dex */
public class j extends i implements PBEKey {

    /* renamed from: q */
    private final byte[] f14398q;

    /* renamed from: x */
    private final int f14399x;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f14399x;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f14398q;
    }
}
