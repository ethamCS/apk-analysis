package net.lingala.zip4j.crypto.PBKDF2;
/* loaded from: classes2.dex */
interface PRF {
    byte[] doFinal(byte[] bArr);

    int getHLen();

    void init(byte[] bArr);
}
