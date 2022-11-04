package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.model.LocalFileHeader;
/* loaded from: classes2.dex */
class NoCipherInputStream extends CipherInputStream {
    public NoCipherInputStream(ZipEntryInputStream zipEntryInputStream, LocalFileHeader localFileHeader, char[] cArr, int i) throws IOException {
        super(zipEntryInputStream, localFileHeader, cArr, i);
    }

    @Override // net.lingala.zip4j.io.inputstream.CipherInputStream
    protected Decrypter initializeDecrypter(LocalFileHeader localFileHeader, char[] cArr) {
        return new NoDecrypter();
    }

    /* loaded from: classes2.dex */
    static class NoDecrypter implements Decrypter {
        @Override // net.lingala.zip4j.crypto.Decrypter
        public int decryptData(byte[] bArr, int i, int i2) {
            return i2;
        }

        NoDecrypter() {
        }
    }
}
