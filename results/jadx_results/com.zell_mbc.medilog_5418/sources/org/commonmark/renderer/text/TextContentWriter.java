package org.commonmark.renderer.text;

import java.io.IOException;
/* loaded from: classes2.dex */
public class TextContentWriter {
    private final Appendable buffer;
    private char lastChar;

    public TextContentWriter(Appendable appendable) {
        this.buffer = appendable;
    }

    public void whitespace() {
        char c = this.lastChar;
        if (c == 0 || c == ' ') {
            return;
        }
        append(' ');
    }

    public void colon() {
        char c = this.lastChar;
        if (c == 0 || c == ':') {
            return;
        }
        append(':');
    }

    public void line() {
        char c = this.lastChar;
        if (c == 0 || c == '\n') {
            return;
        }
        append('\n');
    }

    public void writeStripped(String str) {
        append(str.replaceAll("[\\r\\n\\s]+", " "));
    }

    public void write(String str) {
        append(str);
    }

    public void write(char c) {
        append(c);
    }

    private void append(String str) {
        try {
            this.buffer.append(str);
            int length = str.length();
            if (length == 0) {
                return;
            }
            this.lastChar = str.charAt(length - 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void append(char c) {
        try {
            this.buffer.append(c);
            this.lastChar = c;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
