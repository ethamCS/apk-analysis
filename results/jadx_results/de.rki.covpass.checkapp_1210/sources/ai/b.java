package ai;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.x;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class b implements x {

    /* renamed from: a */
    private y f541a;

    public b(y yVar) {
        this.f541a = yVar;
    }

    @Override // org.bouncycastle.crypto.x
    public zh.b a(InputStream inputStream) {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                bArr = new byte[((this.f541a.a().t() + 7) / 8) + 1];
            } else if (read != 4 && read != 6 && read != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
            } else {
                bArr = new byte[(((this.f541a.a().t() + 7) / 8) * 2) + 1];
            }
            bArr[0] = (byte) read;
            ck.b.g(inputStream, bArr, 1, bArr.length - 1);
            return new e0(this.f541a.a().j(bArr), this.f541a);
        }
        throw new IOException("Sender's public key invalid.");
    }
}
