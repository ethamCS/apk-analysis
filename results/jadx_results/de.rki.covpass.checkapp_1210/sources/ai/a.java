package ai;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.x;
import zh.i;
import zh.k;
/* loaded from: classes3.dex */
public class a implements x {

    /* renamed from: a */
    private i f540a;

    public a(i iVar) {
        this.f540a = iVar;
    }

    @Override // org.bouncycastle.crypto.x
    public zh.b a(InputStream inputStream) {
        int bitLength = (this.f540a.f().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        ck.b.g(inputStream, bArr, 0, bitLength);
        return new k(new BigInteger(1, bArr), this.f540a);
    }
}
