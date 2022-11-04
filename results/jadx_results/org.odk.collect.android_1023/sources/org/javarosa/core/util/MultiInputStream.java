package org.javarosa.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
/* loaded from: classes.dex */
public class MultiInputStream extends InputStream {
    Vector streams = new Vector();
    int currentStream = -1;

    public void addStream(InputStream inputStream) {
        this.streams.addElement(inputStream);
    }

    public boolean prepare() {
        if (this.streams.size() == 0) {
            return false;
        }
        this.currentStream = 0;
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentStream == -1) {
            throw new IOException("Cannot read from unprepared MultiInputStream!");
        }
        int read = ((InputStream) this.streams.elementAt(this.currentStream)).read();
        if (read == -1) {
            while (read == -1 && this.currentStream + 1 < this.streams.size()) {
                this.currentStream++;
                read = ((InputStream) this.streams.elementAt(this.currentStream)).read();
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.currentStream == -1) {
            throw new IOException("Cannot read from unprepared MultiInputStream!");
        }
        return ((InputStream) this.streams.elementAt(this.currentStream)).available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.currentStream == -1) {
            throw new IOException("Cannot read from unprepared MultiInputStream!");
        }
        Enumeration elements = this.streams.elements();
        while (elements.hasMoreElements()) {
            ((InputStream) elements.nextElement()).close();
        }
    }
}
