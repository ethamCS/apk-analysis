package gg;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* loaded from: classes3.dex */
public class z2 {

    /* renamed from: a */
    private static final long f10927a = Runtime.getRuntime().maxMemory();

    public static int a(InputStream inputStream) {
        if (inputStream instanceof x2) {
            return ((x2) inputStream).b();
        }
        if (inputStream instanceof p) {
            return ((p) inputStream).n();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j10 = f10927a;
        if (j10 <= 2147483647L) {
            return (int) j10;
        }
        return Integer.MAX_VALUE;
    }
}
