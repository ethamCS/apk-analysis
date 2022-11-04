package z5;

import f6.a0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import y5.r;
/* loaded from: classes.dex */
public final class j implements y5.a {

    /* renamed from: c */
    private static final byte[] f26484c = new byte[0];

    /* renamed from: a */
    private final a0 f26485a;

    /* renamed from: b */
    private final y5.a f26486b;

    public j(a0 a0Var, y5.a aVar) {
        this.f26485a = a0Var;
        this.f26486b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // y5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] j10 = r.o(this.f26485a).j();
        return c(this.f26486b.a(j10, f26484c), ((y5.a) r.i(this.f26485a.T(), j10, y5.a.class)).a(bArr, bArr2));
    }

    @Override // y5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((y5.a) r.i(this.f26485a.T(), this.f26486b.b(bArr3, f26484c), y5.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
