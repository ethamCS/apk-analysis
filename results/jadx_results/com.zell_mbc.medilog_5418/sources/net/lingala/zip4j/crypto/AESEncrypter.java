package net.lingala.zip4j.crypto;

import java.security.SecureRandom;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;
/* loaded from: classes2.dex */
public class AESEncrypter implements Encrypter {
    private AESEngine aesEngine;
    private final byte[] counterBlock;
    private byte[] derivedPasswordVerifier;
    private boolean finished;
    private final byte[] iv;
    private MacBasedPRF mac;
    private byte[] saltBytes;
    private final SecureRandom random = new SecureRandom();
    private int nonce = 1;
    private int loopCount = 0;

    public AESEncrypter(char[] cArr, AesKeyStrength aesKeyStrength) throws ZipException {
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("input password is empty or null");
        }
        if (aesKeyStrength != AesKeyStrength.KEY_STRENGTH_128 && aesKeyStrength != AesKeyStrength.KEY_STRENGTH_256) {
            throw new ZipException("Invalid AES key strength");
        }
        this.finished = false;
        this.counterBlock = new byte[16];
        this.iv = new byte[16];
        init(cArr, aesKeyStrength);
    }

    private void init(char[] cArr, AesKeyStrength aesKeyStrength) throws ZipException {
        byte[] generateSalt = generateSalt(aesKeyStrength.getSaltLength());
        this.saltBytes = generateSalt;
        byte[] derivePasswordBasedKey = AesCipherUtil.derivePasswordBasedKey(generateSalt, cArr, aesKeyStrength);
        this.derivedPasswordVerifier = AesCipherUtil.derivePasswordVerifier(derivePasswordBasedKey, aesKeyStrength);
        this.aesEngine = AesCipherUtil.getAESEngine(derivePasswordBasedKey, aesKeyStrength);
        this.mac = AesCipherUtil.getMacBasedPRF(derivePasswordBasedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) throws ZipException {
        if (bArr == null) {
            throw new ZipException("input bytes are null, cannot perform AES encryption");
        }
        return encryptData(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        if (this.finished) {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
        if (i2 % 16 != 0) {
            this.finished = true;
        }
        int i4 = i;
        while (true) {
            int i5 = i + i2;
            if (i4 >= i5) {
                return i2;
            }
            int i6 = i4 + 16;
            this.loopCount = i6 <= i5 ? 16 : i5 - i4;
            AesCipherUtil.prepareBuffAESIVBytes(this.iv, this.nonce);
            this.aesEngine.processBlock(this.iv, this.counterBlock);
            int i7 = 0;
            while (true) {
                i3 = this.loopCount;
                if (i7 < i3) {
                    int i8 = i4 + i7;
                    bArr[i8] = (byte) (bArr[i8] ^ this.counterBlock[i7]);
                    i7++;
                }
            }
            this.mac.update(bArr, i4, i3);
            this.nonce++;
            i4 = i6;
        }
    }

    private byte[] generateSalt(int i) throws ZipException {
        if (i != 8 && i != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        int i2 = i == 8 ? 2 : 4;
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i2; i3++) {
            int nextInt = this.random.nextInt();
            int i4 = i3 * 4;
            bArr[i4] = (byte) (nextInt >> 24);
            bArr[i4 + 1] = (byte) (nextInt >> 16);
            bArr[i4 + 2] = (byte) (nextInt >> 8);
            bArr[i4 + 3] = (byte) nextInt;
        }
        return bArr;
    }

    public byte[] getFinalMac() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.mac.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    public byte[] getDerivedPasswordVerifier() {
        return this.derivedPasswordVerifier;
    }

    public byte[] getSaltBytes() {
        return this.saltBytes;
    }
}
