package org.apache.james.mime4j.message;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class BinaryBody extends SingleBody {
    public abstract InputStream getInputStream() throws IOException;
}
