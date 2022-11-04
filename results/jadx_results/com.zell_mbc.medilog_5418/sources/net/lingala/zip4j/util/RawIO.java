package net.lingala.zip4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.UByte;
import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes2.dex */
public class RawIO {
    private final byte[] shortBuff = new byte[2];
    private final byte[] intBuff = new byte[4];
    private final byte[] longBuff = new byte[8];

    public long readLongLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.longBuff);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(RandomAccessFile randomAccessFile, int i) throws IOException {
        resetBytes(this.longBuff);
        randomAccessFile.readFully(this.longBuff, 0, i);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.longBuff;
        readFully(inputStream, bArr, bArr.length);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(InputStream inputStream, int i) throws IOException {
        resetBytes(this.longBuff);
        readFully(inputStream, this.longBuff, i);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            resetBytes(this.longBuff);
        }
        System.arraycopy(bArr, i, this.longBuff, 0, bArr.length < 8 ? bArr.length - i : 8);
        byte[] bArr2 = this.longBuff;
        return ((((((((((((((0 | (bArr2[7] & UByte.MAX_VALUE)) << 8) | (bArr2[6] & UByte.MAX_VALUE)) << 8) | (bArr2[5] & UByte.MAX_VALUE)) << 8) | (bArr2[4] & UByte.MAX_VALUE)) << 8) | (bArr2[3] & UByte.MAX_VALUE)) << 8) | (bArr2[2] & UByte.MAX_VALUE)) << 8) | (bArr2[1] & UByte.MAX_VALUE)) << 8) | (bArr2[0] & UByte.MAX_VALUE);
    }

    public int readIntLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.intBuff);
        return readIntLittleEndian(this.intBuff);
    }

    public int readIntLittleEndian(InputStream inputStream) throws IOException {
        readFully(inputStream, this.intBuff, 4);
        return readIntLittleEndian(this.intBuff);
    }

    public int readIntLittleEndian(byte[] bArr) {
        return readIntLittleEndian(bArr, 0);
    }

    public int readIntLittleEndian(byte[] bArr, int i) {
        return ((((bArr[i + 3] & UByte.MAX_VALUE) << 8) | (bArr[i + 2] & UByte.MAX_VALUE)) << 16) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8);
    }

    public int readShortLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.shortBuff);
        return readShortLittleEndian(this.shortBuff, 0);
    }

    public int readShortLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.shortBuff;
        readFully(inputStream, bArr, bArr.length);
        return readShortLittleEndian(this.shortBuff, 0);
    }

    public int readShortLittleEndian(byte[] bArr, int i) {
        return ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE);
    }

    public void writeShortLittleEndian(OutputStream outputStream, int i) throws IOException {
        writeShortLittleEndian(this.shortBuff, 0, i);
        outputStream.write(this.shortBuff);
    }

    public void writeShortLittleEndian(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    public void writeIntLittleEndian(OutputStream outputStream, int i) throws IOException {
        writeIntLittleEndian(this.intBuff, 0, i);
        outputStream.write(this.intBuff);
    }

    public void writeIntLittleEndian(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    public void writeLongLittleEndian(OutputStream outputStream, long j) throws IOException {
        writeLongLittleEndian(this.longBuff, 0, j);
        outputStream.write(this.longBuff);
    }

    public void writeLongLittleEndian(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) (j >>> 56);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i] = (byte) (j & 255);
    }

    private void readFully(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (Zip4jUtil.readFully(inputStream, bArr, 0, i) == i) {
            return;
        }
        throw new ZipException("Could not fill buffer");
    }

    private void resetBytes(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }
}
