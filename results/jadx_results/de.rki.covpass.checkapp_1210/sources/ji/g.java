package ji;

import javax.crypto.interfaces.PBEKey;
/* loaded from: classes3.dex */
public class g extends f implements PBEKey {

    /* renamed from: q */
    private final byte[] f14392q;

    /* renamed from: x */
    private final int f14393x;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.f14393x;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.f14392q;
    }
}
