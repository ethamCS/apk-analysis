package a;

import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class v extends q {

    /* renamed from: l */
    protected String f136l;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f137a;

        static {
            int[] iArr = new int[d.values().length];
            f137a = iArr;
            try {
                iArr[d.ECDSA_256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137a[d.ECDSA_384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137a[d.ECDSA_512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137a[d.EDDSA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137a[d.RSA_PSS_256.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137a[d.RSA_PSS_384.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f137a[d.RSA_PSS_512.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static byte[] q(d dVar, byte[] bArr, s sVar) {
        String str;
        String str2 = null;
        int i10 = 0;
        switch (a.f137a[dVar.ordinal()]) {
            case 1:
                i10 = 32;
                str = "SHA256withECDSA";
                break;
            case 2:
                i10 = 48;
                str = "SHA384withECDSA";
                break;
            case 3:
                i10 = 66;
                str = "SHA512withECDSA";
                break;
            case 4:
                str = "NonewithEdDSA";
                str2 = "EdDSA";
                break;
            case 5:
                str = "SHA256withRSA/PSS";
                break;
            case 6:
                str = "SHA384withRSA/PSS";
                break;
            case 7:
                str = "SHA512withRSA/PSS";
                break;
            default:
                throw new f("Unsupported Algorithm Specified");
        }
        Objects.requireNonNull(sVar);
        PrivateKey a10 = sVar.a();
        if (a10 != null) {
            try {
                Signature signature = str2 == null ? Signature.getInstance(str) : Signature.getInstance(str, str2);
                signature.initSign(a10);
                signature.update(bArr);
                byte[] sign = signature.sign();
                return i10 > 0 ? s(sign, i10) : sign;
            } catch (NoSuchAlgorithmException e10) {
                throw new f("Algorithm not supported", e10);
            } catch (Exception e11) {
                throw new f("Signature failure", e11);
            }
        }
        throw new f("Private key required to sign");
    }

    private static byte[] r(byte[] bArr) {
        int length = bArr.length / 2;
        return c.i(Arrays.copyOfRange(bArr, 0, length), Arrays.copyOfRange(bArr, length, bArr.length));
    }

    private static byte[] s(byte[] bArr, int i10) {
        int i11;
        byte[] bArr2 = new byte[i10 * 2];
        int i12 = 0;
        if (bArr[0] == 48) {
            int i13 = 4;
            if ((bArr[1] & 128) != 0) {
                i13 = 4 + (bArr[1] & 127);
            }
            int i14 = bArr[i13 - 1];
            if (i14 > i10) {
                i13 += i14 - i10;
                i14 = i10;
                i11 = 0;
            } else {
                i11 = i10 - i14;
            }
            System.arraycopy(bArr, i13, bArr2, i11, i14);
            int i15 = i13 + i14 + 2;
            int i16 = bArr[i15 - 1];
            if (i16 > i10) {
                i15 += i16 - i10;
                i16 = i10;
            } else {
                i12 = i10 - i16;
            }
            System.arraycopy(bArr, i15, bArr2, i10 + i12, i16);
            return bArr2;
        }
        throw new f("Unexpected signature input");
    }

    static boolean t(d dVar, byte[] bArr, byte[] bArr2, s sVar) {
        String str;
        boolean z10 = true;
        String str2 = null;
        switch (a.f137a[dVar.ordinal()]) {
            case 1:
                str = "SHA256withECDSA";
                break;
            case 2:
                str = "SHA384withECDSA";
                break;
            case 3:
                str = "SHA512withECDSA";
                break;
            case 4:
                str = "NonewithEdDSA";
                str2 = "EdDSA";
                z10 = false;
                break;
            case 5:
                str = "SHA256withRSA/PSS";
                z10 = false;
                break;
            case 6:
                str = "SHA384withRSA/PSS";
                z10 = false;
                break;
            case 7:
                str = "SHA512withRSA/PSS";
                z10 = false;
                break;
            default:
                throw new f("Unsupported Algorithm Specified");
        }
        Objects.requireNonNull(sVar);
        PublicKey b10 = sVar.b();
        if (b10 != null) {
            try {
                Signature signature = str2 == null ? Signature.getInstance(str) : Signature.getInstance(str, str2);
                signature.initVerify(b10);
                signature.update(bArr);
                if (z10) {
                    bArr2 = r(bArr2);
                }
                return signature.verify(bArr2);
            } catch (NoSuchAlgorithmException e10) {
                throw new f("Algorithm not supported", e10);
            } catch (Exception e11) {
                throw new f("Signature verification failure", e11);
            }
        }
        throw new f("Public key required to verify");
    }

    public boolean u(byte[] bArr, byte[] bArr2, s sVar) {
        return t(d.b(c(l.Algorithm)), bArr, bArr2, sVar);
    }
}
