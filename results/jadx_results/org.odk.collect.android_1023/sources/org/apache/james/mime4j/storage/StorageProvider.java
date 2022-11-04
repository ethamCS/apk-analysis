package org.apache.james.mime4j.storage;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public interface StorageProvider {
    StorageOutputStream createStorageOutputStream() throws IOException;

    Storage store(InputStream inputStream) throws IOException;
}
