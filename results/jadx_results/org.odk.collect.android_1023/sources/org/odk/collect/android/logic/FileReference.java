package org.odk.collect.android.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.javarosa.core.reference.Reference;
/* loaded from: classes.dex */
public class FileReference implements Reference {
    String localPart;
    String referencePart;

    public FileReference(String localPart, String referencePart) {
        this.localPart = localPart;
        this.referencePart = referencePart;
    }

    private String getInternalURI() {
        return "/" + this.localPart + this.referencePart;
    }

    @Override // org.javarosa.core.reference.Reference
    public boolean doesBinaryExist() {
        return new File(getInternalURI()).exists();
    }

    @Override // org.javarosa.core.reference.Reference
    public InputStream getStream() throws IOException {
        return new FileInputStream(getInternalURI());
    }

    @Override // org.javarosa.core.reference.Reference
    public String getURI() {
        return "jr://file" + this.referencePart;
    }

    @Override // org.javarosa.core.reference.Reference
    public boolean isReadOnly() {
        return false;
    }

    @Override // org.javarosa.core.reference.Reference
    public OutputStream getOutputStream() throws IOException {
        return new FileOutputStream(getInternalURI());
    }

    @Override // org.javarosa.core.reference.Reference
    public void remove() {
        new File(getInternalURI()).delete();
    }

    @Override // org.javarosa.core.reference.Reference
    public String getLocalURI() {
        return getInternalURI();
    }

    @Override // org.javarosa.core.reference.Reference
    public Reference[] probeAlternativeReferences() {
        return new Reference[0];
    }
}
