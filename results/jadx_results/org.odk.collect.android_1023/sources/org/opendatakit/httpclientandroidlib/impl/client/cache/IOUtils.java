package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.javarosa.core.services.Logger;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
@Immutable
/* loaded from: classes.dex */
class IOUtils {
    IOUtils() {
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[Logger.MAX_MSG_LENGTH];
        while (true) {
            int len = in.read(buf);
            if (len != -1) {
                out.write(buf, 0, len);
            } else {
                return;
            }
        }
    }

    static void closeSilently(Closeable closable) {
        try {
            closable.close();
        } catch (IOException e) {
        }
    }

    public static void copyAndClose(InputStream in, OutputStream out) throws IOException {
        try {
            copy(in, out);
            in.close();
            out.close();
        } catch (IOException ex) {
            closeSilently(in);
            closeSilently(out);
            throw ex;
        }
    }

    public static void copyFile(File in, File out) throws IOException {
        RandomAccessFile f1 = new RandomAccessFile(in, "r");
        RandomAccessFile f2 = new RandomAccessFile(out, "rw");
        try {
            FileChannel c1 = f1.getChannel();
            FileChannel c2 = f2.getChannel();
            try {
                c1.transferTo(0L, f1.length(), c2);
                c1.close();
                c2.close();
                f1.close();
                f2.close();
            } catch (IOException ex) {
                closeSilently(c1);
                closeSilently(c2);
                throw ex;
            }
        } catch (IOException ex2) {
            closeSilently(f1);
            closeSilently(f2);
            throw ex2;
        }
    }
}
