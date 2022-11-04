package org.opendatakit.httpclientandroidlib.impl.client.cache;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.services.Logger;
import org.opendatakit.httpclientandroidlib.annotation.Immutable;
import org.opendatakit.httpclientandroidlib.client.cache.InputLimit;
import org.opendatakit.httpclientandroidlib.client.cache.Resource;
import org.opendatakit.httpclientandroidlib.client.cache.ResourceFactory;
@Immutable
/* loaded from: classes.dex */
public class HeapResourceFactory implements ResourceFactory {
    @Override // org.opendatakit.httpclientandroidlib.client.cache.ResourceFactory
    public Resource generate(String requestId, InputStream instream, InputLimit limit) throws IOException {
        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        byte[] buf = new byte[Logger.MAX_MSG_LENGTH];
        long total = 0;
        while (true) {
            int l = instream.read(buf);
            if (l == -1) {
                break;
            }
            outstream.write(buf, 0, l);
            total += l;
            if (limit != null && total > limit.getValue()) {
                limit.reached();
                break;
            }
        }
        return new HeapResource(outstream.toByteArray());
    }

    @Override // org.opendatakit.httpclientandroidlib.client.cache.ResourceFactory
    public Resource copy(String requestId, Resource resource) throws IOException {
        byte[] body;
        if (resource instanceof HeapResource) {
            body = ((HeapResource) resource).getByteArray();
        } else {
            ByteArrayOutputStream outstream = new ByteArrayOutputStream();
            IOUtils.copyAndClose(resource.getInputStream(), outstream);
            body = outstream.toByteArray();
        }
        return new HeapResource(body);
    }
}
