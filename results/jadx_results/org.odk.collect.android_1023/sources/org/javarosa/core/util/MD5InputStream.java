package org.javarosa.core.util;

import java.io.IOException;
import java.io.InputStream;
import org.opendatakit.httpclientandroidlib.impl.client.cache.CacheConfig;
/* loaded from: classes.dex */
public class MD5InputStream {
    InputStream in;

    public MD5InputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    public final String getHashCode() throws IOException {
        MD5 md5 = new MD5(null);
        byte[] bArr = new byte[CacheConfig.DEFAULT_MAX_OBJECT_SIZE_BYTES];
        while (true) {
            int read = this.in.read(bArr);
            if (read != -1) {
                md5.update(bArr, 0, read);
            } else {
                return MD5.toHex(md5.doFinal());
            }
        }
    }
}
