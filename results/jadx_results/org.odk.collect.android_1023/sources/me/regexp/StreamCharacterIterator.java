package me.regexp;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class StreamCharacterIterator implements CharacterIterator {
    private final StringBuffer buff = new StringBuffer(512);
    private boolean closed = false;
    private final InputStream is;

    public StreamCharacterIterator(InputStream is) {
        this.is = is;
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex, int endIndex) {
        try {
            ensure(endIndex);
            return this.buff.toString().substring(beginIndex, endIndex);
        } catch (IOException e) {
            throw new StringIndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // me.regexp.CharacterIterator
    public String substring(int beginIndex) {
        try {
            readAll();
            return this.buff.toString().substring(beginIndex);
        } catch (IOException e) {
            throw new StringIndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // me.regexp.CharacterIterator
    public char charAt(int pos) {
        try {
            ensure(pos);
            return this.buff.charAt(pos);
        } catch (IOException e) {
            throw new StringIndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // me.regexp.CharacterIterator
    public boolean isEnd(int pos) {
        if (this.buff.length() > pos) {
            return false;
        }
        try {
            ensure(pos);
            return this.buff.length() <= pos;
        } catch (IOException e) {
            throw new StringIndexOutOfBoundsException(e.getMessage());
        }
    }

    private int read(int n) throws IOException {
        if (this.closed) {
            return 0;
        }
        int i = n;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            int c = this.is.read();
            if (c < 0) {
                this.closed = true;
                break;
            }
            this.buff.append((char) c);
        }
        return n - i;
    }

    private void readAll() throws IOException {
        while (!this.closed) {
            read(1000);
        }
    }

    private void ensure(int idx) throws IOException {
        if (!this.closed && idx >= this.buff.length()) {
            read((idx + 1) - this.buff.length());
        }
    }
}
