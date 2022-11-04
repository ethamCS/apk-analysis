package net.lingala.zip4j.crypto;

import kotlin.UByte;
import net.lingala.zip4j.crypto.engine.ZipCryptoEngine;
import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes2.dex */
public class StandardDecrypter implements Decrypter {
    private ZipCryptoEngine zipCryptoEngine = new ZipCryptoEngine();

    public StandardDecrypter(char[] cArr, long j, long j2, byte[] bArr) throws ZipException {
        init(bArr, cArr, j2, j);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i, int i2) throws ZipException {
        if (i < 0 || i2 < 0) {
            throw new ZipException("one of the input parameters were null in standard decrypt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte decryptByte = (byte) (((bArr[i3] & UByte.MAX_VALUE) ^ this.zipCryptoEngine.decryptByte()) & 255);
            this.zipCryptoEngine.updateKeys(decryptByte);
            bArr[i3] = decryptByte;
        }
        return i2;
    }

    private void init(byte[] bArr, char[] cArr, long j, long j2) throws ZipException {
        byte decryptByte;
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
        }
        this.zipCryptoEngine.initKeys(cArr);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12 && (decryptByte = (byte) (this.zipCryptoEngine.decryptByte() ^ b)) != ((byte) (j2 >> 24)) && decryptByte != ((byte) (j >> 8))) {
                throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
            }
            ZipCryptoEngine zipCryptoEngine = this.zipCryptoEngine;
            zipCryptoEngine.updateKeys((byte) (zipCryptoEngine.decryptByte() ^ b));
            if (i != 12) {
                b = bArr[i];
            }
        }
    }
}
