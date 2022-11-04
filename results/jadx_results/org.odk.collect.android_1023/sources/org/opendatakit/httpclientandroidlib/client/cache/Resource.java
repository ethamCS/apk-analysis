package org.opendatakit.httpclientandroidlib.client.cache;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
/* loaded from: classes.dex */
public interface Resource extends Serializable {
    void dispose();

    InputStream getInputStream() throws IOException;

    long length();
}
