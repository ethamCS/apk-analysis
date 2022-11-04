package g6;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f10540d = new C0155a();

    /* renamed from: a */
    private final SecretKeySpec f10541a;

    /* renamed from: b */
    private final int f10542b;

    /* renamed from: c */
    private final int f10543c;

    /* renamed from: g6.a$a */
    /* loaded from: classes.dex */
    class C0155a extends ThreadLocal<Cipher> {
        C0155a() {
        }

        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f10584f.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        w.a(bArr.length);
        this.f10541a = new SecretKeySpec(bArr, "AES");
        int blockSize = f10540d.get().getBlockSize();
        this.f10543c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f10542b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = f10540d.get();
        byte[] bArr4 = new byte[this.f10543c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f10542b);
        cipher.init(z10 ? 1 : 2, this.f10541a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) == i11) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    @Override // g6.p
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f10542b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f10542b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] c10 = u.c(i10);
        System.arraycopy(c10, 0, bArr2, 0, this.f10542b);
        c(bArr, 0, bArr.length, bArr2, this.f10542b, c10, true);
        return bArr2;
    }

    @Override // g6.p
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f10542b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr.length;
            int i11 = this.f10542b;
            byte[] bArr3 = new byte[length2 - i11];
            c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
