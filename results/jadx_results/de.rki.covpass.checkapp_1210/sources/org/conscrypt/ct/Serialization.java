package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                throw new SerializationException("Premature end of input, could not read byte.");
            }
            return (byte) read;
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public static byte[] readDEROctetString(InputStream inputStream) {
        int readByte = readByte(inputStream) & 63;
        if (readByte == 4) {
            int readNumber = readNumber(inputStream, 1);
            if ((readNumber & 128) != 0) {
                readNumber = readNumber(inputStream, readNumber & (-129));
            }
            return readFixedBytes(inputStream, readNumber);
        }
        throw new SerializationException("Wrong DER tag, expected OCTET STRING, got " + readByte);
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i10) {
        try {
            if (i10 < 0) {
                throw new SerializationException("Negative length: " + i10);
            }
            byte[] bArr = new byte[i10];
            int read = inputStream.read(bArr);
            if (read >= i10) {
                return bArr;
            }
            throw new SerializationException("Premature end of input, expected " + i10 + " bytes, only read " + read);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public static byte[][] readList(InputStream inputStream, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i10));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i11));
            } catch (IOException e10) {
                throw new SerializationException(e10);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()]);
    }

    public static byte[][] readList(byte[] bArr, int i10, int i11) {
        return readList(new ByteArrayInputStream(bArr), i10, i11);
    }

    public static long readLong(InputStream inputStream, int i10) {
        if (i10 > 8 || i10 < 0) {
            throw new IllegalArgumentException("Invalid width: " + i10);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (readByte(inputStream) & 255);
        }
        return j10;
    }

    public static int readNumber(InputStream inputStream, int i10) {
        if (i10 > 4 || i10 < 0) {
            throw new SerializationException("Invalid width: " + i10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 << 8) | (readByte(inputStream) & 255);
        }
        return i11;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i10) {
        return readFixedBytes(inputStream, readNumber(inputStream, i10));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) {
        try {
            outputStream.write(bArr);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j10, int i10) {
        long j11;
        if (i10 < 0) {
            throw new SerializationException("Negative width: " + i10);
        } else if (i10 < 8 && j10 >= (1 << (i10 * 8))) {
            throw new SerializationException("Number too large, " + j10 + " does not fit in " + i10 + " bytes");
        } else {
            while (i10 > 0) {
                if ((i10 - 1) * 8 < 64) {
                    try {
                        outputStream.write((byte) ((j10 >> ((int) j11)) & 255));
                    } catch (IOException e10) {
                        throw new SerializationException(e10);
                    }
                } else {
                    outputStream.write(0);
                }
                i10--;
            }
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i10) {
        writeNumber(outputStream, bArr.length, i10);
        writeFixedBytes(outputStream, bArr);
    }
}
