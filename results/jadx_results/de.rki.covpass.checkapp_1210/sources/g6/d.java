package g6;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class d implements y5.d {

    /* renamed from: c */
    private static final Collection<Integer> f10552c = Arrays.asList(64);

    /* renamed from: d */
    private static final byte[] f10553d = new byte[16];

    /* renamed from: e */
    private static final byte[] f10554e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    private final r f10555a;

    /* renamed from: b */
    private final byte[] f10556b;

    public d(byte[] bArr) {
        if (f10552c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f10556b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f10555a = new r(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    private byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f10555a.a(f10554e, 16);
        }
        byte[] a10 = this.f10555a.a(f10553d, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            a10 = g.e(e.b(a10), this.f10555a.a(bArr[i10] == null ? new byte[0] : bArr[i10], 16));
        }
        byte[] bArr2 = bArr[bArr.length - 1];
        return this.f10555a.a(bArr2.length >= 16 ? g.f(bArr2, a10) : g.e(e.a(bArr2), e.b(a10)), 16);
    }

    @Override // y5.d
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a10 = m.f10584f.a("AES/CTR/NoPadding");
            byte[] c10 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c10.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f10556b, "AES"), new IvParameterSpec(bArr3));
            return g.a(c10, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // y5.d
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a10 = m.f10584f.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(2, new SecretKeySpec(this.f10556b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a10.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && v.b()) {
                doFinal = new byte[0];
            }
            if (!g.b(copyOfRange, c(bArr2, doFinal))) {
                throw new AEADBadTagException("Integrity check failed.");
            }
            return doFinal;
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
