package org.opendatakit.httpclientandroidlib.client;

import org.opendatakit.httpclientandroidlib.conn.routing.HttpRoute;
/* loaded from: classes.dex */
public interface BackoffManager {
    void backOff(HttpRoute httpRoute);

    void probe(HttpRoute httpRoute);
}
