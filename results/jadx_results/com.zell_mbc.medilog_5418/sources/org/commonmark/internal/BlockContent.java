package org.commonmark.internal;
/* loaded from: classes2.dex */
class BlockContent {
    private int lineCount;
    private final StringBuilder sb;

    public BlockContent() {
        this.lineCount = 0;
        this.sb = new StringBuilder();
    }

    public BlockContent(String str) {
        this.lineCount = 0;
        this.sb = new StringBuilder(str);
    }

    public void add(CharSequence charSequence) {
        if (this.lineCount != 0) {
            this.sb.append('\n');
        }
        this.sb.append(charSequence);
        this.lineCount++;
    }

    public String getString() {
        return this.sb.toString();
    }
}
