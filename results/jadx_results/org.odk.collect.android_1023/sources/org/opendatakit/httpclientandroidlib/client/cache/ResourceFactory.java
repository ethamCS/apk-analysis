package org.opendatakit.httpclientandroidlib.client.cache;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public interface ResourceFactory {
    Resource copy(String str, Resource resource) throws IOException;

    Resource generate(String str, InputStream inputStream, InputLimit inputLimit) throws IOException;
}
