package g6;

import com.google.errorprone.annotations.Immutable;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
@Immutable
/* loaded from: classes.dex */
public final class r implements e6.a {

    /* renamed from: a */
    private final SecretKey f10594a;

    /* renamed from: b */
    private byte[] f10595b;

    /* renamed from: c */
    private byte[] f10596c;

    public r(byte[] bArr) {
        w.a(bArr.length);
        this.f10594a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c10 = c();
        c10.init(1, this.f10594a);
        byte[] b10 = e.b(c10.doFinal(new byte[16]));
        this.f10595b = b10;
        this.f10596c = e.b(b10);
    }

    private static Cipher c() {
        return m.f10584f.a("AES/ECB/NoPadding");
    }

    @Override // e6.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher c10 = c();
            c10.init(1, this.f10594a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            byte[] d10 = max * 16 == bArr.length ? g.d(bArr, (max - 1) * 16, this.f10595b, 0, 16) : g.e(e.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f10596c);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = c10.doFinal(g.d(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(c10.doFinal(g.e(d10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
