package g6;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l implements y5.a {

    /* renamed from: a */
    private final p f10579a;

    /* renamed from: b */
    private final y5.o f10580b;

    /* renamed from: c */
    private final int f10581c;

    public l(p pVar, y5.o oVar, int i10) {
        this.f10579a = pVar;
        this.f10580b = oVar;
        this.f10581c = i10;
    }

    @Override // y5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f10579a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return g.a(a10, this.f10580b.b(g.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // y5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f10581c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f10581c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f10580b.a(copyOfRange2, g.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f10579a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
