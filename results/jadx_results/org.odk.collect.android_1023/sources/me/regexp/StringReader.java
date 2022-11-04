package me.regexp;

import java.io.Reader;
/* loaded from: classes.dex */
public class StringReader extends Reader {
    private static final char NEW_LINE = '\n';
    private int pointer = 0;
    private String str;

    public StringReader(String str) {
        this.str = str;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.pointer >= this.str.length()) {
            return -1;
        }
        String str = this.str;
        int i = this.pointer;
        this.pointer = i + 1;
        return str.charAt(i);
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) {
        if (this.pointer >= this.str.length()) {
            return -1;
        }
        int read = 0;
        int i = 0;
        while (i < len && this.pointer < this.str.length()) {
            String str = this.str;
            int i2 = this.pointer;
            this.pointer = i2 + 1;
            cbuf[off + i] = str.charAt(i2);
            i++;
            read++;
        }
        return read;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public String readLine() {
        if (this.pointer >= this.str.length()) {
            return null;
        }
        int nextLine = this.str.indexOf(10, this.pointer);
        if (nextLine == -1) {
            nextLine = this.str.length();
        }
        String substring = this.str.substring(this.pointer, nextLine);
        this.pointer = nextLine + 1;
        return substring;
    }

    @Override // java.io.Reader
    public boolean ready() {
        return this.pointer < this.str.length();
    }
}
