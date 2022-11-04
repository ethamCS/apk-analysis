package org.javarosa.core.reference;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public interface Reference {
    boolean doesBinaryExist() throws IOException;

    String getLocalURI();

    OutputStream getOutputStream() throws IOException;

    InputStream getStream() throws IOException;

    String getURI();

    boolean isReadOnly();

    Reference[] probeAlternativeReferences();

    void remove() throws IOException;
}
