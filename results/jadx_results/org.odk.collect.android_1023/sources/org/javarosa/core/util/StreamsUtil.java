package org.javarosa.core.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class StreamsUtil {
    private StreamsUtil() {
    }

    public static void writeFromInputToOutput(InputStream inputStream, OutputStream outputStream, long[] jArr) throws IOException {
        int read = inputStream.read();
        while (read != -1) {
            outputStream.write(read);
            incr(jArr);
            read = inputStream.read();
        }
        inputStream.close();
    }

    public static void writeFromInputToOutput(InputStream inputStream, OutputStream outputStream) throws IOException {
        writeFromInputToOutput(inputStream, outputStream, null);
    }

    public static void writeToOutput(byte[] bArr, OutputStream outputStream, long[] jArr) throws IOException {
        for (int i : bArr) {
            outputStream.write(i);
            incr(jArr);
        }
    }

    public static void writeToOutput(byte[] bArr, OutputStream outputStream) throws IOException {
        writeToOutput(bArr, outputStream, null);
    }

    private static void incr(long[] jArr) {
        if (jArr != null) {
            jArr[0] = jArr[0] + 1;
        }
    }

    public static byte[] readFromStream(InputStream inputStream, int i) throws IOException {
        byte[] byteArray;
        int length;
        if (i >= 0) {
            byteArray = new byte[i];
            length = 0;
            while (length < i) {
                int read = inputStream.read(byteArray, length, i - length);
                if (read == -1) {
                    break;
                }
                length += read;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read2 = inputStream.read();
                if (read2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(read2);
            }
            byteArray = byteArrayOutputStream.toByteArray();
            length = byteArray.length;
        }
        if (i > 0 && length < i) {
            throw new RuntimeException("expected: " + i + " bytes but read " + length);
        }
        return byteArray;
    }
}
