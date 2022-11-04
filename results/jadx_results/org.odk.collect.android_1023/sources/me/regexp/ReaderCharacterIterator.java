package me.regexp;

import java.io.IOException;
import java.io.Reader;
/* loaded from: classes.dex */
public final class ReaderCharacterIterator implements CharacterIterator {
    private final StringBuffer buff = new StringBuffer(512);
    private boolean closed = false;
    private final Reader reader;

    public ReaderCharacterIterator(Reader reader) {
        this.reader = reader;
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
        char[] c = new char[n];
        int count = 0;
        do {
            int read = this.reader.read(c);
            if (read < 0) {
                this.closed = true;
                return count;
            }
            count += read;
            this.buff.append(c, 0, read);
        } while (count < n);
        return count;
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
