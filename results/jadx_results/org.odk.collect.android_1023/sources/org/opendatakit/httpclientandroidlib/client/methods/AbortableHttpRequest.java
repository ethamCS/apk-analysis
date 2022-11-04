package org.opendatakit.httpclientandroidlib.client.methods;

import java.io.IOException;
import org.opendatakit.httpclientandroidlib.conn.ClientConnectionRequest;
import org.opendatakit.httpclientandroidlib.conn.ConnectionReleaseTrigger;
/* loaded from: classes.dex */
public interface AbortableHttpRequest {
    void abort();

    void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) throws IOException;

    void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) throws IOException;
}
