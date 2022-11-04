package org.javarosa.core.reference;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class ResourceReference implements Reference {
    String URI;

    public ResourceReference(String str) {
        this.URI = str;
    }

    @Override // org.javarosa.core.reference.Reference
    public boolean doesBinaryExist() throws IOException {
        InputStream resourceAsStream = System.class.getResourceAsStream(this.URI);
        if (resourceAsStream == null) {
            return false;
        }
        resourceAsStream.close();
        return true;
    }

    @Override // org.javarosa.core.reference.Reference
    public InputStream getStream() throws IOException {
        return System.class.getResourceAsStream(this.URI);
    }

    @Override // org.javarosa.core.reference.Reference
    public String getURI() {
        return "jr://resource" + this.URI;
    }

    @Override // org.javarosa.core.reference.Reference
    public boolean isReadOnly() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ResourceReference) {
            return this.URI.equals(((ResourceReference) obj).URI);
        }
        return false;
    }

    @Override // org.javarosa.core.reference.Reference
    public OutputStream getOutputStream() throws IOException {
        throw new IOException("Resource references are read-only URI's");
    }

    @Override // org.javarosa.core.reference.Reference
    public void remove() throws IOException {
        throw new IOException("Resource references are read-only URI's");
    }

    @Override // org.javarosa.core.reference.Reference
    public String getLocalURI() {
        return this.URI;
    }

    @Override // org.javarosa.core.reference.Reference
    public Reference[] probeAlternativeReferences() {
        return new Reference[0];
    }
}
