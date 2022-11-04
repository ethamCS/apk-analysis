package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public abstract class b0 {
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;

    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i10 = 0; i10 != cArr.length; i10++) {
            int i11 = i10 * 2;
            bArr[i11] = (byte) (cArr[i10] >>> '\b');
            bArr[i11 + 1] = (byte) cArr[i10];
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        if (cArr != null) {
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 != length; i10++) {
                bArr[i10] = (byte) cArr[i10];
            }
            return bArr;
        }
        return new byte[0];
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        return cArr != null ? ak.q.j(cArr) : new byte[0];
    }

    public abstract i generateDerivedMacParameters(int i10);

    public abstract i generateDerivedParameters(int i10);

    public abstract i generateDerivedParameters(int i10, int i11);

    public int getIterationCount() {
        return this.iterationCount;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public void init(byte[] bArr, byte[] bArr2, int i10) {
        this.password = bArr;
        this.salt = bArr2;
        this.iterationCount = i10;
    }
}
