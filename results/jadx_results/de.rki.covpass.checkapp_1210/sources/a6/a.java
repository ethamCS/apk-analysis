package a6;

import g6.m;
import g6.u;
import g6.v;
import g6.w;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements y5.a {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f191b = new C0000a();

    /* renamed from: a */
    private final SecretKey f192a;

    /* renamed from: a6.a$a */
    /* loaded from: classes.dex */
    class C0000a extends ThreadLocal<Cipher> {
        C0000a() {
        }

        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f10584f.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr) {
        w.a(bArr.length);
        this.f192a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i10, int i11) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i10, i11);
        } catch (ClassNotFoundException unused) {
            if (!v.b()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            return new IvParameterSpec(bArr, i10, i11);
        }
    }

    @Override // y5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] c10 = u.c(12);
            System.arraycopy(c10, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c11 = c(c10);
            ThreadLocal<Cipher> threadLocal = f191b;
            threadLocal.get().init(1, this.f192a, c11);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal != bArr.length + 16) {
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // y5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec d10 = d(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f191b;
            threadLocal.get().init(2, this.f192a, d10);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
