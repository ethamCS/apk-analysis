package net.lingala.zip4j.crypto;

import java.util.Arrays;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.enums.AesKeyStrength;
/* loaded from: classes2.dex */
public class AESDecrypter implements Decrypter {
    private AESEngine aesEngine;
    private MacBasedPRF mac;
    private int nonce = 1;
    private byte[] iv = new byte[16];
    private byte[] counterBlock = new byte[16];

    public AESDecrypter(AESExtraDataRecord aESExtraDataRecord, char[] cArr, byte[] bArr, byte[] bArr2) throws ZipException {
        init(bArr, bArr2, cArr, aESExtraDataRecord);
    }

    private void init(byte[] bArr, byte[] bArr2, char[] cArr, AESExtraDataRecord aESExtraDataRecord) throws ZipException {
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("empty or null password provided for AES decryption", ZipException.Type.WRONG_PASSWORD);
        }
        AesKeyStrength aesKeyStrength = aESExtraDataRecord.getAesKeyStrength();
        byte[] derivePasswordBasedKey = AesCipherUtil.derivePasswordBasedKey(bArr, cArr, aesKeyStrength);
        if (!Arrays.equals(bArr2, AesCipherUtil.derivePasswordVerifier(derivePasswordBasedKey, aesKeyStrength))) {
            throw new ZipException("Wrong Password", ZipException.Type.WRONG_PASSWORD);
        }
        this.aesEngine = AesCipherUtil.getAESEngine(derivePasswordBasedKey, aesKeyStrength);
        this.mac = AesCipherUtil.getMacBasedPRF(derivePasswordBasedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 < i4) {
                int i5 = i3 + 16;
                int i6 = i5 <= i4 ? 16 : i4 - i3;
                this.mac.update(bArr, i3, i6);
                AesCipherUtil.prepareBuffAESIVBytes(this.iv, this.nonce);
                this.aesEngine.processBlock(this.iv, this.counterBlock);
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = i3 + i7;
                    bArr[i8] = (byte) (bArr[i8] ^ this.counterBlock[i7]);
                }
                this.nonce++;
                i3 = i5;
            } else {
                return i2;
            }
        }
    }

    public byte[] getCalculatedAuthenticationBytes() {
        return this.mac.doFinal();
    }
}
