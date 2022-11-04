package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public abstract class g0 implements e, h0 {

    /* renamed from: a */
    private final e f18648a;

    public g0(e eVar) {
        this.f18648a = eVar;
    }

    protected abstract byte c(byte b10);

    public e d() {
        return this.f18648a;
    }

    @Override // org.bouncycastle.crypto.h0
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10 + i11;
        if (i13 <= bArr.length) {
            if (i12 + i11 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            while (i10 < i13) {
                bArr2[i12] = c(bArr[i10]);
                i12++;
                i10++;
            }
            return i11;
        }
        throw new o("input buffer too small");
    }
}
