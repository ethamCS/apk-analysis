package org.opendatakit.httpclientandroidlib.conn;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public interface EofSensorWatcher {
    boolean eofDetected(InputStream inputStream) throws IOException;

    boolean streamAbort(InputStream inputStream) throws IOException;

    boolean streamClosed(InputStream inputStream) throws IOException;
}