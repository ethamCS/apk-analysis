package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.Resource;
@Immutable
/* loaded from: classes.dex */
public class HeapResource implements Resource {
    private static final long serialVersionUID = -2078599905620463394L;
    private final byte[] b;

    public HeapResource(byte[] b) {
        this.b = b;
    }

    public byte[] getByteArray() {
        return this.b;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.b);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public long length() {
        return this.b.length;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public void dispose() {
    }
}
