package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.cache.Resource;
@ThreadSafe
/* loaded from: classes.dex */
public class FileResource implements Resource {
    private static final long serialVersionUID = 4132244415919043397L;
    private volatile boolean disposed = false;
    private final File file;

    public FileResource(File file) {
        this.file = file;
    }

    public synchronized File getFile() {
        return this.file;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public synchronized InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public synchronized long length() {
        return this.file.length();
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.Resource
    public synchronized void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.file.delete();
        }
    }
}
