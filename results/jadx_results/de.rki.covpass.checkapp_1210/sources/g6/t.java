package g6;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
@Immutable
/* loaded from: classes.dex */
public class t implements y5.o {

    /* renamed from: a */
    private final e6.a f10602a;

    /* renamed from: b */
    private final int f10603b;

    public t(e6.a aVar, int i10) {
        this.f10602a = aVar;
        this.f10603b = i10;
        if (i10 >= 10) {
            aVar.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // y5.o
    public void a(byte[] bArr, byte[] bArr2) {
        if (g.b(b(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // y5.o
    public byte[] b(byte[] bArr) {
        return this.f10602a.a(bArr, this.f10603b);
    }
}
